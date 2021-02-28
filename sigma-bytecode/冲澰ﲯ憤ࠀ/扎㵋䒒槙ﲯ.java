public abstract class \u51b2\u6fb0\ufcaf\u61a4\u0800.\u624e\u3d4b\u4492\u69d9\ufcaf {
    public void \u624e\u3d4b\u4492\u69d9\ufcaf(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u4f4a\uafe7\u76bc\u392e\ub8be p0) {
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
        invokespecial:\uc87f\ub70c\uc87f\ubb2b\u0c95(\uc87f\ub70c\uc87f\ubb2b\u0c95::<init>, this:\u624e\u3d4b\u4492\u69d9\ufcaf)
        putfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u624e\u3d4b\u4492\u69d9\ufcaf::\u12cb\u98a4\uc4d2\u59ec\u74b1\ub7dc, this:\u624e\u3d4b\u4492\u69d9\ufcaf, getstatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u92ee\u56bd\u7ce1\ua6bd\u8709\u946b))
        putfield:\u4f4a\uafe7\u76bc\u392e\ub8be(\u624e\u3d4b\u4492\u69d9\ufcaf::\u516c\u836c\u8df4\ub1b9\u965f\u3504, this:\u624e\u3d4b\u4492\u69d9\ufcaf, p0:\u4f4a\uafe7\u76bc\u392e\ub8be)
        
        if (invokestatic:boolean(\u4bc8\u3504\u6c56\u0800\uc910\ud12e::\u8350\u4975\u3bc9\u3e75\u7bad\u16f6, p0:\u4f4a\uafe7\u76bc\u392e\ub8be)) {
            return:void()
        }
        
        athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, ldc:String("Unsupported mob type for DoorInteractGoal")))
    }
    
    public boolean \u873d\u5db4\u97b7\u8cae\u7ce1\ua3b4() {
        var_3_7A : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        
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
        
        if (logicalnot:boolean(getfield:boolean(\u624e\u3d4b\u4492\u69d9\ufcaf::\u3e75\uc84e\u718f\u4ab3\u8640\u71f1, this:\u624e\u3d4b\u4492\u69d9\ufcaf))) {
            return:boolean(and:int[expected:boolean](ldc:int(-11599), ldc:int(11598)))
        }
        
        var_3_7A = invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\u4f4a\uafe7\u76bc\u392e\ub8be::\u12cb\ubf56\u647c\u7330\u446c\u836c, getfield:\u4f4a\uafe7\u76bc\u392e\ub8be(\u624e\u3d4b\u4492\u69d9\ufcaf::\u516c\u836c\u8df4\ub1b9\u965f\u3504, this:\u624e\u3d4b\u4492\u69d9\ufcaf)), getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u624e\u3d4b\u4492\u69d9\ufcaf::\u12cb\u98a4\uc4d2\u59ec\u74b1\ub7dc, this:\u624e\u3d4b\u4492\u69d9\ufcaf))
        
        if (instanceof:boolean(\u392e\ud7e8\u3bc9\u88c5\ud51e.\u8413\u8709\ub83f\u9a18\u1187\u960f.class, invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, var_3_7A:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e]))) {
            return:boolean(invokevirtual:boolean(Boolean::booleanValue, checkcast:Boolean(java.lang.Boolean.class, invokevirtual:Boolean(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, var_3_7A:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Boolean>](\u8413\u8709\ub83f\u9a18\u1187\u960f::\u760c\u56bd\u9033\ub113\u8709\u8258)))))
        }
        
        putfield:boolean(\u624e\u3d4b\u4492\u69d9\ufcaf::\u3e75\uc84e\u718f\u4ab3\u8640\u71f1, this:\u624e\u3d4b\u4492\u69d9\ufcaf, and:int[expected:boolean](ldc:int(-4521), ldc:int(4520)))
        return:boolean(and:int[expected:boolean](ldc:int(6667), ldc:int(-6684)))
    }
    
    public void \u56bd\u494c\u4f4a\u4e72\u120d\ub70c(boolean p0) {
        var_4_7F : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        
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
            
            if (getfield:boolean(\u624e\u3d4b\u4492\u69d9\ufcaf::\u3e75\uc84e\u718f\u4ab3\u8640\u71f1, this:\u624e\u3d4b\u4492\u69d9\ufcaf)) {
                var_4_7F = invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\u4f4a\uafe7\u76bc\u392e\ub8be::\u12cb\ubf56\u647c\u7330\u446c\u836c, getfield:\u4f4a\uafe7\u76bc\u392e\ub8be(\u624e\u3d4b\u4492\u69d9\ufcaf::\u516c\u836c\u8df4\ub1b9\u965f\u3504, this:\u624e\u3d4b\u4492\u69d9\ufcaf)), getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u624e\u3d4b\u4492\u69d9\ufcaf::\u12cb\u98a4\uc4d2\u59ec\u74b1\ub7dc, this:\u624e\u3d4b\u4492\u69d9\ufcaf))
                
                if (instanceof:boolean(\u392e\ud7e8\u3bc9\u88c5\ud51e.\u8413\u8709\ub83f\u9a18\u1187\u960f.class, invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, var_4_7F:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e]))) {
                    invokevirtual:void(\u8413\u8709\ub83f\u9a18\u1187\u960f::\u6b0d\u4daf\u4975\u6c52\u5f50\u4bc8, checkcast:\u8413\u8709\ub83f\u9a18\u1187\u960f(\u392e\ud7e8\u3bc9\u88c5\ud51e.\u8413\u8709\ub83f\u9a18\u1187\u960f.class, invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, var_4_7F:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e])), getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\u4f4a\uafe7\u76bc\u392e\ub8be::\u12cb\ubf56\u647c\u7330\u446c\u836c, getfield:\u4f4a\uafe7\u76bc\u392e\ub8be(\u624e\u3d4b\u4492\u69d9\ufcaf::\u516c\u836c\u8df4\ub1b9\u965f\u3504, this:\u624e\u3d4b\u4492\u69d9\ufcaf)), var_4_7F:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u624e\u3d4b\u4492\u69d9\ufcaf::\u12cb\u98a4\uc4d2\u59ec\u74b1\ub7dc, this:\u624e\u3d4b\u4492\u69d9\ufcaf), p0:boolean)
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u62da\u0b8e\u5f50\u718f\u7ce1\ud523() {
        var_1_75 : int
        var_1_93 : int
        var_3_9E : \uc31c\u64f2\u7ce1\uc910\u92ff\u64ab
        var_4_A3 : \u6c52\u647c\u3a62\u7af6\u62da\u8bb0
        var_5_FD : int
        var_6_164 : \u6b5f\u4daf\uafe7\u93a2\u718f\uc84e
        
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
        var_1_75 = and:int(ldc:int(1839440711), ldc:int(-274293254))
        
        if (logicalnot:boolean(invokestatic:boolean(\u4bc8\u3504\u6c56\u0800\uc910\ud12e::\u8350\u4975\u3bc9\u3e75\u7bad\u16f6, getfield:\u4f4a\uafe7\u76bc\u392e\ub8be(\u624e\u3d4b\u4492\u69d9\ufcaf::\u516c\u836c\u8df4\ub1b9\u965f\u3504, this:\u624e\u3d4b\u4492\u69d9\ufcaf)))) {
            return:boolean(and:int[expected:boolean](ldc:int(20064), ldc:int(-24421)))
        }
        
        loop {
            if (cmpeq:boolean(and:int(var_1_75:int, ldc:int(4194304)), ldc:int(0))) {
                var_1_75 = and:int(var_1_75:int, ldc:int(-279264294))
                
                if (logicalnot:boolean(getfield:boolean(\u4f4a\uafe7\u76bc\u392e\ub8be::\u3dd3\u156b\uc87f\u4bc8\ub83f\u7043, getfield:\u4f4a\uafe7\u76bc\u392e\ub8be(\u624e\u3d4b\u4492\u69d9\ufcaf::\u516c\u836c\u8df4\ub1b9\u965f\u3504, this:\u624e\u3d4b\u4492\u69d9\ufcaf)))) {
                    return:boolean(and:int[expected:boolean](ldc:int(28777), ldc:int(-31084)))
                }
            }
            
            if (cmpeq:boolean(and:int(var_1_75:int, ldc:int(1048576)), ldc:int(0))) {
                var_1_93 = and:int(var_1_75:int, ldc:int(-396150813))
                var_3_9E = checkcast:\uc31c\u64f2\u7ce1\uc910\u92ff\u64ab(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\uc31c\u64f2\u7ce1\uc910\u92ff\u64ab.class, invokevirtual:\uae5d\u9033\u8c8a\u5db4\u0800\u9af2[expected:\uc31c\u64f2\u7ce1\uc910\u92ff\u64ab](\u4f4a\uafe7\u76bc\u392e\ub8be::\u51fa\ub171\ua3b4\u7873\u16f6\u3504, getfield:\u4f4a\uafe7\u76bc\u392e\ub8be(\u624e\u3d4b\u4492\u69d9\ufcaf::\u516c\u836c\u8df4\ub1b9\u965f\u3504, this:\u624e\u3d4b\u4492\u69d9\ufcaf)))
                var_4_A3 = invokevirtual:\u6c52\u647c\u3a62\u7af6\u62da\u8bb0(\uae5d\u9033\u8c8a\u5db4\u0800\u9af2::\u9255\u7873\u156b\u59ec\u12cb\u392e, var_3_9E:\uc31c\u64f2\u7ce1\uc910\u92ff\u64ab[expected:\uae5d\u9033\u8c8a\u5db4\u0800\u9af2])
                
                if (cmpne:boolean(var_4_A3:\u6c52\u647c\u3a62\u7af6\u62da\u8bb0, aconstnull:\u6c52\u647c\u3a62\u7af6\u62da\u8bb0())) {
                    if (logicalnot:boolean(invokevirtual:boolean(\u6c52\u647c\u3a62\u7af6\u62da\u8bb0::\uf9c5\u8aa5\u97b7\u64f2\ucb79\u3bd6, var_4_A3:\u6c52\u647c\u3a62\u7af6\u62da\u8bb0))) {
                        if (invokevirtual:boolean(\uc31c\u64f2\u7ce1\uc910\u92ff\u64ab::\ubded\u8753\u3c25\u92ff\u3d4b\u4975, var_3_9E:\uc31c\u64f2\u7ce1\uc910\u92ff\u64ab)) {
                            var_5_FD = and:int(ldc:int(8287), ldc:int(-8288))
                            
                            loop {
                                if (cmpeq:boolean(and:int(var_1_93:int, ldc:int(1048576)), ldc:int(0))) {
                                    var_1_93 = and:int(var_1_93:int, ldc:int(2032358858))
                                    
                                    if (cmplt:boolean(var_5_FD:int, invokestatic:int(Math::min, add:int(invokevirtual:int(\u6c52\u647c\u3a62\u7af6\u62da\u8bb0::\u71f1\u5fe1\uae87\u59ec\u839e\u76bc, var_4_A3:\u6c52\u647c\u3a62\u7af6\u62da\u8bb0), xor:int(ldc:int(16640), ldc:int(16642))), invokevirtual:int(\u6c52\u647c\u3a62\u7af6\u62da\u8bb0::\u88c5\ud51e\u40a9\u76bc\u873d\u34df, var_4_A3:\u6c52\u647c\u3a62\u7af6\u62da\u8bb0)))) {
                                        var_6_164 = invokevirtual:\u6b5f\u4daf\uafe7\u93a2\u718f\uc84e(\u6c52\u647c\u3a62\u7af6\u62da\u8bb0::\u34df\u3bd6\ubf56\u88c5\u760c\u6198, var_4_A3:\u6c52\u647c\u3a62\u7af6\u62da\u8bb0, var_5_FD:int)
                                        putfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u624e\u3d4b\u4492\u69d9\ufcaf::\u12cb\u98a4\uc4d2\u59ec\u74b1\ub7dc, this:\u624e\u3d4b\u4492\u69d9\ufcaf, initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, getfield:int(\u6b5f\u4daf\uafe7\u93a2\u718f\uc84e::\ub70c\uff55\ube23\u67e9\u6d69\uf94d, var_6_164:\u6b5f\u4daf\uafe7\u93a2\u718f\uc84e), add:int(getfield:int(\u6b5f\u4daf\uafe7\u93a2\u718f\uc84e::\u7af6\u9af2\u92ff\ubb2b\u839e\u8389, var_6_164:\u6b5f\u4daf\uafe7\u93a2\u718f\uc84e), and:int(ldc:int(24607), ldc:int(161))), getfield:int(\u6b5f\u4daf\uafe7\u93a2\u718f\uc84e::\ud4fe\ua3b4\u9af2\u1833\uafe7\u6fb0, var_6_164:\u6b5f\u4daf\uafe7\u93a2\u718f\uc84e)))
                                        
                                        if (logicaland:boolean(cmple:boolean(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\u3e2a\ua3b4\u4975\u4179\u64f2\u6c52, getfield:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u624e\u3d4b\u4492\u69d9\ufcaf::\u516c\u836c\u8df4\ub1b9\u965f\u3504, this:\u624e\u3d4b\u4492\u69d9\ufcaf), i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u624e\u3d4b\u4492\u69d9\ufcaf::\u12cb\u98a4\uc4d2\u59ec\u74b1\ub7dc, this:\u624e\u3d4b\u4492\u69d9\ufcaf))), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, getfield:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u624e\u3d4b\u4492\u69d9\ufcaf::\u516c\u836c\u8df4\ub1b9\u965f\u3504, this:\u624e\u3d4b\u4492\u69d9\ufcaf)), i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u624e\u3d4b\u4492\u69d9\ufcaf::\u12cb\u98a4\uc4d2\u59ec\u74b1\ub7dc, this:\u624e\u3d4b\u4492\u69d9\ufcaf)))), ldc:double(2.25)), putfield:boolean(\u624e\u3d4b\u4492\u69d9\ufcaf::\u3e75\uc84e\u718f\u4ab3\u8640\u71f1, this:\u624e\u3d4b\u4492\u69d9\ufcaf, invokestatic:boolean(\u8413\u8709\ub83f\u9a18\u1187\u960f::\u8640\u67d0\u36d3\u74b1\u34df\uff55, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\u4f4a\uafe7\u76bc\u392e\ub8be::\u12cb\ubf56\u647c\u7330\u446c\u836c, getfield:\u4f4a\uafe7\u76bc\u392e\ub8be(\u624e\u3d4b\u4492\u69d9\ufcaf::\u516c\u836c\u8df4\ub1b9\u965f\u3504, this:\u624e\u3d4b\u4492\u69d9\ufcaf)), getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u624e\u3d4b\u4492\u69d9\ufcaf::\u12cb\u98a4\uc4d2\u59ec\u74b1\ub7dc, this:\u624e\u3d4b\u4492\u69d9\ufcaf))))) {
                                            return:boolean(xor:int[expected:boolean](ldc:int(-16384), ldc:int(-16383)))
                                        }
                                        
                                        var_1_93 = and:int(var_1_93:int, ldc:int(1874276295))
                                        inc:int(var_5_FD, ldc:int(1))
                                        loopcontinue()
                                    }
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_93:int, ldc:int(1048576)), ldc:int(0))) {
                                    putfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u624e\u3d4b\u4492\u69d9\ufcaf::\u12cb\u98a4\uc4d2\u59ec\u74b1\ub7dc, this:\u624e\u3d4b\u4492\u69d9\ufcaf, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u5db4\uc2bd\u624e\u6198\ub83f\u62da, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u7d52\u718f\u3776\u6fb0\ub83f::\u6c52\uc7fe\u600f\u72f1\u8640\u1833, getfield:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u624e\u3d4b\u4492\u69d9\ufcaf::\u516c\u836c\u8df4\ub1b9\u965f\u3504, this:\u624e\u3d4b\u4492\u69d9\ufcaf))))
                                    return:boolean(putfield:boolean(\u624e\u3d4b\u4492\u69d9\ufcaf::\u3e75\uc84e\u718f\u4ab3\u8640\u71f1, this:\u624e\u3d4b\u4492\u69d9\ufcaf, invokestatic:boolean(\u8413\u8709\ub83f\u9a18\u1187\u960f::\u8640\u67d0\u36d3\u74b1\u34df\uff55, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\u4f4a\uafe7\u76bc\u392e\ub8be::\u12cb\ubf56\u647c\u7330\u446c\u836c, getfield:\u4f4a\uafe7\u76bc\u392e\ub8be(\u624e\u3d4b\u4492\u69d9\ufcaf::\u516c\u836c\u8df4\ub1b9\u965f\u3504, this:\u624e\u3d4b\u4492\u69d9\ufcaf)), getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u624e\u3d4b\u4492\u69d9\ufcaf::\u12cb\u98a4\uc4d2\u59ec\u74b1\ub7dc, this:\u624e\u3d4b\u4492\u69d9\ufcaf))))
                                }
                            }
                        }
                    }
                }
                
                return:boolean(and:int[expected:boolean](ldc:int(-29707), ldc:int(29706)))
            }
            
            var_1_75 = and:int(var_1_75:int, ldc:int(1157738257))
        }
    }
    
    public boolean \u3d4b\u0b8e\u61a4\u12b2\uff55\u965f() {
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
            var_1_5F = and:int(ldc:int(-1948225442), ldc:int(1677622252))
            
            if (getfield:boolean(\u624e\u3d4b\u4492\u69d9\ufcaf::\u7043\ubff1\u8640\ub70c\u3d4b\u494c, this:\u624e\u3d4b\u4492\u69d9\ufcaf)) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-336252563))
                stack_86_0 = and:int(ldc:int(31848), ldc:int(-31851))
            }
            else {
                stack_86_0 = xor:int(ldc:int(4512), ldc:int(4513))
            }
            
            return:boolean(stack_86_0:int)
        }
        
        goto(Label_0006)
    }
    
    public void \ub7dc\u4c2b\ud523\ube23\u416d\u3776() {
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
            putfield:boolean(\u624e\u3d4b\u4492\u69d9\ufcaf::\u7043\ubff1\u8640\ub70c\u3d4b\u494c, this:\u624e\u3d4b\u4492\u69d9\ufcaf, and:int[expected:boolean](ldc:int(-9021), ldc:int(820)))
            putfield:float(\u624e\u3d4b\u4492\u69d9\ufcaf::\u4492\ubefe\u960f\u6d69\ub19c\u34df, this:\u624e\u3d4b\u4492\u69d9\ufcaf, d2f:float(sub:double(add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u624e\u3d4b\u4492\u69d9\ufcaf::\u12cb\u98a4\uc4d2\u59ec\u74b1\ub7dc, this:\u624e\u3d4b\u4492\u69d9\ufcaf))), ldc:double(0.5)), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, getfield:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u624e\u3d4b\u4492\u69d9\ufcaf::\u516c\u836c\u8df4\ub1b9\u965f\u3504, this:\u624e\u3d4b\u4492\u69d9\ufcaf)))))
            putfield:float(\u624e\u3d4b\u4492\u69d9\ufcaf::\u76bc\u8df4\ua61f\u759a\ua562\u9a18, this:\u624e\u3d4b\u4492\u69d9\ufcaf, d2f:float(sub:double(add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u624e\u3d4b\u4492\u69d9\ufcaf::\u12cb\u98a4\uc4d2\u59ec\u74b1\ub7dc, this:\u624e\u3d4b\u4492\u69d9\ufcaf))), ldc:double(0.5)), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, getfield:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u624e\u3d4b\u4492\u69d9\ufcaf::\u516c\u836c\u8df4\ub1b9\u965f\u3504, this:\u624e\u3d4b\u4492\u69d9\ufcaf)))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4c04\u74b1\u0800\u3a62\uafe7\u718f() {
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
            
            if (cmplt:boolean(add:float(mul:float(getfield:float(\u624e\u3d4b\u4492\u69d9\ufcaf::\u4492\ubefe\u960f\u6d69\ub19c\u34df, this:\u624e\u3d4b\u4492\u69d9\ufcaf), d2f:float(sub:double(add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u624e\u3d4b\u4492\u69d9\ufcaf::\u12cb\u98a4\uc4d2\u59ec\u74b1\ub7dc, this:\u624e\u3d4b\u4492\u69d9\ufcaf))), ldc:double(0.5)), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, getfield:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u624e\u3d4b\u4492\u69d9\ufcaf::\u516c\u836c\u8df4\ub1b9\u965f\u3504, this:\u624e\u3d4b\u4492\u69d9\ufcaf))))), mul:float(getfield:float(\u624e\u3d4b\u4492\u69d9\ufcaf::\u76bc\u8df4\ua61f\u759a\ua562\u9a18, this:\u624e\u3d4b\u4492\u69d9\ufcaf), d2f:float(sub:double(add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u624e\u3d4b\u4492\u69d9\ufcaf::\u12cb\u98a4\uc4d2\u59ec\u74b1\ub7dc, this:\u624e\u3d4b\u4492\u69d9\ufcaf))), ldc:double(0.5)), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, getfield:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u624e\u3d4b\u4492\u69d9\ufcaf::\u516c\u836c\u8df4\ub1b9\u965f\u3504, this:\u624e\u3d4b\u4492\u69d9\ufcaf)))))), ldc:float(0.0f))) {
                putfield:boolean(\u624e\u3d4b\u4492\u69d9\ufcaf::\u7043\ubff1\u8640\ub70c\u3d4b\u494c, this:\u624e\u3d4b\u4492\u69d9\ufcaf, and:int[expected:boolean](ldc:int(6575), ldc:int(1025)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ub8be\u4c2b\u071d\ub70c\ubded\u6d99(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_69A : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C3 : double
        var_3_D5 : int
        var_11_E6 : int
        var_14_110 : double
        var_16_114 : int
        var_12_10C : double
        var_17_6A5 : int
        
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
        var_3_69A = and:int(ldc:int(-498420358), ldc:int(1806346365))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u624e\u3d4b\u4492\u69d9\ufcaf[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_69A = and:int(var_3_69A:int, ldc:int(2112534616))
            var_5_7D = and:int(ldc:int(14601), ldc:int(-15626))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(12372), ldc:int(-29813)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C3 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D5 = and:int(var_3_69A:int, ldc:int(-49897127))
                    var_9_C3 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E6 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E6:int, sub:int(var_6_84:int, xor:int(ldc:int(720), ldc:int(721)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E6:int, and:int(ldc:int(16945), ldc:int(15565)))), var_7_93:double))) {
                        inc:int(var_11_E6, ldc:int(1))
                    }
                    
                    var_3_69A = and:int(var_3_D5:int, ldc:int(2133500123))
                    var_14_110 = var_7_93:double
                    var_16_114 = var_11_E6:int
                }
                else {
                    var_11_E6 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(4361), ldc:int(8323)))
                    var_12_10C = var_14_110 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_114 = var_11_E6:int, var_6_84:int)) {
                        var_9_C3 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E6:int)
                        var_16_114 = var_11_E6:int
                        var_14_110 = var_12_10C:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-471924825))
                        goto(Label_1598)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1441)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-967137314))
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(830174610))
                        goto(Label_1191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-223739674))
                        goto(Label_1022)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-1835690670))
                        goto(Label_0898)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(512)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(1538864212))
                        goto(Label_0758)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0607)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-35150717))
                    }
                    else {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(1952381567))
                        
                        if (cmplt:boolean(var_16_114:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0607)
                            }
                            
                            goto(Label_0898)
                        }
                    }
                    
                    Label_0433:
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-1039382296))
                        goto(Label_1598)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-668612685))
                        goto(Label_1441)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(512)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-319902982))
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(1653574693))
                        goto(Label_1022)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0898)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0758)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-66218904))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(512)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(1722728024))
                            var_11_E6 = and:int(ldc:int(17191), ldc:int(-17192))
                            goto(Label_1587)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0607:
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(1224090700))
                        goto(Label_1598)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1441)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(890331044))
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-1391282806))
                        goto(Label_1191)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(128)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-540950813))
                        goto(Label_1022)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(2030310591))
                        goto(Label_0898)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(399937422))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0433)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(16)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(-471593219))
                            loopcontinue()
                        }
                        
                        var_3_69A = and:int(var_3_69A:int, ldc:int(1905179995))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_110 = var_9_C3:double
                            goto(Label_0898)
                        }
                    }
                    
                    Label_0758:
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-1936297725))
                        goto(Label_1598)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1441)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(64)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-833835588))
                        goto(Label_1191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1022)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(831134467))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(8)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(1951474056))
                            goto(Label_0607)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(-414596010))
                            goto(Label_0433)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-951143303))
                        var_14_110 = mul:double(ldc:double(0.5), add:double(var_9_C3:double, var_14_110:double))
                    }
                    
                    Label_0898:
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-792430782))
                        goto(Label_1598)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-899345283))
                        goto(Label_1441)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0758)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(-428928936))
                            goto(Label_0607)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(16)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(-845508196))
                            goto(Label_0433)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-155456641))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E6 = xor:int(ldc:int(6664), ldc:int(6665))
                                goto(Label_1191)
                            }
                        }
                    }
                    
                    Label_1022:
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1598)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-255048341))
                        goto(Label_1441)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(296589250))
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(46407176))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(128)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(952150522))
                            goto(Label_0898)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(-1735227452))
                            goto(Label_0758)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0607)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0433)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69A = and:int(var_3_69A:int, ldc:int(1600830812))
                        var_11_E6 = and:int(ldc:int(4021), ldc:int(-4094))
                    }
                    
                    Label_1191:
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1598)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1441)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(1097085968))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_1022)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0898)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(16)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(-149989517))
                            goto(Label_0758)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0607)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0433)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(-2031499073))
                            loopcontinue()
                        }
                        
                        var_3_69A = and:int(var_3_69A:int, ldc:int(1908080474))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E6:int, ldc:int(0))) {
                                goto(Label_1441)
                            }
                        }
                    }
                    
                    Label_1307:
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(512)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(2012297605))
                        goto(Label_1598)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(-1216427914))
                            goto(Label_1191)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_1022)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0898)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0758)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0607)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(1)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(-605587994))
                            goto(Label_0433)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(132349464))
                            loopcontinue()
                        }
                        
                        var_3_69A = and:int(var_3_69A:int, ldc:int(2111235545))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_110:double, var_5_7D:int, var_16_114:int)
                        goto(Label_1587)
                    }
                    
                    Label_1441:
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1598)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-1824969001))
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-1333040233))
                        goto(Label_1022)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(16)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(1858102041))
                        goto(Label_0898)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0758)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0607)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(646313696))
                        goto(Label_0433)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(2111176499))
                        loopcontinue()
                    }
                    
                    var_3_69A = and:int(var_3_69A:int, ldc:int(-868763559))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_110:double, ldc:double(0.0))
                    Label_1587:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6A5 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E6:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1598:
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1441)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(1777785512))
                        goto(Label_1022)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0898)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0758)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0607)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0433)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(1385424473))
                        var_17_6A5 = add:int(var_16_114:int, xor:int(ldc:int(8772), ldc:int(8773)))
                        looporswitchbreak()
                    }
                    
                    var_3_69A = and:int(var_3_69A:int, ldc:int(387862124))
                }
                
                var_3_69A = and:int(var_3_69A:int, ldc:int(1471610232))
                
                if (cmple:boolean(var_5_7D = var_17_6A5:int, sub:int(var_6_84:int, and:int(ldc:int(10883), ldc:int(4477))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_69A = and:int(var_3_69A:int, ldc:int(1267051569))
            goto(Label_0106)
        }
    }
}
