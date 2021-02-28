public class \u6cfe\u16f6\u4c04\u61a4\u8bb0.\ucef1\uafe7\u67e9\u5140\u4daf\u446c {
    public void \ucef1\uafe7\u67e9\u5140\u4daf\u446c() {
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
            invokespecial:Object(Object::<init>, this:\ucef1\uafe7\u67e9\u5140\u4daf\u446c)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void \u69d9\u71f1\u93a2\u120d\u97b7\u3e75(int p0, java.lang.String p1, java.lang.String[] p2) {
        var_5_64 : Dynamic<?>
        var_6_76 : int
        var_8_8C : int
        var_9_95 : int
        var_11_CA : Dynamic<?>
        
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
            var_5_64 = invokestatic:Dynamic<?>(\ucef1\uafe7\u67e9\u5140\u4daf\u446c::\uc29a\u0b8e\u64ab\u446c\u8640\u4bc8, p1:String)
            storeelement:Dynamic<?>(getstatic:Dynamic<?>[](\ucef1\uafe7\u67e9\u5140\u4daf\u446c::\u72f1\u600f\ub32d\u9a18\u3bd6\ud12e), p0:int, var_5_64:Dynamic<?>)
            var_6_76 = shr:int(p0:int, and:int(ldc:int(8199), ldc:int(4100)))
            
            if (cmpeq:boolean(loadelement:Dynamic<?>(getstatic:Dynamic<?>[](\ucef1\uafe7\u67e9\u5140\u4daf\u446c::\u3504\uc3e3\ud51e\u7bad\u960f\u51fa), var_6_76:int), aconstnull:Dynamic<?>())) {
                storeelement:Dynamic<?>(getstatic:Dynamic<?>[](\ucef1\uafe7\u67e9\u5140\u4daf\u446c::\u3504\uc3e3\ud51e\u7bad\u960f\u51fa), var_6_76:int, var_5_64:Dynamic<?>)
            }
            
            var_8_8C = arraylength:int(p2:String[])
            var_9_95 = and:int(ldc:int(-30012), ldc:int(13595))
            
            while (cmplt:boolean(var_9_95:int, var_8_8C:int)) {
                var_11_CA = invokestatic:Dynamic<?>(\ucef1\uafe7\u67e9\u5140\u4daf\u446c::\uc29a\u0b8e\u64ab\u446c\u8640\u4bc8, loadelement:String(p2:String[], var_9_95:int))
                invokeinterface:int(Object2IntMap::putIfAbsent, getstatic:Object2IntMap<String>(\ucef1\uafe7\u67e9\u5140\u4daf\u446c::\uc238\ufcaf\u4daf\u4d85\u839e\u7af6), invokevirtual:String(OptionalDynamic::asString, invokevirtual:OptionalDynamic(Dynamic::get, var_11_CA:Dynamic<?>, ldc:String("Name")), ldc:String("")), p0:int)
                invokeinterface:int(Object2IntMap::put, getstatic:Object2IntMap<Dynamic<?>>(\ucef1\uafe7\u67e9\u5140\u4daf\u446c::\ubf56\uc9f6\u5245\uc31c\ub19c\uc9f6), var_11_CA:Dynamic<?>[expected:Object], p0:int)
                inc:int(var_9_95, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void \u8cae\u8389\u92ff\ua61f\u93a2\u7330() {
        var_0_73 : int
        var_2_67 : int
        
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
            var_0_73 = and:int(ldc:int(-1925739854), ldc:int(-114602414))
            var_2_67 = and:int(ldc:int(3010), ldc:int(-8148))
            
            loop {
                if (cmpne:boolean(and:int(var_0_73:int, ldc:int(2097152)), ldc:int(0))) {
                    var_0_73 = and:int(var_0_73:int, ldc:int(-634450188))
                    
                    if (cmplt:boolean(var_2_67:int, arraylength:int(getstatic:Dynamic<?>[](\ucef1\uafe7\u67e9\u5140\u4daf\u446c::\u72f1\u600f\ub32d\u9a18\u3bd6\ud12e)))) {
                        if (cmpeq:boolean(loadelement:Dynamic<?>(getstatic:Dynamic<?>[](\ucef1\uafe7\u67e9\u5140\u4daf\u446c::\u72f1\u600f\ub32d\u9a18\u3bd6\ud12e), var_2_67:int), aconstnull:Dynamic<?>())) {
                            storeelement:Dynamic<?>(getstatic:Dynamic<?>[](\ucef1\uafe7\u67e9\u5140\u4daf\u446c::\u72f1\u600f\ub32d\u9a18\u3bd6\ud12e), var_2_67:int, loadelement:Dynamic<?>(getstatic:Dynamic<?>[](\ucef1\uafe7\u67e9\u5140\u4daf\u446c::\u3504\uc3e3\ud51e\u7bad\u960f\u51fa), shr:int(var_2_67:int, xor:int(ldc:int(358), ldc:int(354)))))
                        }
                        
                        var_0_73 = and:int(var_0_73:int, ldc:int(-945556005))
                        inc:int(var_2_67, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_0_73:int, ldc:int(131072)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_73 = and:int(var_0_73:int, ldc:int(-849799886))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static com.mojang.serialization.Dynamic<?> \u6198\uc4d2\u71f1\u93a2\uf9c5\u6b5f(com.mojang.serialization.Dynamic<?> p0) {
        var_3_69 : int
        var_4_8D : Dynamic<?>
        
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
        var_3_69 = invokeinterface:int(Object2IntMap::getInt, getstatic:Object2IntMap<Dynamic<?>>(\ucef1\uafe7\u67e9\u5140\u4daf\u446c::\ubf56\uc9f6\u5245\uc31c\ub19c\uc9f6), p0:Dynamic<?>[expected:Object])
        
        if (logicaland:boolean(cmpge:boolean(var_3_69:int, ldc:int(0)), cmplt:boolean(var_3_69:int, arraylength:int(getstatic:Dynamic<?>[](\ucef1\uafe7\u67e9\u5140\u4daf\u446c::\u72f1\u600f\ub32d\u9a18\u3bd6\ud12e))))) {
            var_4_8D = loadelement:Dynamic<?>(getstatic:Dynamic<?>[](\ucef1\uafe7\u67e9\u5140\u4daf\u446c::\u72f1\u600f\ub32d\u9a18\u3bd6\ud12e), var_3_69:int)
            return:Dynamic<?>(ternaryop:Dynamic<?>(cmpne:boolean(var_4_8D:Dynamic<?>, aconstnull:Dynamic<?>()), var_4_8D:Dynamic<?>, p0:Dynamic<?>))
        }
        
        return:Dynamic<?>(p0:Dynamic<?>)
    }
    
    public static java.lang.String \u624e\u59ec\u983f\u3776\u3504\u4cd9(java.lang.String p0) {
        var_3_69 : int
        var_4_8D : Dynamic<?>
        
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
        var_3_69 = invokeinterface:int(Object2IntMap::getInt, getstatic:Object2IntMap<String>(\ucef1\uafe7\u67e9\u5140\u4daf\u446c::\uc238\ufcaf\u4daf\u4d85\u839e\u7af6), p0:String[expected:Object])
        
        if (logicaland:boolean(cmpge:boolean(var_3_69:int, ldc:int(0)), cmplt:boolean(var_3_69:int, arraylength:int(getstatic:Dynamic<?>[](\ucef1\uafe7\u67e9\u5140\u4daf\u446c::\u72f1\u600f\ub32d\u9a18\u3bd6\ud12e))))) {
            var_4_8D = loadelement:Dynamic<?>(getstatic:Dynamic<?>[](\ucef1\uafe7\u67e9\u5140\u4daf\u446c::\u72f1\u600f\ub32d\u9a18\u3bd6\ud12e), var_3_69:int)
            return:String(ternaryop:String(cmpne:boolean(var_4_8D:Dynamic<?>, aconstnull:Dynamic<?>()), invokevirtual:String(OptionalDynamic::asString, invokevirtual:OptionalDynamic(Dynamic::get, var_4_8D:Dynamic<?>, ldc:String("Name")), ldc:String("")), p0:String))
        }
        
        return:String(p0:String)
    }
    
    public static java.lang.String \u6c56\u3776\u759a\u4492\u6fb0\u385b(int p0) {
        var_3_84 : Dynamic<?>
        
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
        
        if (logicaland:boolean(cmpge:boolean(p0:int, ldc:int(0)), cmplt:boolean(p0:int, arraylength:int(getstatic:Dynamic<?>[](\ucef1\uafe7\u67e9\u5140\u4daf\u446c::\u72f1\u600f\ub32d\u9a18\u3bd6\ud12e))))) {
            var_3_84 = loadelement:Dynamic<?>(getstatic:Dynamic<?>[](\ucef1\uafe7\u67e9\u5140\u4daf\u446c::\u72f1\u600f\ub32d\u9a18\u3bd6\ud12e), p0:int)
            return:String(ternaryop:String(cmpne:boolean(var_3_84:Dynamic<?>, aconstnull:Dynamic<?>()), invokevirtual:String(OptionalDynamic::asString, invokevirtual:OptionalDynamic(Dynamic::get, var_3_84:Dynamic<?>, ldc:String("Name")), ldc:String("")), ldc:String("minecraft:air")))
        }
        
        return:String(ldc:String("minecraft:air"))
    }
    
    public static com.mojang.serialization.Dynamic<?> \uc29a\u0b8e\u64ab\u446c\u8640\u4bc8(java.lang.String p0) {
        var_1_5F : int
        expr_65 : Dynamic [generated]
        var_3_84 : Exception
        
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
        var_1_5F = and:int(ldc:int(915459465), ldc:int(788389593))
        
        try {
            var_1_5F = and:int(var_1_5F:int, ldc:int(-2970436))
            expr_65 = initobject:Dynamic(Dynamic::<init>, getstatic:\u760c\uf995\uae5d\u446c\uceb8[expected:DynamicOps](\u760c\uf995\uae5d\u446c\uceb8::\u6d99\u8350\u9255\u8640\uf9c5\ud36e), invokestatic:\uc31c\uc87f\uc246\u3776\ub7dc[expected:Object](\u3e75\u6c52\u946b\u76bc\uc31c::\u8df4\u0b8e\u983f\u8c8a\uc9f6\u8308, invokevirtual:String(String::replace, p0:String, ldc:char(39), ldc:char(34))))
            var_1_5F = and:int(var_1_5F:int, ldc:int(1723176079))
            return:Dynamic<?>(expr_65:Dynamic)
        }
        catch (java.lang.Exception var_3_84) {
            invokeinterface:void(Logger::error, getstatic:Logger(\ucef1\uafe7\u67e9\u5140\u4daf\u446c::\u72f1\u760c\ubcb0\u385b\ud12e\u446c), ldc:String("Parsing {}"), p0:String[expected:Object], var_3_84:Exception[expected:Object])
            athrow(initobject:RuntimeException(RuntimeException::<init>, var_3_84:Exception[expected:Throwable]))
        }
    }
    
    public static com.mojang.serialization.Dynamic<?> \u3c25\ub8be\u8aa5\u836c\u12cb\u0a06(int p0) {
        var_3_61 : Dynamic<?>
        
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
            var_3_61 = aconstnull:Dynamic<?>()
            
            if (cmpge:boolean(p0:int, ldc:int(0))) {
                if (cmplt:boolean(p0:int, arraylength:int(getstatic:Dynamic<?>[](\ucef1\uafe7\u67e9\u5140\u4daf\u446c::\u72f1\u600f\ub32d\u9a18\u3bd6\ud12e)))) {
                    var_3_61 = loadelement:Dynamic<?>(getstatic:Dynamic<?>[](\ucef1\uafe7\u67e9\u5140\u4daf\u446c::\u72f1\u600f\ub32d\u9a18\u3bd6\ud12e), p0:int)
                }
            }
            
            return:Dynamic<?>(ternaryop:Dynamic<?>(cmpne:boolean(var_3_61:Dynamic<?>, aconstnull:Dynamic<?>()), var_3_61:Dynamic<?>, loadelement:Dynamic<?>(getstatic:Dynamic<?>[](\ucef1\uafe7\u67e9\u5140\u4daf\u446c::\u72f1\u600f\ub32d\u9a18\u3bd6\ud12e), and:int(ldc:int(9229), ldc:int(-9486)))))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u52d3\u56bd\ubefe\u385b\ub102\u071d$1(it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap p0) {
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
            invokevirtual:void(Object2IntOpenHashMap::defaultReturnValue, p0:Object2IntOpenHashMap, ldc:int(-1))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u3711\u1187\u9a18\u5fe1\uc3e3\u8d98$0(it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap p0) {
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
            invokevirtual:void(Object2IntOpenHashMap::defaultReturnValue, p0:Object2IntOpenHashMap, ldc:int(-1))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
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
    
    public void \uc229\u4179\u960f\u59ec\u6ec6\ub171(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_69A : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D0 : double
        var_3_E2 : int
        var_11_F3 : int
        var_14_11D : double
        var_16_121 : int
        var_12_119 : double
        var_17_6A5 : int
        
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
        var_3_69A = and:int(ldc:int(-692917962), ldc:int(-324611154))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ucef1\uafe7\u67e9\u5140\u4daf\u446c[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(2)), ldc:int(0))) {
            var_3_69A = and:int(var_3_69A:int, ldc:int(2145000592))
        }
        else {
            var_3_69A = and:int(var_3_69A:int, ldc:int(-735850201))
            var_5_8A = and:int(ldc:int(1442), ldc:int(-1443))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-30810), ldc:int(14416)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D0 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E2 = and:int(var_3_69A:int, ldc:int(-168849410))
                    var_9_D0 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F3 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F3:int, sub:int(var_6_91:int, and:int(ldc:int(45), ldc:int(257)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F3:int, and:int(ldc:int(10801), ldc:int(4109)))), var_7_A0:double))) {
                        inc:int(var_11_F3, ldc:int(1))
                    }
                    
                    var_3_69A = and:int(var_3_E2:int, ldc:int(-840726234))
                    var_14_11D = var_7_A0:double
                    var_16_121 = var_11_F3:int
                }
                else {
                    var_11_F3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(16513), ldc:int(8451)))
                    var_12_119 = var_14_11D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_121 = var_11_F3:int, var_6_91:int)) {
                        var_9_D0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F3:int)
                        var_16_121 = var_11_F3:int
                        var_14_11D = var_12_119:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-405362986))
                        goto(Label_1577)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-470885922))
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(32)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(17990667))
                        goto(Label_1322)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-950277081))
                        goto(Label_1179)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-1769659599))
                        goto(Label_0894)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(370030450))
                        goto(Label_0762)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(268525376))
                        goto(Label_0628)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(256)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-1892706785))
                    }
                    else {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-407917570))
                        
                        if (cmplt:boolean(var_16_121:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0628)
                            }
                            
                            goto(Label_0894)
                        }
                    }
                    
                    Label_0454:
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1577)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(496334824))
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(4)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(2041472529))
                        goto(Label_1322)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-1068500855))
                        goto(Label_1179)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(256)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(792480376))
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-1281201564))
                        goto(Label_0894)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0762)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(64)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(-542457426))
                            var_11_F3 = and:int(ldc:int(-12457), ldc:int(12456))
                            goto(Label_1566)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0628:
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(1111442498))
                        goto(Label_1577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(1612039487))
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(4)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-367255603))
                        goto(Label_1322)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1179)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-1859550664))
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0894)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(2)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-1116599068))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0454)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-197939401))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11D = var_9_D0:double
                            goto(Label_0894)
                        }
                    }
                    
                    Label_0762:
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-1452541830))
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1322)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1179)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(2126502886))
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0628)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(-141499039))
                            goto(Label_0454)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(64)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(-154921417))
                            loopcontinue()
                        }
                        
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-588058201))
                        var_14_11D = mul:double(ldc:double(0.5), add:double(var_9_D0:double, var_14_11D:double))
                    }
                    
                    Label_0894:
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(256)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(1150628856))
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1322)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-2023844292))
                        goto(Label_1179)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0762)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(1)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(647111132))
                            goto(Label_0628)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(-885808905))
                            goto(Label_0454)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-684985041))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F3 = xor:int(ldc:int(549), ldc:int(548))
                                goto(Label_1179)
                            }
                        }
                    }
                    
                    Label_1019:
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1322)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(1171396669))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(512)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(1500671456))
                            goto(Label_0894)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(512)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(1367076135))
                            goto(Label_0762)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(-2016286880))
                            goto(Label_0628)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0454)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-58723977))
                        var_11_F3 = and:int(ldc:int(-7045), ldc:int(7044))
                    }
                    
                    Label_1179:
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(2)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(31441680))
                        goto(Label_1577)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(1752157747))
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(1154817339))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(465496163))
                            goto(Label_1019)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(32)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(338715441))
                            goto(Label_0894)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0762)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0628)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0454)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(2)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(1888305124))
                            loopcontinue()
                        }
                        
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-555551769))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                                goto(Label_1466)
                            }
                        }
                    }
                    
                    Label_1322:
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(187123383))
                        goto(Label_1577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(32)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(-1237801130))
                            goto(Label_1179)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_1019)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0894)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(1191836224))
                            goto(Label_0762)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(-568297644))
                            goto(Label_0628)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0454)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(1256346091))
                            loopcontinue()
                        }
                        
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-973084817))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11D:double, var_5_8A:int, var_16_121:int)
                        goto(Label_1566)
                    }
                    
                    Label_1466:
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1577)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1322)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1179)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0894)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0762)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0628)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0454)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(256)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_69A = and:int(var_3_69A:int, ldc:int(-327963138))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11D:double, ldc:double(0.0))
                    Label_1566:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6A5 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1577:
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1322)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(32)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(539735869))
                        goto(Label_1179)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0894)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-47795014))
                        goto(Label_0762)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(1799774784))
                        goto(Label_0628)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0454)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-869039770))
                        var_17_6A5 = add:int(var_16_121:int, and:int(ldc:int(449), ldc:int(1025)))
                        looporswitchbreak()
                    }
                    
                    var_3_69A = and:int(var_3_69A:int, ldc:int(1583638127))
                }
                
                var_3_69A = and:int(var_3_69A:int, ldc:int(-190143193))
                
                if (cmple:boolean(var_5_8A = var_17_6A5:int, sub:int(var_6_91:int, and:int(ldc:int(171), ldc:int(8981))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(131072)), ldc:int(0))) {
            var_3_69A = and:int(var_3_69A:int, ldc:int(-466377101))
            goto(Label_0108)
        }
    }
}
