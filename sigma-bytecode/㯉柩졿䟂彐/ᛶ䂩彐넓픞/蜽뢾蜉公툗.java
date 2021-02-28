public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u873d\ub8be\u8709\u516c\ud217 {
    public void \u873d\ub8be\u8709\u516c\ud217(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u56bd\u0a06\u3bc9\u72f1\u1833 p0) {
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
            putfield:\u56bd\u0a06\u3bc9\u72f1\u1833(\u873d\ub8be\u8709\u516c\ud217::\u8308\u8258\u446c\u4179\ufe34, this:\u873d\ub8be\u8709\u516c\ud217, p0:\u56bd\u0a06\u3bc9\u72f1\u1833)
            invokespecial:Object(Object::<init>, this:\u873d\ub8be\u8709\u516c\ud217)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uae87\u5245\ucb79\u5654\u9af2\u9033(java.lang.Object[] p0) {
        var_2_64 : int
        var_4_71 : \uc910\ub6ab\uafe7\ud217\u7330\u600f
        var_2_2EF : int
        var_5_2E2 : \uc910\ub6ab\uafe7\ud217\u7330\u600f
        stack_349_0 : \u960f\u6ec6\u3e75\u8d90\u36d3 [generated]
        stack_349_1 : String [generated]
        expr_33B : Object[] [generated]
        stack_359_0 : Throwable [generated]
        
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
        var_2_64 = and:int(and:int(ldc:int(1556070340), ldc:int(-35250193)), ldc:int(-155197499))
        var_4_71 = checkcast:\uc910\ub6ab\uafe7\ud217\u7330\u600f(\u516c\u3d64\u718f\ub171\u6b5f.\uc910\ub6ab\uafe7\ud217\u7330\u600f.class, loadelement:Object[expected:\uc910\ub6ab\uafe7\ud217\u7330\u600f](p0:Object[], and:int(ldc:int(-10663), ldc:int(2470))))
        
        loop {
            Label_0115:
            
            if (cmpeq:boolean(and:int(var_2_64:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0652)
            }
            
            if (cmpne:boolean(and:int(var_2_64:int, ldc:int(16777216)), ldc:int(0))) {
                var_2_64 = and:int(var_2_64:int, ldc:int(-1076029368))
                goto(Label_0564)
            }
            
            if (cmpeq:boolean(and:int(var_2_64:int, ldc:int(64)), ldc:int(0))) {
                var_2_64 = and:int(var_2_64:int, ldc:int(-1729047073))
                goto(Label_0444)
            }
            
            if (cmpeq:boolean(and:int(var_2_64:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0365)
            }
            
            if (cmpeq:boolean(and:int(var_2_64:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0278)
            }
            
            if (cmpeq:boolean(and:int(var_2_64:int, ldc:int(4096)), ldc:int(0))) {
                var_2_64 = and:int(var_2_64:int, ldc:int(-1065499047))
            }
            else {
                var_2_64 = and:int(var_2_64:int, ldc:int(2125783039))
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), var_4_71:\uc910\ub6ab\uafe7\ud217\u7330\u600f[expected:Object])
            }
            
            Label_0194:
            
            if (cmpeq:boolean(and:int(var_2_64:int, ldc:int(1073741824)), ldc:int(0))) {
                var_2_64 = and:int(var_2_64:int, ldc:int(481371053))
                goto(Label_0652)
            }
            
            if (cmpeq:boolean(and:int(var_2_64:int, ldc:int(67108864)), ldc:int(0))) {
                var_2_64 = and:int(var_2_64:int, ldc:int(-102275175))
                goto(Label_0564)
            }
            
            if (cmpne:boolean(and:int(var_2_64:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_0444)
            }
            
            if (cmpne:boolean(and:int(var_2_64:int, ldc:int(16777216)), ldc:int(0))) {
                var_2_64 = and:int(var_2_64:int, ldc:int(-571621795))
                goto(Label_0365)
            }
            
            if (cmpne:boolean(and:int(var_2_64:int, ldc:int(1073741824)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_2_64:int, ldc:int(128)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_64 = and:int(var_2_64:int, ldc:int(-585670713))
                
                if (cmpeq:boolean(getfield:\u385b\ud7e8\u71ae\u7043\uc3e3\u3776(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7330\u6b5f\u3bd6\uc910\u69d9\u7ce1, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u56bd\u0a06\u3bc9\u72f1\u1833::\ubefe\uc31c\uf94d\u385b\u88c5, getfield:\u56bd\u0a06\u3bc9\u72f1\u1833(\u873d\ub8be\u8709\u516c\ud217::\u8308\u8258\u446c\u4179\ufe34, this:\u873d\ub8be\u8709\u516c\ud217))), aconstnull:\u385b\ud7e8\u71ae\u7043\uc3e3\u3776())) {
                    goto(Label_0444)
                }
            }
            
            Label_0278:
            
            if (cmpne:boolean(and:int(var_2_64:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0652)
            }
            
            if (cmpeq:boolean(and:int(var_2_64:int, ldc:int(64)), ldc:int(0))) {
                var_2_64 = and:int(var_2_64:int, ldc:int(1438575811))
                goto(Label_0564)
            }
            
            if (cmpeq:boolean(and:int(var_2_64:int, ldc:int(2048)), ldc:int(0))) {
                var_2_64 = and:int(var_2_64:int, ldc:int(-1528098500))
                goto(Label_0444)
            }
            
            if (cmpne:boolean(and:int(var_2_64:int, ldc:int(8)), ldc:int(0))) {
                var_2_64 = and:int(var_2_64:int, ldc:int(-828306831))
            }
            else {
                if (cmpeq:boolean(and:int(var_2_64:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0194)
                }
                
                if (cmpne:boolean(and:int(var_2_64:int, ldc:int(8)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_64 = and:int(var_2_64:int, ldc:int(1460428791))
                
                if (cmpne:boolean(invokevirtual:GameProfile(\u385b\ud7e8\u71ae\u7043\uc3e3\u3776::\uc238\u9a18\u71f1\ub83f\u527a\u9033, getfield:\u385b\ud7e8\u71ae\u7043\uc3e3\u3776(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7330\u6b5f\u3bd6\uc910\u69d9\u7ce1, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u56bd\u0a06\u3bc9\u72f1\u1833::\ubefe\uc31c\uf94d\u385b\u88c5, getfield:\u56bd\u0a06\u3bc9\u72f1\u1833(\u873d\ub8be\u8709\u516c\ud217::\u8308\u8258\u446c\u4179\ufe34, this:\u873d\ub8be\u8709\u516c\ud217)))), aconstnull:GameProfile())) {
                    goto(Label_0528)
                }
            }
            
            Label_0365:
            
            if (cmpne:boolean(and:int(var_2_64:int, ldc:int(8)), ldc:int(0))) {
                var_2_64 = and:int(var_2_64:int, ldc:int(-1183163474))
                goto(Label_0652)
            }
            
            if (cmpne:boolean(and:int(var_2_64:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_0564)
            }
            
            if (cmpne:boolean(and:int(var_2_64:int, ldc:int(536870912)), ldc:int(0))) {
                var_2_64 = and:int(var_2_64:int, ldc:int(1426474893))
            }
            else {
                if (cmpeq:boolean(and:int(var_2_64:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_0278)
                }
                
                if (cmpeq:boolean(and:int(var_2_64:int, ldc:int(128)), ldc:int(0))) {
                    var_2_64 = and:int(var_2_64:int, ldc:int(1715895325))
                    goto(Label_0194)
                }
                
                if (cmpeq:boolean(and:int(var_2_64:int, ldc:int(64)), ldc:int(0))) {
                    var_2_64 = and:int(var_2_64:int, ldc:int(681056788))
                    loopcontinue()
                }
                
                var_2_64 = and:int(var_2_64:int, ldc:int(1463590852))
            }
            
            Label_0444:
            
            if (cmpeq:boolean(and:int(var_2_64:int, ldc:int(4096)), ldc:int(0))) {
                var_2_64 = and:int(var_2_64:int, ldc:int(-1752675912))
                goto(Label_0652)
            }
            
            if (cmpeq:boolean(and:int(var_2_64:int, ldc:int(262144)), ldc:int(0))) {
                var_2_64 = and:int(var_2_64:int, ldc:int(1746355581))
                goto(Label_0564)
            }
            
            if (cmpeq:boolean(and:int(var_2_64:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0365)
            }
            
            if (cmpeq:boolean(and:int(var_2_64:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0278)
            }
            
            if (cmpne:boolean(and:int(var_2_64:int, ldc:int(4194304)), ldc:int(0))) {
                var_2_64 = and:int(var_2_64:int, ldc:int(-166035261))
                goto(Label_0194)
            }
            
            if (cmpeq:boolean(and:int(var_2_64:int, ldc:int(2147483647)), ldc:int(0))) {
                var_2_64 = and:int(var_2_64:int, ldc:int(152607940))
                loopcontinue()
            }
            
            return:void()
            
            try {
                Label_0528:
                invokestatic:void(\u56bd\u0a06\u3bc9\u72f1\u1833::\u6cfe\u839e\u965f\u8640\u6198, getfield:\u56bd\u0a06\u3bc9\u72f1\u1833(\u873d\ub8be\u8709\u516c\ud217::\u8308\u8258\u446c\u4179\ufe34, this:\u873d\ub8be\u8709\u516c\ud217), invokevirtual:GameProfile(\u385b\ud7e8\u71ae\u7043\uc3e3\u3776::\uc238\u9a18\u71f1\ub83f\u527a\u9033, getfield:\u385b\ud7e8\u71ae\u7043\uc3e3\u3776(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7330\u6b5f\u3bd6\uc910\u69d9\u7ce1, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u56bd\u0a06\u3bc9\u72f1\u1833::\ubefe\uc31c\uf94d\u385b\u88c5, getfield:\u56bd\u0a06\u3bc9\u72f1\u1833(\u873d\ub8be\u8709\u516c\ud217::\u8308\u8258\u446c\u4179\ufe34, this:\u873d\ub8be\u8709\u516c\ud217)))), invokevirtual:String(\uc910\ub6ab\uafe7\ud217\u7330\u600f::\ud51e\ub70c\u647c\u9255\u5654\u4f4a, var_4_71:\uc910\ub6ab\uafe7\ud217\u7330\u600f, loadelement:String(getstatic:String[](\u873d\ub8be\u8709\u516c\ud217::\u93a2\u12b2\ub1b9\ubf56\u5fe1), and:int(ldc:int(15433), ldc:int(-15482)))))
                Label_0652:
                
                do {
                    Label_0564:
                    
                    if (cmpeq:boolean(and:int(var_2_64:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_2_64:int, ldc:int(64)), ldc:int(0))) {
                            var_2_64 = and:int(var_2_64:int, ldc:int(676239898))
                            goto(Label_0444)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_64:int, ldc:int(4096)), ldc:int(0))) {
                            var_2_64 = and:int(var_2_64:int, ldc:int(-1711491140))
                            goto(Label_0365)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_64:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0278)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_64:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0194)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_64:int, ldc:int(512)), ldc:int(0))) {
                            var_2_64 = and:int(var_2_64:int, ldc:int(-1907299350))
                            loopcontinue(Label_0115)
                        }
                        
                        var_2_64 = and:int(var_2_64:int, ldc:int(-162750525))
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), loadelement:String(getstatic:String[](\u873d\ub8be\u8709\u516c\ud217::\u93a2\u12b2\ub1b9\ubf56\u5fe1), and:int(ldc:int(5761), ldc:int(24681))))
                    }
                } while (cmpne:boolean(and:int(var_2_64:int, ldc:int(32)), ldc:int(0)))
                
                if (cmpne:boolean(and:int(var_2_64:int, ldc:int(16)), ldc:int(0))) {
                    var_2_64 = and:int(var_2_64:int, ldc:int(1103421794))
                    goto(Label_0444)
                }
                
                if (cmpeq:boolean(and:int(var_2_64:int, ldc:int(67108864)), ldc:int(0))) {
                    var_2_64 = and:int(var_2_64:int, ldc:int(436675305))
                    goto(Label_0365)
                }
                
                if (cmpeq:boolean(and:int(var_2_64:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_2_64 = and:int(var_2_64:int, ldc:int(-968464518))
                    goto(Label_0278)
                }
                
                if (cmpeq:boolean(and:int(var_2_64:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_2_64 = and:int(var_2_64:int, ldc:int(-1151329607))
                    goto(Label_0194)
                }
                
                if (cmpeq:boolean(and:int(var_2_64:int, ldc:int(64)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_2EF = and:int(var_2_64:int, ldc:int(1451638722))
                var_5_2E2 = initobject:\uc910\ub6ab\uafe7\ud217\u7330\u600f(\uc910\ub6ab\uafe7\ud217\u7330\u600f::<init>)
                
                loop {
                    if (cmpeq:boolean(and:int(var_2_2EF:int, ldc:int(536870912)), ldc:int(0))) {
                        var_2_2EF = and:int(var_2_2EF:int, ldc:int(1417478131))
                        invokevirtual:\uc910\ub6ab\uafe7\ud217\u7330\u600f(\uc910\ub6ab\uafe7\ud217\u7330\u600f::\uae87\ud7e8\u5fe1\uf9c5\u7873\u7049, var_5_2E2:\uc910\ub6ab\uafe7\ud217\u7330\u600f, loadelement:String(getstatic:String[](\u873d\ub8be\u8709\u516c\ud217::\u93a2\u12b2\ub1b9\ubf56\u5fe1), xor:int(ldc:int(18505), ldc:int(18507))), invokevirtual:String[expected:Object](\u385b\ud7e8\u71ae\u7043\uc3e3\u3776::\ub7dc\u6d99\u516c\ub32d\ub113\u7ce1, getfield:\u385b\ud7e8\u71ae\u7043\uc3e3\u3776(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7330\u6b5f\u3bd6\uc910\u69d9\u7ce1, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u56bd\u0a06\u3bc9\u72f1\u1833::\ubefe\uc31c\uf94d\u385b\u88c5, getfield:\u56bd\u0a06\u3bc9\u72f1\u1833(\u873d\ub8be\u8709\u516c\ud217::\u8308\u8258\u446c\u4179\ufe34, this:\u873d\ub8be\u8709\u516c\ud217)))))
                    }
                    
                    if (cmpne:boolean(and:int(var_2_2EF:int, ldc:int(512)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_2_2EF = and:int(var_2_2EF:int, ldc:int(1305275994))
                }
                
                stack_349_0 = getfield:\u960f\u6ec6\u3e75\u8d90\u36d3(\u56bd\u0a06\u3bc9\u72f1\u1833::\u4f4a\u7af6\u6198\u97e6\u3711, getfield:\u56bd\u0a06\u3bc9\u72f1\u1833(\u873d\ub8be\u8709\u516c\ud217::\u8308\u8258\u446c\u4179\ufe34, this:\u873d\ub8be\u8709\u516c\ud217))
                stack_349_1 = loadelement:String(getstatic:String[](\u873d\ub8be\u8709\u516c\ud217::\u93a2\u12b2\ub1b9\ubf56\u5fe1), and:int(ldc:int(5059), ldc:int(35)))
                expr_33B = newarray:Object[](java.lang.Object.class, and:int(ldc:int(3), ldc:int(25225)))
                storeelement:Object(expr_33B:Object[], and:int(ldc:int(13635), ldc:int(-30020)), var_5_2E2:\uc910\ub6ab\uafe7\ud217\u7330\u600f[expected:Object])
                invokevirtual:\u8350\u183a\u6b5f\uc229\ud12e(\u960f\u6ec6\u3e75\u8d90\u36d3::\u8350\u76bc\u67e9\uff55\u8bb0\u385b, stack_349_0:\u960f\u6ec6\u3e75\u8d90\u36d3, stack_349_1:String, expr_33B:Object[])
            }
            catch (\u6ec6\ubb2b\uf94d\u6d99\u4f52.\ud4fe\uc246\u92ff\u40a9\u0800\u40a9 | com.mojang.authlib.exceptions.AuthenticationException | java.io.IOException ex_359) {
                invokevirtual:void(Throwable::printStackTrace, stack_359_0:Throwable)
            }
            
            invokevirtual:void(\u392e\u40a9\u4bc8\u9a18\uc31c::\u64f2\u183a\u92ee\u4d85\ub171, invokevirtual:\u392e\u40a9\u4bc8\u9a18\uc31c(\u6b0d\ua068\uc4d2\u5245\u4d85::\u624e\u494c\u0b8e\u56bd\u5654, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), initobject:\u97e6\ubf56\u61a4\ub7dc\u93a2(\u97e6\ubf56\u61a4\ub7dc\u93a2::<init>, loadelement:String(getstatic:String[](\u873d\ub8be\u8709\u516c\ud217::\u93a2\u12b2\ub1b9\ubf56\u5fe1), and:int(ldc:int(4556), ldc:int(516))), loadelement:String(getstatic:String[](\u873d\ub8be\u8709\u516c\ud217::\u93a2\u12b2\ub1b9\ubf56\u5fe1), xor:int(ldc:int(790), ldc:int(787))), getstatic:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe(\u5db4\u1187\u647c\u9255\u8258::\u8c8a\uc910\u8413\u8aa5\u494c)))
        }
    }
    
    static {
        var_0_5F : int
        expr_6B : int [generated]
        stack_95_0 : byte[] [generated]
        stack_97_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_C3_0 : byte[] [generated]
        stack_EE_0 : byte[] [generated]
        stack_1D8_0 : byte[] [generated]
        stack_238_0 : byte[] [generated]
        stack_2AE_0 : byte[] [generated]
        var_4_1BB : int
        var_3_1C0 : byte[]
        var_5_1C1 : int
        expr_1DE : byte [generated]
        var_0_22E : int
        expr_238 : byte [generated]
        stack_27C_2 : byte [generated]
        stack_25B_0 : byte [generated]
        var_0_7B : int
        expr_97 : int [generated]
        var_2_C1 : byte[]
        expr_C5 : int [generated]
        var_3_29C : byte[]
        var_5_29D : int
        var_3_FA : String
        stack_1B4_0 : String[] [generated]
        expr_10C : String[] [generated]
        
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
        var_0_5F = and:int(ldc:int(619288773), ldc:int(2131491343))
        expr_6B = arraylength:int(stack_95_0 = stack_97_0 = stack_C1_0 = stack_C3_0 = stack_EE_0 = stack_1D8_0 = stack_238_0 = stack_2AE_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("n/YA4RAMqiISWcXXePQOW9/2AOHv7ywKDgYMfA4EVd0OMNkIBgw8CATJ6wT8EgIG9PbOrna1")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1BB = expr_6B:int
        var_3_1C0 = newarray:byte[](byte.class, expr_6B:int)
        var_5_1C1 = expr_6B:int
        Label_0451:
        
        while (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(16384)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(771176925))
            var_5_1C1 = add:int(var_5_1C1:int, ldc:int(-1))
            expr_1DE = xor:byte(add:byte(loadelement:byte(stack_1D8_0:byte[], var_5_1C1:int), ldc:byte(12)), ldc:byte(24))
            storeelement:byte(var_3_1C0:byte[], var_5_1C1:int, or:int(and:int(shl:int(expr_1DE:byte, xor:int(ldc:int(-15840), ldc:int(-15836))), ldc:int(-16)), and:int(shr:int(expr_1DE:byte[expected:int], xor:int(ldc:int(4098), ldc:int(4102))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_1C1:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_97_0 = stack_95_0 = stack_C1_0 = stack_C3_0 = stack_EE_0 = stack_1D8_0 = stack_238_0 = stack_2AE_0 = var_3_1C0:byte[]
            goto(Label_0112)
        }
        
        Label_0547:
        
        while (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_22E = and:int(var_0_5F:int, ldc:int(873183534))
            var_5_1C1 = add:int(var_5_1C1:int, ldc:int(-1))
            expr_238 = stack_27C_2 = loadelement(stack_238_0, var_5_1C1)
            
            if (cmplt:boolean(add:int(add:int(var_5_1C1:int, ldc:int(3)), neg:int(var_4_1BB:int)), ldc:int(0))) {
                stack_27C_2 = stack_25B_0 = add:byte(expr_238:byte, loadelement:byte(var_3_1C0:byte[], add:int(var_5_1C1:int, ldc:int(3))))
                goto(Label_0619)
            }
            
            Label_0581:
            
            if (cmpeq:boolean(and:int(var_0_22E:int, ldc:int(2048)), ldc:int(0))) {
                var_0_22E = and:int(var_0_22E:int, ldc:int(1058831191))
            }
            else {
                var_0_22E = and:int(var_0_22E:int, ldc:int(1035017581))
                stack_27C_2 = stack_25B_0 = add:byte(expr_238:byte, ldc:byte(3))
            }
            
            Label_0619:
            
            if (cmpne:boolean(and:int(var_0_22E:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0581)
            }
            
            var_0_5F = and:int(var_0_22E:int, ldc:int(1733647540))
            storeelement:byte(var_3_1C0:byte[], var_5_1C1:int, stack_27C_2:byte)
            
            if (cmpne:boolean(var_5_1C1:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_97_0 = stack_95_0 = stack_C1_0 = stack_C3_0 = stack_EE_0 = stack_1D8_0 = stack_238_0 = stack_2AE_0 = var_3_1C0:byte[]
            goto(Label_0156)
        }
        
        goto(Label_0451)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(4)), ldc:int(0))) {
            var_0_7B = and:int(var_0_5F:int, ldc:int(-581634636))
            goto(Label_0202)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(1245164572))
        }
        else {
            var_0_5F = and:int(var_0_5F:int, ldc:int(665393271))
            expr_97 = arraylength:int(stack_97_0:byte[])
            
            if (cmpne:boolean(expr_97:int, ldc:int(0))) {
                var_4_1BB = expr_97:int
                var_3_1C0 = newarray:byte[](byte.class, expr_97:int)
                var_5_1C1 = expr_97:int
                goto(Label_0547)
            }
        }
        
        Label_0156:
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_7B = and:int(var_0_5F:int, ldc:int(1473940953))
        }
        else {
            if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(1048576)), ldc:int(0))) {
                var_0_5F = and:int(var_0_5F:int, ldc:int(-864463353))
                goto(Label_0112)
            }
            
            var_0_7B = and:int(var_0_5F:int, ldc:int(-269803914))
            var_2_C1 = stack_C1_0:byte[]
            expr_C5 = add:int(arraylength:int(stack_C3_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_C5:int, ldc:int(0))) {
                var_3_29C = newarray:byte[](byte.class, expr_C5:int)
                var_5_29D = expr_C5:int
                
                loop {
                    var_0_7B = and:int(var_0_7B:int, ldc:int(2100018774))
                    var_5_29D = add:int(var_5_29D:int, ldc:int(-1))
                    storeelement:byte(var_3_29C:byte[], var_5_29D:int, add:int(shl:int(loadelement:byte(stack_2AE_0:byte[], var_5_29D:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_C1:byte[], add:int(var_5_29D:int, and:int(ldc:int(4427), ldc:int(26641)))), ldc:int(5)), xor:int(ldc:int(32), ldc:int(39)))))
                    
                    if (cmpne:boolean(var_5_29D:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_97_0 = stack_95_0 = stack_C1_0 = stack_C3_0 = stack_EE_0 = stack_1D8_0 = stack_238_0 = stack_2AE_0 = var_3_29C:byte[]
            }
        }
        
        Label_0202:
        
        if (cmpne:boolean(and:int(var_0_7B:int, ldc:int(262144)), ldc:int(0))) {
            var_0_5F = and:int(var_0_7B:int, ldc:int(1821118741))
            goto(Label_0156)
        }
        
        if (cmpne:boolean(and:int(var_0_7B:int, ldc:int(256)), ldc:int(0))) {
            var_0_5F = and:int(var_0_7B:int, ldc:int(80628345))
            goto(Label_0112)
        }
        
        var_3_FA = initobject:String(String::<init>, stack_EE_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_1B4_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-32731), ldc:int(-32733)))
        expr_10C = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(2306), ldc:int(2308)))
        storeelement:String(expr_10C:String[], xor:int(ldc:int(1027), ldc:int(1030)), invokevirtual:String[expected:String](String::substring, var_3_FA:String, and:int(ldc:int(-31088), ldc:int(18793)), xor:int(ldc:int(545), ldc:int(555))))
        storeelement:String(expr_10C:String[], and:int(ldc:int(4292), ldc:int(11782)), invokevirtual:String[expected:String](String::substring, var_3_FA:String, and:int(ldc:int(6154), ldc:int(16586)), xor:int(ldc:int(4365), ldc:int(4378))))
        storeelement:String(expr_10C:String[], and:int(ldc:int(1507), ldc:int(525)), invokevirtual:String[expected:String](String::substring, var_3_FA:String, xor:int(ldc:int(73), ldc:int(94)), xor:int(ldc:int(83), ldc:int(75))))
        storeelement:String(expr_10C:String[], xor:int(ldc:int(5120), ldc:int(5123)), invokevirtual:String[expected:String](String::substring, var_3_FA:String, xor:int(ldc:int(3091), ldc:int(3083)), and:int(ldc:int(10355), ldc:int(5415))))
        storeelement:String(expr_10C:String[], and:int(ldc:int(-28171), ldc:int(11786)), invokevirtual:String[expected:String](String::substring, var_3_FA:String, xor:int(ldc:int(16437), ldc:int(16406)), and:int(ldc:int(1597), ldc:int(29039))))
        storeelement:String(expr_10C:String[], xor:int(ldc:int(8204), ldc:int(8206)), invokevirtual:String[expected:String](String::substring, var_3_FA:String, and:int(ldc:int(12335), ldc:int(1085)), and:int(ldc:int(639), ldc:int(309))))
        putstatic:String[](\u873d\ub8be\u8709\u516c\ud217::\u93a2\u12b2\ub1b9\ubf56\u5fe1, expr_10C:String[])
    }
    
    public void \ub32d\u56bd\uc3e3\u97b7\u960f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_68E : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_699 : int
        
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
        var_3_68E = and:int(ldc:int(1632535624), ldc:int(-1088526888))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u873d\ub8be\u8709\u516c\ud217[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(8388608)), ldc:int(0))) {
            var_3_68E = and:int(var_3_68E:int, ldc:int(2007990424))
            var_5_81 = and:int(ldc:int(-20978), ldc:int(16881))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-11895), ldc:int(11858)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_68E:int, ldc:int(1635654033))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, and:int(ldc:int(2209), ldc:int(21519)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(4885), ldc:int(11)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_68E = and:int(var_3_DA:int, ldc:int(-1085338299))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(12288), ldc:int(12289)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1597)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1428)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(1313480731))
                        goto(Label_1291)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1135)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0991)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(1685496377))
                        goto(Label_0845)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0699)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0553)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(16)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-9177818))
                    }
                    else {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-1112647607))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0553)
                            }
                            
                            goto(Label_0845)
                        }
                    }
                    
                    Label_0395:
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(862293858))
                        goto(Label_1597)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1428)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1291)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1135)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0991)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(2056278871))
                        goto(Label_0845)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0699)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-2110445499))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(-1399269340))
                            loopcontinue()
                        }
                        
                        var_3_68E = and:int(var_3_68E:int, ldc:int(1635669677))
                        var_11_EB = and:int(ldc:int(-2389), ldc:int(2388))
                        goto(Label_1586)
                    }
                    
                    Label_0553:
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(16)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-2092044447))
                        goto(Label_1597)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-1748143794))
                        goto(Label_1428)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1291)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(120150642))
                        goto(Label_1135)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0991)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-345349709))
                        goto(Label_0845)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-781017454))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(-431662481))
                            goto(Label_0395)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(1277446590))
                            loopcontinue()
                        }
                        
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-1321274703))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0845)
                        }
                    }
                    
                    Label_0699:
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1597)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-1624438408))
                        goto(Label_1428)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-1515381451))
                        goto(Label_1291)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-1046825875))
                        goto(Label_1135)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-777229998))
                        goto(Label_0991)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(739444408))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(-1189325224))
                            goto(Label_0553)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0395)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68E = and:int(var_3_68E:int, ldc:int(1833834085))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0845:
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(255557638))
                        goto(Label_1597)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1428)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(16)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(1920159671))
                        goto(Label_1291)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(80130183))
                        goto(Label_1135)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(1794756481))
                            goto(Label_0699)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(16)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(-589755791))
                            goto(Label_0553)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(927677346))
                            goto(Label_0395)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(2)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(1950177462))
                            loopcontinue()
                        }
                        
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-1511064136))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = xor:int(ldc:int(1091), ldc:int(1090))
                                goto(Label_1135)
                            }
                        }
                    }
                    
                    Label_0991:
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1597)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(1901725317))
                        goto(Label_1428)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1291)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0845)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0699)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0553)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(1014097042))
                            goto(Label_0395)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(1991031947))
                            loopcontinue()
                        }
                        
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-208746527))
                        var_11_EB = and:int(ldc:int(-21152), ldc:int(21145))
                    }
                    
                    Label_1135:
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-1155383809))
                        goto(Label_1597)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1428)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(1599869947))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(1891460035))
                            goto(Label_0991)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(-947685700))
                            goto(Label_0845)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(2)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(-827409191))
                            goto(Label_0699)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(383916659))
                            goto(Label_0553)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(16)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(-899616927))
                            goto(Label_0395)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(2131634660))
                            loopcontinue()
                        }
                        
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-146879869))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1428)
                            }
                        }
                    }
                    
                    Label_1291:
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1597)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-1093685255))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(-321254422))
                            goto(Label_1135)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0991)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0845)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(-1146226211))
                            goto(Label_0699)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0553)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(-1495053145))
                            goto(Label_0395)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(2)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(1057834410))
                            loopcontinue()
                        }
                        
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-1586588485))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                        goto(Label_1586)
                    }
                    
                    Label_1428:
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(1292582419))
                        goto(Label_1597)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1291)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(1091561121))
                        goto(Label_1135)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(1125306293))
                        goto(Label_0991)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-2114411908))
                        goto(Label_0845)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(16)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(1050564480))
                        goto(Label_0699)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-333240271))
                        goto(Label_0553)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-1115204698))
                        goto(Label_0395)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(131072)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_68E = and:int(var_3_68E:int, ldc:int(-8397587))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1586:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_699 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1597:
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1428)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1291)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1135)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-1870339490))
                        goto(Label_0991)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0845)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0699)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0553)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0395)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(1734320379))
                        var_17_699 = add:int(var_16_119:int, and:int(ldc:int(16921), ldc:int(6595)))
                        looporswitchbreak()
                    }
                }
                
                var_3_68E = and:int(var_3_68E:int, ldc:int(732859629))
                
                if (cmple:boolean(var_5_81 = var_17_699:int, sub:int(var_6_88:int, and:int(ldc:int(16933), ldc:int(259))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(131072)), ldc:int(0))) {
            var_3_68E = and:int(var_3_68E:int, ldc:int(1912859217))
            goto(Label_0108)
        }
    }
}
