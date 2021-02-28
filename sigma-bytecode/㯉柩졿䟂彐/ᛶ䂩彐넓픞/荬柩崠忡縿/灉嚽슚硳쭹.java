public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u7049\u56bd\uc29a\u7873\ucb79 {
    public void \u7049\u56bd\uc29a\u7873\ucb79(java.util.Random p0) {
        var_4_9B : int
        var_4_B8 : int
        var_5_F7 : int
        var_6_100 : int
        
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
            invokespecial:Object(Object::<init>, this:\u7049\u56bd\uc29a\u7873\ucb79)
            putfield:int[](\u7049\u56bd\uc29a\u7873\ucb79::\u647c\u7043\u6c56\ua6bd\uafe7\u965f, this:\u7049\u56bd\uc29a\u7873\ucb79, newarray:int[](int.class, xor:int(ldc:int(16772), ldc:int(17284))))
            putfield:double(\u7049\u56bd\uc29a\u7873\ucb79::\u6198\u4f52\u5f50\uc2bd\u3bd6\u927d, this:\u7049\u56bd\uc29a\u7873\ucb79, mul:double(invokevirtual:double(Random::nextDouble, p0:Random), ldc:double(256.0)))
            putfield:double(\u7049\u56bd\uc29a\u7873\ucb79::\uc910\uc4d2\u527a\u8cae\u8413\u873d, this:\u7049\u56bd\uc29a\u7873\ucb79, mul:double(invokevirtual:double(Random::nextDouble, p0:Random), ldc:double(256.0)))
            putfield:double(\u7049\u56bd\uc29a\u7873\ucb79::\ub32d\u873d\u7330\u385b\u0800\ua068, this:\u7049\u56bd\uc29a\u7873\ucb79, mul:double(invokevirtual:double(Random::nextDouble, p0:Random), ldc:double(256.0)))
            var_4_9B = and:int(ldc:int(-16494), ldc:int(16493))
            
            while (cmplt:boolean(var_4_9B:int, xor:int(ldc:int(8197), ldc:int(8453)))) {
                storeelement:int(getfield:int[](\u7049\u56bd\uc29a\u7873\ucb79::\u647c\u7043\u6c56\ua6bd\uafe7\u965f, this:\u7049\u56bd\uc29a\u7873\ucb79), var_4_9B:int, postincrement:int(1, var_4_9B:int))
            }
            
            var_4_B8 = and:int(ldc:int(2522), ldc:int(-3035))
            
            while (cmplt:boolean(var_4_B8:int, xor:int(ldc:int(-16199), ldc:int(-15943)))) {
                var_5_F7 = invokevirtual:int(Random::nextInt, p0:Random, sub:int(xor:int(ldc:int(18678), ldc:int(18934)), var_4_B8:int))
                var_6_100 = loadelement:int(getfield:int[](\u7049\u56bd\uc29a\u7873\ucb79::\u647c\u7043\u6c56\ua6bd\uafe7\u965f, this:\u7049\u56bd\uc29a\u7873\ucb79), var_4_B8:int)
                storeelement:int(getfield:int[](\u7049\u56bd\uc29a\u7873\ucb79::\u647c\u7043\u6c56\ua6bd\uafe7\u965f, this:\u7049\u56bd\uc29a\u7873\ucb79), var_4_B8:int, loadelement:int(getfield:int[](\u7049\u56bd\uc29a\u7873\ucb79::\u647c\u7043\u6c56\ua6bd\uafe7\u965f, this:\u7049\u56bd\uc29a\u7873\ucb79), add:int(var_5_F7:int, var_4_B8:int)))
                storeelement:int(getfield:int[](\u7049\u56bd\uc29a\u7873\ucb79::\u647c\u7043\u6c56\ua6bd\uafe7\u965f, this:\u7049\u56bd\uc29a\u7873\ucb79), add:int(var_5_F7:int, var_4_B8:int), var_6_100:int)
                inc:int(var_4_B8, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private int \u16f6\u4492\u385b\uf94d\u873d\uc910(int p0) {
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
            return:int(loadelement:int(getfield:int[](\u7049\u56bd\uc29a\u7873\ucb79::\u647c\u7043\u6c56\ua6bd\uafe7\u965f, this:\u7049\u56bd\uc29a\u7873\ucb79), and:int(p0:int, and:int(ldc:int(8959), ldc:int(6655)))))
        }
        
        goto(Label_0006)
    }
    
    public static double \u9255\u494c\u6b0d\u5654\u7049\u3776(int[] p0, double p1, double p2, double p3) {
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
            return:double(add:double(add:double(mul:double(i2d:double(loadelement:int(p0:int[], and:int(ldc:int(-22734), ldc:int(6348)))), p1:double), mul:double(i2d:double(loadelement:int(p0:int[], and:int(ldc:int(6177), ldc:int(8577)))), p2:double)), mul:double(i2d:double(loadelement:int(p0:int[], xor:int(ldc:int(9216), ldc:int(9218)))), p3:double)))
        }
        
        goto(Label_0006)
    }
    
    private double \ud523\u7d52\u76bc\ufcaf\u7006\u6ec6(int p0, double p1, double p2, double p3, double p4) {
        var_10_61 : int
        var_12_75 : double
        var_12_8A : double
        var_14_9F : double
        
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
            var_10_61 = and:int(ldc:int(1259219857), ldc:int(1262152431))
            var_12_75 = sub:double(sub:double(sub:double(p4:double, mul:double(p1:double, p1:double)), mul:double(p2:double, p2:double)), mul:double(p3:double, p3:double))
            
            if (cmpge:boolean(var_12_75:double, ldc:double(0.0))) {
                var_10_61 = and:int(var_10_61:int, ldc:int(1768144839))
                var_12_8A = mul:double(var_12_75:double, var_12_75:double)
                var_14_9F = mul:double(mul:double(var_12_8A:double, var_12_8A:double), invokestatic:double(\u7049\u56bd\uc29a\u7873\ucb79::\u9255\u494c\u6b0d\u5654\u7049\u3776, loadelement:int[](getstatic:int[][](\u7049\u56bd\uc29a\u7873\ucb79::\u4ab3\u8df4\u51b2\u7043\ubefe\ufe34), p0:int), p1:double, p2:double, p3:double))
            }
            else {
                var_14_9F = ldc:double(0.0)
            }
            
            return:double(var_14_9F:double)
        }
        
        goto(Label_0006)
    }
    
    public double \u9937\ufe34\u6c56\u6c56\u4179\uc31c(double p0, double p1) {
        var_5_61 : int
        var_7_6A : double
        var_9_73 : int
        var_10_7C : int
        var_11_88 : double
        var_13_90 : double
        var_15_98 : double
        var_17_9E : double
        var_19_A4 : double
        var_21_BC : int
        var_22_C5 : int
        var_23_F1 : double
        var_25_FD : double
        var_27_10B : double
        var_29_119 : double
        var_31_125 : int
        var_32_131 : int
        
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
            var_5_61 = and:int(ldc:int(416319522), ldc:int(1413056994))
            var_7_6A = mul:double(add:double(p0:double, p1:double), getstatic:double(\u7049\u56bd\uc29a\u7873\ucb79::\u1187\uc7fe\u99f7\u7873\u3d64\u960f))
            var_9_73 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, add:double(p0:double, var_7_6A:double))
            var_10_7C = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, add:double(p1:double, var_7_6A:double))
            var_11_88 = mul:double(i2d:double(add:int(var_9_73:int, var_10_7C:int)), getstatic:double(\u7049\u56bd\uc29a\u7873\ucb79::\u9af2\u946b\ud12e\u0800\u5db4\u7d52))
            var_13_90 = sub:double(i2d:double(var_9_73:int), var_11_88:double)
            var_15_98 = sub:double(i2d:double(var_10_7C:int), var_11_88:double)
            var_17_9E = sub:double(p0:double, var_13_90:double)
            var_19_A4 = sub:double(p1:double, var_15_98:double)
            
            if (cmple:boolean(var_17_9E:double, var_19_A4:double)) {
                var_5_61 = and:int(var_5_61:int, ldc:int(1412910335))
                var_21_BC = and:int(ldc:int(-30675), ldc:int(22466))
                var_22_C5 = and:int(ldc:int(26631), ldc:int(1289))
            }
            else {
                var_21_BC = and:int(ldc:int(26881), ldc:int(5689))
                var_22_C5 = and:int(ldc:int(-14093), ldc:int(1804))
            }
            
            var_23_F1 = add:double(sub:double(var_17_9E:double, i2d:double(var_21_BC:int)), getstatic:double(\u7049\u56bd\uc29a\u7873\ucb79::\u9af2\u946b\ud12e\u0800\u5db4\u7d52))
            var_25_FD = add:double(sub:double(var_19_A4:double, i2d:double(var_22_C5:int)), getstatic:double(\u7049\u56bd\uc29a\u7873\ucb79::\u9af2\u946b\ud12e\u0800\u5db4\u7d52))
            var_27_10B = add:double(sub:double(var_17_9E:double, ldc:double(1.0)), mul:double(ldc:double(2.0), getstatic:double(\u7049\u56bd\uc29a\u7873\ucb79::\u9af2\u946b\ud12e\u0800\u5db4\u7d52)))
            var_29_119 = add:double(sub:double(var_19_A4:double, ldc:double(1.0)), mul:double(ldc:double(2.0), getstatic:double(\u7049\u56bd\uc29a\u7873\ucb79::\u9af2\u946b\ud12e\u0800\u5db4\u7d52)))
            var_31_125 = and:int(var_9_73:int, and:int(ldc:int(8447), ldc:int(5375)))
            var_32_131 = and:int(var_10_7C:int, xor:int(ldc:int(-32667), ldc:int(-32614)))
            return:double(mul:double(ldc:double(70.0), add:double(add:double(invokespecial:double(\u7049\u56bd\uc29a\u7873\ucb79::\ud523\u7d52\u76bc\ufcaf\u7006\u6ec6, this:\u7049\u56bd\uc29a\u7873\ucb79, rem:int(invokespecial:int(\u7049\u56bd\uc29a\u7873\ucb79::\u16f6\u4492\u385b\uf94d\u873d\uc910, this:\u7049\u56bd\uc29a\u7873\ucb79, add:int(var_31_125:int, invokespecial:int(\u7049\u56bd\uc29a\u7873\ucb79::\u16f6\u4492\u385b\uf94d\u873d\uc910, this:\u7049\u56bd\uc29a\u7873\ucb79, var_32_131:int))), ldc:int(12)), var_17_9E:double, var_19_A4:double, ldc:double(0.0), ldc:double(0.5)), invokespecial:double(\u7049\u56bd\uc29a\u7873\ucb79::\ud523\u7d52\u76bc\ufcaf\u7006\u6ec6, this:\u7049\u56bd\uc29a\u7873\ucb79, rem:int(invokespecial:int(\u7049\u56bd\uc29a\u7873\ucb79::\u16f6\u4492\u385b\uf94d\u873d\uc910, this:\u7049\u56bd\uc29a\u7873\ucb79, add:int(add:int(var_31_125:int, var_21_BC:int), invokespecial:int(\u7049\u56bd\uc29a\u7873\ucb79::\u16f6\u4492\u385b\uf94d\u873d\uc910, this:\u7049\u56bd\uc29a\u7873\ucb79, add:int(var_32_131:int, var_22_C5:int)))), ldc:int(12)), var_23_F1:double, var_25_FD:double, ldc:double(0.0), ldc:double(0.5))), invokespecial:double(\u7049\u56bd\uc29a\u7873\ucb79::\ud523\u7d52\u76bc\ufcaf\u7006\u6ec6, this:\u7049\u56bd\uc29a\u7873\ucb79, rem:int(invokespecial:int(\u7049\u56bd\uc29a\u7873\ucb79::\u16f6\u4492\u385b\uf94d\u873d\uc910, this:\u7049\u56bd\uc29a\u7873\ucb79, add:int(add:int(var_31_125:int, and:int(ldc:int(193), ldc:int(16953))), invokespecial:int(\u7049\u56bd\uc29a\u7873\ucb79::\u16f6\u4492\u385b\uf94d\u873d\uc910, this:\u7049\u56bd\uc29a\u7873\ucb79, add:int(var_32_131:int, xor:int(ldc:int(2433), ldc:int(2432)))))), ldc:int(12)), var_27_10B:double, var_29_119:double, ldc:double(0.0), ldc:double(0.5)))))
        }
        
        goto(Label_0006)
    }
    
    public double \uc910\u40a9\ubefe\u64f2\u40a9\u446c(double p0, double p1, double p2) {
        var_7_196 : int
        var_11_72 : double
        var_13_7B : int
        var_14_84 : int
        var_15_8E : int
        var_18_A2 : double
        var_20_AA : double
        var_22_B2 : double
        var_24_BA : double
        var_26_C0 : double
        var_28_C6 : double
        var_30_CD : double
        var_32_19F : int
        var_33_1A8 : int
        var_34_1B1 : int
        var_35_1BA : int
        var_36_1C3 : int
        var_37_1CC : int
        var_38_396 : double
        var_40_3A2 : double
        var_42_3AE : double
        var_44_3BA : double
        var_46_3C6 : double
        var_48_3D2 : double
        var_50_3DC : double
        var_52_3E6 : double
        var_54_3F0 : double
        var_56_3FC : int
        var_57_408 : int
        var_58_414 : int
        
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
            var_7_196 = and:int(ldc:int(-442789094), ldc:int(-40914957))
            var_11_72 = mul:double(add:double(add:double(p0:double, p1:double), p2:double), ldc:double(0.3333333333333333))
            var_13_7B = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, add:double(p0:double, var_11_72:double))
            var_14_84 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, add:double(p1:double, var_11_72:double))
            var_15_8E = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, add:double(p2:double, var_11_72:double))
            var_18_A2 = mul:double(i2d:double(add:int(add:int(var_13_7B:int, var_14_84:int), var_15_8E:int)), ldc:double(0.16666666666666666))
            var_20_AA = sub:double(i2d:double(var_13_7B:int), var_18_A2:double)
            var_22_B2 = sub:double(i2d:double(var_14_84:int), var_18_A2:double)
            var_24_BA = sub:double(i2d:double(var_15_8E:int), var_18_A2:double)
            var_26_C0 = sub:double(p0:double, var_20_AA:double)
            var_28_C6 = sub:double(p1:double, var_22_B2:double)
            var_30_CD = sub:double(p2:double, var_24_BA:double)
            
            if (cmpge:boolean(var_26_C0:double, var_28_C6:double)) {
                if (cmplt:boolean(var_28_C6:double, var_30_CD:double)) {
                    goto(Label_0477)
                }
                
                var_32_19F = and:int(ldc:int(171), ldc:int(18945))
                var_33_1A8 = and:int(ldc:int(-30203), ldc:int(9394))
                var_34_1B1 = and:int(ldc:int(9643), ldc:int(-9644))
                var_35_1BA = xor:int(ldc:int(1280), ldc:int(1281))
                var_36_1C3 = xor:int(ldc:int(1152), ldc:int(1153))
                var_37_1CC = and:int(ldc:int(20585), ldc:int(-31598))
                goto(Label_0901)
            }
            
            Label_0215:
            
            if (cmpne:boolean(and:int(var_7_196:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0544)
            }
            
            if (cmpeq:boolean(and:int(var_7_196:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_0477)
            }
            
            if (cmpeq:boolean(and:int(var_7_196:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_0339)
            }
            
            if (cmpne:boolean(and:int(var_7_196:int, ldc:int(16)), ldc:int(0))) {
                var_7_196 = and:int(var_7_196:int, ldc:int(-304369934))
                
                if (cmplt:boolean(var_28_C6:double, var_30_CD:double)) {
                    var_32_19F = and:int(ldc:int(19687), ldc:int(-28144))
                    var_33_1A8 = and:int(ldc:int(-25433), ldc:int(24920))
                    var_34_1B1 = xor:int(ldc:int(96), ldc:int(97))
                    var_35_1BA = and:int(ldc:int(1367), ldc:int(-1400))
                    var_36_1C3 = and:int(ldc:int(1073), ldc:int(20487))
                    var_37_1CC = xor:int(ldc:int(85), ldc:int(84))
                    goto(Label_0901)
                }
            }
            
            Label_0262:
            
            if (cmpne:boolean(and:int(var_7_196:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0544)
            }
            
            if (cmpeq:boolean(and:int(var_7_196:int, ldc:int(67108864)), ldc:int(0))) {
                var_7_196 = and:int(var_7_196:int, ldc:int(-1963566416))
                goto(Label_0477)
            }
            
            if (cmpne:boolean(and:int(var_7_196:int, ldc:int(128)), ldc:int(0))) {
                var_7_196 = and:int(var_7_196:int, ldc:int(-1627724523))
            }
            else {
                if (cmpeq:boolean(and:int(var_7_196:int, ldc:int(8388608)), ldc:int(0))) {
                    var_7_196 = and:int(var_7_196:int, ldc:int(-172117717))
                    goto(Label_0215)
                }
                
                var_7_196 = and:int(var_7_196:int, ldc:int(-405426305))
                
                if (cmplt:boolean(var_26_C0:double, var_30_CD:double)) {
                    var_32_19F = and:int(ldc:int(1498), ldc:int(-17884))
                    var_33_1A8 = and:int(ldc:int(4673), ldc:int(18849))
                    var_34_1B1 = and:int(ldc:int(2734), ldc:int(-20207))
                    var_35_1BA = and:int(ldc:int(-2796), ldc:int(2667))
                    var_36_1C3 = xor:int(ldc:int(2056), ldc:int(2057))
                    var_37_1CC = xor:int(ldc:int(688), ldc:int(689))
                    goto(Label_0901)
                }
            }
            
            Label_0339:
            
            if (cmpne:boolean(and:int(var_7_196:int, ldc:int(1)), ldc:int(0))) {
                var_7_196 = and:int(var_7_196:int, ldc:int(624136434))
                goto(Label_0544)
            }
            
            if (cmpeq:boolean(and:int(var_7_196:int, ldc:int(1073741824)), ldc:int(0))) {
                var_7_196 = and:int(var_7_196:int, ldc:int(-299422907))
            }
            else {
                if (cmpeq:boolean(and:int(var_7_196:int, ldc:int(2)), ldc:int(0))) {
                    var_7_196 = and:int(var_7_196:int, ldc:int(-1127119609))
                    goto(Label_0262)
                }
                
                if (cmpeq:boolean(and:int(var_7_196:int, ldc:int(16384)), ldc:int(0))) {
                    var_7_196 = and:int(var_7_196:int, ldc:int(-170798218))
                    var_32_19F = and:int(ldc:int(17780), ldc:int(-17781))
                    var_33_1A8 = and:int(ldc:int(16465), ldc:int(15105))
                    var_34_1B1 = and:int(ldc:int(2082), ldc:int(-2083))
                    var_35_1BA = and:int(ldc:int(19473), ldc:int(8781))
                    var_36_1C3 = xor:int(ldc:int(-16312), ldc:int(-16311))
                    var_37_1CC = and:int(ldc:int(31239), ldc:int(-31248))
                    goto(Label_0901)
                }
                
                goto(Label_0215)
            }
            
            Label_0477:
            
            if (cmpne:boolean(and:int(var_7_196:int, ldc:int(65536)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_7_196:int, ldc:int(67108864)), ldc:int(0))) {
                    var_7_196 = and:int(var_7_196:int, ldc:int(1649163993))
                    goto(Label_0339)
                }
                
                if (cmpeq:boolean(and:int(var_7_196:int, ldc:int(67108864)), ldc:int(0))) {
                    var_7_196 = and:int(var_7_196:int, ldc:int(-1479617154))
                    goto(Label_0262)
                }
                
                if (cmpeq:boolean(and:int(var_7_196:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_0215)
                }
                
                var_7_196 = and:int(var_7_196:int, ldc:int(-172625122))
                
                if (cmpge:boolean(var_26_C0:double, var_30_CD:double)) {
                    var_32_19F = and:int(ldc:int(20515), ldc:int(8473))
                    var_33_1A8 = and:int(ldc:int(-29419), ldc:int(28898))
                    var_34_1B1 = and:int(ldc:int(9390), ldc:int(-9391))
                    var_35_1BA = xor:int(ldc:int(1040), ldc:int(1041))
                    var_36_1C3 = and:int(ldc:int(462), ldc:int(-16864))
                    var_37_1CC = and:int(ldc:int(10801), ldc:int(5571))
                    goto(Label_0901)
                }
            }
            
            Label_0544:
            
            if (cmpne:boolean(and:int(var_7_196:int, ldc:int(268435456)), ldc:int(0))) {
                goto(Label_0477)
            }
            
            if (cmpne:boolean(and:int(var_7_196:int, ldc:int(262144)), ldc:int(0))) {
                var_7_196 = and:int(var_7_196:int, ldc:int(-969481782))
                goto(Label_0339)
            }
            
            if (cmpeq:boolean(and:int(var_7_196:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0262)
            }
            
            if (cmpeq:boolean(and:int(var_7_196:int, ldc:int(32768)), ldc:int(0))) {
                var_7_196 = and:int(var_7_196:int, ldc:int(1755589859))
                goto(Label_0215)
            }
            
            var_7_196 = and:int(var_7_196:int, ldc:int(-173692330))
            var_32_19F = and:int(ldc:int(5319), ldc:int(-5320))
            var_33_1A8 = and:int(ldc:int(-1762), ldc:int(1761))
            var_34_1B1 = xor:int(ldc:int(-27616), ldc:int(-27615))
            var_35_1BA = and:int(ldc:int(4361), ldc:int(18003))
            var_36_1C3 = and:int(ldc:int(21712), ldc:int(-22001))
            var_37_1CC = xor:int(ldc:int(1542), ldc:int(1543))
            Label_0901:
            var_38_396 = add:double(sub:double(var_26_C0:double, i2d:double(var_32_19F:int)), ldc:double(0.16666666666666666))
            var_40_3A2 = add:double(sub:double(var_28_C6:double, i2d:double(var_33_1A8:int)), ldc:double(0.16666666666666666))
            var_42_3AE = add:double(sub:double(var_30_CD:double, i2d:double(var_34_1B1:int)), ldc:double(0.16666666666666666))
            var_44_3BA = add:double(sub:double(var_26_C0:double, i2d:double(var_35_1BA:int)), ldc:double(0.3333333333333333))
            var_46_3C6 = add:double(sub:double(var_28_C6:double, i2d:double(var_36_1C3:int)), ldc:double(0.3333333333333333))
            var_48_3D2 = add:double(sub:double(var_30_CD:double, i2d:double(var_37_1CC:int)), ldc:double(0.3333333333333333))
            var_50_3DC = add:double(sub:double(var_26_C0:double, ldc:double(1.0)), ldc:double(0.5))
            var_52_3E6 = add:double(sub:double(var_28_C6:double, ldc:double(1.0)), ldc:double(0.5))
            var_54_3F0 = add:double(sub:double(var_30_CD:double, ldc:double(1.0)), ldc:double(0.5))
            var_56_3FC = and:int(var_13_7B:int, xor:int(ldc:int(12329), ldc:int(12502)))
            var_57_408 = and:int(var_14_84:int, and:int(ldc:int(9215), ldc:int(17663)))
            var_58_414 = and:int(var_15_8E:int, and:int(ldc:int(18687), ldc:int(2047)))
            return:double(mul:double(ldc:double(32.0), add:double(add:double(add:double(invokespecial:double(\u7049\u56bd\uc29a\u7873\ucb79::\ud523\u7d52\u76bc\ufcaf\u7006\u6ec6, this:\u7049\u56bd\uc29a\u7873\ucb79, rem:int(invokespecial:int(\u7049\u56bd\uc29a\u7873\ucb79::\u16f6\u4492\u385b\uf94d\u873d\uc910, this:\u7049\u56bd\uc29a\u7873\ucb79, add:int(var_56_3FC:int, invokespecial:int(\u7049\u56bd\uc29a\u7873\ucb79::\u16f6\u4492\u385b\uf94d\u873d\uc910, this:\u7049\u56bd\uc29a\u7873\ucb79, add:int(var_57_408:int, invokespecial:int(\u7049\u56bd\uc29a\u7873\ucb79::\u16f6\u4492\u385b\uf94d\u873d\uc910, this:\u7049\u56bd\uc29a\u7873\ucb79, var_58_414:int))))), ldc:int(12)), var_26_C0:double, var_28_C6:double, var_30_CD:double, ldc:double(0.6)), invokespecial:double(\u7049\u56bd\uc29a\u7873\ucb79::\ud523\u7d52\u76bc\ufcaf\u7006\u6ec6, this:\u7049\u56bd\uc29a\u7873\ucb79, rem:int(invokespecial:int(\u7049\u56bd\uc29a\u7873\ucb79::\u16f6\u4492\u385b\uf94d\u873d\uc910, this:\u7049\u56bd\uc29a\u7873\ucb79, add:int(add:int(var_56_3FC:int, var_32_19F:int), invokespecial:int(\u7049\u56bd\uc29a\u7873\ucb79::\u16f6\u4492\u385b\uf94d\u873d\uc910, this:\u7049\u56bd\uc29a\u7873\ucb79, add:int(add:int(var_57_408:int, var_33_1A8:int), invokespecial:int(\u7049\u56bd\uc29a\u7873\ucb79::\u16f6\u4492\u385b\uf94d\u873d\uc910, this:\u7049\u56bd\uc29a\u7873\ucb79, add:int(var_58_414:int, var_34_1B1:int)))))), ldc:int(12)), var_38_396:double, var_40_3A2:double, var_42_3AE:double, ldc:double(0.6))), invokespecial:double(\u7049\u56bd\uc29a\u7873\ucb79::\ud523\u7d52\u76bc\ufcaf\u7006\u6ec6, this:\u7049\u56bd\uc29a\u7873\ucb79, rem:int(invokespecial:int(\u7049\u56bd\uc29a\u7873\ucb79::\u16f6\u4492\u385b\uf94d\u873d\uc910, this:\u7049\u56bd\uc29a\u7873\ucb79, add:int(add:int(var_56_3FC:int, var_35_1BA:int), invokespecial:int(\u7049\u56bd\uc29a\u7873\ucb79::\u16f6\u4492\u385b\uf94d\u873d\uc910, this:\u7049\u56bd\uc29a\u7873\ucb79, add:int(add:int(var_57_408:int, var_36_1C3:int), invokespecial:int(\u7049\u56bd\uc29a\u7873\ucb79::\u16f6\u4492\u385b\uf94d\u873d\uc910, this:\u7049\u56bd\uc29a\u7873\ucb79, add:int(var_58_414:int, var_37_1CC:int)))))), ldc:int(12)), var_44_3BA:double, var_46_3C6:double, var_48_3D2:double, ldc:double(0.6))), invokespecial:double(\u7049\u56bd\uc29a\u7873\ucb79::\ud523\u7d52\u76bc\ufcaf\u7006\u6ec6, this:\u7049\u56bd\uc29a\u7873\ucb79, rem:int(invokespecial:int(\u7049\u56bd\uc29a\u7873\ucb79::\u16f6\u4492\u385b\uf94d\u873d\uc910, this:\u7049\u56bd\uc29a\u7873\ucb79, add:int(add:int(var_56_3FC:int, xor:int(ldc:int(3456), ldc:int(3457))), invokespecial:int(\u7049\u56bd\uc29a\u7873\ucb79::\u16f6\u4492\u385b\uf94d\u873d\uc910, this:\u7049\u56bd\uc29a\u7873\ucb79, add:int(add:int(var_57_408:int, and:int(ldc:int(22549), ldc:int(1313))), invokespecial:int(\u7049\u56bd\uc29a\u7873\ucb79::\u16f6\u4492\u385b\uf94d\u873d\uc910, this:\u7049\u56bd\uc29a\u7873\ucb79, add:int(var_58_414:int, and:int(ldc:int(1617), ldc:int(8225)))))))), ldc:int(12)), var_50_3DC:double, var_52_3E6:double, var_54_3F0:double, ldc:double(0.6)))))
        }
        
        goto(Label_0006)
    }
    
    static {
        expr_62 : int[][] [generated]
        stack_A6_1 : int [generated]
        expr_74 : int[] [generated]
        stack_E2_1 : int [generated]
        expr_B6 : int[] [generated]
        stack_11E_1 : int [generated]
        expr_F2 : int[] [generated]
        stack_154_1 : int [generated]
        expr_12E : int[] [generated]
        stack_196_1 : int [generated]
        expr_164 : int[] [generated]
        stack_1D2_1 : int [generated]
        expr_1A6 : int[] [generated]
        stack_209_1 : int [generated]
        expr_1DD : int[] [generated]
        stack_23A_1 : int [generated]
        expr_214 : int[] [generated]
        stack_277_1 : int [generated]
        expr_245 : int[] [generated]
        stack_2AE_1 : int [generated]
        expr_282 : int[] [generated]
        stack_2E5_1 : int [generated]
        expr_2B9 : int[] [generated]
        stack_316_1 : int [generated]
        expr_2F0 : int[] [generated]
        stack_353_1 : int [generated]
        expr_321 : int[] [generated]
        stack_38A_1 : int [generated]
        expr_35E : int[] [generated]
        stack_3C1_1 : int [generated]
        expr_395 : int[] [generated]
        stack_3F2_1 : int [generated]
        expr_3CC : int[] [generated]
        
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
            expr_62 = newarray:int[][](int[].class, ldc:int(16))
            stack_A6_1 = and:int(ldc:int(-31541), ldc:int(26900))
            expr_74 = newarray:int[](int.class, and:int(ldc:int(3107), ldc:int(16919)))
            storeelement:int(expr_74:int[], and:int(ldc:int(-3109), ldc:int(3108)), xor:int(ldc:int(-32726), ldc:int(-32725)))
            storeelement:int(expr_74:int[], xor:int(ldc:int(17432), ldc:int(17433)), and:int(ldc:int(13383), ldc:int(385)))
            storeelement:int(expr_74:int[], and:int(ldc:int(3210), ldc:int(4098)), and:int(ldc:int(-4617), ldc:int(4616)))
            storeelement:int[](expr_62:int[][], stack_A6_1:int, expr_74:int[])
            stack_E2_1 = and:int(ldc:int(129), ldc:int(24693))
            expr_B6 = newarray:int[](int.class, xor:int(ldc:int(792), ldc:int(795)))
            storeelement:int(expr_B6:int[], and:int(ldc:int(30759), ldc:int(-30832)), ldc:int(-1))
            storeelement:int(expr_B6:int[], xor:int(ldc:int(6144), ldc:int(6145)), xor:int(ldc:int(-32574), ldc:int(-32573)))
            storeelement:int(expr_B6:int[], and:int(ldc:int(2050), ldc:int(810)), and:int(ldc:int(-17200), ldc:int(17193)))
            storeelement:int[](expr_62:int[][], stack_E2_1:int, expr_B6:int[])
            stack_11E_1 = xor:int(ldc:int(-28668), ldc:int(-28666))
            expr_F2 = newarray:int[](int.class, xor:int(ldc:int(18464), ldc:int(18467)))
            storeelement:int(expr_F2:int[], and:int(ldc:int(3156), ldc:int(-3159)), xor:int(ldc:int(16905), ldc:int(16904)))
            storeelement:int(expr_F2:int[], and:int(ldc:int(4611), ldc:int(201)), ldc:int(-1))
            storeelement:int(expr_F2:int[], xor:int(ldc:int(4387), ldc:int(4385)), and:int(ldc:int(16728), ldc:int(-16729)))
            storeelement:int[](expr_62:int[][], stack_11E_1:int, expr_F2:int[])
            stack_154_1 = xor:int(ldc:int(4677), ldc:int(4678))
            expr_12E = newarray:int[](int.class, xor:int(ldc:int(0), ldc:int(3)))
            storeelement:int(expr_12E:int[], xor:int(ldc:int(640), ldc:int(641)), storeelement:int(expr_12E:int[], and:int(ldc:int(-24932), ldc:int(24866)), ldc:int(-1)))
            storeelement:int(expr_12E:int[], xor:int(ldc:int(1280), ldc:int(1282)), and:int(ldc:int(-20250), ldc:int(3865)))
            storeelement:int[](expr_62:int[][], stack_154_1:int, expr_12E:int[])
            stack_196_1 = and:int(ldc:int(6156), ldc:int(16551))
            expr_164 = newarray:int[](int.class, xor:int(ldc:int(7168), ldc:int(7171)))
            storeelement:int(expr_164:int[], and:int(ldc:int(-29581), ldc:int(29580)), and:int(ldc:int(4225), ldc:int(18217)))
            storeelement:int(expr_164:int[], and:int(ldc:int(10249), ldc:int(18211)), and:int(ldc:int(-19376), ldc:int(19361)))
            storeelement:int(expr_164:int[], xor:int(ldc:int(-32664), ldc:int(-32662)), xor:int(ldc:int(4224), ldc:int(4225)))
            storeelement:int[](expr_62:int[][], stack_196_1:int, expr_164:int[])
            stack_1D2_1 = xor:int(ldc:int(289), ldc:int(292))
            expr_1A6 = newarray:int[](int.class, and:int(ldc:int(71), ldc:int(16523)))
            storeelement:int(expr_1A6:int[], and:int(ldc:int(-28068), ldc:int(26018)), ldc:int(-1))
            storeelement:int(expr_1A6:int[], xor:int(ldc:int(-32760), ldc:int(-32759)), and:int(ldc:int(-22130), ldc:int(21616)))
            storeelement:int(expr_1A6:int[], xor:int(ldc:int(580), ldc:int(582)), and:int(ldc:int(8221), ldc:int(577)))
            storeelement:int[](expr_62:int[][], stack_1D2_1:int, expr_1A6:int[])
            stack_209_1 = ldc:int(6)
            expr_1DD = newarray:int[](int.class, and:int(ldc:int(19), ldc:int(3875)))
            storeelement:int(expr_1DD:int[], and:int(ldc:int(-29147), ldc:int(24920)), xor:int(ldc:int(192), ldc:int(193)))
            storeelement:int(expr_1DD:int[], and:int(ldc:int(14529), ldc:int(257)), and:int(ldc:int(17584), ldc:int(-17585)))
            storeelement:int(expr_1DD:int[], xor:int(ldc:int(5249), ldc:int(5251)), ldc:int(-1))
            storeelement:int[](expr_62:int[][], stack_209_1:int, expr_1DD:int[])
            stack_23A_1 = ldc:int(7)
            expr_214 = newarray:int[](int.class, xor:int(ldc:int(-22271), ldc:int(-22270)))
            storeelement:int(expr_214:int[], and:int(ldc:int(-7959), ldc:int(3350)), ldc:int(-1))
            storeelement:int(expr_214:int[], and:int(ldc:int(16449), ldc:int(5)), and:int(ldc:int(-28335), ldc:int(11782)))
            storeelement:int(expr_214:int[], xor:int(ldc:int(19009), ldc:int(19011)), ldc:int(-1))
            storeelement:int[](expr_62:int[][], stack_23A_1:int, expr_214:int[])
            stack_277_1 = ldc:int(8)
            expr_245 = newarray:int[](int.class, and:int(ldc:int(67), ldc:int(131)))
            storeelement:int(expr_245:int[], and:int(ldc:int(-2800), ldc:int(2799)), and:int(ldc:int(-20740), ldc:int(20739)))
            storeelement:int(expr_245:int[], xor:int(ldc:int(516), ldc:int(517)), and:int(ldc:int(53), ldc:int(17475)))
            storeelement:int(expr_245:int[], and:int(ldc:int(18), ldc:int(1282)), and:int(ldc:int(653), ldc:int(19491)))
            storeelement:int[](expr_62:int[][], stack_277_1:int, expr_245:int[])
            stack_2AE_1 = ldc:int(9)
            expr_282 = newarray:int[](int.class, and:int(ldc:int(515), ldc:int(2051)))
            storeelement:int(expr_282:int[], and:int(ldc:int(28730), ldc:int(-31035)), and:int(ldc:int(6240), ldc:int(-6241)))
            storeelement:int(expr_282:int[], and:int(ldc:int(16529), ldc:int(257)), ldc:int(-1))
            storeelement:int(expr_282:int[], xor:int(ldc:int(4111), ldc:int(4109)), and:int(ldc:int(129), ldc:int(10245)))
            storeelement:int[](expr_62:int[][], stack_2AE_1:int, expr_282:int[])
            stack_2E5_1 = ldc:int(10)
            expr_2B9 = newarray:int[](int.class, and:int(ldc:int(10819), ldc:int(1055)))
            storeelement:int(expr_2B9:int[], and:int(ldc:int(7045), ldc:int(-7046)), and:int(ldc:int(-7068), ldc:int(651)))
            storeelement:int(expr_2B9:int[], xor:int(ldc:int(33), ldc:int(32)), and:int(ldc:int(18959), ldc:int(113)))
            storeelement:int(expr_2B9:int[], and:int(ldc:int(24674), ldc:int(262)), ldc:int(-1))
            storeelement:int[](expr_62:int[][], stack_2E5_1:int, expr_2B9:int[])
            stack_316_1 = ldc:int(11)
            expr_2F0 = newarray:int[](int.class, and:int(ldc:int(23895), ldc:int(8195)))
            storeelement:int(expr_2F0:int[], and:int(ldc:int(8664), ldc:int(-10713)), and:int(ldc:int(10436), ldc:int(-10437)))
            storeelement:int(expr_2F0:int[], xor:int(ldc:int(9248), ldc:int(9250)), storeelement:int(expr_2F0:int[], and:int(ldc:int(1099), ldc:int(257)), ldc:int(-1)))
            storeelement:int[](expr_62:int[][], stack_316_1:int, expr_2F0:int[])
            stack_353_1 = ldc:int(12)
            expr_321 = newarray:int[](int.class, xor:int(ldc:int(2193), ldc:int(2194)))
            storeelement:int(expr_321:int[], and:int(ldc:int(-18653), ldc:int(18572)), and:int(ldc:int(4227), ldc:int(16929)))
            storeelement:int(expr_321:int[], xor:int(ldc:int(2176), ldc:int(2177)), and:int(ldc:int(161), ldc:int(10521)))
            storeelement:int(expr_321:int[], xor:int(ldc:int(1344), ldc:int(1346)), and:int(ldc:int(814), ldc:int(-1855)))
            storeelement:int[](expr_62:int[][], stack_353_1:int, expr_321:int[])
            stack_38A_1 = ldc:int(13)
            expr_35E = newarray:int[](int.class, and:int(ldc:int(395), ldc:int(17987)))
            storeelement:int(expr_35E:int[], and:int(ldc:int(-6133), ldc:int(5844)), and:int(ldc:int(22285), ldc:int(-22334)))
            storeelement:int(expr_35E:int[], xor:int(ldc:int(-30720), ldc:int(-30719)), ldc:int(-1))
            storeelement:int(expr_35E:int[], xor:int(ldc:int(4753), ldc:int(4755)), xor:int(ldc:int(3138), ldc:int(3139)))
            storeelement:int[](expr_62:int[][], stack_38A_1:int, expr_35E:int[])
            stack_3C1_1 = ldc:int(14)
            expr_395 = newarray:int[](int.class, xor:int(ldc:int(2092), ldc:int(2095)))
            storeelement:int(expr_395:int[], and:int(ldc:int(25937), ldc:int(-26098)), ldc:int(-1))
            storeelement:int(expr_395:int[], xor:int(ldc:int(1062), ldc:int(1063)), and:int(ldc:int(3329), ldc:int(201)))
            storeelement:int(expr_395:int[], and:int(ldc:int(1331), ldc:int(10246)), and:int(ldc:int(12996), ldc:int(-13269)))
            storeelement:int[](expr_62:int[][], stack_3C1_1:int, expr_395:int[])
            stack_3F2_1 = ldc:int(15)
            expr_3CC = newarray:int[](int.class, xor:int(ldc:int(512), ldc:int(515)))
            storeelement:int(expr_3CC:int[], and:int(ldc:int(-25484), ldc:int(25475)), and:int(ldc:int(-9376), ldc:int(9356)))
            storeelement:int(expr_3CC:int[], xor:int(ldc:int(12433), ldc:int(12435)), storeelement:int(expr_3CC:int[], and:int(ldc:int(8211), ldc:int(4449)), ldc:int(-1)))
            storeelement:int[](expr_62:int[][], stack_3F2_1:int, expr_3CC:int[])
            putstatic:int[][](\u7049\u56bd\uc29a\u7873\ucb79::\u4ab3\u8df4\u51b2\u7043\ubefe\ufe34, expr_62:int[][])
            putstatic:double(\u7049\u56bd\uc29a\u7873\ucb79::\u8d90\ufe34\u7006\u494c\u9a18\u9033, invokestatic:double(Math::sqrt, ldc:double(3.0)))
            putstatic:double(\u7049\u56bd\uc29a\u7873\ucb79::\u1187\uc7fe\u99f7\u7873\u3d64\u960f, mul:double(ldc:double(0.5), sub:double(getstatic:double(\u7049\u56bd\uc29a\u7873\ucb79::\u8d90\ufe34\u7006\u494c\u9a18\u9033), ldc:double(1.0))))
            putstatic:double(\u7049\u56bd\uc29a\u7873\ucb79::\u9af2\u946b\ud12e\u0800\u5db4\u7d52, div:double(sub:double(ldc:double(3.0), getstatic:double(\u7049\u56bd\uc29a\u7873\ucb79::\u8d90\ufe34\u7006\u494c\u9a18\u9033)), ldc:double(6.0)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u1187\u7c6b\u0800\u36d3\u5db4\u69d9(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_614 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_61F : int
        
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
        var_3_614 = and:int(ldc:int(107751258), ldc:int(-673431725))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7049\u56bd\uc29a\u7873\ucb79[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(524288)), ldc:int(0))) {
            var_3_614 = and:int(var_3_614:int, ldc:int(285958157))
        }
        else {
            var_3_614 = and:int(var_3_614:int, ldc:int(-1906528326))
            var_5_85 = and:int(ldc:int(-22208), ldc:int(22157))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-12484), ldc:int(12483)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_614:int, ldc:int(-673356006))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(6657), ldc:int(39)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(9729), ldc:int(22577)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_614 = and:int(var_3_DA:int, ldc:int(265207611))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(17671), ldc:int(4617)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1320)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1190)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1046)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(1252210900))
                        goto(Label_0902)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1985785996))
                        goto(Label_0783)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-802141029))
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-674306277))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0783)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(993190321))
                        goto(Label_1320)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(758652819))
                        goto(Label_1190)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1929903271))
                        goto(Label_1046)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0902)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-836904293))
                        goto(Label_0783)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(1)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(1190971262))
                            var_11_EB = and:int(ldc:int(-18543), ldc:int(18538))
                            goto(Label_1439)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0541:
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1320)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1764347879))
                        goto(Label_1190)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1046)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(2)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1803603711))
                        goto(Label_0902)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0783)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(292420484))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(16)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(1670140971))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(2)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(1203740083))
                            loopcontinue()
                        }
                        
                        var_3_614 = and:int(var_3_614:int, ldc:int(1322178359))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0783)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(256)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(792425409))
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-397553020))
                        goto(Label_1320)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(2)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-744300208))
                        goto(Label_1190)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1046)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0902)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(16)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(412751403))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_614 = and:int(var_3_614:int, ldc:int(1995257659))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0783:
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(1225541656))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1626039211))
                        goto(Label_1320)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1190)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1046)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(1015746114))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(32)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(1895239311))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1501605926))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = and:int(ldc:int(2561), ldc:int(8417))
                                goto(Label_1046)
                            }
                        }
                    }
                    
                    Label_0902:
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-432130065))
                        goto(Label_1320)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1190)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0783)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-884673842))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(1193163730))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1622343717))
                        var_11_EB = and:int(ldc:int(-10809), ldc:int(10808))
                    }
                    
                    Label_1046:
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1320)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(2)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1644107740))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-1990041847))
                            goto(Label_0902)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(2)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-1754603722))
                            goto(Label_0783)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(162806573))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(16)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-991534918))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(1253142438))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-981939584))
                            loopcontinue()
                        }
                        
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1629681733))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1320)
                            }
                        }
                    }
                    
                    Label_1190:
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(2102665878))
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(32)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-1786546495))
                            goto(Label_1046)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0902)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0783)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-550796941))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(512)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(1696264932))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-2038542337))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1439)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1320:
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1190)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1404691060))
                        goto(Label_1046)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(1087828585))
                        goto(Label_0902)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0783)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(259848151))
                        loopcontinue()
                    }
                    
                    var_3_614 = and:int(var_3_614:int, ldc:int(-951298113))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1439:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_61F = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1450:
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1320)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1190)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1046)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(44092262))
                        goto(Label_0902)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0783)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1236637896))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-917159060))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(919422962))
                        var_17_61F = add:int(var_16_119:int, and:int(ldc:int(641), ldc:int(10269)))
                        looporswitchbreak()
                    }
                    
                    var_3_614 = and:int(var_3_614:int, ldc:int(-814278819))
                }
                
                var_3_614 = and:int(var_3_614:int, ldc:int(-279115969))
                
                if (cmple:boolean(var_5_85 = var_17_61F:int, sub:int(var_6_8C:int, xor:int(ldc:int(16416), ldc:int(16417))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(2048)), ldc:int(0))) {
            var_3_614 = and:int(var_3_614:int, ldc:int(273684949))
            goto(Label_0106)
        }
    }
}
