public class \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u8640\uc29a\u93a2\u071d\u59ec\u0b8e {
    public void \u8640\uc29a\u93a2\u071d\u59ec\u0b8e(\u5d20\u7043\u88c5\u5db4\uf94d.\u0c95\u67d0\u6435\u8350\u5140\u8d90 p0) {
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
            putfield:\u0c95\u67d0\u6435\u8350\u5140\u8d90(\u8640\uc29a\u93a2\u071d\u59ec\u0b8e::\u946b\u92ee\u8cae\u624e\u4d85\u6435, this:\u8640\uc29a\u93a2\u071d\u59ec\u0b8e, p0:\u0c95\u67d0\u6435\u8350\u5140\u8d90)
            invokespecial:Object(Object::<init>, this:\u8640\uc29a\u93a2\u071d\u59ec\u0b8e)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u76bc\u5f50\u9937\u8df4\uc2e8\u4e72 \u67d0\u6d69\u7af6\u59ec\u4492\u5654(java.lang.Object p0) {
        var_2_5F : int
        var_4_67 : LinkedHashMap<Object, Object>
        var_6_76 : Iterator<Object>
        
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
            var_2_5F = and:int(ldc:int(1879258553), ldc:int(2047791419))
            var_4_67 = initobject:LinkedHashMap<Object, Object>(LinkedHashMap<K, V>::<init>)
            var_6_76 = invokeinterface:Iterator(Set::iterator, checkcast:Set(java.util.Set.class, p0:Object[expected:Set<Object>]))
            
            loop {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-171253831))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_6_76:Iterator<Object>))) {
                    looporswitchbreak()
                }
                
                invokeinterface:Object(Map<Object, Object>::put, var_4_67:LinkedHashMap<Object, Object>[expected:Map<Object, Object>], invokeinterface:Object(Iterator<Object>::next, var_6_76:Iterator<Object>), aconstnull:Object())
            }
            
            return:\u76bc\u5f50\u9937\u8df4\uc2e8\u4e72(invokevirtual:\u76bc\u5f50\u9937\u8df4\uc2e8\u4e72(\u1833\u92ff\u36d3\u4492\u8c8a\u120d::\u7043\u7006\u071d\u6c52\ubb2b\u759a, getfield:\u0c95\u67d0\u6435\u8350\u5140\u8d90[expected:\u1833\u92ff\u36d3\u4492\u8c8a\u120d](\u8640\uc29a\u93a2\u071d\u59ec\u0b8e::\u946b\u92ee\u8cae\u624e\u4d85\u6435, this:\u8640\uc29a\u93a2\u071d\u59ec\u0b8e), invokevirtual:\u6c52\u8308\u4c2b\u120d\u0a06\u4179(\u0c95\u67d0\u6435\u8350\u5140\u8d90::\u965f\u3d64\uceb8\u3a62\u67d0\u0b8e, getfield:\u0c95\u67d0\u6435\u8350\u5140\u8d90(\u8640\uc29a\u93a2\u071d\u59ec\u0b8e::\u946b\u92ee\u8cae\u624e\u4d85\u6435, this:\u8640\uc29a\u93a2\u071d\u59ec\u0b8e), invokevirtual:Class<?>(Object::getClass, p0:Object), getstatic:\u6c52\u8308\u4c2b\u120d\u0a06\u4179(\u6c52\u8308\u4c2b\u120d\u0a06\u4179::\u4f4a\ubcb0\u5db4\u3e2a\u3bc9\ub7dc)), var_4_67:LinkedHashMap<Object, Object>[expected:Map<?, ?>], getstatic:\ub171\uc238\u836c\u4f4a\u9255\uc31c(\ub171\uc238\u836c\u4f4a\u9255\uc31c::\u8aa5\u16f6\ua61f\u12b2\u12cb\u120d)))
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
    
    public void \u3bc9\u3d4b\u5140\u6b0d\u3d64\u8389(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_60D : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_618 : int
        
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
        var_3_60D = and:int(ldc:int(452674512), ldc:int(-269463709))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8640\uc29a\u93a2\u071d\u59ec\u0b8e[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(2)), ldc:int(0))) {
            var_3_60D = and:int(var_3_60D:int, ldc:int(-1972676942))
        }
        else {
            var_3_60D = and:int(var_3_60D:int, ldc:int(-1104134795))
            var_5_85 = and:int(ldc:int(-18636), ldc:int(16579))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-12339), ldc:int(12338)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_60D:int, ldc:int(2146835425))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(4160), ldc:int(4161)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(5041), ldc:int(18443)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_60D = and:int(var_3_D2:int, ldc:int(-17796760))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(-16254), ldc:int(-16253)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-37560035))
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1926578360))
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1653172707))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-188315227))
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1208223806))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-289861250))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(623213892))
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1221735522))
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(648888879))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1517225293))
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1987136583))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1063530102))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-563048501))
                            var_11_E3 = and:int(ldc:int(-23863), ldc:int(23862))
                            goto(Label_1431)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0565:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-528722789))
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-344333942))
                        goto(Label_1075)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1510307496))
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(2054670298))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1592430941))
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1496710872))
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-124971519))
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(863427939))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-2093124391))
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1426227390))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0794:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-826431156))
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1144395742))
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1102221381))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(378393323))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-1517511227))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(56350438))
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-273291823))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(209), ldc:int(2821))
                                goto(Label_1075)
                            }
                        }
                    }
                    
                    Label_0921:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1164434983))
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1496979630))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1152288384))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-742393761))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(726187763))
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(2122286582))
                        var_11_E3 = and:int(ldc:int(-30515), ldc:int(29490))
                    }
                    
                    Label_1075:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1793998882))
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0921)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-1096734609))
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1447214362))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(64)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1621628199))
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-549988002))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1300)
                            }
                        }
                    }
                    
                    Label_1186:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1289302673))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_1075)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-1404886097))
                            goto(Label_0921)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-1192870924))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1869901257))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1431)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1300:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-979996583))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-917433306))
                        goto(Label_1075)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1224506995))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-2054010741))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1926339884))
                        loopcontinue()
                    }
                    
                    var_3_60D = and:int(var_3_60D:int, ldc:int(-604805637))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1431:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_618 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1442:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1603871212))
                        goto(Label_1075)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(538889631))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1801065650))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1735570519))
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1330813237))
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-562589197))
                        var_17_618 = add:int(var_16_111:int, and:int(ldc:int(65), ldc:int(6913)))
                        looporswitchbreak()
                    }
                }
                
                var_3_60D = and:int(var_3_60D:int, ldc:int(1878076365))
                
                if (cmple:boolean(var_5_85 = var_17_618:int, sub:int(var_6_8C:int, and:int(ldc:int(4297), ldc:int(10245))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
