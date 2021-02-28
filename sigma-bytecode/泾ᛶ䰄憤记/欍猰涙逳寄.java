public class \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u6b0d\u7330\u6d99\u9033\u5bc4 {
    public void \u6b0d\u7330\u6d99\u9033\u5bc4(int p0, java.util.function.BiPredicate<\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc> p1) {
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
            invokespecial:\u67e9\u7330\u62da\u3c25\u624e(\u67e9\u7330\u62da\u3c25\u624e::<init>, this:\u6b0d\u7330\u6d99\u9033\u5bc4, invokestatic:ImmutableMap[expected:Map](ImmutableMap::of, getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\ube23\u67d0\u64f2\u839e\u76bc>[expected:Object](\ud36e\u4bc8\u6d69\u92ee\ubb2b::\u9a18\ubf56\u9033\u759a\u4bc8\u6cfe), getstatic:\u4ab3\u9a18\ub83f\u3bd6\u6ec6[expected:Object](\u4ab3\u9a18\ub83f\u3bd6\u6ec6::\u59ec\u7330\ucb79\u40a9\u6bb9\uff55), getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<UUID>[expected:Object](\ud36e\u4bc8\u6d69\u92ee\ubb2b::\u6fb0\u8bb0\ud171\u960f\ucfaf\u7af6), getstatic:\u4ab3\u9a18\ub83f\u3bd6\u6ec6[expected:Object](\u4ab3\u9a18\ub83f\u3bd6\u6ec6::\u52d3\uf94d\u7006\uc910\uf995\u6b0d), getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>[expected:Object](\ud36e\u4bc8\u6d69\u92ee\ubb2b::\ufcaf\u4d85\ub19c\uc87f\u156b\u5245), getstatic:\u4ab3\u9a18\ub83f\u3bd6\u6ec6[expected:Object](\u4ab3\u9a18\ub83f\u3bd6\u6ec6::\u51fa\ud7e8\u4179\u64f2\u5bc4\u61a4), getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<Boolean>[expected:Object](\ud36e\u4bc8\u6d69\u92ee\ubb2b::\uc246\u0b8e\uc7fe\u8413\u3776\u8413), getstatic:\u4ab3\u9a18\ub83f\u3bd6\u6ec6[expected:Object](\u4ab3\u9a18\ub83f\u3bd6\u6ec6::\u52d3\uf94d\u7006\uc910\uf995\u6b0d)))
            putfield:int(\u6b0d\u7330\u6d99\u9033\u5bc4::\uc238\u3bd6\u624e\u5bc4\u960f\u9a18, this:\u6b0d\u7330\u6d99\u9033\u5bc4, p0:int)
            putfield:BiPredicate<\ube23\u67d0\u64f2\u839e\u76bc, \ube23\u67d0\u64f2\u839e\u76bc>(\u6b0d\u7330\u6d99\u9033\u5bc4::\u7043\u7e3f\u527a\ud217\u839e\u9255, this:\u6b0d\u7330\u6d99\u9033\u5bc4, p1:BiPredicate<\ube23\u67d0\u64f2\u839e\u76bc, \ube23\u67d0\u64f2\u839e\u76bc>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u4ab3\uafe7\u8709\ub171\ubefe\u759a(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1) {
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
            return:boolean(invokevirtual:boolean(\ube23\u67d0\u64f2\u839e\u76bc::\ubcb0\ub1b9\u9af2\u7873\uc31c\u183a, invokespecial:\ube23\u67d0\u64f2\u839e\u76bc(\u6b0d\u7330\u6d99\u9033\u5bc4::\u7af6\ua6bd\u3d64\ud217\u5f50\u7af6, this:\u6b0d\u7330\u6d99\u9033\u5bc4, p1:\ube23\u67d0\u64f2\u839e\u76bc)))
        }
        
        goto(Label_0006)
    }
    
    public void \u7873\uc7fe\u99f7\ubb2b\u1833\ua562(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1, long p2) {
        var_5_BE : int
        var_7_68 : \ube23\u67d0\u64f2\u839e\u76bc
        
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
            var_5_BE = and:int(ldc:int(172917372), ldc:int(763282117))
            var_7_68 = invokespecial:\ube23\u67d0\u64f2\u839e\u76bc(\u6b0d\u7330\u6d99\u9033\u5bc4::\u7af6\ua6bd\u3d64\ud217\u5f50\u7af6, this:\u6b0d\u7330\u6d99\u9033\u5bc4, p1:\ube23\u67d0\u64f2\u839e\u76bc)
            
            if (invokeinterface:boolean(BiPredicate<\ube23\u67d0\u64f2\u839e\u76bc, \ube23\u67d0\u64f2\u839e\u76bc>::test, getfield:BiPredicate<\ube23\u67d0\u64f2\u839e\u76bc, \ube23\u67d0\u64f2\u839e\u76bc>(\u6b0d\u7330\u6d99\u9033\u5bc4::\u7043\u7e3f\u527a\ud217\u839e\u9255, this:\u6b0d\u7330\u6d99\u9033\u5bc4), p1:\ube23\u67d0\u64f2\u839e\u76bc, var_7_68:\ube23\u67d0\u64f2\u839e\u76bc)) {
                invokevirtual:void(\ub32d\u92ff\uc2bd\ud36e\ud36e<?>::\u97e6\u6d99\u4f52\u527a\u4ab3\u93a2, invokevirtual:\ub32d\u92ff\uc2bd\ud36e\ud36e<?>(\ube23\u67d0\u64f2\u839e\u76bc::\u3d64\u16f6\u9a18\ucef1\ua6bd\u8bb0, p1:\ube23\u67d0\u64f2\u839e\u76bc), getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<Boolean>(\ud36e\u4bc8\u6d69\u92ee\ubb2b::\uc246\u0b8e\uc7fe\u8413\u3776\u8413), invokestatic:Boolean(Boolean::valueOf, xor:int[expected:boolean](ldc:int(20514), ldc:int(20515))), i2l:long(getfield:int(\u6b0d\u7330\u6d99\u9033\u5bc4::\uc238\u3bd6\u624e\u5bc4\u960f\u9a18, this:\u6b0d\u7330\u6d99\u9033\u5bc4)))
            }
            
            loop {
                if (cmpne:boolean(and:int(var_5_BE:int, ldc:int(256)), ldc:int(0))) {
                    var_5_BE = and:int(var_5_BE:int, ldc:int(986542835))
                }
                else {
                    var_5_BE = and:int(var_5_BE:int, ldc:int(-1685461051))
                    invokevirtual:void(\ub32d\u92ff\uc2bd\ud36e\ud36e<?>::\u97e6\u6d99\u4f52\u527a\u4ab3\u93a2, invokevirtual:\ub32d\u92ff\uc2bd\ud36e\ud36e<?>(\ube23\u67d0\u64f2\u839e\u76bc::\u3d64\u16f6\u9a18\ucef1\ua6bd\u8bb0, p1:\ube23\u67d0\u64f2\u839e\u76bc), getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\ud36e\u4bc8\u6d69\u92ee\ubb2b::\ufcaf\u4d85\ub19c\uc87f\u156b\u5245), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u7d52\u718f\u3776\u6fb0\ub83f::\u6c52\uc7fe\u600f\u72f1\u8640\u1833, var_7_68:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), i2l:long(getfield:int(\u6b0d\u7330\u6d99\u9033\u5bc4::\uc238\u3bd6\u624e\u5bc4\u960f\u9a18, this:\u6b0d\u7330\u6d99\u9033\u5bc4)))
                    
                    if (cmpeq:boolean(invokevirtual:\u9255\u0c95\u4cd9\ube23\u760c<?>(\u7d52\u718f\u3776\u6fb0\ub83f::\uff55\ud523\ub171\u4975\u516c\uf995, var_7_68:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\ua3b4\u8aa5\ub113\ubf56\u873d>(\u9255\u0c95\u4cd9\ube23\u760c::\u51b2\u6bb9\u8d90\u4c04\uc3e3\ucfaf))) {
                        if (logicalnot:boolean(invokevirtual:boolean(\u7e3f\ubff1\u718f\ub171\u72f1::\ub113\u718f\u8389\u071d\uc87f\u16f6, invokevirtual:\u7e3f\ubff1\u718f\ub171\u72f1(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8cae\u7330\u9937\ub83f\ube23\u6d69, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c]), getstatic:\uc4d2\u74b1\u8413\u67e9\u1833\u3bc9<\u3d4b\u5654\u8d98\u4bc8\u5db4>(\u7e3f\ubff1\u718f\ub171\u72f1::\ucfaf\u7330\u3e2a\u34df\u3bd6\ucfaf)))) {
                            looporswitchbreak()
                        }
                    }
                }
                
                if (cmpeq:boolean(and:int(var_5_BE:int, ldc:int(2097152)), ldc:int(0))) {
                    var_5_BE = and:int(var_5_BE:int, ldc:int(-396579897))
                    invokevirtual:void(\ub32d\u92ff\uc2bd\ud36e\ud36e<?>::\u983f\ucfaf\ub8be\u120d\u3504\u4179, invokevirtual:\ub32d\u92ff\uc2bd\ud36e\ud36e<?>(\ube23\u67d0\u64f2\u839e\u76bc::\u3d64\u16f6\u9a18\ucef1\ua6bd\u8bb0, p1:\ube23\u67d0\u64f2\u839e\u76bc), getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\ube23\u67d0\u64f2\u839e\u76bc>(\ud36e\u4bc8\u6d69\u92ee\ubb2b::\u9a18\ubf56\u9033\u759a\u4bc8\u6cfe))
                    invokevirtual:void(\ub32d\u92ff\uc2bd\ud36e\ud36e<?>::\u983f\ucfaf\ub8be\u120d\u3504\u4179, invokevirtual:\ub32d\u92ff\uc2bd\ud36e\ud36e<?>(\ube23\u67d0\u64f2\u839e\u76bc::\u3d64\u16f6\u9a18\ucef1\ua6bd\u8bb0, p1:\ube23\u67d0\u64f2\u839e\u76bc), getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<UUID>(\ud36e\u4bc8\u6d69\u92ee\ubb2b::\u6fb0\u8bb0\ud171\u960f\ucfaf\u7af6))
                    looporswitchbreak()
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc \u7af6\ua6bd\u3d64\ud217\u5f50\u7af6(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0) {
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
            return:\ube23\u67d0\u64f2\u839e\u76bc(checkcast:\ube23\u67d0\u64f2\u839e\u76bc(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc.class, invokevirtual:\ube23\u67d0\u64f2\u839e\u76bc(Optional<\ube23\u67d0\u64f2\u839e\u76bc>::get, invokevirtual:Optional<\ube23\u67d0\u64f2\u839e\u76bc>(\ub32d\u92ff\uc2bd\ud36e\ud36e<?>::\u836c\u8753\ub102\u9a18\uc910\u6fb0, invokevirtual:\ub32d\u92ff\uc2bd\ud36e\ud36e<?>(\ube23\u67d0\u64f2\u839e\u76bc::\u3d64\u16f6\u9a18\ucef1\ua6bd\u8bb0, p0:\ube23\u67d0\u64f2\u839e\u76bc), getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\ube23\u67d0\u64f2\u839e\u76bc>(\ud36e\u4bc8\u6d69\u92ee\ubb2b::\u9a18\ubf56\u9033\u759a\u4bc8\u6cfe)))))
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
    
    public void \u6fb0\u8413\u8389\ub1b9\ub83f\u8258(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_62F : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_63A : int
        
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
        var_3_62F = and:int(ldc:int(9211831), ldc:int(2109457383))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6b0d\u7330\u6d99\u9033\u5bc4[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(64)), ldc:int(0))) {
            var_3_62F = and:int(var_3_62F:int, ldc:int(-2122174078))
        }
        else {
            var_3_62F = and:int(var_3_62F:int, ldc:int(2078905207))
            var_5_85 = and:int(ldc:int(-28586), ldc:int(20384))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-4451), ldc:int(4450)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_62F:int, ldc:int(64918495))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(21125), ldc:int(257)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(2065), ldc:int(8515)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_62F = and:int(var_3_DA:int, ldc:int(-722866225))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(20547), ldc:int(129)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1469)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(1)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(294353816))
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1201)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1085)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(1448392495))
                        goto(Label_0934)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(921784088))
                        goto(Label_0807)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0674)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(1229320900))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(256)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(1269518863))
                    }
                    else {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(1128975287))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0807)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1469)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1348)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(482855630))
                        goto(Label_1201)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1085)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(859897656))
                        goto(Label_0934)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(64)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(342680551))
                        goto(Label_0807)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0674)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(742836609))
                            loopcontinue()
                        }
                        
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-1736664161))
                        var_11_EB = and:int(ldc:int(18885), ldc:int(-19926))
                        goto(Label_1458)
                    }
                    
                    Label_0557:
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-392721436))
                        goto(Label_1469)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1348)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1201)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(894085373))
                        goto(Label_1085)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-125871797))
                        goto(Label_0934)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0807)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(116972063))
                            loopcontinue()
                        }
                        
                        var_3_62F = and:int(var_3_62F:int, ldc:int(1694410527))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0807)
                        }
                    }
                    
                    Label_0674:
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1469)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1348)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(1)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(1572669841))
                        goto(Label_1201)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-399529289))
                        goto(Label_1085)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0934)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-1311587937))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(4)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(813412315))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(937513508))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-1921264857))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0807:
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1469)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(1044548796))
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1201)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-1230015340))
                        goto(Label_1085)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0674)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(-620020600))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(-1555769243))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(256)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(-485157761))
                            loopcontinue()
                        }
                        
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-114576569))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(8236), ldc:int(8237))
                                goto(Label_1085)
                            }
                        }
                    }
                    
                    Label_0934:
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1469)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-147898953))
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1201)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0807)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(25719687))
                            goto(Label_0674)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(931787302))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(-1359933304))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-2140545177))
                        var_11_EB = and:int(ldc:int(-25390), ldc:int(24877))
                    }
                    
                    Label_1085:
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(209332886))
                        goto(Label_1469)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1348)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0934)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0807)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0674)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(4)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(-2065797541))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(256)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(1181479425))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(4)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(2039406977))
                            loopcontinue()
                        }
                        
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-1044667417))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1348)
                            }
                        }
                    }
                    
                    Label_1201:
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(2011666733))
                        goto(Label_1469)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-2146180896))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(-37862644))
                            goto(Label_1085)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(4)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(1040741579))
                            goto(Label_0934)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(4)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(1142922812))
                            goto(Label_0807)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0674)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(4)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(-323088736))
                            loopcontinue()
                        }
                        
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-1199919321))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                        goto(Label_1458)
                    }
                    
                    Label_1348:
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1469)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1201)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(256)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-1093110325))
                        goto(Label_1085)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0934)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0807)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0674)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-363605965))
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(2097152)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_62F = and:int(var_3_62F:int, ldc:int(-415255617))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1458:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_63A = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1469:
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(1)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(43422082))
                        goto(Label_1348)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-714046783))
                        goto(Label_1201)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-1976244365))
                        goto(Label_1085)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0934)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(1490108171))
                        goto(Label_0807)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0674)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(1863049991))
                        var_17_63A = add:int(var_16_119:int, xor:int(ldc:int(20545), ldc:int(20544)))
                        looporswitchbreak()
                    }
                    
                    var_3_62F = and:int(var_3_62F:int, ldc:int(173443398))
                }
                
                var_3_62F = and:int(var_3_62F:int, ldc:int(497989599))
                
                if (cmple:boolean(var_5_85 = var_17_63A:int, sub:int(var_6_8C:int, xor:int(ldc:int(-12280), ldc:int(-12279))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_62F = and:int(var_3_62F:int, ldc:int(968100274))
            goto(Label_0106)
        }
    }
}
