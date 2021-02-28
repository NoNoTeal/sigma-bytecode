public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u6435\u6ec6\u67e9\u6435\ubff1\u71ae {
    public void \u6435\u6ec6\u67e9\u6435\ubff1\u71ae() {
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
            invokespecial:Object(Object::<init>, this:\u6435\u6ec6\u67e9\u6435\ubff1\u71ae)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u960f\u8709\u4975\u97e6\u59ec\u36d3(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u40a9\u36d3\u183a\u446c\u3504\ubf56[] p0, \ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u40a9\u36d3\u183a\u446c\u3504\ubf56[] p1) {
        var_2_5F : int
        var_4_67 : HashSet<String>
        var_5_70 : int
        var_2_90 : int
        var_5_9C : HashSet<\u40a9\u36d3\u183a\u446c\u3504\ubf56>
        var_6_B1 : Iterator<Object>
        var_7_F5 : \u40a9\u36d3\u183a\u446c\u3504\ubf56
        
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
            var_2_5F = and:int(ldc:int(-476346668), ldc:int(-1437999874))
            var_4_67 = initobject:HashSet<String>(HashSet<E>::<init>)
            var_5_70 = and:int(ldc:int(-3825), ldc:int(3760))
            
            loop {
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(256)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(-181172236))
                    
                    if (cmplt:boolean(var_5_70:int, arraylength:int(p1:\u40a9\u36d3\u183a\u446c\u3504\ubf56[]))) {
                        invokeinterface:boolean(Set<String>::add, var_4_67:HashSet<String>[expected:Set<String>], invokevirtual:String(\u40a9\u36d3\u183a\u446c\u3504\ubf56::\u3dd3\ufcaf\u5bc4\ua3b4\u47c2\u9937, loadelement:\u40a9\u36d3\u183a\u446c\u3504\ubf56(p1:\u40a9\u36d3\u183a\u446c\u3504\ubf56[], var_5_70:int)))
                        inc:int(var_5_70, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(32768)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_2_90 = and:int(var_2_5F:int, ldc:int(-1592400641))
            var_5_9C = initobject:HashSet<Object>[expected:Set<Object>](HashSet<Object>::<init>, invokestatic:List<\u40a9\u36d3\u183a\u446c\u3504\ubf56>[expected:Collection<?>](Arrays::asList, p0:\u40a9\u36d3\u183a\u446c\u3504\ubf56[]))
            invokeinterface:boolean(Set<E>::removeAll, var_5_9C:Set<Object>, invokestatic:List<\u40a9\u36d3\u183a\u446c\u3504\ubf56>[expected:Collection<?>](Arrays::asList, p1:\u40a9\u36d3\u183a\u446c\u3504\ubf56[]))
            var_6_B1 = invokeinterface:Iterator<Object>(Set<Object>::iterator, var_5_9C:Set<Object>)
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_6_B1:Iterator<Object>)) {
                var_7_F5 = checkcast:\u40a9\u36d3\u183a\u446c\u3504\ubf56(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u40a9\u36d3\u183a\u446c\u3504\ubf56.class, invokeinterface:\u40a9\u36d3\u183a\u446c\u3504\ubf56(Iterator<\u40a9\u36d3\u183a\u446c\u3504\ubf56>::next, var_6_B1:Iterator<\u40a9\u36d3\u183a\u446c\u3504\ubf56>))
                
                if (invokeinterface:boolean(Set<E>::contains, var_4_67:HashSet<String>[expected:Set<String>], invokevirtual:String(\u40a9\u36d3\u183a\u446c\u3504\ubf56::\u3dd3\ufcaf\u5bc4\ua3b4\u47c2\u9937, var_7_F5:\u40a9\u36d3\u183a\u446c\u3504\ubf56))) {
                    invokevirtual:void(\u40a9\u36d3\u183a\u446c\u3504\ubf56::\u446c\u0800\u3a62\u0800\ua068\ub32d, var_7_F5:\u40a9\u36d3\u183a\u446c\u3504\ubf56, getstatic:\ub7dc\u8640\u9937\u92ee\u836c\ud7e8(\ud217\u600f\u1833\u1187\ud36e\u9255::\uc29a\u0b8e\uceb8\u9937\u6bb9\u7873))
                }
                
                var_2_90 = and:int(var_2_90:int, ldc:int(-1405644838))
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
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u52d3\u3c25\u4d85\u7330\u759a\u93a2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5F7 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_602 : int
        
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
        var_3_5F7 = and:int(ldc:int(-108213578), ldc:int(-877797496))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6435\u6ec6\u67e9\u6435\ubff1\u71ae[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(4096)), ldc:int(0))) {
            var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-372323966))
            var_5_7D = and:int(ldc:int(-19644), ldc:int(17563))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(18052), ldc:int(-18381)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_5F7:int, ldc:int(-637698344))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(263), ldc:int(262)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(513), ldc:int(512)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_5F7 = and:int(var_3_CA:int, ldc:int(-67113017))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(1409), ldc:int(89)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(567782894))
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(1752470560))
                        goto(Label_0754)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(720669760))
                        goto(Label_0628)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0517)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-68163111))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0517)
                            }
                            
                            goto(Label_0754)
                        }
                    }
                    
                    Label_0373:
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(1894538309))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(823667945))
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-141944243))
                        goto(Label_0754)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0628)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-844182024))
                            var_11_DB = and:int(ldc:int(9708), ldc:int(-11758))
                            goto(Label_1439)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0517:
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(181551062))
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(908665175))
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(1152478621))
                        goto(Label_0754)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-540867307))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-604018220))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0754)
                        }
                    }
                    
                    Label_0628:
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-816120633))
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(1381505152))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-414503944))
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0517)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(128)), ldc:int(0))) {
                            var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-543986413))
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5F7 = and:int(var_3_5F7:int, ldc:int(553861162))
                            loopcontinue()
                        }
                        
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-645103991))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0754:
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(1725431689))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-465330558))
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(1737321985))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(1032460813))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-622583525))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(128)), ldc:int(0))) {
                            var_3_5F7 = and:int(var_3_5F7:int, ldc:int(184465782))
                            goto(Label_0628)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-962815967))
                            goto(Label_0517)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-573669920))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(8448), ldc:int(8449))
                                goto(Label_1043)
                            }
                        }
                    }
                    
                    Label_0889:
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-342523475))
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(1599013279))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0754)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0628)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-2037720141))
                            goto(Label_0517)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-1823205367))
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5F7 = and:int(var_3_5F7:int, ldc:int(1352588313))
                            loopcontinue()
                        }
                        
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-304152644))
                        var_11_DB = and:int(ldc:int(6232), ldc:int(-6233))
                    }
                    
                    Label_1043:
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-979055264))
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-958482732))
                            goto(Label_0889)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-310022841))
                            goto(Label_0754)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0628)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-555343344))
                            goto(Label_0517)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5F7 = and:int(var_3_5F7:int, ldc:int(1651868384))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-374519092))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1300)
                            }
                        }
                    }
                    
                    Label_1162:
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(1352859386))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-541573940))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_5F7 = and:int(var_3_5F7:int, ldc:int(290579618))
                            goto(Label_1043)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5F7 = and:int(var_3_5F7:int, ldc:int(1383586514))
                            goto(Label_0889)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0754)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-854021857))
                            goto(Label_0628)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0517)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5F7 = and:int(var_3_5F7:int, ldc:int(1159878865))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-643020367))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1439)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1300:
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(1077529469))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(1044322661))
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(110295844))
                        goto(Label_0754)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-1701266928))
                        goto(Label_0628)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-1928434338))
                        goto(Label_0517)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0373)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-2138596924))
                        loopcontinue()
                    }
                    
                    var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-572653891))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1439:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_602 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1450:
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0754)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0628)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0517)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(30686575))
                        goto(Label_0373)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-876680567))
                        var_17_602 = add:int(var_16_109:int, and:int(ldc:int(2065), ldc:int(8737)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-539202591))
                
                if (cmple:boolean(var_5_7D = var_17_602:int, sub:int(var_6_84:int, and:int(ldc:int(6145), ldc:int(16931))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(131072)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
