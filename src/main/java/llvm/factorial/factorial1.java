package llvm.factorial;

import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.PointerPointer;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;

public class factorial1 {
    static void factorial1opt0() {
        LLVMInitializeCore(LLVMGetGlobalPassRegistry());
        LLVMLinkInMCJIT();
        LLVMInitializeNativeAsmPrinter();
        LLVMInitializeNativeAsmParser();
        LLVMInitializeNativeTarget();

        LLVMContextRef context = LLVMContextCreate();
        LLVMModuleRef module = LLVMModuleCreateWithNameInContext("factorial1", context);
        LLVMBuilderRef builder = LLVMCreateBuilderInContext(context);

        LLVMTypeRef i32Type = LLVMInt32TypeInContext(context);
        LLVMTypeRef i8Type = LLVMInt8TypeInContext(context);
        LLVMTypeRef i8ArrayType = LLVMPointerType(i8Type, 0);
        LLVMTypeRef i8ArrayArrayType = LLVMPointerType(i8ArrayType, 0);
        LLVMValueRef zero = LLVMConstInt(i32Type, 0, 0);
        LLVMValueRef one = LLVMConstInt(i32Type, 1, 0);

        PointerPointer<Pointer> mainParamTypes = new PointerPointer<>(2)
                .put(0, i32Type)
                .put(1, i8ArrayArrayType);

        PointerPointer<Pointer> factorialParamTypes = new PointerPointer<>(1)
                .put(0, i32Type);

        LLVMTypeRef mainRetType = LLVMFunctionType(i32Type, mainParamTypes, 2, 0);
        LLVMTypeRef factorialRetType = LLVMFunctionType(i32Type, factorialParamTypes, 1, 0);

        LLVMValueRef mainFunction = LLVMAddFunction(module, "main", mainRetType);
        LLVMValueRef factorialFunction = LLVMAddFunction(module, "factorial", factorialRetType);

        LLVMBasicBlockRef mainEntry = LLVMAppendBasicBlock(mainFunction, "");
        LLVMPositionBuilderAtEnd(builder, mainEntry);

        LLVMValueRef arg1 = LLVMGetParam(mainFunction, 0);
        LLVMValueRef arg2 = LLVMGetParam(mainFunction, 1);

        LLVMValueRef alloca1 = LLVMBuildAlloca(builder, i32Type, "");
        LLVMValueRef alloca2 = LLVMBuildAlloca(builder, i32Type, "");
        LLVMValueRef alloca3 = LLVMBuildAlloca(builder, i8ArrayArrayType, "");
        LLVMBuildStore(builder, zero, alloca1);
        LLVMBuildStore(builder, arg1, alloca2);
        LLVMBuildStore(builder, arg2, alloca3);

        PointerPointer<Pointer> argsv1 = new PointerPointer<>(1)
                .put(0, LLVMConstInt(i32Type, 2, 0));
        LLVMValueRef call1 = LLVMBuildCall(builder, factorialFunction, argsv1, 1, "");
        LLVMValueRef mul1 = LLVMBuildMul(builder, call1, LLVMConstInt(i32Type, 7, 0), "");
        LLVMValueRef icmp1 = LLVMBuildICmp(builder, LLVMIntEQ, mul1, LLVMConstInt(i32Type, 42, 0), "");
        LLVMValueRef zext1 = LLVMBuildZExt(builder, icmp1, i32Type, "");
        LLVMBuildRet(builder, zext1);

        LLVMBasicBlockRef factorialEntry = LLVMAppendBasicBlock(factorialFunction, "");
        LLVMPositionBuilderAtEnd(builder, factorialEntry);
        LLVMValueRef arg3 = LLVMGetParam(factorialFunction, 0);
        LLVMValueRef alloca4 = LLVMBuildAlloca(builder, i32Type, "");
        LLVMValueRef alloca5 = LLVMBuildAlloca(builder, i32Type, "");
        LLVMBuildStore(builder, arg3, alloca5);
        LLVMValueRef load1 = LLVMBuildLoad(builder, alloca5, "");
        LLVMValueRef icmp2 = LLVMBuildICmp(builder, LLVMIntEQ, load1, zero, "");

        LLVMBasicBlockRef entry1 = LLVMAppendBasicBlock(factorialFunction, "");
        LLVMBasicBlockRef entry2 = LLVMAppendBasicBlock(factorialFunction, "");
        LLVMBasicBlockRef entry3 = LLVMAppendBasicBlock(factorialFunction, "");

        LLVMBuildCondBr(builder, icmp2, entry1, entry2);

        LLVMPositionBuilderAtEnd(builder, entry1);
        LLVMBuildStore(builder, one, alloca4);
        LLVMBuildBr(builder, entry3);

        LLVMPositionBuilderAtEnd(builder, entry2);
        LLVMValueRef load2 = LLVMBuildLoad(builder, alloca5, "");
        LLVMValueRef load3 = LLVMBuildLoad(builder, alloca5, "");
        LLVMValueRef sub1 = LLVMBuildSub(builder, load3, one, "");
        PointerPointer<Pointer> argsv2 = new PointerPointer<>(1)
                .put(0, sub1);
        LLVMValueRef call2 = LLVMBuildCall(builder, factorialFunction, argsv2, 1, "");
        LLVMValueRef mul2 = LLVMBuildMul(builder, load2, call2, "");
        LLVMBuildStore(builder, mul2, alloca4);
        LLVMBuildBr(builder, entry3);

        LLVMPositionBuilderAtEnd(builder, entry3);
        LLVMValueRef load4 = LLVMBuildLoad(builder, alloca4, "");
        LLVMBuildRet(builder, load4);

        LLVMDumpModule(module);
    }

