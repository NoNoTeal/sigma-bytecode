public class \u3d64\u7af6\uae87\uc238\u7d52.\u8c8a\u51b2\u516c\ub70c\u624e {
    public void \u8c8a\u51b2\u516c\ub70c\u624e(\ua562\ucb79\uc87f\u3dd3\ubcb0.\uae5d\u7af6\u9033\ubcb0\u51fa p0, long p1, \u6b0d\u12cb\u156b\u4179\u8bb0.\u8df4\u0b8e\u3a62\ufcaf\u3504 p2) {
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
            invokespecial:Object(Object::<init>, this:\u8c8a\u51b2\u516c\ub70c\u624e)
            putfield:\uae5d\u7af6\u9033\ubcb0\u51fa(\u8c8a\u51b2\u516c\ub70c\u624e::\u3504\u927d\u4975\uc229\u6d69\ub70c, this:\u8c8a\u51b2\u516c\ub70c\u624e, p0:\uae5d\u7af6\u9033\ubcb0\u51fa)
            putfield:long(\u8c8a\u51b2\u516c\ub70c\u624e::\u64f2\u3a62\ub6ab\uc9f6\u99f7\uc246, this:\u8c8a\u51b2\u516c\ub70c\u624e, p1:long)
            putfield:\u8df4\u0b8e\u3a62\ufcaf\u3504(\u8c8a\u51b2\u516c\ub70c\u624e::\uceb8\u4d85\u960f\uc31c\ua3b4\ube23, this:\u8c8a\u51b2\u516c\ub70c\u624e, p2:\u8df4\u0b8e\u3a62\ufcaf\u3504)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static long \u56bd\u6d99\u494c\uf995\u4c04\uc84e(long p0) {
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
            return:long(invokevirtual:long(HashCode::asLong, invokeinterface:HashCode(HashFunction::hashLong, invokestatic:HashFunction(Hashing::sha256), p0:long)))
        }
        
        goto(Label_0006)
    }
    
    public \u3d64\u7af6\uae87\uc238\u7d52.\u8c8a\u51b2\u516c\ub70c\u624e \u16f6\uc84e\u56bd\u120d\u97b7\u4c2b(\u5245\u8aa5\u61a4\u7049\u4cd9.\u56bd\uc4d2\u61a4\u4ab3\u1187 p0) {
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
            return:\u8c8a\u51b2\u516c\ub70c\u624e(initobject:\u8c8a\u51b2\u516c\ub70c\u624e(\u8c8a\u51b2\u516c\ub70c\u624e::<init>, p0:\u56bd\uc4d2\u61a4\u4ab3\u1187[expected:\uae5d\u7af6\u9033\ubcb0\u51fa], getfield:long(\u8c8a\u51b2\u516c\ub70c\u624e::\u64f2\u3a62\ub6ab\uc9f6\u99f7\uc246, this:\u8c8a\u51b2\u516c\ub70c\u624e), getfield:\u8df4\u0b8e\u3a62\ufcaf\u3504(\u8c8a\u51b2\u516c\ub70c\u624e::\uceb8\u4d85\u960f\uc31c\ua3b4\ube23, this:\u8c8a\u51b2\u516c\ub70c\u624e)))
        }
        
        goto(Label_0006)
    }
    
    public \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \ua3b4\ub7dc\u9937\ubff1\ubefe\ud158(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
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
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokeinterface:\uc2e8\u9255\u647c\ud171\ubf56(\u8df4\u0b8e\u3a62\ufcaf\u3504::\u4cd9\u88c5\u5fe1\ua61f\u3c25\ucfaf, getfield:\u8df4\u0b8e\u3a62\ufcaf\u3504(\u8c8a\u51b2\u516c\ub70c\u624e::\uceb8\u4d85\u960f\uc31c\ua3b4\ube23, this:\u8c8a\u51b2\u516c\ub70c\u624e), getfield:long(\u8c8a\u51b2\u516c\ub70c\u624e::\u64f2\u3a62\ub6ab\uc9f6\u99f7\uc246, this:\u8c8a\u51b2\u516c\ub70c\u624e), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), getfield:\uae5d\u7af6\u9033\ubcb0\u51fa(\u8c8a\u51b2\u516c\ub70c\u624e::\u3504\u927d\u4975\uc229\u6d69\ub70c, this:\u8c8a\u51b2\u516c\ub70c\u624e)))
        }
        
        goto(Label_0006)
    }
    
    public \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \uf9c5\u62da\ub19c\u8753\u92ee\u8c8a(double p0, double p1, double p2) {
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
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\u8c8a\u51b2\u516c\ub70c\u624e::\ub70c\ua6bd\ud36e\ub6ab\u183a\u72f1, this:\u8c8a\u51b2\u516c\ub70c\u624e, shr:int(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, p0:double), xor:int(ldc:int(2177), ldc:int(2179))), shr:int(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, p1:double), and:int(ldc:int(5123), ldc:int(394))), shr:int(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, p2:double), xor:int(ldc:int(2315), ldc:int(2313)))))
        }
        
        goto(Label_0006)
    }
    
    public \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \u92ee\u760c\u3d64\u6c56\u8aa5\u946b(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
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
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\u8c8a\u51b2\u516c\ub70c\u624e::\ub70c\ua6bd\ud36e\ub6ab\u183a\u72f1, this:\u8c8a\u51b2\u516c\ub70c\u624e, shr:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), and:int(ldc:int(18534), ldc:int(9490))), shr:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), xor:int(ldc:int(4354), ldc:int(4352))), shr:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), and:int(ldc:int(6662), ldc:int(2)))))
        }
        
        goto(Label_0006)
    }
    
    public \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \ub70c\ua6bd\ud36e\ub6ab\u183a\u72f1(int p0, int p1, int p2) {
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
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokeinterface:\uc2e8\u9255\u647c\ud171\ubf56(\uae5d\u7af6\u9033\ubcb0\u51fa::\u3bd6\uf995\ucef1\u8640\ub18d\u156b, getfield:\uae5d\u7af6\u9033\ubcb0\u51fa(\u8c8a\u51b2\u516c\ub70c\u624e::\u3504\u927d\u4975\uc229\u6d69\ub70c, this:\u8c8a\u51b2\u516c\ub70c\u624e), p0:int, p1:int, p2:int))
        }
        
        goto(Label_0006)
    }
    
    static {
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
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u120d\u5f50\uc84e\u8709\u40a9\u4975(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5F5 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_600 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
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
        var_3_5F5 = and:int(ldc:int(-1208610349), ldc:int(-1410984881))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8c8a\u51b2\u516c\ub70c\u624e[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-335620105))
            var_5_7D = and:int(ldc:int(-4029), ldc:int(4012))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(8294), ldc:int(-8295)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_5F5:int, ldc:int(-1614928151))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(-32575), ldc:int(-32576)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, and:int(ldc:int(33), ldc:int(11461)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_5F5 = and:int(var_3_CA:int, ldc:int(-2017472165))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(-31744), ldc:int(-31743)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1430)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(2076023865))
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1306941195))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1228463868))
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-274004608))
                    }
                    else {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1548333597))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1740837404))
                        goto(Label_1430)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(637331166))
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(383140688))
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-927383706))
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(274887378))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-138981352))
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1146189611))
                        var_11_DB = and:int(ldc:int(25298), ldc:int(-25300))
                        goto(Label_1419)
                    }
                    
                    Label_0549:
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1430)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(848056817))
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1156683467))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-947637247))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(469180641))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0652:
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1430)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1884491615))
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(2012323300))
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-158898918))
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1447117585))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-693183821))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-273692709))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1167479375))
                        goto(Label_1430)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1366146356))
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1393823842))
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-583170146))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1280964911))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(18528), ldc:int(18529))
                                goto(Label_1027)
                            }
                        }
                    }
                    
                    Label_0889:
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1430)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(947558283))
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-2009108331))
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1647706368))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1873154121))
                        var_11_DB = and:int(ldc:int(6306), ldc:int(-6307))
                    }
                    
                    Label_1027:
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1963248923))
                        goto(Label_1430)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1332808330))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0889)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1511071069))
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1103851014))
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(402121693))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1260)
                            }
                        }
                    }
                    
                    Label_1138:
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(991487698))
                        goto(Label_1430)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1226471566))
                            goto(Label_1027)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0889)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(973600448))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-457870397))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(531508419))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1419)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1260:
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(678966593))
                        goto(Label_1430)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(669817366))
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-633809470))
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1632903484))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1849612752))
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(75746151))
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1387096914))
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-340752745))
                        loopcontinue()
                    }
                    
                    var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1337374407))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1419:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_600 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1430:
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(2112512635))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1424822668))
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(262633951))
                        var_17_600 = add:int(var_16_109:int, and:int(ldc:int(17), ldc:int(259)))
                        looporswitchbreak()
                    }
                    
                    var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1743863442))
                }
                
                var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-67699103))
                
                if (cmple:boolean(var_5_7D = var_17_600:int, sub:int(var_6_84:int, xor:int(ldc:int(18561), ldc:int(18560))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(262144)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
