public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u5245\u4ab3\u6c56\u0c95\u0c95 {
    public void \u5245\u4ab3\u6c56\u0c95\u0c95() {
        stack_A3_1 : \ucef1\u3504\u64f2\u6cfe\u52d3 [generated]
        stack_A3_2 : String [generated]
        stack_A3_3 : String [generated]
        expr_80 : \ud158\u839e\u7006\uc3e3\u446c[] [generated]
        
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
            stack_A3_1 = getstatic:\ucef1\u3504\u64f2\u6cfe\u52d3(\ucef1\u3504\u64f2\u6cfe\u52d3::\u4c04\u7006\u8389\u527a\u6c56)
            stack_A3_2 = loadelement:String(getstatic:String[](\u5245\u4ab3\u6c56\u0c95\u0c95::\ud4fe\ucef1\ubded\u120d\u64f2), and:int(ldc:int(9564), ldc:int(-15840)))
            stack_A3_3 = loadelement:String(getstatic:String[](\u5245\u4ab3\u6c56\u0c95\u0c95::\ud4fe\ucef1\ubded\u120d\u64f2), xor:int(ldc:int(1032), ldc:int(1033)))
            expr_80 = newarray:\ud158\u839e\u7006\uc3e3\u446c[](\u3504\ufe34\u600f\u6b0d\u69d9.\ud158\u839e\u7006\uc3e3\u446c.class, and:int(ldc:int(1802), ldc:int(18466)))
            storeelement:\ud158\u839e\u7006\uc3e3\u446c(expr_80:\ud158\u839e\u7006\uc3e3\u446c[], and:int(ldc:int(-16712), ldc:int(16709)), initobject:\u8cae\ub7dc\ube23\u446c\u4cd9[expected:\ud158\u839e\u7006\uc3e3\u446c](\u8cae\ub7dc\ube23\u446c\u4cd9::<init>))
            storeelement:\ud158\u839e\u7006\uc3e3\u446c(expr_80:\ud158\u839e\u7006\uc3e3\u446c[], and:int(ldc:int(1285), ldc:int(577)), initobject:\u120d\u52d3\uc246\u8640\ubff1[expected:\ud158\u839e\u7006\uc3e3\u446c](\u120d\u52d3\uc246\u8640\ubff1::<init>))
            invokespecial:\u3bc9\u36d3\u4ab3\u8258\u6c52(\u3bc9\u36d3\u4ab3\u8258\u6c52::<init>, this:\u5245\u4ab3\u6c56\u0c95\u0c95, stack_A3_1:\ucef1\u3504\u64f2\u6cfe\u52d3, stack_A3_2:String, stack_A3_3:String, expr_80:\ud158\u839e\u7006\uc3e3\u446c[])
            invokevirtual:void(\ud158\u839e\u7006\uc3e3\u446c::\u1187\u4bc8\u61a4\u839e\ubff1, this:\u5245\u4ab3\u6c56\u0c95\u0c95[expected:\ud158\u839e\u7006\uc3e3\u446c], initobject:\u51fa\uc246\ubefe\u69d9\u3c25[expected:\uc246\u71f1\ua068\u59ec\u516c](\u51fa\uc246\ubefe\u69d9\u3c25::<init>, loadelement:String(getstatic:String[](\u5245\u4ab3\u6c56\u0c95\u0c95::\ud4fe\ucef1\ubded\u120d\u64f2), and:int(ldc:int(5442), ldc:int(179))), loadelement:String(getstatic:String[](\u5245\u4ab3\u6c56\u0c95\u0c95::\ud4fe\ucef1\ubded\u120d\u64f2), xor:int(ldc:int(8481), ldc:int(8482))), ldc:float(7.0f), ldc:Class<Float>(java.lang.Float.class), ldc:float(0.5f), ldc:float(10.0f), ldc:float(0.5f)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \uc31c\ub19c\u3e75\u1833\u8c8a(boolean p0) {
        var_2_245 : int
        var_4_62 : int
        var_5_150 : \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56
        var_7_238 : Iterator<\u516c\u3dd3\ub113\u6d69\u76bc>
        var_6_217 : List<\u516c\u3dd3\ub113\u6d69\u76bc>
        var_6_3D3 : List<\u516c\u3dd3\ub113\u6d69\u76bc>
        
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
        var_2_245 = and:int(ldc:int(254825561), ldc:int(-1610754945))
        var_4_62 = ldc:int(36)
        
        loop {
            if (cmpne:boolean(and:int(var_2_245:int, ldc:int(131072)), ldc:int(0))) {
                var_2_245 = and:int(var_2_245:int, ldc:int(879471214))
                goto(Label_0762)
            }
            
            if (cmpeq:boolean(and:int(var_2_245:int, ldc:int(64)), ldc:int(0))) {
                var_2_245 = and:int(var_2_245:int, ldc:int(1600203185))
                goto(Label_0687)
            }
            
            if (cmpeq:boolean(and:int(var_2_245:int, ldc:int(8)), ldc:int(0))) {
                var_2_245 = and:int(var_2_245:int, ldc:int(-1960955000))
                goto(Label_0268)
            }
            
            if (cmpeq:boolean(and:int(var_2_245:int, ldc:int(4096)), ldc:int(0))) {
                var_2_245 = and:int(var_2_245:int, ldc:int(-1492927342))
                goto(Label_0172)
            }
            
            var_2_245 = and:int(var_2_245:int, ldc:int(-240953655))
            
            if (cmpge:boolean(var_4_62:int, ldc:int(45))) {
                goto(Label_0172)
            }
            
            if (logicalnot:boolean(invokevirtual:boolean(\u92ff\ubded\u0c95\u446c\u67d0::\u3bd6\u873d\u98a4\ub70c\u34df\u7873, invokevirtual:\u92ff\ubded\u0c95\u446c\u67d0(\ub1b9\u62da\u9af2\u92ee\u64f2::\u7d52\ub83f\u6bb9\ua61f\ub18d\u0b8e, getfield:\ubb2b\u6b0d\u6c56\uc29a\u4e72[expected:\ub1b9\u62da\u9af2\u92ee\u64f2](\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\ud36e\u600f\ua61f\u76bc\u965f\u64ab, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u5245\u4ab3\u6c56\u0c95\u0c95::\u64f2\u8350\u0b8e\u64f2\u946b))), var_4_62:int)))) {
                goto(Label_0268)
            }
            
            var_5_150 = invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u92ff\ubded\u0c95\u446c\u67d0::\ub102\u7af6\uc9f6\u8709\u6198\u946b, invokevirtual:\u92ff\ubded\u0c95\u446c\u67d0(\ub1b9\u62da\u9af2\u92ee\u64f2::\u7d52\ub83f\u6bb9\ua61f\ub18d\u0b8e, getfield:\ubb2b\u6b0d\u6c56\uc29a\u4e72[expected:\ub1b9\u62da\u9af2\u92ee\u64f2](\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\ud36e\u600f\ua61f\u76bc\u965f\u64ab, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u5245\u4ab3\u6c56\u0c95\u0c95::\u64f2\u8350\u0b8e\u64f2\u946b))), var_4_62:int))
            
            if (cmpne:boolean(var_5_150:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, aconstnull:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56())) {
                goto(Label_0343)
            }
            
            goto(Label_0268)
            Label_0570:
            
            while (cmpeq:boolean(and:int(var_2_245:int, ldc:int(2048)), ldc:int(0))) {
                var_2_245 = and:int(var_2_245:int, ldc:int(-38439169))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_7_238:Iterator<\u516c\u3dd3\ub113\u6d69\u76bc>))) {
                    goto(Label_0542)
                }
                
                if (cmpeq:boolean(invokevirtual:\ud523\u4f52\u59ec\u516c\u3e75(\u516c\u3dd3\ub113\u6d69\u76bc::\ubefe\u6fb0\u97b7\u946b\u8753\uae87, checkcast:\u516c\u3dd3\ub113\u6d69\u76bc(\u6435\ub8be\u718f\u6b0d\u67e9.\u516c\u3dd3\ub113\u6d69\u76bc.class, invokeinterface:\u516c\u3dd3\ub113\u6d69\u76bc(Iterator<\u516c\u3dd3\ub113\u6d69\u76bc>::next, var_7_238:Iterator<\u516c\u3dd3\ub113\u6d69\u76bc>))), getstatic:\ud523\u4f52\u59ec\u516c\u3e75(\ud523\u7ce1\ubff1\ubefe\u12cb::\uae87\u67d0\uceb8\u9af2\ub171\ub6ab))) {
                    return:int(sub:int(var_4_62:int, ldc:int(36)))
                }
                
                var_2_245 = and:int(var_2_245:int, ldc:int(-982919975))
            }
            
            var_2_245 = and:int(var_2_245:int, ldc:int(1796799225))
            Label_1014:
            
            while (cmpeq:boolean(and:int(var_2_245:int, ldc:int(262144)), ldc:int(0))) {
                var_2_245 = and:int(var_2_245:int, ldc:int(-177023383))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator<E>::hasNext, var_7_238:Iterator<\u516c\u3dd3\ub113\u6d69\u76bc>))) {
                    goto(Label_0986)
                }
                
                if (cmpeq:boolean(invokevirtual:\ud523\u4f52\u59ec\u516c\u3e75(\u516c\u3dd3\ub113\u6d69\u76bc::\ubefe\u6fb0\u97b7\u946b\u8753\uae87, checkcast:\u516c\u3dd3\ub113\u6d69\u76bc(\u6435\ub8be\u718f\u6b0d\u67e9.\u516c\u3dd3\ub113\u6d69\u76bc.class, invokeinterface:\u516c\u3dd3\ub113\u6d69\u76bc(Iterator<\u516c\u3dd3\ub113\u6d69\u76bc>::next, var_7_238:Iterator<\u516c\u3dd3\ub113\u6d69\u76bc>))), getstatic:\ud523\u4f52\u59ec\u516c\u3e75(\ud523\u7ce1\ubff1\ubefe\u12cb::\uae87\u67d0\uceb8\u9af2\ub171\ub6ab))) {
                    invokestatic:void(\ucfaf\uf94d\u624e\u5d20\u8d98::\ua61f\u446c\uc84e\u3e2a\ud36e, var_4_62:int, and:int(ldc:int(2124), ldc:int(5382)))
                    return:int(ldc:int(-1))
                }
                
                var_2_245 = and:int(var_2_245:int, ldc:int(-407636019))
            }
            
            var_2_245 = and:int(var_2_245:int, ldc:int(-219944059))
            goto(Label_0570)
            Label_0172:
            
            if (cmpne:boolean(and:int(var_2_245:int, ldc:int(2048)), ldc:int(0))) {
                var_2_245 = and:int(var_2_245:int, ldc:int(357985740))
                goto(Label_0762)
            }
            
            if (cmpne:boolean(and:int(var_2_245:int, ldc:int(512)), ldc:int(0))) {
                var_2_245 = and:int(var_2_245:int, ldc:int(398639881))
                goto(Label_0687)
            }
            
            if (cmpeq:boolean(and:int(var_2_245:int, ldc:int(1)), ldc:int(0))) {
                var_2_245 = and:int(var_2_245:int, ldc:int(-1165779243))
            }
            else {
                if (cmpne:boolean(and:int(var_2_245:int, ldc:int(512)), ldc:int(0))) {
                    var_2_245 = and:int(var_2_245:int, ldc:int(278886442))
                    loopcontinue()
                }
                
                var_2_245 = and:int(var_2_245:int, ldc:int(-449585301))
                var_4_62 = ldc:int(9)
                goto(Label_0680)
            }
            
            Label_0268:
            
            if (cmpeq:boolean(and:int(var_2_245:int, ldc:int(8)), ldc:int(0))) {
                goto(Label_0762)
            }
            
            if (cmpne:boolean(and:int(var_2_245:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0687)
            }
            
            if (cmpne:boolean(and:int(var_2_245:int, ldc:int(131072)), ldc:int(0))) {
                var_2_245 = and:int(var_2_245:int, ldc:int(1584224017))
                goto(Label_0172)
            }
            
            if (cmpne:boolean(and:int(var_2_245:int, ldc:int(8)), ldc:int(0))) {
                var_2_245 = and:int(var_2_245:int, ldc:int(-1075258019))
                inc:int(var_4_62, ldc:int(1))
                loopcontinue()
            }
            
            loopcontinue()
            Label_0343:
            
            if (cmpne:boolean(and:int(var_2_245:int, ldc:int(1073741824)), ldc:int(0))) {
                var_2_245 = and:int(var_2_245:int, ldc:int(-301940226))
                goto(Label_0920)
            }
            
            if (cmpeq:boolean(and:int(var_2_245:int, ldc:int(1024)), ldc:int(0))) {
                var_2_245 = and:int(var_2_245:int, ldc:int(1523803710))
                goto(Label_0852)
            }
            
            if (cmpne:boolean(and:int(var_2_245:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0456)
            }
            
            if (cmpne:boolean(and:int(var_2_245:int, ldc:int(2097152)), ldc:int(0))) {
                var_2_245 = and:int(var_2_245:int, ldc:int(-1922212145))
                
                if (p0:boolean) {
                    var_6_217 = invokestatic:List<\u516c\u3dd3\ub113\u6d69\u76bc>(\ucfaf\uf94d\u624e\u5d20\u8d98::\u69d9\ubb2b\u071d\u12b2\ua3b4, var_5_150:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
                    
                    if (cmpeq:boolean(var_6_217:List<\u516c\u3dd3\ub113\u6d69\u76bc>, aconstnull:List<\u516c\u3dd3\ub113\u6d69\u76bc>())) {
                        goto(Label_0542)
                    }
                    
                    var_7_238 = invokeinterface:Iterator<\u516c\u3dd3\ub113\u6d69\u76bc>(List<\u516c\u3dd3\ub113\u6d69\u76bc>::iterator, var_6_217:List<\u516c\u3dd3\ub113\u6d69\u76bc>)
                    goto(Label_0570)
                }
            }
            
            Label_0396:
            
            if (cmpne:boolean(and:int(var_2_245:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0920)
            }
            
            if (cmpeq:boolean(and:int(var_2_245:int, ldc:int(16384)), ldc:int(0))) {
                var_2_245 = and:int(var_2_245:int, ldc:int(1110796528))
                goto(Label_0852)
            }
            
            if (cmpne:boolean(and:int(var_2_245:int, ldc:int(536870912)), ldc:int(0))) {
                var_2_245 = and:int(var_2_245:int, ldc:int(780756655))
            }
            else {
                if (cmpeq:boolean(and:int(var_2_245:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0343)
                }
                
                var_2_245 = and:int(var_2_245:int, ldc:int(-1724064533))
                
                if (cmpne:boolean(invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, var_5_150:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), getstatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u4492\ua562\ud158\u4492\u6bb9\ub70c::\u9937\u8709\uae87\u62da\u9a18\u647c))) {
                    if (cmpne:boolean(invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, var_5_150:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), getstatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u4492\ua562\ud158\u4492\u6bb9\ub70c::\ua61f\u946b\u7330\u647c\u3d64\u7c6b))) {
                        goto(Label_0268)
                    }
                }
            }
            
            Label_0456:
            
            if (cmpeq:boolean(and:int(var_2_245:int, ldc:int(8)), ldc:int(0))) {
                var_2_245 = and:int(var_2_245:int, ldc:int(-1786652813))
                goto(Label_0920)
            }
            
            if (cmpeq:boolean(and:int(var_2_245:int, ldc:int(16777216)), ldc:int(0))) {
                var_2_245 = and:int(var_2_245:int, ldc:int(-657458012))
                goto(Label_0852)
            }
            
            if (cmpeq:boolean(and:int(var_2_245:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0396)
            }
            
            if (cmpne:boolean(and:int(var_2_245:int, ldc:int(262144)), ldc:int(0))) {
                var_2_245 = and:int(var_2_245:int, ldc:int(-1494718257))
                goto(Label_0343)
            }
            
            return:int(sub:int(var_4_62:int, ldc:int(36)))
            Label_0542:
            
            if (cmpne:boolean(and:int(var_2_245:int, ldc:int(8)), ldc:int(0))) {
                var_2_245 = and:int(var_2_245:int, ldc:int(-1511989249))
                goto(Label_0268)
            }
            
            goto(Label_0986)
            Label_0680:
            
            if (cmplt:boolean(var_4_62:int, ldc:int(36))) {
                if (logicalnot:boolean(invokevirtual:boolean(\u92ff\ubded\u0c95\u446c\u67d0::\u3bd6\u873d\u98a4\ub70c\u34df\u7873, invokevirtual:\u92ff\ubded\u0c95\u446c\u67d0(\ub1b9\u62da\u9af2\u92ee\u64f2::\u7d52\ub83f\u6bb9\ua61f\ub18d\u0b8e, getfield:\ubb2b\u6b0d\u6c56\uc29a\u4e72[expected:\ub1b9\u62da\u9af2\u92ee\u64f2](\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\ud36e\u600f\ua61f\u76bc\u965f\u64ab, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u5245\u4ab3\u6c56\u0c95\u0c95::\u64f2\u8350\u0b8e\u64f2\u946b))), var_4_62:int)))) {
                    goto(Label_0762)
                }
                
                var_5_150 = invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u92ff\ubded\u0c95\u446c\u67d0::\ub102\u7af6\uc9f6\u8709\u6198\u946b, invokevirtual:\u92ff\ubded\u0c95\u446c\u67d0(\ub1b9\u62da\u9af2\u92ee\u64f2::\u7d52\ub83f\u6bb9\ua61f\ub18d\u0b8e, getfield:\ubb2b\u6b0d\u6c56\uc29a\u4e72[expected:\ub1b9\u62da\u9af2\u92ee\u64f2](\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\ud36e\u600f\ua61f\u76bc\u965f\u64ab, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u5245\u4ab3\u6c56\u0c95\u0c95::\u64f2\u8350\u0b8e\u64f2\u946b))), var_4_62:int))
                
                if (logicalnot:boolean(p0:boolean)) {
                    goto(Label_0852)
                }
                
                var_6_3D3 = invokestatic:List<\u516c\u3dd3\ub113\u6d69\u76bc>(\ucfaf\uf94d\u624e\u5d20\u8d98::\u69d9\ubb2b\u071d\u12b2\ua3b4, var_5_150:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
                
                if (cmpeq:boolean(var_6_3D3:List<\u516c\u3dd3\ub113\u6d69\u76bc>, aconstnull:List<\u516c\u3dd3\ub113\u6d69\u76bc>())) {
                    goto(Label_0986)
                }
                
                var_7_238 = invokeinterface:Iterator<\u516c\u3dd3\ub113\u6d69\u76bc>(List<\u516c\u3dd3\ub113\u6d69\u76bc>::iterator, var_6_3D3:List<\u516c\u3dd3\ub113\u6d69\u76bc>)
                goto(Label_1014)
            }
            
            Label_0687:
            
            if (cmpne:boolean(and:int(var_2_245:int, ldc:int(1)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_2_245:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_0268)
                }
                
                if (cmpeq:boolean(and:int(var_2_245:int, ldc:int(1024)), ldc:int(0))) {
                    var_2_245 = and:int(var_2_245:int, ldc:int(-1669051463))
                    goto(Label_0172)
                }
                
                if (cmpne:boolean(and:int(var_2_245:int, ldc:int(536870912)), ldc:int(0))) {
                    var_2_245 = and:int(var_2_245:int, ldc:int(-1291253110))
                    loopcontinue()
                }
                
                return:int(ldc:int(-1))
            }
            
            Label_0762:
            
            if (cmpeq:boolean(and:int(var_2_245:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0687)
            }
            
            if (cmpne:boolean(and:int(var_2_245:int, ldc:int(536870912)), ldc:int(0))) {
                var_2_245 = and:int(var_2_245:int, ldc:int(-579101220))
                goto(Label_0268)
            }
            
            if (cmpne:boolean(and:int(var_2_245:int, ldc:int(512)), ldc:int(0))) {
                var_2_245 = and:int(var_2_245:int, ldc:int(1120124258))
                goto(Label_0172)
            }
            
            if (cmpeq:boolean(and:int(var_2_245:int, ldc:int(1)), ldc:int(0))) {
                var_2_245 = and:int(var_2_245:int, ldc:int(1560565332))
                loopcontinue()
            }
            
            var_2_245 = and:int(var_2_245:int, ldc:int(53728761))
            inc:int(var_4_62, ldc:int(1))
            goto(Label_0680)
            Label_0852:
            
            if (cmpne:boolean(and:int(var_2_245:int, ldc:int(262144)), ldc:int(0))) {
                var_2_245 = and:int(var_2_245:int, ldc:int(1125927294))
            }
            else {
                if (cmpeq:boolean(and:int(var_2_245:int, ldc:int(64)), ldc:int(0))) {
                    var_2_245 = and:int(var_2_245:int, ldc:int(1940289307))
                    goto(Label_0456)
                }
                
                if (cmpne:boolean(and:int(var_2_245:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_0396)
                }
                
                if (cmpne:boolean(and:int(var_2_245:int, ldc:int(512)), ldc:int(0))) {
                    var_2_245 = and:int(var_2_245:int, ldc:int(-915275341))
                    goto(Label_0343)
                }
                
                var_2_245 = and:int(var_2_245:int, ldc:int(1068399949))
                
                if (cmpne:boolean(invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, var_5_150:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), getstatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u4492\ua562\ud158\u4492\u6bb9\ub70c::\u9937\u8709\uae87\u62da\u9a18\u647c))) {
                    if (cmpne:boolean(invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, var_5_150:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), getstatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u4492\ua562\ud158\u4492\u6bb9\ub70c::\ua61f\u946b\u7330\u647c\u3d64\u7c6b))) {
                        goto(Label_0762)
                    }
                }
            }
            
            Label_0920:
            
            if (cmpeq:boolean(and:int(var_2_245:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0852)
            }
            
            if (cmpeq:boolean(and:int(var_2_245:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0456)
            }
            
            if (cmpne:boolean(and:int(var_2_245:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0396)
            }
            
            if (cmpne:boolean(and:int(var_2_245:int, ldc:int(64)), ldc:int(0))) {
                invokestatic:void(\ucfaf\uf94d\u624e\u5d20\u8d98::\ua61f\u446c\uc84e\u3e2a\ud36e, var_4_62:int, and:int(ldc:int(1412), ldc:int(25093)))
                return:int(ldc:int(-1))
            }
            
            goto(Label_0343)
            Label_0986:
            
            if (cmpeq:boolean(and:int(var_2_245:int, ldc:int(512)), ldc:int(0))) {
                var_2_245 = and:int(var_2_245:int, ldc:int(-840829333))
                goto(Label_0762)
            }
            
            goto(Label_0542)
        }
    }
    
    static {
        var_0_181 : int
        expr_6B : int [generated]
        stack_95_0 : byte[] [generated]
        stack_97_0 : byte[] [generated]
        stack_BB_0 : byte[] [generated]
        stack_BD_0 : byte[] [generated]
        stack_D6_0 : byte[] [generated]
        stack_194_0 : byte[] [generated]
        stack_1EB_0 : byte[] [generated]
        stack_248_0 : byte[] [generated]
        var_4_16D : int
        var_3_172 : byte[]
        var_5_173 : int
        expr_197 : byte [generated]
        var_0_23E : int
        expr_248 : byte [generated]
        stack_278_2 : byte [generated]
        var_2_95 : byte[]
        expr_99 : int [generated]
        var_3_1D9 : byte[]
        var_5_1DA : int
        expr_BD : int [generated]
        var_3_E2 : String
        stack_166_0 : String[] [generated]
        expr_F4 : String[] [generated]
        
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
        var_0_181 = and:int(ldc:int(1212212663), ldc:int(1545991855))
        expr_6B = arraylength:int(stack_95_0 = stack_97_0 = stack_BB_0 = stack_BD_0 = stack_D6_0 = stack_194_0 = stack_1EB_0 = stack_248_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("3DFpzGjYCejorDQpeWmhgZnMIIJtpXV9zMShy3mBjnm40LPMzB1pdWk4zC2Z2MwIDJmmbT2Jq6zMfp2RhcPAeWqhQcCvuOgyeZGwx9zYehIa+h2B")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_16D = expr_6B:int
        var_3_172 = newarray:byte[](byte.class, expr_6B:int)
        var_5_173 = expr_6B:int
        Label_0373:
        
        while (cmpeq:boolean(and:int(var_0_181:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_181 = and:int(var_0_181:int, ldc:int(2053111439))
            var_5_173 = add:int(var_5_173:int, ldc:int(-1))
            expr_197 = add:byte(loadelement:byte(stack_194_0:byte[], var_5_173:int), ldc:byte(87))
            storeelement:byte(var_3_172:byte[], var_5_173:int, xor:int(or:int(and:int(shl:int(expr_197:byte, and:int(ldc:int(20), ldc:int(18438))), ldc:int(-16)), and:int(shr:int(expr_197:byte[expected:int], and:int(ldc:int(149), ldc:int(26636))), ldc:int(15))), ldc:int(13)))
            
            if (cmpne:boolean(var_5_173:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_97_0 = stack_95_0 = stack_BB_0 = stack_BD_0 = stack_D6_0 = stack_194_0 = stack_1EB_0 = stack_248_0 = var_3_172:byte[]
            goto(Label_0112)
        }
        
        var_0_181 = and:int(var_0_181:int, ldc:int(254867185))
        Label_0562:
        
        while (cmpne:boolean(and:int(var_0_181:int, ldc:int(1)), ldc:int(0))) {
            var_0_23E = and:int(var_0_181:int, ldc:int(-285409617))
            var_5_173 = add:int(var_5_173:int, ldc:int(-1))
            expr_248 = loadelement:byte(stack_248_0:byte[], var_5_173:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_173:int, ldc:int(4)), neg:int(var_4_16D:int)), ldc:int(0))) {
                var_0_23E = and:int(var_0_23E:int, ldc:int(2044716935))
                stack_278_2 = add:byte(expr_248:byte, ldc:byte(4))
            }
            else {
                stack_278_2 = add:byte(expr_248:byte, loadelement:byte(var_3_172:byte[], add:int(var_5_173:int, ldc:int(4))))
            }
            
            var_0_181 = and:int(var_0_23E:int, ldc:int(1757212327))
            storeelement:byte(var_3_172:byte[], var_5_173:int, stack_278_2:byte)
            
            if (cmpne:boolean(var_5_173:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_97_0 = stack_95_0 = stack_BB_0 = stack_BD_0 = stack_D6_0 = stack_194_0 = stack_1EB_0 = stack_248_0 = var_3_172:byte[]
            goto(Label_0194)
        }
        
        goto(Label_0373)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_181:int, ldc:int(1024)), ldc:int(0))) {
            var_0_181 = and:int(var_0_181:int, ldc:int(-1255800678))
            goto(Label_0194)
        }
        
        if (cmpne:boolean(and:int(var_0_181:int, ldc:int(2048)), ldc:int(0))) {
            var_0_181 = and:int(var_0_181:int, ldc:int(-1603816880))
        }
        else {
            var_0_181 = and:int(var_0_181:int, ldc:int(-596183057))
            var_2_95 = stack_95_0:byte[]
            expr_99 = add:int(arraylength:int(stack_97_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_99:int, ldc:int(0))) {
                var_3_1D9 = newarray:byte[](byte.class, expr_99:int)
                var_5_1DA = expr_99:int
                
                loop {
                    var_0_181 = and:int(var_0_181:int, ldc:int(1519517335))
                    var_5_1DA = add:int(var_5_1DA:int, ldc:int(-1))
                    storeelement:byte(var_3_1D9:byte[], var_5_1DA:int, add:int(shl:int(loadelement:byte(stack_1EB_0:byte[], var_5_1DA:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_95:byte[], add:int(var_5_1DA:int, and:int(ldc:int(1025), ldc:int(17251)))), ldc:int(6)), and:int(ldc:int(171), ldc:int(71)))))
                    
                    if (cmpne:boolean(var_5_1DA:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_97_0 = stack_95_0 = stack_BB_0 = stack_BD_0 = stack_D6_0 = stack_194_0 = stack_1EB_0 = stack_248_0 = var_3_1D9:byte[]
            }
        }
        
        Label_0158:
        
        if (cmpeq:boolean(and:int(var_0_181:int, ldc:int(8192)), ldc:int(0))) {
            var_0_181 = and:int(var_0_181:int, ldc:int(-639050100))
        }
        else {
            if (cmpne:boolean(and:int(var_0_181:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_181 = and:int(var_0_181:int, ldc:int(1541863167))
            expr_BD = arraylength:int(stack_BD_0:byte[])
            
            if (cmpne:boolean(expr_BD:int, ldc:int(0))) {
                var_4_16D = expr_BD:int
                var_3_172 = newarray:byte[](byte.class, expr_BD:int)
                var_5_173 = expr_BD:int
                goto(Label_0562)
            }
        }
        
        Label_0194:
        
        if (cmpne:boolean(and:int(var_0_181:int, ldc:int(1048576)), ldc:int(0))) {
            goto(Label_0158)
        }
        
        if (cmpeq:boolean(and:int(var_0_181:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_E2 = initobject:String(String::<init>, stack_D6_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_166_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(3209), ldc:int(3213)))
            expr_F4 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(16532), ldc:int(836)))
            storeelement:String(expr_F4:String[], and:int(ldc:int(6796), ldc:int(-6861)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(-22412), ldc:int(22403)), xor:int(ldc:int(1610), ldc:int(1600))))
            storeelement:String(expr_F4:String[], xor:int(ldc:int(12321), ldc:int(12320)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, xor:int(ldc:int(696), ldc:int(690)), and:int(ldc:int(557), ldc:int(25017))))
            storeelement:String(expr_F4:String[], xor:int(ldc:int(-30203), ldc:int(-30201)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, xor:int(ldc:int(-24441), ldc:int(-24402)), and:int(ldc:int(111), ldc:int(559))))
            storeelement:String(expr_F4:String[], and:int(ldc:int(4647), ldc:int(8259)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, xor:int(ldc:int(-27879), ldc:int(-27850)), and:int(ldc:int(20727), ldc:int(10067))))
            putstatic:String[](\u5245\u4ab3\u6c56\u0c95\u0c95::\ud4fe\ucef1\ubded\u120d\u64f2, expr_F4:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \ub19c\u51b2\ud12e\u0b8e\ua6bd(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_64A : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_C6 : double
        var_3_D8 : int
        var_11_E9 : int
        var_14_113 : double
        var_16_117 : int
        var_12_10F : double
        var_17_655 : int
        
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
        var_3_64A = and:int(ldc:int(1346386239), ldc:int(-164397251))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u5245\u4ab3\u6c56\u0c95\u0c95[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_64A = and:int(var_3_64A:int, ldc:int(-117311329))
            var_5_80 = and:int(ldc:int(-23977), ldc:int(19752))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-8359), ldc:int(8358)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C6 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D8 = and:int(var_3_64A:int, ldc:int(-1187398433))
                    var_9_C6 = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E9 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E9:int, sub:int(var_6_87:int, and:int(ldc:int(73), ldc:int(12161)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E9:int, and:int(ldc:int(8743), ldc:int(17)))), var_7_96:double))) {
                        inc:int(var_11_E9, ldc:int(1))
                    }
                    
                    var_3_64A = and:int(var_3_D8:int, ldc:int(447446845))
                    var_14_113 = var_7_96:double
                    var_16_117 = var_11_E9:int
                }
                else {
                    var_11_E9 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), xor:int(ldc:int(-32680), ldc:int(-32679)))
                    var_12_10F = var_14_113 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_117 = var_11_E9:int, var_6_87:int)) {
                        var_9_C6 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E9:int)
                        var_16_117 = var_11_E9:int
                        var_14_113 = var_12_10F:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(240908908))
                        goto(Label_1503)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(1385420812))
                        goto(Label_1359)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1237)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-1771152341))
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0936)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0827)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(1890974303))
                        goto(Label_0700)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(4)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-439317786))
                        goto(Label_0571)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(837881218))
                    }
                    else {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(517389309))
                        
                        if (cmplt:boolean(var_16_117:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0571)
                            }
                            
                            goto(Label_0827)
                        }
                    }
                    
                    Label_0421:
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1503)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(1073467119))
                        goto(Label_1359)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(512)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-3407192))
                        goto(Label_1237)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-1477139110))
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0936)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0827)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0700)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(512)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(833878525))
                            var_11_E9 = and:int(ldc:int(-19958), ldc:int(3409))
                            goto(Label_1492)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0571:
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(1037414617))
                        goto(Label_1503)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(16)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(629423398))
                        goto(Label_1359)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1237)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0936)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-699381114))
                        goto(Label_0827)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-27456076))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(512)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(1723738382))
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64A = and:int(var_3_64A:int, ldc:int(322911839))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_113 = var_9_C6:double
                            goto(Label_0827)
                        }
                    }
                    
                    Label_0700:
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1503)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(345696566))
                        goto(Label_1359)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-1750398570))
                        goto(Label_1237)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(4)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-1842925146))
                        goto(Label_0936)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-1814094150))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0571)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64A = and:int(var_3_64A:int, ldc:int(882178717))
                        var_14_113 = mul:double(ldc:double(0.5), add:double(var_9_C6:double, var_14_113:double))
                    }
                    
                    Label_0827:
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1503)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1359)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(1977535268))
                        goto(Label_1237)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0700)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(1)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(-1435379326))
                            goto(Label_0571)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(-559084887))
                            loopcontinue()
                        }
                        
                        var_3_64A = and:int(var_3_64A:int, ldc:int(1899380031))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E9 = and:int(ldc:int(4353), ldc:int(1029))
                                goto(Label_1101)
                            }
                        }
                    }
                    
                    Label_0936:
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(1010467362))
                        goto(Label_1503)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1359)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1237)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-830916290))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0827)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(-1855231403))
                            goto(Label_0700)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0571)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(16)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(508065227))
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(-1682968514))
                            loopcontinue()
                        }
                        
                        var_3_64A = and:int(var_3_64A:int, ldc:int(1433877853))
                        var_11_E9 = and:int(ldc:int(-13981), ldc:int(12956))
                    }
                    
                    Label_1101:
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1503)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-1331819562))
                        goto(Label_1359)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-867550927))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0936)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0827)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(-1043861740))
                            goto(Label_0700)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(940892791))
                            goto(Label_0571)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(8)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(-865765415))
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(328444934))
                            loopcontinue()
                        }
                        
                        var_3_64A = and:int(var_3_64A:int, ldc:int(1992112157))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                                goto(Label_1359)
                            }
                        }
                    }
                    
                    Label_1237:
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1503)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_1101)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(4)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(301060343))
                            goto(Label_0936)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(8)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(-563054897))
                            goto(Label_0827)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0700)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0571)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(767294053))
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(497679231))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_113:double, var_5_80:int, var_16_117:int)
                            goto(Label_1492)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1359:
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1503)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-1077485827))
                        goto(Label_1237)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(497908868))
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-857925510))
                        goto(Label_0936)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0827)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0700)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0571)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-137272403))
                        loopcontinue()
                    }
                    
                    var_3_64A = and:int(var_3_64A:int, ldc:int(327270239))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_113:double, ldc:double(0.0))
                    Label_1492:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_655 = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1503:
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1359)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1237)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-752820564))
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0936)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-282615480))
                        goto(Label_0827)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0700)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0571)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-165080240))
                        goto(Label_0421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-1291765283))
                        var_17_655 = add:int(var_16_117:int, and:int(ldc:int(141), ldc:int(19009)))
                        looporswitchbreak()
                    }
                    
                    var_3_64A = and:int(var_3_64A:int, ldc:int(-1691601177))
                }
                
                var_3_64A = and:int(var_3_64A:int, ldc:int(1420540221))
                
                if (cmple:boolean(var_5_80 = var_17_655:int, sub:int(var_6_87:int, and:int(ldc:int(51), ldc:int(27137))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(8192)), ldc:int(0))) {
            var_3_64A = and:int(var_3_64A:int, ldc:int(-268182099))
            goto(Label_0108)
        }
    }
}
