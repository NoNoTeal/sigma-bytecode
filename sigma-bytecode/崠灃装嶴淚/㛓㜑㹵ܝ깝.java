public interface \u5d20\u7043\u88c5\u5db4\uf94d.\u36d3\u3711\u3e75\u071d\uae5d {
    int \u9937\ubefe\uf9c5\u3dd3\u3d64\uc910(\u12b2\u9a18\uc7fe\u4c2b\u6c52.\u8bb0\ua6bd\ucb79\u446c\u7af6\ucb79 p0, int p1);
    
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
            return:int(invokeinterface:int(\u36d3\u3711\u3e75\u071d\uae5d::\u9937\ubefe\uf9c5\u3dd3\u3d64\uc910, this:\u36d3\u3711\u3e75\u071d\uae5d, p0:\ubb2b\uc246\u0c95\u6c56\u7330\u4e72<?>[expected:\u8bb0\ua6bd\ucb79\u446c\u7af6\ucb79], invokeinterface:int(\u7049\u5db4\u8709\ud217\uc2e8::\ubf56\u3a62\ua068\u4975\u6198\u3d64, p1:\u7049\u5db4\u8709\ud217\uc2e8, invokeinterface:int(\ub7dc\u8753\uc910\u6bb9\u0a06::\ud171\u6cfe\u3e2a\u7ce1\u62da\uc3e3, this:\u36d3\u3711\u3e75\u071d\uae5d[expected:\ub7dc\u8753\uc910\u6bb9\u0a06], add:int(p2:int, xor:int(ldc:int(16400), ldc:int(16401)))), invokeinterface:int(\ub7dc\u8753\uc910\u6bb9\u0a06::\u3bc9\u3504\ubb2b\ua61f\u6cfe\ub8be, this:\u36d3\u3711\u3e75\u071d\uae5d[expected:\ub7dc\u8753\uc910\u6bb9\u0a06], add:int(p3:int, xor:int(ldc:int(40), ldc:int(41)))))))
        }
        
        goto(Label_0006)
    }
}
