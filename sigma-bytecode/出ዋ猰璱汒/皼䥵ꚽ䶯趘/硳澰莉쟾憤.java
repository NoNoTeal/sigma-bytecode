public class \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u7873\u6fb0\u8389\uc7fe\u61a4 {
    public void \u7873\u6fb0\u8389\uc7fe\u61a4(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u36d3\u2dcc\ub113\u5654\uceb8 p0, double p1, float p2, float p3, boolean p4) {
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
        invokespecial:\uc87f\ub70c\uc87f\ubb2b\u0c95(\uc87f\ub70c\uc87f\ubb2b\u0c95::<init>, this:\u7873\u6fb0\u8389\uc7fe\u61a4)
        putfield:\u36d3\u2dcc\ub113\u5654\uceb8(\u7873\u6fb0\u8389\uc7fe\u61a4::\ua61f\u7e3f\ud51e\u3bd6\u718f\uc7fe, this:\u7873\u6fb0\u8389\uc7fe\u61a4, p0:\u36d3\u2dcc\ub113\u5654\uceb8)
        putfield:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a(\u7873\u6fb0\u8389\uc7fe\u61a4::\ub113\u2dcc\u416d\u3bc9\u446c\u0b8e, this:\u7873\u6fb0\u8389\uc7fe\u61a4, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a](\u36d3\u2dcc\ub113\u5654\uceb8::\u12cb\ubf56\u647c\u7330\u446c\u836c, p0:\u36d3\u2dcc\ub113\u5654\uceb8))
        putfield:double(\u7873\u6fb0\u8389\uc7fe\u61a4::\u7049\u7006\ua562\u759a\u416d\ubb2b, this:\u7873\u6fb0\u8389\uc7fe\u61a4, p1:double)
        putfield:\uae5d\u9033\u8c8a\u5db4\u0800\u9af2(\u7873\u6fb0\u8389\uc7fe\u61a4::\ua6bd\u183a\ufcaf\u4cd9\ubff1\u4c04, this:\u7873\u6fb0\u8389\uc7fe\u61a4, invokevirtual:\uae5d\u9033\u8c8a\u5db4\u0800\u9af2(\u4f4a\uafe7\u76bc\u392e\ub8be::\u51fa\ub171\ua3b4\u7873\u16f6\u3504, p0:\u36d3\u2dcc\ub113\u5654\uceb8[expected:\u4f4a\uafe7\u76bc\u392e\ub8be]))
        putfield:float(\u7873\u6fb0\u8389\uc7fe\u61a4::\u8413\u71f1\ud36e\ucfaf\u760c\u527a, this:\u7873\u6fb0\u8389\uc7fe\u61a4, p2:float)
        putfield:float(\u7873\u6fb0\u8389\uc7fe\u61a4::\u92ff\u873d\ub70c\u3bd6\u8df4\u0800, this:\u7873\u6fb0\u8389\uc7fe\u61a4, p3:float)
        putfield:boolean(\u7873\u6fb0\u8389\uc7fe\u61a4::\ubefe\u8308\u4975\uceb8\ub1b9\u6bb9, this:\u7873\u6fb0\u8389\uc7fe\u61a4, p4:boolean)
        invokevirtual:void(\uc87f\ub70c\uc87f\ubb2b\u0c95::\ub83f\u6b5f\u61a4\uc3e3\u6198\u7049, this:\u7873\u6fb0\u8389\uc7fe\u61a4[expected:\uc87f\ub70c\uc87f\ubb2b\u0c95], invokestatic:EnumSet<\uc7fe\u9af2\u52d3\uc87f\u92ff>(EnumSet<E>::of, getstatic:\uc7fe\u9af2\u52d3\uc87f\u92ff(\uc7fe\u9af2\u52d3\uc87f\u92ff::\u67d0\uf9c5\u4c04\u4f4a\u67d0\u7043), getstatic:\uc7fe\u9af2\u52d3\uc87f\u92ff(\uc7fe\u9af2\u52d3\uc87f\u92ff::\uc2bd\u12b2\u9937\ub102\u64f2\uc238)))
        
        if (logicalnot:boolean(logicalor:boolean(instanceof:boolean(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\uc31c\u64f2\u7ce1\uc910\u92ff\u64ab.class, invokevirtual:\uae5d\u9033\u8c8a\u5db4\u0800\u9af2(\u4f4a\uafe7\u76bc\u392e\ub8be::\u51fa\ub171\ua3b4\u7873\u16f6\u3504, p0:\u36d3\u2dcc\ub113\u5654\uceb8[expected:\u4f4a\uafe7\u76bc\u392e\ub8be])), instanceof:boolean(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u516c\u16f6\u9033\u88c5\ub18d\u6198.class, invokevirtual:\uae5d\u9033\u8c8a\u5db4\u0800\u9af2(\u4f4a\uafe7\u76bc\u392e\ub8be::\u51fa\ub171\ua3b4\u7873\u16f6\u3504, p0:\u36d3\u2dcc\ub113\u5654\uceb8[expected:\u4f4a\uafe7\u76bc\u392e\ub8be]))))) {
            athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\u7873\u6fb0\u8389\uc7fe\u61a4::\ub7dc\u3d64\u9a18\u9a18\u6cfe\u527a), and:int(ldc:int(-24501), ldc:int(1972)))))
        }
    }
    
    public boolean \u62da\u0b8e\u5f50\u718f\u7ce1\ud523() {
        var_1_5F : int
        var_3_67 : \ube23\u67d0\u64f2\u839e\u76bc
        
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
        var_1_5F = and:int(ldc:int(-1451978500), ldc:int(1064994303))
        var_3_67 = invokevirtual:\ube23\u67d0\u64f2\u839e\u76bc(\u36d3\u2dcc\ub113\u5654\uceb8::\u8308\u97e6\u59ec\ubff1\u7c6b\u12b2, getfield:\u36d3\u2dcc\ub113\u5654\uceb8(\u7873\u6fb0\u8389\uc7fe\u61a4::\ua61f\u7e3f\ud51e\u3bd6\u718f\uc7fe, this:\u7873\u6fb0\u8389\uc7fe\u61a4))
        
        if (cmpeq:boolean(var_3_67:\ube23\u67d0\u64f2\u839e\u76bc, aconstnull:\ube23\u67d0\u64f2\u839e\u76bc())) {
            return:boolean(and:int[expected:boolean](ldc:int(-16042), ldc:int(7817)))
        }
        
        loop {
            if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0163)
            }
            
            if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(16384)), ldc:int(0))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-344009730))
                
                if (invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u5db4\u3d64\u97e6\u8d98\ucb79\u3711, var_3_67:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f])) {
                    return:boolean(and:int[expected:boolean](ldc:int(14929), ldc:int(-14936)))
                }
            }
            
            Label_0134:
            
            if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(8388608)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(16777216)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_1_5F = and:int(var_1_5F:int, ldc:int(-1175017218))
                
                if (invokevirtual:boolean(\u36d3\u2dcc\ub113\u5654\uceb8::\u7043\u4f52\u76bc\u624e\u7bad\ufe34, getfield:\u36d3\u2dcc\ub113\u5654\uceb8(\u7873\u6fb0\u8389\uc7fe\u61a4::\ua61f\u7e3f\ud51e\u3bd6\u718f\uc7fe, this:\u7873\u6fb0\u8389\uc7fe\u61a4))) {
                    return:boolean(and:int[expected:boolean](ldc:int(11918), ldc:int(-28320)))
                }
            }
            
            Label_0163:
            
            if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(33554432)), ldc:int(0))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-1573381185))
                goto(Label_0134)
            }
            
            if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(16384)), ldc:int(0))) {
                loopcontinue()
            }
            
            if (cmpge:boolean(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\u3e2a\ua3b4\u4975\u4179\u64f2\u6c52, getfield:\u36d3\u2dcc\ub113\u5654\uceb8[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u7873\u6fb0\u8389\uc7fe\u61a4::\ua61f\u7e3f\ud51e\u3bd6\u718f\uc7fe, this:\u7873\u6fb0\u8389\uc7fe\u61a4), var_3_67:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), f2d:double(mul:float(getfield:float(\u7873\u6fb0\u8389\uc7fe\u61a4::\u8413\u71f1\ud36e\ucfaf\u760c\u527a, this:\u7873\u6fb0\u8389\uc7fe\u61a4), getfield:float(\u7873\u6fb0\u8389\uc7fe\u61a4::\u8413\u71f1\ud36e\ucfaf\u760c\u527a, this:\u7873\u6fb0\u8389\uc7fe\u61a4))))) {
                putfield:\ube23\u67d0\u64f2\u839e\u76bc(\u7873\u6fb0\u8389\uc7fe\u61a4::\u4e72\u071d\ud12e\ub171\u40a9\u7af6, this:\u7873\u6fb0\u8389\uc7fe\u61a4, var_3_67:\ube23\u67d0\u64f2\u839e\u76bc)
                return:boolean(and:int[expected:boolean](ldc:int(9295), ldc:int(2177)))
            }
            
            return:boolean(and:int[expected:boolean](ldc:int(27328), ldc:int(-27329)))
        }
    }
    
    public boolean \u3d4b\u0b8e\u61a4\u12b2\uff55\u965f() {
        var_1_D5 : int
        stack_10E_0 : int [generated]
        
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
        var_1_D5 = and:int(ldc:int(-813711661), ldc:int(1803382427))
        
        if (logicalnot:boolean(invokevirtual:boolean(\uae5d\u9033\u8c8a\u5db4\u0800\u9af2::\u7ce1\uc246\u5bc4\u3d4b\u760c\uc2e8, getfield:\uae5d\u9033\u8c8a\u5db4\u0800\u9af2(\u7873\u6fb0\u8389\uc7fe\u61a4::\ua6bd\u183a\ufcaf\u4cd9\ubff1\u4c04, this:\u7873\u6fb0\u8389\uc7fe\u61a4)))) {
            loop {
                if (cmpeq:boolean(and:int(var_1_D5:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_0187)
                }
                
                if (cmpne:boolean(and:int(var_1_D5:int, ldc:int(16777216)), ldc:int(0))) {
                    var_1_D5 = and:int(var_1_D5:int, ldc:int(1533906907))
                    
                    if (invokevirtual:boolean(\u36d3\u2dcc\ub113\u5654\uceb8::\u7043\u4f52\u76bc\u624e\u7bad\ufe34, getfield:\u36d3\u2dcc\ub113\u5654\uceb8(\u7873\u6fb0\u8389\uc7fe\u61a4::\ua61f\u7e3f\ud51e\u3bd6\u718f\uc7fe, this:\u7873\u6fb0\u8389\uc7fe\u61a4))) {
                        return:boolean(and:int[expected:boolean](ldc:int(-19339), ldc:int(19338)))
                    }
                }
                
                Label_0135:
                
                if (cmpne:boolean(and:int(var_1_D5:int, ldc:int(16777216)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_1_D5:int, ldc:int(33554432)), ldc:int(0))) {
                        var_1_D5 = and:int(var_1_D5:int, ldc:int(-780373383))
                        loopcontinue()
                    }
                    
                    var_1_D5 = and:int(var_1_D5:int, ldc:int(-612517473))
                    
                    if (cmpgt:boolean(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\u3e2a\ua3b4\u4975\u4179\u64f2\u6c52, getfield:\u36d3\u2dcc\ub113\u5654\uceb8[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u7873\u6fb0\u8389\uc7fe\u61a4::\ua61f\u7e3f\ud51e\u3bd6\u718f\uc7fe, this:\u7873\u6fb0\u8389\uc7fe\u61a4), getfield:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u7873\u6fb0\u8389\uc7fe\u61a4::\u4e72\u071d\ud12e\ub171\u40a9\u7af6, this:\u7873\u6fb0\u8389\uc7fe\u61a4)), f2d:double(mul:float(getfield:float(\u7873\u6fb0\u8389\uc7fe\u61a4::\u92ff\u873d\ub70c\u3bd6\u8df4\u0800, this:\u7873\u6fb0\u8389\uc7fe\u61a4), getfield:float(\u7873\u6fb0\u8389\uc7fe\u61a4::\u92ff\u873d\ub70c\u3bd6\u8df4\u0800, this:\u7873\u6fb0\u8389\uc7fe\u61a4))))) {
                        stack_10E_0 = xor:int(ldc:int(8710), ldc:int(8711))
                        looporswitchbreak()
                    }
                }
                
                Label_0187:
                
                if (cmpeq:boolean(and:int(var_1_D5:int, ldc:int(524288)), ldc:int(0))) {
                    var_1_D5 = and:int(var_1_D5:int, ldc:int(1052462428))
                    goto(Label_0135)
                }
                
                if (cmpne:boolean(and:int(var_1_D5:int, ldc:int(16777216)), ldc:int(0))) {
                    var_1_D5 = and:int(var_1_D5:int, ldc:int(1802471607))
                    stack_10E_0 = and:int(ldc:int(18848), ldc:int(-19877))
                    looporswitchbreak()
                }
            }
            
            return:boolean(stack_10E_0:int)
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(26140), ldc:int(-26175)))
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
            putfield:int(\u7873\u6fb0\u8389\uc7fe\u61a4::\u6b0d\ua6bd\u12cb\u8c8a\u836c\u16f6, this:\u7873\u6fb0\u8389\uc7fe\u61a4, and:int(ldc:int(11808), ldc:int(-28197)))
            putfield:float(\u7873\u6fb0\u8389\uc7fe\u61a4::\u5f50\u3bc9\u600f\u93a2\u6d99\u4daf, this:\u7873\u6fb0\u8389\uc7fe\u61a4, invokevirtual:float(\u4f4a\uafe7\u76bc\u392e\ub8be::\u385b\u3a62\u183a\u836c\u76bc\u64f2, getfield:\u36d3\u2dcc\ub113\u5654\uceb8[expected:\u4f4a\uafe7\u76bc\u392e\ub8be](\u7873\u6fb0\u8389\uc7fe\u61a4::\ua61f\u7e3f\ud51e\u3bd6\u718f\uc7fe, this:\u7873\u6fb0\u8389\uc7fe\u61a4), getstatic:\u8350\u7e3f\u8d98\u983f\u99f7\u61a4(\u8350\u7e3f\u8d98\u983f\u99f7\u61a4::\ua6bd\ub32d\ubefe\u92ee\u4c2b\u92ee)))
            invokevirtual:void(\u4f4a\uafe7\u76bc\u392e\ub8be::\u836c\ucef1\u34df\u4bc8\uc84e\u5bc4, getfield:\u36d3\u2dcc\ub113\u5654\uceb8[expected:\u4f4a\uafe7\u76bc\u392e\ub8be](\u7873\u6fb0\u8389\uc7fe\u61a4::\ua61f\u7e3f\ud51e\u3bd6\u718f\uc7fe, this:\u7873\u6fb0\u8389\uc7fe\u61a4), getstatic:\u8350\u7e3f\u8d98\u983f\u99f7\u61a4(\u8350\u7e3f\u8d98\u983f\u99f7\u61a4::\ua6bd\ub32d\ubefe\u92ee\u4c2b\u92ee), ldc:float(0.0f))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7bad\u74b1\uc3e3\u760c\u4f52\u6c56() {
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
            putfield:\ube23\u67d0\u64f2\u839e\u76bc(\u7873\u6fb0\u8389\uc7fe\u61a4::\u4e72\u071d\ud12e\ub171\u40a9\u7af6, this:\u7873\u6fb0\u8389\uc7fe\u61a4, aconstnull:\ube23\u67d0\u64f2\u839e\u76bc())
            invokevirtual:void(\uae5d\u9033\u8c8a\u5db4\u0800\u9af2::\ua6bd\u8c8a\u7043\u40a9\ud217\u47c2, getfield:\uae5d\u9033\u8c8a\u5db4\u0800\u9af2(\u7873\u6fb0\u8389\uc7fe\u61a4::\ua6bd\u183a\ufcaf\u4cd9\ubff1\u4c04, this:\u7873\u6fb0\u8389\uc7fe\u61a4))
            invokevirtual:void(\u4f4a\uafe7\u76bc\u392e\ub8be::\u836c\ucef1\u34df\u4bc8\uc84e\u5bc4, getfield:\u36d3\u2dcc\ub113\u5654\uceb8[expected:\u4f4a\uafe7\u76bc\u392e\ub8be](\u7873\u6fb0\u8389\uc7fe\u61a4::\ua61f\u7e3f\ud51e\u3bd6\u718f\uc7fe, this:\u7873\u6fb0\u8389\uc7fe\u61a4), getstatic:\u8350\u7e3f\u8d98\u983f\u99f7\u61a4(\u8350\u7e3f\u8d98\u983f\u99f7\u61a4::\ua6bd\ub32d\ubefe\u92ee\u4c2b\u92ee), getfield:float(\u7873\u6fb0\u8389\uc7fe\u61a4::\u5f50\u3bc9\u600f\u93a2\u6d99\u4daf, this:\u7873\u6fb0\u8389\uc7fe\u61a4))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4c04\u74b1\u0800\u3a62\uafe7\u718f() {
        var_1_5F : int
        
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
            var_1_5F = and:int(ldc:int(-1058350834), ldc:int(-1762656906))
            invokevirtual:void(\ub83f\u8753\ud217\u71f1\u6cfe::\u0800\u8cae\u6c56\ub8be\u3a62\u6435, invokevirtual:\ub83f\u8753\ud217\u71f1\u6cfe(\u4f4a\uafe7\u76bc\u392e\ub8be::\u7873\u51b2\ube23\ud158\u836c\ucfaf, getfield:\u36d3\u2dcc\ub113\u5654\uceb8[expected:\u4f4a\uafe7\u76bc\u392e\ub8be](\u7873\u6fb0\u8389\uc7fe\u61a4::\ua61f\u7e3f\ud51e\u3bd6\u718f\uc7fe, this:\u7873\u6fb0\u8389\uc7fe\u61a4)), getfield:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u7873\u6fb0\u8389\uc7fe\u61a4::\u4e72\u071d\ud12e\ub171\u40a9\u7af6, this:\u7873\u6fb0\u8389\uc7fe\u61a4), ldc:float(10.0f), i2f:float(invokevirtual:int(\u4f4a\uafe7\u76bc\u392e\ub8be::\u494c\u7ce1\u8413\u3711\ub83f\u71f1, getfield:\u36d3\u2dcc\ub113\u5654\uceb8[expected:\u4f4a\uafe7\u76bc\u392e\ub8be](\u7873\u6fb0\u8389\uc7fe\u61a4::\ua61f\u7e3f\ud51e\u3bd6\u718f\uc7fe, this:\u7873\u6fb0\u8389\uc7fe\u61a4))))
            
            if (cmple:boolean(putfield:int(\u7873\u6fb0\u8389\uc7fe\u61a4::\u6b0d\ua6bd\u12cb\u8c8a\u836c\u16f6, this:\u7873\u6fb0\u8389\uc7fe\u61a4, sub:int(getfield:int(\u7873\u6fb0\u8389\uc7fe\u61a4::\u6b0d\ua6bd\u12cb\u8c8a\u836c\u16f6, this:\u7873\u6fb0\u8389\uc7fe\u61a4), and:int(ldc:int(4137), ldc:int(16519)))), ldc:int(0))) {
                putfield:int(\u7873\u6fb0\u8389\uc7fe\u61a4::\u6b0d\ua6bd\u12cb\u8c8a\u836c\u16f6, this:\u7873\u6fb0\u8389\uc7fe\u61a4, ldc:int(10))
                
                if (logicalnot:boolean(invokevirtual:boolean(\u4f4a\uafe7\u76bc\u392e\ub8be::\uf94d\u36d3\u6c52\ub8be\ub32d\u67d0, getfield:\u36d3\u2dcc\ub113\u5654\uceb8[expected:\u4f4a\uafe7\u76bc\u392e\ub8be](\u7873\u6fb0\u8389\uc7fe\u61a4::\ua61f\u7e3f\ud51e\u3bd6\u718f\uc7fe, this:\u7873\u6fb0\u8389\uc7fe\u61a4)))) {
                    if (logicalnot:boolean(invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u72f1\u8753\u8bb0\ub102\ua3b4\u3c25, getfield:\u36d3\u2dcc\ub113\u5654\uceb8[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u7873\u6fb0\u8389\uc7fe\u61a4::\ua61f\u7e3f\ud51e\u3bd6\u718f\uc7fe, this:\u7873\u6fb0\u8389\uc7fe\u61a4)))) {
                        if (cmplt:boolean(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\u3e2a\ua3b4\u4975\u4179\u64f2\u6c52, getfield:\u36d3\u2dcc\ub113\u5654\uceb8[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u7873\u6fb0\u8389\uc7fe\u61a4::\ua61f\u7e3f\ud51e\u3bd6\u718f\uc7fe, this:\u7873\u6fb0\u8389\uc7fe\u61a4), getfield:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u7873\u6fb0\u8389\uc7fe\u61a4::\u4e72\u071d\ud12e\ub171\u40a9\u7af6, this:\u7873\u6fb0\u8389\uc7fe\u61a4)), ldc:double(144.0))) {
                            var_1_5F = and:int(var_1_5F:int, ldc:int(-781194826))
                            invokevirtual:boolean(\uae5d\u9033\u8c8a\u5db4\u0800\u9af2::\u960f\u839e\u4ab3\ud523\u7af6\ud12e, getfield:\uae5d\u9033\u8c8a\u5db4\u0800\u9af2(\u7873\u6fb0\u8389\uc7fe\u61a4::\ua6bd\u183a\ufcaf\u4cd9\ubff1\u4c04, this:\u7873\u6fb0\u8389\uc7fe\u61a4), getfield:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u7873\u6fb0\u8389\uc7fe\u61a4::\u4e72\u071d\ud12e\ub171\u40a9\u7af6, this:\u7873\u6fb0\u8389\uc7fe\u61a4), getfield:double(\u7873\u6fb0\u8389\uc7fe\u61a4::\u7049\u7006\ua562\u759a\u416d\ubb2b, this:\u7873\u6fb0\u8389\uc7fe\u61a4))
                        }
                        else {
                            invokespecial:void(\u7873\u6fb0\u8389\uc7fe\u61a4::\ufe34\ud217\u69d9\u6198\u69d9\u5245, this:\u7873\u6fb0\u8389\uc7fe\u61a4)
                        }
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \ufe34\ud217\u69d9\u6198\u69d9\u5245() {
        var_1_7C : int
        var_3_67 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_4_6F : int
        
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
        var_1_7C = and:int(ldc:int(1895154568), ldc:int(-25483365))
        var_3_67 = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u7d52\u718f\u3776\u6fb0\ub83f::\u6c52\uc7fe\u600f\u72f1\u8640\u1833, getfield:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u7873\u6fb0\u8389\uc7fe\u61a4::\u4e72\u071d\ud12e\ub171\u40a9\u7af6, this:\u7873\u6fb0\u8389\uc7fe\u61a4))
        var_4_6F = and:int(ldc:int(-28670), ldc:int(10213))
        
        loop {
            if (cmpeq:boolean(and:int(var_1_7C:int, ldc:int(134217728)), ldc:int(0))) {
                var_1_7C = and:int(var_1_7C:int, ldc:int(-1564628428))
                
                if (cmplt:boolean(var_4_6F:int, ldc:int(10))) {
                    if (logicalnot:boolean(invokespecial:boolean(\u7873\u6fb0\u8389\uc7fe\u61a4::\ud7e8\u873d\u6198\u98a4\ucef1\u3d64, this:\u7873\u6fb0\u8389\uc7fe\u61a4, add:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, var_3_67:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), invokespecial:int(\u7873\u6fb0\u8389\uc7fe\u61a4::\ub102\u5bc4\u12b2\u9a18\u76bc\uc910, this:\u7873\u6fb0\u8389\uc7fe\u61a4, ldc:int(-3), and:int(ldc:int(899), ldc:int(4131)))), add:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, var_3_67:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), invokespecial:int(\u7873\u6fb0\u8389\uc7fe\u61a4::\ub102\u5bc4\u12b2\u9a18\u76bc\uc910, this:\u7873\u6fb0\u8389\uc7fe\u61a4, ldc:int(-1), and:int(ldc:int(13569), ldc:int(2721)))), add:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, var_3_67:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), invokespecial:int(\u7873\u6fb0\u8389\uc7fe\u61a4::\ub102\u5bc4\u12b2\u9a18\u76bc\uc910, this:\u7873\u6fb0\u8389\uc7fe\u61a4, ldc:int(-3), xor:int(ldc:int(2592), ldc:int(2595))))))) {
                        var_1_7C = and:int(var_1_7C:int, ldc:int(-413924485))
                        inc:int(var_4_6F, ldc:int(1))
                        loopcontinue()
                    }
                    
                    return:void()
                }
            }
            
            if (cmpne:boolean(and:int(var_1_7C:int, ldc:int(512)), ldc:int(0))) {
                return:void()
            }
            
            var_1_7C = and:int(var_1_7C:int, ldc:int(905733718))
        }
    }
    
    private boolean \ud7e8\u873d\u6198\u98a4\ucef1\u3d64(int p0, int p1, int p2) {
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
        
        if (logicaland:boolean(cmplt:boolean(invokestatic:double(Math::abs, sub:double(i2d:double(p0:int), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, getfield:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u7873\u6fb0\u8389\uc7fe\u61a4::\u4e72\u071d\ud12e\ub171\u40a9\u7af6, this:\u7873\u6fb0\u8389\uc7fe\u61a4)))), ldc:double(2.0)), cmplt:boolean(invokestatic:double(Math::abs, sub:double(i2d:double(p2:int), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, getfield:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u7873\u6fb0\u8389\uc7fe\u61a4::\u4e72\u071d\ud12e\ub171\u40a9\u7af6, this:\u7873\u6fb0\u8389\uc7fe\u61a4)))), ldc:double(2.0)))) {
            return:boolean(and:int[expected:boolean](ldc:int(-1351), ldc:int(1350)))
        }
        
        if (invokespecial:boolean(\u7873\u6fb0\u8389\uc7fe\u61a4::\ua3b4\ub83f\u624e\u3711\uc29a\uc2bd, this:\u7873\u6fb0\u8389\uc7fe\u61a4, initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, p0:int, p1:int, p2:int))) {
            invokevirtual:void(\u7d52\u718f\u3776\u6fb0\ub83f::\u392e\u4179\ud51e\u12b2\ub83f\u960f, getfield:\u36d3\u2dcc\ub113\u5654\uceb8[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u7873\u6fb0\u8389\uc7fe\u61a4::\ua61f\u7e3f\ud51e\u3bd6\u718f\uc7fe, this:\u7873\u6fb0\u8389\uc7fe\u61a4), add:double(i2d:double(p0:int), ldc:double(0.5)), i2d:double(p1:int), add:double(i2d:double(p2:int), ldc:double(0.5)), getfield:float(\u36d3\u2dcc\ub113\u5654\uceb8::\u7d52\u8709\ubefe\u7af6\u0b8e\ua61f, getfield:\u36d3\u2dcc\ub113\u5654\uceb8(\u7873\u6fb0\u8389\uc7fe\u61a4::\ua61f\u7e3f\ud51e\u3bd6\u718f\uc7fe, this:\u7873\u6fb0\u8389\uc7fe\u61a4)), getfield:float(\u36d3\u2dcc\ub113\u5654\uceb8::\u4d85\u71ae\u494c\u839e\uf9c5\u93a2, getfield:\u36d3\u2dcc\ub113\u5654\uceb8(\u7873\u6fb0\u8389\uc7fe\u61a4::\ua61f\u7e3f\ud51e\u3bd6\u718f\uc7fe, this:\u7873\u6fb0\u8389\uc7fe\u61a4)))
            invokevirtual:void(\uae5d\u9033\u8c8a\u5db4\u0800\u9af2::\ua6bd\u8c8a\u7043\u40a9\ud217\u47c2, getfield:\uae5d\u9033\u8c8a\u5db4\u0800\u9af2(\u7873\u6fb0\u8389\uc7fe\u61a4::\ua6bd\u183a\ufcaf\u4cd9\ubff1\u4c04, this:\u7873\u6fb0\u8389\uc7fe\u61a4))
            return:boolean(xor:int[expected:boolean](ldc:int(1028), ldc:int(1029)))
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(-13348), ldc:int(13347)))
    }
    
    private boolean \ua3b4\ub83f\u624e\u3711\uc29a\uc2bd(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
        var_5_8A : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        
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
        
        if (cmpne:boolean(invokestatic:\u8350\u7e3f\u8d98\u983f\u99f7\u61a4(\u7e3f\ub19c\u416d\uc229\u4c2b\u98a4::\u56bd\u7873\u8bb0\ud171\ub70c\u76bc, getfield:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a[expected:\u718f\u6435\uc31c\u4ab3\u98a4](\u7873\u6fb0\u8389\uc7fe\u61a4::\ub113\u2dcc\u416d\u3bc9\u446c\u0b8e, this:\u7873\u6fb0\u8389\uc7fe\u61a4), invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u839e\uc7fe\u392e\u7330\ud523\u3d4b, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)), getstatic:\u8350\u7e3f\u8d98\u983f\u99f7\u61a4(\u8350\u7e3f\u8d98\u983f\u99f7\u61a4::\ufcaf\u69d9\u5654\u99f7\uceb8\u6d69))) {
            return:boolean(and:int[expected:boolean](ldc:int(-4325), ldc:int(4324)))
        }
        
        var_5_8A = invokeinterface:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u718f\u6435\uc31c\u4ab3\u98a4::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, getfield:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a[expected:\u718f\u6435\uc31c\u4ab3\u98a4](\u7873\u6fb0\u8389\uc7fe\u61a4::\ub113\u2dcc\u416d\u3bc9\u446c\u0b8e, this:\u7873\u6fb0\u8389\uc7fe\u61a4), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u5db4\u64f2\ub7dc\ud217\u56bd\u8c8a, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
        
        if (logicaland:boolean(logicalnot:boolean(getfield:boolean(\u7873\u6fb0\u8389\uc7fe\u61a4::\ubefe\u8308\u4975\uceb8\ub1b9\u6bb9, this:\u7873\u6fb0\u8389\uc7fe\u61a4)), instanceof:boolean(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u7bad\u12b2\ubf56\ubb2b\uc238\u97e6.class, invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, var_5_8A:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e])))) {
            return:boolean(and:int[expected:boolean](ldc:int(-19560), ldc:int(19553)))
        }
        
        return:boolean(invokeinterface:boolean(\u516c\u5bc4\u494c\ub1b9\u5245::\u9a18\u6c56\uafe7\u7330\u92ee\uc246, getfield:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a[expected:\u516c\u5bc4\u494c\ub1b9\u5245](\u7873\u6fb0\u8389\uc7fe\u61a4::\ub113\u2dcc\u416d\u3bc9\u446c\u0b8e, this:\u7873\u6fb0\u8389\uc7fe\u61a4), getfield:\u36d3\u2dcc\ub113\u5654\uceb8[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u7873\u6fb0\u8389\uc7fe\u61a4::\ua61f\u7e3f\ud51e\u3bd6\u718f\uc7fe, this:\u7873\u6fb0\u8389\uc7fe\u61a4), invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u0c95\u88c5\ube23\u3776\u6d99\uff55, invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7d52\u718f\u3776\u6fb0\ub83f::\ub113\ub1b9\u9937\u1833\u64f2\u3504, getfield:\u36d3\u2dcc\ub113\u5654\uceb8[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u7873\u6fb0\u8389\uc7fe\u61a4::\ua61f\u7e3f\ud51e\u3bd6\u718f\uc7fe, this:\u7873\u6fb0\u8389\uc7fe\u61a4)), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u67e9\u4bc8\u5d20\u4179\ubb2b\u1833, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u7d52\u718f\u3776\u6fb0\ub83f::\u6c52\uc7fe\u600f\u72f1\u8640\u1833, getfield:\u36d3\u2dcc\ub113\u5654\uceb8[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u7873\u6fb0\u8389\uc7fe\u61a4::\ua61f\u7e3f\ud51e\u3bd6\u718f\uc7fe, this:\u7873\u6fb0\u8389\uc7fe\u61a4))))))
    }
    
    private int \ub102\u5bc4\u12b2\u9a18\u76bc\uc910(int p0, int p1) {
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
            return:int(add:int(invokevirtual:int(Random::nextInt, invokevirtual:Random(\ube23\u67d0\u64f2\u839e\u76bc::\u4daf\u446c\ubcb0\u759a\ua562\u5245, getfield:\u36d3\u2dcc\ub113\u5654\uceb8[expected:\ube23\u67d0\u64f2\u839e\u76bc](\u7873\u6fb0\u8389\uc7fe\u61a4::\ua61f\u7e3f\ud51e\u3bd6\u718f\uc7fe, this:\u7873\u6fb0\u8389\uc7fe\u61a4)), add:int(sub:int(p1:int, p0:int), xor:int(ldc:int(514), ldc:int(515)))), p0:int))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_19E : int
        expr_6E : int [generated]
        stack_A4_0 : byte[] [generated]
        stack_A6_0 : byte[] [generated]
        stack_D3_0 : byte[] [generated]
        stack_D5_0 : byte[] [generated]
        stack_114_0 : byte[] [generated]
        stack_116_0 : byte[] [generated]
        stack_144_0 : byte[] [generated]
        stack_1C1_0 : byte[] [generated]
        stack_228_0 : byte[] [generated]
        stack_2D0_0 : byte[] [generated]
        stack_30B_0 : byte[] [generated]
        var_4_18A : int
        var_3_18F : byte[]
        var_5_190 : int
        expr_1C4 : byte [generated]
        var_0_242 : int
        expr_228 : byte [generated]
        stack_27A_2 : byte [generated]
        stack_24E_0 : byte [generated]
        expr_A6 : int [generated]
        expr_D5 : int [generated]
        var_2_114 : byte[]
        expr_118 : int [generated]
        var_3_2F9 : byte[]
        var_5_2FA : int
        var_3_150 : String
        stack_183_0 : String[] [generated]
        expr_162 : String[] [generated]
        
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
        var_0_19E = and:int(ldc:int(-1646148179), ldc:int(-906150483))
        expr_6E = arraylength:int(stack_A4_0 = stack_A6_0 = stack_D3_0 = stack_D5_0 = stack_114_0 = stack_116_0 = stack_144_0 = stack_1C1_0 = stack_228_0 = stack_2D0_0 = stack_30B_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("kL64qriwuqPosrZ48MnDhK3fpLyH8NCkcpG0vtnBpZS00bennBP68Jw=")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_18A = expr_6E:int
        var_3_18F = newarray:byte[](byte.class, expr_6E:int)
        var_5_190 = expr_6E:int
        Label_0402:
        
        while (cmpne:boolean(and:int(var_0_19E:int, ldc:int(16777216)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_19E:int, ldc:int(4)), ldc:int(0))) {
                var_0_19E = and:int(var_0_19E:int, ldc:int(654614820))
                goto(Label_0521)
            }
            
            var_0_19E = and:int(var_0_19E:int, ldc:int(-1653989721))
            var_5_190 = add:int(var_5_190:int, ldc:int(-1))
            expr_1C4 = add:byte(loadelement:byte(stack_1C1_0:byte[], var_5_190:int), ldc:byte(82))
            storeelement:byte(var_3_18F:byte[], var_5_190:int, or:int(and:int(shl:int(expr_1C4:byte, xor:int(ldc:int(16674), ldc:int(16678))), ldc:int(-16)), and:int(shr:int(expr_1C4:byte[expected:int], and:int(ldc:int(17701), ldc:int(134))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_190:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_D3_0 = stack_D5_0 = stack_114_0 = stack_116_0 = stack_144_0 = stack_1C1_0 = stack_228_0 = stack_2D0_0 = stack_30B_0 = var_3_18F:byte[]
            goto(Label_0115)
        }
        
        var_0_19E = and:int(var_0_19E:int, ldc:int(1856653084))
        goto(Label_0672)
        Label_0521:
        
        while (cmpne:boolean(and:int(var_0_19E:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_19E:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0402)
            }
            
            var_0_242 = and:int(var_0_19E:int, ldc:int(-344990538))
            var_5_190 = add:int(var_5_190:int, ldc:int(-1))
            expr_228 = stack_27A_2 = loadelement(stack_228_0, var_5_190)
            
            if (cmplt:boolean(add:int(add:int(var_5_190:int, ldc:int(3)), neg:int(var_4_18A:int)), ldc:int(0))) {
                stack_27A_2 = stack_24E_0 = add:byte(expr_228:byte, loadelement:byte(var_3_18F:byte[], add:int(var_5_190:int, ldc:int(3))))
                goto(Label_0606)
            }
            
            Label_0565:
            
            if (cmpeq:boolean(and:int(var_0_242:int, ldc:int(2097152)), ldc:int(0))) {
                var_0_242 = and:int(var_0_242:int, ldc:int(1110362760))
            }
            else {
                var_0_242 = and:int(var_0_242:int, ldc:int(-579381548))
                stack_27A_2 = stack_24E_0 = add:byte(expr_228:byte, ldc:byte(3))
            }
            
            Label_0606:
            
            if (cmpne:boolean(and:int(var_0_242:int, ldc:int(1073741824)), ldc:int(0))) {
                var_0_242 = and:int(var_0_242:int, ldc:int(847886110))
                goto(Label_0565)
            }
            
            var_0_19E = and:int(var_0_242:int, ldc:int(-1250853410))
            storeelement:byte(var_3_18F:byte[], var_5_190:int, stack_27A_2:byte)
            
            if (cmpne:boolean(var_5_190:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_D3_0 = stack_D5_0 = stack_114_0 = stack_116_0 = stack_144_0 = stack_1C1_0 = stack_228_0 = stack_2D0_0 = stack_30B_0 = var_3_18F:byte[]
            goto(Label_0171)
        }
        
        Label_0672:
        
        while (cmpeq:boolean(and:int(var_0_19E:int, ldc:int(262144)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_19E:int, ldc:int(33554432)), ldc:int(0))) {
                var_0_19E = and:int(var_0_19E:int, ldc:int(-1624743844))
                goto(Label_0402)
            }
            
            var_0_19E = and:int(var_0_19E:int, ldc:int(-2048743780))
            var_5_190 = add:int(var_5_190:int, ldc:int(-1))
            storeelement:byte(var_3_18F:byte[], var_5_190:int, xor:byte(loadelement:byte(stack_2D0_0:byte[], var_5_190:int), ldc:byte(49)))
            
            if (cmpne:boolean(var_5_190:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_D3_0 = stack_D5_0 = stack_114_0 = stack_116_0 = stack_144_0 = stack_1C1_0 = stack_228_0 = stack_2D0_0 = stack_30B_0 = var_3_18F:byte[]
            goto(Label_0218)
        }
        
        var_0_19E = and:int(var_0_19E:int, ldc:int(-871205749))
        goto(Label_0521)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_19E:int, ldc:int(1024)), ldc:int(0))) {
            var_0_19E = and:int(var_0_19E:int, ldc:int(-703851355))
            goto(Label_0285)
        }
        
        if (cmpeq:boolean(and:int(var_0_19E:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_19E = and:int(var_0_19E:int, ldc:int(-1579645589))
            goto(Label_0218)
        }
        
        if (cmpne:boolean(and:int(var_0_19E:int, ldc:int(4)), ldc:int(0))) {
            var_0_19E = and:int(var_0_19E:int, ldc:int(-344805673))
            expr_A6 = arraylength:int(stack_A6_0:byte[])
            
            if (cmpne:boolean(expr_A6:int, ldc:int(0))) {
                var_4_18A = expr_A6:int
                var_3_18F = newarray:byte[](byte.class, expr_A6:int)
                var_5_190 = expr_A6:int
                goto(Label_0521)
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_0_19E:int, ldc:int(4)), ldc:int(0))) {
            goto(Label_0285)
        }
        
        if (cmpeq:boolean(and:int(var_0_19E:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_19E = and:int(var_0_19E:int, ldc:int(-311180548))
        }
        else {
            if (cmpne:boolean(and:int(var_0_19E:int, ldc:int(2048)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_19E = and:int(var_0_19E:int, ldc:int(-2115840052))
            expr_D5 = arraylength:int(stack_D5_0:byte[])
            
            if (cmpne:boolean(expr_D5:int, ldc:int(0))) {
                var_4_18A = expr_D5:int
                var_3_18F = newarray:byte[](byte.class, expr_D5:int)
                var_5_190 = expr_D5:int
                goto(Label_0672)
            }
        }
        
        Label_0218:
        
        if (cmpne:boolean(and:int(var_0_19E:int, ldc:int(524288)), ldc:int(0))) {
            var_0_19E = and:int(var_0_19E:int, ldc:int(495218145))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_19E:int, ldc:int(1024)), ldc:int(0))) {
                var_0_19E = and:int(var_0_19E:int, ldc:int(1799345650))
                goto(Label_0171)
            }
            
            if (cmpne:boolean(and:int(var_0_19E:int, ldc:int(262144)), ldc:int(0))) {
                var_0_19E = and:int(var_0_19E:int, ldc:int(-1295631961))
                goto(Label_0115)
            }
            
            var_0_19E = and:int(var_0_19E:int, ldc:int(-302207572))
            var_2_114 = stack_114_0:byte[]
            expr_118 = add:int(arraylength:int(stack_116_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_118:int, ldc:int(0))) {
                var_3_2F9 = newarray:byte[](byte.class, expr_118:int)
                var_5_2FA = expr_118:int
                
                loop {
                    var_0_19E = and:int(var_0_19E:int, ldc:int(-1712581394))
                    var_5_2FA = add:int(var_5_2FA:int, ldc:int(-1))
                    storeelement:byte(var_3_2F9:byte[], var_5_2FA:int, add:int(shl:int(loadelement:byte(stack_30B_0:byte[], var_5_2FA:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_114:byte[], add:int(var_5_2FA:int, and:int(ldc:int(20481), ldc:int(8897)))), ldc:int(4)), xor:int(ldc:int(2086), ldc:int(2089)))))
                    
                    if (cmpne:boolean(var_5_2FA:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A6_0 = stack_A4_0 = stack_D3_0 = stack_D5_0 = stack_114_0 = stack_116_0 = stack_144_0 = stack_1C1_0 = stack_228_0 = stack_2D0_0 = stack_30B_0 = var_3_2F9:byte[]
            }
        }
        
        Label_0285:
        
        if (cmpne:boolean(and:int(var_0_19E:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_19E = and:int(var_0_19E:int, ldc:int(-568391419))
            goto(Label_0218)
        }
        
        if (cmpeq:boolean(and:int(var_0_19E:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_0171)
        }
        
        if (cmpne:boolean(and:int(var_0_19E:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_150 = initobject:String(String::<init>, stack_144_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_183_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(20498), ldc:int(20499)))
            expr_162 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(48), ldc:int(49)))
            storeelement:String(expr_162:String[], and:int(ldc:int(-12404), ldc:int(12339)), invokevirtual:String[expected:String](String::substring, var_3_150:String, and:int(ldc:int(10537), ldc:int(-26940)), xor:int(ldc:int(8591), ldc:int(8615))))
            putstatic:String[](\u7873\u6fb0\u8389\uc7fe\u61a4::\ub7dc\u3d64\u9a18\u9a18\u6cfe\u527a, expr_162:String[])
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \ub8be\u4c2b\u071d\ub70c\ubded\u6d99(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_654 : int
        var_5_89 : int
        var_6_90 : int
        var_7_9F : double
        var_9_C7 : double
        var_3_D9 : int
        var_11_EA : int
        var_14_114 : double
        var_16_118 : int
        var_12_110 : double
        var_17_65F : int
        
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
        var_3_654 = and:int(ldc:int(-65675863), ldc:int(-45114933))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7873\u6fb0\u8389\uc7fe\u61a4[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0179)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(524288)), ldc:int(0))) {
            var_3_654 = and:int(var_3_654:int, ldc:int(-2013036039))
        }
        else {
            var_3_654 = and:int(var_3_654:int, ldc:int(-636102193))
            var_5_89 = and:int(ldc:int(26464), ldc:int(-28521))
            var_6_90 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9F = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(18697), ldc:int(-18730)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C7 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D9 = and:int(var_3_654:int, ldc:int(-580003413))
                    var_9_C7 = sub:double(var_7_9F:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EA = var_5_89:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EA:int, sub:int(var_6_90:int, and:int(ldc:int(9219), ldc:int(17185)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EA:int, and:int(ldc:int(1161), ldc:int(20487)))), var_7_9F:double))) {
                        inc:int(var_11_EA, ldc:int(1))
                    }
                    
                    var_3_654 = and:int(var_3_D9:int, ldc:int(-68316179))
                    var_14_114 = var_7_9F:double
                    var_16_118 = var_11_EA:int
                }
                else {
                    var_11_EA = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_89:int), and:int(ldc:int(4165), ldc:int(1587)))
                    var_12_110 = var_14_114 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89)
                    
                    if (cmplt:boolean(var_16_118 = var_11_EA:int, var_6_90:int)) {
                        var_9_C7 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EA:int)
                        var_16_118 = var_11_EA:int
                        var_14_114 = var_12_110:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1502)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1224)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1133754755))
                        goto(Label_1100)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0953)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0822)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-984983475))
                        goto(Label_0693)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0571)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1674557464))
                    }
                    else {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-577792549))
                        
                        if (cmplt:boolean(var_16_118:int, var_6_90:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0571)
                            }
                            
                            goto(Label_0822)
                        }
                    }
                    
                    Label_0399:
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(512)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(38568394))
                        goto(Label_1502)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1969914612))
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1224)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(16)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1099406963))
                        goto(Label_1100)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-553223413))
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0822)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0693)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(849640439))
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(-618144867))
                        var_11_EA = and:int(ldc:int(-8558), ldc:int(8556))
                        goto(Label_1491)
                    }
                    
                    Label_0571:
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(512)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1652365478))
                        goto(Label_1502)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-2113199935))
                        goto(Label_1224)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1100)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(8)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(500494314))
                        goto(Label_0953)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0822)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-892009802))
                            goto(Label_0399)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(-667953683))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_114 = var_9_C7:double
                            goto(Label_0822)
                        }
                    }
                    
                    Label_0693:
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1292506180))
                        goto(Label_1502)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1224)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1100)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-769731514))
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-2005327988))
                            goto(Label_0571)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0399)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(1821625382))
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(-111691827))
                        var_14_114 = mul:double(ldc:double(0.5), add:double(var_9_C7:double, var_14_114:double))
                    }
                    
                    Label_0822:
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1502)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(760211524))
                        goto(Label_1224)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(8)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1207813778))
                        goto(Label_1100)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(1)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-342589919))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(8)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-150532932))
                            goto(Label_0693)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0571)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0399)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-258496583))
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(-560088167))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89:int), var_7_9F:double)) {
                                var_11_EA = xor:int(ldc:int(3232), ldc:int(3233))
                                goto(Label_1100)
                            }
                        }
                    }
                    
                    Label_0953:
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1502)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(315788100))
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(618066432))
                        goto(Label_1224)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0822)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0693)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0571)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(128)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-2025581968))
                            goto(Label_0399)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(-644358199))
                        var_11_EA = and:int(ldc:int(7112), ldc:int(-8137))
                    }
                    
                    Label_1100:
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-385143014))
                        goto(Label_1502)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1485506789))
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0953)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(16)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-25755032))
                            goto(Label_0822)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0693)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0571)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0399)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(1)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(200157348))
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(-97534037))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                                goto(Label_1356)
                            }
                        }
                    }
                    
                    Label_1224:
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1502)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(1576947379))
                            goto(Label_1100)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(64)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(1886679877))
                            goto(Label_0953)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0822)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-1022482723))
                            goto(Label_0693)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0571)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(8)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(643956057))
                            goto(Label_0399)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-57690739))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_114:double, var_5_89:int, var_16_118:int)
                            goto(Label_1491)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1356:
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1502)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(16)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-658482804))
                        goto(Label_1224)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1100)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(374524135))
                        goto(Label_0953)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0822)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1467437107))
                        goto(Label_0693)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0571)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0399)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1609131322))
                        loopcontinue()
                    }
                    
                    var_3_654 = and:int(var_3_654:int, ldc:int(-628108305))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_114:double, ldc:double(0.0))
                    Label_1491:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_65F = var_5_89:int
                        
                        if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1502:
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1772599283))
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(16)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(402975281))
                        goto(Label_1224)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1100)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-2079390231))
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0822)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-636174779))
                        goto(Label_0693)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0571)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1190784976))
                        goto(Label_0399)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(512)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-669526135))
                        var_17_65F = add:int(var_16_118:int, and:int(ldc:int(2305), ldc:int(17479)))
                        looporswitchbreak()
                    }
                }
                
                var_3_654 = and:int(var_3_654:int, ldc:int(-647630419))
                
                if (cmple:boolean(var_5_89 = var_17_65F:int, sub:int(var_6_90:int, and:int(ldc:int(9217), ldc:int(4363))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0179:
        
        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(32768)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
