public abstract class \u392e\ud7e8\u3bc9\u88c5\ud51e.\u494c\ub171\u120d\uf9c5\u34df\u8308 {
    public void \u494c\ub171\u120d\uf9c5\u34df\u8308(java.lang.String p0, com.mojang.datafixers.schemas.Schema p1, boolean p2) {
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
            invokespecial:\ubb2b\ua61f\u8350\uf9c5\ub1b9\ufcaf(\ubb2b\ua61f\u8350\uf9c5\ub1b9\ufcaf::<init>, this:\u494c\ub171\u120d\uf9c5\u34df\u8308, p0:String, p1:Schema, p2:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.datafixers.util.Pair<java.lang.String, com.mojang.datafixers.Typed<?>> \uc910\u7006\uf9c5\u74b1\ub18d\u6c52(java.lang.String p0, com.mojang.datafixers.Typed<?> p1) {
        var_5_6F : Pair<String, Dynamic<?>>
        
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
            var_5_6F = invokevirtual:Pair<String, Dynamic<?>>(\u494c\ub171\u120d\uf9c5\u34df\u8308::\uf94d\u8c8a\ub102\ud7e8\u5bc4\uc910, this:\u494c\ub171\u120d\uf9c5\u34df\u8308, p0:String, checkcast:Dynamic(com.mojang.serialization.Dynamic.class, invokevirtual:Object[expected:Dynamic](Typed::getOrCreate, p1:Typed<?>, invokestatic:OpticFinder(DSL::remainderFinder))))
            return:Pair<String, Typed<?>>(invokestatic:Pair(Pair::of, invokevirtual:Object(Pair::getFirst, var_5_6F:Pair<String, Dynamic<?>>), invokevirtual:Typed(Typed::set, p1:Typed<?>, invokestatic:OpticFinder(DSL::remainderFinder), invokevirtual:Object(Pair::getSecond, var_5_6F:Pair<String, Dynamic<?>>))))
        }
        
        goto(Label_0006)
    }
    
    public abstract com.mojang.datafixers.util.Pair<java.lang.String, com.mojang.serialization.Dynamic<?>> \uf94d\u8c8a\ub102\ud7e8\u5bc4\uc910(java.lang.String p0, com.mojang.serialization.Dynamic<?> p1);
    
    public void \u7c6b\u6c56\u8350\u5f50\uafe7\u3d64(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_615 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_620 : int
        
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
        var_3_615 = and:int(ldc:int(627302709), ldc:int(1797891021))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u494c\ub171\u120d\uf9c5\u34df\u8308[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(256)), ldc:int(0))) {
            var_3_615 = and:int(var_3_615:int, ldc:int(-738200113))
            var_5_7D = and:int(ldc:int(11968), ldc:int(-11987))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-20887), ldc:int(20886)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_615:int, ldc:int(-1960462419))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(4129), ldc:int(19461)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(18692), ldc:int(18693)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_615 = and:int(var_3_CA:int, ldc:int(-80009795))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(-7168), ldc:int(-7167)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1273752850))
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(4)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-20322717))
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1913951794))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(4)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1154755048))
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1048080492))
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(2)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-411172899))
                    }
                    else {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1499950909))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(256)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1530563171))
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-2054312519))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(169510478))
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(526444001))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1025232869))
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(1903781341))
                            var_11_DB = and:int(ldc:int(-25921), ldc:int(25920))
                            goto(Label_1415)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0557:
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(4)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1467816762))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(-2114509827))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0644:
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(2118694299))
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(256)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(559572103))
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-669894235))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(1175016431))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(2)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-541578364))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(256)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(1951741485))
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1154405395))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(411669640))
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-662194964))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-131027226))
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(591691233))
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(421739327))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(16705), ldc:int(16704))
                                goto(Label_1043)
                            }
                        }
                    }
                    
                    Label_0889:
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-379897801))
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(2)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-518322815))
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(109389182))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-934828154))
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-1054475871))
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1108761337))
                        var_11_DB = and:int(ldc:int(26018), ldc:int(-26027))
                    }
                    
                    Label_1043:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1590158555))
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0889)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-1562910079))
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-229930323))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(2)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(547214099))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(233026933))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1284)
                            }
                        }
                    }
                    
                    Label_1154:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1166529039))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(1050926369))
                            goto(Label_1043)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0889)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(1457828302))
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(256)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(242005097))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(1109563566))
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(1642934141))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                        goto(Label_1415)
                    }
                    
                    Label_1284:
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1448293651))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-486797545))
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1639861396))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(512)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-9633388))
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(512)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-849793263))
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1073741824)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_615 = and:int(var_3_615:int, ldc:int(733832151))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1415:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_620 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1426:
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(4)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-402422426))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(68367461))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1315201469))
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-649256705))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(4)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-2065966229))
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1759785780))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-253224579))
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1231416687))
                        var_17_620 = add:int(var_16_109:int, and:int(ldc:int(1313), ldc:int(4249)))
                        looporswitchbreak()
                    }
                    
                    var_3_615 = and:int(var_3_615:int, ldc:int(-463949768))
                }
                
                var_3_615 = and:int(var_3_615:int, ldc:int(1874716623))
                
                if (cmple:boolean(var_5_7D = var_17_620:int, sub:int(var_6_84:int, xor:int(ldc:int(705), ldc:int(704))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1073741824)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
