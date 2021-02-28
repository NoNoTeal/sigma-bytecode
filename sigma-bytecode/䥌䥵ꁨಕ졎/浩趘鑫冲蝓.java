public class \u494c\u4975\ua068\u0c95\uc84e.\u6d69\u8d98\u946b\u51b2\u8753 {
    public void \u6d69\u8d98\u946b\u51b2\u8753(\u6435\ub8be\u718f\u6b0d\u67e9.\u7bad\u71ae\ua61f\ub102\u8413 p0) {
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
            invokespecial:Object(Object::<init>, this:\u6d69\u8d98\u946b\u51b2\u8753)
            putfield:\u7bad\u71ae\ua61f\ub102\u8413(\u6d69\u8d98\u946b\u51b2\u8753::\u7ce1\u071d\u3711\ufe34\u6b5f\ub8be, this:\u6d69\u8d98\u946b\u51b2\u8753, p0:\u7bad\u71ae\ua61f\ub102\u8413)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.Collection<java.lang.String> \u8308\u5fe1\uc3e3\ud51e\uc2bd\ubefe(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, java.util.function.Supplier<java.util.Collection<java.lang.String>> p1) {
        var_5_68 : List<? extends \u7d52\u718f\u3776\u6fb0\ub83f>
        var_6_7C : ArrayList
        var_7_85 : Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>
        
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
        var_5_68 = invokevirtual:List<? extends \u7d52\u718f\u3776\u6fb0\ub83f>(\u7bad\u71ae\ua61f\ub102\u8413::\ucb79\ub83f\u56bd\u7006\u6d69\u62da, getfield:\u7bad\u71ae\ua61f\ub102\u8413(\u6d69\u8d98\u946b\u51b2\u8753::\u7ce1\u071d\u3711\ufe34\u6b5f\ub8be, this:\u6d69\u8d98\u946b\u51b2\u8753), p0:\u8413\u5140\u64f2\uc9f6\u9937)
        
        if (logicalnot:boolean(invokeinterface:boolean(List::isEmpty, var_5_68:List))) {
            var_6_7C = invokestatic:ArrayList(Lists::newArrayList)
            var_7_85 = invokeinterface:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>(List<\u7d52\u718f\u3776\u6fb0\ub83f>::iterator, var_5_68:List<\u7d52\u718f\u3776\u6fb0\ub83f>)
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_7_85:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>)) {
                invokeinterface:boolean(List<String>::add, var_6_7C:ArrayList<String>[expected:List<String>], invokevirtual:String(\u7d52\u718f\u3776\u6fb0\ub83f::\u34df\u4f52\u1187\u6c52\ub1b9\uae87, checkcast:\u7d52\u718f\u3776\u6fb0\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class, invokeinterface:\u7d52\u718f\u3776\u6fb0\ub83f(Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>::next, var_7_85:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>))))
            }
            
            return:Collection<String>(var_6_7C:ArrayList<String>)
        }
        
        athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u600f\u9937\ub8be\ud171\u624e::\u56bd\u51b2\u40a9\u0a06\uff55\uf9c5)))
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
    
    public void \u8df4\u446c\u946b\u64f2\ub83f\u92ff(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_612 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_61D : int
        
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
        var_3_612 = and:int(ldc:int(1586504036), ldc:int(-46862099))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6d69\u8d98\u946b\u51b2\u8753[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_612 = and:int(var_3_612:int, ldc:int(663019301))
        }
        else {
            var_3_612 = and:int(var_3_612:int, ldc:int(-42015766))
            var_5_85 = and:int(ldc:int(-25764), ldc:int(25763))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(21770), ldc:int(-21771)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_612:int, ldc:int(1589116577))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(1667), ldc:int(33)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:boolean(0), ldc:boolean(1)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_612 = and:int(var_3_D2:int, ldc:int(-19273911))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(2469), ldc:int(16393)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(-447597128))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(838849577))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(434882478))
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(-1605028258))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(1145330741))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(-233800842))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(-615637270))
                        goto(Label_0573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(1395801945))
                    }
                    else {
                        var_3_612 = and:int(var_3_612:int, ldc:int(-594138155))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0573)
                            }
                            
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0421:
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(1)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(738765042))
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(1220478770))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(2085332129))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_612 = and:int(var_3_612:int, ldc:int(1972787838))
                            loopcontinue()
                        }
                        
                        var_3_612 = and:int(var_3_612:int, ldc:int(1603609715))
                        var_11_E3 = and:int(ldc:int(-23164), ldc:int(2635))
                        goto(Label_1439)
                    }
                    
                    Label_0573:
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(1468811289))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(-1524544018))
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(1)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(-939567247))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_612:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_612 = and:int(var_3_612:int, ldc:int(1749049731))
                            loopcontinue()
                        }
                        
                        var_3_612 = and:int(var_3_612:int, ldc:int(1568663200))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0684:
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(-1779107331))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(-1993176565))
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(1656883863))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(416079567))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_612:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_612:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_612 = and:int(var_3_612:int, ldc:int(-560596933))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0802:
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_612 = and:int(var_3_612:int, ldc:int(1973885020))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_612:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_612 = and:int(var_3_612:int, ldc:int(658574449))
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_612 = and:int(var_3_612:int, ldc:int(1547106984))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(16899), ldc:int(10317))
                                goto(Label_1051)
                            }
                        }
                    }
                    
                    Label_0897:
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(611723027))
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(-1378845849))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_612 = and:int(var_3_612:int, ldc:int(1935518437))
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_612 = and:int(var_3_612:int, ldc:int(1982615720))
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_612:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_612 = and:int(var_3_612:int, ldc:int(1556764437))
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_612:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_612 = and:int(var_3_612:int, ldc:int(-23404056))
                        var_11_E3 = and:int(ldc:int(-2650), ldc:int(2649))
                    }
                    
                    Label_1051:
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(-667664721))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(-740428228))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_612 = and:int(var_3_612:int, ldc:int(-1753056035))
                            goto(Label_0897)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_612 = and:int(var_3_612:int, ldc:int(1961302032))
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_612:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_612 = and:int(var_3_612:int, ldc:int(640308495))
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_612 = and:int(var_3_612:int, ldc:int(1892446063))
                            loopcontinue()
                        }
                        
                        var_3_612 = and:int(var_3_612:int, ldc:int(2134796978))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1316)
                            }
                        }
                    }
                    
                    Label_1178:
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(248464705))
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(2074429754))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_612:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_612 = and:int(var_3_612:int, ldc:int(-470367167))
                            goto(Label_1051)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0897)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_612 = and:int(var_3_612:int, ldc:int(497560917))
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_612 = and:int(var_3_612:int, ldc:int(1506885130))
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_612:int, ldc:int(1)), ldc:int(0))) {
                            var_3_612 = and:int(var_3_612:int, ldc:int(811419066))
                            loopcontinue()
                        }
                        
                        var_3_612 = and:int(var_3_612:int, ldc:int(2142696888))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1439)
                    }
                    
                    Label_1316:
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(-1961481138))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(-1954863779))
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(-350938005))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(-953617061))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(1)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_612 = and:int(var_3_612:int, ldc:int(1547560938))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1439:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_61D = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1450:
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(264526811))
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(-206820807))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(653053762))
                        goto(Label_0573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(1942873954))
                        goto(Label_0421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(1564457817))
                        var_17_61D = add:int(var_16_111:int, xor:int(ldc:int(8320), ldc:int(8321)))
                        looporswitchbreak()
                    }
                }
                
                var_3_612 = and:int(var_3_612:int, ldc:int(1567833417))
                
                if (cmple:boolean(var_5_85 = var_17_61D:int, sub:int(var_6_8C:int, xor:int(ldc:int(1026), ldc:int(1027))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_612:int, ldc:int(2147483647)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
