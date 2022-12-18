package llvm.factorial;

/**
 * @author: hfwei
 * @date: 12/18/22
 * @note:
 */

import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;

public class factorial0 {
  public static void main(String[] args) {
    LLVMModuleRef module = LLVMModuleCreateWithName("factorial0");
  }
}
