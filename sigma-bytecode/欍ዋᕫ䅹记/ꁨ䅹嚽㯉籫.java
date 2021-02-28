public interface \u6b0d\u12cb\u156b\u4179\u8bb0.\ua068\u4179\u56bd\u3bc9\u7c6b {
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
            return:int(invokeinterface:int(\ua068\u4179\u56bd\u3bc9\u7c6b::\u9937\ubefe\uf9c5\u3dd3\u3d64\uc910, this:\ua068\u4179\u56bd\u3bc9\u7c6b, p0:\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<?>[expected:\u8bb0\ua6bd\ucb79\u446c\u7af6\ucb79], invokeinterface:int(\u7049\u5db4\u8709\ud217\uc2e8::\ubf56\u3a62\ua068\u4975\u6198\u3d64, p1:\u7049\u5db4\u8709\ud217\uc2e8, invokeinterface:int(\ub7dc\u8753\uc910\u6bb9\u0a06::\ud171\u6cfe\u3e2a\u7ce1\u62da\uc3e3, this:\ua068\u4179\u56bd\u3bc9\u7c6b[expected:\ub7dc\u8753\uc910\u6bb9\u0a06], add:int(p2:int, and:int(ldc:int(9522), ldc:int(-9523)))), invokeinterface:int(\ub7dc\u8753\uc910\u6bb9\u0a06::\u3bc9\u3504\ubb2b\ua61f\u6cfe\ub8be, this:\ua068\u4179\u56bd\u3bc9\u7c6b[expected:\ub7dc\u8753\uc910\u6bb9\u0a06], add:int(p3:int, xor:int(ldc:int(9346), ldc:int(9344))))), invokeinterface:int(\u7049\u5db4\u8709\ud217\uc2e8::\ubf56\u3a62\ua068\u4975\u6198\u3d64, p1:\u7049\u5db4\u8709\ud217\uc2e8, invokeinterface:int(\ub7dc\u8753\uc910\u6bb9\u0a06::\ud171\u6cfe\u3e2a\u7ce1\u62da\uc3e3, this:\ua068\u4179\u56bd\u3bc9\u7c6b[expected:\ub7dc\u8753\uc910\u6bb9\u0a06], add:int(p2:int, and:int(ldc:int(16390), ldc:int(8194)))), invokeinterface:int(\ub7dc\u8753\uc910\u6bb9\u0a06::\u3bc9\u3504\ubb2b\ua61f\u6cfe\ub8be, this:\ua068\u4179\u56bd\u3bc9\u7c6b[expected:\ub7dc\u8753\uc910\u6bb9\u0a06], add:int(p3:int, and:int(ldc:int(650), ldc:int(374))))), invokeinterface:int(\u7049\u5db4\u8709\ud217\uc2e8::\ubf56\u3a62\ua068\u4975\u6198\u3d64, p1:\u7049\u5db4\u8709\ud217\uc2e8, invokeinterface:int(\ub7dc\u8753\uc910\u6bb9\u0a06::\ud171\u6cfe\u3e2a\u7ce1\u62da\uc3e3, this:\ua068\u4179\u56bd\u3bc9\u7c6b[expected:\ub7dc\u8753\uc910\u6bb9\u0a06], add:int(p2:int, and:int(ldc:int(1298), ldc:int(10)))), invokeinterface:int(\ub7dc\u8753\uc910\u6bb9\u0a06::\u3bc9\u3504\ubb2b\ua61f\u6cfe\ub8be, this:\ua068\u4179\u56bd\u3bc9\u7c6b[expected:\ub7dc\u8753\uc910\u6bb9\u0a06], add:int(p3:int, and:int(ldc:int(691), ldc:int(-7868))))), invokeinterface:int(\u7049\u5db4\u8709\ud217\uc2e8::\ubf56\u3a62\ua068\u4975\u6198\u3d64, p1:\u7049\u5db4\u8709\ud217\uc2e8, invokeinterface:int(\ub7dc\u8753\uc910\u6bb9\u0a06::\ud171\u6cfe\u3e2a\u7ce1\u62da\uc3e3, this:\ua068\u4179\u56bd\u3bc9\u7c6b[expected:\ub7dc\u8753\uc910\u6bb9\u0a06], add:int(p2:int, and:int(ldc:int(-28691), ldc:int(28690)))), invokeinterface:int(\ub7dc\u8753\uc910\u6bb9\u0a06::\u3bc9\u3504\ubb2b\ua61f\u6cfe\ub8be, this:\ua068\u4179\u56bd\u3bc9\u7c6b[expected:\ub7dc\u8753\uc910\u6bb9\u0a06], add:int(p3:int, and:int(ldc:int(-23716), ldc:int(23683))))), invokeinterface:int(\u7049\u5db4\u8709\ud217\uc2e8::\ubf56\u3a62\ua068\u4975\u6198\u3d64, p1:\u7049\u5db4\u8709\ud217\uc2e8, invokeinterface:int(\ub7dc\u8753\uc910\u6bb9\u0a06::\ud171\u6cfe\u3e2a\u7ce1\u62da\uc3e3, this:\ua068\u4179\u56bd\u3bc9\u7c6b[expected:\ub7dc\u8753\uc910\u6bb9\u0a06], add:int(p2:int, xor:int(ldc:int(23040), ldc:int(23041)))), invokeinterface:int(\ub7dc\u8753\uc910\u6bb9\u0a06::\u3bc9\u3504\ubb2b\ua61f\u6cfe\ub8be, this:\ua068\u4179\u56bd\u3bc9\u7c6b[expected:\ub7dc\u8753\uc910\u6bb9\u0a06], add:int(p3:int, and:int(ldc:int(16513), ldc:int(12585)))))))
        }
        
        goto(Label_0006)
    }
}
