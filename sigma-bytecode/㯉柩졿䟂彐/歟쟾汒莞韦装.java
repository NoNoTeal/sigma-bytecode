public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u6b5f\uc7fe\u6c52\u839e\u97e6\u88c5 {
    public void \u6b5f\uc7fe\u6c52\u839e\u97e6\u88c5(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 p0) {
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
            invokespecial:Object(Object::<init>, this:\u6b5f\uc7fe\u6c52\u839e\u97e6\u88c5)
            putfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6b5f\uc7fe\u6c52\u839e\u97e6\u88c5::\u7873\u16f6\uc2bd\u8d90\ud217\u5fe1, this:\u6b5f\uc7fe\u6c52\u839e\u97e6\u88c5, p0:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4daf\u7af6\u8350\u8709\ubb2b\u4e72(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, \u927d\u92ff\u71ae\uafe7\u6bb9.\u12cb\u12b2\ua3b4\u183a\ud158\u51fa p1, double p2, double p3, double p4) {
        var_9_61 : int
        var_11_6A : \u16f6\u61a4\u5db4\u4c04\u64ab\u9255
        var_12_84 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_13_8D : LongOpenHashSet
        var_14_AD : Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>
        var_15_F6 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_16_102 : int
        var_18_11E : int
        var_19_128 : long
        var_9_13B : int
        
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
            var_9_61 = and:int(ldc:int(-2038640164), ldc:int(-567347329))
            var_11_6A = getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6b5f\uc7fe\u6c52\u839e\u97e6\u88c5::\u7873\u16f6\uc2bd\u8d90\ud217\u5fe1, this:\u6b5f\uc7fe\u6c52\u839e\u97e6\u88c5))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u6c52\u416d\u385b\ud7e8\ufcaf\u9937)
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\uc9f6\u7049\u92ee\ube23\u3c25\u6d99)
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u3d4b\u74b1\u3711\u5bc4\uf9c5\ub32d)
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8389\ua3b4\u3d4b\ud36e\u67e9\ubefe)
            var_12_84 = initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, p2:double, p3:double, p4:double)
            var_13_8D = initobject:LongOpenHashSet(LongOpenHashSet::<init>)
            var_14_AD = invokeinterface:Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(Iterable<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::iterator, invokestatic:Iterable<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u7873\u8753\u6c56\ufcaf\u8c8a\u7d52, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc84e\u5f50\u92ff\u92ff\u2dcc\u7330, var_12_84:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, ldc:int(-10), ldc:int(-10), ldc:int(-10)), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc84e\u5f50\u92ff\u92ff\u2dcc\u7330, var_12_84:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, ldc:int(10), ldc:int(10), ldc:int(10))))
            
            loop {
                if (cmpeq:boolean(and:int(var_9_61:int, ldc:int(4096)), ldc:int(0))) {
                    var_9_61 = and:int(var_9_61:int, ldc:int(-87418816))
                }
                else {
                    var_9_61 = and:int(var_9_61:int, ldc:int(-2012227252))
                    
                    if (invokeinterface:boolean(Iterator::hasNext, var_14_AD:Iterator)) {
                        var_15_F6 = checkcast:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56.class, invokeinterface:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::next, var_14_AD:Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>))
                        var_16_102 = invokevirtual:int(\u8bb0\u759a\u3bc9\u527a\ube23\u5140::\ub19c\ub171\u7ce1\u99f7\ud51e\ub18d, var_11_6A:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\u8bb0\u759a\u3bc9\u527a\ube23\u5140], getstatic:\u3a62\u7330\uafe7\u5db4\u12cb(\u3a62\u7330\uafe7\u5db4\u12cb::\u836c\ud4fe\uc2e8\u3504\u6d69\u3504), var_15_F6:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                        var_18_11E = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u7330\u9033\u7d52\u71ae\u4f52\u760c, add:float(mul:float(div:float(i2f:float(sub:int(ldc:int(15), var_16_102:int)), ldc:float(15.0f)), ldc:float(0.5f)), ldc:float(0.16f)), ldc:float(0.9f), ldc:float(0.9f))
                        var_19_128 = invokestatic:long(\u5d20\ubefe\u8640\u183a\u6ec6\u93a2::\u71ae\u2dcc\u4c2b\ucef1\u718f\u74b1, invokevirtual:long(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\ubff1\u59ec\u183a\ub32d\u4e72\u0800, var_15_F6:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
                        
                        if (invokeinterface:boolean(LongSet::add, var_13_8D:LongSet, var_19_128:long)) {
                            invokestatic:void(\u64f2\uf995\u8258\ub102\u983f\u1833::\u6b5f\uc2bd\uff55\u7049\uff55\uc7fe, invokevirtual:String(\ube23\u51b2\u92ee\u6435\u8308\u1833::\u4e72\ubded\u3e2a\u4daf\ube23\ud7e8, invokevirtual:\ube23\u51b2\u92ee\u6435\u8308\u1833(\u34df\ua068\u72f1\u527a\u0b8e::\ufe34\u3d4b\u946b\u74b1\ud4fe\ucb79, invokevirtual:\u34df\ua068\u72f1\u527a\u0b8e(\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd::\u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1, var_11_6A:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd])), getstatic:\u3a62\u7330\uafe7\u5db4\u12cb(\u3a62\u7330\uafe7\u5db4\u12cb::\u836c\ud4fe\uc2e8\u3504\u6d69\u3504), invokestatic:\u5d20\ubefe\u8640\u183a\u6ec6\u93a2(\u5d20\ubefe\u8640\u183a\u6ec6\u93a2::\uc910\u4975\ub7dc\u8258\u839e\u99f7, var_19_128:long)), i2d:double(add:int(mul:int(invokestatic:int(\u5d20\ubefe\u8640\u183a\u6ec6\u93a2::\u392e\u4975\uc87f\u3c25\u960f\u965f, var_19_128:long), ldc:int(16)), ldc:int(8))), i2d:double(add:int(mul:int(invokestatic:int(\u5d20\ubefe\u8640\u183a\u6ec6\u93a2::\u8df4\uc4d2\u92ee\u8d98\u8350\ucfaf, var_19_128:long), ldc:int(16)), ldc:int(8))), i2d:double(add:int(mul:int(invokestatic:int(\u5d20\ubefe\u8640\u183a\u6ec6\u93a2::\u4975\u4975\u3d4b\u156b\u74b1\uc4d2, var_19_128:long), ldc:int(16)), ldc:int(8))), ldc:int(16711680), ldc:float(0.3f))
                        }
                        
                        var_9_13B = and:int(var_9_61:int, ldc:int(-1232249379))
                        
                        if (cmpne:boolean(var_16_102:int, ldc:int(15))) {
                            invokestatic:void(\u64f2\uf995\u8258\ub102\u983f\u1833::\u6b5f\uc2bd\uff55\u7049\uff55\uc7fe, invokestatic:String(String::valueOf, var_16_102:int), add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, var_15_F6:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), ldc:double(0.5)), add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, var_15_F6:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), ldc:double(0.25)), add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, var_15_F6:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), ldc:double(0.5)), var_18_11E:int)
                        }
                        
                        var_9_61 = and:int(var_9_13B:int, ldc:int(1697537964))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_9_61:int, ldc:int(65536)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u97e6\u9255\u59ec\ube23\u64f2\ub32d)
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\uae87\ua3b4\u88c5\u8413\u7d52\u647c)
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
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ud523\u7330\ub7dc\ud36e\u12cb\u6c52(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_68A : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C3 : double
        var_3_D5 : int
        var_11_E6 : int
        var_14_110 : double
        var_16_114 : int
        var_12_10C : double
        var_17_695 : int
        
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
        var_3_68A = and:int(ldc:int(1709463862), ldc:int(1153716541))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6b5f\uc7fe\u6c52\u839e\u97e6\u88c5[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4096)), ldc:int(0))) {
            var_3_68A = and:int(var_3_68A:int, ldc:int(1412016894))
        }
        else {
            var_3_68A = and:int(var_3_68A:int, ldc:int(-867664474))
            var_5_85 = and:int(ldc:int(-1155), ldc:int(1154))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-14773), ldc:int(14644)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C3 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D5 = and:int(var_3_68A:int, ldc:int(-547655348))
                    var_9_C3 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E6 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E6:int, sub:int(var_6_8C:int, xor:int(ldc:int(16386), ldc:int(16387)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E6:int, and:int(ldc:int(7209), ldc:int(9025)))), var_7_9B:double))) {
                        inc:int(var_11_E6, ldc:int(1))
                    }
                    
                    var_3_68A = and:int(var_3_D5:int, ldc:int(2002615150))
                    var_14_110 = var_7_9B:double
                    var_16_114 = var_11_E6:int
                }
                else {
                    var_11_E6 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(29057), ldc:int(1065)))
                    var_12_10C = var_14_110 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_114 = var_11_E6:int, var_6_8C:int)) {
                        var_9_C3 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E6:int)
                        var_16_114 = var_11_E6:int
                        var_14_110 = var_12_10C:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1325687522))
                        goto(Label_1580)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(595264440))
                        goto(Label_1433)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1539430979))
                        goto(Label_1306)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1163)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0861)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1594652841))
                        goto(Label_0730)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(531754642))
                        goto(Label_0598)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-145760979))
                        
                        if (cmplt:boolean(var_16_114:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0598)
                            }
                            
                            goto(Label_0861)
                        }
                    }
                    
                    Label_0415:
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1730413082))
                        goto(Label_1580)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-279953453))
                        goto(Label_1433)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(256)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1461890427))
                        goto(Label_1306)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(2058656511))
                        goto(Label_1163)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0861)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-136076320))
                        goto(Label_0730)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(1514572353))
                            loopcontinue()
                        }
                        
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-715589857))
                        var_11_E6 = and:int(ldc:int(12494), ldc:int(-13023))
                        goto(Label_1569)
                    }
                    
                    Label_0598:
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1580)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1433)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(143399296))
                        goto(Label_1306)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(293262829))
                        goto(Label_1163)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1926021873))
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0861)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(1)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-827629255))
                            goto(Label_0415)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(1803924771))
                            loopcontinue()
                        }
                        
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1172960070))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_110 = var_9_C3:double
                            goto(Label_0861)
                        }
                    }
                    
                    Label_0730:
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1580)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1433)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1275000573))
                        goto(Label_1306)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1163)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(657792992))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-696999371))
                            goto(Label_0598)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0415)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(256)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-1911613609))
                            loopcontinue()
                        }
                        
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1171422589))
                        var_14_110 = mul:double(ldc:double(0.5), add:double(var_9_C3:double, var_14_110:double))
                    }
                    
                    Label_0861:
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1851699292))
                        goto(Label_1580)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1448331629))
                        goto(Label_1433)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-601091642))
                        goto(Label_1306)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1163)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(1)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(1087422468))
                            goto(Label_0730)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0598)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0415)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1817966055))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E6 = and:int(ldc:int(65), ldc:int(2741))
                                goto(Label_1163)
                            }
                        }
                    }
                    
                    Label_0986:
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1749291244))
                        goto(Label_1580)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1433)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(256)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-683592527))
                        goto(Label_1306)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1099324096))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(31244652))
                            goto(Label_0861)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0730)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(180581383))
                            goto(Label_0598)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(2039400781))
                            goto(Label_0415)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1967315444))
                        var_11_E6 = and:int(ldc:int(-10807), ldc:int(10774))
                    }
                    
                    Label_1163:
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(675323088))
                        goto(Label_1580)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1433)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1741090082))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(1)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-473686377))
                            goto(Label_0986)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(1488300852))
                            goto(Label_0861)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0730)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-415454813))
                            goto(Label_0598)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-930357654))
                            goto(Label_0415)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-419760684))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E6:int, ldc:int(0))) {
                                goto(Label_1433)
                            }
                        }
                    }
                    
                    Label_1306:
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1580)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(622712102))
                            goto(Label_1163)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0986)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0861)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0730)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0598)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-1984862542))
                            goto(Label_0415)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(501676744))
                            loopcontinue()
                        }
                        
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1827762967))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_110:double, var_5_85:int, var_16_114:int)
                        goto(Label_1569)
                    }
                    
                    Label_1433:
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1580)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(51715280))
                        goto(Label_1306)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-11204302))
                        goto(Label_1163)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1469511382))
                        goto(Label_0861)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0730)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-6721914))
                        goto(Label_0598)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0415)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4194304)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_68A = and:int(var_3_68A:int, ldc:int(-162303012))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_110:double, ldc:double(0.0))
                    Label_1569:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_695 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E6:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1580:
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(433048235))
                        goto(Label_1433)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1306)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1163)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0861)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1606122395))
                        goto(Label_0730)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0598)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0415)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(2001361189))
                        var_17_695 = add:int(var_16_114:int, xor:int(ldc:int(5120), ldc:int(5121)))
                        looporswitchbreak()
                    }
                }
                
                var_3_68A = and:int(var_3_68A:int, ldc:int(-152896003))
                
                if (cmple:boolean(var_5_85 = var_17_695:int, sub:int(var_6_8C:int, and:int(ldc:int(8277), ldc:int(1825))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(67108864)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
