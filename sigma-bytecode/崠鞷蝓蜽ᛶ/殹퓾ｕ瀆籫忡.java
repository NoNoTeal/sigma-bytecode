public class \u5d20\u97b7\u8753\u873d\u16f6.\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1 {
    public void \u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1() {
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
            invokespecial:Object(Object::<init>, this:\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ua562\ud4fe\u647c\uc84e\u5245\u5f50 \u98a4\uf9c5\u6c56\u3e75\ua562\u0b8e(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ua562\ud4fe\u647c\uc84e\u5245\u5f50 p0, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p1) {
        var_2_5F : int
        var_2_202 : int
        var_4_79 : List<\u71ae\u6c56\uc29a\ubefe\u760c\u71ae>
        stack_253_0 : \ua562\ud4fe\u647c\uc84e\u5245\u5f50 [generated]
        
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
        var_2_5F = and:int(ldc:int(-670317059), ldc:int(-835983567))
        
        if (logicalnot:boolean(invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u61a4\u72f1\u718f\u2dcc\ud12e\ucb79))) {
            return:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(p0:\ua562\ud4fe\u647c\uc84e\u5245\u5f50)
        }
        
        var_2_202 = and:int(var_2_5F:int, ldc:int(-1972641421))
        var_4_79 = invokeinterface:List<\u71ae\u6c56\uc29a\ubefe\u760c\u71ae>(\ua562\ud4fe\u647c\uc84e\u5245\u5f50::\u527a\u965f\u69d9\ufe34\u7bad\u71f1, p0:\ua562\ud4fe\u647c\uc84e\u5245\u5f50, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, checkcast:\u760c\u4975\u4179\uc246\u8640\u64f2(\u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2.class, aconstnull:\u760c\u4975\u4179\uc246\u8640\u64f2()), getstatic:Random(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\uff55\ud7e8\u61a4\u36d3\ua61f\u69d9))
        
        if (cmpne:boolean(var_4_79:List<\u71ae\u6c56\uc29a\ubefe\u760c\u71ae>, getstatic:List(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\ucef1\u4492\uc238\u760c\u4bc8\ua6bd))) {
            loop {
                if (cmpeq:boolean(and:int(var_2_202:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0443)
                }
                
                if (cmpeq:boolean(and:int(var_2_202:int, ldc:int(32)), ldc:int(0))) {
                    var_2_202 = and:int(var_2_202:int, ldc:int(-2073857915))
                    goto(Label_0387)
                }
                
                if (cmpne:boolean(and:int(var_2_202:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_0323)
                }
                
                if (cmpne:boolean(and:int(var_2_202:int, ldc:int(262144)), ldc:int(0))) {
                    var_2_202 = and:int(var_2_202:int, ldc:int(-565297597))
                    goto(Label_0251)
                }
                
                if (cmpne:boolean(and:int(var_2_202:int, ldc:int(65536)), ldc:int(0))) {
                    var_2_202 = and:int(var_2_202:int, ldc:int(1234693171))
                    
                    if (cmpeq:boolean(var_4_79:List<\u71ae\u6c56\uc29a\ubefe\u760c\u71ae>, getstatic:List(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\uc87f\ub1b9\ub7dc\u67e9\u9255\u5654))) {
                        return:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(getstatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u392e\ubb2b\u9af2\u3e2a\uc9f6\u4ab3))
                    }
                }
                
                Label_0195:
                
                if (cmpne:boolean(and:int(var_2_202:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_0443)
                }
                
                if (cmpne:boolean(and:int(var_2_202:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0387)
                }
                
                if (cmpne:boolean(and:int(var_2_202:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_0323)
                }
                
                if (cmpeq:boolean(and:int(var_2_202:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_2_202 = and:int(var_2_202:int, ldc:int(-1403295297))
                }
                else {
                    if (cmpne:boolean(and:int(var_2_202:int, ldc:int(262144)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_202 = and:int(var_2_202:int, ldc:int(1806671160))
                    
                    if (cmpeq:boolean(var_4_79:List<\u71ae\u6c56\uc29a\ubefe\u760c\u71ae>, getstatic:List(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\ub83f\u760c\uc87f\ubded\u6c56\ubcb0))) {
                        return:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(getstatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\uff55\u69d9\u4c04\ud217\u3d64\u965f))
                    }
                }
                
                Label_0251:
                
                if (cmpne:boolean(and:int(var_2_202:int, ldc:int(67108864)), ldc:int(0))) {
                    var_2_202 = and:int(var_2_202:int, ldc:int(-892338425))
                    goto(Label_0443)
                }
                
                if (cmpne:boolean(and:int(var_2_202:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0387)
                }
                
                if (cmpne:boolean(and:int(var_2_202:int, ldc:int(8192)), ldc:int(0))) {
                    var_2_202 = and:int(var_2_202:int, ldc:int(839583819))
                }
                else {
                    if (cmpne:boolean(and:int(var_2_202:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0195)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_202:int, ldc:int(262144)), ldc:int(0))) {
                        var_2_202 = and:int(var_2_202:int, ldc:int(422427788))
                        loopcontinue()
                    }
                    
                    var_2_202 = and:int(var_2_202:int, ldc:int(1610338548))
                    
                    if (cmpeq:boolean(var_4_79:List<\u71ae\u6c56\uc29a\ubefe\u760c\u71ae>, getstatic:List(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\ud36e\ua61f\ubb2b\u98a4\uc7fe\ucef1))) {
                        return:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(getstatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u6ec6\ufe34\u6b0d\u6fb0\u3bc9\u8640))
                    }
                }
                
                Label_0323:
                
                if (cmpne:boolean(and:int(var_2_202:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_0443)
                }
                
                if (cmpeq:boolean(and:int(var_2_202:int, ldc:int(536870912)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_2_202:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_2_202 = and:int(var_2_202:int, ldc:int(1387379471))
                        goto(Label_0251)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_202:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0195)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_202:int, ldc:int(8388608)), ldc:int(0))) {
                        var_2_202 = and:int(var_2_202:int, ldc:int(-405719305))
                        loopcontinue()
                    }
                    
                    var_2_202 = and:int(var_2_202:int, ldc:int(-564932429))
                    
                    if (cmpeq:boolean(var_4_79:List<\u71ae\u6c56\uc29a\ubefe\u760c\u71ae>, getstatic:List(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\ud12e\u6435\uff55\u839e\u4cd9\u64ab))) {
                        return:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(getstatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\ub70c\uc4d2\ua6bd\u7af6\u156b\ua562))
                    }
                }
                
                Label_0387:
                
                if (cmpeq:boolean(and:int(var_2_202:int, ldc:int(131072)), ldc:int(0))) {
                    var_2_202 = and:int(var_2_202:int, ldc:int(706644565))
                }
                else {
                    if (cmpne:boolean(and:int(var_2_202:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0323)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_202:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0251)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_202:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0195)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_202:int, ldc:int(131072)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_202 = and:int(var_2_202:int, ldc:int(1229708918))
                    
                    if (cmpeq:boolean(var_4_79:List<\u71ae\u6c56\uc29a\ubefe\u760c\u71ae>, getstatic:List(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u36d3\u6d99\ud7e8\uae5d\u071d\u16f6))) {
                        stack_253_0 = getstatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u47c2\uc4d2\u67d0\u6ec6\u97b7\u7e3f)
                        looporswitchbreak()
                    }
                }
                
                Label_0443:
                
                if (cmpne:boolean(and:int(var_2_202:int, ldc:int(16777216)), ldc:int(0))) {
                    var_2_202 = and:int(var_2_202:int, ldc:int(-1171860028))
                    goto(Label_0387)
                }
                
                if (cmpeq:boolean(and:int(var_2_202:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_2_202 = and:int(var_2_202:int, ldc:int(1063888697))
                    goto(Label_0323)
                }
                
                if (cmpne:boolean(and:int(var_2_202:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_0251)
                }
                
                if (cmpeq:boolean(and:int(var_2_202:int, ldc:int(32768)), ldc:int(0))) {
                    var_2_202 = and:int(var_2_202:int, ldc:int(-222379694))
                    goto(Label_0195)
                }
                
                if (cmpne:boolean(and:int(var_2_202:int, ldc:int(131072)), ldc:int(0))) {
                    var_2_202 = and:int(var_2_202:int, ldc:int(-277354564))
                    stack_253_0 = p0:\ua562\ud4fe\u647c\uc84e\u5245\u5f50
                    looporswitchbreak()
                }
                
                var_2_202 = and:int(var_2_202:int, ldc:int(-454797124))
            }
            
            return:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(stack_253_0:\ua562\ud4fe\u647c\uc84e\u5245\u5f50)
        }
        
        return:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(getstatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u494c\u0a06\u3d64\ub1b9\ud523\u7006))
    }
    
    public static boolean \ubded\u62da\u7330\u51fa\uae5d\u8d90(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p1) {
        var_2_5F : int
        var_2_69 : int
        stack_AB_0 : int [generated]
        
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
        var_2_5F = and:int(ldc:int(1563559350), ldc:int(2101337254))
        
        if (cmpne:boolean(p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)) {
            var_2_69 = and:int(var_2_5F:int, ldc:int(2075610302))
            
            if (cmpne:boolean(invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e]), invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e]))) {
                var_2_69 = and:int(var_2_69:int, ldc:int(-647772945))
                stack_AB_0 = and:int(ldc:int(-8876), ldc:int(8875))
            }
            else {
                stack_AB_0 = xor:int(ldc:int(129), ldc:int(128))
            }
            
            return:boolean(stack_AB_0:int)
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(11), ldc:int(65)))
    }
    
    public static void \u516c\u92ee\ub70c\ua562\u92ff\u0a06() {
        var_2_67 : ArrayList
        
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
            var_2_67 = initobject:ArrayList(ArrayList<E>::<init>)
            putstatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u6d99\u3776\u624e\u120d\u3a62\u7c6b, invokestatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\ua6bd\u3e75\ua6bd\ub19c\u9a18\u6b5f, loadelement:String(getstatic:String[](\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u965f\u3d4b\u8258\ufcaf\u7330\u4975), and:int(ldc:int(15704), ldc:int(-15738))), var_2_67:ArrayList[expected:List]))
            putstatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u7c6b\u67d0\u516c\ud4fe\u16f6\u74b1, invokestatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\ua6bd\u3e75\ua6bd\ub19c\u9a18\u6b5f, loadelement:String(getstatic:String[](\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u965f\u3d4b\u8258\ufcaf\u7330\u4975), and:int(ldc:int(15267), ldc:int(1))), var_2_67:ArrayList[expected:List]))
            putstatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\ub171\u98a4\uc9f6\u12cb\u7006\u839e, invokestatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\ua6bd\u3e75\ua6bd\ub19c\u9a18\u6b5f, loadelement:String(getstatic:String[](\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u965f\u3d4b\u8258\ufcaf\u7330\u4975), and:int(ldc:int(7002), ldc:int(16418))), var_2_67:ArrayList[expected:List]))
            putstatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u8d90\u6435\u34df\u071d\u0a06\u7873, invokestatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\ua6bd\u3e75\ua6bd\ub19c\u9a18\u6b5f, loadelement:String(getstatic:String[](\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u965f\u3d4b\u8258\ufcaf\u7330\u4975), xor:int(ldc:int(2592), ldc:int(2595))), var_2_67:ArrayList[expected:List]))
            putstatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u760c\ub83f\uc9f6\ub83f\u0a06\ud51e, invokestatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\ua6bd\u3e75\ua6bd\ub19c\u9a18\u6b5f, loadelement:String(getstatic:String[](\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u965f\u3d4b\u8258\ufcaf\u7330\u4975), and:int(ldc:int(6), ldc:int(4213))), var_2_67:ArrayList[expected:List]))
            putstatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u3bd6\u4492\u5fe1\u392e\u6b0d\ub171, invokestatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\ua6bd\u3e75\ua6bd\ub19c\u9a18\u6b5f, loadelement:String(getstatic:String[](\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u965f\u3d4b\u8258\ufcaf\u7330\u4975), and:int(ldc:int(837), ldc:int(1079))), var_2_67:ArrayList[expected:List]))
            putstatic:List(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\ucef1\u4492\uc238\u760c\u4bc8\ua6bd, invokestatic:List(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u64ab\u69d9\ub70c\ua61f\u8308\u9033, getstatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u6d99\u3776\u624e\u120d\u3a62\u7c6b)))
            putstatic:List(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\uc87f\ub1b9\ub7dc\u67e9\u9255\u5654, invokestatic:List(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u64ab\u69d9\ub70c\ua61f\u8308\u9033, getstatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u7c6b\u67d0\u516c\ud4fe\u16f6\u74b1)))
            putstatic:List(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\ub83f\u760c\uc87f\ubded\u6c56\ubcb0, invokestatic:List(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u64ab\u69d9\ub70c\ua61f\u8308\u9033, getstatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\ub171\u98a4\uc9f6\u12cb\u7006\u839e)))
            putstatic:List(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\ud36e\ua61f\ubb2b\u98a4\uc7fe\ucef1, invokestatic:List(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u64ab\u69d9\ub70c\ua61f\u8308\u9033, getstatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u8d90\u6435\u34df\u071d\u0a06\u7873)))
            putstatic:List(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\ud12e\u6435\uff55\u839e\u4cd9\u64ab, invokestatic:List(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u64ab\u69d9\ub70c\ua61f\u8308\u9033, getstatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u760c\ub83f\uc9f6\ub83f\u0a06\ud51e)))
            putstatic:List(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u36d3\u6d99\ud7e8\uae5d\u071d\u16f6, invokestatic:List(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u64ab\u69d9\ub70c\ua61f\u8308\u9033, getstatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u3bd6\u4492\u5fe1\u392e\u6b0d\ub171)))
            putstatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u494c\u0a06\u3d64\ub1b9\ud523\u7006, invokestatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\ud171\u67d0\ub1b9\u8350\u7330\uc29a, getstatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u6d99\u3776\u624e\u120d\u3a62\u7c6b)))
            putstatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u392e\ubb2b\u9af2\u3e2a\uc9f6\u4ab3, invokestatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\ud171\u67d0\ub1b9\u8350\u7330\uc29a, getstatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u7c6b\u67d0\u516c\ud4fe\u16f6\u74b1)))
            putstatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\uff55\u69d9\u4c04\ud217\u3d64\u965f, invokestatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\ud171\u67d0\ub1b9\u8350\u7330\uc29a, getstatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\ub171\u98a4\uc9f6\u12cb\u7006\u839e)))
            putstatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u6ec6\ufe34\u6b0d\u6fb0\u3bc9\u8640, invokestatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\ud171\u67d0\ub1b9\u8350\u7330\uc29a, getstatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u8d90\u6435\u34df\u071d\u0a06\u7873)))
            putstatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\ub70c\uc4d2\ua6bd\u7af6\u156b\ua562, invokestatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\ud171\u67d0\ub1b9\u8350\u7330\uc29a, getstatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u760c\ub83f\uc9f6\ub83f\u0a06\ud51e)))
            putstatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u47c2\uc4d2\u67d0\u6ec6\u97b7\u7e3f, invokestatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\ud171\u67d0\ub1b9\u8350\u7330\uc29a, getstatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u3bd6\u4492\u5fe1\u392e\u6b0d\ub171)))
            
            if (cmpgt:boolean(invokeinterface:int(List::size, var_2_67:ArrayList[expected:List]), ldc:int(0))) {
                invokestatic:void(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\ud217\u8aa5\u7006\u927d\u67e9\u3bd6, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u965f\u3d4b\u8258\ufcaf\u7330\u4975), and:int(ldc:int(566), ldc:int(13391)))), invokestatic:String(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u51fa\u64ab\u3e2a\ucfaf\uc3e3\uff55, invokeinterface:Object[](List::toArray, var_2_67:ArrayList[expected:List])))))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static java.util.List \u64ab\u69d9\ub70c\ua61f\u8308\u9033(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ua562\ud4fe\u647c\uc84e\u5245\u5f50 p0) {
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
            return:List(ternaryop:List<\u71ae\u6c56\uc29a\ubefe\u760c\u71ae>(cmpne:boolean(p0:\ua562\ud4fe\u647c\uc84e\u5245\u5f50, aconstnull:\ua562\ud4fe\u647c\uc84e\u5245\u5f50()), invokeinterface:List<\u71ae\u6c56\uc29a\ubefe\u760c\u71ae>(\ua562\ud4fe\u647c\uc84e\u5245\u5f50::\u527a\u965f\u69d9\ufe34\u7bad\u71f1, p0:\ua562\ud4fe\u647c\uc84e\u5245\u5f50, checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, aconstnull:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d()), checkcast:\u760c\u4975\u4179\uc246\u8640\u64f2(\u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2.class, aconstnull:\u760c\u4975\u4179\uc246\u8640\u64f2()), getstatic:Random(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\uff55\ud7e8\u61a4\u36d3\ua61f\u69d9)), aconstnull:List<\u71ae\u6c56\uc29a\ubefe\u760c\u71ae>()))
        }
        
        goto(Label_0006)
    }
    
    public static \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ua562\ud4fe\u647c\uc84e\u5245\u5f50 \ua6bd\u3e75\ua6bd\ub19c\u9a18\u6b5f(java.lang.String p0, java.util.List p1) {
        var_2_5F : int
        var_4_63 : \u7af6\u67d0\u8753\u71f1\u6198\u494c
        var_2_6E : int
        var_2_AE : int
        var_2_18E : int
        var_8_126 : \ua562\ud4fe\u647c\uc84e\u5245\u5f50
        var_9_176 : List<\u71ae\u6c56\uc29a\ubefe\u760c\u71ae>
        var_2_1B0 : int
        var_10_1B8 : Iterator<\u71ae\u6c56\uc29a\ubefe\u760c\u71ae>
        var_11_222 : \u71ae\u6c56\uc29a\ubefe\u760c\u71ae
        var_12_237 : List<\u71ae\u6c56\uc29a\ubefe\u760c\u71ae>
        
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
        var_2_5F = and:int(ldc:int(-1899088649), ldc:int(-1499463789))
        var_4_63 = invokestatic:\u7af6\u67d0\u8753\u71f1\u6198\u494c(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u8413\u3d64\u4179\uafe7\u3dd3\u4cd9)
        
        if (cmpeq:boolean(var_4_63:\u7af6\u67d0\u8753\u71f1\u6198\u494c, aconstnull:\u7af6\u67d0\u8753\u71f1\u6198\u494c())) {
            return:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(aconstnull:\ua562\ud4fe\u647c\uc84e\u5245\u5f50())
        }
        
        var_2_6E = and:int(var_2_5F:int, ldc:int(-2036403554))
        
        if (logicalnot:boolean(invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\ub18d\u3711\ubf56\ud51e\ua3b4\u64f2, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u965f\u3d4b\u8258\ufcaf\u7330\u4975), and:int(ldc:int(3535), ldc:int(23)))), p0:String), loadelement:String(getstatic:String[](\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u965f\u3d4b\u8258\ufcaf\u7330\u4975), xor:int(ldc:int(277), ldc:int(285))))))))) {
            return:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(aconstnull:\ua562\ud4fe\u647c\uc84e\u5245\u5f50())
        }
        
        var_2_AE = and:int(var_2_6E:int, ldc:int(-1478854698))
        
        if (logicalnot:boolean(invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\ub18d\u3711\ubf56\ud51e\ua3b4\u64f2, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u965f\u3d4b\u8258\ufcaf\u7330\u4975), xor:int(ldc:int(3459), ldc:int(3466)))), p0:String), loadelement:String(getstatic:String[](\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u965f\u3d4b\u8258\ufcaf\u7330\u4975), and:int(ldc:int(9082), ldc:int(141))))))))) {
            return:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(aconstnull:\ua562\ud4fe\u647c\uc84e\u5245\u5f50())
        }
        
        var_2_18E = and:int(var_2_AE:int, ldc:int(-154404137))
        var_8_126 = invokevirtual:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u7af6\u67d0\u8753\u71f1\u6198\u494c::\u446c\ubb2b\ufcaf\u183a\u88c5\u5140, var_4_63:\u7af6\u67d0\u8753\u71f1\u6198\u494c, initobject:\u71ae\u64ab\u718f\u9a18\uc31c\u7d52(\u71ae\u64ab\u718f\u9a18\uc31c\u7d52::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), p0:String), loadelement:String(getstatic:String[](\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u965f\u3d4b\u8258\ufcaf\u7330\u4975), and:int(ldc:int(3595), ldc:int(4378))))), loadelement:String(getstatic:String[](\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u965f\u3d4b\u8258\ufcaf\u7330\u4975), and:int(ldc:int(17179), ldc:int(2283)))))
        
        if (logicalor:boolean(cmpeq:boolean(var_8_126:\ua562\ud4fe\u647c\uc84e\u5245\u5f50, aconstnull:\ua562\ud4fe\u647c\uc84e\u5245\u5f50()), cmpeq:boolean(var_8_126:\ua562\ud4fe\u647c\uc84e\u5245\u5f50, invokevirtual:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u7af6\u67d0\u8753\u71f1\u6198\u494c::\ube23\u839e\u3a62\u40a9\u3a62\u8bb0, var_4_63:\u7af6\u67d0\u8753\u71f1\u6198\u494c)))) {
            return:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(aconstnull:\ua562\ud4fe\u647c\uc84e\u5245\u5f50())
        }
        
        var_9_176 = invokeinterface:List<\u71ae\u6c56\uc29a\ubefe\u760c\u71ae>(\ua562\ud4fe\u647c\uc84e\u5245\u5f50::\u527a\u965f\u69d9\ufe34\u7bad\u71f1, var_8_126:\ua562\ud4fe\u647c\uc84e\u5245\u5f50, checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, aconstnull:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d()), checkcast:\u760c\u4975\u4179\uc246\u8640\u64f2(\u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2.class, aconstnull:\u760c\u4975\u4179\uc246\u8640\u64f2()), getstatic:Random(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\uff55\ud7e8\u61a4\u36d3\ua61f\u69d9))
        
        if (cmpeq:boolean(invokeinterface:int(List::size, var_9_176:List<\u71ae\u6c56\uc29a\ubefe\u760c\u71ae>), ldc:int(0))) {
            return:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(var_8_126:\ua562\ud4fe\u647c\uc84e\u5245\u5f50)
        }
        
        loop {
            if (cmpeq:boolean(and:int(var_2_18E:int, ldc:int(536870912)), ldc:int(0))) {
                var_2_18E = and:int(var_2_18E:int, ldc:int(-1632964193))
                
                if (cmpne:boolean(invokeinterface:int(List<E>::size, var_9_176:List<\u71ae\u6c56\uc29a\ubefe\u760c\u71ae>), ldc:int(6))) {
                    return:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(aconstnull:\ua562\ud4fe\u647c\uc84e\u5245\u5f50())
                }
            }
            
            if (cmpne:boolean(and:int(var_2_18E:int, ldc:int(8388608)), ldc:int(0))) {
                var_2_1B0 = and:int(var_2_18E:int, ldc:int(-50677798))
                var_10_1B8 = invokeinterface:Iterator<\u71ae\u6c56\uc29a\ubefe\u760c\u71ae>(List<\u71ae\u6c56\uc29a\ubefe\u760c\u71ae>::iterator, var_9_176:List<\u71ae\u6c56\uc29a\ubefe\u760c\u71ae>)
                
                while (invokeinterface:boolean(Iterator<E>::hasNext, var_10_1B8:Iterator<\u71ae\u6c56\uc29a\ubefe\u760c\u71ae>)) {
                    var_11_222 = checkcast:\u71ae\u6c56\uc29a\ubefe\u760c\u71ae(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u71ae\u6c56\uc29a\ubefe\u760c\u71ae.class, invokeinterface:\u71ae\u6c56\uc29a\ubefe\u760c\u71ae(Iterator<\u71ae\u6c56\uc29a\ubefe\u760c\u71ae>::next, var_10_1B8:Iterator<\u71ae\u6c56\uc29a\ubefe\u760c\u71ae>))
                    var_12_237 = invokeinterface:List<\u71ae\u6c56\uc29a\ubefe\u760c\u71ae>(\ua562\ud4fe\u647c\uc84e\u5245\u5f50::\u527a\u965f\u69d9\ufe34\u7bad\u71f1, var_8_126:\ua562\ud4fe\u647c\uc84e\u5245\u5f50, checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, aconstnull:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d()), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u71ae\u6c56\uc29a\ubefe\u760c\u71ae::\u927d\u8258\uf995\u12b2\u960f\u8d98, var_11_222:\u71ae\u6c56\uc29a\ubefe\u760c\u71ae), getstatic:Random(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\uff55\ud7e8\u61a4\u36d3\ua61f\u69d9))
                    
                    if (cmpgt:boolean(invokeinterface:int(List::size, var_12_237:List<\u71ae\u6c56\uc29a\ubefe\u760c\u71ae>), ldc:int(0))) {
                        return:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(aconstnull:\ua562\ud4fe\u647c\uc84e\u5245\u5f50())
                    }
                    
                    var_2_1B0 = and:int(var_2_1B0:int, ldc:int(-557910598))
                    invokeinterface:boolean(List<\u71ae\u6c56\uc29a\ubefe\u760c\u71ae>::add, var_12_237:List<\u71ae\u6c56\uc29a\ubefe\u760c\u71ae>, var_11_222:\u71ae\u6c56\uc29a\ubefe\u760c\u71ae)
                }
                
                invokeinterface:void(List<E>::clear, var_9_176:List<\u71ae\u6c56\uc29a\ubefe\u760c\u71ae>)
                invokeinterface:boolean(List<String>::add, p1:List<String>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), p0:String), loadelement:String(getstatic:String[](\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u965f\u3d4b\u8258\ufcaf\u7330\u4975), xor:int(ldc:int(18447), ldc:int(18437))))))
                return:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(var_8_126:\ua562\ud4fe\u647c\uc84e\u5245\u5f50)
            }
            
            var_2_18E = and:int(var_2_18E:int, ldc:int(1754779706))
        }
    }
    
    private static \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ua562\ud4fe\u647c\uc84e\u5245\u5f50 \ud171\u67d0\ub1b9\u8350\u7330\uc29a(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ua562\ud4fe\u647c\uc84e\u5245\u5f50 p0) {
        var_1_61 : int
        var_3_9D : \u760c\u4975\u4179\uc246\u8640\u64f2[]
        var_4_A5 : int
        var_5_134 : \u760c\u4975\u4179\uc246\u8640\u64f2
        var_6_145 : List<\u71ae\u6c56\uc29a\ubefe\u760c\u71ae>
        var_4_117 : \ua562\ud4fe\u647c\uc84e\u5245\u5f50
        var_5_11E : List[]
        var_6_127 : int
        var_8_1DF : List<\u71ae\u6c56\uc29a\ubefe\u760c\u71ae>
        var_9_1F2 : \u71ae\u6c56\uc29a\ubefe\u760c\u71ae
        var_10_21D : \u71ae\u6c56\uc29a\ubefe\u760c\u71ae
        var_11_224 : int[]
        var_12_231 : int[]
        var_13_23E : int
        
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
        var_1_61 = and:int(ldc:int(-1041256772), ldc:int(-571486549))
        
        if (cmpne:boolean(p0:\ua562\ud4fe\u647c\uc84e\u5245\u5f50, aconstnull:\ua562\ud4fe\u647c\uc84e\u5245\u5f50())) {
            do {
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(65536)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(-771792968))
                    
                    if (cmple:boolean(invokeinterface:int(List<E>::size, invokeinterface:List<\u71ae\u6c56\uc29a\ubefe\u760c\u71ae>(\ua562\ud4fe\u647c\uc84e\u5245\u5f50::\u527a\u965f\u69d9\ufe34\u7bad\u71f1, p0:\ua562\ud4fe\u647c\uc84e\u5245\u5f50, checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, aconstnull:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d()), checkcast:\u760c\u4975\u4179\uc246\u8640\u64f2(\u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2.class, aconstnull:\u760c\u4975\u4179\uc246\u8640\u64f2()), getstatic:Random(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\uff55\ud7e8\u61a4\u36d3\ua61f\u69d9))), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    invokestatic:void(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u647c\u7043\u3bc9\u8bb0\ud36e\u927d, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u965f\u3d4b\u8258\ufcaf\u7330\u4975), and:int(ldc:int(17452), ldc:int(28)))), invokeinterface:int(List<E>::size, invokeinterface:List<\u71ae\u6c56\uc29a\ubefe\u760c\u71ae>(\ua562\ud4fe\u647c\uc84e\u5245\u5f50::\u527a\u965f\u69d9\ufe34\u7bad\u71f1, p0:\ua562\ud4fe\u647c\uc84e\u5245\u5f50, checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, aconstnull:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d()), checkcast:\u760c\u4975\u4179\uc246\u8640\u64f2(\u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2.class, aconstnull:\u760c\u4975\u4179\uc246\u8640\u64f2()), getstatic:Random(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\uff55\ud7e8\u61a4\u36d3\ua61f\u69d9)))), loadelement:String(getstatic:String[](\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u965f\u3d4b\u8258\ufcaf\u7330\u4975), and:int(ldc:int(28941), ldc:int(2575)))), p0:\ua562\ud4fe\u647c\uc84e\u5245\u5f50[expected:Object])))
                    return:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(p0:\ua562\ud4fe\u647c\uc84e\u5245\u5f50)
                }
            } while (cmpeq:boolean(and:int(var_1_61:int, ldc:int(4194304)), ldc:int(0)))
            
            var_3_9D = getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2[](\u760c\u4975\u4179\uc246\u8640\u64f2::\u3711\u0800\u59ec\ucfaf\uc31c\u97b7)
            var_4_A5 = and:int(ldc:int(12589), ldc:int(-12590))
            
            while (cmplt:boolean(var_4_A5:int, arraylength:int(var_3_9D:\u760c\u4975\u4179\uc246\u8640\u64f2[]))) {
                var_5_134 = loadelement:\u760c\u4975\u4179\uc246\u8640\u64f2(var_3_9D:\u760c\u4975\u4179\uc246\u8640\u64f2[], var_4_A5:int)
                var_6_145 = invokeinterface:List<\u71ae\u6c56\uc29a\ubefe\u760c\u71ae>(\ua562\ud4fe\u647c\uc84e\u5245\u5f50::\u527a\u965f\u69d9\ufe34\u7bad\u71f1, p0:\ua562\ud4fe\u647c\uc84e\u5245\u5f50, checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, aconstnull:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d()), var_5_134:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:Random(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\uff55\ud7e8\u61a4\u36d3\ua61f\u69d9))
                
                if (cmpne:boolean(invokeinterface:int(List<E>::size, var_6_145:List<\u71ae\u6c56\uc29a\ubefe\u760c\u71ae>), xor:int(ldc:int(14337), ldc:int(14336)))) {
                    invokestatic:void(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u647c\u7043\u3bc9\u8bb0\ud36e\u927d, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u965f\u3d4b\u8258\ufcaf\u7330\u4975), and:int(ldc:int(30223), ldc:int(14)))), var_5_134:\u760c\u4975\u4179\uc246\u8640\u64f2[expected:Object]), loadelement:String(getstatic:String[](\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u965f\u3d4b\u8258\ufcaf\u7330\u4975), xor:int(ldc:int(5126), ldc:int(5129)))), invokeinterface:int(List<E>::size, var_6_145:List<\u71ae\u6c56\uc29a\ubefe\u760c\u71ae>)), loadelement:String(getstatic:String[](\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u965f\u3d4b\u8258\ufcaf\u7330\u4975), xor:int(ldc:int(228), ldc:int(233)))), p0:\ua562\ud4fe\u647c\uc84e\u5245\u5f50[expected:Object])))
                    return:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(p0:\ua562\ud4fe\u647c\uc84e\u5245\u5f50)
                }
                
                inc:int(var_4_A5, ldc:int(1))
            }
            
            var_4_117 = invokestatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u93a2\u5245\u0c95\ud12e\u946b\uc246::\u3e75\u51fa\u8753\u9033\u61a4\ub171, p0:\ua562\ud4fe\u647c\uc84e\u5245\u5f50)
            var_5_11E = newarray:List[](java.util.List.class, arraylength:int(var_3_9D:\u760c\u4975\u4179\uc246\u8640\u64f2[]))
            var_6_127 = and:int(ldc:int(-26682), ldc:int(10296))
            
            while (cmplt:boolean(var_6_127:int, arraylength:int(var_3_9D:\u760c\u4975\u4179\uc246\u8640\u64f2[]))) {
                var_8_1DF = invokeinterface:List<\u71ae\u6c56\uc29a\ubefe\u760c\u71ae>(\ua562\ud4fe\u647c\uc84e\u5245\u5f50::\u527a\u965f\u69d9\ufe34\u7bad\u71f1, var_4_117:\ua562\ud4fe\u647c\uc84e\u5245\u5f50, checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, aconstnull:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d()), loadelement:\u760c\u4975\u4179\uc246\u8640\u64f2(var_3_9D:\u760c\u4975\u4179\uc246\u8640\u64f2[], var_6_127:int), getstatic:Random(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\uff55\ud7e8\u61a4\u36d3\ua61f\u69d9))
                var_9_1F2 = checkcast:\u71ae\u6c56\uc29a\ubefe\u760c\u71ae(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u71ae\u6c56\uc29a\ubefe\u760c\u71ae.class, invokeinterface:\u71ae\u6c56\uc29a\ubefe\u760c\u71ae(List<\u71ae\u6c56\uc29a\ubefe\u760c\u71ae>::get, var_8_1DF:List<\u71ae\u6c56\uc29a\ubefe\u760c\u71ae>, and:int(ldc:int(24693), ldc:int(-25846))))
                var_10_21D = initobject:\u71ae\u6c56\uc29a\ubefe\u760c\u71ae(\u71ae\u6c56\uc29a\ubefe\u760c\u71ae::<init>, checkcast:int[](int[].class, checkcast:int[](int[].class, invokevirtual:int[](int[]::clone, invokevirtual:int[](\u71ae\u6c56\uc29a\ubefe\u760c\u71ae::\u6ec6\u7ce1\u494c\u52d3\u624e\ubf56, var_9_1F2:\u71ae\u6c56\uc29a\ubefe\u760c\u71ae)))), invokevirtual:int(\u71ae\u6c56\uc29a\ubefe\u760c\u71ae::\ub8be\u6435\u7330\ud36e\u3711\u59ec, var_9_1F2:\u71ae\u6c56\uc29a\ubefe\u760c\u71ae), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u71ae\u6c56\uc29a\ubefe\u760c\u71ae::\u927d\u8258\uf995\u12b2\u960f\u8d98, var_9_1F2:\u71ae\u6c56\uc29a\ubefe\u760c\u71ae), invokevirtual:\u97b7\u8350\u99f7\ub1b9\u839e\u873d(\u71ae\u6c56\uc29a\ubefe\u760c\u71ae::\ua562\u0a06\u64f2\uc2bd\u71ae\u71ae, var_9_1F2:\u71ae\u6c56\uc29a\ubefe\u760c\u71ae), invokevirtual:boolean(\u71ae\u6c56\uc29a\ubefe\u760c\u71ae::\uc9f6\ud523\u416d\u4d85\u946b\u0b8e, var_9_1F2:\u71ae\u6c56\uc29a\ubefe\u760c\u71ae))
                var_11_224 = invokevirtual:int[](\u71ae\u6c56\uc29a\ubefe\u760c\u71ae::\u6ec6\u7ce1\u494c\u52d3\u624e\ubf56, var_10_21D:\u71ae\u6c56\uc29a\ubefe\u760c\u71ae)
                var_12_231 = checkcast:int[](int[].class, checkcast:int[](int[].class, invokevirtual:int[](int[]::clone, var_11_224:int[])))
                var_13_23E = div:int(arraylength:int(var_11_224:int[]), xor:int(ldc:int(27648), ldc:int(27652)))
                invokestatic:void(System::arraycopy, var_11_224:int[][expected:Object], mul:int(and:int(ldc:int(2388), ldc:int(-2389)), var_13_23E:int), var_12_231:int[][expected:Object], mul:int(xor:int(ldc:int(4244), ldc:int(4247)), var_13_23E:int), var_13_23E:int)
                invokestatic:void(System::arraycopy, var_11_224:int[][expected:Object], mul:int(and:int(ldc:int(11377), ldc:int(4107)), var_13_23E:int), var_12_231:int[][expected:Object], mul:int(xor:int(ldc:int(102), ldc:int(100)), var_13_23E:int), var_13_23E:int)
                invokestatic:void(System::arraycopy, var_11_224:int[][expected:Object], mul:int(and:int(ldc:int(12611), ldc:int(3646)), var_13_23E:int), var_12_231:int[][expected:Object], mul:int(xor:int(ldc:int(4385), ldc:int(4384)), var_13_23E:int), var_13_23E:int)
                invokestatic:void(System::arraycopy, var_11_224:int[][expected:Object], mul:int(xor:int(ldc:int(7), ldc:int(4)), var_13_23E:int), var_12_231:int[][expected:Object], mul:int(and:int(ldc:int(10386), ldc:int(-10391)), var_13_23E:int), var_13_23E:int)
                invokestatic:void(System::arraycopy, var_12_231:int[][expected:Object], and:int(ldc:int(-9155), ldc:int(9154)), var_11_224:int[][expected:Object], and:int(ldc:int(7451), ldc:int(-7456)), arraylength:int(var_12_231:int[]))
                invokeinterface:boolean(List<\u71ae\u6c56\uc29a\ubefe\u760c\u71ae>::add, var_8_1DF:List<\u71ae\u6c56\uc29a\ubefe\u760c\u71ae>, var_10_21D:\u71ae\u6c56\uc29a\ubefe\u760c\u71ae)
                inc:int(var_6_127, ldc:int(1))
            }
            
            return:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(var_4_117:\ua562\ud4fe\u647c\uc84e\u5245\u5f50)
        }
        
        return:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(aconstnull:\ua562\ud4fe\u647c\uc84e\u5245\u5f50())
    }
    
    static {
        var_0_477 : int
        expr_6E : int [generated]
        stack_9A_0 : byte[] [generated]
        stack_9C_0 : byte[] [generated]
        stack_C8_0 : byte[] [generated]
        stack_CA_0 : byte[] [generated]
        stack_FE_0 : byte[] [generated]
        stack_100_0 : byte[] [generated]
        stack_12C_0 : byte[] [generated]
        stack_387_0 : byte[] [generated]
        stack_3FE_0 : byte[] [generated]
        stack_492_0 : byte[] [generated]
        stack_4CD_0 : byte[] [generated]
        var_4_359 : int
        var_3_35E : byte[]
        var_5_35F : int
        expr_38A : byte [generated]
        var_0_417 : int
        expr_3FE : byte [generated]
        stack_445_2 : byte [generated]
        stack_41A_0 : byte [generated]
        expr_9C : int [generated]
        expr_CA : int [generated]
        var_2_FE : byte[]
        expr_102 : int [generated]
        var_3_4BB : byte[]
        var_5_4BC : int
        var_3_138 : String
        stack_300_0 : String[] [generated]
        expr_14A : String[] [generated]
        
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
        var_0_477 = and:int(ldc:int(1187660768), ldc:int(-554392774))
        expr_6E = arraylength:int(stack_9A_0 = stack_9C_0 = stack_C8_0 = stack_CA_0 = stack_FE_0 = stack_100_0 = stack_12C_0 = stack_387_0 = stack_3FE_0 = stack_492_0 = stack_4CD_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("nY0oeDFKYrjlrW4AcFlCGQZmf3CHelhIlXBiYOfF1wCXWBESyBZub6/AEMDeaBeJSlEGjSd4Qoe3YLdABRoIaJ2XKnKXJv149xCv8uenbgBwWUJpFm5vr8AQwN5oF4lKUQaNJ3hCh7dgt0AFGghonZcqcvdGjRgZQlgWhZ/XaBeorxCX12gXKrdgZo/4CBift2hoYBdgYODXv2Bwjxcwl+AfWmDwhb9wSDDHSA+HQCAwv5dgIHj/0ThYbmhwYsePhXAQWJdoeI/nr58YEMOgsN0=")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_359 = expr_6E:int
        var_3_35E = newarray:byte[](byte.class, expr_6E:int)
        var_5_35F = expr_6E:int
        Label_0865:
        
        while (cmpne:boolean(and:int(var_0_477:int, ldc:int(32)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_477:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_0975)
            }
            
            var_0_477 = and:int(var_0_477:int, ldc:int(-27206351))
            var_5_35F = add:int(var_5_35F:int, ldc:int(-1))
            expr_38A = xor:byte(loadelement:byte(stack_387_0:byte[], var_5_35F:int), ldc:byte(104))
            storeelement:byte(var_3_35E:byte[], var_5_35F:int, or:int(and:int(shl:int(expr_38A:byte, xor:int(ldc:int(12834), ldc:int(12838))), ldc:int(-16)), and:int(shr:int(expr_38A:byte[expected:int], and:int(ldc:int(21004), ldc:int(1349))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_35F:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9C_0 = stack_9A_0 = stack_C8_0 = stack_CA_0 = stack_FE_0 = stack_100_0 = stack_12C_0 = stack_387_0 = stack_3FE_0 = stack_492_0 = stack_4CD_0 = var_3_35E:byte[]
            goto(Label_0115)
        }
        
        var_0_477 = and:int(var_0_477:int, ldc:int(-241695842))
        goto(Label_1131)
        Label_0975:
        
        while (cmpeq:boolean(and:int(var_0_477:int, ldc:int(2048)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_477:int, ldc:int(32)), ldc:int(0))) {
                var_0_477 = and:int(var_0_477:int, ldc:int(-1366352494))
                goto(Label_0865)
            }
            
            var_0_417 = and:int(var_0_477:int, ldc:int(2139071482))
            var_5_35F = add:int(var_5_35F:int, ldc:int(-1))
            expr_3FE = stack_445_2 = loadelement(stack_3FE_0, var_5_35F)
            
            if (cmplt:boolean(add:int(add:int(var_5_35F:int, ldc:int(3)), neg:int(var_4_359:int)), ldc:int(0))) {
                stack_445_2 = stack_41A_0 = add:byte(expr_3FE:byte, loadelement:byte(var_3_35E:byte[], add:int(var_5_35F:int, ldc:int(3))))
                goto(Label_1066)
            }
            
            Label_1035:
            
            if (cmpne:boolean(and:int(var_0_417:int, ldc:int(33554432)), ldc:int(0))) {
                var_0_417 = and:int(var_0_417:int, ldc:int(1179188714))
                stack_445_2 = stack_41A_0 = add:byte(expr_3FE:byte, ldc:byte(3))
            }
            
            Label_1066:
            
            if (cmpne:boolean(and:int(var_0_417:int, ldc:int(32768)), ldc:int(0))) {
                var_0_417 = and:int(var_0_417:int, ldc:int(486243192))
                goto(Label_1035)
            }
            
            var_0_477 = and:int(var_0_417:int, ldc:int(1119887803))
            storeelement:byte(var_3_35E:byte[], var_5_35F:int, stack_445_2:byte)
            
            if (cmpne:boolean(var_5_35F:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9C_0 = stack_9A_0 = stack_C8_0 = stack_CA_0 = stack_FE_0 = stack_100_0 = stack_12C_0 = stack_387_0 = stack_3FE_0 = stack_492_0 = stack_4CD_0 = var_3_35E:byte[]
            goto(Label_0161)
        }
        
        var_0_477 = and:int(var_0_477:int, ldc:int(645191069))
        Label_1131:
        
        while (cmpne:boolean(and:int(var_0_477:int, ldc:int(33554432)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_477:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0865)
            }
            
            var_0_477 = and:int(var_0_477:int, ldc:int(1322971575))
            var_5_35F = add:int(var_5_35F:int, ldc:int(-1))
            storeelement:byte(var_3_35E:byte[], var_5_35F:int, add:byte(loadelement:byte(stack_492_0:byte[], var_5_35F:int), ldc:byte(34)))
            
            if (cmpne:boolean(var_5_35F:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9C_0 = stack_9A_0 = stack_C8_0 = stack_CA_0 = stack_FE_0 = stack_100_0 = stack_12C_0 = stack_387_0 = stack_3FE_0 = stack_492_0 = stack_4CD_0 = var_3_35E:byte[]
            goto(Label_0207)
        }
        
        var_0_477 = and:int(var_0_477:int, ldc:int(647834729))
        goto(Label_0975)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_477:int, ldc:int(262144)), ldc:int(0))) {
            goto(Label_0263)
        }
        
        if (cmpne:boolean(and:int(var_0_477:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_477 = and:int(var_0_477:int, ldc:int(1896390253))
            goto(Label_0207)
        }
        
        if (cmpeq:boolean(and:int(var_0_477:int, ldc:int(262144)), ldc:int(0))) {
            var_0_477 = and:int(var_0_477:int, ldc:int(-489569307))
            expr_9C = arraylength:int(stack_9C_0:byte[])
            
            if (cmpne:boolean(expr_9C:int, ldc:int(0))) {
                var_4_359 = expr_9C:int
                var_3_35E = newarray:byte[](byte.class, expr_9C:int)
                var_5_35F = expr_9C:int
                goto(Label_0975)
            }
        }
        
        Label_0161:
        
        if (cmpne:boolean(and:int(var_0_477:int, ldc:int(32768)), ldc:int(0))) {
            goto(Label_0263)
        }
        
        if (cmpeq:boolean(and:int(var_0_477:int, ldc:int(8192)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_477:int, ldc:int(4194304)), ldc:int(0))) {
                var_0_477 = and:int(var_0_477:int, ldc:int(-445488402))
                goto(Label_0115)
            }
            
            var_0_477 = and:int(var_0_477:int, ldc:int(-755938970))
            expr_CA = arraylength:int(stack_CA_0:byte[])
            
            if (cmpne:boolean(expr_CA:int, ldc:int(0))) {
                var_4_359 = expr_CA:int
                var_3_35E = newarray:byte[](byte.class, expr_CA:int)
                var_5_35F = expr_CA:int
                goto(Label_1131)
            }
        }
        
        Label_0207:
        
        if (cmpne:boolean(and:int(var_0_477:int, ldc:int(2048)), ldc:int(0))) {
            var_0_477 = and:int(var_0_477:int, ldc:int(-1945681015))
        }
        else {
            if (cmpne:boolean(and:int(var_0_477:int, ldc:int(8192)), ldc:int(0))) {
                var_0_477 = and:int(var_0_477:int, ldc:int(1340799865))
                goto(Label_0161)
            }
            
            if (cmpne:boolean(and:int(var_0_477:int, ldc:int(2048)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_477 = and:int(var_0_477:int, ldc:int(1987185465))
            var_2_FE = stack_FE_0:byte[]
            expr_102 = add:int(arraylength:int(stack_100_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_102:int, ldc:int(0))) {
                var_3_4BB = newarray:byte[](byte.class, expr_102:int)
                var_5_4BC = expr_102:int
                
                loop {
                    var_0_477 = and:int(var_0_477:int, ldc:int(-898117659))
                    var_5_4BC = add:int(var_5_4BC:int, ldc:int(-1))
                    storeelement:byte(var_3_4BB:byte[], var_5_4BC:int, add:int(shl:int(loadelement:byte(stack_4CD_0:byte[], var_5_4BC:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_FE:byte[], add:int(var_5_4BC:int, and:int(ldc:int(16417), ldc:int(273)))), ldc:int(7)), and:int(ldc:int(579), ldc:int(30749)))))
                    
                    if (cmpne:boolean(var_5_4BC:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9C_0 = stack_9A_0 = stack_C8_0 = stack_CA_0 = stack_FE_0 = stack_100_0 = stack_12C_0 = stack_387_0 = stack_3FE_0 = stack_492_0 = stack_4CD_0 = var_3_4BB:byte[]
            }
        }
        
        Label_0263:
        
        if (cmpeq:boolean(and:int(var_0_477:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_477 = and:int(var_0_477:int, ldc:int(1544225215))
            goto(Label_0207)
        }
        
        if (cmpne:boolean(and:int(var_0_477:int, ldc:int(8192)), ldc:int(0))) {
            goto(Label_0161)
        }
        
        if (cmpeq:boolean(and:int(var_0_477:int, ldc:int(2)), ldc:int(0))) {
            var_3_138 = initobject:String(String::<init>, stack_12C_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_300_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(8721), ldc:int(4372)))
            expr_14A = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(6160), ldc:int(25275)))
            storeelement:String(expr_14A:String[], xor:int(ldc:int(75), ldc:int(70)), invokevirtual:String[expected:String](String::substring, var_3_138:String, and:int(ldc:int(26971), ldc:int(-27100)), and:int(ldc:int(4747), ldc:int(26633))))
            storeelement:String(expr_14A:String[], and:int(ldc:int(527), ldc:int(3343)), invokevirtual:String[expected:String](String::substring, var_3_138:String, xor:int(ldc:int(8213), ldc:int(8220)), xor:int(ldc:int(280), ldc:int(266))))
            storeelement:String(expr_14A:String[], and:int(ldc:int(6470), ldc:int(25766)), invokevirtual:String[expected:String](String::substring, var_3_138:String, and:int(ldc:int(23579), ldc:int(626)), xor:int(ldc:int(-19424), ldc:int(-19449))))
            storeelement:String(expr_14A:String[], xor:int(ldc:int(527), ldc:int(515)), invokevirtual:String[expected:String](String::substring, var_3_138:String, and:int(ldc:int(21031), ldc:int(423)), and:int(ldc:int(1110), ldc:int(20822))))
            storeelement:String(expr_14A:String[], and:int(ldc:int(4111), ldc:int(18030)), invokevirtual:String[expected:String](String::substring, var_3_138:String, xor:int(ldc:int(1050), ldc:int(1100)), and:int(ldc:int(1148), ldc:int(12540))))
            storeelement:String(expr_14A:String[], xor:int(ldc:int(12300), ldc:int(12294)), invokevirtual:String[expected:String](String::substring, var_3_138:String, xor:int(ldc:int(789), ldc:int(873)), and:int(ldc:int(10627), ldc:int(227))))
            storeelement:String(expr_14A:String[], xor:int(ldc:int(-32734), ldc:int(-32726)), invokevirtual:String[expected:String](String::substring, var_3_138:String, and:int(ldc:int(16843), ldc:int(8371)), xor:int(ldc:int(8404), ldc:int(8283))))
            storeelement:String(expr_14A:String[], and:int(ldc:int(-21877), ldc:int(21812)), invokevirtual:String[expected:String](String::substring, var_3_138:String, and:int(ldc:int(16879), ldc:int(4239)), xor:int(ldc:int(4315), ldc:int(4174))))
            storeelement:String(expr_14A:String[], and:int(ldc:int(1423), ldc:int(4145)), invokevirtual:String[expected:String](String::substring, var_3_138:String, and:int(ldc:int(1973), ldc:int(157)), and:int(ldc:int(17306), ldc:int(6331))))
            storeelement:String(expr_14A:String[], xor:int(ldc:int(16404), ldc:int(16403)), invokevirtual:String[expected:String](String::substring, var_3_138:String, xor:int(ldc:int(8551), ldc:int(8701)), and:int(ldc:int(32494), ldc:int(183))))
            storeelement:String(expr_14A:String[], and:int(ldc:int(20750), ldc:int(10242)), invokevirtual:String[expected:String](String::substring, var_3_138:String, xor:int(ldc:int(-20396), ldc:int(-20238)), xor:int(ldc:int(839), ldc:int(1001))))
            storeelement:String(expr_14A:String[], and:int(ldc:int(10243), ldc:int(21575)), invokevirtual:String[expected:String](String::substring, var_3_138:String, xor:int(ldc:int(2726), ldc:int(2568)), xor:int(ldc:int(1670), ldc:int(1586))))
            storeelement:String(expr_14A:String[], xor:int(ldc:int(5511), ldc:int(5518)), invokevirtual:String[expected:String](String::substring, var_3_138:String, xor:int(ldc:int(-8185), ldc:int(-8013)), and:int(ldc:int(6337), ldc:int(17601))))
            storeelement:String(expr_14A:String[], and:int(ldc:int(523), ldc:int(17835)), invokevirtual:String[expected:String](String::substring, var_3_138:String, and:int(ldc:int(17097), ldc:int(15829)), and:int(ldc:int(2807), ldc:int(1223))))
            storeelement:String(expr_14A:String[], and:int(ldc:int(17540), ldc:int(2564)), invokevirtual:String[expected:String](String::substring, var_3_138:String, xor:int(ldc:int(-32274), ldc:int(-32471)), and:int(ldc:int(3819), ldc:int(12490))))
            storeelement:String(expr_14A:String[], and:int(ldc:int(8709), ldc:int(37)), invokevirtual:String[expected:String](String::substring, var_3_138:String, xor:int(ldc:int(1050), ldc:int(1232)), xor:int(ldc:int(8260), ldc:int(8340))))
            putstatic:String[](\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u965f\u3d4b\u8258\ufcaf\u7330\u4975, expr_14A:String[])
            putstatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u6d99\u3776\u624e\u120d\u3a62\u7c6b, aconstnull:\ua562\ud4fe\u647c\uc84e\u5245\u5f50())
            putstatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u7c6b\u67d0\u516c\ud4fe\u16f6\u74b1, aconstnull:\ua562\ud4fe\u647c\uc84e\u5245\u5f50())
            putstatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\ub171\u98a4\uc9f6\u12cb\u7006\u839e, aconstnull:\ua562\ud4fe\u647c\uc84e\u5245\u5f50())
            putstatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u8d90\u6435\u34df\u071d\u0a06\u7873, aconstnull:\ua562\ud4fe\u647c\uc84e\u5245\u5f50())
            putstatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u760c\ub83f\uc9f6\ub83f\u0a06\ud51e, aconstnull:\ua562\ud4fe\u647c\uc84e\u5245\u5f50())
            putstatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u3bd6\u4492\u5fe1\u392e\u6b0d\ub171, aconstnull:\ua562\ud4fe\u647c\uc84e\u5245\u5f50())
            putstatic:List(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\ucef1\u4492\uc238\u760c\u4bc8\ua6bd, aconstnull:List())
            putstatic:List(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\uc87f\ub1b9\ub7dc\u67e9\u9255\u5654, aconstnull:List())
            putstatic:List(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\ub83f\u760c\uc87f\ubded\u6c56\ubcb0, aconstnull:List())
            putstatic:List(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\ud36e\ua61f\ubb2b\u98a4\uc7fe\ucef1, aconstnull:List())
            putstatic:List(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\ud12e\u6435\uff55\u839e\u4cd9\u64ab, aconstnull:List())
            putstatic:List(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u36d3\u6d99\ud7e8\uae5d\u071d\u16f6, aconstnull:List())
            putstatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u494c\u0a06\u3d64\ub1b9\ud523\u7006, aconstnull:\ua562\ud4fe\u647c\uc84e\u5245\u5f50())
            putstatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u392e\ubb2b\u9af2\u3e2a\uc9f6\u4ab3, aconstnull:\ua562\ud4fe\u647c\uc84e\u5245\u5f50())
            putstatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\uff55\u69d9\u4c04\ud217\u3d64\u965f, aconstnull:\ua562\ud4fe\u647c\uc84e\u5245\u5f50())
            putstatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u6ec6\ufe34\u6b0d\u6fb0\u3bc9\u8640, aconstnull:\ua562\ud4fe\u647c\uc84e\u5245\u5f50())
            putstatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\ub70c\uc4d2\ua6bd\u7af6\u156b\ua562, aconstnull:\ua562\ud4fe\u647c\uc84e\u5245\u5f50())
            putstatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\u47c2\uc4d2\u67d0\u6ec6\u97b7\u7e3f, aconstnull:\ua562\ud4fe\u647c\uc84e\u5245\u5f50())
            putstatic:Random(\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1::\uff55\ud7e8\u61a4\u36d3\ua61f\u69d9, initobject:Random(Random::<init>))
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u6ec6\ud171\u72f1\u4d85\u12b2\u3c25(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_655 : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_C7 : double
        var_3_D9 : int
        var_11_EA : int
        var_14_114 : double
        var_16_118 : int
        var_12_110 : double
        var_17_660 : int
        
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
        var_3_655 = and:int(ldc:int(-2113426909), ldc:int(-367611349))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6bb9\ud4fe\uff55\u7006\u7c6b\u5fe1[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(32768)), ldc:int(0))) {
            var_3_655 = and:int(var_3_655:int, ldc:int(-1240014429))
            var_5_80 = and:int(ldc:int(25673), ldc:int(-25834))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(1634), ldc:int(-1635)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C7 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D9 = and:int(var_3_655:int, ldc:int(-951058565))
                    var_9_C7 = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EA = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EA:int, sub:int(var_6_87:int, xor:int(ldc:int(28704), ldc:int(28705)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EA:int, and:int(ldc:int(3209), ldc:int(20993)))), var_7_96:double))) {
                        inc:int(var_11_EA, ldc:int(1))
                    }
                    
                    var_3_655 = and:int(var_3_D9:int, ldc:int(-362892637))
                    var_14_114 = var_7_96:double
                    var_16_118 = var_11_EA:int
                }
                else {
                    var_11_EA = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), xor:int(ldc:int(-32742), ldc:int(-32741)))
                    var_12_110 = var_14_114 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_118 = var_11_EA:int, var_6_87:int)) {
                        var_9_C7 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EA:int)
                        var_16_118 = var_11_EA:int
                        var_14_114 = var_12_110:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1495)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1353)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1203)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-1339268876))
                        goto(Label_1047)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(1896663348))
                        goto(Label_0907)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0807)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-1123586785))
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0537)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(1)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-1686129809))
                        
                        if (cmplt:boolean(var_16_118:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0537)
                            }
                            
                            goto(Label_0807)
                        }
                    }
                    
                    Label_0396:
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1495)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1353)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1203)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-652913373))
                        goto(Label_1047)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0907)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0807)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(8)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-306291596))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(-624954961))
                            var_11_EA = and:int(ldc:int(25048), ldc:int(-25049))
                            goto(Label_1484)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0537:
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(1941742457))
                        goto(Label_1495)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(490724104))
                        goto(Label_1353)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1203)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1047)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0907)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0807)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(1)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-376026155))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0396)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(8)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(1166812249))
                            loopcontinue()
                        }
                        
                        var_3_655 = and:int(var_3_655:int, ldc:int(-1302860565))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_114 = var_9_C7:double
                            goto(Label_0807)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-469128197))
                        goto(Label_1495)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1353)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-569854069))
                        goto(Label_1203)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(1661312541))
                        goto(Label_1047)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(1564759823))
                        goto(Label_0907)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(1264436497))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0537)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0396)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(-540088370))
                            loopcontinue()
                        }
                        
                        var_3_655 = and:int(var_3_655:int, ldc:int(-1571899665))
                        var_14_114 = mul:double(ldc:double(0.5), add:double(var_9_C7:double, var_14_114:double))
                    }
                    
                    Label_0807:
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1495)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(32)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-1161296841))
                        goto(Label_1353)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1203)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1047)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0537)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0396)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(316677502))
                            loopcontinue()
                        }
                        
                        var_3_655 = and:int(var_3_655:int, ldc:int(-1907951953))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_EA = xor:int(ldc:int(8200), ldc:int(8201))
                                goto(Label_1047)
                            }
                        }
                    }
                    
                    Label_0907:
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-2051038124))
                        goto(Label_1495)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1353)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1203)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0807)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(375051945))
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0537)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0396)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_655 = and:int(var_3_655:int, ldc:int(-753485445))
                        var_11_EA = and:int(ldc:int(18628), ldc:int(-18629))
                    }
                    
                    Label_1047:
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(1993191161))
                        goto(Label_1495)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1353)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(655992992))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(1869403254))
                            goto(Label_0907)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(-1183133310))
                            goto(Label_0807)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(1)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(478011319))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(1555610441))
                            goto(Label_0537)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(-1982158825))
                            goto(Label_0396)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(-48637008))
                            loopcontinue()
                        }
                        
                        var_3_655 = and:int(var_3_655:int, ldc:int(-24660509))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                                goto(Label_1353)
                            }
                        }
                    }
                    
                    Label_1203:
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(2078855440))
                        goto(Label_1495)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(228802503))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_1047)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0907)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(2)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(1849354791))
                            goto(Label_0807)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(8)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(-574872648))
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(-1512493556))
                            goto(Label_0537)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0396)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(32)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(1297788169))
                            loopcontinue()
                        }
                        
                        var_3_655 = and:int(var_3_655:int, ldc:int(-1754793997))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_114:double, var_5_80:int, var_16_118:int)
                        goto(Label_1484)
                    }
                    
                    Label_1353:
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1495)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1203)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(1150522332))
                        goto(Label_1047)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(32)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(710148647))
                        goto(Label_0907)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0807)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-1935052984))
                        goto(Label_0537)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0396)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(1380193126))
                        loopcontinue()
                    }
                    
                    var_3_655 = and:int(var_3_655:int, ldc:int(-297276045))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_114:double, ldc:double(0.0))
                    Label_1484:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_660 = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1495:
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-1237802252))
                        goto(Label_1353)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1203)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(1569330064))
                        goto(Label_1047)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-1266468291))
                        goto(Label_0907)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(32)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(815159705))
                        goto(Label_0807)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(2)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(476519535))
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0537)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-1536782212))
                        goto(Label_0396)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(32)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-694685777))
                        var_17_660 = add:int(var_16_118:int, and:int(ldc:int(5153), ldc:int(10819)))
                        looporswitchbreak()
                    }
                }
                
                var_3_655 = and:int(var_3_655:int, ldc:int(-203445569))
                
                if (cmple:boolean(var_5_80 = var_17_660:int, sub:int(var_6_87:int, and:int(ldc:int(23683), ldc:int(8449))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_655 = and:int(var_3_655:int, ldc:int(-2129538440))
            goto(Label_0108)
        }
    }
}
