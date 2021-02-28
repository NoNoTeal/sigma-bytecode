public interface \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u7ce1\u3a62\u99f7\u516c\uc9f6\u98a4 {
    static {
        expr_62 : int[] [generated]
        
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
            expr_62 = newarray:int[](int.class, ldc:int(16))
            storeelement:int(expr_62:int[], and:int(ldc:int(13153), ldc:int(-29538)), ldc:int(-4))
            storeelement:int(expr_62:int[], and:int(ldc:int(29321), ldc:int(257)), ldc:int(-3))
            storeelement:int(expr_62:int[], xor:int(ldc:int(-32767), ldc:int(-32765)), ldc:int(-2))
            storeelement:int(expr_62:int[], and:int(ldc:int(2219), ldc:int(519)), ldc:int(-1))
            storeelement:int(expr_62:int[], and:int(ldc:int(5), ldc:int(17838)), and:int(ldc:int(4245), ldc:int(-4246)))
            storeelement:int(expr_62:int[], xor:int(ldc:int(16448), ldc:int(16453)), xor:int(ldc:int(-28672), ldc:int(-28671)))
            storeelement:int(expr_62:int[], ldc:int(6), xor:int(ldc:int(896), ldc:int(898)))
            storeelement:int(expr_62:int[], ldc:int(7), and:int(ldc:int(18963), ldc:int(4363)))
            storeelement:int(expr_62:int[], ldc:int(8), and:int(ldc:int(132), ldc:int(16932)))
            storeelement:int(expr_62:int[], ldc:int(9), and:int(ldc:int(77), ldc:int(20743)))
            storeelement:int(expr_62:int[], ldc:int(10), ldc:int(6))
            storeelement:int(expr_62:int[], ldc:int(11), ldc:int(7))
            storeelement:int(expr_62:int[], ldc:int(12), ldc:int(8))
            storeelement:int(expr_62:int[], ldc:int(13), ldc:int(9))
            storeelement:int(expr_62:int[], ldc:int(14), ldc:int(10))
            storeelement:int(expr_62:int[], ldc:int(15), ldc:int(11))
            putstatic:int[](\u7ce1\u3a62\u99f7\u516c\uc9f6\u98a4::\u88c5\uc910\u97e6\u8308\ua3b4\u62da, expr_62:int[])
            return:void()
        }
        
        goto(Label_0006)
    }
}
