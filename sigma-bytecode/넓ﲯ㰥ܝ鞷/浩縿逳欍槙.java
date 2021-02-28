public interface \ub113\ufcaf\u3c25\u071d\u97b7.\u6d69\u7e3f\u9033\u6b0d\u69d9 {
    int \u9937\ubefe\uf9c5\u3dd3\u3d64\uc910(\u12b2\u9a18\uc7fe\u4c2b\u6c52.\u8bb0\ua6bd\ucb79\u446c\u7af6\ucb79 p0, int p1, int p2, int p3, int p4, int p5);
    
    int \u9937\ubefe\uf9c5\u3dd3\u3d64\uc910(\ua562\ucb79\uc87f\u3dd3\ubcb0.\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<?> p0, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u7049\u5db4\u8709\ud217\uc2e8 p1, int p2, int p3) {
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
            return:int(invokeinterface:int(\u6d69\u7e3f\u9033\u6b0d\u69d9::\u9937\ubefe\uf9c5\u3dd3\u3d64\uc910, this:\u6d69\u7e3f\u9033\u6b0d\u69d9, p0:\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<?>[expected:\u8bb0\ua6bd\ucb79\u446c\u7af6\ucb79], invokeinterface:int(\u7049\u5db4\u8709\ud217\uc2e8::\ubf56\u3a62\ua068\u4975\u6198\u3d64, p1:\u7049\u5db4\u8709\ud217\uc2e8, invokeinterface:int(\ub7dc\u8753\uc910\u6bb9\u0a06::\ud171\u6cfe\u3e2a\u7ce1\u62da\uc3e3, this:\u6d69\u7e3f\u9033\u6b0d\u69d9[expected:\ub7dc\u8753\uc910\u6bb9\u0a06], add:int(p2:int, and:int(ldc:int(105), ldc:int(4097)))), invokeinterface:int(\ub7dc\u8753\uc910\u6bb9\u0a06::\u3bc9\u3504\ubb2b\ua61f\u6cfe\ub8be, this:\u6d69\u7e3f\u9033\u6b0d\u69d9[expected:\ub7dc\u8753\uc910\u6bb9\u0a06], add:int(p3:int, and:int(ldc:int(-29987), ldc:int(25890))))), invokeinterface:int(\u7049\u5db4\u8709\ud217\uc2e8::\ubf56\u3a62\ua068\u4975\u6198\u3d64, p1:\u7049\u5db4\u8709\ud217\uc2e8, invokeinterface:int(\ub7dc\u8753\uc910\u6bb9\u0a06::\ud171\u6cfe\u3e2a\u7ce1\u62da\uc3e3, this:\u6d69\u7e3f\u9033\u6b0d\u69d9[expected:\ub7dc\u8753\uc910\u6bb9\u0a06], add:int(p2:int, xor:int(ldc:int(20617), ldc:int(20619)))), invokeinterface:int(\ub7dc\u8753\uc910\u6bb9\u0a06::\u3bc9\u3504\ubb2b\ua61f\u6cfe\ub8be, this:\u6d69\u7e3f\u9033\u6b0d\u69d9[expected:\ub7dc\u8753\uc910\u6bb9\u0a06], add:int(p3:int, xor:int(ldc:int(9236), ldc:int(9237))))), invokeinterface:int(\u7049\u5db4\u8709\ud217\uc2e8::\ubf56\u3a62\ua068\u4975\u6198\u3d64, p1:\u7049\u5db4\u8709\ud217\uc2e8, invokeinterface:int(\ub7dc\u8753\uc910\u6bb9\u0a06::\ud171\u6cfe\u3e2a\u7ce1\u62da\uc3e3, this:\u6d69\u7e3f\u9033\u6b0d\u69d9[expected:\ub7dc\u8753\uc910\u6bb9\u0a06], add:int(p2:int, xor:int(ldc:int(8400), ldc:int(8401)))), invokeinterface:int(\ub7dc\u8753\uc910\u6bb9\u0a06::\u3bc9\u3504\ubb2b\ua61f\u6cfe\ub8be, this:\u6d69\u7e3f\u9033\u6b0d\u69d9[expected:\ub7dc\u8753\uc910\u6bb9\u0a06], add:int(p3:int, xor:int(ldc:int(16417), ldc:int(16419))))), invokeinterface:int(\u7049\u5db4\u8709\ud217\uc2e8::\ubf56\u3a62\ua068\u4975\u6198\u3d64, p1:\u7049\u5db4\u8709\ud217\uc2e8, invokeinterface:int(\ub7dc\u8753\uc910\u6bb9\u0a06::\ud171\u6cfe\u3e2a\u7ce1\u62da\uc3e3, this:\u6d69\u7e3f\u9033\u6b0d\u69d9[expected:\ub7dc\u8753\uc910\u6bb9\u0a06], add:int(p2:int, and:int(ldc:int(28674), ldc:int(-28675)))), invokeinterface:int(\ub7dc\u8753\uc910\u6bb9\u0a06::\u3bc9\u3504\ubb2b\ua61f\u6cfe\ub8be, this:\u6d69\u7e3f\u9033\u6b0d\u69d9[expected:\ub7dc\u8753\uc910\u6bb9\u0a06], add:int(p3:int, xor:int(ldc:int(-28414), ldc:int(-28413))))), invokeinterface:int(\u7049\u5db4\u8709\ud217\uc2e8::\ubf56\u3a62\ua068\u4975\u6198\u3d64, p1:\u7049\u5db4\u8709\ud217\uc2e8, invokeinterface:int(\ub7dc\u8753\uc910\u6bb9\u0a06::\ud171\u6cfe\u3e2a\u7ce1\u62da\uc3e3, this:\u6d69\u7e3f\u9033\u6b0d\u69d9[expected:\ub7dc\u8753\uc910\u6bb9\u0a06], add:int(p2:int, and:int(ldc:int(2309), ldc:int(20617)))), invokeinterface:int(\ub7dc\u8753\uc910\u6bb9\u0a06::\u3bc9\u3504\ubb2b\ua61f\u6cfe\ub8be, this:\u6d69\u7e3f\u9033\u6b0d\u69d9[expected:\ub7dc\u8753\uc910\u6bb9\u0a06], add:int(p3:int, and:int(ldc:int(2145), ldc:int(14209)))))))
        }
        
        goto(Label_0006)
    }
}