    static void factorial1opt1() {
        LLVMInitializeCore(LLVMGetGlobalPassRegistry());
        LLVMLinkInMCJIT();
        LLVMInitializeNativeAsmPrinter();
        LLVMInitializeNativeAsmParser();
        LLVMInitializeNativeTarget();

        LLVMContextRef context = LLVMContextCreate();
        LLVMModuleRef module = LLVMModuleCreateWithNameInContext("factorial1", context);
        LLVMBuilderRef builder = LLVMCreateBuilderInContext(context);

        LLVMTypeRef i32Type = LLVMInt32TypeInContext(context);
        LLVMTypeRef i8Type = LLVMInt8TypeInContext(context);
        LLVMTypeRef i8ArrayType = LLVMPointerType(i8Type, 0);
        LLVMTypeRef i8ArrayArrayType = LLVMPointerType(i8ArrayType, 0);
        LLVMValueRef zero = LLVMConstInt(i32Type, 0, 0);
        LLVMValueRef one = LLVMConstInt(i32Type, 1, 0);

        PointerPointer<Pointer> mainParamTypes = new PointerPointer<>(2)
                .put(0, i32Type)
                .put(1, i8ArrayArrayType);

        PointerPointer<Pointer> factorialParamTypes = new PointerPointer<>(1)
                .put(0, i32Type);

        LLVMTypeRef mainRetType = LLVMFunctionType(i32Type, mainParamTypes, 2, 0);
        LLVMTypeRef factorialRetType = LLVMFunctionType(i32Type, factorialParamTypes, 1, 0);

        LLVMValueRef mainFunction = LLVMAddFunction(module, "main", mainRetType);
        LLVMValueRef factorialFunction = LLVMAddFunction(module, "factorial", factorialRetType);

        LLVMBasicBlockRef mainEntry = LLVMAppendBasicBlock(mainFunction, "");
        LLVMPositionBuilderAtEnd(builder, mainEntry);

        PointerPointer<Pointer> argsv1 = new PointerPointer<>(1)
                .put(0, LLVMConstInt(i32Type, 2, 0));
        LLVMValueRef call1 = LLVMBuildCall(builder, factorialFunction, argsv1, 1, "");
        LLVMValueRef mul1 = LLVMBuildMul(builder, call1, LLVMConstInt(i32Type, 7, 0), "");
        LLVMValueRef icmp1 = LLVMBuildICmp(builder, LLVMIntEQ, mul1, LLVMConstInt(i32Type, 42, 0), "");
        LLVMValueRef zext1 = LLVMBuildZExt(builder, icmp1, i32Type, "");
        LLVMBuildRet(builder, zext1);

        LLVMBasicBlockRef factorialEntry = LLVMAppendBasicBlock(factorialFunction, "");
        LLVMPositionBuilderAtEnd(builder, factorialEntry);
        LLVMValueRef arg3 = LLVMGetParam(factorialFunction, 0);
        LLVMValueRef icmp2 = LLVMBuildICmp(builder, LLVMIntEQ, arg3, zero, "");

        LLVMBasicBlockRef entry1 = LLVMAppendBasicBlock(factorialFunction, "");
        LLVMBasicBlockRef entry2 = LLVMAppendBasicBlock(factorialFunction, "");

        LLVMBuildCondBr(builder, icmp2, entry2, entry1);

        LLVMPositionBuilderAtEnd(builder, entry1);
        LLVMValueRef add1 = LLVMBuildAdd(builder, arg3, LLVMConstInt(i32Type, -1, 0), "");

        PointerPointer<Pointer> argsv2 = new PointerPointer<>(1)
                .put(0, add1);
        LLVMValueRef call2 = LLVMBuildCall(builder, factorialFunction, argsv2, 1, "");
        LLVMValueRef mul2 = LLVMBuildMul(builder, call2, arg3, "");
        LLVMBuildBr(builder, entry2);

        LLVMPositionBuilderAtEnd(builder, entry2);
        LLVMValueRef phi1 = LLVMBuildPhi(builder, i32Type, "");
        PointerPointer<Pointer> phiValues = new PointerPointer<>(2)
                .put(0, mul2)
                .put(1, one);
        PointerPointer<Pointer> phiBlocks = new PointerPointer<>(2)
                .put(0, entry1)
                .put(1, factorialEntry);
        LLVMAddIncoming(phi1, phiValues, phiBlocks, 2);

        LLVMBuildRet(builder, phi1);

        LLVMDumpModule(module);
    }

    public static void main(String[] args) {
        factorial1opt0();
        factorial1opt1();
    }
}
