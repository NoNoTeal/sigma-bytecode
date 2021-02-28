public interface \ub113\uc4d2\u183a\u527a\u6435.\u67e9\u1833\u51fa\u98a4\u3711 {
    static {
        expr_62 : String[] [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            expr_62 = newarray:String[](java.lang.String.class, ldc:int(7))
            storeelement:String(expr_62:String[], and:int(ldc:int(-21612), ldc:int(17451)), ldc:String("CONNECT"))
            storeelement:String(expr_62:String[], xor:int(ldc:int(8194), ldc:int(8195)), ldc:String("DISCONNECT"))
            storeelement:String(expr_62:String[], and:int(ldc:int(22546), ldc:int(8834)), ldc:String("EVENT"))
            storeelement:String(expr_62:String[], and:int(ldc:int(4099), ldc:int(2059)), ldc:String("ACK"))
            storeelement:String(expr_62:String[], xor:int(ldc:int(2059), ldc:int(2063)), ldc:String("ERROR"))
            storeelement:String(expr_62:String[], xor:int(ldc:int(-32499), ldc:int(-32504)), ldc:String("BINARY_EVENT"))
            storeelement:String(expr_62:String[], ldc:int(6), ldc:String("BINARY_ACK"))
            putstatic:String[](\u67e9\u1833\u51fa\u98a4\u3711::\ub32d\ub8be\u64ab\ua068\u9937\uf94d, expr_62:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
}
