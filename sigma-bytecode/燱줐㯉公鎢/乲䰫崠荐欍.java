public class \u71f1\uc910\u3bc9\u516c\u93a2.\u4e72\u4c2b\u5d20\u8350\u6b0d {
    public void \u4e72\u4c2b\u5d20\u8350\u6b0d() {
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
            invokespecial:\ud158\u839e\u7006\uc3e3\u446c(\ud158\u839e\u7006\uc3e3\u446c::<init>, this:\u4e72\u4c2b\u5d20\u8350\u6b0d, getstatic:\ucef1\u3504\u64f2\u6cfe\u52d3(\ucef1\u3504\u64f2\u6cfe\u52d3::\u836c\u67d0\ubb2b\u93a2\u5654), loadelement:String(getstatic:String[](\u4e72\u4c2b\u5d20\u8350\u6b0d::\u92ff\u3504\u446c\ua068\u960f), and:int(ldc:int(-1848), ldc:int(1815))), loadelement:String(getstatic:String[](\u4e72\u4c2b\u5d20\u8350\u6b0d::\u92ff\u3504\u446c\ua068\u960f), and:int(ldc:int(24673), ldc:int(1037))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u71f1\u67d0\ub19c\u0c95\u4c2b(\u56bd\u8413\u647c\u5bc4\ud158.\ua562\ubb2b\u647c\ufe34\ufcaf p0) {
        var_2_81 : int
        
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
        var_2_81 = and:int(ldc:int(-2024621901), ldc:int(-1208223684))
        
        if (invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u6c52\ub1b9\uc7fe\ucfaf\u5d20, this:\u4e72\u4c2b\u5d20\u8350\u6b0d[expected:\ud158\u839e\u7006\uc3e3\u446c])) {
            loop {
                if (cmpne:boolean(and:int(var_2_81:int, ldc:int(4)), ldc:int(0))) {
                    var_2_81 = and:int(var_2_81:int, ldc:int(1672532682))
                    goto(Label_0200)
                }
                
                if (cmpne:boolean(and:int(var_2_81:int, ldc:int(33554432)), ldc:int(0))) {
                    var_2_81 = and:int(var_2_81:int, ldc:int(796834615))
                    
                    if (cmpeq:boolean(d2i:int(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4e72\u4c2b\u5d20\u8350\u6b0d::\u64f2\u8350\u0b8e\u64f2\u946b)))), getfield:int(\u4e72\u4c2b\u5d20\u8350\u6b0d::\uc31c\u8753\u4492\u64ab\u4975, this:\u4e72\u4c2b\u5d20\u8350\u6b0d))) {
                        if (logicalnot:boolean(getfield:boolean(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u1187\u3c25\ua3b4\u6d99\uc9f6\u6d99, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4e72\u4c2b\u5d20\u8350\u6b0d::\u64f2\u8350\u0b8e\u64f2\u946b))))) {
                            invokestatic:double(\u3bd6\u6d99\ub113\u4d85\u71f1::\u7c6b\u3504\ub171\u647c\u56bd, ldc:double(-2.0))
                        }
                    }
                }
                
                Label_0147:
                
                if (cmpeq:boolean(and:int(var_2_81:int, ldc:int(16777216)), ldc:int(0))) {
                    var_2_81 = and:int(var_2_81:int, ldc:int(-486394326))
                }
                else {
                    if (cmpeq:boolean(and:int(var_2_81:int, ldc:int(16)), ldc:int(0))) {
                        var_2_81 = and:int(var_2_81:int, ldc:int(-981439254))
                        loopcontinue()
                    }
                    
                    var_2_81 = and:int(var_2_81:int, ldc:int(937095038))
                    
                    if (cmpgt:boolean(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4e72\u4c2b\u5d20\u8350\u6b0d::\u64f2\u8350\u0b8e\u64f2\u946b))), i2d:double(getfield:int(\u4e72\u4c2b\u5d20\u8350\u6b0d::\uc31c\u8753\u4492\u64ab\u4975, this:\u4e72\u4c2b\u5d20\u8350\u6b0d)))) {
                        if (getfield:boolean(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u1187\u3c25\ua3b4\u6d99\uc9f6\u6d99, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4e72\u4c2b\u5d20\u8350\u6b0d::\u64f2\u8350\u0b8e\u64f2\u946b)))) {
                            if (logicalnot:boolean(invokevirtual:boolean(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u6b0d\ubb2b\ucfaf\ua6bd\uc84e\ub6ab, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4e72\u4c2b\u5d20\u8350\u6b0d::\u64f2\u8350\u0b8e\u64f2\u946b))))) {
                                putfield:int(\u4e72\u4c2b\u5d20\u8350\u6b0d::\uc31c\u8753\u4492\u64ab\u4975, this:\u4e72\u4c2b\u5d20\u8350\u6b0d, add:int(getfield:int(\u4e72\u4c2b\u5d20\u8350\u6b0d::\uc31c\u8753\u4492\u64ab\u4975, this:\u4e72\u4c2b\u5d20\u8350\u6b0d), xor:int(ldc:int(18438), ldc:int(18439))))
                            }
                        }
                    }
                }
                
                Label_0200:
                
                if (cmpeq:boolean(and:int(var_2_81:int, ldc:int(4194304)), ldc:int(0))) {
                    var_2_81 = and:int(var_2_81:int, ldc:int(1870056901))
                    goto(Label_0147)
                }
                
                if (cmpeq:boolean(and:int(var_2_81:int, ldc:int(4)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            if (cmpeq:boolean(rem:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4e72\u4c2b\u5d20\u8350\u6b0d::\u64f2\u8350\u0b8e\u64f2\u946b))), ldc:double(1.0)), ldc:double(0.0))) {
                if (invokevirtual:boolean(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u6b0d\ubb2b\ucfaf\ua6bd\uc84e\ub6ab, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4e72\u4c2b\u5d20\u8350\u6b0d::\u64f2\u8350\u0b8e\u64f2\u946b)))) {
                    putfield:int(\u4e72\u4c2b\u5d20\u8350\u6b0d::\uc31c\u8753\u4492\u64ab\u4975, this:\u4e72\u4c2b\u5d20\u8350\u6b0d, sub:int(getfield:int(\u4e72\u4c2b\u5d20\u8350\u6b0d::\uc31c\u8753\u4492\u64ab\u4975, this:\u4e72\u4c2b\u5d20\u8350\u6b0d), and:int(ldc:int(1801), ldc:int(2085))))
                }
            }
        }
    }
    
    private void \u71f1\u67d0\ub19c\u0c95\u4c2b(\u71f1\uc910\u3bc9\u516c\u93a2.\u34df\u71ae\ua61f\u6cfe\u7ce1 p0) {
        var_2_F1 : int
        
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
        var_2_F1 = and:int(ldc:int(627169738), ldc:int(-1114282646))
        
        if (invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u6c52\ub1b9\uc7fe\ucfaf\u5d20, this:\u4e72\u4c2b\u5d20\u8350\u6b0d[expected:\ud158\u839e\u7006\uc3e3\u446c])) {
            loop {
                if (cmpne:boolean(and:int(var_2_F1:int, ldc:int(4)), ldc:int(0))) {
                    var_2_F1 = and:int(var_2_F1:int, ldc:int(-1357924576))
                    goto(Label_0317)
                }
                
                if (cmpne:boolean(and:int(var_2_F1:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_0192)
                }
                
                if (cmpeq:boolean(and:int(var_2_F1:int, ldc:int(16777216)), ldc:int(0))) {
                    var_2_F1 = and:int(var_2_F1:int, ldc:int(-539835319))
                }
                else {
                    var_2_F1 = and:int(var_2_F1:int, ldc:int(1058697706))
                    
                    if (cmpne:boolean(invokevirtual:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u34df\u71ae\ua61f\u6cfe\u7ce1::\u51b2\u8350\u4bc8\u71f1\u8350, p0:\u34df\u71ae\ua61f\u6cfe\u7ce1), aconstnull:\u6c52\ubded\u4975\u71ae\u47c2\u7d52())) {
                        if (cmpeq:boolean(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u34df\u71ae\ua61f\u6cfe\u7ce1::\u56bd\u0a06\u3bc9\u72f1\u1833, p0:\u34df\u71ae\ua61f\u6cfe\u7ce1)), sub:int(getfield:int(\u4e72\u4c2b\u5d20\u8350\u6b0d::\uc31c\u8753\u4492\u64ab\u4975, this:\u4e72\u4c2b\u5d20\u8350\u6b0d), and:int(ldc:int(5695), ldc:int(449))))) {
                            goto(Label_0192)
                        }
                    }
                }
                
                Label_0152:
                
                if (cmpne:boolean(and:int(var_2_F1:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_0317)
                }
                
                if (cmpne:boolean(and:int(var_2_F1:int, ldc:int(64)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_2_F1:int, ldc:int(1048576)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_F1 = and:int(var_2_F1:int, ldc:int(-438600101))
                    
                    if (cmpne:boolean(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u34df\u71ae\ua61f\u6cfe\u7ce1::\u56bd\u0a06\u3bc9\u72f1\u1833, p0:\u34df\u71ae\ua61f\u6cfe\u7ce1)), getfield:int(\u4e72\u4c2b\u5d20\u8350\u6b0d::\uc31c\u8753\u4492\u64ab\u4975, this:\u4e72\u4c2b\u5d20\u8350\u6b0d))) {
                        if (cmpne:boolean(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u34df\u71ae\ua61f\u6cfe\u7ce1::\u56bd\u0a06\u3bc9\u72f1\u1833, p0:\u34df\u71ae\ua61f\u6cfe\u7ce1)), add:int(getfield:int(\u4e72\u4c2b\u5d20\u8350\u6b0d::\uc31c\u8753\u4492\u64ab\u4975, this:\u4e72\u4c2b\u5d20\u8350\u6b0d), and:int(ldc:int(17415), ldc:int(14489))))) {
                            goto(Label_0317)
                        }
                        
                        if (logicalnot:boolean(instanceof:boolean(\u59ec\u8413\u97e6\uc229\u3776.\u3d64\ubf56\u3dd3\ua3b4\uc229\u7af6.class, invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e](\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4e72\u4c2b\u5d20\u8350\u6b0d::\u64f2\u8350\u0b8e\u64f2\u946b)), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u34df\u71ae\ua61f\u6cfe\u7ce1::\u56bd\u0a06\u3bc9\u72f1\u1833, p0:\u34df\u71ae\ua61f\u6cfe\u7ce1)))))) {
                            goto(Label_0317)
                        }
                    }
                }
                
                Label_0192:
                
                if (cmpne:boolean(and:int(var_2_F1:int, ldc:int(524288)), ldc:int(0))) {
                    var_2_F1 = and:int(var_2_F1:int, ldc:int(2090822557))
                }
                else {
                    if (cmpne:boolean(and:int(var_2_F1:int, ldc:int(1048576)), ldc:int(0))) {
                        var_2_F1 = and:int(var_2_F1:int, ldc:int(-40424899))
                        goto(Label_0152)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_F1:int, ldc:int(8388608)), ldc:int(0))) {
                        var_2_F1 = and:int(var_2_F1:int, ldc:int(1806936498))
                        loopcontinue()
                    }
                    
                    var_2_F1 = and:int(var_2_F1:int, ldc:int(-279352475))
                    invokevirtual:void(\u34df\u71ae\ua61f\u6cfe\u7ce1::\u2dcc\ua6bd\u120d\ub70c\u6b0d, p0:\u34df\u71ae\ua61f\u6cfe\u7ce1, aconstnull:\u6c52\ubded\u4975\u71ae\u47c2\u7d52())
                    looporswitchbreak()
                }
                
                Label_0317:
                
                if (cmpeq:boolean(and:int(var_2_F1:int, ldc:int(64)), ldc:int(0))) {
                    var_2_F1 = and:int(var_2_F1:int, ldc:int(-1265344817))
                    goto(Label_0192)
                }
                
                if (cmpne:boolean(and:int(var_2_F1:int, ldc:int(8388608)), ldc:int(0))) {
                    var_2_F1 = and:int(var_2_F1:int, ldc:int(319579186))
                    goto(Label_0152)
                }
                
                if (cmpne:boolean(and:int(var_2_F1:int, ldc:int(524288)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_F1 = and:int(var_2_F1:int, ldc:int(-404817211))
                
                if (instanceof:boolean(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u7bad\u12b2\ubf56\ubb2b\uc238\u97e6.class, invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e](\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4e72\u4c2b\u5d20\u8350\u6b0d::\u64f2\u8350\u0b8e\u64f2\u946b)), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u34df\u71ae\ua61f\u6cfe\u7ce1::\u56bd\u0a06\u3bc9\u72f1\u1833, p0:\u34df\u71ae\ua61f\u6cfe\u7ce1))))) {
                    goto(Label_0192)
                }
                
                if (instanceof:boolean(\u56bd\u8413\u647c\u5bc4\ud158.\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1.class, invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e](\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4e72\u4c2b\u5d20\u8350\u6b0d::\u64f2\u8350\u0b8e\u64f2\u946b)), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u34df\u71ae\ua61f\u6cfe\u7ce1::\u56bd\u0a06\u3bc9\u72f1\u1833, p0:\u34df\u71ae\ua61f\u6cfe\u7ce1))))) {
                    goto(Label_0192)
                }
                
                if (instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\u8413\u4c04\u3e2a\u67d0\u5fe1.class, invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e](\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4e72\u4c2b\u5d20\u8350\u6b0d::\u64f2\u8350\u0b8e\u64f2\u946b)), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u34df\u71ae\ua61f\u6cfe\u7ce1::\u56bd\u0a06\u3bc9\u72f1\u1833, p0:\u34df\u71ae\ua61f\u6cfe\u7ce1))))) {
                    goto(Label_0192)
                }
                
                if (logicalnot:boolean(instanceof:boolean(\u59ec\u8413\u97e6\uc229\u3776.\u6bb9\uc84e\u5d20\uceb8\u4975\u392e.class, invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e](\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4e72\u4c2b\u5d20\u8350\u6b0d::\u64f2\u8350\u0b8e\u64f2\u946b)), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u34df\u71ae\ua61f\u6cfe\u7ce1::\u56bd\u0a06\u3bc9\u72f1\u1833, p0:\u34df\u71ae\ua61f\u6cfe\u7ce1)))))) {
                    looporswitchbreak()
                }
                
                goto(Label_0192)
            }
        }
    }
    
    private void \u71f1\u67d0\ub19c\u0c95\u4c2b(\u3d64\u7af6\uae87\uc238\u7d52.\u3e75\u983f\u3d64\uc910\u0800 p0) {
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
        
        if (invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u6c52\ub1b9\uc7fe\ucfaf\u5d20, this:\u4e72\u4c2b\u5d20\u8350\u6b0d[expected:\ud158\u839e\u7006\uc3e3\u446c])) {
            invokevirtual:boolean(\u6ec6\uc7fe\u927d\u6cfe\ub32d::\u4e72\u6198\u7c6b\u718f\u64ab, p0:\u3e75\u983f\u3d64\uc910\u0800[expected:\u6ec6\uc7fe\u927d\u6cfe\ub32d], xor:int[expected:boolean](ldc:int(4626), ldc:int(4627)))
        }
    }
    
    public void \ub6ab\ube23\uae87\uc84e\u1833() {
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
            putfield:int(\u4e72\u4c2b\u5d20\u8350\u6b0d::\uc31c\u8753\u4492\u64ab\u4975, this:\u4e72\u4c2b\u5d20\u8350\u6b0d, d2i:int(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4e72\u4c2b\u5d20\u8350\u6b0d::\u64f2\u8350\u0b8e\u64f2\u946b)))))
            putfield:double(\u4e72\u4c2b\u5d20\u8350\u6b0d::\u446c\u5d20\u4bc8\u5d20\ufcaf, this:\u4e72\u4c2b\u5d20\u8350\u6b0d, sub:double(i2d:double(getfield:int(\u4e72\u4c2b\u5d20\u8350\u6b0d::\uc31c\u8753\u4492\u64ab\u4975, this:\u4e72\u4c2b\u5d20\u8350\u6b0d)), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4e72\u4c2b\u5d20\u8350\u6b0d::\u64f2\u8350\u0b8e\u64f2\u946b)))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1F0 : int
        expr_6B : int [generated]
        stack_9B_0 : byte[] [generated]
        stack_9D_0 : byte[] [generated]
        stack_DF_0 : byte[] [generated]
        stack_E1_0 : byte[] [generated]
        stack_111_0 : byte[] [generated]
        stack_113_0 : byte[] [generated]
        stack_143_0 : byte[] [generated]
        stack_145_0 : byte[] [generated]
        stack_17C_0 : byte[] [generated]
        stack_211_0 : byte[] [generated]
        stack_24C_0 : byte[] [generated]
        stack_2C2_0 : byte[] [generated]
        stack_336_0 : byte[] [generated]
        stack_3B3_0 : byte[] [generated]
        var_4_1DD : int
        var_3_1E2 : byte[]
        var_5_1E3 : int
        expr_2C2 : byte [generated]
        var_0_32C : int
        expr_336 : byte [generated]
        stack_37E_2 : byte [generated]
        stack_35B_0 : byte [generated]
        var_2_9B : byte[]
        expr_9F : int [generated]
        var_3_23A : byte[]
        var_5_23B : int
        expr_E1 : int [generated]
        expr_113 : int [generated]
        expr_145 : int [generated]
        var_3_3A1 : byte[]
        var_5_3A2 : int
        var_3_188 : String
        stack_1D6_0 : String[] [generated]
        expr_19A : String[] [generated]
        
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
        var_0_1F0 = and:int(ldc:int(1927177532), ldc:int(-1440391508))
        expr_6B = arraylength:int(stack_9B_0 = stack_9D_0 = stack_DF_0 = stack_E1_0 = stack_111_0 = stack_113_0 = stack_143_0 = stack_145_0 = stack_17C_0 = stack_211_0 = stack_24C_0 = stack_2C2_0 = stack_336_0 = stack_3B3_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("fEzUyyu7dByrEeO+RYPEo2MpM+3UVeTJUw6k+XyOs1NpGyacyyMEqGgD")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1DD = expr_6B:int
        var_3_1E2 = newarray:byte[](byte.class, expr_6B:int)
        var_5_1E3 = expr_6B:int
        Label_0485:
        
        while (cmpne:boolean(and:int(var_0_1F0:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1F0:int, ldc:int(32)), ldc:int(0))) {
                var_0_1F0 = and:int(var_0_1F0:int, ldc:int(1970295237))
                goto(Label_0659)
            }
            
            var_0_1F0 = and:int(var_0_1F0:int, ldc:int(-1481319306))
            var_5_1E3 = add:int(var_5_1E3:int, ldc:int(-1))
            storeelement:byte(var_3_1E2:byte[], var_5_1E3:int, xor:byte(loadelement:byte(stack_211_0:byte[], var_5_1E3:int), ldc:byte(3)))
            
            if (cmpne:boolean(var_5_1E3:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9D_0 = stack_9B_0 = stack_DF_0 = stack_E1_0 = stack_111_0 = stack_113_0 = stack_143_0 = stack_145_0 = stack_17C_0 = stack_211_0 = stack_24C_0 = stack_2C2_0 = stack_336_0 = stack_3B3_0 = var_3_1E2:byte[]
            goto(Label_0112)
        }
        
        var_0_1F0 = and:int(var_0_1F0:int, ldc:int(-1726419448))
        goto(Label_0775)
        Label_0659:
        
        while (cmpne:boolean(and:int(var_0_1F0:int, ldc:int(33554432)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1F0:int, ldc:int(33554432)), ldc:int(0))) {
                var_0_1F0 = and:int(var_0_1F0:int, ldc:int(1048524619))
                goto(Label_0485)
            }
            
            var_0_1F0 = and:int(var_0_1F0:int, ldc:int(-1086526620))
            var_5_1E3 = add:int(var_5_1E3:int, ldc:int(-1))
            expr_2C2 = loadelement:byte(stack_2C2_0:byte[], var_5_1E3:int)
            storeelement:byte(var_3_1E2:byte[], var_5_1E3:int, or:int(and:int(shl:int(expr_2C2:byte, and:int(ldc:int(204), ldc:int(5124))), ldc:int(-16)), and:int(shr:int(expr_2C2:byte[expected:int], and:int(ldc:int(8245), ldc:int(7430))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_1E3:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9D_0 = stack_9B_0 = stack_DF_0 = stack_E1_0 = stack_111_0 = stack_113_0 = stack_143_0 = stack_145_0 = stack_17C_0 = stack_211_0 = stack_24C_0 = stack_2C2_0 = stack_336_0 = stack_3B3_0 = var_3_1E2:byte[]
            goto(Label_0230)
        }
        
        var_0_1F0 = and:int(var_0_1F0:int, ldc:int(1554495640))
        Label_0775:
        
        while (cmpeq:boolean(and:int(var_0_1F0:int, ldc:int(1)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1F0:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_1F0 = and:int(var_0_1F0:int, ldc:int(-467417626))
                goto(Label_0485)
            }
            
            var_0_32C = and:int(var_0_1F0:int, ldc:int(-294891209))
            var_5_1E3 = add:int(var_5_1E3:int, ldc:int(-1))
            expr_336 = stack_37E_2 = loadelement(stack_336_0, var_5_1E3)
            
            if (cmplt:boolean(add:int(add:int(var_5_1E3:int, ldc:int(2)), neg:int(var_4_1DD:int)), ldc:int(0))) {
                stack_37E_2 = stack_35B_0 = add:byte(expr_336:byte, loadelement:byte(var_3_1E2:byte[], add:int(var_5_1E3:int, ldc:int(2))))
                goto(Label_0875)
            }
            
            Label_0835:
            
            if (cmpeq:boolean(and:int(var_0_32C:int, ldc:int(262144)), ldc:int(0))) {
                var_0_32C = and:int(var_0_32C:int, ldc:int(2007732016))
            }
            else {
                var_0_32C = and:int(var_0_32C:int, ldc:int(-142163585))
                stack_37E_2 = stack_35B_0 = add:byte(expr_336:byte, ldc:byte(2))
            }
            
            Label_0875:
            
            if (cmpeq:boolean(and:int(var_0_32C:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0835)
            }
            
            var_0_1F0 = and:int(var_0_32C:int, ldc:int(1864255270))
            storeelement:byte(var_3_1E2:byte[], var_5_1E3:int, stack_37E_2:byte)
            
            if (cmpne:boolean(var_5_1E3:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9D_0 = stack_9B_0 = stack_DF_0 = stack_E1_0 = stack_111_0 = stack_113_0 = stack_143_0 = stack_145_0 = stack_17C_0 = stack_211_0 = stack_24C_0 = stack_2C2_0 = stack_336_0 = stack_3B3_0 = var_3_1E2:byte[]
            goto(Label_0280)
        }
        
        var_0_1F0 = and:int(var_0_1F0:int, ldc:int(860203865))
        goto(Label_0659)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_1F0:int, ldc:int(512)), ldc:int(0))) {
            goto(Label_0330)
        }
        
        if (cmpeq:boolean(and:int(var_0_1F0:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_1F0 = and:int(var_0_1F0:int, ldc:int(-830232300))
            goto(Label_0280)
        }
        
        if (cmpeq:boolean(and:int(var_0_1F0:int, ldc:int(32)), ldc:int(0))) {
            goto(Label_0230)
        }
        
        if (cmpeq:boolean(and:int(var_0_1F0:int, ldc:int(4096)), ldc:int(0))) {
            var_0_1F0 = and:int(var_0_1F0:int, ldc:int(1985891693))
            var_2_9B = stack_9B_0:byte[]
            expr_9F = add:int(arraylength:int(stack_9D_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_9F:int, ldc:int(0))) {
                var_3_23A = newarray:byte[](byte.class, expr_9F:int)
                var_5_23B = expr_9F:int
                
                loop {
                    var_0_1F0 = and:int(var_0_1F0:int, ldc:int(-346075977))
                    var_5_23B = add:int(var_5_23B:int, ldc:int(-1))
                    storeelement:byte(var_3_23A:byte[], var_5_23B:int, add:int(shl:int(loadelement:byte(stack_24C_0:byte[], var_5_23B:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_9B:byte[], add:int(var_5_23B:int, xor:int(ldc:int(8290), ldc:int(8291)))), ldc:int(7)), and:int(ldc:int(16531), ldc:int(581)))))
                    
                    if (cmpne:boolean(var_5_23B:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9D_0 = stack_9B_0 = stack_DF_0 = stack_E1_0 = stack_111_0 = stack_113_0 = stack_143_0 = stack_145_0 = stack_17C_0 = stack_211_0 = stack_24C_0 = stack_2C2_0 = stack_336_0 = stack_3B3_0 = var_3_23A:byte[]
            }
        }
        
        Label_0164:
        
        if (cmpeq:boolean(and:int(var_0_1F0:int, ldc:int(16384)), ldc:int(0))) {
            goto(Label_0330)
        }
        
        if (cmpeq:boolean(and:int(var_0_1F0:int, ldc:int(16384)), ldc:int(0))) {
            var_0_1F0 = and:int(var_0_1F0:int, ldc:int(1824893434))
            goto(Label_0280)
        }
        
        if (cmpne:boolean(and:int(var_0_1F0:int, ldc:int(512)), ldc:int(0))) {
            var_0_1F0 = and:int(var_0_1F0:int, ldc:int(-1685813369))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_1F0:int, ldc:int(262144)), ldc:int(0))) {
                var_0_1F0 = and:int(var_0_1F0:int, ldc:int(636950830))
                goto(Label_0112)
            }
            
            var_0_1F0 = and:int(var_0_1F0:int, ldc:int(2059726126))
            expr_E1 = arraylength:int(stack_E1_0:byte[])
            
            if (cmpne:boolean(expr_E1:int, ldc:int(0))) {
                var_4_1DD = expr_E1:int
                var_3_1E2 = newarray:byte[](byte.class, expr_E1:int)
                var_5_1E3 = expr_E1:int
                goto(Label_0659)
            }
        }
        
        Label_0230:
        
        if (cmpne:boolean(and:int(var_0_1F0:int, ldc:int(4096)), ldc:int(0))) {
            goto(Label_0330)
        }
        
        if (cmpeq:boolean(and:int(var_0_1F0:int, ldc:int(4096)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_1F0:int, ldc:int(128)), ldc:int(0))) {
                var_0_1F0 = and:int(var_0_1F0:int, ldc:int(1157721404))
                goto(Label_0164)
            }
            
            if (cmpne:boolean(and:int(var_0_1F0:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_1F0 = and:int(var_0_1F0:int, ldc:int(-1489570379))
            expr_113 = arraylength:int(stack_113_0:byte[])
            
            if (cmpne:boolean(expr_113:int, ldc:int(0))) {
                var_4_1DD = expr_113:int
                var_3_1E2 = newarray:byte[](byte.class, expr_113:int)
                var_5_1E3 = expr_113:int
                goto(Label_0775)
            }
        }
        
        Label_0280:
        
        if (cmpeq:boolean(and:int(var_0_1F0:int, ldc:int(128)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_1F0:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_0230)
            }
            
            if (cmpeq:boolean(and:int(var_0_1F0:int, ldc:int(4)), ldc:int(0))) {
                var_0_1F0 = and:int(var_0_1F0:int, ldc:int(114960293))
                goto(Label_0164)
            }
            
            if (cmpne:boolean(and:int(var_0_1F0:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_1F0 = and:int(var_0_1F0:int, ldc:int(1664536295))
            expr_145 = arraylength:int(stack_145_0:byte[])
            
            if (cmpne:boolean(expr_145:int, ldc:int(0))) {
                var_3_3A1 = newarray:byte[](byte.class, expr_145:int)
                var_5_3A2 = expr_145:int
                
                loop {
                    var_0_1F0 = and:int(var_0_1F0:int, ldc:int(-481961802))
                    var_5_3A2 = add:int(var_5_3A2:int, ldc:int(-1))
                    storeelement:byte(var_3_3A1:byte[], var_5_3A2:int, add:byte(loadelement:byte(stack_3B3_0:byte[], var_5_3A2:int), ldc:byte(4)))
                    
                    if (cmpne:boolean(var_5_3A2:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9D_0 = stack_9B_0 = stack_DF_0 = stack_E1_0 = stack_111_0 = stack_113_0 = stack_143_0 = stack_145_0 = stack_17C_0 = stack_211_0 = stack_24C_0 = stack_2C2_0 = stack_336_0 = stack_3B3_0 = var_3_3A1:byte[]
            }
        }
        
        Label_0330:
        
        if (cmpeq:boolean(and:int(var_0_1F0:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_1F0 = and:int(var_0_1F0:int, ldc:int(65233729))
            goto(Label_0280)
        }
        
        if (cmpeq:boolean(and:int(var_0_1F0:int, ldc:int(16384)), ldc:int(0))) {
            var_0_1F0 = and:int(var_0_1F0:int, ldc:int(-251989040))
            goto(Label_0230)
        }
        
        if (cmpeq:boolean(and:int(var_0_1F0:int, ldc:int(32)), ldc:int(0))) {
            goto(Label_0164)
        }
        
        if (cmpne:boolean(and:int(var_0_1F0:int, ldc:int(33554432)), ldc:int(0))) {
            var_3_188 = initobject:String(String::<init>, stack_17C_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1D6_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(18561), ldc:int(18563)))
            expr_19A = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(2601), ldc:int(2603)))
            storeelement:String(expr_19A:String[], and:int(ldc:int(-25635), ldc:int(25634)), invokevirtual:String[expected:String](String::substring, var_3_188:String, and:int(ldc:int(-18173), ldc:int(728)), and:int(ldc:int(4614), ldc:int(14))))
            storeelement:String(expr_19A:String[], and:int(ldc:int(18697), ldc:int(1091)), invokevirtual:String[expected:String](String::substring, var_3_188:String, and:int(ldc:int(22), ldc:int(30982)), xor:int(ldc:int(16495), ldc:int(16454))))
            putstatic:String[](\u4e72\u4c2b\u5d20\u8350\u6b0d::\u92ff\u3504\u446c\ua068\u960f, expr_19A:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \ub19c\u51b2\ud12e\u0b8e\ua6bd(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_63F : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BE : double
        var_3_D0 : int
        var_11_E1 : int
        var_14_10B : double
        var_16_10F : int
        var_12_107 : double
        var_17_64A : int
        
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
        var_3_63F = and:int(ldc:int(1342823866), ldc:int(586004474))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4e72\u4c2b\u5d20\u8350\u6b0d[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(131072)), ldc:int(0))) {
            var_3_63F = and:int(var_3_63F:int, ldc:int(-968188445))
            var_5_81 = and:int(ldc:int(15872), ldc:int(-15901))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-30351), ldc:int(22158)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BE = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D0 = and:int(var_3_63F:int, ldc:int(1734013375))
                    var_9_BE = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E1 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E1:int, sub:int(var_6_88:int, and:int(ldc:int(69), ldc:int(23593)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E1:int, xor:int(ldc:int(18), ldc:int(19)))), var_7_97:double))) {
                        inc:int(var_11_E1, ldc:int(1))
                    }
                    
                    var_3_63F = and:int(var_3_D0:int, ldc:int(-2007326789))
                    var_14_10B = var_7_97:double
                    var_16_10F = var_11_E1:int
                }
                else {
                    var_11_E1 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(16481), ldc:int(16480)))
                    var_12_107 = var_14_10B = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_10F = var_11_E1:int, var_6_88:int)) {
                        var_9_BE = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E1:int)
                        var_16_10F = var_11_E1:int
                        var_14_10B = var_12_107:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1483)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1332)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1174)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1058)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-2111014741))
                        goto(Label_0898)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0771)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(32)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-885556001))
                        goto(Label_0654)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0536)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1870023584))
                    }
                    else {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1812097113))
                        
                        if (cmplt:boolean(var_16_10F:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0536)
                            }
                            
                            goto(Label_0771)
                        }
                    }
                    
                    Label_0385:
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1483)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1332)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1174)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(2116020881))
                        goto(Label_1058)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0898)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1152708202))
                        goto(Label_0771)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0654)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(64)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-548282007))
                            loopcontinue()
                        }
                        
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-2000028761))
                        var_11_E1 = and:int(ldc:int(6674), ldc:int(-6675))
                        goto(Label_1472)
                    }
                    
                    Label_0536:
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1058566068))
                        goto(Label_1483)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1332)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1658948118))
                        goto(Label_1174)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1656980301))
                        goto(Label_1058)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0898)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0771)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0385)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-633384144))
                            loopcontinue()
                        }
                        
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-2117152322))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10B = var_9_BE:double
                            goto(Label_0771)
                        }
                    }
                    
                    Label_0654:
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1483)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-84323210))
                        goto(Label_1332)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1174)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1761653505))
                        goto(Label_1058)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-958125052))
                        goto(Label_0898)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0536)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0385)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1469318165))
                        var_14_10B = mul:double(ldc:double(0.5), add:double(var_9_BE:double, var_14_10B:double))
                    }
                    
                    Label_0771:
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1483)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(64)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(6525593))
                        goto(Label_1332)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(64)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1305063248))
                        goto(Label_1174)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-187319056))
                        goto(Label_1058)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1928433108))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-1656009521))
                            goto(Label_0654)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0536)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0385)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63F = and:int(var_3_63F:int, ldc:int(316601838))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E1 = and:int(ldc:int(6961), ldc:int(1095))
                                goto(Label_1058)
                            }
                        }
                    }
                    
                    Label_0898:
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(134892592))
                        goto(Label_1483)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1332)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1174)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(1)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(929992705))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(128)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(2027524307))
                            goto(Label_0771)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0654)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(64)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(662969743))
                            goto(Label_0536)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0385)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-346567097))
                            loopcontinue()
                        }
                        
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1136746573))
                        var_11_E1 = and:int(ldc:int(-11662), ldc:int(9349))
                    }
                    
                    Label_1058:
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1483)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-826337420))
                        goto(Label_1332)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(800229262))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0898)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0771)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0654)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(32)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(1101874342))
                            goto(Label_0536)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(1119766715))
                            goto(Label_0385)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1111705170))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                                goto(Label_1332)
                            }
                        }
                    }
                    
                    Label_1174:
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1483)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(323966052))
                            goto(Label_1058)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(1598138129))
                            goto(Label_0898)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-159527014))
                            goto(Label_0771)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(1)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(328226092))
                            goto(Label_0654)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-547572011))
                            goto(Label_0536)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(256)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-2086274709))
                            goto(Label_0385)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-1339674884))
                            loopcontinue()
                        }
                        
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1342317149))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10B:double, var_5_81:int, var_16_10F:int)
                        goto(Label_1472)
                    }
                    
                    Label_1332:
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1196968964))
                        goto(Label_1483)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1174)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1938581582))
                        goto(Label_1058)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1228263068))
                        goto(Label_0898)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0771)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(256)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1947975218))
                        goto(Label_0654)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0536)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0385)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(297407737))
                        loopcontinue()
                    }
                    
                    var_3_63F = and:int(var_3_63F:int, ldc:int(-986973269))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10B:double, ldc:double(0.0))
                    Label_1472:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_64A = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1483:
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1332)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(382708649))
                        goto(Label_1174)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1058)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0898)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1452398413))
                        goto(Label_0771)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(64)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1014295809))
                        goto(Label_0654)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0536)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1297635438))
                        goto(Label_0385)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(2053021603))
                        var_17_64A = add:int(var_16_10F:int, and:int(ldc:int(1221), ldc:int(2561)))
                        looporswitchbreak()
                    }
                    
                    var_3_63F = and:int(var_3_63F:int, ldc:int(432745376))
                }
                
                var_3_63F = and:int(var_3_63F:int, ldc:int(1790942139))
                
                if (cmple:boolean(var_5_81 = var_17_64A:int, sub:int(var_6_88:int, xor:int(ldc:int(13313), ldc:int(13312))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(2147483647)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
