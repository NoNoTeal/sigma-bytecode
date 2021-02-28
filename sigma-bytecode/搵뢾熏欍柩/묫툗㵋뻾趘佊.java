public class \u6435\ub8be\u718f\u6b0d\u67e9.\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a {
    public void \ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99 p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u7af6\u67d0\u8753\u71f1\u6198\u494c p1, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\uc910\u3c25\u93a2\u873d\u983f\ud7e8 p2) {
        stack_AE_0 : \ub113\u6435\u927d\u6b0d\u8cae\ubcb0 [generated]
        expr_9E : Object[] [generated]
        var_6_C1 : Iterator<\u9af2\u1833\u156b\u12cb\u7d52\u6c52>
        var_7_E9 : \u9af2\u1833\u156b\u12cb\u7d52\u6c52
        
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
            invokespecial:Object(Object::<init>, this:\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a)
            putfield:\u7af6\u67d0\u8753\u71f1\u6198\u494c(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\u5245\u3c25\u4d85\u8aa5\u600f\u71ae, this:\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a, aconstnull:\u7af6\u67d0\u8753\u71f1\u6198\u494c())
            putfield:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\ucfaf\u071d\u52d3\u183a\u92ff\u760c, this:\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a, p0:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99)
            putfield:\u7af6\u67d0\u8753\u71f1\u6198\u494c(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\u5245\u3c25\u4d85\u8aa5\u600f\u71ae, this:\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a, p1:\u7af6\u67d0\u8753\u71f1\u6198\u494c)
            
            if (logicalnot:boolean(invokevirtual:boolean(\ub113\u6435\u927d\u6b0d\u8cae\ubcb0::\ub18d\u8d90\u1187\ub32d\u34df\u8258, getstatic:\ub113\u6435\u927d\u6b0d\u8cae\ubcb0(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\uc246\u8640\uc84e\u7006\u965f\u56bd)))) {
                putfield:\u51fa\u965f\u12b2\u4d85\u5654\uc7fe(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\ub102\ub171\ub113\u946b\ub7dc\u8258, this:\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a, initobject:\u51fa\u965f\u12b2\u4d85\u5654\uc7fe(\u51fa\u965f\u12b2\u4d85\u5654\uc7fe::<init>, p1:\u7af6\u67d0\u8753\u71f1\u6198\u494c))
            }
            else {
                stack_AE_0 = getstatic:\ub113\u6435\u927d\u6b0d\u8cae\ubcb0(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\uc246\u8640\uc84e\u7006\u965f\u56bd)
                expr_9E = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(2200), ldc:int(2201)))
                storeelement:Object(expr_9E:Object[], and:int(ldc:int(-18620), ldc:int(18491)), getfield:\u7af6\u67d0\u8753\u71f1\u6198\u494c[expected:Object](\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\u5245\u3c25\u4d85\u8aa5\u600f\u71ae, this:\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a))
                putfield:\u51fa\u965f\u12b2\u4d85\u5654\uc7fe(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\ub102\ub171\ub113\u946b\ub7dc\u8258, this:\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a, checkcast:\u51fa\u965f\u12b2\u4d85\u5654\uc7fe(\u4f52\u6cfe\u9a18\uc29a\u3bd6.\u51fa\u965f\u12b2\u4d85\u5654\uc7fe.class, invokestatic:Object(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u8c8a\ub32d\u72f1\ub83f\u6b0d\u8bb0, stack_AE_0:\ub113\u6435\u927d\u6b0d\u8cae\ubcb0, expr_9E:Object[])))
            }
            
            var_6_C1 = invokevirtual:Iterator<Object>(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<Object>::iterator, getstatic:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\u9af2\u1833\u156b\u12cb\u7d52\u6c52>[expected:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<Object>](\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u36d3\u67e9\u3504\u7bad\u3504\u2dcc))
            
            while (invokeinterface:boolean(Iterator::hasNext, var_6_C1:Iterator)) {
                var_7_E9 = checkcast:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\ud36e\u6bb9\u960f\u4c04\u64ab.\u9af2\u1833\u156b\u12cb\u7d52\u6c52.class, invokeinterface:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(Iterator<\u9af2\u1833\u156b\u12cb\u7d52\u6c52>::next, var_6_C1:Iterator<\u9af2\u1833\u156b\u12cb\u7d52\u6c52>))
                
                if (invokeinterface:boolean(Set<E>::contains, getstatic:Set<\u9af2\u1833\u156b\u12cb\u7d52\u6c52>(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\u7d52\u4f52\u7043\uc246\u960f\u7e3f), var_7_E9:\u9af2\u1833\u156b\u12cb\u7d52\u6c52[expected:Object])) {
                    loopcontinue()
                }
                
                invokevirtual:void(\u51fa\u965f\u12b2\u4d85\u5654\uc7fe::\u67e9\u446c\ud217\ucb79\u6d99\uc229, getfield:\u51fa\u965f\u12b2\u4d85\u5654\uc7fe(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\ub102\ub171\ub113\u946b\ub7dc\u8258, this:\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a), var_7_E9:\u9af2\u1833\u156b\u12cb\u7d52\u6c52, initobject:\u71ae\u64ab\u718f\u9a18\uc31c\u7d52(\u71ae\u64ab\u718f\u9a18\uc31c\u7d52::<init>, invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\u9af2\u1833\u156b\u12cb\u7d52\u6c52>::\u8df4\ua068\u9af2\u8350\uc29a\u392e, getstatic:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\u9af2\u1833\u156b\u12cb\u7d52\u6c52>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u36d3\u67e9\u3504\u7bad\u3504\u2dcc), var_7_E9:\u9af2\u1833\u156b\u12cb\u7d52\u6c52), loadelement:String(getstatic:String[](\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\ucb79\u6d69\u64f2\u93a2\ub171\u56bd), and:int(ldc:int(23616), ldc:int(-23617)))))
            }
            
            putfield:\uc910\u3c25\u93a2\u873d\u983f\ud7e8(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\u36d3\u9033\u0b8e\u7af6\u760c\u97e6, this:\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a, p2:\uc910\u3c25\u93a2\u873d\u983f\ud7e8)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u4f52\u6cfe\u9a18\uc29a\u3bd6.\u51fa\u965f\u12b2\u4d85\u5654\uc7fe \u6ec6\u9937\ub7dc\ufcaf\uf94d\u8d98() {
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
            return:\u51fa\u965f\u12b2\u4d85\u5654\uc7fe(getfield:\u51fa\u965f\u12b2\u4d85\u5654\uc7fe(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\ub102\ub171\ub113\u946b\ub7dc\u8258, this:\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a))
        }
        
        goto(Label_0006)
    }
    
    public void \u385b\u67e9\u16f6\ubded\u4bc8\u99f7(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ua562\ud4fe\u647c\uc84e\u5245\u5f50 p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p1, int p2, int p3, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p4, \u59ec\u8413\u97e6\uc229\u3776.\u6b0d\uf9c5\ucfaf\ud36e\ub102 p5) {
        var_7_61 : int
        var_9_69 : boolean
        stack_A0_0 : int [generated]
        var_10_A0 : int
        var_11_B5 : Random
        var_14_BF : \u760c\u4975\u4179\uc246\u8640\u64f2[]
        var_15_C4 : int
        var_16_CD : int
        var_17_12F : \u760c\u4975\u4179\uc246\u8640\u64f2
        
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
            var_7_61 = and:int(ldc:int(631960196), ldc:int(-952993818))
            var_9_69 = invokevirtual:boolean(\ud171\u156b\u0800\u36d3\ub8be\u760c::\u69d9\ud523\uc9f6\u8350\u7bad\ud171, invokestatic:\ud171\u156b\u0800\u36d3\ub8be\u760c(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u71f1\u98a4\ufcaf\u8d90\u1833\u2dcc))
            
            if (logicaland:boolean(invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u4daf\u8640\u97e6\u7c6b\uc246\ud171), var_9_69:boolean)) {
                stack_A0_0 = xor:int(ldc:int(-16304), ldc:int(-16303))
            }
            else {
                var_7_61 = and:int(var_7_61:int, ldc:int(-402758996))
                stack_A0_0 = and:int(ldc:int(-25813), ldc:int(9428))
            }
            
            var_10_A0 = stack_A0_0:int
            
            if (cmpne:boolean(var_10_A0:int, ldc:int(0))) {
                invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u4bc8\u76bc\u7006\u759a\u8df4\u3e75, p5:\u6b0d\uf9c5\ucfaf\ud36e\ub102, getstatic:\uf995\u4975\u1187\ubff1\u839e\u8389(\u51fa\u7873\u9255\ua61f\u2dcc\u4bc8::\u61a4\u47c2\u36d3\u6bb9\u5db4\u99f7))
            }
            
            var_11_B5 = initobject:Random(Random::<init>)
            var_14_BF = getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2[](\u760c\u4975\u4179\uc246\u8640\u64f2::\u3711\u0800\u59ec\ucfaf\uc31c\u97b7)
            var_15_C4 = arraylength:int(var_14_BF:\u760c\u4975\u4179\uc246\u8640\u64f2[])
            var_16_CD = and:int(ldc:int(13477), ldc:int(-13752))
            
            while (cmplt:boolean(var_16_CD:int, var_15_C4:int)) {
                var_17_12F = loadelement:\u760c\u4975\u4179\uc246\u8640\u64f2(var_14_BF:\u760c\u4975\u4179\uc246\u8640\u64f2[], var_16_CD:int)
                invokevirtual:void(Random::setSeed, var_11_B5:Random, ldc:long(42L))
                invokespecial:void(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\u6c56\ud4fe\uc246\ub83f\u4975\u873d, this:\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a, p4:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p5:\u6b0d\uf9c5\ucfaf\ud36e\ub102, invokeinterface:List<\u71ae\u6c56\uc29a\ubefe\u760c\u71ae>(\ua562\ud4fe\u647c\uc84e\u5245\u5f50::\u527a\u965f\u69d9\ufe34\u7bad\u71f1, p0:\ua562\ud4fe\u647c\uc84e\u5245\u5f50, checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, aconstnull:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d()), var_17_12F:\u760c\u4975\u4179\uc246\u8640\u64f2, var_11_B5:Random), p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, p2:int, p3:int)
                inc:int(var_16_CD, ldc:int(1))
            }
            
            invokevirtual:void(Random::setSeed, var_11_B5:Random, ldc:long(42L))
            invokespecial:void(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\u6c56\ud4fe\uc246\ub83f\u4975\u873d, this:\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a, p4:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p5:\u6b0d\uf9c5\ucfaf\ud36e\ub102, invokeinterface:List<\u71ae\u6c56\uc29a\ubefe\u760c\u71ae>(\ua562\ud4fe\u647c\uc84e\u5245\u5f50::\u527a\u965f\u69d9\ufe34\u7bad\u71f1, p0:\ua562\ud4fe\u647c\uc84e\u5245\u5f50, checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, aconstnull:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d()), checkcast:\u760c\u4975\u4179\uc246\u8640\u64f2(\u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2.class, aconstnull:\u760c\u4975\u4179\uc246\u8640\u64f2()), var_11_B5:Random), p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, p2:int, p3:int)
            
            if (cmpne:boolean(var_10_A0:int, ldc:int(0))) {
                invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u4bc8\u76bc\u7006\u759a\u8df4\u3e75, p5:\u6b0d\uf9c5\ucfaf\ud36e\ub102, checkcast:\uf995\u4975\u1187\ubff1\u839e\u8389(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\uf995\u4975\u1187\ubff1\u839e\u8389.class, aconstnull:\uf995\u4975\u1187\ubff1\u839e\u8389()))
                invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u6d99\u4f52\u446c\u5654\u3776\u3e2a)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ud523\u8389\u6ec6\u76bc\u392e\ub32d(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p0, \u5245\u8aa5\u61a4\u7049\u4cd9.\ub113\u8bb0\u6ec6\u4f52\u6198\ucb79 p1, boolean p2, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p3, \u927d\u92ff\u71ae\uafe7\u6bb9.\u12cb\u12b2\ua3b4\u183a\ud158\u51fa p4, int p5, int p6, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ua562\ud4fe\u647c\uc84e\u5245\u5f50 p7) {
        var_9_61 : int
        var_9_3B1 : int
        stack_123_0 : int [generated]
        var_11_123 : int
        stack_269_0 : \u71ae\u5fe1\u0b8e\u5140\uf995\u927d [generated]
        expr_239 : Object[] [generated]
        var_13_50C : \ub1b9\u8cae\u7d52\u759a\u3e2a\u527a
        stack_54A_0 : int [generated]
        var_9_5D4 : int
        var_12_4C7 : int
        stack_64E_0 : \u71ae\u5fe1\u0b8e\u5140\uf995\u927d [generated]
        expr_5F6 : Object[] [generated]
        var_13_599 : \uf995\u4975\u1187\ubff1\u839e\u8389
        var_15_671 : \u3711\u6c52\ufcaf\u4bc8\ud158
        var_14_5E8 : \u6b0d\uf9c5\ucfaf\ud36e\ub102
        
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
            var_9_61 = and:int(ldc:int(-557897349), ldc:int(-940317338))
            
            if (logicalnot:boolean(invokevirtual:boolean(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u69d9\ub8be\u3a62\ud171\u64f2\ua562, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))) {
                invokevirtual:void(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, p3:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
                
                if (cmpeq:boolean(p1:\ub113\u8bb0\u6ec6\u4f52\u6198\ucb79, getstatic:\ub113\u8bb0\u6ec6\u4f52\u6198\ucb79(\ub113\u8bb0\u6ec6\u4f52\u6198\ucb79::\ub32d\u74b1\ub32d\u647c\u8df4\u4c04))) {
                    goto(Label_0166)
                }
                
                if (cmpeq:boolean(p1:\ub113\u8bb0\u6ec6\u4f52\u6198\ucb79, getstatic:\ub113\u8bb0\u6ec6\u4f52\u6198\ucb79(\ub113\u8bb0\u6ec6\u4f52\u6198\ucb79::\u8df4\u72f1\u7873\u5bc4\uf94d\u5140))) {
                    goto(Label_0166)
                }
                
                if (cmpne:boolean(p1:\ub113\u8bb0\u6ec6\u4f52\u6198\ucb79, getstatic:\ub113\u8bb0\u6ec6\u4f52\u6198\ucb79(\ub113\u8bb0\u6ec6\u4f52\u6198\ucb79::\ud12e\ufe34\u392e\u4179\u983f\ud12e))) {
                    goto(Label_0234)
                }
                
                goto(Label_0166)
            }
            
            Label_0106:
            
            if (cmpeq:boolean(and:int(var_9_61:int, ldc:int(32)), ldc:int(0))) {
                var_9_61 = and:int(var_9_61:int, ldc:int(-622821363))
                goto(Label_0234)
            }
            
            if (cmpeq:boolean(and:int(var_9_61:int, ldc:int(4)), ldc:int(0))) {
                return:void()
            }
            
            var_9_61 = and:int(var_9_61:int, ldc:int(526223740))
            Label_0166:
            
            if (cmpne:boolean(and:int(var_9_61:int, ldc:int(4096)), ldc:int(0))) {
                var_9_61 = and:int(var_9_61:int, ldc:int(2120065528))
            }
            else {
                if (cmpne:boolean(and:int(var_9_61:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_9_3B1 = and:int(var_9_61:int, ldc:int(-209545354))
                    stack_123_0 = and:int(ldc:int(5433), ldc:int(515))
                    goto(Label_0291)
                }
                
                goto(Label_0106)
            }
            
            Label_0234:
            
            if (cmpne:boolean(and:int(var_9_61:int, ldc:int(4194304)), ldc:int(0))) {
                var_9_61 = and:int(var_9_61:int, ldc:int(-838949636))
                goto(Label_0166)
            }
            
            if (cmpeq:boolean(and:int(var_9_61:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0106)
            }
            
            var_9_3B1 = and:int(var_9_61:int, ldc:int(-1037943450))
            stack_123_0 = and:int(ldc:int(-9102), ldc:int(9101))
            Label_0291:
            var_11_123 = stack_123_0:int
            
            if (cmpeq:boolean(invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), getstatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u4492\ua562\ud158\u4492\u6bb9\ub70c::\ud523\ud217\u760c\u62da\u40a9\ub32d))) {
                if (cmpne:boolean(var_11_123:int, ldc:int(0))) {
                    p7 = invokevirtual:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u7af6\u67d0\u8753\u71f1\u6198\u494c::\u446c\ubb2b\ufcaf\u183a\u88c5\u5140, invokevirtual:\u7af6\u67d0\u8753\u71f1\u6198\u494c(\u51fa\u965f\u12b2\u4d85\u5654\uc7fe::\u120d\u3bc9\u946b\uceb8\u62da\u0a06, getfield:\u51fa\u965f\u12b2\u4d85\u5654\uc7fe(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\ub102\ub171\ub113\u946b\ub7dc\u8258, this:\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a)), initobject:\u71ae\u64ab\u718f\u9a18\uc31c\u7d52(\u71ae\u64ab\u718f\u9a18\uc31c\u7d52::<init>, loadelement:String(getstatic:String[](\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\ucb79\u6d69\u64f2\u93a2\ub171\u56bd), and:int(ldc:int(16961), ldc:int(1419)))))
                }
            }
            
            loop {
                if (cmpne:boolean(and:int(var_9_3B1:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_1112)
                }
                
                if (cmpne:boolean(and:int(var_9_3B1:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_0980)
                }
                
                if (cmpeq:boolean(and:int(var_9_3B1:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0844)
                }
                
                if (cmpne:boolean(and:int(var_9_3B1:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_0743)
                }
                
                if (cmpne:boolean(and:int(var_9_3B1:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_0625)
                }
                
                if (cmpeq:boolean(and:int(var_9_3B1:int, ldc:int(33554432)), ldc:int(0))) {
                    var_9_3B1 = and:int(var_9_3B1:int, ldc:int(1922859396))
                }
                else {
                    var_9_3B1 = and:int(var_9_3B1:int, ldc:int(-693965198))
                    
                    if (invokevirtual:boolean(\u71ae\u5fe1\u0b8e\u5140\uf995\u927d::\uc87f\u7af6\u7043\ub19c\uc84e\u4c04, getstatic:\u71ae\u5fe1\u0b8e\u5140\uf995\u927d(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u7049\u8aa5\u6fb0\u6cfe\ucb79\ua068))) {
                        stack_269_0 = getstatic:\u71ae\u5fe1\u0b8e\u5140\uf995\u927d(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u7049\u8aa5\u6fb0\u6cfe\ucb79\ua068)
                        expr_239 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(18497), ldc:int(18501)))
                        storeelement:Object(expr_239:Object[], and:int(ldc:int(6530), ldc:int(-6531)), p3:\uafe7\uc7fe\u4c04\u6b5f\u5bc4[expected:Object])
                        storeelement:Object(expr_239:Object[], and:int(ldc:int(1675), ldc:int(18485)), p7:\ua562\ud4fe\u647c\uc84e\u5245\u5f50[expected:Object])
                        storeelement:Object(expr_239:Object[], and:int(ldc:int(514), ldc:int(16434)), p1:\ub113\u8bb0\u6ec6\u4f52\u6198\ucb79[expected:Object])
                        storeelement:Object(expr_239:Object[], xor:int(ldc:int(16913), ldc:int(16914)), invokestatic:Boolean[expected:Object](Boolean::valueOf, p2:boolean))
                        p7 = checkcast:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ua562\ud4fe\u647c\uc84e\u5245\u5f50.class, invokevirtual:Object(\u71ae\u5fe1\u0b8e\u5140\uf995\u927d::\u4e72\u4cd9\u5654\u385b\u8389\u76bc, stack_269_0:\u71ae\u5fe1\u0b8e\u5140\uf995\u927d, expr_239:Object[]))
                        goto(Label_0625)
                    }
                }
                
                Label_0382:
                
                if (cmpeq:boolean(and:int(var_9_3B1:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_1112)
                }
                
                if (cmpne:boolean(and:int(var_9_3B1:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_0980)
                }
                
                if (cmpeq:boolean(and:int(var_9_3B1:int, ldc:int(131072)), ldc:int(0))) {
                    var_9_3B1 = and:int(var_9_3B1:int, ldc:int(-932331796))
                    goto(Label_0844)
                }
                
                if (cmpeq:boolean(and:int(var_9_3B1:int, ldc:int(32)), ldc:int(0))) {
                    var_9_3B1 = and:int(var_9_3B1:int, ldc:int(1058313571))
                    goto(Label_0743)
                }
                
                if (cmpne:boolean(and:int(var_9_3B1:int, ldc:int(4096)), ldc:int(0))) {
                    var_9_3B1 = and:int(var_9_3B1:int, ldc:int(1114320334))
                }
                else {
                    if (cmpeq:boolean(and:int(var_9_3B1:int, ldc:int(64)), ldc:int(0))) {
                        var_9_3B1 = and:int(var_9_3B1:int, ldc:int(-817916205))
                        loopcontinue()
                    }
                    
                    var_9_3B1 = and:int(var_9_3B1:int, ldc:int(-949487233))
                    invokevirtual:void(\u3711\uf995\u7d52\u7043\u72f1\u12b2::\u071d\u3bd6\uc238\ud51e\u6b0d\u6fb0, invokevirtual:\u3711\uf995\u7d52\u7043\u72f1\u12b2(\u600f\u4c2b\uc238\ud158\u7e3f\u3c25::\u8413\u7d52\u6fb0\ubff1\u40a9\u0800, invokeinterface:\u600f\u4c2b\uc238\ud158\u7e3f\u3c25(\ua562\ud4fe\u647c\uc84e\u5245\u5f50::\u873d\ub18d\u5f50\u0b8e\u983f\u61a4, p7:\ua562\ud4fe\u647c\uc84e\u5245\u5f50), p1:\ub113\u8bb0\u6ec6\u4f52\u6198\ucb79), p2:boolean, p3:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
                }
                
                Label_0625:
                
                if (cmpeq:boolean(and:int(var_9_3B1:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_1112)
                }
                
                if (cmpeq:boolean(and:int(var_9_3B1:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_9_3B1 = and:int(var_9_3B1:int, ldc:int(-423907338))
                    goto(Label_0980)
                }
                
                if (cmpeq:boolean(and:int(var_9_3B1:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_0844)
                }
                
                if (cmpne:boolean(and:int(var_9_3B1:int, ldc:int(32)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_9_3B1:int, ldc:int(131072)), ldc:int(0))) {
                        var_9_3B1 = and:int(var_9_3B1:int, ldc:int(-331128994))
                        goto(Label_0382)
                    }
                    
                    if (cmpeq:boolean(and:int(var_9_3B1:int, ldc:int(131072)), ldc:int(0))) {
                        var_9_3B1 = and:int(var_9_3B1:int, ldc:int(604126948))
                        loopcontinue()
                    }
                    
                    var_9_3B1 = and:int(var_9_3B1:int, ldc:int(-806623517))
                    invokevirtual:void(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e, p3:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, ldc:double(-0.5), ldc:double(-0.5), ldc:double(-0.5))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(\ua562\ud4fe\u647c\uc84e\u5245\u5f50::\ud523\u4bc8\u8753\u2dcc\u8258\u120d, p7:\ua562\ud4fe\u647c\uc84e\u5245\u5f50))) {
                        if (cmpne:boolean(invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), getstatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u4492\ua562\ud158\u4492\u6bb9\ub70c::\ud523\ud217\u760c\u62da\u40a9\ub32d))) {
                            goto(Label_0980)
                        }
                        
                        if (cmpne:boolean(var_11_123:int, ldc:int(0))) {
                            goto(Label_0980)
                        }
                    }
                }
                
                Label_0743:
                
                if (cmpne:boolean(and:int(var_9_3B1:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_1112)
                }
                
                if (cmpne:boolean(and:int(var_9_3B1:int, ldc:int(4)), ldc:int(0))) {
                    var_9_3B1 = and:int(var_9_3B1:int, ldc:int(1639378295))
                    goto(Label_0980)
                }
                
                if (cmpne:boolean(and:int(var_9_3B1:int, ldc:int(2147483647)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_9_3B1:int, ldc:int(128)), ldc:int(0))) {
                        var_9_3B1 = and:int(var_9_3B1:int, ldc:int(1841967341))
                        goto(Label_0625)
                    }
                    
                    if (cmpne:boolean(and:int(var_9_3B1:int, ldc:int(1024)), ldc:int(0))) {
                        var_9_3B1 = and:int(var_9_3B1:int, ldc:int(1709192458))
                        goto(Label_0382)
                    }
                    
                    if (cmpne:boolean(and:int(var_9_3B1:int, ldc:int(4194304)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_9_3B1 = and:int(var_9_3B1:int, ldc:int(-97805721))
                    
                    if (invokevirtual:boolean(\u71ae\u5fe1\u0b8e\u5140\uf995\u927d::\uc87f\u7af6\u7043\ub19c\uc84e\u4c04, getstatic:\u71ae\u5fe1\u0b8e\u5140\uf995\u927d(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u120d\u6198\u4f52\u4cd9\ua6bd\u3504))) {
                        invokevirtual:void(\u51b2\uc229\u51fa\u8753\u72f1\u51b2::\ub83f\ud523\u5d20\u0a06\u8bb0\u8413, checkcast:\u51b2\uc229\u51fa\u8753\u72f1\u51b2(\u5245\u8aa5\u61a4\u7049\u4cd9.\u51b2\uc229\u51fa\u8753\u72f1\u51b2.class, invokestatic:Object[expected:\u51b2\uc229\u51fa\u8753\u72f1\u51b2](\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u7af6\u97e6\u51fa\u8df4\ub6ab\ud523, invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52[expected:Object](\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), getstatic:\u71ae\u5fe1\u0b8e\u5140\uf995\u927d(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u120d\u6198\u4f52\u4cd9\ua6bd\u3504), newarray:Object[](java.lang.Object.class, and:int(ldc:int(18585), ldc:int(-19166))))), p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, p1:\ub113\u8bb0\u6ec6\u4f52\u6198\ucb79, p3:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p4:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa, p5:int, p6:int)
                        goto(Label_2286)
                    }
                }
                
                Label_0844:
                
                if (cmpne:boolean(and:int(var_9_3B1:int, ldc:int(4194304)), ldc:int(0))) {
                    var_9_3B1 = and:int(var_9_3B1:int, ldc:int(-1215537959))
                    goto(Label_1112)
                }
                
                if (cmpne:boolean(and:int(var_9_3B1:int, ldc:int(16777216)), ldc:int(0))) {
                    var_9_3B1 = and:int(var_9_3B1:int, ldc:int(-672662085))
                }
                else {
                    if (cmpne:boolean(and:int(var_9_3B1:int, ldc:int(4096)), ldc:int(0))) {
                        var_9_3B1 = and:int(var_9_3B1:int, ldc:int(302836933))
                        goto(Label_0743)
                    }
                    
                    if (cmpeq:boolean(and:int(var_9_3B1:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0625)
                    }
                    
                    if (cmpeq:boolean(and:int(var_9_3B1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_9_3B1 = and:int(var_9_3B1:int, ldc:int(788153174))
                        goto(Label_0382)
                    }
                    
                    if (cmpne:boolean(and:int(var_9_3B1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_9_3B1 = and:int(var_9_3B1:int, ldc:int(-948238610))
                        invokevirtual:void(\u51b2\uc229\u51fa\u8753\u72f1\u51b2::\ub83f\ud523\u5d20\u0a06\u8bb0\u8413, getstatic:\u51b2\uc229\u51fa\u8753\u72f1\u51b2(\u51b2\uc229\u51fa\u8753\u72f1\u51b2::\u946b\uc4d2\u527a\u8413\u1187\u8389), p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, p1:\ub113\u8bb0\u6ec6\u4f52\u6198\ucb79, p3:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p4:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa, p5:int, p6:int)
                        goto(Label_2286)
                    }
                    
                    loopcontinue()
                }
                
                Label_0980:
                
                if (cmpne:boolean(and:int(var_9_3B1:int, ldc:int(4096)), ldc:int(0))) {
                    var_9_3B1 = and:int(var_9_3B1:int, ldc:int(1363305123))
                }
                else {
                    if (cmpne:boolean(and:int(var_9_3B1:int, ldc:int(4)), ldc:int(0))) {
                        var_9_3B1 = and:int(var_9_3B1:int, ldc:int(2072112183))
                        goto(Label_0844)
                    }
                    
                    if (cmpeq:boolean(and:int(var_9_3B1:int, ldc:int(131072)), ldc:int(0))) {
                        var_9_3B1 = and:int(var_9_3B1:int, ldc:int(-195409203))
                        goto(Label_0743)
                    }
                    
                    if (cmpeq:boolean(and:int(var_9_3B1:int, ldc:int(64)), ldc:int(0))) {
                        var_9_3B1 = and:int(var_9_3B1:int, ldc:int(-621339974))
                        goto(Label_0625)
                    }
                    
                    if (cmpeq:boolean(and:int(var_9_3B1:int, ldc:int(2)), ldc:int(0))) {
                        var_9_3B1 = and:int(var_9_3B1:int, ldc:int(-560360204))
                        goto(Label_0382)
                    }
                    
                    if (cmpne:boolean(and:int(var_9_3B1:int, ldc:int(4096)), ldc:int(0))) {
                        var_9_3B1 = and:int(var_9_3B1:int, ldc:int(-400581247))
                        loopcontinue()
                    }
                    
                    var_9_3B1 = and:int(var_9_3B1:int, ldc:int(-11623310))
                    
                    if (cmpne:boolean(p1:\ub113\u8bb0\u6ec6\u4f52\u6198\ucb79, getstatic:\ub113\u8bb0\u6ec6\u4f52\u6198\ucb79(\ub113\u8bb0\u6ec6\u4f52\u6198\ucb79::\ub32d\u74b1\ub32d\u647c\u8df4\u4c04))) {
                        if (logicalnot:boolean(invokevirtual:boolean(\ub113\u8bb0\u6ec6\u4f52\u6198\ucb79::\u8258\u839e\ua6bd\u624e\u6c56\u1833, p1:\ub113\u8bb0\u6ec6\u4f52\u6198\ucb79))) {
                            if (instanceof:boolean(\u494c\u4975\ua068\u0c95\uc84e.\u0b8e\u7af6\u74b1\u12b2\u0800\u12b2.class, invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))) {
                                var_13_50C = invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u0b8e\u7af6\u74b1\u12b2\u0800\u12b2::\u69d9\u8640\uc229\ud51e\u156b\u8389, checkcast:\u0b8e\u7af6\u74b1\u12b2\u0800\u12b2(\u494c\u4975\ua068\u0c95\uc84e.\u0b8e\u7af6\u74b1\u12b2\u0800\u12b2.class, invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52[expected:\u0b8e\u7af6\u74b1\u12b2\u0800\u12b2](\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)))
                                
                                if (logicalnot:boolean(logicalor:boolean(instanceof:boolean(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u1187\u416d\u494c\u0b8e\u52d3\uc87f.class, var_13_50C:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a), instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u5fe1\u873d\u946b\u8753\u99f7\uc238.class, var_13_50C:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a)))) {
                                    stack_54A_0 = xor:int(ldc:int(-28152), ldc:int(-28151))
                                }
                                else {
                                    var_9_3B1 = and:int(var_9_3B1:int, ldc:int(-825553173))
                                    stack_54A_0 = and:int(ldc:int(-1542), ldc:int(1541))
                                }
                                
                                var_9_5D4 = and:int(var_9_3B1:int, ldc:int(-770983825))
                                var_12_4C7 = stack_54A_0:int
                                looporswitchbreak()
                            }
                        }
                    }
                }
                
                Label_1112:
                
                if (cmpne:boolean(and:int(var_9_3B1:int, ldc:int(128)), ldc:int(0))) {
                    var_9_3B1 = and:int(var_9_3B1:int, ldc:int(1088028199))
                    goto(Label_0980)
                }
                
                if (cmpne:boolean(and:int(var_9_3B1:int, ldc:int(4096)), ldc:int(0))) {
                    var_9_3B1 = and:int(var_9_3B1:int, ldc:int(1019516633))
                    goto(Label_0844)
                }
                
                if (cmpeq:boolean(and:int(var_9_3B1:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_9_3B1 = and:int(var_9_3B1:int, ldc:int(-60469262))
                    goto(Label_0743)
                }
                
                if (cmpne:boolean(and:int(var_9_3B1:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_0625)
                }
                
                if (cmpne:boolean(and:int(var_9_3B1:int, ldc:int(1024)), ldc:int(0))) {
                    var_9_3B1 = and:int(var_9_3B1:int, ldc:int(-1549663617))
                    goto(Label_0382)
                }
                
                if (cmpne:boolean(and:int(var_9_3B1:int, ldc:int(2)), ldc:int(0))) {
                    var_9_5D4 = and:int(var_9_3B1:int, ldc:int(-882735893))
                    var_12_4C7 = and:int(ldc:int(513), ldc:int(385))
                    looporswitchbreak()
                }
            }
            
            loop {
                if (cmpne:boolean(and:int(var_9_5D4:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_2041)
                }
                
                if (cmpne:boolean(and:int(var_9_5D4:int, ldc:int(4096)), ldc:int(0))) {
                    var_9_5D4 = and:int(var_9_5D4:int, ldc:int(-822881398))
                }
                else {
                    var_9_5D4 = and:int(var_9_5D4:int, ldc:int(-818791577))
                    
                    if (invokeinterface:boolean(\u647c\u183a\u8bb0\u5db4\u2dcc\u3a62::\ubefe\u7043\uf995\u7873\u7330\u9033, p7:\ua562\ud4fe\u647c\uc84e\u5245\u5f50[expected:\u647c\u183a\u8bb0\u5db4\u2dcc\u3a62])) {
                        stack_64E_0 = getstatic:\u71ae\u5fe1\u0b8e\u5140\uf995\u927d(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u4daf\u8389\u12b2\ucfaf\ua3b4\uf94d)
                        expr_5F6 = newarray:Object[](java.lang.Object.class, ldc:int(8))
                        storeelement:Object(expr_5F6:Object[], and:int(ldc:int(-29577), ldc:int(21384)), this:\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a[expected:Object])
                        storeelement:Object(expr_5F6:Object[], and:int(ldc:int(2649), ldc:int(1031)), p7:\ua562\ud4fe\u647c\uc84e\u5245\u5f50[expected:Object])
                        storeelement:Object(expr_5F6:Object[], xor:int(ldc:int(776), ldc:int(778)), p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56[expected:Object])
                        storeelement:Object(expr_5F6:Object[], and:int(ldc:int(15), ldc:int(7443)), p3:\uafe7\uc7fe\u4c04\u6b5f\u5bc4[expected:Object])
                        storeelement:Object(expr_5F6:Object[], xor:int(ldc:int(4133), ldc:int(4129)), p4:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa[expected:Object])
                        storeelement:Object(expr_5F6:Object[], xor:int(ldc:int(34), ldc:int(39)), invokestatic:Integer[expected:Object](Integer::valueOf, p5:int))
                        storeelement:Object(expr_5F6:Object[], ldc:int(6), invokestatic:Integer[expected:Object](Integer::valueOf, p6:int))
                        storeelement:Object(expr_5F6:Object[], ldc:int(7), invokestatic:Boolean[expected:Object](Boolean::valueOf, var_12_4C7:boolean))
                        invokevirtual:Object(\u71ae\u5fe1\u0b8e\u5140\uf995\u927d::\u4e72\u4cd9\u5654\u385b\u8389\u76bc, stack_64E_0:\u71ae\u5fe1\u0b8e\u5140\uf995\u927d, expr_5F6:Object[])
                        goto(Label_2041)
                    }
                }
                
                Label_1402:
                
                if (cmpne:boolean(and:int(var_9_5D4:int, ldc:int(2147483647)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_9_5D4:int, ldc:int(4194304)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_9_5D4 = and:int(var_9_5D4:int, ldc:int(-1026904193))
                    var_13_599 = invokestatic:\uf995\u4975\u1187\ubff1\u839e\u8389(\u3bc9\ucfaf\u718f\u0800\u960f\u3a62::\u983f\u12b2\u3e75\u5bc4\u392e\u3bd6, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, var_12_4C7:boolean)
                    
                    if (cmpeq:boolean(invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), getstatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u4492\ua562\ud158\u4492\u6bb9\ub70c::\u3e75\ubb2b\u7bad\u4daf\u6cfe\u8640))) {
                        if (invokevirtual:boolean(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\ua562\u7330\u7bad\ub102\uc87f\u3bc9, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)) {
                            invokevirtual:void(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, p3:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
                            var_15_671 = invokevirtual:\u3711\u6c52\ufcaf\u4bc8\ud158(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u9033\u12b2\u516c\u97e6\u6d99\ua3b4, p3:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
                            
                            if (cmpeq:boolean(p1:\ub113\u8bb0\u6ec6\u4f52\u6198\ucb79, getstatic:\ub113\u8bb0\u6ec6\u4f52\u6198\ucb79(\ub113\u8bb0\u6ec6\u4f52\u6198\ucb79::\ub32d\u74b1\ub32d\u647c\u8df4\u4c04))) {
                                invokevirtual:void(\uc87f\u5f50\u16f6\ub113\u52d3\u12b2::\u99f7\u3776\uc238\u6435\u5db4\u392e, invokevirtual:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2(\u3711\u6c52\ufcaf\u4bc8\ud158::\u6d99\uae87\u8aa5\u6c52\u4c2b\u88c5, var_15_671:\u3711\u6c52\ufcaf\u4bc8\ud158), ldc:float(0.5f))
                                goto(Label_1713)
                            }
                            
                            Label_1658:
                            
                            if (cmpeq:boolean(and:int(var_9_5D4:int, ldc:int(33554432)), ldc:int(0))) {
                                var_9_5D4 = and:int(var_9_5D4:int, ldc:int(228985192))
                                goto(Label_1744)
                            }
                            
                            if (cmpeq:boolean(and:int(var_9_5D4:int, ldc:int(33554432)), ldc:int(0))) {
                                var_9_5D4 = and:int(var_9_5D4:int, ldc:int(-1587144067))
                            }
                            else {
                                var_9_5D4 = and:int(var_9_5D4:int, ldc:int(-428190865))
                                
                                if (invokevirtual:boolean(\ub113\u8bb0\u6ec6\u4f52\u6198\ucb79::\u8258\u839e\ua6bd\u624e\u6c56\u1833, p1:\ub113\u8bb0\u6ec6\u4f52\u6198\ucb79)) {
                                    invokevirtual:void(\uc87f\u5f50\u16f6\ub113\u52d3\u12b2::\u99f7\u3776\uc238\u6435\u5db4\u392e, invokevirtual:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2(\u3711\u6c52\ufcaf\u4bc8\ud158::\u6d99\uae87\u8aa5\u6c52\u4c2b\u88c5, var_15_671:\u3711\u6c52\ufcaf\u4bc8\ud158), ldc:float(0.75f))
                                }
                            }
                            
                            Label_1713:
                            
                            if (cmpeq:boolean(and:int(var_9_5D4:int, ldc:int(1024)), ldc:int(0))) {
                                if (cmpeq:boolean(and:int(var_9_5D4:int, ldc:int(131072)), ldc:int(0))) {
                                    goto(Label_1658)
                                }
                                
                                var_9_5D4 = and:int(var_9_5D4:int, ldc:int(-78772378))
                                
                                if (var_12_4C7:boolean) {
                                    var_14_5E8 = invokestatic:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\u4f52\u64ab\ubefe\u64f2\u9033\u67e9, p4:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa, var_13_599:\uf995\u4975\u1187\ubff1\u839e\u8389, var_15_671:\u3711\u6c52\ufcaf\u4bc8\ud158)
                                    goto(Label_1845)
                                }
                            }
                            
                            Label_1744:
                            
                            if (cmpne:boolean(and:int(var_9_5D4:int, ldc:int(4096)), ldc:int(0))) {
                                var_9_5D4 = and:int(var_9_5D4:int, ldc:int(-1725380735))
                                goto(Label_1713)
                            }
                            
                            if (cmpeq:boolean(and:int(var_9_5D4:int, ldc:int(2)), ldc:int(0))) {
                                goto(Label_1658)
                            }
                            
                            var_9_5D4 = and:int(var_9_5D4:int, ldc:int(-72992141))
                            var_14_5E8 = invokestatic:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\u7006\u4cd9\u9033\u5d20\ub70c\u965f, p4:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa, var_13_599:\uf995\u4975\u1187\ubff1\u839e\u8389, var_15_671:\u3711\u6c52\ufcaf\u4bc8\ud158)
                            Label_1845:
                            var_9_5D4 = and:int(var_9_5D4:int, ldc:int(-756554114))
                            invokevirtual:void(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u4ab3\u839e\ub1b9\u1833\u4cd9\u2dcc, p3:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
                            goto(Label_1885)
                        }
                    }
                    
                    do {
                        if (cmpeq:boolean(and:int(var_9_5D4:int, ldc:int(64)), ldc:int(0))) {
                            var_9_5D4 = and:int(var_9_5D4:int, ldc:int(-2065262640))
                        }
                        else {
                            var_9_5D4 = and:int(var_9_5D4:int, ldc:int(-68445462))
                            
                            if (logicalnot:boolean(var_12_4C7:boolean[expected:int])) {
                                loopcontinue()
                            }
                            
                            var_14_5E8 = invokestatic:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\ua61f\u446c\u8640\u4d85\u71ae\u156b, p4:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa, var_13_599:\uf995\u4975\u1187\ubff1\u839e\u8389, and:int[expected:boolean](ldc:int(211), ldc:int(10249)), invokevirtual:boolean(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\ua562\u7330\u7bad\ub102\uc87f\u3bc9, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))
                            goto(Label_1885)
                        }
                    } while (cmpne:boolean(and:int(var_9_5D4:int, ldc:int(4096)), ldc:int(0)))
                    
                    var_9_5D4 = and:int(var_9_5D4:int, ldc:int(-293893518))
                    var_14_5E8 = invokestatic:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\u5245\u76bc\u3776\u9033\u4975\ub171, p4:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa, var_13_599:\uf995\u4975\u1187\ubff1\u839e\u8389, xor:int[expected:boolean](ldc:int(2100), ldc:int(2101)), invokevirtual:boolean(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\ua562\u7330\u7bad\ub102\uc87f\u3bc9, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))
                    
                    loop {
                        Label_1885:
                        
                        if (cmpeq:boolean(and:int(var_9_5D4:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_2117)
                        }
                        
                        if (cmpne:boolean(and:int(var_9_5D4:int, ldc:int(1024)), ldc:int(0))) {
                            var_9_5D4 = and:int(var_9_5D4:int, ldc:int(548895688))
                            goto(Label_1976)
                        }
                        
                        if (cmpne:boolean(and:int(var_9_5D4:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_9_5D4 = and:int(var_9_5D4:int, ldc:int(-435810833))
                            
                            if (invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u36d3\u67d0\u8753\uf94d\ub19c\u9a18)) {
                                p7 = invokestatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\ub18d\u8413\u6c56\u8258\u51fa\u61a4::\u1833\u51fa\u839e\u8753\u7043\u5f50, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, p7:\ua562\ud4fe\u647c\uc84e\u5245\u5f50, getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uf9c5\u1833\u624e\u8d98\u9937\u3504::\ub70c\u40a9\u97e6\ub1b9\u4f4a\u446c), and:int[expected:boolean](ldc:int(-12884), ldc:int(4691)))
                                putstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uf9c5\u1833\u624e\u8d98\u9937\u3504::\ub70c\u40a9\u97e6\ub1b9\u4f4a\u446c, aconstnull:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753())
                            }
                        }
                        
                        Label_1936:
                        
                        if (cmpne:boolean(and:int(var_9_5D4:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_2117)
                        }
                        
                        if (cmpne:boolean(and:int(var_9_5D4:int, ldc:int(33554432)), ldc:int(0))) {
                            if (cmpeq:boolean(and:int(var_9_5D4:int, ldc:int(1073741824)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_9_5D4 = and:int(var_9_5D4:int, ldc:int(-361584513))
                            
                            if (invokestatic:boolean(\u67e9\u7873\u9937\u6d99\u5fe1\uc246::\u71f1\u8640\uc7fe\ucef1\u5db4\u6c56)) {
                                invokestatic:void(\u67e9\u7873\u9937\u6d99\u5fe1\uc246::\uc3e3\u6d99\ucfaf\u74b1\ub18d\u385b)
                            }
                        }
                        
                        Label_1976:
                        
                        if (cmpeq:boolean(and:int(var_9_5D4:int, ldc:int(4)), ldc:int(0))) {
                            if (cmpne:boolean(and:int(var_9_5D4:int, ldc:int(4)), ldc:int(0))) {
                                goto(Label_1936)
                            }
                            
                            if (cmpne:boolean(and:int(var_9_5D4:int, ldc:int(128)), ldc:int(0))) {
                                var_9_5D4 = and:int(var_9_5D4:int, ldc:int(-1668621622))
                                loopcontinue()
                            }
                            
                            var_9_5D4 = and:int(var_9_5D4:int, ldc:int(-363099030))
                            invokevirtual:void(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\u385b\u67e9\u16f6\ubded\u4bc8\u99f7, this:\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a, p7:\ua562\ud4fe\u647c\uc84e\u5245\u5f50, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, p5:int, p6:int, p3:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, var_14_5E8:\u6b0d\uf9c5\ucfaf\ud36e\ub102)
                            
                            if (logicalnot:boolean(invokestatic:boolean(\u67e9\u7873\u9937\u6d99\u5fe1\uc246::\u71f1\u8640\uc7fe\ucef1\u5db4\u6c56))) {
                                goto(Label_2041)
                            }
                            
                            if (invokestatic:boolean(\u67e9\u7873\u9937\u6d99\u5fe1\uc246::\u446c\u7043\u6435\ua3b4\uc238\u8413)) {
                                invokestatic:void(\u67e9\u7873\u9937\u6d99\u5fe1\uc246::\u4975\u5140\uae5d\u6c56\u527a\u2dcc)
                                var_14_5E8 = invokestatic:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\u5245\u76bc\u3776\u9033\u4975\ub171, p4:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa, var_13_599:\uf995\u4975\u1187\ubff1\u839e\u8389, xor:int[expected:boolean](ldc:int(-27644), ldc:int(-27643)), and:int[expected:boolean](ldc:int(-16919), ldc:int(16918)))
                                invokevirtual:void(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\u385b\u67e9\u16f6\ubded\u4bc8\u99f7, this:\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a, p7:\ua562\ud4fe\u647c\uc84e\u5245\u5f50, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, getstatic:int(\u98a4\u6198\u16f6\u6ec6\u6c52\u3bd6::\u47c2\uc246\ucb79\ub19c\u494c\u5140), p6:int, p3:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, var_14_5E8:\u6b0d\uf9c5\ucfaf\ud36e\ub102)
                                invokestatic:void(\u67e9\u7873\u9937\u6d99\u5fe1\uc246::\u64ab\ucfaf\uc29a\u718f\u9937\u8308)
                            }
                        }
                        
                        Label_2117:
                        
                        if (cmpeq:boolean(and:int(var_9_5D4:int, ldc:int(33554432)), ldc:int(0))) {
                            var_9_5D4 = and:int(var_9_5D4:int, ldc:int(410563214))
                            goto(Label_1976)
                        }
                        
                        if (cmpeq:boolean(and:int(var_9_5D4:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_9_5D4 = and:int(var_9_5D4:int, ldc:int(154259405))
                            goto(Label_1936)
                        }
                        
                        if (cmpne:boolean(and:int(var_9_5D4:int, ldc:int(32)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                        
                        var_9_5D4 = and:int(var_9_5D4:int, ldc:int(517520586))
                    }
                    
                    var_9_5D4 = and:int(var_9_5D4:int, ldc:int(-687153290))
                    invokestatic:void(\u67e9\u7873\u9937\u6d99\u5fe1\uc246::\u4cd9\u836c\ud171\ub102\u64ab\ub1b9)
                }
                
                Label_2041:
                
                if (cmpne:boolean(and:int(var_9_5D4:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_1402)
                }
                
                if (cmpne:boolean(and:int(var_9_5D4:int, ldc:int(1073741824)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_9_3B1 = and:int(var_9_5D4:int, ldc:int(-486042002))
            Label_2286:
            var_9_61 = and:int(var_9_3B1:int, ldc:int(-957651213))
            invokevirtual:void(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u4ab3\u839e\ub1b9\u1833\u4cd9\u2dcc, p3:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
            goto(Label_0106)
        }
        
        goto(Label_0006)
    }
    
    public static \u59ec\u8413\u97e6\uc229\u3776.\u6b0d\uf9c5\ucfaf\ud36e\ub102 \ub113\ub70c\ub18d\u8640\u6ec6\u98a4(\u927d\u92ff\u71ae\uafe7\u6bb9.\u12cb\u12b2\ua3b4\u183a\ud158\u51fa p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\uf995\u4975\u1187\ubff1\u839e\u8389 p1, boolean p2, boolean p3) {
        var_4_126 : int
        stack_13D_1 : \uf995\u4975\u1187\ubff1\u839e\u8389 [generated]
        stack_154_0 : \u6b0d\uf9c5\ucfaf\ud36e\ub102 [generated]
        
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
            var_4_126 = and:int(ldc:int(492330409), ldc:int(1003741102))
            
            if (getstatic:boolean(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u69d9\uc2bd\uc9f6\u0b8e\ubded\u7bad)) {
                var_3_104 = and:int[expected:boolean](ldc:int(4977), ldc:int(-4978))
            }
            
            loop {
                if (cmpne:boolean(and:int(var_4_126:int, ldc:int(2097152)), ldc:int(0))) {
                    var_4_126 = and:int(var_4_126:int, ldc:int(-1232436344))
                    goto(Label_0191)
                }
                
                if (cmpeq:boolean(and:int(var_4_126:int, ldc:int(65536)), ldc:int(0))) {
                    var_4_126 = and:int(var_4_126:int, ldc:int(2105212337))
                    
                    if (invokestatic:boolean(\u67e9\u7873\u9937\u6d99\u5fe1\uc246::\uff55\ud158\u3a62\uc31c\uc3e3\ub113)) {
                        var_3_104 = and:int[expected:boolean](ldc:int(15377), ldc:int(-16114))
                    }
                }
                
                Label_0150:
                
                if (cmpne:boolean(and:int(var_4_126:int, ldc:int(134217728)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_4_126:int, ldc:int(8192)), ldc:int(0))) {
                        var_4_126 = and:int(var_4_126:int, ldc:int(-1026800788))
                        loopcontinue()
                    }
                    
                    var_4_126 = and:int(var_4_126:int, ldc:int(1597243355))
                    
                    if (cmpne:boolean(var_3_104:boolean, ldc:boolean(0))) {
                        if (logicalnot:boolean(p2:boolean)) {
                            var_4_126 = and:int(var_4_126:int, ldc:int(1760755621))
                            stack_13D_1 = invokestatic:\uf995\u4975\u1187\ubff1\u839e\u8389(\uf995\u4975\u1187\ubff1\u839e\u8389::\u67e9\u4ab3\u9af2\ubf56\u3711\u8389)
                        }
                        else {
                            stack_13D_1 = invokestatic:\uf995\u4975\u1187\ubff1\u839e\u8389(\uf995\u4975\u1187\ubff1\u839e\u8389::\u624e\u74b1\u6ec6\u8cae\u7bad\u9033)
                        }
                        
                        stack_154_0 = invokestatic:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u3e2a\u3d64\u74b1\uc84e\u5140::\u7af6\u836c\u759a\ud51e\ub18d\u7043, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u12cb\u12b2\ua3b4\u183a\ud158\u51fa::\ub18d\u8d90\u8308\u9a18\u071d\u16f6, p0:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa, stack_13D_1:\uf995\u4975\u1187\ubff1\u839e\u8389), invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u12cb\u12b2\ua3b4\u183a\ud158\u51fa::\ub18d\u8d90\u8308\u9a18\u071d\u16f6, p0:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa, p1:\uf995\u4975\u1187\ubff1\u839e\u8389))
                        looporswitchbreak()
                    }
                }
                
                Label_0191:
                
                if (cmpeq:boolean(and:int(var_4_126:int, ldc:int(2048)), ldc:int(0))) {
                    var_4_126 = and:int(var_4_126:int, ldc:int(-1694396962))
                    goto(Label_0150)
                }
                
                if (cmpne:boolean(and:int(var_4_126:int, ldc:int(134217728)), ldc:int(0))) {
                    stack_154_0 = invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u12cb\u12b2\ua3b4\u183a\ud158\u51fa::\ub18d\u8d90\u8308\u9a18\u071d\u16f6, p0:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa, p1:\uf995\u4975\u1187\ubff1\u839e\u8389)
                    looporswitchbreak()
                }
                
                var_4_126 = and:int(var_4_126:int, ldc:int(-968570922))
            }
            
            return:\u6b0d\uf9c5\ucfaf\ud36e\ub102(stack_154_0:\u6b0d\uf9c5\ucfaf\ud36e\ub102)
        }
        
        goto(Label_0006)
    }
    
    public static \u59ec\u8413\u97e6\uc229\u3776.\u6b0d\uf9c5\ucfaf\ud36e\ub102 \u7006\u4cd9\u9033\u5d20\ub70c\u965f(\u927d\u92ff\u71ae\uafe7\u6bb9.\u12cb\u12b2\ua3b4\u183a\ud158\u51fa p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\uf995\u4975\u1187\ubff1\u839e\u8389 p1, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u3711\u6c52\ufcaf\u4bc8\ud158 p2) {
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
            return:\u6b0d\uf9c5\ucfaf\ud36e\ub102(invokestatic:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u3e2a\u3d64\u74b1\uc84e\u5140::\u7af6\u836c\u759a\ud51e\ub18d\u7043, initobject:\u4d85\u760c\u71ae\uae5d\u7bad[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102](\u4d85\u760c\u71ae\uae5d\u7bad::<init>, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u12cb\u12b2\ua3b4\u183a\ud158\u51fa::\ub18d\u8d90\u8308\u9a18\u071d\u16f6, p0:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa, invokestatic:\uf995\u4975\u1187\ubff1\u839e\u8389(\uf995\u4975\u1187\ubff1\u839e\u8389::\ub113\u8308\u527a\u97b7\u4daf\ub171)), invokevirtual:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2(\u3711\u6c52\ufcaf\u4bc8\ud158::\u6d99\uae87\u8aa5\u6c52\u4c2b\u88c5, p2:\u3711\u6c52\ufcaf\u4bc8\ud158), invokevirtual:\u67e9\uc4d2\u4f52\u965f\u8308\ua562(\u3711\u6c52\ufcaf\u4bc8\ud158::\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, p2:\u3711\u6c52\ufcaf\u4bc8\ud158)), invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u12cb\u12b2\ua3b4\u183a\ud158\u51fa::\ub18d\u8d90\u8308\u9a18\u071d\u16f6, p0:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa, p1:\uf995\u4975\u1187\ubff1\u839e\u8389)))
        }
        
        goto(Label_0006)
    }
    
    public static \u59ec\u8413\u97e6\uc229\u3776.\u6b0d\uf9c5\ucfaf\ud36e\ub102 \u4f52\u64ab\ubefe\u64f2\u9033\u67e9(\u927d\u92ff\u71ae\uafe7\u6bb9.\u12cb\u12b2\ua3b4\u183a\ud158\u51fa p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\uf995\u4975\u1187\ubff1\u839e\u8389 p1, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u3711\u6c52\ufcaf\u4bc8\ud158 p2) {
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
            return:\u6b0d\uf9c5\ucfaf\ud36e\ub102(invokestatic:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u3e2a\u3d64\u74b1\uc84e\u5140::\u7af6\u836c\u759a\ud51e\ub18d\u7043, initobject:\u4d85\u760c\u71ae\uae5d\u7bad[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102](\u4d85\u760c\u71ae\uae5d\u7bad::<init>, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u12cb\u12b2\ua3b4\u183a\ud158\u51fa::\ub18d\u8d90\u8308\u9a18\u071d\u16f6, p0:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa, invokestatic:\uf995\u4975\u1187\ubff1\u839e\u8389(\uf995\u4975\u1187\ubff1\u839e\u8389::\u839e\u6c52\u98a4\u527a\u647c\u983f)), invokevirtual:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2(\u3711\u6c52\ufcaf\u4bc8\ud158::\u6d99\uae87\u8aa5\u6c52\u4c2b\u88c5, p2:\u3711\u6c52\ufcaf\u4bc8\ud158), invokevirtual:\u67e9\uc4d2\u4f52\u965f\u8308\ua562(\u3711\u6c52\ufcaf\u4bc8\ud158::\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, p2:\u3711\u6c52\ufcaf\u4bc8\ud158)), invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u12cb\u12b2\ua3b4\u183a\ud158\u51fa::\ub18d\u8d90\u8308\u9a18\u071d\u16f6, p0:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa, p1:\uf995\u4975\u1187\ubff1\u839e\u8389)))
        }
        
        goto(Label_0006)
    }
    
    public static \u59ec\u8413\u97e6\uc229\u3776.\u6b0d\uf9c5\ucfaf\ud36e\ub102 \u5245\u76bc\u3776\u9033\u4975\ub171(\u927d\u92ff\u71ae\uafe7\u6bb9.\u12cb\u12b2\ua3b4\u183a\ud158\u51fa p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\uf995\u4975\u1187\ubff1\u839e\u8389 p1, boolean p2, boolean p3) {
        var_4_1A6 : int
        stack_1BF_0 : \u6b0d\uf9c5\ucfaf\ud36e\ub102 [generated]
        var_4_12F : int
        stack_1A8_1 : \uf995\u4975\u1187\ubff1\u839e\u8389 [generated]
        
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
            var_4_1A6 = and:int(ldc:int(-565803517), ldc:int(-1771856065))
            
            if (getstatic:boolean(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u69d9\uc2bd\uc9f6\u0b8e\ubded\u7bad)) {
                var_3_14F = and:int[expected:boolean](ldc:int(-24340), ldc:int(19715))
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_4_1A6:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_0250)
                }
                
                if (cmpeq:boolean(and:int(var_4_1A6:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_0209)
                }
                
                if (cmpeq:boolean(and:int(var_4_1A6:int, ldc:int(512)), ldc:int(0))) {
                    var_4_1A6 = and:int(var_4_1A6:int, ldc:int(-872563545))
                }
                else {
                    var_4_1A6 = and:int(var_4_1A6:int, ldc:int(-915413201))
                    
                    if (invokestatic:boolean(\u67e9\u7873\u9937\u6d99\u5fe1\uc246::\uff55\ud158\u3a62\uc31c\uc3e3\ub113)) {
                        var_3_14F = and:int[expected:boolean](ldc:int(27294), ldc:int(-28416))
                    }
                }
                
                Label_0159:
                
                if (cmpne:boolean(and:int(var_4_1A6:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_0250)
                }
                
                if (cmpeq:boolean(and:int(var_4_1A6:int, ldc:int(1024)), ldc:int(0))) {
                    var_4_1A6 = and:int(var_4_1A6:int, ldc:int(272076447))
                }
                else {
                    if (cmpne:boolean(and:int(var_4_1A6:int, ldc:int(16777216)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_4_1A6 = and:int(var_4_1A6:int, ldc:int(888457167))
                    
                    if (cmpeq:boolean(var_3_14F:boolean, ldc:boolean(0))) {
                        return:\u6b0d\uf9c5\ucfaf\ud36e\ub102(invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u12cb\u12b2\ua3b4\u183a\ud158\u51fa::\ub18d\u8d90\u8308\u9a18\u071d\u16f6, p0:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa, p1:\uf995\u4975\u1187\ubff1\u839e\u8389))
                    }
                }
                
                Label_0209:
                
                if (cmpne:boolean(and:int(var_4_1A6:int, ldc:int(2)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_4_1A6:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0159)
                    }
                    
                    if (cmpne:boolean(and:int(var_4_1A6:int, ldc:int(2048)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_4_1A6 = and:int(var_4_1A6:int, ldc:int(-1831084049))
                    
                    if (invokestatic:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u92ff\u183a\u93a2\uc3e3\u873d\u67e9)) {
                        if (cmpeq:boolean(p1:\uf995\u4975\u1187\ubff1\u839e\u8389, invokestatic:\uf995\u4975\u1187\ubff1\u839e\u8389(\uf995\u3e75\u946b\uf995\u4c2b\ucfaf::\u7e3f\u74b1\u8d98\uf94d\u64f2\ud171))) {
                            stack_1BF_0 = invokestatic:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u3e2a\u3d64\u74b1\uc84e\u5140::\u7af6\u836c\u759a\ud51e\ub18d\u7043, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u12cb\u12b2\ua3b4\u183a\ud158\u51fa::\ub18d\u8d90\u8308\u9a18\u071d\u16f6, p0:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa, invokestatic:\uf995\u4975\u1187\ubff1\u839e\u8389(\uf995\u4975\u1187\ubff1\u839e\u8389::\uc910\uc31c\u960f\u9937\u7c6b\u0c95)), invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u12cb\u12b2\ua3b4\u183a\ud158\u51fa::\ub18d\u8d90\u8308\u9a18\u071d\u16f6, p0:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa, p1:\uf995\u4975\u1187\ubff1\u839e\u8389))
                            looporswitchbreak()
                        }
                    }
                }
                
                Label_0250:
                
                if (cmpeq:boolean(and:int(var_4_1A6:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_0209)
                }
                
                if (cmpne:boolean(and:int(var_4_1A6:int, ldc:int(2048)), ldc:int(0))) {
                    var_4_1A6 = and:int(var_4_1A6:int, ldc:int(1886170240))
                    goto(Label_0159)
                }
                
                if (cmpne:boolean(and:int(var_4_1A6:int, ldc:int(4194304)), ldc:int(0))) {
                    var_4_12F = and:int(var_4_1A6:int, ldc:int(1800132519))
                    
                    if (logicalnot:boolean(p2:boolean)) {
                        var_4_12F = and:int(var_4_12F:int, ldc:int(-621169149))
                        stack_1A8_1 = invokestatic:\uf995\u4975\u1187\ubff1\u839e\u8389(\uf995\u4975\u1187\ubff1\u839e\u8389::\u8413\u16f6\ubefe\ubefe\ubcb0\u6cfe)
                    }
                    else {
                        stack_1A8_1 = invokestatic:\uf995\u4975\u1187\ubff1\u839e\u8389(\uf995\u4975\u1187\ubff1\u839e\u8389::\ub113\u8308\u527a\u97b7\u4daf\ub171)
                    }
                    
                    var_4_1A6 = and:int(var_4_12F:int, ldc:int(107540231))
                    stack_1BF_0 = invokestatic:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u3e2a\u3d64\u74b1\uc84e\u5140::\u7af6\u836c\u759a\ud51e\ub18d\u7043, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u12cb\u12b2\ua3b4\u183a\ud158\u51fa::\ub18d\u8d90\u8308\u9a18\u071d\u16f6, p0:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa, stack_1A8_1:\uf995\u4975\u1187\ubff1\u839e\u8389), invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u12cb\u12b2\ua3b4\u183a\ud158\u51fa::\ub18d\u8d90\u8308\u9a18\u071d\u16f6, p0:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa, p1:\uf995\u4975\u1187\ubff1\u839e\u8389))
                    looporswitchbreak()
                }
                
                var_4_1A6 = and:int(var_4_1A6:int, ldc:int(-1534054864))
            }
            
            return:\u6b0d\uf9c5\ucfaf\ud36e\ub102(stack_1BF_0:\u6b0d\uf9c5\ucfaf\ud36e\ub102)
        }
        
        goto(Label_0006)
    }
    
    public static \u59ec\u8413\u97e6\uc229\u3776.\u6b0d\uf9c5\ucfaf\ud36e\ub102 \ua61f\u446c\u8640\u4d85\u71ae\u156b(\u927d\u92ff\u71ae\uafe7\u6bb9.\u12cb\u12b2\ua3b4\u183a\ud158\u51fa p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\uf995\u4975\u1187\ubff1\u839e\u8389 p1, boolean p2, boolean p3) {
        var_4_11B : int
        stack_132_1 : \uf995\u4975\u1187\ubff1\u839e\u8389 [generated]
        stack_149_0 : \u6b0d\uf9c5\ucfaf\ud36e\ub102 [generated]
        
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
            var_4_11B = and:int(ldc:int(-1411495840), ldc:int(-76627000))
            
            if (getstatic:boolean(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u69d9\uc2bd\uc9f6\u0b8e\ubded\u7bad)) {
                var_3_F9 = and:int[expected:boolean](ldc:int(-12087), ldc:int(12084))
            }
            
            loop {
                if (cmpne:boolean(and:int(var_4_11B:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_0191)
                }
                
                if (cmpne:boolean(and:int(var_4_11B:int, ldc:int(2097152)), ldc:int(0))) {
                    var_4_11B = and:int(var_4_11B:int, ldc:int(1370871881))
                }
                else {
                    var_4_11B = and:int(var_4_11B:int, ldc:int(-1620322586))
                    
                    if (invokestatic:boolean(\u67e9\u7873\u9937\u6d99\u5fe1\uc246::\uff55\ud158\u3a62\uc31c\uc3e3\ub113)) {
                        var_3_F9 = and:int[expected:boolean](ldc:int(-15237), ldc:int(14980))
                    }
                }
                
                Label_0150:
                
                if (cmpne:boolean(and:int(var_4_11B:int, ldc:int(2097152)), ldc:int(0))) {
                    var_4_11B = and:int(var_4_11B:int, ldc:int(280770271))
                }
                else {
                    if (cmpeq:boolean(and:int(var_4_11B:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_4_11B = and:int(var_4_11B:int, ldc:int(1266645006))
                    
                    if (cmpne:boolean(var_3_F9:boolean, ldc:boolean(0))) {
                        if (logicalnot:boolean(p2:boolean)) {
                            var_4_11B = and:int(var_4_11B:int, ldc:int(-1411424126))
                            stack_132_1 = invokestatic:\uf995\u4975\u1187\ubff1\u839e\u8389(\uf995\u4975\u1187\ubff1\u839e\u8389::\ubefe\uc2bd\u61a4\u7049\ub18d\u5fe1)
                        }
                        else {
                            stack_132_1 = invokestatic:\uf995\u4975\u1187\ubff1\u839e\u8389(\uf995\u4975\u1187\ubff1\u839e\u8389::\u839e\u6c52\u98a4\u527a\u647c\u983f)
                        }
                        
                        stack_149_0 = invokestatic:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u3e2a\u3d64\u74b1\uc84e\u5140::\u7af6\u836c\u759a\ud51e\ub18d\u7043, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u12cb\u12b2\ua3b4\u183a\ud158\u51fa::\ub18d\u8d90\u8308\u9a18\u071d\u16f6, p0:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa, stack_132_1:\uf995\u4975\u1187\ubff1\u839e\u8389), invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u12cb\u12b2\ua3b4\u183a\ud158\u51fa::\ub18d\u8d90\u8308\u9a18\u071d\u16f6, p0:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa, p1:\uf995\u4975\u1187\ubff1\u839e\u8389))
                        looporswitchbreak()
                    }
                }
                
                Label_0191:
                
                if (cmpne:boolean(and:int(var_4_11B:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_0150)
                }
                
                if (cmpeq:boolean(and:int(var_4_11B:int, ldc:int(8)), ldc:int(0))) {
                    stack_149_0 = invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u12cb\u12b2\ua3b4\u183a\ud158\u51fa::\ub18d\u8d90\u8308\u9a18\u071d\u16f6, p0:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa, p1:\uf995\u4975\u1187\ubff1\u839e\u8389)
                    looporswitchbreak()
                }
                
                var_4_11B = and:int(var_4_11B:int, ldc:int(-696865189))
            }
            
            return:\u6b0d\uf9c5\ucfaf\ud36e\ub102(stack_149_0:\u6b0d\uf9c5\ucfaf\ud36e\ub102)
        }
        
        goto(Label_0006)
    }
    
    private void \u6c56\ud4fe\uc246\ub83f\u4975\u873d(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, \u59ec\u8413\u97e6\uc229\u3776.\u6b0d\uf9c5\ucfaf\ud36e\ub102 p1, java.util.List<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u71ae\u6c56\uc29a\ubefe\u760c\u71ae> p2, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p3, int p4, int p5) {
        var_7_63 : int
        stack_92_0 : int [generated]
        var_7_110 : int
        var_9_92 : int
        var_10_98 : \u3711\u6c52\ufcaf\u4bc8\ud158
        var_11_9D : boolean
        var_12_A5 : int
        var_13_AE : int
        var_14_F3 : \u71ae\u6c56\uc29a\ubefe\u760c\u71ae
        var_7_100 : int
        var_15_103 : int
        var_16_124 : float
        var_17_138 : float
        var_18_149 : float
        
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
            var_7_63 = and:int(ldc:int(17688590), ldc:int(-1895432593))
            
            if (invokevirtual:boolean(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u69d9\ub8be\u3a62\ud171\u64f2\ua562, p3:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)) {
                var_7_63 = and:int(var_7_63:int, ldc:int(688385892))
                stack_92_0 = and:int(ldc:int(3216), ldc:int(-3217))
            }
            else {
                stack_92_0 = xor:int(ldc:int(4170), ldc:int(4171))
            }
            
            var_7_110 = and:int(var_7_63:int, ldc:int(-563630131))
            var_9_92 = stack_92_0:int
            var_10_98 = invokevirtual:\u3711\u6c52\ufcaf\u4bc8\ud158(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u9033\u12b2\u516c\u97e6\u6d99\ua3b4, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
            var_11_9D = invokestatic:boolean(\u67e9\u7873\u9937\u6d99\u5fe1\uc246::\u71f1\u8640\uc7fe\ucef1\u5db4\u6c56)
            var_12_A5 = invokeinterface:int(List<E>::size, p2:List<\u71ae\u6c56\uc29a\ubefe\u760c\u71ae>)
            var_13_AE = and:int(ldc:int(-10011), ldc:int(9498))
            
            loop {
                if (cmpeq:boolean(and:int(var_7_110:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_7_110 = and:int(var_7_110:int, ldc:int(377139831))
                }
                else {
                    var_7_110 = and:int(var_7_110:int, ldc:int(670019258))
                    
                    if (cmplt:boolean(var_13_AE:int, var_12_A5:int)) {
                        var_14_F3 = checkcast:\u71ae\u6c56\uc29a\ubefe\u760c\u71ae(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u71ae\u6c56\uc29a\ubefe\u760c\u71ae.class, invokeinterface:\u71ae\u6c56\uc29a\ubefe\u760c\u71ae(List<\u71ae\u6c56\uc29a\ubefe\u760c\u71ae>::get, p2:List<\u71ae\u6c56\uc29a\ubefe\u760c\u71ae>, var_13_AE:int))
                        
                        if (var_11_9D:boolean) {
                            var_14_F3 = invokestatic:\u71ae\u6c56\uc29a\ubefe\u760c\u71ae(\u67e9\u7873\u9937\u6d99\u5fe1\uc246::\u72f1\uae5d\u3711\u8640\ubded\u69d9, var_14_F3:\u71ae\u6c56\uc29a\ubefe\u760c\u71ae)
                            
                            if (cmpeq:boolean(var_14_F3:\u71ae\u6c56\uc29a\ubefe\u760c\u71ae, aconstnull:\u71ae\u6c56\uc29a\ubefe\u760c\u71ae())) {
                                goto(Label_0466)
                            }
                        }
                        
                        var_7_100 = and:int(var_7_110:int, ldc:int(-1309349735))
                        var_15_103 = ldc:int(-1)
                        
                        if (cmpne:boolean(var_9_92:int, ldc:int(0))) {
                            if (invokevirtual:boolean(\u71ae\u6c56\uc29a\ubefe\u760c\u71ae::\uae5d\u446c\u51b2\u446c\u416d\u62da, var_14_F3:\u71ae\u6c56\uc29a\ubefe\u760c\u71ae)) {
                                var_15_103 = invokevirtual:int(\uc910\u3c25\u93a2\u873d\u983f\ud7e8::\u4179\u97e6\u92ff\u4179\u7049\u52d3, getfield:\uc910\u3c25\u93a2\u873d\u983f\ud7e8(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\u36d3\u9033\u0b8e\u7af6\u760c\u97e6, this:\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a), p3:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, invokevirtual:int(\u71ae\u6c56\uc29a\ubefe\u760c\u71ae::\ub8be\u6435\u7330\ud36e\u3711\u59ec, var_14_F3:\u71ae\u6c56\uc29a\ubefe\u760c\u71ae))
                            }
                        }
                        
                        var_7_110 = and:int(var_7_100:int, ldc:int(-54674996))
                        var_16_124 = div:float(i2f:float(and:int(shr:int(var_15_103:int, ldc:int(16)), xor:int(ldc:int(25237), ldc:int(25194)))), ldc:float(255.0f))
                        var_17_138 = div:float(i2f:float(and:int(shr:int(var_15_103:int, ldc:int(8)), xor:int(ldc:int(1333), ldc:int(1482)))), ldc:float(255.0f))
                        var_18_149 = div:float(i2f:float(and:int(var_15_103:int, and:int(ldc:int(9215), ldc:int(1279)))), ldc:float(255.0f))
                        
                        if (logicalnot:boolean(invokevirtual:boolean(\u93a2\u1833\u6cfe\uc4d2\u4ab3\uc84e::\u9255\u8413\ube23\u71ae\u647c\u4f52, getstatic:\u93a2\u1833\u6cfe\uc4d2\u4ab3\uc84e(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u760c\u4d85\u9033\u8bb0\u5654\u600f)))) {
                            var_7_110 = and:int(var_7_110:int, ldc:int(-1463437004))
                            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u965f\ubcb0\ubb2b\u8413\ub83f\u2dcc, p1:\u6b0d\uf9c5\ucfaf\ud36e\ub102, var_10_98:\u3711\u6c52\ufcaf\u4bc8\ud158, var_14_F3:\u71ae\u6c56\uc29a\ubefe\u760c\u71ae, var_16_124:float, var_17_138:float, var_18_149:float, p4:int, p5:int)
                        }
                        else {
                            invokeinterface:void(\uceb8\u7d52\u47c2\u7c6b\u12cb\u5f50::\ub1b9\u759a\u8df4\u8350\uc229\ud51e, p1:\u6b0d\uf9c5\ucfaf\ud36e\ub102[expected:\uceb8\u7d52\u47c2\u7c6b\u12cb\u5f50], var_10_98:\u3711\u6c52\ufcaf\u4bc8\ud158, var_14_F3:\u71ae\u6c56\uc29a\ubefe\u760c\u71ae, var_16_124:float, var_17_138:float, var_18_149:float, p4:int, p5:int, xor:int[expected:boolean](ldc:int(-32746), ldc:int(-32745)))
                        }
                        
                        Label_0466:
                        var_7_110 = and:int(var_7_110:int, ldc:int(-1477645872))
                        inc:int(var_13_AE, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_7_110:int, ldc:int(4194304)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ua562\ud4fe\u647c\uc84e\u5245\u5f50 \u983f\u527a\u4daf\u6c52\ub171\u4bc8(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p0, \u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c p1, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p2) {
        var_4_63 : int
        var_7_83 : \ua562\ud4fe\u647c\uc84e\u5245\u5f50
        var_8_CD : \u16f6\u61a4\u5db4\u4c04\u64ab\u9255
        var_9_E3 : \ua562\ud4fe\u647c\uc84e\u5245\u5f50
        
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
            var_4_63 = and:int(ldc:int(1402368487), ldc:int(1602682070))
            
            if (cmpne:boolean(invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), getstatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u4492\ua562\ud158\u4492\u6bb9\ub70c::\ud523\ud217\u760c\u62da\u40a9\ub32d))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(2060279278))
                var_7_83 = invokevirtual:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u51fa\u965f\u12b2\u4d85\u5654\uc7fe::\u5140\u99f7\uc2e8\u6b0d\uc910\ud4fe, getfield:\u51fa\u965f\u12b2\u4d85\u5654\uc7fe(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\ub102\ub171\ub113\u946b\ub7dc\u8258, this:\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a), p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
            }
            else {
                var_7_83 = invokevirtual:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u7af6\u67d0\u8753\u71f1\u6198\u494c::\u446c\ubb2b\ufcaf\u183a\u88c5\u5140, invokevirtual:\u7af6\u67d0\u8753\u71f1\u6198\u494c(\u51fa\u965f\u12b2\u4d85\u5654\uc7fe::\u120d\u3bc9\u946b\uceb8\u62da\u0a06, getfield:\u51fa\u965f\u12b2\u4d85\u5654\uc7fe(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\ub102\ub171\ub113\u946b\ub7dc\u8258, this:\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a)), initobject:\u71ae\u64ab\u718f\u9a18\uc31c\u7d52(\u71ae\u64ab\u718f\u9a18\uc31c\u7d52::<init>, loadelement:String(getstatic:String[](\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\ucb79\u6d69\u64f2\u93a2\ub171\u56bd), xor:int(ldc:int(16483), ldc:int(16481)))))
            }
            
            var_8_CD = ternaryop:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(instanceof:boolean(\u927d\u92ff\u71ae\uafe7\u6bb9.\u16f6\u61a4\u5db4\u4c04\u64ab\u9255.class, p1:\uf9c5\ud158\u4975\uf94d\ud523\uc31c), checkcast:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u927d\u92ff\u71ae\uafe7\u6bb9.\u16f6\u61a4\u5db4\u4c04\u64ab\u9255.class, p1:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255]), aconstnull:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255())
            putstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uf9c5\u1833\u624e\u8d98\u9937\u3504::\ub70c\u40a9\u97e6\ub1b9\u4f4a\u446c, aconstnull:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753())
            var_9_E3 = invokevirtual:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\uf9c5\u1833\u624e\u8d98\u9937\u3504::\u385b\u59ec\u1187\uc229\uc87f\u4975, invokeinterface:\uf9c5\u1833\u624e\u8d98\u9937\u3504(\ua562\ud4fe\u647c\uc84e\u5245\u5f50::\u8df4\ub70c\u3776\ud217\ub7dc\u6435, var_7_83:\ua562\ud4fe\u647c\uc84e\u5245\u5f50), var_7_83:\ua562\ud4fe\u647c\uc84e\u5245\u5f50, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, var_8_CD:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, p2:\ube23\u67d0\u64f2\u839e\u76bc)
            
            if (invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u36d3\u67d0\u8753\uf94d\ub19c\u9a18)) {
                var_9_E3 = invokestatic:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\ub18d\u8413\u6c56\u8258\u51fa\u61a4::\u1833\u51fa\u839e\u8753\u7043\u5f50, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, var_9_E3:\ua562\ud4fe\u647c\uc84e\u5245\u5f50, getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uf9c5\u1833\u624e\u8d98\u9937\u3504::\ub70c\u40a9\u97e6\ub1b9\u4f4a\u446c), and:int[expected:boolean](ldc:int(4205), ldc:int(26627)))
            }
            
            return:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(ternaryop:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(cmpne:boolean(var_9_E3:\ua562\ud4fe\u647c\uc84e\u5245\u5f50, aconstnull:\ua562\ud4fe\u647c\uc84e\u5245\u5f50()), var_9_E3:\ua562\ud4fe\u647c\uc84e\u5245\u5f50, invokevirtual:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u7af6\u67d0\u8753\u71f1\u6198\u494c::\ube23\u839e\u3a62\u40a9\u3a62\u8bb0, invokevirtual:\u7af6\u67d0\u8753\u71f1\u6198\u494c(\u51fa\u965f\u12b2\u4d85\u5654\uc7fe::\u120d\u3bc9\u946b\uceb8\u62da\u0a06, getfield:\u51fa\u965f\u12b2\u4d85\u5654\uc7fe(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\ub102\ub171\ub113\u946b\ub7dc\u8258, this:\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a)))))
        }
        
        goto(Label_0006)
    }
    
    public void \ud523\u8389\u6ec6\u76bc\u392e\ub32d(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p0, \u5245\u8aa5\u61a4\u7049\u4cd9.\ub113\u8bb0\u6ec6\u4f52\u6198\ucb79 p1, int p2, int p3, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p4, \u927d\u92ff\u71ae\uafe7\u6bb9.\u12cb\u12b2\ua3b4\u183a\ud158\u51fa p5) {
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
            invokevirtual:void(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\ud523\u8389\u6ec6\u76bc\u392e\ub32d, this:\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a, checkcast:\ube23\u67d0\u64f2\u839e\u76bc(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc.class, aconstnull:\ube23\u67d0\u64f2\u839e\u76bc()), p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, p1:\ub113\u8bb0\u6ec6\u4f52\u6198\ucb79, and:int[expected:boolean](ldc:int(-14214), ldc:int(13701)), p4:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p5:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa, checkcast:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c.class, aconstnull:\uf9c5\ud158\u4975\uf94d\ud523\uc31c()), p2:int, p3:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ud523\u8389\u6ec6\u76bc\u392e\ub32d(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p1, \u5245\u8aa5\u61a4\u7049\u4cd9.\ub113\u8bb0\u6ec6\u4f52\u6198\ucb79 p2, boolean p3, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p4, \u927d\u92ff\u71ae\uafe7\u6bb9.\u12cb\u12b2\ua3b4\u183a\ud158\u51fa p5, \u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c p6, int p7, int p8) {
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
            
            if (logicalnot:boolean(invokevirtual:boolean(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u69d9\ub8be\u3a62\ud171\u64f2\ua562, p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))) {
                invokevirtual:void(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\ud523\u8389\u6ec6\u76bc\u392e\ub32d, this:\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a, p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, p2:\ub113\u8bb0\u6ec6\u4f52\u6198\ucb79, p3:boolean, p4:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p5:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa, p7:int, p8:int, invokevirtual:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\u983f\u527a\u4daf\u6c52\ub171\u4bc8, this:\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a, p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, p6:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p0:\ube23\u67d0\u64f2\u839e\u76bc))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ubded\u446c\ub102\u2dcc\u98a4\u36d3(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p0, int p1, int p2) {
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
            invokevirtual:void(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\u3776\u0a06\u98a4\ua61f\ufe34\u760c, this:\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, p1:int, p2:int, invokevirtual:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\u983f\u527a\u4daf\u6c52\ub171\u4bc8, this:\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, checkcast:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c.class, aconstnull:\uf9c5\ud158\u4975\uf94d\ud523\uc31c()), checkcast:\ube23\u67d0\u64f2\u839e\u76bc(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc.class, aconstnull:\ube23\u67d0\u64f2\u839e\u76bc())))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u3776\u0a06\u98a4\ua61f\ufe34\u760c(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p0, int p1, int p2, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ua562\ud4fe\u647c\uc84e\u5245\u5f50 p3) {
        var_5_63 : int
        var_7_E7 : \uafe7\uc7fe\u4c04\u6b5f\u5bc4
        var_8_F2 : \u61a4\u76bc\u0c95\u1833\u7043\u3711
        stack_123_0 : int [generated]
        var_9_123 : int
        
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
            var_5_63 = and:int(ldc:int(994971504), ldc:int(2064514296))
            putstatic:boolean(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\u8753\ud171\u527a\u873d\ufe34\u7af6, and:int[expected:boolean](ldc:int(12421), ldc:int(3091)))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u6c52\u416d\u385b\ud7e8\ufcaf\u9937)
            invokevirtual:void(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u6ec6\u9a18\u92ff\u2dcc\ud12e\u7ce1, getfield:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\ucfaf\u071d\u52d3\u183a\u92ff\u760c, this:\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ud171\u156b\u0800\u36d3\ub8be\u760c::\u7043\u3e2a\u5d20\u52d3\u4e72\ub32d))
            invokevirtual:void(\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a::\uc3e3\u3c25\u7ce1\ub19c\ub171\u9033, invokevirtual:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u624e\uc3e3\u6bb9\u4c2b\u7d52\u5db4, getfield:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\ucfaf\u071d\u52d3\u183a\u92ff\u760c, this:\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ud171\u156b\u0800\u36d3\ub8be\u760c::\u7043\u3e2a\u5d20\u52d3\u4e72\ub32d)), and:int[expected:boolean](ldc:int(-22587), ldc:int(22586)), and:int[expected:boolean](ldc:int(3598), ldc:int(-3599)))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8640\u51b2\u6cfe\ub32d\uc246\u7e3f)
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8413\u9033\u3bc9\uceb8\u1833\u97b7)
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u97e6\u946b\uc7fe\u0b8e\u5fe1\ub113)
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\uc9f6\u7049\u92ee\ube23\u3c25\u6d99)
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\uff55\ucb79\u34df\u8d90\ud523\u6d99, getstatic:\ud12e\ub70c\u16f6\uc29a\u8bb0(\ud12e\ub70c\u16f6\uc29a\u8bb0::\ua6bd\ubcb0\ub113\u3bd6\u72f1\u9af2), getstatic:\u624e\uc4d2\u98a4\ud12e\u7873(\u624e\uc4d2\u98a4\ud12e\u7873::\u3e2a\u0a06\u3d4b\u8640\ub19c\u67e9))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8d90\u92ff\uc84e\u3dd3\uf9c5\u8308, ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u93a2\ube23\u624e\u6fb0\u4daf\u92ee, i2f:float(p1:int), i2f:float(p2:int), add:float(ldc:float(100.0f), getfield:float(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\u600f\u6b0d\u99f7\u9033\u3504\u67d0, this:\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a)))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u93a2\ube23\u624e\u6fb0\u4daf\u92ee, ldc:float(8.0f), ldc:float(8.0f), ldc:float(0.0f))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u97e6\u4975\u836c\u7ce1\u36d3\ucb79, ldc:float(1.0f), ldc:float(-1.0f), ldc:float(1.0f))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u97e6\u4975\u836c\u7ce1\u36d3\ucb79, ldc:float(16.0f), ldc:float(16.0f), ldc:float(16.0f))
            var_7_E7 = initobject:\uafe7\uc7fe\u4c04\u6b5f\u5bc4(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::<init>)
            var_8_F2 = invokevirtual:\u61a4\u76bc\u0c95\u1833\u7043\u3711(\uafe7\uc2e8\u8389\ufcaf\ub19c\u51b2::\u718f\u7af6\ud12e\u72f1\u62da\u51b2, invokevirtual:\uafe7\uc2e8\u8389\ufcaf\ub19c\u51b2(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc29a\u8308\u7006\u8aa5\u760c\ud12e, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350)))
            
            if (invokeinterface:boolean(\ua562\ud4fe\u647c\uc84e\u5245\u5f50::\u3dd3\uc29a\u5245\ud171\u61a4\u071d, p3:\ua562\ud4fe\u647c\uc84e\u5245\u5f50)) {
                var_5_63 = and:int(var_5_63:int, ldc:int(1808759924))
                stack_123_0 = and:int(ldc:int(22702), ldc:int(-23727))
            }
            else {
                stack_123_0 = and:int(ldc:int(19249), ldc:int(129))
            }
            
            var_9_123 = stack_123_0:int
            
            if (cmpne:boolean(var_9_123:int, ldc:int(0))) {
                invokestatic:void(\uf9c5\ucef1\u4daf\ud36e\uc246\u3776::\u9a18\u120d\uc31c\u6ec6\uc229\u183a)
            }
            
            invokevirtual:void(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\ud523\u8389\u6ec6\u76bc\u392e\ub32d, this:\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, getstatic:\ub113\u8bb0\u6ec6\u4f52\u6198\ucb79(\ub113\u8bb0\u6ec6\u4f52\u6198\ucb79::\ub32d\u74b1\ub32d\u647c\u8df4\u4c04), and:int[expected:boolean](ldc:int(2259), ldc:int(-3028)), var_7_E7:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, var_8_F2:\u61a4\u76bc\u0c95\u1833\u7043\u3711[expected:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa], ldc:int(15728880), getstatic:int(\uf9c5\ud51e\ucfaf\u392e\u071d\u9937::\u624e\u516c\u6cfe\u4c04\u8753\u120d), p3:\ua562\ud4fe\u647c\uc84e\u5245\u5f50)
            invokevirtual:void(\u61a4\u76bc\u0c95\u1833\u7043\u3711::\u52d3\ua3b4\uae87\u1833\u9a18\u51b2, var_8_F2:\u61a4\u76bc\u0c95\u1833\u7043\u3711)
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u59ec\u4bc8\u9033\u494c\u8308\ud51e)
            
            if (cmpne:boolean(var_9_123:int, ldc:int(0))) {
                invokestatic:void(\uf9c5\ucef1\u4daf\ud36e\uc246\u3776::\u6b0d\ua068\ud217\u600f\u3a62\u7c6b)
            }
            
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u624e\u156b\u6c56\uc910\ub70c\u40a9)
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8350\u183a\ubded\u2dcc\ub8be\u88c5)
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\uae87\ua3b4\u88c5\u8413\u7d52\u647c)
            putstatic:boolean(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\u8753\ud171\u527a\u873d\ufe34\u7af6, and:int[expected:boolean](ldc:int(19653), ldc:int(-20214)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4cd9\ub8be\uf94d\u9937\u759a\u3bd6(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p0, int p1, int p2) {
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
            invokespecial:void(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\ubded\u446c\ub102\u2dcc\u98a4\u36d3, this:\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\ube23\u67d0\u64f2\u839e\u76bc](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350)), p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, p1:int, p2:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u62da\u4492\u6c56\u6cfe\ubded\u4cd9(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p0, int p1, int p2) {
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
            invokespecial:void(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\ubded\u446c\ub102\u2dcc\u98a4\u36d3, this:\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a, checkcast:\ube23\u67d0\u64f2\u839e\u76bc(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc.class, aconstnull:\ube23\u67d0\u64f2\u839e\u76bc()), p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, p1:int, p2:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4cd9\ub8be\uf94d\u9937\u759a\u3bd6(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p1, int p2, int p3) {
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
            invokespecial:void(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\ubded\u446c\ub102\u2dcc\u98a4\u36d3, this:\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a, p0:\ube23\u67d0\u64f2\u839e\u76bc, p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, p2:int, p3:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \ubded\u446c\ub102\u2dcc\u98a4\u36d3(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p1, int p2, int p3) {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    public void \u6435\u7e3f\ua562\ub1b9\u8aa5\u5db4(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ucef1\u99f7\u4e72\u7873\u0800\u72f1 p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p1, int p2, int p3) {
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
            invokevirtual:void(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\ud523\u97e6\ub1b9\u8753\u3d4b\ucef1, this:\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a, p0:\ucef1\u99f7\u4e72\u7873\u0800\u72f1, p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, p2:int, p3:int, checkcast:String(java.lang.String.class, aconstnull:String()))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ud523\u97e6\ub1b9\u8753\u3d4b\ucef1(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ucef1\u99f7\u4e72\u7873\u0800\u72f1 p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p1, int p2, int p3, java.lang.String p4) {
        var_6_29C : int
        var_8_80 : \uafe7\uc7fe\u4c04\u6b5f\u5bc4
        stack_1BA_0 : String [generated]
        var_10_247 : \u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab
        var_11_24E : float
        var_12_255 : float
        var_13_263 : float
        var_14_275 : int
        var_15_282 : int
        stack_373_0 : \u9af2\u1833\u156b\u12cb\u7d52\u6c52 [generated]
        stack_373_1 : \u71ae\u5fe1\u0b8e\u5140\uf995\u927d [generated]
        expr_366 : Object[] [generated]
        var_16_376 : double
        stack_393_0 : \u9af2\u1833\u156b\u12cb\u7d52\u6c52 [generated]
        stack_393_1 : \u71ae\u5fe1\u0b8e\u5140\uf995\u927d [generated]
        expr_386 : Object[] [generated]
        var_18_396 : int
        var_6_174 : int
        var_9_17C : \uf995\u72f1\u8389\ucb79\ub6ab\u8d98
        stack_3CC_0 : float [generated]
        var_10_3CC : float
        var_9_1BA : String
        var_10_1D5 : \u61a4\u76bc\u0c95\u1833\u7043\u3711
        
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
            var_6_29C = and:int(ldc:int(56400511), ldc:int(847492076))
            
            if (logicalnot:boolean(invokevirtual:boolean(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u69d9\ub8be\u3a62\ud171\u64f2\ua562, p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))) {
                var_8_80 = initobject:\uafe7\uc7fe\u4c04\u6b5f\u5bc4(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::<init>)
                
                if (cmpeq:boolean(invokevirtual:int(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u927d\ufcaf\ub8be\u6bb9\u74b1\u3e75, p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), xor:int(ldc:int(2050), ldc:int(2051)))) {
                    if (cmpeq:boolean(p4:String, aconstnull:String())) {
                        goto(Label_0266)
                    }
                }
                
                Label_0144:
                
                if (cmpne:boolean(and:int(var_6_29C:int, ldc:int(2097152)), ldc:int(0))) {
                    var_6_29C = and:int(var_6_29C:int, ldc:int(-1192945156))
                    goto(Label_0318)
                }
                
                if (cmpne:boolean(and:int(var_6_29C:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_0266)
                }
                
                if (cmpne:boolean(and:int(var_6_29C:int, ldc:int(131072)), ldc:int(0))) {
                    var_6_29C = and:int(var_6_29C:int, ldc:int(1341303230))
                }
                else {
                    var_6_29C = and:int(var_6_29C:int, ldc:int(-1283222659))
                    
                    if (cmpeq:boolean(p4:String, aconstnull:String())) {
                        stack_1BA_0 = invokestatic:String(String::valueOf, invokevirtual:int(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u927d\ufcaf\ub8be\u6bb9\u74b1\u3e75, p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))
                        goto(Label_0434)
                    }
                }
                
                Label_0206:
                
                if (cmpne:boolean(and:int(var_6_29C:int, ldc:int(131072)), ldc:int(0))) {
                    var_6_29C = and:int(var_6_29C:int, ldc:int(985455093))
                    goto(Label_0318)
                }
                
                if (cmpeq:boolean(and:int(var_6_29C:int, ldc:int(67108864)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_6_29C:int, ldc:int(8388608)), ldc:int(0))) {
                        var_6_29C = and:int(var_6_29C:int, ldc:int(923186023))
                        stack_1BA_0 = p4:String
                        goto(Label_0434)
                    }
                    
                    goto(Label_0144)
                }
                
                Label_0266:
                
                if (cmpne:boolean(and:int(var_6_29C:int, ldc:int(8388608)), ldc:int(0))) {
                    var_6_29C = and:int(var_6_29C:int, ldc:int(-1876838975))
                }
                else {
                    if (cmpeq:boolean(and:int(var_6_29C:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0206)
                    }
                    
                    if (cmpeq:boolean(and:int(var_6_29C:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0144)
                    }
                    
                    var_6_29C = and:int(var_6_29C:int, ldc:int(172727924))
                    
                    if (invokestatic:boolean(\ub1b9\u4c04\u8cae\u8cae\u647c\u51b2::\u6198\u7330\u8709\u9255\u516c\ufcaf, p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)) {
                        invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\ucef1\u92ff\u7e3f\u71f1\u69d9\ub7dc)
                        invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8389\ua3b4\u3d4b\ud36e\u67e9\ubefe)
                        invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u624e\u156b\u6c56\uc910\ub70c\u40a9)
                        invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9)
                        var_10_247 = invokevirtual:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\u74b1\u7bad\u6435\uc87f\u6d69\uc238, invokestatic:\ub6ab\u8cae\u64ab\u5245\ubff1\u3711(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\u3504\ud523\u99f7\u5140\u5d20\u983f))
                        var_11_24E = i2f:float(invokevirtual:int(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\uae87\u3e75\u8df4\u3a62\u6b0d\ua562, p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))
                        var_12_255 = i2f:float(invokevirtual:int(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u960f\u8350\uc2e8\u718f\uafe7\u7d52, p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))
                        var_13_263 = invokestatic:float(Math::max, ldc:float(0.0f), div:float(sub:float(var_12_255:float, var_11_24E:float), var_12_255:float))
                        var_14_275 = invokestatic:int(Math::round, sub:float(ldc:float(13.0f), div:float(mul:float(var_11_24E:float, ldc:float(13.0f)), var_12_255:float)))
                        var_15_282 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u7330\u9033\u7d52\u71ae\u4f52\u760c, div:float(var_13_263:float, ldc:float(3.0f)), ldc:float(1.0f), ldc:float(1.0f))
                        
                        if (invokevirtual:boolean(\u71ae\u5fe1\u0b8e\u5140\uf995\u927d::\uc87f\u7af6\u7043\ub19c\uc84e\u4c04, getstatic:\u71ae\u5fe1\u0b8e\u5140\uf995\u927d(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u40a9\u6bb9\u5140\u62da\u16f6\uf9c5))) {
                            if (invokevirtual:boolean(\u71ae\u5fe1\u0b8e\u5140\uf995\u927d::\uc87f\u7af6\u7043\ub19c\uc84e\u4c04, getstatic:\u71ae\u5fe1\u0b8e\u5140\uf995\u927d(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u76bc\ubded\u3bd6\u7873\u4bc8\ua61f))) {
                                stack_373_0 = invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
                                stack_373_1 = getstatic:\u71ae\u5fe1\u0b8e\u5140\uf995\u927d(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u40a9\u6bb9\u5140\u62da\u16f6\uf9c5)
                                expr_366 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(21), ldc:int(20553)))
                                storeelement:Object(expr_366:Object[], and:int(ldc:int(-22088), ldc:int(22019)), p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56[expected:Object])
                                var_16_376 = invokestatic:double(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\ub8be\ub8be\ubf56\u69d9\u600f\u8389, stack_373_0:\u9af2\u1833\u156b\u12cb\u7d52\u6c52[expected:Object], stack_373_1:\u71ae\u5fe1\u0b8e\u5140\uf995\u927d, expr_366:Object[])
                                stack_393_0 = invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
                                stack_393_1 = getstatic:\u71ae\u5fe1\u0b8e\u5140\uf995\u927d(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u76bc\ubded\u3bd6\u7873\u4bc8\ua61f)
                                expr_386 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(2053), ldc:int(1627)))
                                storeelement:Object(expr_386:Object[], and:int(ldc:int(3796), ldc:int(-11991)), p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56[expected:Object])
                                var_18_396 = invokestatic:int(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u7330\u624e\u71ae\u6d69\ubded\u8d90, stack_393_0:\u9af2\u1833\u156b\u12cb\u7d52\u6c52[expected:Object], stack_393_1:\u71ae\u5fe1\u0b8e\u5140\uf995\u927d, expr_386:Object[])
                                var_14_275 = invokestatic:int(Math::round, sub:float(ldc:float(13.0f), mul:float(d2f:float(var_16_376:double), ldc:float(13.0f))))
                                var_15_282 = var_18_396:int
                            }
                        }
                        
                        loop {
                            if (cmpne:boolean(and:int(var_6_29C:int, ldc:int(2147483647)), ldc:int(0))) {
                                var_6_29C = and:int(var_6_29C:int, ldc:int(-1629055252))
                                
                                if (invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u1187\ubf56\u600f\ub1b9\ubf56\uc31c)) {
                                    var_15_282 = invokestatic:int(\u6d69\u92ff\u983f\u873d\u8258\u40a9::\u67d0\u6b0d\u3711\u6bb9\uc2bd\ubff1, var_13_263:float, var_15_282:int)
                                }
                            }
                            
                            if (cmpne:boolean(and:int(var_6_29C:int, ldc:int(32)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                        }
                        
                        var_6_29C = and:int(var_6_29C:int, ldc:int(-1755029908))
                        invokespecial:void(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\u9af2\u8640\u9a18\u2dcc\u4179\ua562, this:\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a, var_10_247:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, add:int(p2:int, and:int(ldc:int(4354), ldc:int(8270))), add:int(p3:int, ldc:int(13)), ldc:int(13), xor:int(ldc:int(22530), ldc:int(22528)), and:int(ldc:int(-10611), ldc:int(10578)), and:int(ldc:int(1294), ldc:int(-5903)), and:int(ldc:int(1922), ldc:int(-1924)), and:int(ldc:int(4351), ldc:int(2303)))
                        invokespecial:void(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\u9af2\u8640\u9a18\u2dcc\u4179\ua562, this:\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a, var_10_247:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, add:int(p2:int, and:int(ldc:int(16906), ldc:int(8534))), add:int(p3:int, ldc:int(13)), var_14_275:int, and:int(ldc:int(28881), ldc:int(3595)), and:int(shr:int(var_15_282:int, ldc:int(16)), xor:int(ldc:int(4783), ldc:int(4688))), and:int(shr:int(var_15_282:int, ldc:int(8)), and:int(ldc:int(18687), ldc:int(1023))), and:int(var_15_282:int, and:int(ldc:int(511), ldc:int(30463))), xor:int(ldc:int(-28616), ldc:int(-28473)))
                        invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\uc9f6\u7049\u92ee\ube23\u3c25\u6d99)
                        invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8413\u9033\u3bc9\uceb8\u1833\u97b7)
                        invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u97e6\u9255\u59ec\ube23\u64f2\ub32d)
                        invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u59ec\u4bc8\u9033\u494c\u8308\ud51e)
                    }
                }
                
                Label_0318:
                
                if (cmpeq:boolean(and:int(var_6_29C:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_6_29C = and:int(var_6_29C:int, ldc:int(-739198595))
                    goto(Label_0266)
                }
                
                if (cmpne:boolean(and:int(var_6_29C:int, ldc:int(8388608)), ldc:int(0))) {
                    var_6_29C = and:int(var_6_29C:int, ldc:int(61953298))
                    goto(Label_0206)
                }
                
                if (cmpeq:boolean(and:int(var_6_29C:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_0144)
                }
                
                var_6_174 = and:int(var_6_29C:int, ldc:int(1273838180))
                var_9_17C = getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350))
                
                if (cmpne:boolean(var_9_17C:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98, aconstnull:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98())) {
                    var_6_174 = and:int(var_6_174:int, ldc:int(2006440678))
                    stack_3CC_0 = invokevirtual:float(\u8c8a\u392e\ub8be\ub8be\uc31c\ub18d::\ub8be\u47c2\u0a06\uf995\u839e\u5245, invokevirtual:\u8c8a\u392e\ub8be\ub8be\uc31c\ub18d(\ua3b4\u8aa5\ub113\ubf56\u873d::\u6435\uc31c\ubb2b\ub8be\u98a4\u51b2, var_9_17C:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\ua3b4\u8aa5\ub113\ubf56\u873d]), invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), invokevirtual:float(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ubcb0\uff55\u9937\u3d64\u8c8a\u8cae, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350)))
                }
                else {
                    stack_3CC_0 = ldc:float(0.0f)
                }
                
                var_6_29C = and:int(var_6_174:int, ldc:int(-611404058))
                var_10_3CC = stack_3CC_0:float
                
                if (cmple:boolean(var_10_3CC:float, ldc:float(0.0f))) {
                    return:void()
                }
                
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\ucef1\u92ff\u7e3f\u71f1\u69d9\ub7dc)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8389\ua3b4\u3d4b\ud36e\u67e9\ubefe)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\uc9f6\u7049\u92ee\ube23\u3c25\u6d99)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u3d4b\u74b1\u3711\u5bc4\uf9c5\ub32d)
                invokespecial:void(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\u9af2\u8640\u9a18\u2dcc\u4179\ua562, this:\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a, invokevirtual:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\u74b1\u7bad\u6435\uc87f\u6d69\uc238, invokestatic:\ub6ab\u8cae\u64ab\u5245\ubff1\u3711(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\u3504\ud523\u99f7\u5140\u5d20\u983f)), p2:int, add:int(p3:int, invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, mul:float(ldc:float(16.0f), sub:float(ldc:float(1.0f), var_10_3CC:float)))), ldc:int(16), invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u3e75\u4bc8\u416d\u92ff\u7c6b\ub6ab, mul:float(ldc:float(16.0f), var_10_3CC:float)), and:int(ldc:int(767), ldc:int(1535)), and:int(ldc:int(767), ldc:int(4607)), and:int(ldc:int(8447), ldc:int(767)), ldc:int(127))
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u97e6\u9255\u59ec\ube23\u64f2\ub32d)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u59ec\u4bc8\u9033\u494c\u8308\ud51e)
                return:void()
                Label_0434:
                var_6_29C = and:int(var_6_29C:int, ldc:int(-1209688091))
                var_9_1BA = stack_1BA_0:String
                invokevirtual:void(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e, var_8_80:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, ldc:double(0.0), ldc:double(0.0), f2d:double(add:float(getfield:float(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\u600f\u6b0d\u99f7\u9033\u3504\u67d0, this:\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a), ldc:float(200.0f))))
                var_10_1D5 = invokestatic:\u61a4\u76bc\u0c95\u1833\u7043\u3711(\u12cb\u12b2\ua3b4\u183a\ud158\u51fa::\ud523\u927d\u97e6\ud51e\u99f7\u71f1, invokevirtual:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\u74b1\u7bad\u6435\uc87f\u6d69\uc238, invokestatic:\ub6ab\u8cae\u64ab\u5245\ubff1\u3711(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\u3504\ud523\u99f7\u5140\u5d20\u983f)))
                invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\uc29a\u7d52\ud51e\u4179\u7e3f\uc9f6, p0:\ucef1\u99f7\u4e72\u7873\u0800\u72f1, var_9_1BA:String, i2f:float(sub:int(sub:int(add:int(p2:int, ldc:int(19)), xor:int(ldc:int(2053), ldc:int(2055))), invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u6435\u516c\u873d\u88c5\u3d4b\u1187, p0:\ucef1\u99f7\u4e72\u7873\u0800\u72f1, var_9_1BA:String))), i2f:float(add:int(add:int(p3:int, ldc:int(6)), xor:int(ldc:int(-31730), ldc:int(-31731)))), ldc:int(16777215), xor:int[expected:boolean](ldc:int(4230), ldc:int(4231)), invokevirtual:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2(\u3711\u6c52\ufcaf\u4bc8\ud158::\u6d99\uae87\u8aa5\u6c52\u4c2b\u88c5, invokevirtual:\u3711\u6c52\ufcaf\u4bc8\ud158(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u9033\u12b2\u516c\u97e6\u6d99\ua3b4, var_8_80:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)), var_10_1D5:\u61a4\u76bc\u0c95\u1833\u7043\u3711[expected:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa], and:int[expected:boolean](ldc:int(-26616), ldc:int(1716)), and:int(ldc:int(9513), ldc:int(-9520)), ldc:int(15728880))
                invokevirtual:void(\u61a4\u76bc\u0c95\u1833\u7043\u3711::\u52d3\ua3b4\uae87\u1833\u9a18\u51b2, var_10_1D5:\u61a4\u76bc\u0c95\u1833\u7043\u3711)
                goto(Label_0266)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u9af2\u8640\u9a18\u2dcc\u4179\ua562(\u5d20\u7043\u88c5\u5db4\uf94d.\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8) {
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
            invokevirtual:void(\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab::\u12cb\u9937\uc246\u5fe1\ubefe\u494c, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, ldc:int(7), getstatic:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f(\u6d69\u4c04\ub113\u92ff\u3e75\u12b2::\u40a9\u8709\ud523\ub171\u446c\u7e3f))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], i2d:double(add:int(p1:int, and:int(ldc:int(2953), ldc:int(-2970)))), i2d:double(add:int(p2:int, and:int(ldc:int(19580), ldc:int(-28029)))), ldc:double(0.0)), p5:int, p6:int, p7:int, p8:int))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], i2d:double(add:int(p1:int, and:int(ldc:int(-4895), ldc:int(4886)))), i2d:double(add:int(p2:int, p4:int)), ldc:double(0.0)), p5:int, p6:int, p7:int, p8:int))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], i2d:double(add:int(p1:int, p3:int)), i2d:double(add:int(p2:int, p4:int)), ldc:double(0.0)), p5:int, p6:int, p7:int, p8:int))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], i2d:double(add:int(p1:int, p3:int)), i2d:double(add:int(p2:int, and:int(ldc:int(-28841), ldc:int(28840)))), ldc:double(0.0)), p5:int, p6:int, p7:int, p8:int))
            invokevirtual:void(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\uc229\u12b2\u6cfe\u4492\u36d3\u5f50, invokestatic:\ub6ab\u8cae\u64ab\u5245\ubff1\u3711(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\u3504\ud523\u99f7\u5140\u5d20\u983f))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u61a4\uc84e\u120d\u7e3f\u647c\ubff1(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p0) {
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
            invokevirtual:void(\u51fa\u965f\u12b2\u4d85\u5654\uc7fe::\u3776\uc31c\u3e75\u156b\u71ae\u7049, getfield:\u51fa\u965f\u12b2\u4d85\u5654\uc7fe(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\ub102\ub171\ub113\u946b\ub7dc\u8258, this:\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \ub113\ufcaf\u3c25\u071d\u97b7.\u7043\uf995\u718f\ub19c\u4c2b\u4d85 \u7006\u6198\uae87\u4492\u9937\u69d9() {
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
            return:\u7043\uf995\u718f\ub19c\u4c2b\u4d85(getstatic:\u3a62\u9255\ua3b4\ud12e\u3504\u16f6[expected:\u7043\uf995\u718f\ub19c\u4c2b\u4d85](\u3a62\u9255\ua3b4\ud12e\u3504\u16f6::\u9937\u3bd6\uf94d\u9a18\u7873\u156b))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.String lambda$\u5654\u9937\u6d99\uf9c5\u3bd6\ubf56$4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p0) {
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
            return:String(invokestatic:String(String::valueOf, invokevirtual:boolean(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\ua562\u7330\u7bad\ub102\uc87f\u3bc9, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.String lambda$\u965f\u16f6\u51b2\u6bb9\u8258\uf94d$3(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p0) {
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
            return:String(invokestatic:String(String::valueOf, invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc[expected:Object](\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u416d\ud12e\u071d\u69d9\u9af2\u0b8e, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.String lambda$\ud171\u7873\uc229\u6198\ub113\u71f1$2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p0) {
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
            return:String(invokestatic:String(String::valueOf, invokevirtual:int(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\uae87\u3e75\u8df4\u3a62\u6b0d\ua562, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.String lambda$\u624e\ua6bd\u7c6b\u5140\ud158\ufcaf$1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p0) {
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
            return:String(invokestatic:String(String::valueOf, invokestatic:Object(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u7af6\u97e6\u51fa\u8df4\ub6ab\ud523, invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52[expected:Object](\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), getstatic:\u71ae\u5fe1\u0b8e\u5140\uf995\u927d(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u927d\u8cae\u516c\u4c2b\ub70c\ub1b9), newarray:Object[](java.lang.Object.class, and:int(ldc:int(-1236), ldc:int(1233))))))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.String lambda$\u12cb\u6bb9\u8389\u92ee\u74b1\uc238$0(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p0) {
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
            return:String(invokestatic:String(String::valueOf, invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52[expected:Object](\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_346 : int
        expr_6E : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_BE_0 : byte[] [generated]
        stack_C0_0 : byte[] [generated]
        stack_ED_0 : byte[] [generated]
        stack_29B_0 : byte[] [generated]
        stack_2F2_0 : byte[] [generated]
        stack_359_0 : byte[] [generated]
        var_4_27C : int
        var_3_281 : byte[]
        var_5_282 : int
        expr_29E : byte [generated]
        var_0_34F : int
        expr_359 : byte [generated]
        stack_389_2 : byte [generated]
        var_2_94 : byte[]
        expr_98 : int [generated]
        var_3_2E0 : byte[]
        var_5_2E1 : int
        expr_C0 : int [generated]
        var_3_F9 : String
        expr_101 : String[] [generated]
        expr_10B : String[] [generated]
        expr_257 : \u9af2\u1833\u156b\u12cb\u7d52\u6c52[] [generated]
        
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
        var_0_346 = and:int(ldc:int(-851806434), ldc:int(925588574))
        expr_6E = arraylength:int(stack_94_0 = stack_96_0 = stack_BE_0 = stack_C0_0 = stack_ED_0 = stack_29B_0 = stack_2F2_0 = stack_359_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("irvFwzasjNGaQ/V0z6z5EoK5T+nHBeuyKHz5v1q7w/sSktVju3zTnMXHmruqzb8O18HpsrTXmJ56ikP13b/VATR8qtGajJjFRbKyx8OoJp7NpLSorrKwu8HXz8XVw6wPjMWqu89Uw0vFmpbVuRa0rrKwu8HXz8XVw6wPjMWqu89Uw9u9msfH55y5UZy2js2YFrSusqDJqLKswdWkT7nVssU/Uq7F170+mMmo1aiqz7S7sKrRnLQZmLTHj4sXi497uQ==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_27C = expr_6E:int
        var_3_281 = newarray:byte[](byte.class, expr_6E:int)
        var_5_282 = expr_6E:int
        Label_0644:
        
        while (cmpne:boolean(and:int(var_0_346:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_346 = and:int(var_0_346:int, ldc:int(-684296294))
            var_5_282 = add:int(var_5_282:int, ldc:int(-1))
            expr_29E = add:byte(loadelement:byte(stack_29B_0:byte[], var_5_282:int), ldc:byte(72))
            storeelement:byte(var_3_281:byte[], var_5_282:int, xor:int(or:int(and:int(shl:int(expr_29E:byte, xor:int(ldc:int(20770), ldc:int(20774))), ldc:int(-16)), and:int(shr:int(expr_29E:byte[expected:int], xor:int(ldc:int(21570), ldc:int(21574))), ldc:int(15))), ldc:int(48)))
            
            if (cmpne:boolean(var_5_282:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_BE_0 = stack_C0_0 = stack_ED_0 = stack_29B_0 = stack_2F2_0 = stack_359_0 = var_3_281:byte[]
            goto(Label_0115)
        }
        
        Label_0825:
        
        while (cmpeq:boolean(and:int(var_0_346:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_34F = and:int(var_0_346:int, ldc:int(2113383803))
            var_5_282 = add:int(var_5_282:int, ldc:int(-1))
            expr_359 = loadelement:byte(stack_359_0:byte[], var_5_282:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_282:int, ldc:int(6)), neg:int(var_4_27C:int)), ldc:int(0))) {
                var_0_34F = and:int(var_0_34F:int, ldc:int(-1615630510))
                stack_389_2 = add:byte(expr_359:byte, ldc:byte(6))
            }
            else {
                stack_389_2 = add:byte(expr_359:byte, loadelement:byte(var_3_281:byte[], add:int(var_5_282:int, ldc:int(6))))
            }
            
            var_0_346 = and:int(var_0_34F:int, ldc:int(1034323098))
            storeelement:byte(var_3_281:byte[], var_5_282:int, stack_389_2:byte)
            
            if (cmpne:boolean(var_5_282:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_BE_0 = stack_C0_0 = stack_ED_0 = stack_29B_0 = stack_2F2_0 = stack_359_0 = var_3_281:byte[]
            goto(Label_0197)
        }
        
        var_0_346 = and:int(var_0_346:int, ldc:int(-1052372648))
        goto(Label_0644)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_346:int, ldc:int(67108864)), ldc:int(0))) {
            goto(Label_0197)
        }
        
        if (cmpeq:boolean(and:int(var_0_346:int, ldc:int(2)), ldc:int(0))) {
            var_0_346 = and:int(var_0_346:int, ldc:int(-407416496))
        }
        else {
            var_0_346 = and:int(var_0_346:int, ldc:int(-1645224737))
            var_2_94 = stack_94_0:byte[]
            expr_98 = add:int(arraylength:int(stack_96_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_98:int, ldc:int(0))) {
                var_3_2E0 = newarray:byte[](byte.class, expr_98:int)
                var_5_2E1 = expr_98:int
                
                loop {
                    var_0_346 = and:int(var_0_346:int, ldc:int(-5522177))
                    var_5_2E1 = add:int(var_5_2E1:int, ldc:int(-1))
                    storeelement:byte(var_3_2E0:byte[], var_5_2E1:int, add:int(shl:int(loadelement:byte(stack_2F2_0:byte[], var_5_2E1:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_94:byte[], add:int(var_5_2E1:int, xor:int(ldc:int(-32764), ldc:int(-32763)))), ldc:int(5)), xor:int(ldc:int(8961), ldc:int(8966)))))
                    
                    if (cmpne:boolean(var_5_2E1:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_BE_0 = stack_C0_0 = stack_ED_0 = stack_29B_0 = stack_2F2_0 = stack_359_0 = var_3_2E0:byte[]
            }
        }
        
        Label_0157:
        
        if (cmpeq:boolean(and:int(var_0_346:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_346 = and:int(var_0_346:int, ldc:int(862527966))
        }
        else {
            if (cmpne:boolean(and:int(var_0_346:int, ldc:int(268435456)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_346 = and:int(var_0_346:int, ldc:int(-973089122))
            expr_C0 = arraylength:int(stack_C0_0:byte[])
            
            if (cmpne:boolean(expr_C0:int, ldc:int(0))) {
                var_4_27C = expr_C0:int
                var_3_281 = newarray:byte[](byte.class, expr_C0:int)
                var_5_282 = expr_C0:int
                goto(Label_0825)
            }
        }
        
        Label_0197:
        
        if (cmpne:boolean(and:int(var_0_346:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_346 = and:int(var_0_346:int, ldc:int(-54456802))
            goto(Label_0157)
        }
        
        if (cmpeq:boolean(and:int(var_0_346:int, ldc:int(131072)), ldc:int(0))) {
            var_0_346 = and:int(var_0_346:int, ldc:int(1614295157))
            goto(Label_0115)
        }
        
        var_3_F9 = initobject:String(String::<init>, stack_ED_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        expr_101 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(223), ldc:int(3627)))
        expr_10B = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(27979), ldc:int(59)))
        storeelement:String(expr_10B:String[], xor:int(ldc:int(20736), ldc:int(20743)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, and:int(ldc:int(-7916), ldc:int(7851)), and:int(ldc:int(5835), ldc:int(31))))
        storeelement:String(expr_10B:String[], xor:int(ldc:int(24576), ldc:int(24585)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, xor:int(ldc:int(-24543), ldc:int(-24534)), xor:int(ldc:int(18451), ldc:int(18439))))
        storeelement:String(expr_10B:String[], and:int(ldc:int(8284), ldc:int(4361)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, xor:int(ldc:int(18433), ldc:int(18453)), and:int(ldc:int(4637), ldc:int(1116))))
        storeelement:String(expr_10B:String[], and:int(ldc:int(24757), ldc:int(4167)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, xor:int(ldc:int(928), ldc:int(956)), xor:int(ldc:int(16462), ldc:int(16491))))
        storeelement:String(expr_10B:String[], xor:int(ldc:int(-32445), ldc:int(-32441)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, xor:int(ldc:int(261), ldc:int(288)), xor:int(ldc:int(3137), ldc:int(3193))))
        storeelement:String(expr_10B:String[], and:int(ldc:int(8198), ldc:int(5126)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, xor:int(ldc:int(4272), ldc:int(4232)), and:int(ldc:int(7149), ldc:int(69))))
        storeelement:String(expr_10B:String[], and:int(ldc:int(35), ldc:int(4371)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, and:int(ldc:int(18005), ldc:int(2503)), xor:int(ldc:int(4135), ldc:int(4212))))
        storeelement:String(expr_10B:String[], and:int(ldc:int(29378), ldc:int(-29387)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, and:int(ldc:int(8287), ldc:int(7539)), xor:int(ldc:int(3), ldc:int(95))))
        storeelement:String(expr_10B:String[], and:int(ldc:int(197), ldc:int(24617)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, and:int(ldc:int(8540), ldc:int(2268)), and:int(ldc:int(383), ldc:int(1143))))
        storeelement:String(expr_10B:String[], xor:int(ldc:int(1088), ldc:int(1090)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, and:int(ldc:int(16503), ldc:int(8831)), and:int(ldc:int(1178), ldc:int(12954))))
        storeelement:String(expr_101:String[], xor:int(ldc:int(-32738), ldc:int(-32748)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, and:int(ldc:int(8350), ldc:int(24282)), xor:int(ldc:int(-32599), ldc:int(-32663))))
        putstatic:String[](\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\ucb79\u6d69\u64f2\u93a2\ub171\u56bd, expr_10B:String[])
        putstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\u4cd9\ud36e\u983f\u8c8a\u1187\u946b, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, loadelement:String(expr_101:String[], and:int(ldc:int(267), ldc:int(522)))))
        expr_257 = newarray:\u9af2\u1833\u156b\u12cb\u7d52\u6c52[](\ud36e\u6bb9\u960f\u4c04\u64ab.\u9af2\u1833\u156b\u12cb\u7d52\u6c52.class, and:int(ldc:int(9257), ldc:int(145)))
        storeelement:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(expr_257:\u9af2\u1833\u156b\u12cb\u7d52\u6c52[], and:int(ldc:int(-16861), ldc:int(16848)), getstatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u4492\ua562\ud158\u4492\u6bb9\ub70c::\u3d64\u3776\uc2e8\uc2bd\u8bb0\u99f7))
        putstatic:Set<\u9af2\u1833\u156b\u12cb\u7d52\u6c52>(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\u7d52\u4f52\u7043\uc246\u960f\u7e3f, invokestatic:HashSet(Sets::newHashSet, expr_257:\u9af2\u1833\u156b\u12cb\u7d52\u6c52[][expected:Object[]]))
        putstatic:boolean(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\u8753\ud171\u527a\u873d\ufe34\u7af6, and:int[expected:boolean](ldc:int(4277), ldc:int(-15542)))
    }
    
    public void \u51fa\u6c52\uc246\u97b7\u6435\u8350(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_651 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_65C : int
        
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
        var_3_651 = and:int(ldc:int(-1343879885), ldc:int(-1948361417))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(1)), ldc:int(0))) {
            var_3_651 = and:int(var_3_651:int, ldc:int(-69627081))
            var_5_81 = and:int(ldc:int(20815), ldc:int(-31056))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-18643), ldc:int(16594)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_651:int, ldc:int(-1881627))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, and:int(ldc:int(5), ldc:int(1859)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, xor:int(ldc:int(519), ldc:int(518)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_651 = and:int(var_3_D1:int, ldc:int(-1883060299))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(2064), ldc:int(2065)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(1)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-1225621564))
                        goto(Label_1507)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1353)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-1679209153))
                        goto(Label_1237)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1113)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0946)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0839)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-746864149))
                        goto(Label_0689)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-1681766105))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0839)
                        }
                    }
                    
                    Label_0390:
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(1)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-1205508312))
                        goto(Label_1507)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1353)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-1132324274))
                        goto(Label_1237)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(8)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(274419421))
                        goto(Label_1113)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-2126227272))
                        goto(Label_0946)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0839)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(384945617))
                        goto(Label_0689)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-1344956507))
                            var_11_E2 = and:int(ldc:int(-7954), ldc:int(7697))
                            goto(Label_1496)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0565:
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1507)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1117228876))
                        goto(Label_1353)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(1)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-1875730517))
                        goto(Label_1237)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1113)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0946)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0839)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(256)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-1734524047))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0390)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-1434962322))
                            loopcontinue()
                        }
                        
                        var_3_651 = and:int(var_3_651:int, ldc:int(-1881432281))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0839)
                        }
                    }
                    
                    Label_0689:
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(267617700))
                        goto(Label_1507)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(178481582))
                        goto(Label_1353)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-1577352844))
                        goto(Label_1237)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1962180390))
                        goto(Label_1113)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-788263508))
                        goto(Label_0946)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0390)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(787296765))
                            loopcontinue()
                        }
                        
                        var_3_651 = and:int(var_3_651:int, ldc:int(-1142372051))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0839:
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1507)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1353)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1237)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1113)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(8)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-539135791))
                            goto(Label_0689)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-1193346459))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0390)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_651 = and:int(var_3_651:int, ldc:int(-1143754839))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = xor:int(ldc:int(1285), ldc:int(1284))
                                goto(Label_1113)
                            }
                        }
                    }
                    
                    Label_0946:
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1507)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-867197260))
                        goto(Label_1353)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(878199877))
                        goto(Label_1237)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(96427260))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-291999783))
                            goto(Label_0839)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(32)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-1793215567))
                            goto(Label_0689)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0390)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_651 = and:int(var_3_651:int, ldc:int(-1948199557))
                        var_11_E2 = and:int(ldc:int(24817), ldc:int(-24822))
                    }
                    
                    Label_1113:
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1507)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(8)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(384856160))
                        goto(Label_1353)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-919980487))
                            goto(Label_0946)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(989353503))
                            goto(Label_0839)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0689)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(1301516119))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0390)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_651 = and:int(var_3_651:int, ldc:int(-336820237))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1353)
                            }
                        }
                    }
                    
                    Label_1237:
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1507)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_1113)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(1858063330))
                            goto(Label_0946)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-843177320))
                            goto(Label_0839)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0689)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0390)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(32)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-1141158555))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                            goto(Label_1496)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1353:
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1507)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1365778522))
                        goto(Label_1237)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1113)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(32)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-655497744))
                        goto(Label_0946)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0839)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-1631694943))
                        goto(Label_0689)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1075319655))
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(2003761906))
                        goto(Label_0390)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(33554432)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_651 = and:int(var_3_651:int, ldc:int(-1077059667))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1496:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_65C = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1507:
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1353)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1237)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(468530908))
                        goto(Label_1113)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0946)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(32)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1943400762))
                        goto(Label_0839)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-573494395))
                        goto(Label_0689)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0390)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-1345993303))
                        var_17_65C = add:int(var_16_110:int, and:int(ldc:int(8497), ldc:int(577)))
                        looporswitchbreak()
                    }
                    
                    var_3_651 = and:int(var_3_651:int, ldc:int(905060731))
                }
                
                var_3_651 = and:int(var_3_651:int, ldc:int(-1345085963))
                
                if (cmple:boolean(var_5_81 = var_17_65C:int, sub:int(var_6_88:int, xor:int(ldc:int(17040), ldc:int(17041))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(134217728)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
