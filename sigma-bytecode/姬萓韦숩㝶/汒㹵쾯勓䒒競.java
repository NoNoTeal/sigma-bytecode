public interface \u59ec\u8413\u97e6\uc229\u3776.\u6c52\u3e75\ucfaf\u52d3\u4492\u7af6 {
    void \ubff1\u71ae\u52d3\u5db4\u6fb0\u392e();
    
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
            storeelement:String(expr_62:String[], and:int(ldc:int(9378), ldc:int(-9392)), ldc:String("oooooo"))
            storeelement:String(expr_62:String[], xor:int(ldc:int(10), ldc:int(11)), ldc:String("Oooooo"))
            storeelement:String(expr_62:String[], and:int(ldc:int(18442), ldc:int(790)), ldc:String("oOoooo"))
            storeelement:String(expr_62:String[], xor:int(ldc:int(8724), ldc:int(8727)), ldc:String("ooOooo"))
            storeelement:String(expr_62:String[], and:int(ldc:int(16644), ldc:int(5319)), ldc:String("oooOoo"))
            storeelement:String(expr_62:String[], xor:int(ldc:int(4360), ldc:int(4365)), ldc:String("ooooOo"))
            storeelement:String(expr_62:String[], ldc:int(6), ldc:String("oooooO"))
            putstatic:String[](\u6c52\u3e75\ucfaf\u52d3\u4492\u7af6::\u4f4a\ub8be\u6d99\u9a18\u71f1\u8d90, expr_62:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
}
