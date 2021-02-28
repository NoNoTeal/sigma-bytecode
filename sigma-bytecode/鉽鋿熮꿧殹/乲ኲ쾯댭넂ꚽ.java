public class \u927d\u92ff\u71ae\uafe7\u6bb9.\u4e72\u12b2\ucfaf\ub32d\ub102\ua6bd {
    public void \u4e72\u12b2\ucfaf\ub32d\ub102\ua6bd(it.unimi.dsi.fastutil.objects.Object2BooleanMap<java.lang.String> p0) {
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
            invokespecial:Object(Object::<init>, this:\u4e72\u12b2\ucfaf\ub32d\ub102\ua6bd)
            putfield:Object2BooleanMap<String>(\u4e72\u12b2\ucfaf\ub32d\ub102\ua6bd::\uc229\u8c8a\u5db4\uc87f\u6b0d\ub113, this:\u4e72\u12b2\ucfaf\ub32d\ub102\ua6bd, p0:Object2BooleanMap<String>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public com.google.gson.JsonElement \u7049\u6fb0\u647c\u5654\u59ec\uc84e() {
        var_3_67 : JsonObject
        
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
            var_3_67 = initobject:JsonObject(JsonObject::<init>)
            invokeinterface:void(Object2BooleanMap::forEach, getfield:Object2BooleanMap<String>(\u4e72\u12b2\ucfaf\ub32d\ub102\ua6bd::\uc229\u8c8a\u5db4\uc87f\u6b0d\ub113, this:\u4e72\u12b2\ucfaf\ub32d\ub102\ua6bd), invokedynamic:BiConsumer<String, Boolean>(accept:(Lcom/google/gson/JsonObject;)Ljava/util/function/BiConsumer;, var_3_67:JsonObject))
            return:JsonElement(var_3_67:JsonObject)
        }
        
        goto(Label_0006)
    }
    
    public boolean test(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u6435\u0800\uae87\uc2e8\uc31c\u4e72 p0) {
        var_2_7B : int
        var_4_6E : ObjectIterator
        var_5_B0 : Object2BooleanMap$Entry
        var_6_C0 : \u6c56\u4179\u760c\u71ae\ua6bd\u2dcc
        
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
        var_2_7B = and:int(ldc:int(340046348), ldc:int(-864277537))
        var_4_6E = invokeinterface:ObjectIterator(ObjectSet::iterator, invokeinterface:ObjectSet(Object2BooleanMap::object2BooleanEntrySet, getfield:Object2BooleanMap<String>(\u4e72\u12b2\ucfaf\ub32d\ub102\ua6bd::\uc229\u8c8a\u5db4\uc87f\u6b0d\ub113, this:\u4e72\u12b2\ucfaf\ub32d\ub102\ua6bd)))
        
        loop {
            if (cmpeq:boolean(and:int(var_2_7B:int, ldc:int(128)), ldc:int(0))) {
                var_2_7B = and:int(var_2_7B:int, ldc:int(-1268456684))
                
                if (invokeinterface:boolean(Iterator::hasNext, var_4_6E:Iterator)) {
                    var_5_B0 = checkcast:Object2BooleanMap$Entry(it.unimi.dsi.fastutil.objects.Object2BooleanMap$Entry.class, invokeinterface:Object2BooleanMap$Entry(Iterator<Object2BooleanMap$Entry>::next, var_4_6E:Iterator<Object2BooleanMap$Entry>))
                    var_6_C0 = invokevirtual:\u6c56\u4179\u760c\u71ae\ua6bd\u2dcc(\u6435\u0800\uae87\uc2e8\uc31c\u4e72::\u36d3\u12cb\u2dcc\u7ce1\u6c52\u8c8a, p0:\u6435\u0800\uae87\uc2e8\uc31c\u4e72, checkcast:String(java.lang.String.class, invokeinterface:Object[expected:String](Object2BooleanMap$Entry::getKey, var_5_B0:Object2BooleanMap$Entry)))
                    
                    if (logicaland:boolean(cmpne:boolean(var_6_C0:\u6c56\u4179\u760c\u71ae\ua6bd\u2dcc, aconstnull:\u6c56\u4179\u760c\u71ae\ua6bd\u2dcc()), cmpeq:boolean(invokevirtual:boolean(\u6c56\u4179\u760c\u71ae\ua6bd\u2dcc::\u5140\u965f\u5d20\ub32d\ud523\u7006, var_6_C0:\u6c56\u4179\u760c\u71ae\ua6bd\u2dcc), invokeinterface:boolean(Object2BooleanMap$Entry::getBooleanValue, var_5_B0:Object2BooleanMap$Entry)))) {
                        var_2_7B = and:int(var_2_7B:int, ldc:int(-975805594))
                        loopcontinue()
                    }
                    
                    return:boolean(and:int[expected:boolean](ldc:int(1840), ldc:int(-3889)))
                }
            }
            
            if (cmpne:boolean(and:int(var_2_7B:int, ldc:int(4194304)), ldc:int(0))) {
                return:boolean(and:int[expected:boolean](ldc:int(149), ldc:int(1)))
            }
            
            var_2_7B = and:int(var_2_7B:int, ldc:int(1804633822))
        }
    }
    
    public boolean test(java.lang.Object p0) {
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
            return:boolean(invokevirtual:boolean(\u4e72\u12b2\ucfaf\ub32d\ub102\ua6bd::test, this:\u4e72\u12b2\ucfaf\ub32d\ub102\ua6bd, checkcast:\u6435\u0800\uae87\uc2e8\uc31c\u4e72(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u6435\u0800\uae87\uc2e8\uc31c\u4e72.class, p0:Object[expected:\u6435\u0800\uae87\uc2e8\uc31c\u4e72])))
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
    
    public void \u8df4\u8cae\ubcb0\u97e6\u3776\ub171(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_62C : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_637 : int
        
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
        var_3_62C = and:int(ldc:int(-2120463174), ldc:int(-751089253))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4e72\u12b2\ucfaf\ub32d\ub102\ua6bd[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(536870912)), ldc:int(0))) {
            var_3_62C = and:int(var_3_62C:int, ldc:int(-1269600401))
        }
        else {
            var_3_62C = and:int(var_3_62C:int, ldc:int(-1281799269))
            var_5_85 = and:int(ldc:int(28003), ldc:int(-28004))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(7880), ldc:int(-7881)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_62C:int, ldc:int(660496059))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(16388), ldc:int(16389)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(8385), ldc:int(18945)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_62C = and:int(var_3_D2:int, ldc:int(-1113621025))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(8737), ldc:int(453)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1476)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(1996071246))
                        goto(Label_1319)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1192)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(2005775880))
                        goto(Label_1049)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(162059269))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(762989723))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(1210482288))
                        goto(Label_1476)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(332807388))
                        goto(Label_1319)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1192)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1511931244))
                        goto(Label_1049)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(710101287))
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-131642829))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(4)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(-1520830242))
                            var_11_E3 = and:int(ldc:int(-12157), ldc:int(11876))
                            goto(Label_1465)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0541:
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1116002521))
                        goto(Label_1476)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1319)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1192)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(835592146))
                        goto(Label_1049)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(1604636473))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(128)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(1834070789))
                            loopcontinue()
                        }
                        
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-2116360006))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0652:
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-948523842))
                        goto(Label_1476)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1319)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1192)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(128)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1949056139))
                        goto(Label_1049)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(1215480786))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(-1796808898))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(1280287421))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62C = and:int(var_3_62C:int, ldc:int(1933560478))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(492301423))
                        goto(Label_1476)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1319)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1192)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(90552324))
                        goto(Label_1049)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(8)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(325056490))
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(16)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(-915187313))
                            loopcontinue()
                        }
                        
                        var_3_62C = and:int(var_3_62C:int, ldc:int(1799023034))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(-32607), ldc:int(-32608))
                                goto(Label_1049)
                            }
                        }
                    }
                    
                    Label_0889:
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1021285838))
                        goto(Label_1476)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1319)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1828582043))
                        goto(Label_1192)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-127827101))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(-1079978280))
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(16)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(-1482118861))
                            loopcontinue()
                        }
                        
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1713836293))
                        var_11_E3 = and:int(ldc:int(-19300), ldc:int(2659))
                    }
                    
                    Label_1049:
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1476)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1319)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(132732685))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(1453232884))
                            goto(Label_0889)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(974465552))
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(-1611547064))
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(8)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(655372777))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(2108434569))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(147667564))
                            loopcontinue()
                        }
                        
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-616771621))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1319)
                            }
                        }
                    }
                    
                    Label_1192:
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1476)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_1049)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0889)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(1272654398))
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(4)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(165415971))
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(-996856069))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(1278310191))
                            loopcontinue()
                        }
                        
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1120154722))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1465)
                    }
                    
                    Label_1319:
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1476)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(1827052392))
                        goto(Label_1192)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1958535367))
                        goto(Label_1049)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-631477157))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(16)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(750532552))
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(289765057))
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-105052963))
                        loopcontinue()
                    }
                    
                    var_3_62C = and:int(var_3_62C:int, ldc:int(2134461854))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1465:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_637 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1476:
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(128)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(103628596))
                        goto(Label_1319)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(1111137854))
                        goto(Label_1192)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1049)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(16)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(1929788994))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1309932810))
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(8)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1749194530))
                        var_17_637 = add:int(var_16_111:int, xor:int(ldc:int(768), ldc:int(769)))
                        looporswitchbreak()
                    }
                }
                
                var_3_62C = and:int(var_3_62C:int, ldc:int(1297764315))
                
                if (cmple:boolean(var_5_85 = var_17_637:int, sub:int(var_6_8C:int, xor:int(ldc:int(-24552), ldc:int(-24551))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(131072)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
