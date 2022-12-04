# symtable

## monolithic

- Type
- Symbol
  - VariableSymbol
  - BasicTypeSymbol
    - int
- Scope
  - BaseScope
    - GlobalScope
- DefPhaseListener
  - enterProg
  - ~~exitProg~~
  - exitVarDecl
  - exitID

## nested

- Symbol
  - VariableSymbol
- Type
- Scope
  - BaseScope
    - GlobalScope
    - `LocalScope`

## forward reference

## type checking