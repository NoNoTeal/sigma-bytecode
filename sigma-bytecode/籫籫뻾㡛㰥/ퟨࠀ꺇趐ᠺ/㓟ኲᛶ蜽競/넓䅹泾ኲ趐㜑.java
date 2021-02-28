public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\ub113\u4179\u6cfe\u12b2\u8d90\u3711 {
    private void \ub113\u4179\u6cfe\u12b2\u8d90\u3711() {
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
            invokespecial:Object(Object::<init>, this:\ub113\u4179\u6cfe\u12b2\u8d90\u3711)
            athrow(initobject:AssertionError(AssertionError::<init>))
        }
        
        goto(Label_0006)
    }
    
    public static long[] \u873d\ub32d\u3d4b\u92ff\ub171\u7330(int p0, int p1, java.util.function.IntToLongFunction p2) {
        var_3_5F : int
        var_5_65 : long
        var_7_6C : char
        var_8_80 : int
        var_9_8B : long
        var_11_9E : long
        var_13_AE : int
        var_15_C5 : long[]
        var_16_CE : int
        var_17_EF : long
        var_19_101 : int
        var_20_10D : int
        
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
            var_3_5F = and:int(ldc:int(-822626935), ldc:int(1450513705))
            var_5_65 = sub:long(shl:long(ldc:long(1L), p0:int), ldc:long(1L))
            var_7_6C = i2c:char(div:int(ldc:int(64), p0:int))
            var_8_80 = mul:int(and:int(ldc:int(147), ldc:int(20495)), sub:int(var_7_6C:char[expected:int], xor:int(ldc:int(4152), ldc:int(4153))))
            var_9_8B = invokestatic:long(Integer::toUnsignedLong, loadelement:int(getstatic:int[](\ub113\u4179\u6cfe\u12b2\u8d90\u3711::\u3504\u071d\ud7e8\u5db4\u6cfe\u5fe1), var_8_80:int))
            var_11_9E = invokestatic:long(Integer::toUnsignedLong, loadelement:int(getstatic:int[](\ub113\u4179\u6cfe\u12b2\u8d90\u3711::\u3504\u071d\ud7e8\u5db4\u6cfe\u5fe1), add:int(var_8_80:int, and:int(ldc:int(8243), ldc:int(18625)))))
            var_13_AE = loadelement:int(getstatic:int[](\ub113\u4179\u6cfe\u12b2\u8d90\u3711::\u3504\u071d\ud7e8\u5db4\u6cfe\u5fe1), add:int(var_8_80:int, xor:int(ldc:int(17160), ldc:int(17162))))
            var_15_C5 = newarray:long[](long.class, div:int(sub:int(add:int(p1:int, var_7_6C:char[expected:int]), xor:int(ldc:int(960), ldc:int(961))), var_7_6C:char[expected:int]))
            var_16_CE = and:int(ldc:int(9097), ldc:int(-15242))
            
            loop {
                var_3_5F = and:int(var_3_5F:int, ldc:int(-696256946))
                
                if (cmpge:boolean(var_16_CE:int, p1:int)) {
                    looporswitchbreak()
                }
                
                var_17_EF = invokeinterface:long(IntToLongFunction::applyAsLong, p2:IntToLongFunction, var_16_CE:char[expected:int])
                var_19_101 = l2i:int(shr:long(shr:long(add:long(mul:long(i2l:long(var_16_CE:char[expected:int]), var_9_8B:long), var_11_9E:long), ldc:int(32)), var_13_AE:int))
                var_20_10D = mul:int(sub:char[expected:int](var_16_CE:char, mul:char(var_19_101:char, var_7_6C:char)), p0:int)
                storeelement:long(var_15_C5:long[], var_19_101:char[expected:int], or:long(and:long(loadelement:long(var_15_C5:long[], var_19_101:char[expected:int]), xor:long(shl:long(var_5_65:long, var_20_10D:int), ldc:long(-1L))), shl:long(and:long(var_17_EF:long, var_5_65:long), var_20_10D:int)))
                inc:char(var_16_CE, ldc:char(1))
            }
            
            return:long[](var_15_C5:long[])
        }
        
        goto(Label_0006)
    }
    
    public static void \u4975\ua3b4\u4e72\u760c\ufe34\u8753(int p0, int p1, long[] p2, \u47c2\u2dcc\u12cb\ud171\u8c8a.\ua068\u5f50\u416d\ud51e\u760c\u97b7 p3) {
        var_4_61 : int
        var_6_68 : long
        var_8_6F : char
        var_9_83 : int
        var_10_8E : long
        var_12_A1 : long
        var_14_B1 : int
        var_15_BA : int
        var_16_E5 : int
        
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
            var_4_61 = and:int(ldc:int(1722527080), ldc:int(-694612658))
            var_6_68 = sub:long(shl:long(ldc:long(1L), p0:int), ldc:long(1L))
            var_8_6F = i2c:char(div:int(ldc:int(64), p0:int))
            var_9_83 = mul:int(and:int(ldc:int(4811), ldc:int(17459)), sub:int(var_8_6F:char[expected:int], xor:int(ldc:int(-24576), ldc:int(-24575))))
            var_10_8E = invokestatic:long(Integer::toUnsignedLong, loadelement:int(getstatic:int[](\ub113\u4179\u6cfe\u12b2\u8d90\u3711::\u3504\u071d\ud7e8\u5db4\u6cfe\u5fe1), var_9_83:int))
            var_12_A1 = invokestatic:long(Integer::toUnsignedLong, loadelement:int(getstatic:int[](\ub113\u4179\u6cfe\u12b2\u8d90\u3711::\u3504\u071d\ud7e8\u5db4\u6cfe\u5fe1), add:int(var_9_83:int, xor:int(ldc:int(8244), ldc:int(8245)))))
            var_14_B1 = loadelement:int(getstatic:int[](\ub113\u4179\u6cfe\u12b2\u8d90\u3711::\u3504\u071d\ud7e8\u5db4\u6cfe\u5fe1), add:int(var_9_83:int, and:int(ldc:int(10786), ldc:int(20498))))
            var_15_BA = and:int(ldc:int(8268), ldc:int(-8269))
            
            loop {
                var_4_61 = and:int(var_4_61:int, ldc:int(-153512512))
                
                if (cmpge:boolean(var_15_BA:int, p1:int)) {
                    looporswitchbreak()
                }
                
                var_16_E5 = l2i:int(shr:long(shr:long(add:long(mul:long(i2l:long(var_15_BA:char[expected:int]), var_10_8E:long), var_12_A1:long), ldc:int(32)), var_14_B1:int))
                invokeinterface:void(\ua068\u5f50\u416d\ud51e\u760c\u97b7::\ub6ab\ud12e\ufcaf\u0a06\u71ae\u120d, p3:\ua068\u5f50\u416d\ud51e\u760c\u97b7, var_15_BA:char[expected:int], l2i:int(and:long(shr:long(loadelement:long(p2:long[], var_16_E5:char[expected:int]), mul:int(sub:char(var_15_BA:char, mul:char(var_16_E5:char, var_8_6F:char)), p0:int)), var_6_68:long)))
                inc:char(var_15_BA, ldc:char(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static long[] \u516c\u6cfe\u71f1\u4daf\u873d\u946b(int p0, int p1, java.util.function.IntToLongFunction p2) {
        var_3_5F : int
        var_5_65 : long
        var_7_75 : long[]
        var_8_7E : int
        var_9_B5 : long
        var_11_BB : int
        var_12_C2 : int
        var_13_DB : int
        var_14_E2 : int
        var_15_11C : int
        
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
            var_3_5F = and:int(ldc:int(-2004936795), ldc:int(-454797531))
            var_5_65 = sub:long(shl:long(ldc:long(1L), p0:int), ldc:long(1L))
            var_7_75 = newarray:long[](long.class, d2i:int(invokestatic:double(Math::ceil, div:double(i2d:double(mul:int(p1:int, p0:int)), ldc:double(64.0)))))
            var_8_7E = and:int(ldc:int(-15498), ldc:int(13449))
            
            loop {
                if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(1)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-1206020416))
                }
                else {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-571820053))
                    
                    if (cmplt:boolean(var_8_7E:int, p1:int)) {
                        var_9_B5 = invokeinterface:long(IntToLongFunction::applyAsLong, p2:IntToLongFunction, var_8_7E:int)
                        var_11_BB = mul:int(var_8_7E:int, p0:int)
                        var_12_C2 = div:int(var_11_BB:int, ldc:int(64))
                        var_13_DB = div:int(sub:int(mul:int(add:int(var_8_7E:int, xor:int(ldc:int(16388), ldc:int(16389))), p0:int), xor:int(ldc:int(2056), ldc:int(2057))), ldc:int(64))
                        var_14_E2 = rem:int(var_11_BB:int, ldc:int(64))
                        storeelement:long(var_7_75:long[], var_12_C2:int, or:long(and:long(loadelement:long(var_7_75:long[], var_12_C2:int), xor:long(shl:long(var_5_65:long, var_14_E2:int), ldc:long(-1L))), shl:long(and:long(var_9_B5:long, var_5_65:long), var_14_E2:int)))
                        
                        if (cmpne:boolean(var_12_C2:int, var_13_DB:int)) {
                            var_15_11C = sub:int(ldc:int(64), var_14_E2:int)
                            storeelement:long(var_7_75:long[], var_13_DB:int, or:long(shl:long(ushr:long(loadelement:long(var_7_75:long[], var_13_DB:int), var_15_11C:int), var_15_11C:int), shr:long(and:long(var_9_B5:long, var_5_65:long), var_15_11C:int)))
                        }
                        
                        var_3_5F = and:int(var_3_5F:int, ldc:int(-1451468885))
                        inc:int(var_8_7E, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(1)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:long[](var_7_75:long[])
        }
        
        goto(Label_0006)
    }
    
    public static void \u7af6\u647c\u3bc9\uafe7\u6bb9\u416d(int p0, int p1, long[] p2, \u47c2\u2dcc\u12cb\ud171\u8c8a.\ua068\u5f50\u416d\ud51e\u760c\u97b7 p3) {
        var_4_DF : int
        var_6_68 : long
        var_8_71 : int
        var_9_AA : int
        var_10_B1 : int
        var_11_CA : int
        var_12_D1 : int
        var_14_FB : int
        
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
            var_4_DF = and:int(ldc:int(1649769970), ldc:int(-683671636))
            var_6_68 = sub:long(shl:long(ldc:long(1L), p0:int), ldc:long(1L))
            var_8_71 = and:int(ldc:int(6636), ldc:int(-14829))
            
            loop {
                if (cmpne:boolean(and:int(var_4_DF:int, ldc:int(512)), ldc:int(0))) {
                    var_4_DF = and:int(var_4_DF:int, ldc:int(-90229632))
                }
                else {
                    var_4_DF = and:int(var_4_DF:int, ldc:int(-30051334))
                    
                    if (cmplt:boolean(var_8_71:int, p1:int)) {
                        var_9_AA = mul:int(var_8_71:int, p0:int)
                        var_10_B1 = div:int(var_9_AA:int, ldc:int(64))
                        var_11_CA = div:int(sub:int(mul:int(add:int(var_8_71:int, xor:int(ldc:int(72), ldc:int(73))), p0:int), and:int(ldc:int(18699), ldc:int(1621))), ldc:int(64))
                        var_12_D1 = rem:int(var_9_AA:int, ldc:int(64))
                        
                        if (cmpne:boolean(var_10_B1:int, var_11_CA:int)) {
                            var_4_DF = and:int(var_4_DF:int, ldc:int(-745179872))
                            var_14_FB = l2i:int(and:long(or:long(ushr:long(loadelement:long(p2:long[], var_10_B1:int), var_12_D1:int), shl:long(loadelement:long(p2:long[], var_11_CA:int), sub:int(ldc:int(64), var_12_D1:int))), var_6_68:long))
                        }
                        else {
                            var_14_FB = l2i:int(and:long(ushr:long(loadelement:long(p2:long[], var_10_B1:int), var_12_D1:int), var_6_68:long))
                        }
                        
                        var_4_DF = and:int(var_4_DF:int, ldc:int(-2082541193))
                        invokeinterface:void(\ua068\u5f50\u416d\ud51e\u760c\u97b7::\ub6ab\ud12e\ufcaf\u0a06\u71ae\u120d, p3:\ua068\u5f50\u416d\ud51e\u760c\u97b7, var_8_71:int, var_14_FB:int)
                        inc:int(var_8_71, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_4_DF:int, ldc:int(2147483647)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        expr_67 : int[] [generated]
        
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
            expr_67 = newarray:int[](int.class, and:int(ldc:int(16853), ldc:int(6880)))
            storeelement:int(expr_67:int[], and:int(ldc:int(2313), ldc:int(5187)), storeelement:int(expr_67:int[], and:int(ldc:int(-26446), ldc:int(26189)), ldc:int(-1)))
            storeelement:int(expr_67:int[], xor:int(ldc:int(144), ldc:int(146)), and:int(ldc:int(-12882), ldc:int(12881)))
            storeelement:int(expr_67:int[], and:int(ldc:int(363), ldc:int(12435)), ldc:int(-2147483648))
            storeelement:int(expr_67:int[], and:int(ldc:int(8260), ldc:int(20996)), and:int(ldc:int(20546), ldc:int(-20547)))
            storeelement:int(expr_67:int[], xor:int(ldc:int(1057), ldc:int(1060)), and:int(ldc:int(-28090), ldc:int(25000)))
            storeelement:int(expr_67:int[], ldc:int(7), storeelement:int(expr_67:int[], ldc:int(6), ldc:int(1431655765)))
            storeelement:int(expr_67:int[], ldc:int(8), and:int(ldc:int(-5494), ldc:int(4465)))
            storeelement:int(expr_67:int[], ldc:int(9), ldc:int(-2147483648))
            storeelement:int(expr_67:int[], ldc:int(10), and:int(ldc:int(-16337), ldc:int(11664)))
            storeelement:int(expr_67:int[], ldc:int(11), xor:int(ldc:int(-12287), ldc:int(-12288)))
            storeelement:int(expr_67:int[], ldc:int(13), storeelement:int(expr_67:int[], ldc:int(12), ldc:int(858993459)))
            storeelement:int(expr_67:int[], ldc:int(14), and:int(ldc:int(-28441), ldc:int(26392)))
            storeelement:int(expr_67:int[], ldc:int(16), storeelement:int(expr_67:int[], ldc:int(15), ldc:int(715827882)))
            storeelement:int(expr_67:int[], ldc:int(17), and:int(ldc:int(-13656), ldc:int(13652)))
            storeelement:int(expr_67:int[], ldc:int(19), storeelement:int(expr_67:int[], ldc:int(18), ldc:int(613566756)))
            storeelement:int(expr_67:int[], ldc:int(20), and:int(ldc:int(10522), ldc:int(-10523)))
            storeelement:int(expr_67:int[], ldc:int(21), ldc:int(-2147483648))
            storeelement:int(expr_67:int[], ldc:int(22), and:int(ldc:int(17552), ldc:int(-17553)))
            storeelement:int(expr_67:int[], ldc:int(23), and:int(ldc:int(21062), ldc:int(9507)))
            storeelement:int(expr_67:int[], ldc:int(25), storeelement:int(expr_67:int[], ldc:int(24), ldc:int(477218588)))
            storeelement:int(expr_67:int[], ldc:int(26), and:int(ldc:int(26017), ldc:int(-26022)))
            storeelement:int(expr_67:int[], ldc:int(28), storeelement:int(expr_67:int[], ldc:int(27), ldc:int(429496729)))
            storeelement:int(expr_67:int[], ldc:int(29), and:int(ldc:int(13069), ldc:int(-13072)))
            storeelement:int(expr_67:int[], ldc:int(31), storeelement:int(expr_67:int[], ldc:int(30), ldc:int(390451572)))
            storeelement:int(expr_67:int[], ldc:int(32), and:int(ldc:int(-28303), ldc:int(11912)))
            storeelement:int(expr_67:int[], ldc:int(34), storeelement:int(expr_67:int[], ldc:int(33), ldc:int(357913941)))
            storeelement:int(expr_67:int[], ldc:int(35), and:int(ldc:int(18886), ldc:int(-18888)))
            storeelement:int(expr_67:int[], ldc:int(37), storeelement:int(expr_67:int[], ldc:int(36), ldc:int(330382099)))
            storeelement:int(expr_67:int[], ldc:int(38), and:int(ldc:int(-30674), ldc:int(21265)))
            storeelement:int(expr_67:int[], ldc:int(40), storeelement:int(expr_67:int[], ldc:int(39), ldc:int(306783378)))
            storeelement:int(expr_67:int[], ldc:int(41), and:int(ldc:int(9298), ldc:int(-9299)))
            storeelement:int(expr_67:int[], ldc:int(43), storeelement:int(expr_67:int[], ldc:int(42), ldc:int(286331153)))
            storeelement:int(expr_67:int[], ldc:int(44), and:int(ldc:int(-23834), ldc:int(23833)))
            storeelement:int(expr_67:int[], ldc:int(45), ldc:int(-2147483648))
            storeelement:int(expr_67:int[], ldc:int(46), and:int(ldc:int(-12195), ldc:int(12160)))
            storeelement:int(expr_67:int[], ldc:int(47), and:int(ldc:int(13455), ldc:int(35)))
            storeelement:int(expr_67:int[], ldc:int(49), storeelement:int(expr_67:int[], ldc:int(48), ldc:int(252645135)))
            storeelement:int(expr_67:int[], ldc:int(50), and:int(ldc:int(-8423), ldc:int(8422)))
            storeelement:int(expr_67:int[], ldc:int(52), storeelement:int(expr_67:int[], ldc:int(51), ldc:int(238609294)))
            storeelement:int(expr_67:int[], ldc:int(53), and:int(ldc:int(-3304), ldc:int(2215)))
            storeelement:int(expr_67:int[], ldc:int(55), storeelement:int(expr_67:int[], ldc:int(54), ldc:int(226050910)))
            storeelement:int(expr_67:int[], ldc:int(56), and:int(ldc:int(6762), ldc:int(-6891)))
            storeelement:int(expr_67:int[], ldc:int(58), storeelement:int(expr_67:int[], ldc:int(57), ldc:int(214748364)))
            storeelement:int(expr_67:int[], ldc:int(59), and:int(ldc:int(-9138), ldc:int(9137)))
            storeelement:int(expr_67:int[], ldc:int(61), storeelement:int(expr_67:int[], ldc:int(60), ldc:int(204522252)))
            storeelement:int(expr_67:int[], ldc:int(62), and:int(ldc:int(4377), ldc:int(-15834)))
            storeelement:int(expr_67:int[], ldc:int(64), storeelement:int(expr_67:int[], ldc:int(63), ldc:int(195225786)))
            storeelement:int(expr_67:int[], ldc:int(65), and:int(ldc:int(-23463), ldc:int(22914)))
            storeelement:int(expr_67:int[], ldc:int(67), storeelement:int(expr_67:int[], ldc:int(66), ldc:int(186737708)))
            storeelement:int(expr_67:int[], ldc:int(68), and:int(ldc:int(17482), ldc:int(-19535)))
            storeelement:int(expr_67:int[], ldc:int(70), storeelement:int(expr_67:int[], ldc:int(69), ldc:int(178956970)))
            storeelement:int(expr_67:int[], ldc:int(71), and:int(ldc:int(22797), ldc:int(-22798)))
            storeelement:int(expr_67:int[], ldc:int(73), storeelement:int(expr_67:int[], ldc:int(72), ldc:int(171798691)))
            storeelement:int(expr_67:int[], ldc:int(74), and:int(ldc:int(-9936), ldc:int(9806)))
            storeelement:int(expr_67:int[], ldc:int(76), storeelement:int(expr_67:int[], ldc:int(75), ldc:int(165191049)))
            storeelement:int(expr_67:int[], ldc:int(77), and:int(ldc:int(-10054), ldc:int(1349)))
            storeelement:int(expr_67:int[], ldc:int(79), storeelement:int(expr_67:int[], ldc:int(78), ldc:int(159072862)))
            storeelement:int(expr_67:int[], ldc:int(80), and:int(ldc:int(-24799), ldc:int(24670)))
            storeelement:int(expr_67:int[], ldc:int(82), storeelement:int(expr_67:int[], ldc:int(81), ldc:int(153391689)))
            storeelement:int(expr_67:int[], ldc:int(83), and:int(ldc:int(-20975), ldc:int(20964)))
            storeelement:int(expr_67:int[], ldc:int(85), storeelement:int(expr_67:int[], ldc:int(84), ldc:int(148102320)))
            storeelement:int(expr_67:int[], ldc:int(86), and:int(ldc:int(-12181), ldc:int(3988)))
            storeelement:int(expr_67:int[], ldc:int(88), storeelement:int(expr_67:int[], ldc:int(87), ldc:int(143165576)))
            storeelement:int(expr_67:int[], ldc:int(89), and:int(ldc:int(-9307), ldc:int(1114)))
            storeelement:int(expr_67:int[], ldc:int(91), storeelement:int(expr_67:int[], ldc:int(90), ldc:int(138547332)))
            storeelement:int(expr_67:int[], ldc:int(92), and:int(ldc:int(-15513), ldc:int(15504)))
            storeelement:int(expr_67:int[], ldc:int(93), ldc:int(-2147483648))
            storeelement:int(expr_67:int[], ldc:int(94), and:int(ldc:int(5682), ldc:int(-15987)))
            storeelement:int(expr_67:int[], ldc:int(95), and:int(ldc:int(5132), ldc:int(18436)))
            storeelement:int(expr_67:int[], ldc:int(97), storeelement:int(expr_67:int[], ldc:int(96), ldc:int(130150524)))
            storeelement:int(expr_67:int[], ldc:int(98), and:int(ldc:int(12580), ldc:int(-12581)))
            storeelement:int(expr_67:int[], ldc:int(100), storeelement:int(expr_67:int[], ldc:int(99), ldc:int(126322567)))
            storeelement:int(expr_67:int[], ldc:int(101), and:int(ldc:int(19168), ldc:int(-19169)))
            storeelement:int(expr_67:int[], ldc:int(103), storeelement:int(expr_67:int[], ldc:int(102), ldc:int(122713351)))
            storeelement:int(expr_67:int[], ldc:int(104), and:int(ldc:int(-9261), ldc:int(9260)))
            storeelement:int(expr_67:int[], ldc:int(106), storeelement:int(expr_67:int[], ldc:int(105), ldc:int(119304647)))
            storeelement:int(expr_67:int[], ldc:int(107), and:int(ldc:int(-22390), ldc:int(21797)))
            storeelement:int(expr_67:int[], ldc:int(109), storeelement:int(expr_67:int[], ldc:int(108), ldc:int(116080197)))
            storeelement:int(expr_67:int[], ldc:int(110), and:int(ldc:int(-30107), ldc:int(30106)))
            storeelement:int(expr_67:int[], ldc:int(112), storeelement:int(expr_67:int[], ldc:int(111), ldc:int(113025455)))
            storeelement:int(expr_67:int[], ldc:int(113), and:int(ldc:int(-2196), ldc:int(2195)))
            storeelement:int(expr_67:int[], ldc:int(115), storeelement:int(expr_67:int[], ldc:int(114), ldc:int(110127366)))
            storeelement:int(expr_67:int[], ldc:int(116), and:int(ldc:int(-8233), ldc:int(8232)))
            storeelement:int(expr_67:int[], ldc:int(118), storeelement:int(expr_67:int[], ldc:int(117), ldc:int(107374182)))
            storeelement:int(expr_67:int[], ldc:int(119), and:int(ldc:int(2602), ldc:int(-2603)))
            storeelement:int(expr_67:int[], ldc:int(121), storeelement:int(expr_67:int[], ldc:int(120), ldc:int(104755299)))
            storeelement:int(expr_67:int[], ldc:int(122), and:int(ldc:int(9500), ldc:int(-9501)))
            storeelement:int(expr_67:int[], ldc:int(124), storeelement:int(expr_67:int[], ldc:int(123), ldc:int(102261126)))
            storeelement:int(expr_67:int[], ldc:int(125), and:int(ldc:int(-25718), ldc:int(17493)))
            storeelement:int(expr_67:int[], ldc:int(127), storeelement:int(expr_67:int[], ldc:int(126), ldc:int(99882960)))
            storeelement:int(expr_67:int[], xor:int(ldc:int(3460), ldc:int(3332)), and:int(ldc:int(-15850), ldc:int(15720)))
            storeelement:int(expr_67:int[], and:int(ldc:int(14494), ldc:int(450)), storeelement:int(expr_67:int[], xor:int(ldc:int(79), ldc:int(206)), ldc:int(97612893)))
            storeelement:int(expr_67:int[], and:int(ldc:int(19347), ldc:int(167)), and:int(ldc:int(-28151), ldc:int(27888)))
            storeelement:int(expr_67:int[], xor:int(ldc:int(2120), ldc:int(2253)), storeelement:int(expr_67:int[], xor:int(ldc:int(20543), ldc:int(20667)), ldc:int(95443717)))
            storeelement:int(expr_67:int[], xor:int(ldc:int(8297), ldc:int(8431)), and:int(ldc:int(-14226), ldc:int(13969)))
            storeelement:int(expr_67:int[], xor:int(ldc:int(24677), ldc:int(24813)), storeelement:int(expr_67:int[], xor:int(ldc:int(10766), ldc:int(10889)), ldc:int(93368854)))
            storeelement:int(expr_67:int[], and:int(ldc:int(23179), ldc:int(493)), and:int(ldc:int(24602), ldc:int(-24731)))
            storeelement:int(expr_67:int[], xor:int(ldc:int(2642), ldc:int(2777)), storeelement:int(expr_67:int[], and:int(ldc:int(11150), ldc:int(171)), ldc:int(91382282)))
            storeelement:int(expr_67:int[], xor:int(ldc:int(556), ldc:int(672)), and:int(ldc:int(-25190), ldc:int(25188)))
            storeelement:int(expr_67:int[], and:int(ldc:int(17310), ldc:int(8334)), storeelement:int(expr_67:int[], and:int(ldc:int(16557), ldc:int(9357)), ldc:int(89478485)))
            storeelement:int(expr_67:int[], xor:int(ldc:int(-30428), ldc:int(-30293)), and:int(ldc:int(-24751), ldc:int(24748)))
            storeelement:int(expr_67:int[], and:int(ldc:int(4243), ldc:int(11409)), storeelement:int(expr_67:int[], xor:int(ldc:int(4477), ldc:int(4589)), ldc:int(87652393)))
            storeelement:int(expr_67:int[], and:int(ldc:int(5330), ldc:int(10679)), and:int(ldc:int(-3828), ldc:int(3827)))
            storeelement:int(expr_67:int[], and:int(ldc:int(700), ldc:int(16532)), storeelement:int(expr_67:int[], and:int(ldc:int(22259), ldc:int(407)), ldc:int(85899345)))
            storeelement:int(expr_67:int[], and:int(ldc:int(25077), ldc:int(1685)), and:int(ldc:int(-16037), ldc:int(15908)))
            storeelement:int(expr_67:int[], and:int(ldc:int(10655), ldc:int(151)), storeelement:int(expr_67:int[], and:int(ldc:int(2198), ldc:int(214)), ldc:int(84215045)))
            storeelement:int(expr_67:int[], xor:int(ldc:int(386), ldc:int(282)), and:int(ldc:int(11309), ldc:int(-15934)))
            storeelement:int(expr_67:int[], and:int(ldc:int(3743), ldc:int(24762)), storeelement:int(expr_67:int[], and:int(ldc:int(16537), ldc:int(671)), ldc:int(82595524)))
            storeelement:int(expr_67:int[], and:int(ldc:int(18651), ldc:int(1695)), and:int(ldc:int(8646), ldc:int(-8679)))
            storeelement:int(expr_67:int[], and:int(ldc:int(735), ldc:int(6301)), storeelement:int(expr_67:int[], and:int(ldc:int(188), ldc:int(2206)), ldc:int(81037118)))
            storeelement:int(expr_67:int[], and:int(ldc:int(8350), ldc:int(22942)), and:int(ldc:int(29201), ldc:int(-29202)))
            storeelement:int(expr_67:int[], xor:int(ldc:int(495), ldc:int(335)), storeelement:int(expr_67:int[], and:int(ldc:int(8383), ldc:int(21215)), ldc:int(79536431)))
            storeelement:int(expr_67:int[], and:int(ldc:int(12449), ldc:int(2721)), and:int(ldc:int(-26666), ldc:int(26657)))
            storeelement:int(expr_67:int[], and:int(ldc:int(28395), ldc:int(419)), storeelement:int(expr_67:int[], xor:int(ldc:int(-31435), ldc:int(-31337)), ldc:int(78090314)))
            storeelement:int(expr_67:int[], and:int(ldc:int(4526), ldc:int(18084)), and:int(ldc:int(-15625), ldc:int(15624)))
            storeelement:int(expr_67:int[], xor:int(ldc:int(29), ldc:int(187)), storeelement:int(expr_67:int[], xor:int(ldc:int(17059), ldc:int(16902)), ldc:int(76695844)))
            storeelement:int(expr_67:int[], and:int(ldc:int(1207), ldc:int(8879)), and:int(ldc:int(24328), ldc:int(-24329)))
            storeelement:int(expr_67:int[], xor:int(ldc:int(1158), ldc:int(1071)), storeelement:int(expr_67:int[], xor:int(ldc:int(17875), ldc:int(17787)), ldc:int(75350303)))
            storeelement:int(expr_67:int[], xor:int(ldc:int(12288), ldc:int(12458)), and:int(ldc:int(25233), ldc:int(-26258)))
            storeelement:int(expr_67:int[], xor:int(ldc:int(-32725), ldc:int(-32633)), storeelement:int(expr_67:int[], and:int(ldc:int(683), ldc:int(3499)), ldc:int(74051160)))
            storeelement:int(expr_67:int[], xor:int(ldc:int(16752), ldc:int(16861)), and:int(ldc:int(5561), ldc:int(-22010)))
            storeelement:int(expr_67:int[], and:int(ldc:int(191), ldc:int(175)), storeelement:int(expr_67:int[], xor:int(ldc:int(-16305), ldc:int(-16159)), ldc:int(72796055)))
            storeelement:int(expr_67:int[], and:int(ldc:int(4530), ldc:int(189)), and:int(ldc:int(-24651), ldc:int(24650)))
            storeelement:int(expr_67:int[], and:int(ldc:int(1206), ldc:int(29619)), storeelement:int(expr_67:int[], and:int(ldc:int(21177), ldc:int(437)), ldc:int(71582788)))
            storeelement:int(expr_67:int[], and:int(ldc:int(4275), ldc:int(1723)), and:int(ldc:int(-948), ldc:int(945)))
            storeelement:int(expr_67:int[], and:int(ldc:int(4791), ldc:int(8437)), storeelement:int(expr_67:int[], xor:int(ldc:int(16530), ldc:int(16422)), ldc:int(70409299)))
            storeelement:int(expr_67:int[], and:int(ldc:int(503), ldc:int(7358)), and:int(ldc:int(8857), ldc:int(-25242)))
            storeelement:int(expr_67:int[], xor:int(ldc:int(-32194), ldc:int(-32122)), storeelement:int(expr_67:int[], and:int(ldc:int(183), ldc:int(24831)), ldc:int(69273666)))
            storeelement:int(expr_67:int[], and:int(ldc:int(953), ldc:int(3323)), and:int(ldc:int(-6470), ldc:int(6469)))
            storeelement:int(expr_67:int[], and:int(ldc:int(187), ldc:int(2559)), storeelement:int(expr_67:int[], and:int(ldc:int(15035), ldc:int(254)), ldc:int(68174084)))
            storeelement:int(expr_67:int[], and:int(ldc:int(9404), ldc:int(2237)), and:int(ldc:int(28772), ldc:int(-28773)))
            storeelement:int(expr_67:int[], xor:int(ldc:int(2589), ldc:int(2720)), ldc:int(-2147483648))
            storeelement:int(expr_67:int[], and:int(ldc:int(7615), ldc:int(190)), and:int(ldc:int(9257), ldc:int(-9262)))
            storeelement:int(expr_67:int[], xor:int(ldc:int(17567), ldc:int(17440)), and:int(ldc:int(2645), ldc:int(16391)))
            putstatic:int[](\ub113\u4179\u6cfe\u12b2\u8d90\u3711::\u3504\u071d\ud7e8\u5db4\u6cfe\u5fe1, expr_67:int[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7d52\uceb8\ud12e\u8cae\u156b\ud51e(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_64A : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
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
        var_3_64A = and:int(ldc:int(939113813), ldc:int(2146524181))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub113\u4179\u6cfe\u12b2\u8d90\u3711[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(65536)), ldc:int(0))) {
            var_3_64A = and:int(var_3_64A:int, ldc:int(1937599554))
            var_5_7D = and:int(ldc:int(-14787), ldc:int(14466))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-2504), ldc:int(2501)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_64A:int, ldc:int(-739395929))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(16489), ldc:int(2049)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(14417), ldc:int(1423)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_64A = and:int(var_3_D2:int, ldc:int(1946115274))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(25641), ldc:int(4101)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-826946917))
                        goto(Label_1515)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-1927089487))
                        goto(Label_1347)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1211)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1077)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0916)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0791)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(1111223116))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(124644072))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0791)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(1173761174))
                        goto(Label_1515)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1347)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(1965806921))
                        goto(Label_1211)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1077)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(441357572))
                        goto(Label_0916)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0791)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-1870318223))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(1592097885))
                            loopcontinue()
                        }
                        
                        var_3_64A = and:int(var_3_64A:int, ldc:int(1466415926))
                        var_11_E3 = and:int(ldc:int(-15095), ldc:int(8422))
                        goto(Label_1504)
                    }
                    
                    Label_0541:
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1515)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(1016986120))
                        goto(Label_1347)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(419591636))
                        goto(Label_1211)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-1097243071))
                        goto(Label_1077)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0916)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(1872456614))
                        goto(Label_0791)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(-576208))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(8)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(1878826589))
                            loopcontinue()
                        }
                        
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-478307197))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0791)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-1231045645))
                        goto(Label_1515)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1347)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1211)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(480931307))
                        goto(Label_1077)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0916)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-1302742344))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(-707161499))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-480002774))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0791:
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-1432833736))
                        goto(Label_1515)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1347)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-885785790))
                        goto(Label_1211)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-2132974278))
                        goto(Label_1077)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(-1878904803))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(8)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(1441774680))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64A = and:int(var_3_64A:int, ldc:int(804744455))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(4377), ldc:int(8769))
                                goto(Label_1077)
                            }
                        }
                    }
                    
                    Label_0916:
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1515)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(2)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(1258671218))
                        goto(Label_1347)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1211)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(1887133993))
                            goto(Label_0791)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(1758429674))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(1768344320))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(-2038288282))
                            loopcontinue()
                        }
                        
                        var_3_64A = and:int(var_3_64A:int, ldc:int(603562448))
                        var_11_E3 = and:int(ldc:int(8781), ldc:int(-8784))
                    }
                    
                    Label_1077:
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(1302188999))
                        goto(Label_1515)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-601544630))
                        goto(Label_1347)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(78785193))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0916)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(8)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(-1202342698))
                            goto(Label_0791)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(1714179835))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(24940300))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64A = and:int(var_3_64A:int, ldc:int(728192532))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1347)
                            }
                        }
                    }
                    
                    Label_1211:
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1515)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-489314676))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(1070679373))
                            goto(Label_1077)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(-1857289454))
                            goto(Label_0916)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0791)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(2)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(-1184420406))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(76581489))
                            loopcontinue()
                        }
                        
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-1485456594))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1504)
                    }
                    
                    Label_1347:
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-818770782))
                        goto(Label_1515)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-495630814))
                        goto(Label_1211)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1077)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(1231907527))
                        goto(Label_0916)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(799321815))
                        goto(Label_0791)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-458314604))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(959190442))
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-1101637148))
                        loopcontinue()
                    }
                    
                    var_3_64A = and:int(var_3_64A:int, ldc:int(334835590))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1504:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_655 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1515:
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1347)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1211)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-414135513))
                        goto(Label_1077)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0916)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(2)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-844717086))
                        goto(Label_0791)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(651543260))
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-402971381))
                        var_17_655 = add:int(var_16_111:int, and:int(ldc:int(28785), ldc:int(647)))
                        looporswitchbreak()
                    }
                }
                
                var_3_64A = and:int(var_3_64A:int, ldc:int(937637939))
                
                if (cmple:boolean(var_5_7D = var_17_655:int, sub:int(var_6_84:int, and:int(ldc:int(2887), ldc:int(17441))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_64A = and:int(var_3_64A:int, ldc:int(-1320261140))
            goto(Label_0106)
        }
    }
}
