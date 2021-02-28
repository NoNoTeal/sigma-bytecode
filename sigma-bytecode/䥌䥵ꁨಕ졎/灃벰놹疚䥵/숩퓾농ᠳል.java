public class \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\uc229\ud4fe\ub18d\u1833\u120d {
    public void \uc229\ud4fe\ub18d\u1833\u120d() {
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
            invokespecial:\ubcb0\u71f1\u88c5\u5f50\u92ff(\ubcb0\u71f1\u88c5\u5f50\u92ff::<init>, this:\uc229\ud4fe\ub18d\u1833\u120d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ube23\u99f7\ua61f\u4ab3\u8709\ubb2b(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \ud36e\u6bb9\u960f\u4c04\u64ab.\u8d90\u927d\u7d52\uf94d\u12cb p1) {
        var_5_6A : Optional<\u8709\u8bb0\u718f\u416d\u6b0d\u92ee>
        var_6_86 : \u8709\u8bb0\u718f\u416d\u6b0d\u92ee
        var_7_91 : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        
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
            var_5_6A = invokevirtual:Optional<\u8709\u8bb0\u718f\u416d\u6b0d\u92ee>(\ub32d\u92ff\uc2bd\ud36e\ud36e<\u8d90\u927d\u7d52\uf94d\u12cb>::\u836c\u8753\ub102\u9a18\uc910\u6fb0, invokevirtual:\ub32d\u92ff\uc2bd\ud36e\ud36e<\u8d90\u927d\u7d52\uf94d\u12cb>(\u8d90\u927d\u7d52\uf94d\u12cb::\u3d64\u16f6\u9a18\ucef1\ua6bd\u8bb0, p1:\u8d90\u927d\u7d52\uf94d\u12cb), getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\u8709\u8bb0\u718f\u416d\u6b0d\u92ee>(\ud36e\u4bc8\u6d69\u92ee\ubb2b::\ubefe\u071d\u7c6b\u7e3f\u3711\u3e2a))
            
            if (invokevirtual:boolean(Optional<T>::isPresent, var_5_6A:Optional<\u8709\u8bb0\u718f\u416d\u6b0d\u92ee>)) {
                var_6_86 = checkcast:\u8709\u8bb0\u718f\u416d\u6b0d\u92ee(\ub113\uc4d2\u183a\u527a\u6435.\u8709\u8bb0\u718f\u416d\u6b0d\u92ee.class, invokevirtual:\u8709\u8bb0\u718f\u416d\u6b0d\u92ee(Optional<\u8709\u8bb0\u718f\u416d\u6b0d\u92ee>::get, var_5_6A:Optional<\u8709\u8bb0\u718f\u416d\u6b0d\u92ee>))
                var_7_91 = invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8709\u8bb0\u718f\u416d\u6b0d\u92ee::\u3d4b\u7c6b\u5d20\u8d98\u600f\u71f1, var_6_86:\u8709\u8bb0\u718f\u416d\u6b0d\u92ee))
                
                if (invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\u3e2a\ua61f\ua61f\ud51e\u0b8e, var_7_91:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\uc84e\u92ee\uf9c5\ubff1\u69d9\u8389))) {
                    invokespecial:void(\uc229\ud4fe\ub18d\u1833\u120d::\ud12e\ud12e\u8cae\u759a\u0a06\u983f, this:\uc229\ud4fe\ub18d\u1833\u120d, p1:\u8d90\u927d\u7d52\uf94d\u12cb)
                    invokespecial:void(\uc229\ud4fe\ub18d\u1833\u120d::\ub171\ud217\u392e\ua068\ud171\u16f6, this:\uc229\ud4fe\ub18d\u1833\u120d, p0:\ube23\uc238\u5140\u4cd9\u8aa5, p1:\u8d90\u927d\u7d52\uf94d\u12cb, var_6_86:\u8709\u8bb0\u718f\u416d\u6b0d\u92ee, var_7_91:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \ub171\ud217\u392e\ua068\ud171\u16f6(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \ud36e\u6bb9\u960f\u4c04\u64ab.\u8d90\u927d\u7d52\uf94d\u12cb p1, \ub113\uc4d2\u183a\u527a\u6435.\u8709\u8bb0\u718f\u416d\u6b0d\u92ee p2, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p3) {
        var_5_61 : int
        var_7_67 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_5_1A1 : int
        var_8_85 : int
        var_10_95 : int[]
        var_11_9B : \ubff1\u7ce1\u6435\u3c25\u071d
        var_12_A2 : int
        var_13_A6 : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        var_14_B2 : int
        var_15_FB : \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56
        var_16_10A : int
        var_17_128 : int
        var_18_132 : int
        var_19_14A : int
        var_20_166 : int
        
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
            var_5_61 = and:int(ldc:int(94365555), ldc:int(-1049890888))
            var_7_67 = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8709\u8bb0\u718f\u416d\u6b0d\u92ee::\u3d4b\u7c6b\u5d20\u8d98\u600f\u71f1, p2:\u8709\u8bb0\u718f\u416d\u6b0d\u92ee)
            
            if (cmpeq:boolean(invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokevirtual:Integer(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p3:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u4c04\u12b2\u6c56\uc2bd\u647c\uc84e[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Integer>](\u5fe1\u64f2\u5654\u6b0d\u3dd3\u6b5f::\ub32d\u3c25\u7873\u4179\u516c\u156b)))), ldc:int(8))) {
                p3 = invokestatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5fe1\u64f2\u5654\u6b0d\u3dd3\u6b5f::\u99f7\u6c52\u88c5\u839e\ud7e8\u3c25, p3:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], var_7_67:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            }
            
            var_5_1A1 = and:int(var_5_61:int, ldc:int(-143917380))
            var_8_85 = ldc:int(20)
            var_10_95 = newarray:int[](int.class, invokeinterface:int(List<E>::size, getstatic:List<\u9af2\u1833\u156b\u12cb\u7d52\u6c52>(\uc229\ud4fe\ub18d\u1833\u120d::\u7043\u51fa\u6198\u4bc8\u7e3f\u6cfe)))
            var_11_9B = invokevirtual:\ubff1\u7ce1\u6435\u3c25\u071d(\uc246\u7873\uc238\u4179\ubded::\u8c8a\u40a9\u3bc9\u3bd6\u4975\uc31c, p1:\u8d90\u927d\u7d52\uf94d\u12cb[expected:\uc246\u7873\uc238\u4179\ubded])
            var_12_A2 = invokevirtual:int(\ubff1\u7ce1\u6435\u3c25\u071d::\u99f7\uf94d\u071d\u3711\u2dcc\ucfaf, var_11_9B:\ubff1\u7ce1\u6435\u3c25\u071d)
            var_13_A6 = p3:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d
            var_14_B2 = sub:int(var_12_A2:int, and:int(ldc:int(11265), ldc:int(29)))
            
            while (logicaland:boolean(cmpge:boolean(var_14_B2:int, ldc:int(0)), cmpgt:boolean(var_8_85:int, ldc:int(0)))) {
                var_15_FB = invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\ubff1\u7ce1\u6435\u3c25\u071d::\u72f1\ubefe\u34df\u51b2\u4daf\u6bb9, var_11_9B:\ubff1\u7ce1\u6435\u3c25\u071d, var_14_B2:int)
                var_16_10A = invokeinterface:int(List<E>::indexOf, getstatic:List<\u9af2\u1833\u156b\u12cb\u7d52\u6c52>(\uc229\ud4fe\ub18d\u1833\u120d::\u7043\u51fa\u6198\u4bc8\u7e3f\u6cfe), invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52[expected:Object](\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, var_15_FB:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))
                
                if (cmpne:boolean(var_16_10A:int, ldc:int(-1))) {
                    var_17_128 = invokevirtual:int(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u927d\ufcaf\ub8be\u6bb9\u74b1\u3e75, var_15_FB:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
                    var_18_132 = add:int(loadelement:int(var_10_95:int[], var_16_10A:int), var_17_128:int)
                    storeelement:int(var_10_95:int[], var_16_10A:int, var_18_132:int)
                    var_19_14A = invokestatic:int(Math::min, invokestatic:int(Math::min, sub:int(var_18_132:int, ldc:int(10)), var_8_85:int), var_17_128:int)
                    
                    if (cmpgt:boolean(var_19_14A:int, ldc:int(0))) {
                        var_8_85 = sub:int(var_8_85:int, var_19_14A:int)
                        var_20_166 = and:int(ldc:int(25869), ldc:int(-30480))
                        
                        loop {
                            var_5_1A1 = and:int(var_5_1A1:int, ldc:int(702279655))
                            
                            if (cmpge:boolean(var_20_166:int, var_19_14A:int)) {
                                looporswitchbreak()
                            }
                            
                            var_13_A6 = invokestatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5fe1\u64f2\u5654\u6b0d\u3dd3\u6b5f::\u0b8e\ua3b4\u3e75\u7e3f\ua3b4\u8df4, var_13_A6:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, p0:\ube23\uc238\u5140\u4cd9\u8aa5, var_15_FB:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, var_7_67:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                            
                            if (cmpeq:boolean(invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokevirtual:Integer(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, var_13_A6:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u4c04\u12b2\u6c56\uc2bd\u647c\uc84e[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Integer>](\u5fe1\u64f2\u5654\u6b0d\u3dd3\u6b5f::\ub32d\u3c25\u7873\u4179\u516c\u156b)))), ldc:int(7))) {
                                invokespecial:void(\uc229\ud4fe\ub18d\u1833\u120d::\u64ab\u3a62\u7e3f\u6d69\u446c\ub1b9, this:\uc229\ud4fe\ub18d\u1833\u120d, p0:\ube23\uc238\u5140\u4cd9\u8aa5, p3:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, var_7_67:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, var_13_A6:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
                                return:void()
                            }
                            
                            var_5_1A1 = and:int(var_5_1A1:int, ldc:int(555473436))
                            inc:int(var_20_166, ldc:int(1))
                        }
                    }
                }
                
                var_5_1A1 = and:int(var_5_1A1:int, ldc:int(-1625559299))
                inc:int(var_14_B2, ldc:int(-1))
            }
            
            invokespecial:void(\uc229\ud4fe\ub18d\u1833\u120d::\u64ab\u3a62\u7e3f\u6d69\u446c\ub1b9, this:\uc229\ud4fe\ub18d\u1833\u120d, p0:\ube23\uc238\u5140\u4cd9\u8aa5, p3:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, var_7_67:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, var_13_A6:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u64ab\u3a62\u7e3f\u6d69\u446c\ub1b9(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p3) {
        var_5_61 : int
        stack_95_1 : int [generated]
        stack_95_3 : int [generated]
        
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
            var_5_61 = and:int(ldc:int(1904406818), ldc:int(1909142899))
            stack_95_1 = and:int(ldc:int(6110), ldc:int(3549))
            
            if (cmpeq:boolean(p3:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)) {
                var_5_61 = and:int(var_5_61:int, ldc:int(-154961973))
                stack_95_3 = and:int(ldc:int(-4074), ldc:int(2729))
            }
            else {
                stack_95_3 = xor:int(ldc:int(3), ldc:int(2))
            }
            
            invokevirtual:void(\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd::\u4f4a\u76bc\ub6ab\u5654\uc4d2\ub7dc, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd], stack_95_1:int, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, stack_95_3:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \ud12e\ud12e\u8cae\u759a\u0a06\u983f(\ud36e\u6bb9\u960f\u4c04\u64ab.\u8d90\u927d\u7d52\uf94d\u12cb p0) {
        var_4_64 : \ubff1\u7ce1\u6435\u3c25\u071d
        var_8_AD : int
        var_10_E3 : \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56
        
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
            var_4_64 = invokevirtual:\ubff1\u7ce1\u6435\u3c25\u071d(\uc246\u7873\uc238\u4179\ubded::\u8c8a\u40a9\u3bc9\u3bd6\u4975\uc31c, p0:\u8d90\u927d\u7d52\uf94d\u12cb[expected:\uc246\u7873\uc238\u4179\ubded])
            
            if (cmple:boolean(invokevirtual:int(\ua61f\uae87\u6b5f\uc31c\ud12e::\u56bd\u600f\u9937\u7e3f\u3bd6\uc2bd, var_4_64:\ubff1\u7ce1\u6435\u3c25\u071d[expected:\ua61f\uae87\u6b5f\uc31c\ud12e], getstatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u4492\ua562\ud158\u4492\u6bb9\ub70c::\ubb2b\ub83f\u6fb0\ub8be\u3bd6\u960f)), ldc:int(36))) {
                var_8_AD = invokestatic:int(Math::min, and:int(ldc:int(3143), ldc:int(4139)), div:int(invokevirtual:int(\ua61f\uae87\u6b5f\uc31c\ud12e::\u56bd\u600f\u9937\u7e3f\u3bd6\uc2bd, var_4_64:\ubff1\u7ce1\u6435\u3c25\u071d[expected:\ua61f\uae87\u6b5f\uc31c\ud12e], getstatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u4492\ua562\ud158\u4492\u6bb9\ub70c::\u8389\u3711\u4f52\u4f4a\u6c56\u1187)), and:int(ldc:int(9991), ldc:int(20547))))
                
                if (cmpne:boolean(var_8_AD:int, ldc:int(0))) {
                    invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\ubff1\u7ce1\u6435\u3c25\u071d::\uc2e8\ud51e\ud7e8\ua3b4\ubf56\u4bc8, var_4_64:\ubff1\u7ce1\u6435\u3c25\u071d, getstatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u4492\ua562\ud158\u4492\u6bb9\ub70c::\u8389\u3711\u4f52\u4f4a\u6c56\u1187), mul:int(var_8_AD:int, xor:int(ldc:int(97), ldc:int(98))))
                    var_10_E3 = invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\ubff1\u7ce1\u6435\u3c25\u071d::\ud36e\u494c\u4179\u76bc\uc238\u4bc8, var_4_64:\ubff1\u7ce1\u6435\u3c25\u071d, initobject:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::<init>, getstatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52[expected:\u92ff\u600f\u4f4a\u8aa5\u1187\ub6ab](\u4492\ua562\ud158\u4492\u6bb9\ub70c::\ubb2b\ub83f\u6fb0\ub8be\u3bd6\u960f), var_8_AD:int))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u69d9\ub8be\u3a62\ud171\u64f2\ua562, var_10_E3:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))) {
                        invokevirtual:\u120d\u8bb0\u836c\u64f2\u3504(\u7d52\u718f\u3776\u6fb0\ub83f::\u1187\ua6bd\u1833\u92ff\u8753\uc229, p0:\u8d90\u927d\u7d52\uf94d\u12cb[expected:\u7d52\u718f\u3776\u6fb0\ub83f], var_10_E3:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, ldc:float(0.5f))
                    }
                }
            }
            
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
            putstatic:List<\u9af2\u1833\u156b\u12cb\u7d52\u6c52>(\uc229\ud4fe\ub18d\u1833\u120d::\u7043\u51fa\u6198\u4bc8\u7e3f\u6cfe, invokestatic:ImmutableList[expected:List<\u9af2\u1833\u156b\u12cb\u7d52\u6c52>](ImmutableList::of, getstatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52[expected:Object](\u4492\ua562\ud158\u4492\u6bb9\ub70c::\u4bc8\u64f2\u120d\u0800\u873d\u156b), getstatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52[expected:Object](\u4492\ua562\ud158\u4492\u6bb9\ub70c::\u3a62\u3bc9\u6c56\u5140\u8bb0\u3a62)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6fb0\u8413\u8389\ub1b9\ub83f\u8258(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6AF : int
        var_5_7F : int
        var_6_86 : int
        var_7_95 : double
        var_9_C6 : double
        var_3_D8 : int
        var_11_E9 : int
        var_14_113 : double
        var_16_117 : int
        var_12_10F : double
        var_17_6BA : int
        
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
        var_3_6AF = and:int(ldc:int(336655622), ldc:int(-1852092073))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc229\ud4fe\ub18d\u1833\u120d[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0169)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(32)), ldc:int(0))) {
            var_3_6AF = and:int(var_3_6AF:int, ldc:int(1991401433))
            var_5_7F = and:int(ldc:int(-22071), ldc:int(5668))
            var_6_86 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_95 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-10580), ldc:int(10579)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C6 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D8 = and:int(var_3_6AF:int, ldc:int(1674695480))
                    var_9_C6 = sub:double(var_7_95:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E9 = var_5_7F:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E9:int, sub:int(var_6_86:int, xor:int(ldc:int(16968), ldc:int(16969)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E9:int, and:int(ldc:int(4929), ldc:int(3)))), var_7_95:double))) {
                        inc:int(var_11_E9, ldc:int(1))
                    }
                    
                    var_3_6AF = and:int(var_3_D8:int, ldc:int(-1824859281))
                    var_14_113 = var_7_95:double
                    var_16_117 = var_11_E9:int
                }
                else {
                    var_11_E9 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7F:int), xor:int(ldc:int(450), ldc:int(451)))
                    var_12_10F = var_14_113 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7F)
                    
                    if (cmplt:boolean(var_16_117 = var_11_E9:int, var_6_86:int)) {
                        var_9_C6 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E9:int)
                        var_16_117 = var_11_E9:int
                        var_14_113 = var_12_10F:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1580)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1413479674))
                        goto(Label_1414)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1278)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1144)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0966)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(14222435))
                        goto(Label_0841)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0709)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-224237179))
                        goto(Label_0575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(735411590))
                        
                        if (cmplt:boolean(var_16_117:int, var_6_86:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0575)
                            }
                            
                            goto(Label_0841)
                        }
                    }
                    
                    Label_0400:
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(402769305))
                        goto(Label_1580)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1117056524))
                        goto(Label_1414)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1278)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(99887370))
                        goto(Label_1144)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0966)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1043470704))
                        goto(Label_0841)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1572211774))
                        goto(Label_0709)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(512)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1869095459))
                            var_11_E9 = and:int(ldc:int(22818), ldc:int(-22883))
                            goto(Label_1569)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0575:
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1580)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1414)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1280602828))
                        goto(Label_1278)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1891233973))
                        goto(Label_1144)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0966)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(334127973))
                        goto(Label_0841)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1991707899))
                            goto(Label_0400)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1616249039))
                            loopcontinue()
                        }
                        
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1090718774))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_113 = var_9_C6:double
                            goto(Label_0841)
                        }
                    }
                    
                    Label_0709:
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1580)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1884770814))
                        goto(Label_1414)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1373054295))
                        goto(Label_1278)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-660216966))
                        goto(Label_1144)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0966)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0575)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(1462572743))
                            loopcontinue()
                        }
                        
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-648511681))
                        var_14_113 = mul:double(ldc:double(0.5), add:double(var_9_C6:double, var_14_113:double))
                    }
                    
                    Label_0841:
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1580)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1414)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1278)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-343698274))
                        goto(Label_1144)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(273705648))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0709)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-733782812))
                            goto(Label_0575)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(32)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(3287935))
                            goto(Label_0400)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-160304369))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7F:int), var_7_95:double)) {
                                var_11_E9 = and:int(ldc:int(1025), ldc:int(16471))
                                goto(Label_1144)
                            }
                        }
                    }
                    
                    Label_0966:
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1580)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1414)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-918400392))
                        goto(Label_1278)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1443635883))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1810794622))
                            goto(Label_0841)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1773538058))
                            goto(Label_0709)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0575)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-271927191))
                            goto(Label_0400)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-479182045))
                            loopcontinue()
                        }
                        
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1998946384))
                        var_11_E9 = and:int(ldc:int(19593), ldc:int(-19850))
                    }
                    
                    Label_1144:
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(585569322))
                        goto(Label_1580)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-670357301))
                        goto(Label_1414)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(461121973))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0966)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0841)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0709)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1855582263))
                            goto(Label_0575)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-890940942))
                            loopcontinue()
                        }
                        
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1265067089))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                                goto(Label_1414)
                            }
                        }
                    }
                    
                    Label_1278:
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1580)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-599465420))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(32)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-979052108))
                            goto(Label_1144)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(512)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(1646241227))
                            goto(Label_0966)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0841)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1418258779))
                            goto(Label_0709)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0575)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(32)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(2143107994))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_113:double, var_5_7F:int, var_16_117:int)
                            goto(Label_1569)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1414:
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1580)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1431714475))
                        goto(Label_1278)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1356195654))
                        goto(Label_1144)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-467352144))
                        goto(Label_0966)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-802253487))
                        goto(Label_0841)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1959342768))
                        goto(Label_0709)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1269147837))
                        goto(Label_0400)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(128)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6AF = and:int(var_3_6AF:int, ldc:int(-284107516))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_113:double, ldc:double(0.0))
                    Label_1569:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6BA = var_5_7F:int
                        
                        if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1580:
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1414)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1863127820))
                        goto(Label_1278)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1670089184))
                        goto(Label_1144)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-762517314))
                        goto(Label_0966)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0841)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(505159061))
                        goto(Label_0709)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1887637912))
                        goto(Label_0575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(2014074383))
                        goto(Label_0400)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1601633774))
                        var_17_6BA = add:int(var_16_117:int, xor:int(ldc:int(34), ldc:int(35)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1166434939))
                
                if (cmple:boolean(var_5_7F = var_17_6BA:int, sub:int(var_6_86:int, xor:int(ldc:int(18432), ldc:int(18433))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0169:
        
        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(131072)), ldc:int(0))) {
            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-322358442))
            goto(Label_0106)
        }
    }
}
