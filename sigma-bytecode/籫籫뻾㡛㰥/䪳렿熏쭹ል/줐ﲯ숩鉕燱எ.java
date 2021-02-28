public abstract class \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\uc910\ufcaf\uc229\u9255\u71f1\u0b8e {
    public void \uc910\ufcaf\uc229\u9255\u71f1\u0b8e(\u927d\u92ff\u71ae\uafe7\u6bb9.\u16f6\u61a4\u5db4\u4c04\u64ab\u9255 p0, com.mojang.authlib.GameProfile p1) {
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
            invokespecial:\ua3b4\u8aa5\ub113\ubf56\u873d(\ua3b4\u8aa5\ub113\ubf56\u873d::<init>, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e, p0:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u5db4\ua068\u6cfe\u1833\ud171\uc246, p0:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255), invokevirtual:float(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u61a4\u5bc4\ud7e8\u92ff\u9937\u8cae, p0:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255), p1:GameProfile)
            putfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\uc229\u4bc8\u3dd3\u6ec6\u156b\u62da, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e, aconstnull:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753())
            putfield:long(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\u5bc4\ubefe\u6d99\uafe7\u8258\u8bb0, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e, ldc:long(0L))
            putfield:boolean(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\u62da\uc87f\ubff1\ub8be\uc2bd\uc29a, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e, and:int[expected:boolean](ldc:int(-12344), ldc:int(12327)))
            putfield:String(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\u8d98\u4c2b\ua068\u494c\ub6ab\uceb8, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e, aconstnull:String())
            putfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\u8df4\u0800\u6198\u9937\ub102\ud12e, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e, p0:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255)
            putfield:String(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\u8d98\u4c2b\ua068\u494c\ub6ab\uceb8, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e, invokevirtual:String(GameProfile::getName, p1:GameProfile))
            
            if (cmpne:boolean(getfield:String(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\u8d98\u4c2b\ua068\u494c\ub6ab\uceb8, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e), aconstnull:String())) {
                if (logicalnot:boolean(invokevirtual:boolean(String::isEmpty, getfield:String(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\u8d98\u4c2b\ua068\u494c\ub6ab\uceb8, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e)))) {
                    putfield:String(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\u8d98\u4c2b\ua068\u494c\ub6ab\uceb8, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e, invokestatic:String(\uc84e\u40a9\uc9f6\u4492\u3776\u4c04::\u120d\u873d\u5140\u3d64\ua068\uc246, getfield:String(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\u8d98\u4c2b\ua068\u494c\ub6ab\uceb8, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e)))
                }
            }
            
            invokestatic:\uc9f6\u97b7\u836c\ua068\ub6ab\u6b5f(\u8d90\u9255\ua6bd\u6c52\u51b2\u4179::\uf94d\u51fa\u6b0d\u647c\ua61f\uc4d2, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u5db4\u3d64\u97e6\u8d98\ucb79\u3711() {
        var_1_5F : int
        var_3_70 : \u839e\ud36e\ufe34\uc31c\u392e\u64ab
        stack_A5_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(-1632308330), ldc:int(1593112951))
            var_3_70 = invokevirtual:\u839e\ud36e\ufe34\uc31c\u392e\u64ab(\u527a\u873d\u071d\u4f52\uc229\ud217::\u72f1\u9af2\u71ae\u1187\u2dcc\u8308, invokevirtual:\u527a\u873d\u071d\u4f52\uc229\ud217(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u983f\u4492\u600f\u6bb9\uafe7\u183a, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350)), invokevirtual:UUID(GameProfile::getId, invokevirtual:GameProfile(\ua3b4\u8aa5\ub113\ubf56\u873d::\ud158\u385b\u3dd3\u4e72\ud171\ub102, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e[expected:\ua3b4\u8aa5\ub113\ubf56\u873d])))
            
            if (logicaland:boolean(cmpne:boolean(var_3_70:\u839e\ud36e\ufe34\uc31c\u392e\u64ab, aconstnull:\u839e\ud36e\ufe34\uc31c\u392e\u64ab()), cmpeq:boolean(invokevirtual:\uf94d\u51b2\u1833\u34df\u1187(\u839e\ud36e\ufe34\uc31c\u392e\u64ab::\uafe7\ud51e\ufcaf\u0c95\u6435\u71ae, var_3_70:\u839e\ud36e\ufe34\uc31c\u392e\u64ab), getstatic:\uf94d\u51b2\u1833\u34df\u1187(\uf94d\u51b2\u1833\u34df\u1187::\u71ae\u98a4\ub6ab\ucef1\u0c95\u3776)))) {
                stack_A5_0 = xor:int(ldc:int(9236), ldc:int(9237))
            }
            else {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-1633846370))
                stack_A5_0 = and:int(ldc:int(30009), ldc:int(-32572))
            }
            
            return:boolean(stack_A5_0:int)
        }
        
        goto(Label_0006)
    }
    
    public boolean \u120d\u946b\uff55\u8389\u3e75\uff55() {
        var_1_5F : int
        var_3_70 : \u839e\ud36e\ufe34\uc31c\u392e\u64ab
        stack_A5_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(501236340), ldc:int(1056484092))
            var_3_70 = invokevirtual:\u839e\ud36e\ufe34\uc31c\u392e\u64ab(\u527a\u873d\u071d\u4f52\uc229\ud217::\u72f1\u9af2\u71ae\u1187\u2dcc\u8308, invokevirtual:\u527a\u873d\u071d\u4f52\uc229\ud217(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u983f\u4492\u600f\u6bb9\uafe7\u183a, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350)), invokevirtual:UUID(GameProfile::getId, invokevirtual:GameProfile(\ua3b4\u8aa5\ub113\ubf56\u873d::\ud158\u385b\u3dd3\u4e72\ud171\ub102, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e[expected:\ua3b4\u8aa5\ub113\ubf56\u873d])))
            
            if (logicaland:boolean(cmpne:boolean(var_3_70:\u839e\ud36e\ufe34\uc31c\u392e\u64ab, aconstnull:\u839e\ud36e\ufe34\uc31c\u392e\u64ab()), cmpeq:boolean(invokevirtual:\uf94d\u51b2\u1833\u34df\u1187(\u839e\ud36e\ufe34\uc31c\u392e\u64ab::\uafe7\ud51e\ufcaf\u0c95\u6435\u71ae, var_3_70:\u839e\ud36e\ufe34\uc31c\u392e\u64ab), getstatic:\uf94d\u51b2\u1833\u34df\u1187(\uf94d\u51b2\u1833\u34df\u1187::\ucfaf\uc3e3\ubb2b\u1187\u7bad\u72f1)))) {
                stack_A5_0 = xor:int(ldc:int(-32640), ldc:int(-32639))
            }
            else {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-852096267))
                stack_A5_0 = and:int(ldc:int(24962), ldc:int(-24963))
            }
            
            return:boolean(stack_A5_0:int)
        }
        
        goto(Label_0006)
    }
    
    public boolean \u4daf\u71f1\u8753\uc84e\ua6bd\u4c04() {
        var_1_5F : int
        stack_86_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(2110973144), ldc:int(2111482638))
            
            if (cmpeq:boolean(invokevirtual:\u839e\ud36e\ufe34\uc31c\u392e\u64ab(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\u8cae\u4c2b\u760c\u3d64\u4f52\uc3e3, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e), aconstnull:\u839e\ud36e\ufe34\uc31c\u392e\u64ab())) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-62230792))
                stack_86_0 = and:int(ldc:int(21541), ldc:int(-21542))
            }
            else {
                stack_86_0 = xor:int(ldc:int(24594), ldc:int(24595))
            }
            
            return:boolean(stack_86_0:int)
        }
        
        goto(Label_0006)
    }
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u839e\ud36e\ufe34\uc31c\u392e\u64ab \u8cae\u4c2b\u760c\u3d64\u4f52\uc3e3() {
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
            
            if (cmpeq:boolean(getfield:\u839e\ud36e\ufe34\uc31c\u392e\u64ab(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\ub113\u718f\u8389\u071d\uc87f\u16f6, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e), aconstnull:\u839e\ud36e\ufe34\uc31c\u392e\u64ab())) {
                putfield:\u839e\ud36e\ufe34\uc31c\u392e\u64ab(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\ub113\u718f\u8389\u071d\uc87f\u16f6, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e, invokevirtual:\u839e\ud36e\ufe34\uc31c\u392e\u64ab(\u527a\u873d\u071d\u4f52\uc229\ud217::\u72f1\u9af2\u71ae\u1187\u2dcc\u8308, invokevirtual:\u527a\u873d\u071d\u4f52\uc229\ud217(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u983f\u4492\u600f\u6bb9\uafe7\u183a, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350)), invokevirtual:UUID(\u7d52\u718f\u3776\u6fb0\ub83f::\u40a9\u9255\u7af6\u64f2\u5245\uc7fe, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e[expected:\u7d52\u718f\u3776\u6fb0\ub83f])))
            }
            
            return:\u839e\ud36e\ufe34\uc31c\u392e\u64ab(getfield:\u839e\ud36e\ufe34\uc31c\u392e\u64ab(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\ub113\u718f\u8389\u071d\uc87f\u16f6, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e))
        }
        
        goto(Label_0006)
    }
    
    public boolean \ufe34\u983f\u71ae\u3e2a\u71ae\u8640() {
        var_1_5F : int
        var_3_64 : \u839e\ud36e\ufe34\uc31c\u392e\u64ab
        stack_96_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(-209976747), ldc:int(1503974625))
            var_3_64 = invokevirtual:\u839e\ud36e\ufe34\uc31c\u392e\u64ab(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\u8cae\u4c2b\u760c\u3d64\u4f52\uc3e3, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e)
            
            if (logicaland:boolean(cmpne:boolean(var_3_64:\u839e\ud36e\ufe34\uc31c\u392e\u64ab, aconstnull:\u839e\ud36e\ufe34\uc31c\u392e\u64ab()), invokevirtual:boolean(\u839e\ud36e\ufe34\uc31c\u392e\u64ab::\u6bb9\u3504\u600f\u965f\uc84e\ub32d, var_3_64:\u839e\ud36e\ufe34\uc31c\u392e\u64ab))) {
                stack_96_0 = and:int(ldc:int(4113), ldc:int(19777))
            }
            else {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-788153140))
                stack_96_0 = and:int(ldc:int(-18072), ldc:int(17555))
            }
            
            return:boolean(stack_96_0:int)
        }
        
        goto(Label_0006)
    }
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 \ubb2b\ufcaf\u3c25\u5140\u8350\u4e72() {
        var_1_5F : int
        var_3_64 : \u839e\ud36e\ufe34\uc31c\u392e\u64ab
        stack_85_0 : \u4179\ubb2b\uc7fe\u51fa\uc910\u8753 [generated]
        
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
            var_1_5F = and:int(ldc:int(-625409909), ldc:int(-542400533))
            var_3_64 = invokevirtual:\u839e\ud36e\ufe34\uc31c\u392e\u64ab(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\u8cae\u4c2b\u760c\u3d64\u4f52\uc3e3, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e)
            
            if (cmpne:boolean(var_3_64:\u839e\ud36e\ufe34\uc31c\u392e\u64ab, aconstnull:\u839e\ud36e\ufe34\uc31c\u392e\u64ab())) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(452289019))
                stack_85_0 = invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u839e\ud36e\ufe34\uc31c\u392e\u64ab::\u8258\ub1b9\u62da\u99f7\ud12e\u7006, var_3_64:\u839e\ud36e\ufe34\uc31c\u392e\u64ab)
            }
            else {
                stack_85_0 = invokestatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ub113\u7e3f\u4bc8\uc84e\uc84e\ub70c::\u4e72\ub18d\uc84e\u99f7\ucfaf\u97e6, invokevirtual:UUID(\u7d52\u718f\u3776\u6fb0\ub83f::\u40a9\u9255\u7af6\u64f2\u5245\uc7fe, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))
            }
            
            return:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(stack_85_0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
        }
        
        goto(Label_0006)
    }
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 \u4492\uceb8\u1833\uc87f\u8df4\u4975() {
        var_1_5F : int
        var_3_C3 : \u839e\ud36e\ufe34\uc31c\u392e\u64ab
        
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
        var_1_5F = and:int(ldc:int(-629253616), ldc:int(-541590689))
        
        if (logicalnot:boolean(invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u4f52\u8df4\u61a4\u71ae\u760c\uc238))) {
            return:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(aconstnull:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753())
        }
        
        loop {
            if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_0164)
            }
            
            if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(2048)), ldc:int(0))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-293667212))
                
                if (cmpne:boolean(getfield:long(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\u5bc4\ubefe\u6d99\uafe7\u8258\u8bb0, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e), ldc:long(0L))) {
                    if (cmpgt:boolean(invokestatic:long(System::currentTimeMillis), getfield:long(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\u5bc4\ubefe\u6d99\uafe7\u8258\u8bb0, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e))) {
                        invokestatic:void(\u7e3f\u0c95\u72f1\u839e\ube23\uc3e3::\uc238\u4f4a\ud217\u4f4a\u4c04\u6b5f, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e)
                        putfield:long(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\u5bc4\ubefe\u6d99\uafe7\u8258\u8bb0, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e, ldc:long(0L))
                    }
                }
            }
            
            Label_0130:
            
            if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(16777216)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(128)), ldc:int(0))) {
                    var_1_5F = and:int(var_1_5F:int, ldc:int(1012471877))
                    loopcontinue()
                }
                
                var_1_5F = and:int(var_1_5F:int, ldc:int(-819560450))
                
                if (cmpne:boolean(getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\uc229\u4bc8\u3dd3\u6ec6\u156b\u62da, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e), aconstnull:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753())) {
                    return:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\uc229\u4bc8\u3dd3\u6ec6\u156b\u62da, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e))
                }
            }
            
            Label_0164:
            
            if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(64)), ldc:int(0))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(1237017241))
                goto(Label_0130)
            }
            
            if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(16)), ldc:int(0))) {
                var_3_C3 = invokevirtual:\u839e\ud36e\ufe34\uc31c\u392e\u64ab(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\u8cae\u4c2b\u760c\u3d64\u4f52\uc3e3, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e)
                return:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(ternaryop:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(cmpne:boolean(var_3_C3:\u839e\ud36e\ufe34\uc31c\u392e\u64ab, aconstnull:\u839e\ud36e\ufe34\uc31c\u392e\u64ab()), invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u839e\ud36e\ufe34\uc31c\u392e\u64ab::\u5140\u8753\u8753\u927d\u97b7\u67d0, var_3_C3:\u839e\ud36e\ufe34\uc31c\u392e\u64ab), aconstnull:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753()))
            }
        }
    }
    
    public boolean \ub171\uc3e3\u6d99\u5654\u5f50\uc229() {
        var_1_5F : int
        stack_86_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(-754593282), ldc:int(1381812180))
            
            if (cmpeq:boolean(invokevirtual:\u839e\ud36e\ufe34\uc31c\u392e\u64ab(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\u8cae\u4c2b\u760c\u3d64\u4f52\uc3e3, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e), aconstnull:\u839e\ud36e\ufe34\uc31c\u392e\u64ab())) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(1476094461))
                stack_86_0 = and:int(ldc:int(13451), ldc:int(-13452))
            }
            else {
                stack_86_0 = and:int(ldc:int(4673), ldc:int(10417))
            }
            
            return:boolean(stack_86_0:int)
        }
        
        goto(Label_0006)
    }
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 \u9af2\u8640\ud36e\u7873\u8753\u7049() {
        var_3_64 : \u839e\ud36e\ufe34\uc31c\u392e\u64ab
        
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
            var_3_64 = invokevirtual:\u839e\ud36e\ufe34\uc31c\u392e\u64ab(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\u8cae\u4c2b\u760c\u3d64\u4f52\uc3e3, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e)
            return:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(ternaryop:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(cmpne:boolean(var_3_64:\u839e\ud36e\ufe34\uc31c\u392e\u64ab, aconstnull:\u839e\ud36e\ufe34\uc31c\u392e\u64ab()), invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u839e\ud36e\ufe34\uc31c\u392e\u64ab::\u3dd3\uc84e\u76bc\u6ec6\uc2bd\u71ae, var_3_64:\u839e\ud36e\ufe34\uc31c\u392e\u64ab), aconstnull:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753()))
        }
        
        goto(Label_0006)
    }
    
    public static \u3d64\u7af6\uae87\uc238\u7d52.\u74b1\u4d85\u1187\u92ff\uae87\u6ec6 \u36d3\ud51e\u3776\u8aa5\ud12e\u516c(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0, java.lang.String p1) {
        var_4_66 : \u4f52\ub7dc\u7bad\ud217\u76bc\u6d99
        var_5_6E : \u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a
        stack_B6_1 : File [generated]
        stack_A1_0 : String [generated]
        expr_91 : Object[] [generated]
        
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
            var_4_66 = invokevirtual:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf94d\u6d69\u4492\u6c56\u98a4\u3d64, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350))
            var_5_6E = invokevirtual:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u624e\uc3e3\u6bb9\u4c2b\u7d52\u5db4, var_4_66:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
            
            if (cmpeq:boolean(var_5_6E:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a, aconstnull:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a())) {
                stack_B6_1 = checkcast:File(java.io.File.class, aconstnull:File())
                stack_A1_0 = ldc:String("http://skins.minecraft.net/MinecraftSkins/%s.png")
                expr_91 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(4133), ldc:int(2065)))
                storeelement:Object(expr_91:Object[], and:int(ldc:int(-11737), ldc:int(11664)), invokestatic:String[expected:Object](\uc84e\u40a9\uc9f6\u4492\u3776\u4c04::\u120d\u873d\u5140\u3d64\ua068\uc246, p1:String))
                var_5_6E = initobject:\u74b1\u4d85\u1187\u92ff\uae87\u6ec6(\u74b1\u4d85\u1187\u92ff\uae87\u6ec6::<init>, stack_B6_1:File, invokestatic:String(String::format, stack_A1_0:String, expr_91:Object[]), invokestatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ub113\u7e3f\u4bc8\uc84e\uc84e\ub70c::\u4e72\ub18d\uc84e\u99f7\ucfaf\u97e6, invokestatic:UUID(\ua3b4\u8aa5\ub113\ubf56\u873d::\ud171\u6cfe\u0800\u946b\u5bc4\u4c2b, p1:String)), xor:int[expected:boolean](ldc:int(6404), ldc:int(6405)), checkcast:Runnable(java.lang.Runnable.class, aconstnull:Runnable()))
                invokevirtual:void(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u51fa\u4f52\ub171\u8d90\u0b8e\uc910, var_4_66:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, var_5_6E:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a)
            }
            
            return:\u74b1\u4d85\u1187\u92ff\uae87\u6ec6(checkcast:\u74b1\u4d85\u1187\u92ff\uae87\u6ec6(\u3d64\u7af6\uae87\uc238\u7d52.\u74b1\u4d85\u1187\u92ff\uae87\u6ec6.class, var_5_6E:\u74b1\u4d85\u1187\u92ff\uae87\u6ec6[expected:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a]))
        }
        
        goto(Label_0006)
    }
    
    public static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 \ubb2b\ufcaf\u3c25\u5140\u8350\u4e72(java.lang.String p0) {
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
            return:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("skins/")), invokeinterface:HashCode[expected:Object](HashFunction::hashUnencodedChars, invokestatic:HashFunction(Hashing::sha1), invokestatic:String[expected:CharSequence](\uc84e\u40a9\uc9f6\u4492\u3776\u4c04::\u120d\u873d\u5140\u3d64\ua068\uc246, p0:String))))))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \u8640\u3c25\u1187\u7c6b\u8d90\ub18d() {
        var_1_61 : int
        var_3_66 : \u839e\ud36e\ufe34\uc31c\u392e\u64ab
        stack_89_0 : String [generated]
        
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
            var_1_61 = and:int(ldc:int(1380073522), ldc:int(1581507386))
            var_3_66 = invokevirtual:\u839e\ud36e\ufe34\uc31c\u392e\u64ab(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\u8cae\u4c2b\u760c\u3d64\u4f52\uc3e3, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e)
            
            if (cmpne:boolean(var_3_66:\u839e\ud36e\ufe34\uc31c\u392e\u64ab, aconstnull:\u839e\ud36e\ufe34\uc31c\u392e\u64ab())) {
                var_1_61 = and:int(var_1_61:int, ldc:int(2076141427))
                stack_89_0 = invokevirtual:String(\u839e\ud36e\ufe34\uc31c\u392e\u64ab::\u6bb9\u4c2b\u9255\u56bd\ud523\ucb79, var_3_66:\u839e\ud36e\ufe34\uc31c\u392e\u64ab)
            }
            else {
                stack_89_0 = invokestatic:String(\ub113\u7e3f\u4bc8\uc84e\uc84e\ub70c::\u647c\ub102\ua6bd\u4ab3\u3d4b\u836c, invokevirtual:UUID(\u7d52\u718f\u3776\u6fb0\ub83f::\u40a9\u9255\u7af6\u64f2\u5245\uc7fe, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))
            }
            
            return:String(stack_89_0:String)
        }
        
        goto(Label_0006)
    }
    
    public float \u4c04\u156b\u8753\u12b2\uae87\uae5d() {
        var_1_209 : int
        var_3_63 : float
        var_5_23A : float
        stack_2B8_0 : \u71ae\u5fe1\u0b8e\u5140\uf995\u927d [generated]
        expr_29E : Object[] [generated]
        stack_2C1_0 : float [generated]
        var_5_2CC : \u12cb\u120d\ubb2b\ub18d\u3e2a
        
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
            var_1_209 = and:int(ldc:int(-828305112), ldc:int(-1895845588))
            var_3_63 = ldc:float(1.0f)
            
            if (getfield:boolean(\uc9f6\u759a\u64ab\u97e6\u9255::\u446c\u760c\u8308\ub8be\u8d90\u516c, getfield:\uc9f6\u759a\u64ab\u97e6\u9255(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\ufe34\u92ee\ua61f\u3e2a\uc4d2\u7c6b, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e))) {
                var_3_63 = mul:float(var_3_63:float, ldc:float(1.1f))
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_1_209:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0457)
                }
                
                if (cmpeq:boolean(and:int(var_1_209:int, ldc:int(8)), ldc:int(0))) {
                    var_1_209 = and:int(var_1_209:int, ldc:int(1486613887))
                    goto(Label_0394)
                }
                
                if (cmpeq:boolean(and:int(var_1_209:int, ldc:int(32)), ldc:int(0))) {
                    var_1_209 = and:int(var_1_209:int, ldc:int(-922024232))
                    goto(Label_0322)
                }
                
                if (cmpeq:boolean(and:int(var_1_209:int, ldc:int(8388608)), ldc:int(0))) {
                    var_1_209 = and:int(var_1_209:int, ldc:int(1194062806))
                }
                else {
                    var_1_209 = and:int(var_1_209:int, ldc:int(-38298246))
                    var_3_63 = d2f:float(mul:double(f2d:double(var_3_63:float), div:double(add:double(div:double(invokevirtual:double(\ube23\u67d0\u64f2\u839e\u76bc::\ucb79\ud171\u8640\ub8be\u92ee\u7330, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e[expected:\ube23\u67d0\u64f2\u839e\u76bc], getstatic:\u6ec6\u67e9\u3504\u5654\u92ee(\ub113\ud158\u3bd6\u6fb0\ub32d::\u7043\u4f52\u3504\u5140\u836c\u965f)), f2d:double(invokevirtual:float(\uc9f6\u759a\u64ab\u97e6\u9255::\u76bc\u52d3\ua61f\u6d99\u62da\u6d99, getfield:\uc9f6\u759a\u64ab\u97e6\u9255(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\ufe34\u92ee\ua61f\u3e2a\uc4d2\u7c6b, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e)))), ldc:double(1.0)), ldc:double(2.0))))
                    
                    if (cmpne:boolean(invokevirtual:float(\uc9f6\u759a\u64ab\u97e6\u9255::\u76bc\u52d3\ua61f\u6d99\u62da\u6d99, getfield:\uc9f6\u759a\u64ab\u97e6\u9255(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\ufe34\u92ee\ua61f\u3e2a\uc4d2\u7c6b, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e)), ldc:float(0.0f))) {
                        if (logicalnot:boolean(invokestatic:boolean(Float::isNaN, var_3_63:float))) {
                            if (logicalnot:boolean(invokestatic:boolean(Float::isInfinite, var_3_63:float))) {
                                goto(Label_0322)
                            }
                        }
                    }
                }
                
                Label_0214:
                
                if (cmpne:boolean(and:int(var_1_209:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_0457)
                }
                
                if (cmpne:boolean(and:int(var_1_209:int, ldc:int(536870912)), ldc:int(0))) {
                    var_1_209 = and:int(var_1_209:int, ldc:int(382040456))
                    goto(Label_0394)
                }
                
                if (cmpeq:boolean(and:int(var_1_209:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_209 = and:int(var_1_209:int, ldc:int(2079418007))
                }
                else {
                    if (cmpeq:boolean(and:int(var_1_209:int, ldc:int(65536)), ldc:int(0))) {
                        var_1_209 = and:int(var_1_209:int, ldc:int(1452732522))
                        loopcontinue()
                    }
                    
                    var_1_209 = and:int(var_1_209:int, ldc:int(-1095430216))
                    var_3_63 = ldc:float(1.0f)
                }
                
                Label_0322:
                
                if (cmpne:boolean(and:int(var_1_209:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0457)
                }
                
                if (cmpeq:boolean(and:int(var_1_209:int, ldc:int(65536)), ldc:int(0))) {
                    var_1_209 = and:int(var_1_209:int, ldc:int(824450117))
                }
                else {
                    if (cmpeq:boolean(and:int(var_1_209:int, ldc:int(8388608)), ldc:int(0))) {
                        var_1_209 = and:int(var_1_209:int, ldc:int(1158972880))
                        goto(Label_0214)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_209:int, ldc:int(32)), ldc:int(0))) {
                        var_1_209 = and:int(var_1_209:int, ldc:int(-2075685807))
                        loopcontinue()
                    }
                    
                    var_1_209 = and:int(var_1_209:int, ldc:int(1002263547))
                    
                    if (invokevirtual:boolean(\ube23\u67d0\u64f2\u839e\u76bc::\ua068\ub8be\ub18d\u51fa\u9af2\uc4d2, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e[expected:\ube23\u67d0\u64f2\u839e\u76bc])) {
                        if (instanceof:boolean(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u9255\u4f4a\uf94d\uc2e8\u7330\u946b.class, invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\ube23\u67d0\u64f2\u839e\u76bc::\u62da\ud523\u9937\uc84e\u16f6\uc229, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e[expected:\ube23\u67d0\u64f2\u839e\u76bc])))) {
                            var_5_23A = div:float(i2f:float(invokevirtual:int(\ube23\u67d0\u64f2\u839e\u76bc::\u8d90\u3711\u7ce1\ud7e8\u12cb\uc4d2, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e[expected:\ube23\u67d0\u64f2\u839e\u76bc])), ldc:float(20.0f))
                            
                            if (cmpgt:boolean(var_5_23A:float, ldc:float(1.0f))) {
                                var_5_23A = ldc:float(1.0f)
                                goto(Label_0619)
                            }
                            
                            Label_0579:
                            
                            if (cmpeq:boolean(and:int(var_1_209:int, ldc:int(8388608)), ldc:int(0))) {
                                var_1_209 = and:int(var_1_209:int, ldc:int(-588716812))
                            }
                            else {
                                var_1_209 = and:int(var_1_209:int, ldc:int(1538908536))
                                var_5_23A = mul:float(var_5_23A:float, var_5_23A:float)
                            }
                            
                            Label_0619:
                            
                            if (cmpne:boolean(and:int(var_1_209:int, ldc:int(4194304)), ldc:int(0))) {
                                var_1_209 = and:int(var_1_209:int, ldc:int(-966420638))
                                goto(Label_0579)
                            }
                            
                            var_1_209 = and:int(var_1_209:int, ldc:int(2096626537))
                            var_3_63 = mul:float(var_3_63:float, sub:float(ldc:float(1.0f), mul:float(var_5_23A:float, ldc:float(0.15f))))
                        }
                    }
                }
                
                Label_0394:
                
                if (cmpeq:boolean(and:int(var_1_209:int, ldc:int(1024)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_1_209:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0322)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_209:int, ldc:int(128)), ldc:int(0))) {
                        var_1_209 = and:int(var_1_209:int, ldc:int(-441967143))
                        goto(Label_0214)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_209:int, ldc:int(134217728)), ldc:int(0))) {
                        var_1_209 = and:int(var_1_209:int, ldc:int(449465825))
                        loopcontinue()
                    }
                    
                    var_1_209 = and:int(var_1_209:int, ldc:int(-390597764))
                    
                    if (invokevirtual:boolean(\u71ae\u5fe1\u0b8e\u5140\uf995\u927d::\uc87f\u7af6\u7043\ub19c\uc84e\u4c04, getstatic:\u71ae\u5fe1\u0b8e\u5140\uf995\u927d(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\ud4fe\u4492\uafe7\u3d64\uc246\ud36e))) {
                        stack_2B8_0 = getstatic:\u71ae\u5fe1\u0b8e\u5140\uf995\u927d(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\ud4fe\u4492\uafe7\u3d64\uc246\ud36e)
                        expr_29E = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(10), ldc:int(8)))
                        storeelement:Object(expr_29E:Object[], and:int(ldc:int(-6094), ldc:int(1989)), this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e[expected:Object])
                        storeelement:Object(expr_29E:Object[], and:int(ldc:int(8105), ldc:int(16403)), invokestatic:Float[expected:Object](Float::valueOf, var_3_63:float))
                        stack_2C1_0 = invokestatic:float(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u9033\u97e6\u9a18\u983f\ud217\ud36e, stack_2B8_0:\u71ae\u5fe1\u0b8e\u5140\uf995\u927d, expr_29E:Object[])
                        looporswitchbreak()
                    }
                }
                
                Label_0457:
                
                if (cmpeq:boolean(and:int(var_1_209:int, ldc:int(32)), ldc:int(0))) {
                    var_1_209 = and:int(var_1_209:int, ldc:int(1135803487))
                    goto(Label_0394)
                }
                
                if (cmpeq:boolean(and:int(var_1_209:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0322)
                }
                
                if (cmpne:boolean(and:int(var_1_209:int, ldc:int(2)), ldc:int(0))) {
                    var_1_209 = and:int(var_1_209:int, ldc:int(-1776276357))
                    goto(Label_0214)
                }
                
                if (cmpeq:boolean(and:int(var_1_209:int, ldc:int(268435456)), ldc:int(0))) {
                    var_1_209 = and:int(var_1_209:int, ldc:int(-805348375))
                    stack_2C1_0 = var_3_63:float
                    looporswitchbreak()
                }
                
                var_1_209 = and:int(var_1_209:int, ldc:int(-2053249029))
            }
            
            var_5_2CC = initobject:\u12cb\u120d\ubb2b\ub18d\u3e2a(\u12cb\u120d\ubb2b\ub18d\u3e2a::<init>, stack_2C1_0:float)
            invokevirtual:void(\uc910\u3e75\u527a\u446c\u3c25::\u34df\u8308\u74b1\u9af2\u9937, invokevirtual:\uc910\u3e75\u527a\u446c\u3c25(\u6b0d\ua068\uc4d2\u5245\u4d85::\u4e72\u4c2b\u5d20\u8350\u6b0d, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), var_5_2CC:\u12cb\u120d\ubb2b\ub18d\u3e2a[expected:\u6435\u385b\uae5d\u7049\u8bb0])
            return:float(getfield:float(\u12cb\u120d\ubb2b\ub18d\u3e2a::\u983f\u760c\ub19c\u8cae\u34df, var_5_2CC:\u12cb\u120d\ubb2b\ub18d\u3e2a))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \u5f50\u392e\u56bd\u99f7\uc7fe\u0b8e() {
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
            return:String(getfield:String(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\u8d98\u4c2b\ua068\u494c\ub6ab\uceb8, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e))
        }
        
        goto(Label_0006)
    }
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 \u624e\u0a06\u5654\u3c25\uae87\u0b8e() {
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
            return:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\uc229\u4bc8\u3dd3\u6ec6\u156b\u62da, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e))
        }
        
        goto(Label_0006)
    }
    
    public void \ub113\u71ae\u0a06\u6cfe\u3d4b\ubefe(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0) {
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
            putfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\uc229\u4bc8\u3dd3\u6ec6\u156b\u62da, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u7c6b\u1833\u3c25\u16f6\u836c\u0800() {
        var_1_61 : int
        var_3_66 : \u4179\ubb2b\uc7fe\u51fa\uc910\u8753
        var_1_A0 : int
        stack_C8_0 : int [generated]
        
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
        var_1_61 = and:int(ldc:int(1000586121), ldc:int(866138679))
        var_3_66 = invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\u4492\uceb8\u1833\uc87f\u8df4\u4975, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e)
        
        if (cmpne:boolean(var_3_66:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, aconstnull:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753())) {
            loop {
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(8388608)), ldc:int(0))) {
                    var_1_A0 = and:int(var_1_61:int, ldc:int(-198805783))
                }
                else {
                    var_1_A0 = and:int(var_1_61:int, ldc:int(-873800106))
                    
                    if (cmpeq:boolean(var_3_66:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\uc229\u4bc8\u3dd3\u6ec6\u156b\u62da, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e))) {
                        stack_C8_0 = getfield:boolean[expected:int](\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\u62da\uc87f\ubff1\ub8be\uc2bd\uc29a, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e)
                        looporswitchbreak()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_1_A0:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_A0 = and:int(var_1_A0:int, ldc:int(933576553))
                    stack_C8_0 = xor:int(ldc:int(165), ldc:int(164))
                    looporswitchbreak()
                }
                
                var_1_61 = and:int(var_1_A0:int, ldc:int(-577911754))
            }
            
            return:boolean(stack_C8_0:int)
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(-6159), ldc:int(6158)))
    }
    
    public void \u67d0\u64ab\u71ae\u983f\u34df\ua61f(boolean p0) {
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
            putfield:boolean(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\u62da\uc87f\ubff1\ub8be\uc2bd\uc29a, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e, p0:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u3776\ub8be\uc2bd\u6d69\u946b\ubb2b() {
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
            return:boolean(getfield:boolean(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\u62da\uc87f\ubff1\ub8be\uc2bd\uc29a, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e))
        }
        
        goto(Label_0006)
    }
    
    public long \u718f\u071d\u3bd6\u071d\u92ee\u647c() {
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
            return:long(getfield:long(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\u5bc4\ubefe\u6d99\uafe7\u8258\u8bb0, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e))
        }
        
        goto(Label_0006)
    }
    
    public void \u7330\uc4d2\u7af6\ua068\uc4d2\u5f50(long p0) {
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
            putfield:long(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\u5bc4\ubefe\u6d99\uafe7\u8258\u8bb0, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e, p0:long)
            return:void()
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
            putstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\u8df4\u9255\u7e3f\u5bc4\u647c\u67d0, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, ldc:String("textures/entity/elytra.png")))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u759a\ud36e\u7bad\u12cb\uae87\uc2e8(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_62C : int
        var_5_89 : int
        var_6_90 : int
        var_7_9F : double
        var_9_C7 : double
        var_3_D9 : int
        var_11_EA : int
        var_14_114 : double
        var_16_118 : int
        var_12_110 : double
        var_17_637 : int
        
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
        var_3_62C = and:int(ldc:int(1203996934), ldc:int(903443795))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0179)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_62C = and:int(var_3_62C:int, ldc:int(-2070522325))
        }
        else {
            var_3_62C = and:int(var_3_62C:int, ldc:int(-2021791043))
            var_5_89 = and:int(ldc:int(-15488), ldc:int(5175))
            var_6_90 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9F = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-23967), ldc:int(19852)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C7 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D9 = and:int(var_3_62C:int, ldc:int(902764119))
                    var_9_C7 = sub:double(var_7_9F:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EA = var_5_89:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EA:int, sub:int(var_6_90:int, xor:int(ldc:int(8968), ldc:int(8969)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EA:int, and:int(ldc:int(12325), ldc:int(2753)))), var_7_9F:double))) {
                        inc:int(var_11_EA, ldc:int(1))
                    }
                    
                    var_3_62C = and:int(var_3_D9:int, ldc:int(1744697485))
                    var_14_114 = var_7_9F:double
                    var_16_118 = var_11_EA:int
                }
                else {
                    var_11_EA = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_89:int), and:int(ldc:int(129), ldc:int(17989)))
                    var_12_110 = var_14_114 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89)
                    
                    if (cmplt:boolean(var_16_118 = var_11_EA:int, var_6_90:int)) {
                        var_9_C7 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EA:int)
                        var_16_118 = var_11_EA:int
                        var_14_114 = var_12_110:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(1381131846))
                        goto(Label_1487)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(2104268038))
                        goto(Label_1350)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1224)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1902107439))
                        goto(Label_1091)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1661722741))
                        goto(Label_0944)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(530745604))
                        goto(Label_0837)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0725)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0600)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(2056192839))
                    }
                    else {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-313824505))
                        
                        if (cmplt:boolean(var_16_118:int, var_6_90:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0600)
                            }
                            
                            goto(Label_0837)
                        }
                    }
                    
                    Label_0426:
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(1)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1433083626))
                        goto(Label_1487)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1350)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(182538351))
                        goto(Label_1224)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1091)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0944)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-937352716))
                        goto(Label_0837)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-2071205413))
                        goto(Label_0725)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1746074549))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(234191265))
                            var_11_EA = and:int(ldc:int(-32759), ldc:int(29638))
                            goto(Label_1476)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0600:
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1487)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1125893511))
                        goto(Label_1350)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(281885808))
                        goto(Label_1224)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1623319966))
                        goto(Label_1091)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0944)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0837)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(1)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-448033143))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0426)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1082137173))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_114 = var_9_C7:double
                            goto(Label_0837)
                        }
                    }
                    
                    Label_0725:
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1487)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(1)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(234907407))
                        goto(Label_1350)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(1)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(144165103))
                        goto(Label_1224)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1091)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0944)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0600)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0426)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1211555589))
                        var_14_114 = mul:double(ldc:double(0.5), add:double(var_9_C7:double, var_14_114:double))
                    }
                    
                    Label_0837:
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(699060062))
                        goto(Label_1487)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1350)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1224)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1091)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0725)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(-1718182812))
                            goto(Label_0600)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0426)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-440285720))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89:int), var_7_9F:double)) {
                                var_11_EA = xor:int(ldc:int(24594), ldc:int(24595))
                                goto(Label_1091)
                            }
                        }
                    }
                    
                    Label_0944:
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1487)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1350)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1224)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(1)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(954616623))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0837)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0725)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(-951196529))
                            goto(Label_0600)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(1524152146))
                            goto(Label_0426)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62C = and:int(var_3_62C:int, ldc:int(1844684007))
                        var_11_EA = and:int(ldc:int(-15999), ldc:int(5742))
                    }
                    
                    Label_1091:
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-533636367))
                        goto(Label_1487)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1350)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-753841395))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0944)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(1957521869))
                            goto(Label_0837)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(1)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(-1156246885))
                            goto(Label_0725)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0600)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0426)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(599904142))
                            loopcontinue()
                        }
                        
                        var_3_62C = and:int(var_3_62C:int, ldc:int(1028629357))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                                goto(Label_1350)
                            }
                        }
                    }
                    
                    Label_1224:
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(1098077426))
                        goto(Label_1487)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1615181910))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_1091)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0944)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0837)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0725)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0600)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(-825990225))
                            goto(Label_0426)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(366674188))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_114:double, var_5_89:int, var_16_118:int)
                            goto(Label_1476)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1350:
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1487)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1224)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1091)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(611473800))
                        goto(Label_0944)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0837)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0725)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(1409513240))
                        goto(Label_0600)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-184984704))
                        loopcontinue()
                    }
                    
                    var_3_62C = and:int(var_3_62C:int, ldc:int(-984362494))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_114:double, ldc:double(0.0))
                    Label_1476:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_637 = var_5_89:int
                        
                        if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1487:
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1350)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1224)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1659563955))
                        goto(Label_1091)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0944)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0837)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0725)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0600)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1364937517))
                        goto(Label_0426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(660732003))
                        var_17_637 = add:int(var_16_118:int, and:int(ldc:int(4769), ldc:int(1)))
                        looporswitchbreak()
                    }
                }
                
                var_3_62C = and:int(var_3_62C:int, ldc:int(-136361313))
                
                if (cmple:boolean(var_5_89 = var_17_637:int, sub:int(var_6_90:int, xor:int(ldc:int(-32767), ldc:int(-32768))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0179:
        
        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(16384)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
