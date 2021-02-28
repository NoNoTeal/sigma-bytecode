public class \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c {
    private void \u47c2\u8aa5\u4492\u965f\ubcb0\ub70c() {
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
            invokespecial:Object(Object::<init>, this:\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void \ud171\u6b5f\u927d\uc246\uc7fe\u7bad(double[] p0, double[] p1, double[] p2, double[] p3, int p4, double[] p5, double[] p6) {
        var_7_96 : int
        var_9_6C : double[]
        var_10_75 : int
        var_7_1CD : int
        var_11_E6 : double
        var_13_185 : double[]
        var_14_190 : double[]
        var_15_19B : double[]
        var_16_1A6 : double[]
        var_17_1B1 : double[]
        var_10_173 : int
        var_13_463 : double[]
        var_14_46E : double[]
        var_15_479 : double[]
        
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
            var_7_96 = and:int(ldc:int(-1450855020), ldc:int(-1652040239))
            var_9_6C = newarray:double[](double.class, and:int(ldc:int(2242), ldc:int(5430)))
            var_10_75 = and:int(ldc:int(27472), ldc:int(-27473))
            
            loop {
                if (cmpne:boolean(and:int(var_7_96:int, ldc:int(32)), ldc:int(0))) {
                    var_7_1CD = and:int(var_7_96:int, ldc:int(-541615350))
                    goto(Label_0321)
                }
                
                if (cmpne:boolean(and:int(var_7_96:int, ldc:int(32)), ldc:int(0))) {
                    var_7_96 = and:int(var_7_96:int, ldc:int(-1040075100))
                }
                else {
                    var_7_96 = and:int(var_7_96:int, ldc:int(-1647879754))
                    
                    if (cmplt:boolean(var_10_75:int, ldc:int(7))) {
                        var_11_E6 = div:double(i2d:double(var_10_75:int), ldc:double(8.0))
                        invokestatic:double(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u4daf\u88c5\u8413\u0c95\uae5d\ucfaf, var_11_E6:double, var_9_6C:double[])
                        storeelement:double(p0:double[], var_10_75:int, loadelement:double(var_9_6C:double[], and:int(ldc:int(-26712), ldc:int(18499))))
                        storeelement:double(p1:double[], var_10_75:int, loadelement:double(var_9_6C:double[], xor:int(ldc:int(-32752), ldc:int(-32751))))
                        invokestatic:double(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\ud171\u4c2b\u4f52\ub18d\u0800\u6c56, var_11_E6:double, var_9_6C:double[])
                        storeelement:double(p2:double[], var_10_75:int, loadelement:double(var_9_6C:double[], and:int(ldc:int(-5466), ldc:int(4377))))
                        storeelement:double(p3:double[], var_10_75:int, loadelement:double(var_9_6C:double[], xor:int(ldc:int(8448), ldc:int(8449))))
                        inc:int(var_10_75, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                Label_0169:
                
                if (cmpeq:boolean(and:int(var_7_96:int, ldc:int(256)), ldc:int(0))) {
                    var_7_1CD = and:int(var_7_96:int, ldc:int(1371868706))
                }
                else {
                    if (cmpeq:boolean(and:int(var_7_96:int, ldc:int(128)), ldc:int(0))) {
                        var_7_96 = and:int(var_7_96:int, ldc:int(950582018))
                        loopcontinue()
                    }
                    
                    var_7_1CD = and:int(var_7_96:int, ldc:int(-1946830410))
                    var_10_75 = ldc:int(7)
                    
                    while (cmplt:boolean(var_10_75:int, p4:int)) {
                        var_13_185 = newarray:double[](double.class, and:int(ldc:int(114), ldc:int(514)))
                        var_14_190 = newarray:double[](double.class, and:int(ldc:int(1170), ldc:int(111)))
                        var_15_19B = newarray:double[](double.class, xor:int(ldc:int(1), ldc:int(3)))
                        var_16_1A6 = newarray:double[](double.class, and:int(ldc:int(17435), ldc:int(12546)))
                        var_17_1B1 = newarray:double[](double.class, and:int(ldc:int(7810), ldc:int(16386)))
                        
                        if (cmpeq:boolean(and:int(var_10_75:int, and:int(ldc:int(1629), ldc:int(24835))), ldc:int(0))) {
                            storeelement:double(var_13_185:double[], and:int(ldc:int(-23096), ldc:int(23095)), loadelement:double(p0:double[], div:int(var_10_75:int, xor:int(ldc:int(12425), ldc:int(12427)))))
                            storeelement:double(var_13_185:double[], xor:int(ldc:int(-32760), ldc:int(-32759)), loadelement:double(p1:double[], div:int(var_10_75:int, xor:int(ldc:int(4613), ldc:int(4615)))))
                            storeelement:double(var_14_190:double[], and:int(ldc:int(-9919), ldc:int(9886)), loadelement:double(p2:double[], div:int(var_10_75:int, and:int(ldc:int(5634), ldc:int(8199)))))
                            storeelement:double(var_14_190:double[], and:int(ldc:int(10241), ldc:int(16441)), loadelement:double(p3:double[], div:int(var_10_75:int, and:int(ldc:int(3458), ldc:int(4171)))))
                            invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u156b\u69d9\u4975\u0b8e\u3d4b\ud12e, var_13_185:double[], var_14_190:double[], var_9_6C:double[])
                            storeelement:double(p0:double[], var_10_75:int, mul:double(loadelement:double(var_9_6C:double[], and:int(ldc:int(-5024), ldc:int(4255))), ldc:double(2.0)))
                            storeelement:double(p1:double[], var_10_75:int, mul:double(loadelement:double(var_9_6C:double[], xor:int(ldc:int(2880), ldc:int(2881))), ldc:double(2.0)))
                            invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u156b\u69d9\u4975\u0b8e\u3d4b\ud12e, var_14_190:double[], var_14_190:double[], var_15_19B:double[])
                            invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u156b\u69d9\u4975\u0b8e\u3d4b\ud12e, var_13_185:double[], var_13_185:double[], var_17_1B1:double[])
                            storeelement:double(var_17_1B1:double[], and:int(ldc:int(22858), ldc:int(-22908)), neg:double(loadelement:double(var_17_1B1:double[], and:int(ldc:int(-19849), ldc:int(19592)))))
                            storeelement:double(var_17_1B1:double[], and:int(ldc:int(24609), ldc:int(2053)), neg:double(loadelement:double(var_17_1B1:double[], xor:int(ldc:int(24600), ldc:int(24601)))))
                            invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\ub32d\u8258\u6c52\u4daf\uae5d\u93a2, var_15_19B:double[], var_17_1B1:double[], var_9_6C:double[])
                            storeelement:double(p2:double[], var_10_75:int, loadelement:double(var_9_6C:double[], and:int(ldc:int(-18456), ldc:int(18455))))
                            storeelement:double(p3:double[], var_10_75:int, loadelement:double(var_9_6C:double[], xor:int(ldc:int(-30720), ldc:int(-30719))))
                            goto(Label_1070)
                        }
                        
                        Label_0448:
                        
                        if (cmpne:boolean(and:int(var_7_1CD:int, ldc:int(524288)), ldc:int(0))) {
                            var_7_1CD = and:int(var_7_1CD:int, ldc:int(713984808))
                        }
                        else {
                            var_7_1CD = and:int(var_7_1CD:int, ldc:int(-1378496011))
                            storeelement:double(var_13_185:double[], and:int(ldc:int(1188), ldc:int(-1189)), loadelement:double(p0:double[], div:int(var_10_75:int, and:int(ldc:int(31266), ldc:int(322)))))
                            storeelement:double(var_13_185:double[], and:int(ldc:int(8357), ldc:int(16387)), loadelement:double(p1:double[], div:int(var_10_75:int, and:int(ldc:int(6406), ldc:int(514)))))
                            storeelement:double(var_14_190:double[], and:int(ldc:int(-10867), ldc:int(8818)), loadelement:double(p2:double[], div:int(var_10_75:int, xor:int(ldc:int(25), ldc:int(27)))))
                            storeelement:double(var_14_190:double[], and:int(ldc:int(16961), ldc:int(9217)), loadelement:double(p3:double[], div:int(var_10_75:int, and:int(ldc:int(23458), ldc:int(1090)))))
                            storeelement:double(var_15_19B:double[], and:int(ldc:int(7187), ldc:int(-7700)), loadelement:double(p0:double[], add:int(div:int(var_10_75:int, xor:int(ldc:int(8369), ldc:int(8371))), xor:int(ldc:int(16914), ldc:int(16915)))))
                            storeelement:double(var_15_19B:double[], and:int(ldc:int(1541), ldc:int(16385)), loadelement:double(p1:double[], add:int(div:int(var_10_75:int, and:int(ldc:int(17682), ldc:int(2562))), xor:int(ldc:int(579), ldc:int(578)))))
                            storeelement:double(var_16_1A6:double[], and:int(ldc:int(-17701), ldc:int(17700)), loadelement:double(p2:double[], add:int(div:int(var_10_75:int, xor:int(ldc:int(8235), ldc:int(8233))), and:int(ldc:int(4233), ldc:int(2577)))))
                            storeelement:double(var_16_1A6:double[], and:int(ldc:int(837), ldc:int(7203)), loadelement:double(p3:double[], add:int(div:int(var_10_75:int, xor:int(ldc:int(16512), ldc:int(16514))), and:int(ldc:int(1029), ldc:int(8305)))))
                            invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u156b\u69d9\u4975\u0b8e\u3d4b\ud12e, var_13_185:double[], var_16_1A6:double[], var_17_1B1:double[])
                            invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u156b\u69d9\u4975\u0b8e\u3d4b\ud12e, var_14_190:double[], var_15_19B:double[], var_9_6C:double[])
                            invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\ub32d\u8258\u6c52\u4daf\uae5d\u93a2, var_9_6C:double[], var_17_1B1:double[], var_9_6C:double[])
                            storeelement:double(p0:double[], var_10_75:int, loadelement:double(var_9_6C:double[], and:int(ldc:int(6857), ldc:int(-6858))))
                            storeelement:double(p1:double[], var_10_75:int, loadelement:double(var_9_6C:double[], and:int(ldc:int(65), ldc:int(20669))))
                            invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u156b\u69d9\u4975\u0b8e\u3d4b\ud12e, var_14_190:double[], var_16_1A6:double[], var_9_6C:double[])
                            invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u156b\u69d9\u4975\u0b8e\u3d4b\ud12e, var_13_185:double[], var_15_19B:double[], var_17_1B1:double[])
                            storeelement:double(var_17_1B1:double[], and:int(ldc:int(6602), ldc:int(-6603)), neg:double(loadelement:double(var_17_1B1:double[], and:int(ldc:int(-2080), ldc:int(2079)))))
                            storeelement:double(var_17_1B1:double[], xor:int(ldc:int(594), ldc:int(595)), neg:double(loadelement:double(var_17_1B1:double[], and:int(ldc:int(5123), ldc:int(397)))))
                            invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\ub32d\u8258\u6c52\u4daf\uae5d\u93a2, var_9_6C:double[], var_17_1B1:double[], var_9_6C:double[])
                            storeelement:double(p2:double[], var_10_75:int, loadelement:double(var_9_6C:double[], and:int(ldc:int(20020), ldc:int(-32565))))
                            storeelement:double(p3:double[], var_10_75:int, loadelement:double(var_9_6C:double[], and:int(ldc:int(769), ldc:int(16389))))
                        }
                        
                        Label_1070:
                        
                        if (cmpeq:boolean(and:int(var_7_1CD:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0448)
                        }
                        
                        var_7_1CD = and:int(var_7_1CD:int, ldc:int(-1684542024))
                        inc:int(var_10_75, ldc:int(1))
                    }
                }
                
                Label_0321:
                
                if (cmpeq:boolean(and:int(var_7_1CD:int, ldc:int(16)), ldc:int(0))) {
                    var_7_96 = and:int(var_7_1CD:int, ldc:int(-1576736691))
                    goto(Label_0169)
                }
                
                if (cmpeq:boolean(and:int(var_7_1CD:int, ldc:int(512)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_7_96 = and:int(var_7_1CD:int, ldc:int(-1664472713))
            }
            
            var_10_173 = and:int(ldc:int(1245), ldc:int(-3294))
            
            while (cmplt:boolean(var_10_173:int, p4:int)) {
                var_13_463 = newarray:double[](double.class, xor:int(ldc:int(448), ldc:int(450)))
                var_14_46E = newarray:double[](double.class, and:int(ldc:int(3754), ldc:int(16386)))
                var_15_479 = newarray:double[](double.class, xor:int(ldc:int(-29663), ldc:int(-29661)))
                storeelement:double(var_15_479:double[], and:int(ldc:int(-10418), ldc:int(10417)), loadelement:double(p2:double[], var_10_173:int))
                storeelement:double(var_15_479:double[], and:int(ldc:int(3073), ldc:int(581)), loadelement:double(p3:double[], var_10_173:int))
                invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\ufcaf\uc84e\u0800\u67e9\u446c\uf9c5, var_15_479:double[], var_14_46E:double[])
                storeelement:double(var_13_463:double[], and:int(ldc:int(-17344), ldc:int(16817)), loadelement:double(p0:double[], var_10_173:int))
                storeelement:double(var_13_463:double[], xor:int(ldc:int(24712), ldc:int(24713)), loadelement:double(p1:double[], var_10_173:int))
                invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u156b\u69d9\u4975\u0b8e\u3d4b\ud12e, var_13_463:double[], var_14_46E:double[], var_15_479:double[])
                storeelement:double(p5:double[], var_10_173:int, loadelement:double(var_15_479:double[], and:int(ldc:int(-3910), ldc:int(3653))))
                storeelement:double(p6:double[], var_10_173:int, loadelement:double(var_15_479:double[], and:int(ldc:int(12305), ldc:int(2275))))
                inc:int(var_10_173, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static double \ud171\u4c2b\u4f52\ub18d\u0800\u6c56(double p0, double[] p1) {
        var_3_D0 : int
        var_5_69 : double[]
        var_6_74 : double[]
        var_7_7F : double[]
        var_8_8A : double[]
        var_9_B4 : int
        var_3_1BE : int
        
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
            var_3_D0 = and:int(ldc:int(15467108), ldc:int(-1545849880))
            var_5_69 = newarray:double[](double.class, xor:int(ldc:int(65), ldc:int(67)))
            var_6_74 = newarray:double[](double.class, and:int(ldc:int(42), ldc:int(451)))
            var_7_7F = newarray:double[](double.class, xor:int(ldc:int(131), ldc:int(129)))
            var_8_8A = newarray:double[](double.class, and:int(ldc:int(26779), ldc:int(4134)))
            invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u6bb9\u5d20\u36d3\u88c5\u4e72\u494c, p0:double, var_5_69:double[])
            storeelement:double(var_6_74:double[], and:int(ldc:int(-6613), ldc:int(2512)), storeelement:double(var_6_74:double[], and:int(ldc:int(14337), ldc:int(1169)), ldc:double(0.0)))
            var_9_B4 = sub:int(arraylength:int(getstatic:double[](\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u69d9\u8640\uc229\ud51e\u156b\u8389)), and:int(ldc:int(485), ldc:int(16395)))
            
            loop {
                if (cmpeq:boolean(and:int(var_3_D0:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_3_D0 = and:int(var_3_D0:int, ldc:int(-1891252584))
                    goto(Label_0405)
                }
                
                if (cmpeq:boolean(and:int(var_3_D0:int, ldc:int(32)), ldc:int(0))) {
                    var_3_D0 = and:int(var_3_D0:int, ldc:int(1034811715))
                    goto(Label_0267)
                }
                
                if (cmpne:boolean(and:int(var_3_D0:int, ldc:int(4096)), ldc:int(0))) {
                    var_3_D0 = and:int(var_3_D0:int, ldc:int(-1411259753))
                }
                else {
                    var_3_D0 = and:int(var_3_D0:int, ldc:int(-27495775))
                    
                    if (cmpge:boolean(var_9_B4:int, ldc:int(0))) {
                        invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u156b\u69d9\u4975\u0b8e\u3d4b\ud12e, var_5_69:double[], var_6_74:double[], var_8_8A:double[])
                        storeelement:double(var_6_74:double[], and:int(ldc:int(-22186), ldc:int(21673)), loadelement:double(var_8_8A:double[], and:int(ldc:int(24810), ldc:int(-29696))))
                        storeelement:double(var_6_74:double[], and:int(ldc:int(2339), ldc:int(9345)), loadelement:double(var_8_8A:double[], and:int(ldc:int(28705), ldc:int(1091))))
                        
                        if (cmpeq:boolean(and:int(var_9_B4:int, xor:int(ldc:int(16688), ldc:int(16689))), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        goto(Label_0595)
                    }
                }
                
                Label_0237:
                
                if (cmpne:boolean(and:int(var_3_D0:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_0405)
                }
                
                if (cmpeq:boolean(and:int(var_3_D0:int, ldc:int(1024)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_3_D0:int, ldc:int(131072)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_D0 = and:int(var_3_D0:int, ldc:int(401432426))
                    
                    if (cmpne:boolean(p1:double[], aconstnull:double[]())) {
                        storeelement:double(p1:double[], and:int(ldc:int(2668), ldc:int(-6767)), loadelement:double(var_6_74:double[], and:int(ldc:int(-16064), ldc:int(10937))))
                        storeelement:double(p1:double[], xor:int(ldc:int(2566), ldc:int(2567)), loadelement:double(var_6_74:double[], xor:int(ldc:int(-32256), ldc:int(-32255))))
                    }
                }
                
                Label_0267:
                
                if (cmpne:boolean(and:int(var_3_D0:int, ldc:int(1024)), ldc:int(0))) {
                    var_3_D0 = and:int(var_3_D0:int, ldc:int(1558314687))
                }
                else {
                    if (cmpne:boolean(and:int(var_3_D0:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_D0 = and:int(var_3_D0:int, ldc:int(1031236290))
                        goto(Label_0237)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_D0:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_D0 = and:int(var_3_D0:int, ldc:int(-1859452141))
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                Label_0405:
                
                if (cmpne:boolean(and:int(var_3_D0:int, ldc:int(131072)), ldc:int(0))) {
                    var_3_D0 = and:int(var_3_D0:int, ldc:int(450226879))
                    goto(Label_0267)
                }
                
                if (cmpne:boolean(and:int(var_3_D0:int, ldc:int(268435456)), ldc:int(0))) {
                    var_3_D0 = and:int(var_3_D0:int, ldc:int(-595368170))
                    goto(Label_0237)
                }
                
                if (cmpne:boolean(and:int(var_3_D0:int, ldc:int(16777216)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_3_1BE = and:int(var_3_D0:int, ldc:int(670960766))
                invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u6bb9\u5d20\u36d3\u88c5\u4e72\u494c, loadelement:double(getstatic:double[](\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u69d9\u8640\uc229\ud51e\u156b\u8389), var_9_B4:int), var_8_8A:double[])
                invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\ufcaf\uc84e\u0800\u67e9\u446c\uf9c5, var_8_8A:double[], var_7_7F:double[])
                
                if (cmpne:boolean(and:int(var_9_B4:int, and:int(ldc:int(1298), ldc:int(10767))), ldc:int(0))) {
                    storeelement:double(var_7_7F:double[], and:int(ldc:int(-6790), ldc:int(6789)), neg:double(loadelement:double(var_7_7F:double[], and:int(ldc:int(1392), ldc:int(-1401)))))
                    storeelement:double(var_7_7F:double[], and:int(ldc:int(153), ldc:int(6661)), neg:double(loadelement:double(var_7_7F:double[], xor:int(ldc:int(8290), ldc:int(8291)))))
                }
                
                var_3_D0 = and:int(var_3_1BE:int, ldc:int(569214753))
                invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\ub32d\u8258\u6c52\u4daf\uae5d\u93a2, var_6_74:double[], var_7_7F:double[], var_8_8A:double[])
                storeelement:double(var_6_74:double[], and:int(ldc:int(-25082), ldc:int(8561)), loadelement:double(var_8_8A:double[], and:int(ldc:int(-27717), ldc:int(25668))))
                storeelement:double(var_6_74:double[], xor:int(ldc:int(-30192), ldc:int(-30191)), loadelement:double(var_8_8A:double[], xor:int(ldc:int(2369), ldc:int(2368))))
                Label_0595:
                inc:int(var_9_B4, ldc:int(-1))
            }
            
            return:double(add:double(loadelement:double(var_6_74:double[], and:int(ldc:int(-13425), ldc:int(13424))), loadelement:double(var_6_74:double[], xor:int(ldc:int(11776), ldc:int(11777)))))
        }
        
        goto(Label_0006)
    }
    
    public static double \u4daf\u88c5\u8413\u0c95\uae5d\ucfaf(double p0, double[] p1) {
        var_3_D7 : int
        var_5_69 : double[]
        var_6_74 : double[]
        var_7_7F : double[]
        var_8_8A : double[]
        var_9_B4 : int
        var_3_1BE : int
        
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
            var_3_D7 = and:int(ldc:int(-192034996), ldc:int(-1098388628))
            var_5_69 = newarray:double[](double.class, and:int(ldc:int(114), ldc:int(17922)))
            var_6_74 = newarray:double[](double.class, xor:int(ldc:int(-31648), ldc:int(-31646)))
            var_7_7F = newarray:double[](double.class, and:int(ldc:int(258), ldc:int(10306)))
            var_8_8A = newarray:double[](double.class, and:int(ldc:int(678), ldc:int(10)))
            invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u6bb9\u5d20\u36d3\u88c5\u4e72\u494c, p0:double, var_5_69:double[])
            storeelement:double(var_6_74:double[], and:int(ldc:int(-19232), ldc:int(18714)), storeelement:double(var_6_74:double[], and:int(ldc:int(17057), ldc:int(1)), ldc:double(0.0)))
            var_9_B4 = sub:int(arraylength:int(getstatic:double[](\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u69d9\u8640\uc229\ud51e\u156b\u8389)), and:int(ldc:int(389), ldc:int(27177)))
            
            loop {
                if (cmpeq:boolean(and:int(var_3_D7:int, ldc:int(268435456)), ldc:int(0))) {
                    var_3_D7 = and:int(var_3_D7:int, ldc:int(441669587))
                    goto(Label_0413)
                }
                
                if (cmpeq:boolean(and:int(var_3_D7:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0283)
                }
                
                if (cmpeq:boolean(and:int(var_3_D7:int, ldc:int(256)), ldc:int(0))) {
                    var_3_D7 = and:int(var_3_D7:int, ldc:int(1452543534))
                }
                else {
                    var_3_D7 = and:int(var_3_D7:int, ldc:int(-711545857))
                    
                    if (cmpge:boolean(var_9_B4:int, ldc:int(0))) {
                        invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u156b\u69d9\u4975\u0b8e\u3d4b\ud12e, var_5_69:double[], var_6_74:double[], var_8_8A:double[])
                        storeelement:double(var_6_74:double[], and:int(ldc:int(1296), ldc:int(-1297)), loadelement:double(var_8_8A:double[], and:int(ldc:int(-3965), ldc:int(1900))))
                        storeelement:double(var_6_74:double[], and:int(ldc:int(28801), ldc:int(2137)), loadelement:double(var_8_8A:double[], and:int(ldc:int(24851), ldc:int(1089))))
                        
                        if (cmpne:boolean(and:int(var_9_B4:int, xor:int(ldc:int(-30717), ldc:int(-30718))), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        goto(Label_0595)
                    }
                }
                
                Label_0229:
                
                if (cmpne:boolean(and:int(var_3_D7:int, ldc:int(2097152)), ldc:int(0))) {
                    var_3_D7 = and:int(var_3_D7:int, ldc:int(2012329796))
                    goto(Label_0413)
                }
                
                if (cmpeq:boolean(and:int(var_3_D7:int, ldc:int(512)), ldc:int(0))) {
                    var_3_D7 = and:int(var_3_D7:int, ldc:int(300530328))
                }
                else {
                    if (cmpeq:boolean(and:int(var_3_D7:int, ldc:int(256)), ldc:int(0))) {
                        var_3_D7 = and:int(var_3_D7:int, ldc:int(-1351493794))
                        loopcontinue()
                    }
                    
                    var_3_D7 = and:int(var_3_D7:int, ldc:int(-554242238))
                    
                    if (cmpne:boolean(p1:double[], aconstnull:double[]())) {
                        storeelement:double(p1:double[], and:int(ldc:int(-17033), ldc:int(17032)), loadelement:double(var_6_74:double[], and:int(ldc:int(-10389), ldc:int(10388))))
                        storeelement:double(p1:double[], and:int(ldc:int(9063), ldc:int(4225)), loadelement:double(var_6_74:double[], xor:int(ldc:int(7232), ldc:int(7233))))
                    }
                }
                
                Label_0283:
                
                if (cmpeq:boolean(and:int(var_3_D7:int, ldc:int(512)), ldc:int(0))) {
                    var_3_D7 = and:int(var_3_D7:int, ldc:int(-518642323))
                }
                else {
                    if (cmpne:boolean(and:int(var_3_D7:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0229)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_D7:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_D7 = and:int(var_3_D7:int, ldc:int(-466262838))
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                Label_0413:
                
                if (cmpne:boolean(and:int(var_3_D7:int, ldc:int(8192)), ldc:int(0))) {
                    var_3_D7 = and:int(var_3_D7:int, ldc:int(686044866))
                    goto(Label_0283)
                }
                
                if (cmpeq:boolean(and:int(var_3_D7:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0229)
                }
                
                if (cmpeq:boolean(and:int(var_3_D7:int, ldc:int(262144)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_3_1BE = and:int(var_3_D7:int, ldc:int(-1229083668))
                invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u6bb9\u5d20\u36d3\u88c5\u4e72\u494c, loadelement:double(getstatic:double[](\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u69d9\u8640\uc229\ud51e\u156b\u8389), var_9_B4:int), var_8_8A:double[])
                invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\ufcaf\uc84e\u0800\u67e9\u446c\uf9c5, var_8_8A:double[], var_7_7F:double[])
                
                if (cmpne:boolean(and:int(var_9_B4:int, and:int(ldc:int(5258), ldc:int(24867))), ldc:int(0))) {
                    storeelement:double(var_7_7F:double[], and:int(ldc:int(10360), ldc:int(-26749)), neg:double(loadelement:double(var_7_7F:double[], and:int(ldc:int(-14588), ldc:int(2201)))))
                    storeelement:double(var_7_7F:double[], xor:int(ldc:int(-24543), ldc:int(-24544)), neg:double(loadelement:double(var_7_7F:double[], and:int(ldc:int(10825), ldc:int(20741)))))
                }
                
                var_3_D7 = and:int(var_3_1BE:int, ldc:int(-168835240))
                invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\ub32d\u8258\u6c52\u4daf\uae5d\u93a2, var_6_74:double[], var_7_7F:double[], var_8_8A:double[])
                storeelement:double(var_6_74:double[], and:int(ldc:int(5521), ldc:int(-13780)), loadelement:double(var_8_8A:double[], and:int(ldc:int(-586), ldc:int(585))))
                storeelement:double(var_6_74:double[], and:int(ldc:int(515), ldc:int(6513)), loadelement:double(var_8_8A:double[], and:int(ldc:int(18593), ldc:int(5125))))
                Label_0595:
                inc:int(var_9_B4, ldc:int(-1))
            }
            
            return:double(add:double(loadelement:double(var_6_74:double[], and:int(ldc:int(-24939), ldc:int(24938))), loadelement:double(var_6_74:double[], and:int(ldc:int(4355), ldc:int(533)))))
        }
        
        goto(Label_0006)
    }
    
    public static double \u71ae\u392e\ua6bd\u3dd3\uc7fe\uc29a(double p0, double[] p1) {
        var_3_5F : int
        var_5_69 : double[]
        var_6_74 : double[]
        var_7_7F : double[]
        var_8_8A : double[]
        var_9_B4 : int
        
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
            var_3_5F = and:int(ldc:int(2001091610), ldc:int(2069593007))
            var_5_69 = newarray:double[](double.class, and:int(ldc:int(278), ldc:int(17418)))
            var_6_74 = newarray:double[](double.class, xor:int(ldc:int(769), ldc:int(771)))
            var_7_7F = newarray:double[](double.class, and:int(ldc:int(282), ldc:int(9411)))
            var_8_8A = newarray:double[](double.class, and:int(ldc:int(12358), ldc:int(282)))
            invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u6bb9\u5d20\u36d3\u88c5\u4e72\u494c, p0:double, var_5_69:double[])
            storeelement:double(var_6_74:double[], and:int(ldc:int(6496), ldc:int(-6633)), storeelement:double(var_6_74:double[], and:int(ldc:int(24641), ldc:int(3379)), ldc:double(0.0)))
            var_9_B4 = sub:int(arraylength:int(getstatic:double[](\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u69d9\u8640\uc229\ud51e\u156b\u8389)), xor:int(ldc:int(24648), ldc:int(24649)))
            
            loop {
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(2048)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-27222678))
                    
                    if (cmpge:boolean(var_9_B4:int, ldc:int(0))) {
                        invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u156b\u69d9\u4975\u0b8e\u3d4b\ud12e, var_5_69:double[], var_6_74:double[], var_8_8A:double[])
                        storeelement:double(var_6_74:double[], and:int(ldc:int(8940), ldc:int(-8942)), loadelement:double(var_8_8A:double[], and:int(ldc:int(-20927), ldc:int(20924))))
                        storeelement:double(var_6_74:double[], xor:int(ldc:int(8208), ldc:int(8209)), loadelement:double(var_8_8A:double[], and:int(ldc:int(1439), ldc:int(8737))))
                        invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u6bb9\u5d20\u36d3\u88c5\u4e72\u494c, loadelement:double(getstatic:double[](\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u69d9\u8640\uc229\ud51e\u156b\u8389), var_9_B4:int), var_8_8A:double[])
                        invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\ufcaf\uc84e\u0800\u67e9\u446c\uf9c5, var_8_8A:double[], var_7_7F:double[])
                        invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\ub32d\u8258\u6c52\u4daf\uae5d\u93a2, var_6_74:double[], var_7_7F:double[], var_8_8A:double[])
                        storeelement:double(var_6_74:double[], and:int(ldc:int(-15601), ldc:int(13552)), loadelement:double(var_8_8A:double[], and:int(ldc:int(17499), ldc:int(-27996))))
                        storeelement:double(var_6_74:double[], and:int(ldc:int(17089), ldc:int(14353)), loadelement:double(var_8_8A:double[], and:int(ldc:int(22025), ldc:int(2097))))
                        inc:int(var_9_B4, ldc:int(-1))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(2147483647)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            if (cmpne:boolean(p1:double[], aconstnull:double[]())) {
                storeelement:double(p1:double[], and:int(ldc:int(-2269), ldc:int(2204)), loadelement:double(var_6_74:double[], and:int(ldc:int(16470), ldc:int(-16471))))
                storeelement:double(p1:double[], xor:int(ldc:int(264), ldc:int(265)), loadelement:double(var_6_74:double[], xor:int(ldc:int(260), ldc:int(261))))
            }
            
            return:double(add:double(loadelement:double(var_6_74:double[], and:int(ldc:int(-22748), ldc:int(22731))), loadelement:double(var_6_74:double[], xor:int(ldc:int(24720), ldc:int(24721)))))
        }
        
        goto(Label_0006)
    }
    
    private static void \u6bb9\u5d20\u36d3\u88c5\u4e72\u494c(double p0, double[] p1) {
        var_3_5F : int
        var_5_B6 : double
        
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
            var_3_5F = and:int(ldc:int(1747784190), ldc:int(1965935416))
            
            if (logicaland:boolean(cmplt:boolean(p0:double, ldc:double(8.0E298)), cmpgt:boolean(p0:double, ldc:double(-8.0E298)))) {
                var_5_B6 = mul:double(p0:double, ldc:double(1.073741824E9))
                storeelement:double(p1:double[], and:int(ldc:int(3794), ldc:int(-4091)), sub:double(add:double(p0:double, var_5_B6:double), var_5_B6:double))
                storeelement:double(p1:double[], and:int(ldc:int(17445), ldc:int(10833)), sub:double(p0:double, loadelement:double(p1:double[], and:int(ldc:int(16743), ldc:int(-16744)))))
            }
            else {
                var_3_5F = and:int(var_3_5F:int, ldc:int(-25829458))
                storeelement:double(p1:double[], and:int(ldc:int(-24324), ldc:int(24323)), mul:double(sub:double(add:double(p0:double, mul:double(p0:double, ldc:double(9.313225746154785E-10))), p0:double), ldc:double(1.073741824E9)))
                storeelement:double(p1:double[], xor:int(ldc:int(3), ldc:int(2)), sub:double(p0:double, loadelement:double(p1:double[], and:int(ldc:int(1211), ldc:int(-5372)))))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void \u5f50\uf94d\u8bb0\ua61f\u516c\ud171(double[] p0) {
        var_1_5F : int
        var_3_73 : double
        var_5_8A : double
        var_7_E5 : double
        
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
            var_1_5F = and:int(ldc:int(1263866361), ldc:int(-134237702))
            var_3_73 = add:double(loadelement:double(p0:double[], and:int(ldc:int(29225), ldc:int(-29226))), loadelement:double(p0:double[], and:int(ldc:int(11333), ldc:int(697))))
            var_5_8A = neg:double(sub:double(sub:double(var_3_73:double, loadelement:double(p0:double[], and:int(ldc:int(-27467), ldc:int(24906)))), loadelement:double(p0:double[], xor:int(ldc:int(5216), ldc:int(5217)))))
            
            if (logicaland:boolean(cmplt:boolean(var_3_73:double, ldc:double(8.0E298)), cmpgt:boolean(var_3_73:double, ldc:double(-8.0E298)))) {
                var_7_E5 = mul:double(var_3_73:double, ldc:double(1.073741824E9))
                storeelement:double(p0:double[], and:int(ldc:int(28950), ldc:int(-31007)), sub:double(add:double(var_3_73:double, var_7_E5:double), var_7_E5:double))
                storeelement:double(p0:double[], and:int(ldc:int(25361), ldc:int(9)), add:double(sub:double(var_3_73:double, loadelement:double(p0:double[], and:int(ldc:int(-26657), ldc:int(26656)))), var_5_8A:double))
            }
            else {
                var_1_5F = and:int(var_1_5F:int, ldc:int(1372962297))
                storeelement:double(p0:double[], and:int(ldc:int(-16198), ldc:int(5893)), mul:double(sub:double(add:double(var_3_73:double, mul:double(var_3_73:double, ldc:double(9.313225746154785E-10))), var_3_73:double), ldc:double(1.073741824E9)))
                storeelement:double(p0:double[], xor:int(ldc:int(-32383), ldc:int(-32384)), add:double(sub:double(var_3_73:double, loadelement:double(p0:double[], and:int(ldc:int(-31174), ldc:int(31109)))), var_5_8A:double))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void \u156b\u69d9\u4975\u0b8e\u3d4b\ud12e(double[] p0, double[] p1, double[] p2) {
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
            storeelement:double(p2:double[], and:int(ldc:int(-11356), ldc:int(11347)), mul:double(loadelement:double(p0:double[], and:int(ldc:int(-25600), ldc:int(9110))), loadelement:double(p1:double[], and:int(ldc:int(-6869), ldc:int(6868)))))
            storeelement:double(p2:double[], xor:int(ldc:int(12928), ldc:int(12929)), add:double(add:double(mul:double(loadelement:double(p0:double[], and:int(ldc:int(-12254), ldc:int(12172))), loadelement:double(p1:double[], xor:int(ldc:int(14848), ldc:int(14849)))), mul:double(loadelement:double(p0:double[], and:int(ldc:int(1425), ldc:int(10795))), loadelement:double(p1:double[], and:int(ldc:int(-7108), ldc:int(7107))))), mul:double(loadelement:double(p0:double[], and:int(ldc:int(4099), ldc:int(17445))), loadelement:double(p1:double[], xor:int(ldc:int(17680), ldc:int(17681))))))
            invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u5f50\uf94d\u8bb0\ua61f\u516c\ud171, p2:double[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void \ub32d\u8258\u6c52\u4daf\uae5d\u93a2(double[] p0, double[] p1, double[] p2) {
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
            storeelement:double(p2:double[], and:int(ldc:int(-7240), ldc:int(7239)), add:double(loadelement:double(p0:double[], and:int(ldc:int(3251), ldc:int(-7348))), loadelement:double(p1:double[], and:int(ldc:int(-17591), ldc:int(1206)))))
            storeelement:double(p2:double[], xor:int(ldc:int(4104), ldc:int(4105)), add:double(loadelement:double(p0:double[], and:int(ldc:int(8833), ldc:int(21523))), loadelement:double(p1:double[], xor:int(ldc:int(9222), ldc:int(9223)))))
            invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u5f50\uf94d\u8bb0\ua61f\u516c\ud171, p2:double[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \ufcaf\uc84e\u0800\u67e9\u446c\uf9c5(double[] p0, double[] p1) {
        var_2_83 : int
        var_8_11B : int
        var_9_1D7 : double
        expr_1E0 : int [generated]
        
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
            var_2_83 = and:int(ldc:int(1598460430), ldc:int(-1786848562))
            
            if (cmpeq:boolean(loadelement:double(p0:double[], and:int(ldc:int(23280), ldc:int(-23281))), ldc:double(0.0))) {
                storeelement:double(p0:double[], and:int(ldc:int(-11269), ldc:int(11268)), loadelement:double(p0:double[], xor:int(ldc:int(-30591), ldc:int(-30592))))
                storeelement:double(p0:double[], xor:int(ldc:int(384), ldc:int(385)), ldc:double(0.0))
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_2_83:int, ldc:int(256)), ldc:int(0))) {
                    var_2_83 = and:int(var_2_83:int, ldc:int(-1278829777))
                    storeelement:double(p1:double[], and:int(ldc:int(-15678), ldc:int(13573)), div:double(ldc:double(0.9999997615814209), loadelement:double(p0:double[], and:int(ldc:int(-30118), ldc:int(29989)))))
                    storeelement:double(p1:double[], xor:int(ldc:int(16466), ldc:int(16467)), div:double(sub:double(mul:double(ldc:double(2.384185791015625E-7), loadelement:double(p0:double[], and:int(ldc:int(9864), ldc:int(-9869)))), mul:double(ldc:double(0.9999997615814209), loadelement:double(p0:double[], and:int(ldc:int(17425), ldc:int(97))))), add:double(mul:double(loadelement:double(p0:double[], and:int(ldc:int(3162), ldc:int(-3163))), loadelement:double(p0:double[], and:int(ldc:int(-6020), ldc:int(5507)))), mul:double(loadelement:double(p0:double[], and:int(ldc:int(-12345), ldc:int(12344))), loadelement:double(p0:double[], xor:int(ldc:int(66), ldc:int(67)))))))
                    
                    if (cmpne:boolean(loadelement:double(p1:double[], and:int(ldc:int(2411), ldc:int(1553))), loadelement:double(p1:double[], and:int(ldc:int(65), ldc:int(4357))))) {
                        storeelement:double(p1:double[], xor:int(ldc:int(3585), ldc:int(3584)), ldc:double(0.0))
                    }
                }
                
                if (cmpeq:boolean(and:int(var_2_83:int, ldc:int(1048576)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_83 = and:int(var_2_83:int, ldc:int(1263506554))
            }
            
            invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u5f50\uf94d\u8bb0\ua61f\u516c\ud171, p1:double[])
            var_8_11B = and:int(ldc:int(-11117), ldc:int(9068))
            
            while (cmplt:boolean(var_8_11B:int, xor:int(ldc:int(11776), ldc:int(11778)))) {
                var_9_1D7 = mul:double(sub:double(sub:double(sub:double(sub:double(ldc:double(1.0), mul:double(loadelement:double(p1:double[], and:int(ldc:int(-15822), ldc:int(11533))), loadelement:double(p0:double[], and:int(ldc:int(25059), ldc:int(-25572))))), mul:double(loadelement:double(p1:double[], and:int(ldc:int(-1631), ldc:int(1622))), loadelement:double(p0:double[], and:int(ldc:int(8449), ldc:int(6209))))), mul:double(loadelement:double(p1:double[], xor:int(ldc:int(544), ldc:int(545))), loadelement:double(p0:double[], and:int(ldc:int(3125), ldc:int(-3126))))), mul:double(loadelement:double(p1:double[], and:int(ldc:int(3153), ldc:int(8449))), loadelement:double(p0:double[], xor:int(ldc:int(1554), ldc:int(1555))))), add:double(loadelement:double(p1:double[], and:int(ldc:int(-10836), ldc:int(2643))), loadelement:double(p1:double[], xor:int(ldc:int(4098), ldc:int(4099)))))
                expr_1E0 = xor:int(ldc:int(116), ldc:int(117))
                storeelement:double(p1:double[], expr_1E0:int, add:double(loadelement:double(p1:double[], expr_1E0:int), var_9_1D7:double))
                inc:int(var_8_11B, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void \u7d52\uc31c\u47c2\u927d\ud171\uff55(double[] p0, double[] p1, double[] p2) {
        var_5_69 : double[]
        var_6_74 : double[]
        var_7_7F : double[]
        var_8_F7 : double
        expr_100 : int [generated]
        var_8_13B : double
        expr_144 : int [generated]
        var_8_1A4 : double
        expr_1AD : int [generated]
        var_8_1E8 : double
        expr_1F1 : int [generated]
        var_8_251 : double
        expr_25A : int [generated]
        var_8_295 : double
        expr_29E : int [generated]
        
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
            var_5_69 = newarray:double[](double.class, and:int(ldc:int(3), ldc:int(16642)))
            var_6_74 = newarray:double[](double.class, and:int(ldc:int(194), ldc:int(24595)))
            var_7_7F = newarray:double[](double.class, and:int(ldc:int(7), ldc:int(17410)))
            invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u6bb9\u5d20\u36d3\u88c5\u4e72\u494c, loadelement:double(p0:double[], and:int(ldc:int(11670), ldc:int(-11671))), var_5_69:double[])
            invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u6bb9\u5d20\u36d3\u88c5\u4e72\u494c, loadelement:double(p1:double[], and:int(ldc:int(-26931), ldc:int(24882))), var_6_74:double[])
            invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u156b\u69d9\u4975\u0b8e\u3d4b\ud12e, var_5_69:double[], var_6_74:double[], var_7_7F:double[])
            storeelement:double(p2:double[], and:int(ldc:int(-281), ldc:int(280)), loadelement:double(var_7_7F:double[], and:int(ldc:int(-14590), ldc:int(12537))))
            storeelement:double(p2:double[], xor:int(ldc:int(232), ldc:int(233)), loadelement:double(var_7_7F:double[], and:int(ldc:int(97), ldc:int(16391))))
            invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u6bb9\u5d20\u36d3\u88c5\u4e72\u494c, loadelement:double(p1:double[], xor:int(ldc:int(8256), ldc:int(8257))), var_6_74:double[])
            invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u156b\u69d9\u4975\u0b8e\u3d4b\ud12e, var_5_69:double[], var_6_74:double[], var_7_7F:double[])
            var_8_F7 = add:double(loadelement:double(p2:double[], and:int(ldc:int(2061), ldc:int(-2062))), loadelement:double(var_7_7F:double[], and:int(ldc:int(-20059), ldc:int(18522))))
            expr_100 = xor:int(ldc:int(-28607), ldc:int(-28608))
            storeelement:double(p2:double[], expr_100:int, sub:double(loadelement:double(p2:double[], expr_100:int), sub:double(sub:double(var_8_F7:double, loadelement:double(p2:double[], and:int(ldc:int(10394), ldc:int(-26779)))), loadelement:double(var_7_7F:double[], and:int(ldc:int(13964), ldc:int(-32765))))))
            storeelement:double(p2:double[], and:int(ldc:int(2661), ldc:int(-2662)), var_8_F7:double)
            var_8_13B = add:double(loadelement:double(p2:double[], and:int(ldc:int(6419), ldc:int(-16148))), loadelement:double(var_7_7F:double[], and:int(ldc:int(1113), ldc:int(8711))))
            expr_144 = and:int(ldc:int(18539), ldc:int(13329))
            storeelement:double(p2:double[], expr_144:int, sub:double(loadelement:double(p2:double[], expr_144:int), sub:double(sub:double(var_8_13B:double, loadelement:double(p2:double[], and:int(ldc:int(6241), ldc:int(-6242)))), loadelement:double(var_7_7F:double[], and:int(ldc:int(151), ldc:int(8201))))))
            storeelement:double(p2:double[], and:int(ldc:int(-31494), ldc:int(21253)), var_8_13B:double)
            invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u6bb9\u5d20\u36d3\u88c5\u4e72\u494c, loadelement:double(p0:double[], xor:int(ldc:int(12336), ldc:int(12337))), var_5_69:double[])
            invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u6bb9\u5d20\u36d3\u88c5\u4e72\u494c, loadelement:double(p1:double[], and:int(ldc:int(-1820), ldc:int(1819))), var_6_74:double[])
            invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u156b\u69d9\u4975\u0b8e\u3d4b\ud12e, var_5_69:double[], var_6_74:double[], var_7_7F:double[])
            var_8_1A4 = add:double(loadelement:double(p2:double[], and:int(ldc:int(-14425), ldc:int(6232))), loadelement:double(var_7_7F:double[], and:int(ldc:int(1299), ldc:int(-10036))))
            expr_1AD = xor:int(ldc:int(16896), ldc:int(16897))
            storeelement:double(p2:double[], expr_1AD:int, sub:double(loadelement:double(p2:double[], expr_1AD:int), sub:double(sub:double(var_8_1A4:double, loadelement:double(p2:double[], and:int(ldc:int(-19264), ldc:int(18697)))), loadelement:double(var_7_7F:double[], and:int(ldc:int(21482), ldc:int(-21484))))))
            storeelement:double(p2:double[], and:int(ldc:int(31810), ldc:int(-32228)), var_8_1A4:double)
            var_8_1E8 = add:double(loadelement:double(p2:double[], and:int(ldc:int(-27352), ldc:int(26823))), loadelement:double(var_7_7F:double[], and:int(ldc:int(6145), ldc:int(9917))))
            expr_1F1 = xor:int(ldc:int(3216), ldc:int(3217))
            storeelement:double(p2:double[], expr_1F1:int, sub:double(loadelement:double(p2:double[], expr_1F1:int), sub:double(sub:double(var_8_1E8:double, loadelement:double(p2:double[], and:int(ldc:int(28710), ldc:int(-30832)))), loadelement:double(var_7_7F:double[], xor:int(ldc:int(-32635), ldc:int(-32636))))))
            storeelement:double(p2:double[], and:int(ldc:int(1381), ldc:int(-9590)), var_8_1E8:double)
            invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u6bb9\u5d20\u36d3\u88c5\u4e72\u494c, loadelement:double(p0:double[], and:int(ldc:int(565), ldc:int(1153))), var_5_69:double[])
            invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u6bb9\u5d20\u36d3\u88c5\u4e72\u494c, loadelement:double(p1:double[], and:int(ldc:int(265), ldc:int(16433))), var_6_74:double[])
            invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u156b\u69d9\u4975\u0b8e\u3d4b\ud12e, var_5_69:double[], var_6_74:double[], var_7_7F:double[])
            var_8_251 = add:double(loadelement:double(p2:double[], and:int(ldc:int(-10635), ldc:int(10626))), loadelement:double(var_7_7F:double[], and:int(ldc:int(-11449), ldc:int(11448))))
            expr_25A = and:int(ldc:int(17921), ldc:int(10403))
            storeelement:double(p2:double[], expr_25A:int, sub:double(loadelement:double(p2:double[], expr_25A:int), sub:double(sub:double(var_8_251:double, loadelement:double(p2:double[], and:int(ldc:int(6421), ldc:int(-6520)))), loadelement:double(var_7_7F:double[], and:int(ldc:int(11688), ldc:int(-11689))))))
            storeelement:double(p2:double[], and:int(ldc:int(-7344), ldc:int(7307)), var_8_251:double)
            var_8_295 = add:double(loadelement:double(p2:double[], and:int(ldc:int(-14421), ldc:int(14420))), loadelement:double(var_7_7F:double[], and:int(ldc:int(6273), ldc:int(16997))))
            expr_29E = xor:int(ldc:int(-32478), ldc:int(-32477))
            storeelement:double(p2:double[], expr_29E:int, sub:double(loadelement:double(p2:double[], expr_29E:int), sub:double(sub:double(var_8_295:double, loadelement:double(p2:double[], and:int(ldc:int(5012), ldc:int(-5013)))), loadelement:double(var_7_7F:double[], xor:int(ldc:int(16419), ldc:int(16418))))))
            storeelement:double(p2:double[], and:int(ldc:int(6692), ldc:int(-7781)), var_8_295:double)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static double \u5db4\ucef1\ucef1\u6fb0\uc3e3\u1187(int p0, double[] p1) {
        var_2_BB : int
        var_4_69 : double[]
        var_5_74 : double[]
        var_6_7F : double[]
        
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
            var_2_BB = and:int(ldc:int(-1259242812), ldc:int(1073434075))
            var_4_69 = newarray:double[](double.class, xor:int(ldc:int(2), ldc:int(0)))
            var_5_74 = newarray:double[](double.class, xor:int(ldc:int(16449), ldc:int(16451)))
            var_6_7F = newarray:double[](double.class, xor:int(ldc:int(-32237), ldc:int(-32239)))
            storeelement:double(var_4_69:double[], and:int(ldc:int(-25382), ldc:int(25381)), ldc:double(2.718281828459045))
            storeelement:double(var_4_69:double[], xor:int(ldc:int(-27632), ldc:int(-27631)), ldc:double(1.4456468917292502E-16))
            invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u6bb9\u5d20\u36d3\u88c5\u4e72\u494c, ldc:double(1.0), var_6_7F:double[])
            
            loop {
                if (cmpne:boolean(and:int(var_2_BB:int, ldc:int(8)), ldc:int(0))) {
                    var_2_BB = and:int(var_2_BB:int, ldc:int(538255631))
                    goto(Label_0231)
                }
                
                if (cmpeq:boolean(and:int(var_2_BB:int, ldc:int(131072)), ldc:int(0))) {
                    var_2_BB = and:int(var_2_BB:int, ldc:int(-324462353))
                    
                    if (cmpgt:boolean(p0:int, ldc:int(0))) {
                        if (cmpne:boolean(and:int(p0:int, xor:int(ldc:int(-24192), ldc:int(-24191))), ldc:int(0))) {
                            invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u7d52\uc31c\u47c2\u927d\ud171\uff55, var_6_7F:double[], var_4_69:double[], var_5_74:double[])
                            storeelement:double(var_6_7F:double[], and:int(ldc:int(24647), ldc:int(-24696)), loadelement:double(var_5_74:double[], and:int(ldc:int(25064), ldc:int(-28669))))
                            storeelement:double(var_6_7F:double[], xor:int(ldc:int(17504), ldc:int(17505)), loadelement:double(var_5_74:double[], and:int(ldc:int(51), ldc:int(20737))))
                        }
                        
                        var_2_BB = and:int(var_2_BB:int, ldc:int(-50890022))
                        invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u7d52\uc31c\u47c2\u927d\ud171\uff55, var_4_69:double[], var_4_69:double[], var_5_74:double[])
                        storeelement:double(var_4_69:double[], and:int(ldc:int(12108), ldc:int(-28525)), loadelement:double(var_5_74:double[], and:int(ldc:int(-30245), ldc:int(30240))))
                        storeelement:double(var_4_69:double[], xor:int(ldc:int(2080), ldc:int(2081)), loadelement:double(var_5_74:double[], xor:int(ldc:int(-30720), ldc:int(-30719))))
                        p0 = shr:int(p0:int, xor:int(ldc:int(16521), ldc:int(16520)))
                        loopcontinue()
                    }
                }
                
                Label_0192:
                
                if (cmpeq:boolean(and:int(var_2_BB:int, ldc:int(8388608)), ldc:int(0))) {
                    var_2_BB = and:int(var_2_BB:int, ldc:int(1574991666))
                }
                else {
                    if (cmpne:boolean(and:int(var_2_BB:int, ldc:int(8)), ldc:int(0))) {
                        var_2_BB = and:int(var_2_BB:int, ldc:int(-1240474278))
                        loopcontinue()
                    }
                    
                    var_2_BB = and:int(var_2_BB:int, ldc:int(935673809))
                    
                    if (cmpne:boolean(p1:double[], aconstnull:double[]())) {
                        storeelement:double(p1:double[], and:int(ldc:int(-1038), ldc:int(1037)), loadelement:double(var_6_7F:double[], and:int(ldc:int(-10314), ldc:int(10313))))
                        storeelement:double(p1:double[], and:int(ldc:int(20755), ldc:int(3201)), loadelement:double(var_6_7F:double[], xor:int(ldc:int(-32568), ldc:int(-32567))))
                        invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u5f50\uf94d\u8bb0\ua61f\u516c\ud171, p1:double[])
                    }
                }
                
                Label_0231:
                
                if (cmpne:boolean(and:int(var_2_BB:int, ldc:int(8)), ldc:int(0))) {
                    goto(Label_0192)
                }
                
                if (cmpeq:boolean(and:int(var_2_BB:int, ldc:int(134217728)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:double(add:double(loadelement:double(var_6_7F:double[], and:int(ldc:int(12825), ldc:int(-12826))), loadelement:double(var_6_7F:double[], and:int(ldc:int(2681), ldc:int(5379)))))
        }
        
        goto(Label_0006)
    }
    
    public static double[] \uc2e8\u7873\u9af2\ub18d\u5d20\u4bc8(double p0) {
        var_2_5F : int
        var_4_69 : double[]
        var_5_74 : double[]
        var_6_7F : double[]
        var_7_8A : double[]
        expr_92 : double[] [generated]
        expr_9A : int [generated]
        expr_AC : double[] [generated]
        expr_B4 : int [generated]
        var_8_14B : int
        
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
            var_2_5F = and:int(ldc:int(-20505166), ldc:int(-689529860))
            var_4_69 = newarray:double[](double.class, and:int(ldc:int(582), ldc:int(6170)))
            var_5_74 = newarray:double[](double.class, and:int(ldc:int(1538), ldc:int(12546)))
            var_6_7F = newarray:double[](double.class, and:int(ldc:int(1074), ldc:int(386)))
            var_7_8A = newarray:double[](double.class, and:int(ldc:int(4234), ldc:int(25346)))
            invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u6bb9\u5d20\u36d3\u88c5\u4e72\u494c, p0:double, var_4_69:double[])
            expr_92 = var_4_69:double[]
            expr_9A = and:int(ldc:int(-25323), ldc:int(17002))
            storeelement:double(expr_92:double[], expr_9A:int, add:double(loadelement:double(expr_92:double[], expr_9A:int), ldc:double(1.0)))
            invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u5f50\uf94d\u8bb0\ua61f\u516c\ud171, var_4_69:double[])
            invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\ufcaf\uc84e\u0800\u67e9\u446c\uf9c5, var_4_69:double[], var_7_8A:double[])
            expr_AC = var_4_69:double[]
            expr_B4 = and:int(ldc:int(-12631), ldc:int(12630))
            storeelement:double(expr_AC:double[], expr_B4:int, sub:double(loadelement:double(expr_AC:double[], expr_B4:int), ldc:double(2.0)))
            invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u5f50\uf94d\u8bb0\ua61f\u516c\ud171, var_4_69:double[])
            invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u156b\u69d9\u4975\u0b8e\u3d4b\ud12e, var_4_69:double[], var_7_8A:double[], var_6_7F:double[])
            storeelement:double(var_4_69:double[], and:int(ldc:int(9400), ldc:int(-9401)), loadelement:double(var_6_7F:double[], and:int(ldc:int(-23980), ldc:int(23819))))
            storeelement:double(var_4_69:double[], and:int(ldc:int(297), ldc:int(24723)), loadelement:double(var_6_7F:double[], and:int(ldc:int(675), ldc:int(9233))))
            invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u156b\u69d9\u4975\u0b8e\u3d4b\ud12e, var_4_69:double[], var_4_69:double[], var_5_74:double[])
            storeelement:double(var_6_7F:double[], and:int(ldc:int(-24507), ldc:int(18226)), loadelement:double(loadelement:double[](getstatic:double[][](\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u8c8a\u51fa\u51fa\u1833\u34df\u4bc8), sub:int(arraylength:int(getstatic:double[][](\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u8c8a\u51fa\u51fa\u1833\u34df\u4bc8)), and:int(ldc:int(18409), ldc:int(2053)))), and:int(ldc:int(7844), ldc:int(-7846))))
            storeelement:double(var_6_7F:double[], xor:int(ldc:int(-16096), ldc:int(-16095)), loadelement:double(loadelement:double[](getstatic:double[][](\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u8c8a\u51fa\u51fa\u1833\u34df\u4bc8), sub:int(arraylength:int(getstatic:double[][](\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u8c8a\u51fa\u51fa\u1833\u34df\u4bc8)), xor:int(ldc:int(12336), ldc:int(12337)))), and:int(ldc:int(1), ldc:int(17281))))
            var_8_14B = sub:int(arraylength:int(getstatic:double[][](\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u8c8a\u51fa\u51fa\u1833\u34df\u4bc8)), xor:int(ldc:int(139), ldc:int(137)))
            
            loop {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-771082349))
                
                if (cmplt:boolean(var_8_14B:int, ldc:int(0))) {
                    looporswitchbreak()
                }
                
                invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u156b\u69d9\u4975\u0b8e\u3d4b\ud12e, var_6_7F:double[], var_5_74:double[], var_7_8A:double[])
                storeelement:double(var_6_7F:double[], and:int(ldc:int(8016), ldc:int(-24401)), loadelement:double(var_7_8A:double[], and:int(ldc:int(-27125), ldc:int(25076))))
                storeelement:double(var_6_7F:double[], and:int(ldc:int(577), ldc:int(20753)), loadelement:double(var_7_8A:double[], and:int(ldc:int(35), ldc:int(8201))))
                invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\ub32d\u8258\u6c52\u4daf\uae5d\u93a2, var_6_7F:double[], loadelement:double[](getstatic:double[][](\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u8c8a\u51fa\u51fa\u1833\u34df\u4bc8), var_8_14B:int), var_7_8A:double[])
                storeelement:double(var_6_7F:double[], and:int(ldc:int(-23221), ldc:int(18580)), loadelement:double(var_7_8A:double[], and:int(ldc:int(27666), ldc:int(-27667))))
                storeelement:double(var_6_7F:double[], xor:int(ldc:int(8707), ldc:int(8706)), loadelement:double(var_7_8A:double[], xor:int(ldc:int(2160), ldc:int(2161))))
                inc:int(var_8_14B, ldc:int(-1))
            }
            
            invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u156b\u69d9\u4975\u0b8e\u3d4b\ud12e, var_6_7F:double[], var_4_69:double[], var_7_8A:double[])
            storeelement:double(var_6_7F:double[], and:int(ldc:int(-26074), ldc:int(17881)), loadelement:double(var_7_8A:double[], and:int(ldc:int(-10701), ldc:int(10636))))
            storeelement:double(var_6_7F:double[], xor:int(ldc:int(18449), ldc:int(18448)), loadelement:double(var_7_8A:double[], xor:int(ldc:int(72), ldc:int(73))))
            return:double[](var_6_7F:double[])
        }
        
        goto(Label_0006)
    }
    
    public static void \u3e2a\u3bd6\u52d3\u3dd3\u3776\uc4d2(java.io.PrintStream p0, java.lang.String p1, int p2, double[][] p3) {
        var_4_61 : int
        var_6_84 : int
        var_8_8C : int
        var_9_95 : int
        var_10_C5 : double[]
        var_11_D8 : double[]
        var_12_DD : int
        var_13_E6 : int
        var_14_122 : double
        stack_148_1 : String [generated]
        expr_137 : Object[] [generated]
        
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
            var_4_61 = and:int(ldc:int(1192996348), ldc:int(1337953783))
            invokevirtual:void(PrintStream::println, p0:PrintStream, p1:String)
            invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u946b\ucb79\u6198\u8709\u74b1\u9937, p2:int, arraylength:int(p3:double[][]))
            invokevirtual:void(PrintStream::println, p0:PrintStream, loadelement:String(getstatic:String[](\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\uc910\uf94d\ua6bd\u97e6\ub171\u4179), and:int(ldc:int(17419), ldc:int(-17420))))
            var_6_84 = and:int(ldc:int(19484), ldc:int(-19485))
            var_8_8C = arraylength:int(p3:double[][])
            var_9_95 = and:int(ldc:int(5914), ldc:int(-5915))
            
            loop {
                var_4_61 = and:int(var_4_61:int, ldc:int(-1223477354))
                
                if (cmpge:boolean(var_9_95:int, var_8_8C:int)) {
                    looporswitchbreak()
                }
                
                var_10_C5 = loadelement:double[](p3:double[][], var_9_95:int)
                invokevirtual:void(PrintStream::print, p0:PrintStream, loadelement:String(getstatic:String[](\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\uc910\uf94d\ua6bd\u97e6\ub171\u4179), xor:int(ldc:int(-32236), ldc:int(-32235))))
                var_11_D8 = var_10_C5:double[]
                var_12_DD = arraylength:int(var_11_D8:double[])
                var_13_E6 = and:int(ldc:int(2863), ldc:int(-27504))
                
                while (cmplt:boolean(var_13_E6:int, var_12_DD:int)) {
                    var_14_122 = loadelement:double(var_11_D8:double[], var_13_E6:int)
                    stack_148_1 = loadelement:String(getstatic:String[](\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\uc910\uf94d\ua6bd\u97e6\ub171\u4179), and:int(ldc:int(3490), ldc:int(518)))
                    expr_137 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(25096), ldc:int(25097)))
                    storeelement:Object(expr_137:Object[], and:int(ldc:int(-14175), ldc:int(13658)), invokestatic:String[expected:Object](\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u5bc4\u6198\uf94d\u0800\u71ae\u72f1, var_14_122:double))
                    invokevirtual:PrintStream(PrintStream::printf, p0:PrintStream, stack_148_1:String, expr_137:Object[])
                    inc:int(var_13_E6, ldc:int(1))
                }
                
                invokevirtual:void(PrintStream::println, p0:PrintStream, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\uc910\uf94d\ua6bd\u97e6\ub171\u4179), and:int(ldc:int(11419), ldc:int(3)))), postincrement:int(1, var_6_84:int))))
                inc:int(var_9_95, ldc:int(1))
            }
            
            invokevirtual:void(PrintStream::println, p0:PrintStream, loadelement:String(getstatic:String[](\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\uc910\uf94d\ua6bd\u97e6\ub171\u4179), and:int(ldc:int(1302), ldc:int(6309))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u3e2a\u3bd6\u52d3\u3dd3\u3776\uc4d2(java.io.PrintStream p0, java.lang.String p1, int p2, double[] p3) {
        var_4_63 : int
        var_7_A0 : int
        var_8_A9 : int
        var_9_DB : double
        stack_101_1 : String [generated]
        expr_F0 : Object[] [generated]
        
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
            var_4_63 = and:int(ldc:int(-254536535), ldc:int(-739967601))
            invokevirtual:void(PrintStream::println, p0:PrintStream, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), p1:String), loadelement:String(getstatic:String[](\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\uc910\uf94d\ua6bd\u97e6\ub171\u4179), and:int(ldc:int(5), ldc:int(27317))))))
            invokestatic:void(\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u946b\ucb79\u6198\u8709\u74b1\u9937, p2:int, arraylength:int(p3:double[]))
            invokevirtual:void(PrintStream::println, p0:PrintStream, loadelement:String(getstatic:String[](\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\uc910\uf94d\ua6bd\u97e6\ub171\u4179), and:int(ldc:int(18567), ldc:int(62))))
            var_7_A0 = arraylength:int(p3:double[])
            var_8_A9 = and:int(ldc:int(-9265), ldc:int(9264))
            
            loop {
                var_4_63 = and:int(var_4_63:int, ldc:int(-140132))
                
                if (cmpge:boolean(var_8_A9:int, var_7_A0:int)) {
                    looporswitchbreak()
                }
                
                var_9_DB = loadelement:double(p3:double[], var_8_A9:int)
                stack_101_1 = loadelement:String(getstatic:String[](\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\uc910\uf94d\ua6bd\u97e6\ub171\u4179), and:int(ldc:int(23), ldc:int(30759)))
                expr_F0 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(1052), ldc:int(1053)))
                storeelement:Object(expr_F0:Object[], and:int(ldc:int(26899), ldc:int(-26912)), invokestatic:String[expected:Object](\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u5bc4\u6198\uf94d\u0800\u71ae\u72f1, var_9_DB:double))
                invokevirtual:PrintStream(PrintStream::printf, p0:PrintStream, stack_101_1:String, expr_F0:Object[])
                inc:int(var_8_A9, ldc:int(1))
            }
            
            invokevirtual:void(PrintStream::println, p0:PrintStream, loadelement:String(getstatic:String[](\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\uc910\uf94d\ua6bd\u97e6\ub171\u4179), xor:int(ldc:int(-28669), ldc:int(-28665))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static java.lang.String \u5bc4\u6198\uf94d\u0800\u71ae\u72f1(double p0) {
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
        
        if (cmpeq:boolean(p0:double, p0:double)) {
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ternaryop:String(cmplt:boolean(p0:double, ldc:double(0.0)), loadelement:String(getstatic:String[](\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\uc910\uf94d\ua6bd\u97e6\ub171\u4179), and:int(ldc:int(7226), ldc:int(142))), loadelement:String(getstatic:String[](\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\uc910\uf94d\ua6bd\u97e6\ub171\u4179), xor:int(ldc:int(577), ldc:int(584))))), invokestatic:String(Double::toString, p0:double)), loadelement:String(getstatic:String[](\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\uc910\uf94d\ua6bd\u97e6\ub171\u4179), and:int(ldc:int(139), ldc:int(783))))))
        }
        
        return:String(loadelement:String(getstatic:String[](\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\uc910\uf94d\ua6bd\u97e6\ub171\u4179), and:int(ldc:int(1480), ldc:int(26649))))
    }
    
    private static void \u946b\ucb79\u6198\u8709\u74b1\u9937(int p0, int p1) {
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
        
        if (cmpeq:boolean(p0:int, p1:int)) {
            return:void()
        }
        
        athrow(initobject:\u7043\u183a\u927d\u56bd\u16f6\u67d0(\u7043\u183a\u927d\u56bd\u16f6\u67d0::<init>, p1:int, p0:int))
    }
    
    static {
        var_0_5E4 : int
        expr_6E : int [generated]
        stack_AC_0 : byte[] [generated]
        stack_AE_0 : byte[] [generated]
        stack_D1_0 : byte[] [generated]
        stack_D3_0 : byte[] [generated]
        stack_10A_0 : byte[] [generated]
        stack_10C_0 : byte[] [generated]
        stack_140_0 : byte[] [generated]
        stack_5F7_0 : byte[] [generated]
        stack_67B_0 : byte[] [generated]
        stack_6B6_0 : byte[] [generated]
        stack_70C_0 : byte[] [generated]
        var_4_5D0 : int
        var_3_5D5 : byte[]
        var_5_5D6 : int
        var_0_611 : int
        expr_5F7 : byte [generated]
        stack_63F_2 : byte [generated]
        stack_614_0 : byte [generated]
        expr_AE : int [generated]
        var_2_D1 : byte[]
        expr_D5 : int [generated]
        var_3_6A4 : byte[]
        var_5_6A5 : int
        expr_10C : int [generated]
        var_3_6FA : byte[]
        var_5_6FB : int
        expr_70C : byte [generated]
        var_3_14C : String
        stack_2A8_0 : String[] [generated]
        expr_15E : String[] [generated]
        expr_2AB : double[] [generated]
        expr_358 : double[][] [generated]
        stack_382_1 : int [generated]
        expr_36A : double[] [generated]
        stack_3AC_1 : int [generated]
        expr_392 : double[] [generated]
        stack_3D6_1 : int [generated]
        expr_3BC : double[] [generated]
        stack_400_1 : int [generated]
        expr_3E6 : double[] [generated]
        stack_42A_1 : int [generated]
        expr_410 : double[] [generated]
        stack_454_1 : int [generated]
        expr_43A : double[] [generated]
        stack_479_1 : int [generated]
        expr_45F : double[] [generated]
        stack_49E_1 : int [generated]
        expr_484 : double[] [generated]
        stack_4C3_1 : int [generated]
        expr_4A9 : double[] [generated]
        stack_4E8_1 : int [generated]
        expr_4CE : double[] [generated]
        stack_50D_1 : int [generated]
        expr_4F3 : double[] [generated]
        stack_532_1 : int [generated]
        expr_518 : double[] [generated]
        stack_557_1 : int [generated]
        expr_53D : double[] [generated]
        stack_57C_1 : int [generated]
        expr_562 : double[] [generated]
        stack_5A1_1 : int [generated]
        expr_587 : double[] [generated]
        stack_5C6_1 : int [generated]
        expr_5AC : double[] [generated]
        
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
        var_0_5E4 = and:int(ldc:int(-441175172), ldc:int(-1930068083))
        expr_6E = arraylength:int(stack_AC_0 = stack_AE_0 = stack_D1_0 = stack_D3_0 = stack_10A_0 = stack_10C_0 = stack_140_0 = stack_5F7_0 = stack_67B_0 = stack_6B6_0 = stack_70C_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("uAAAAAAAAANn6RRhOAAAAAAAAP5SsAAA/lKwAAD+UrAAAAD/TyX0Aop8egp/3BkLZnMGdQV8oPJujxTcIWeaGGgAmZI=")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_5D0 = expr_6E:int
        var_3_5D5 = newarray:byte[](byte.class, expr_6E:int)
        var_5_5D6 = expr_6E:int
        Label_1496:
        
        while (cmpeq:boolean(and:int(var_0_5E4:int, ldc:int(128)), ldc:int(0))) {
            var_0_611 = and:int(var_0_5E4:int, ldc:int(-595740305))
            var_5_5D6 = add:int(var_5_5D6:int, ldc:int(-1))
            expr_5F7 = stack_63F_2 = loadelement(stack_5F7_0, var_5_5D6)
            
            if (cmplt:boolean(add:int(add:int(var_5_5D6:int, ldc:int(1)), neg:int(var_4_5D0:int)), ldc:int(0))) {
                stack_63F_2 = stack_614_0 = add:byte(expr_5F7:byte, loadelement:byte(var_3_5D5:byte[], add:int(var_5_5D6:int, ldc:int(1))))
                goto(Label_1572)
            }
            
            Label_1540:
            
            if (cmpeq:boolean(and:int(var_0_611:int, ldc:int(16384)), ldc:int(0))) {
                var_0_611 = and:int(var_0_611:int, ldc:int(-1638548627))
                stack_63F_2 = stack_614_0 = add:byte(expr_5F7:byte, ldc:byte(1))
            }
            
            Label_1572:
            
            if (cmpne:boolean(and:int(var_0_611:int, ldc:int(128)), ldc:int(0))) {
                var_0_611 = and:int(var_0_611:int, ldc:int(1643825356))
                goto(Label_1540)
            }
            
            var_0_5E4 = and:int(var_0_611:int, ldc:int(-197380291))
            storeelement:byte(var_3_5D5:byte[], var_5_5D6:int, stack_63F_2:byte)
            
            if (cmpne:boolean(var_5_5D6:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AE_0 = stack_AC_0 = stack_D1_0 = stack_D3_0 = stack_10A_0 = stack_10C_0 = stack_140_0 = stack_5F7_0 = stack_67B_0 = stack_6B6_0 = stack_70C_0 = var_3_5D5:byte[]
            goto(Label_0115)
        }
        
        var_0_5E4 = and:int(var_0_5E4:int, ldc:int(-1344585599))
        Label_1637:
        
        while (cmpne:boolean(and:int(var_0_5E4:int, ldc:int(8192)), ldc:int(0))) {
            var_0_5E4 = and:int(var_0_5E4:int, ldc:int(-332058209))
            var_5_5D6 = add:int(var_5_5D6:int, ldc:int(-1))
            storeelement:byte(var_3_5D5:byte[], var_5_5D6:int, xor:byte(loadelement:byte(stack_67B_0:byte[], var_5_5D6:int), ldc:byte(75)))
            
            if (cmpne:boolean(var_5_5D6:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AE_0 = stack_AC_0 = stack_D1_0 = stack_D3_0 = stack_10A_0 = stack_10C_0 = stack_140_0 = stack_5F7_0 = stack_67B_0 = stack_6B6_0 = stack_70C_0 = var_3_5D5:byte[]
            goto(Label_0179)
        }
        
        goto(Label_1496)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_5E4:int, ldc:int(256)), ldc:int(0))) {
            var_0_5E4 = and:int(var_0_5E4:int, ldc:int(269532023))
            goto(Label_0273)
        }
        
        if (cmpeq:boolean(and:int(var_0_5E4:int, ldc:int(4)), ldc:int(0))) {
            var_0_5E4 = and:int(var_0_5E4:int, ldc:int(102070444))
            goto(Label_0218)
        }
        
        if (cmpeq:boolean(and:int(var_0_5E4:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_5E4 = and:int(var_0_5E4:int, ldc:int(1074455256))
        }
        else {
            var_0_5E4 = and:int(var_0_5E4:int, ldc:int(-1222692562))
            expr_AE = arraylength:int(stack_AE_0:byte[])
            
            if (cmpne:boolean(expr_AE:int, ldc:int(0))) {
                var_4_5D0 = expr_AE:int
                var_3_5D5 = newarray:byte[](byte.class, expr_AE:int)
                var_5_5D6 = expr_AE:int
                goto(Label_1637)
            }
        }
        
        Label_0179:
        
        if (cmpeq:boolean(and:int(var_0_5E4:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0273)
        }
        
        if (cmpeq:boolean(and:int(var_0_5E4:int, ldc:int(32768)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_5E4:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_5E4 = and:int(var_0_5E4:int, ldc:int(-46139459))
            var_2_D1 = stack_D1_0:byte[]
            expr_D5 = add:int(arraylength:int(stack_D3_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_D5:int, ldc:int(0))) {
                var_3_6A4 = newarray:byte[](byte.class, expr_D5:int)
                var_5_6A5 = expr_D5:int
                
                loop {
                    var_0_5E4 = and:int(var_0_5E4:int, ldc:int(-1262683729))
                    var_5_6A5 = add:int(var_5_6A5:int, ldc:int(-1))
                    storeelement:byte(var_3_6A4:byte[], var_5_6A5:int, add:int(shl:int(loadelement:byte(stack_6B6_0:byte[], var_5_6A5:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_D1:byte[], add:int(var_5_6A5:int, xor:int(ldc:int(9736), ldc:int(9737)))), ldc:int(3)), and:int(ldc:int(19487), ldc:int(223)))))
                    
                    if (cmpne:boolean(var_5_6A5:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_AE_0 = stack_AC_0 = stack_D1_0 = stack_D3_0 = stack_10A_0 = stack_10C_0 = stack_140_0 = stack_5F7_0 = stack_67B_0 = stack_6B6_0 = stack_70C_0 = var_3_6A4:byte[]
            }
        }
        
        Label_0218:
        
        if (cmpeq:boolean(and:int(var_0_5E4:int, ldc:int(4096)), ldc:int(0))) {
            var_0_5E4 = and:int(var_0_5E4:int, ldc:int(2083767312))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_5E4:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0179)
            }
            
            if (cmpeq:boolean(and:int(var_0_5E4:int, ldc:int(67108864)), ldc:int(0))) {
                var_0_5E4 = and:int(var_0_5E4:int, ldc:int(1437435682))
                goto(Label_0115)
            }
            
            var_0_5E4 = and:int(var_0_5E4:int, ldc:int(-1115703427))
            expr_10C = arraylength:int(stack_10C_0:byte[])
            
            if (cmpne:boolean(expr_10C:int, ldc:int(0))) {
                var_3_6FA = newarray:byte[](byte.class, expr_10C:int)
                var_5_6FB = expr_10C:int
                
                loop {
                    var_0_5E4 = and:int(var_0_5E4:int, ldc:int(-453018242))
                    var_5_6FB = add:int(var_5_6FB:int, ldc:int(-1))
                    expr_70C = loadelement:byte(stack_70C_0:byte[], var_5_6FB:int)
                    storeelement:byte(var_3_6FA:byte[], var_5_6FB:int, add:int(or:int(and:int(shl:int(expr_70C:byte, and:int(ldc:int(5260), ldc:int(263))), ldc:int(-16)), and:int(shr:int(expr_70C:byte[expected:int], xor:int(ldc:int(12561), ldc:int(12565))), ldc:int(15))), ldc:int(97)))
                    
                    if (cmpne:boolean(var_5_6FB:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_AE_0 = stack_AC_0 = stack_D1_0 = stack_D3_0 = stack_10A_0 = stack_10C_0 = stack_140_0 = stack_5F7_0 = stack_67B_0 = stack_6B6_0 = stack_70C_0 = var_3_6FA:byte[]
            }
        }
        
        Label_0273:
        
        if (cmpeq:boolean(and:int(var_0_5E4:int, ldc:int(67108864)), ldc:int(0))) {
            goto(Label_0218)
        }
        
        if (cmpeq:boolean(and:int(var_0_5E4:int, ldc:int(262144)), ldc:int(0))) {
            var_0_5E4 = and:int(var_0_5E4:int, ldc:int(-2028785713))
            goto(Label_0179)
        }
        
        if (cmpeq:boolean(and:int(var_0_5E4:int, ldc:int(256)), ldc:int(0))) {
            var_0_5E4 = and:int(var_0_5E4:int, ldc:int(-315556107))
            goto(Label_0115)
        }
        
        var_3_14C = initobject:String(String::<init>, stack_140_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_2A8_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-8185), ldc:int(-8181)))
        expr_15E = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(3229), ldc:int(8460)))
        storeelement:String(expr_15E:String[], and:int(ldc:int(7290), ldc:int(24975)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, and:int(ldc:int(-26444), ldc:int(843)), and:int(ldc:int(25001), ldc:int(-25002))))
        storeelement:String(expr_15E:String[], xor:int(ldc:int(20800), ldc:int(20807)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, and:int(ldc:int(11413), ldc:int(-27798)), and:int(ldc:int(396), ldc:int(16974))))
        storeelement:String(expr_15E:String[], and:int(ldc:int(67), ldc:int(23297)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, and:int(ldc:int(17487), ldc:int(268)), and:int(ldc:int(117), ldc:int(16405))))
        storeelement:String(expr_15E:String[], xor:int(ldc:int(-31488), ldc:int(-31482)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, and:int(ldc:int(1109), ldc:int(4253)), xor:int(ldc:int(-30714), ldc:int(-30692))))
        storeelement:String(expr_15E:String[], and:int(ldc:int(1089), ldc:int(-1090)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, xor:int(ldc:int(18443), ldc:int(18449)), and:int(ldc:int(1072), ldc:int(813))))
        storeelement:String(expr_15E:String[], and:int(ldc:int(8967), ldc:int(16388)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, xor:int(ldc:int(16567), ldc:int(16535)), and:int(ldc:int(17959), ldc:int(8294))))
        storeelement:String(expr_15E:String[], xor:int(ldc:int(2433), ldc:int(2435)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, and:int(ldc:int(302), ldc:int(8231)), xor:int(ldc:int(-24164), ldc:int(-24142))))
        storeelement:String(expr_15E:String[], xor:int(ldc:int(17939), ldc:int(17946)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, xor:int(ldc:int(28969), ldc:int(28935)), xor:int(ldc:int(2568), ldc:int(2599))))
        storeelement:String(expr_15E:String[], and:int(ldc:int(5653), ldc:int(18447)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, xor:int(ldc:int(2186), ldc:int(2213)), xor:int(ldc:int(1058), ldc:int(1042))))
        storeelement:String(expr_15E:String[], and:int(ldc:int(5449), ldc:int(2584)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, xor:int(ldc:int(16686), ldc:int(16670)), and:int(ldc:int(9147), ldc:int(7227))))
        storeelement:String(expr_15E:String[], and:int(ldc:int(1099), ldc:int(12555)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, xor:int(ldc:int(8211), ldc:int(8232)), and:int(ldc:int(19389), ldc:int(1087))))
        storeelement:String(expr_15E:String[], xor:int(ldc:int(2329), ldc:int(2330)), invokevirtual:String[expected:String](String::substring, var_3_14C:String, xor:int(ldc:int(4099), ldc:int(4158)), xor:int(ldc:int(265), ldc:int(330))))
        putstatic:String[](\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\uc910\uf94d\ua6bd\u97e6\ub171\u4179, expr_15E:String[])
        expr_2AB = newarray:double[](double.class, ldc:int(20))
        storeelement:double(expr_2AB:double[], and:int(ldc:int(17061), ldc:int(11)), storeelement:double(expr_2AB:double[], and:int(ldc:int(-29666), ldc:int(29601)), ldc:double(1.0)))
        storeelement:double(expr_2AB:double[], xor:int(ldc:int(-28659), ldc:int(-28657)), ldc:double(2.0))
        storeelement:double(expr_2AB:double[], and:int(ldc:int(135), ldc:int(18259)), ldc:double(6.0))
        storeelement:double(expr_2AB:double[], xor:int(ldc:int(8205), ldc:int(8201)), ldc:double(24.0))
        storeelement:double(expr_2AB:double[], xor:int(ldc:int(16404), ldc:int(16401)), ldc:double(120.0))
        storeelement:double(expr_2AB:double[], ldc:int(6), ldc:double(720.0))
        storeelement:double(expr_2AB:double[], ldc:int(7), ldc:double(5040.0))
        storeelement:double(expr_2AB:double[], ldc:int(8), ldc:double(40320.0))
        storeelement:double(expr_2AB:double[], ldc:int(9), ldc:double(362880.0))
        storeelement:double(expr_2AB:double[], ldc:int(10), ldc:double(3628800.0))
        storeelement:double(expr_2AB:double[], ldc:int(11), ldc:double(3.99168E7))
        storeelement:double(expr_2AB:double[], ldc:int(12), ldc:double(4.790016E8))
        storeelement:double(expr_2AB:double[], ldc:int(13), ldc:double(6.2270208E9))
        storeelement:double(expr_2AB:double[], ldc:int(14), ldc:double(8.71782912E10))
        storeelement:double(expr_2AB:double[], ldc:int(15), ldc:double(1.307674368E12))
        storeelement:double(expr_2AB:double[], ldc:int(16), ldc:double(2.0922789888E13))
        storeelement:double(expr_2AB:double[], ldc:int(17), ldc:double(3.55687428096E14))
        storeelement:double(expr_2AB:double[], ldc:int(18), ldc:double(6.402373705728E15))
        storeelement:double(expr_2AB:double[], ldc:int(19), ldc:double(1.21645100408832E17))
        putstatic:double[](\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u69d9\u8640\uc229\ud51e\u156b\u8389, expr_2AB:double[])
        expr_358 = newarray:double[][](double[].class, ldc:int(16))
        stack_382_1 = and:int(ldc:int(22682), ldc:int(-22747))
        expr_36A = newarray:double[](double.class, xor:int(ldc:int(132), ldc:int(134)))
        storeelement:double(expr_36A:double[], and:int(ldc:int(-5273), ldc:int(5272)), ldc:double(2.0))
        storeelement:double(expr_36A:double[], and:int(ldc:int(1157), ldc:int(18465)), ldc:double(0.0))
        storeelement:double[](expr_358:double[][], stack_382_1:int, expr_36A:double[])
        stack_3AC_1 = and:int(ldc:int(5697), ldc:int(18441))
        expr_392 = newarray:double[](double.class, and:int(ldc:int(290), ldc:int(518)))
        storeelement:double(expr_392:double[], and:int(ldc:int(-17888), ldc:int(16781)), ldc:double(0.6666666269302368))
        storeelement:double(expr_392:double[], and:int(ldc:int(8193), ldc:int(3347)), ldc:double(3.9736429850260626E-8))
        storeelement:double[](expr_358:double[][], stack_3AC_1:int, expr_392:double[])
        stack_3D6_1 = xor:int(ldc:int(9225), ldc:int(9227))
        expr_3BC = newarray:double[](double.class, xor:int(ldc:int(-32704), ldc:int(-32702)))
        storeelement:double(expr_3BC:double[], and:int(ldc:int(27305), ldc:int(-28394)), ldc:double(0.3999999761581421))
        storeelement:double(expr_3BC:double[], xor:int(ldc:int(18452), ldc:int(18453)), ldc:double(2.3841857910019882E-8))
        storeelement:double[](expr_358:double[][], stack_3D6_1:int, expr_3BC:double[])
        stack_400_1 = xor:int(ldc:int(8243), ldc:int(8240))
        expr_3E6 = newarray:double[](double.class, and:int(ldc:int(1155), ldc:int(20742)))
        storeelement:double(expr_3E6:double[], and:int(ldc:int(-7559), ldc:int(7430)), ldc:double(0.2857142686843872))
        storeelement:double(expr_3E6:double[], xor:int(ldc:int(14848), ldc:int(14849)), ldc:double(1.7029898543501842E-8))
        storeelement:double[](expr_358:double[][], stack_400_1:int, expr_3E6:double[])
        stack_42A_1 = and:int(ldc:int(13), ldc:int(20484))
        expr_410 = newarray:double[](double.class, and:int(ldc:int(546), ldc:int(16651)))
        storeelement:double(expr_410:double[], and:int(ldc:int(-21822), ldc:int(21557)), ldc:double(0.2222222089767456))
        storeelement:double(expr_410:double[], and:int(ldc:int(17), ldc:int(16965)), ldc:double(1.3245471311735498E-8))
        storeelement:double[](expr_358:double[][], stack_42A_1:int, expr_410:double[])
        stack_454_1 = and:int(ldc:int(14407), ldc:int(149))
        expr_43A = newarray:double[](double.class, xor:int(ldc:int(576), ldc:int(578)))
        storeelement:double(expr_43A:double[], and:int(ldc:int(-25185), ldc:int(25184)), ldc:double(0.1818181574344635))
        storeelement:double(expr_43A:double[], xor:int(ldc:int(2176), ldc:int(2177)), ldc:double(2.4384203044354907E-8))
        storeelement:double[](expr_358:double[][], stack_454_1:int, expr_43A:double[])
        stack_479_1 = ldc:int(6)
        expr_45F = newarray:double[](double.class, and:int(ldc:int(4107), ldc:int(18994)))
        storeelement:double(expr_45F:double[], and:int(ldc:int(29196), ldc:int(-29470)), ldc:double(0.1538461446762085))
        storeelement:double(expr_45F:double[], and:int(ldc:int(10241), ldc:int(17829)), ldc:double(9.140260083262505E-9))
        storeelement:double[](expr_358:double[][], stack_479_1:int, expr_45F:double[])
        stack_49E_1 = ldc:int(7)
        expr_484 = newarray:double[](double.class, and:int(ldc:int(2386), ldc:int(4610)))
        storeelement:double(expr_484:double[], and:int(ldc:int(25625), ldc:int(-25626)), ldc:double(0.13333332538604736))
        storeelement:double(expr_484:double[], xor:int(ldc:int(2080), ldc:int(2081)), ldc:double(9.220590270857665E-9))
        storeelement:double[](expr_358:double[][], stack_49E_1:int, expr_484:double[])
        stack_4C3_1 = ldc:int(8)
        expr_4A9 = newarray:double[](double.class, and:int(ldc:int(22019), ldc:int(8322)))
        storeelement:double(expr_4A9:double[], and:int(ldc:int(18575), ldc:int(-27024)), ldc:double(0.11764700710773468))
        storeelement:double(expr_4A9:double[], xor:int(ldc:int(-32764), ldc:int(-32763)), ldc:double(1.2393345855018391E-8))
        storeelement:double[](expr_358:double[][], stack_4C3_1:int, expr_4A9:double[])
        stack_4E8_1 = ldc:int(9)
        expr_4CE = newarray:double[](double.class, and:int(ldc:int(18950), ldc:int(306)))
        storeelement:double(expr_4CE:double[], and:int(ldc:int(-25266), ldc:int(25233)), ldc:double(0.10526403784751892))
        storeelement:double(expr_4CE:double[], xor:int(ldc:int(12300), ldc:int(12301)), ldc:double(8.251545029714408E-9))
        storeelement:double[](expr_358:double[][], stack_4E8_1:int, expr_4CE:double[])
        stack_50D_1 = ldc:int(10)
        expr_4F3 = newarray:double[](double.class, and:int(ldc:int(16458), ldc:int(530)))
        storeelement:double(expr_4F3:double[], and:int(ldc:int(-27759), ldc:int(27756)), ldc:double(0.0952233225107193))
        storeelement:double(expr_4F3:double[], xor:int(ldc:int(544), ldc:int(545)), ldc:double(1.2675934823758863E-8))
        storeelement:double[](expr_358:double[][], stack_50D_1:int, expr_4F3:double[])
        stack_532_1 = ldc:int(11)
        expr_518 = newarray:double[](double.class, and:int(ldc:int(26790), ldc:int(266)))
        storeelement:double(expr_518:double[], and:int(ldc:int(-3426), ldc:int(3425)), ldc:double(0.08713622391223907))
        storeelement:double(expr_518:double[], and:int(ldc:int(357), ldc:int(1545)), ldc:double(1.1430250008909141E-8))
        storeelement:double[](expr_358:double[][], stack_532_1:int, expr_518:double[])
        stack_557_1 = ldc:int(12)
        expr_53D = newarray:double[](double.class, and:int(ldc:int(8834), ldc:int(3082)))
        storeelement:double(expr_53D:double[], and:int(ldc:int(-10288), ldc:int(10283)), ldc:double(0.07842259109020233))
        storeelement:double(expr_53D:double[], and:int(ldc:int(1297), ldc:int(8195)), ldc:double(2.404307984052299E-9))
        storeelement:double[](expr_358:double[][], stack_557_1:int, expr_53D:double[])
        stack_57C_1 = ldc:int(13)
        expr_562 = newarray:double[](double.class, and:int(ldc:int(8194), ldc:int(4103)))
        storeelement:double(expr_562:double[], and:int(ldc:int(-18493), ldc:int(18492)), ldc:double(0.08371849358081818))
        storeelement:double(expr_562:double[], and:int(ldc:int(9369), ldc:int(20999)), ldc:double(1.176342548272881E-8))
        storeelement:double[](expr_358:double[][], stack_57C_1:int, expr_562:double[])
        stack_5A1_1 = ldc:int(14)
        expr_587 = newarray:double[](double.class, and:int(ldc:int(522), ldc:int(115)))
        storeelement:double(expr_587:double[], and:int(ldc:int(-2869), ldc:int(2868)), ldc:double(0.030589580535888672))
        storeelement:double(expr_587:double[], xor:int(ldc:int(-15744), ldc:int(-15743)), ldc:double(1.2958646899018938E-9))
        storeelement:double[](expr_358:double[][], stack_5A1_1:int, expr_587:double[])
        stack_5C6_1 = ldc:int(15)
        expr_5AC = newarray:double[](double.class, and:int(ldc:int(1043), ldc:int(18954)))
        storeelement:double(expr_5AC:double[], and:int(ldc:int(-23267), ldc:int(22752)), ldc:double(0.14982303977012634))
        storeelement:double(expr_5AC:double[], xor:int(ldc:int(-32670), ldc:int(-32669)), ldc:double(1.225743062930824E-8))
        storeelement:double[](expr_358:double[][], stack_5C6_1:int, expr_5AC:double[])
        putstatic:double[][](\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c::\u8c8a\u51fa\u51fa\u1833\u34df\u4bc8, expr_358:double[][])
    }
    
    public void \u71f1\uf9c5\u8aa5\uc7fe\uc229\ubcb0(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_666 : int
        var_5_89 : int
        var_6_90 : int
        var_7_9F : double
        var_9_C6 : double
        var_3_D8 : int
        var_11_E9 : int
        var_14_113 : double
        var_16_117 : int
        var_12_10F : double
        var_17_671 : int
        
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
        var_3_666 = and:int(ldc:int(752303611), ldc:int(-1210581609))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0179)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_666 = and:int(var_3_666:int, ldc:int(-1585421325))
        }
        else {
            var_3_666 = and:int(var_3_666:int, ldc:int(-2013930049))
            var_5_89 = and:int(ldc:int(-2), ldc:int(1))
            var_6_90 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9F = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(492), ldc:int(-493)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C6 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D8 = and:int(var_3_666:int, ldc:int(-329944069))
                    var_9_C6 = sub:double(var_7_9F:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E9 = var_5_89:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E9:int, sub:int(var_6_90:int, and:int(ldc:int(17153), ldc:int(7209)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E9:int, xor:int(ldc:int(2176), ldc:int(2177)))), var_7_9F:double))) {
                        inc:int(var_11_E9, ldc:int(1))
                    }
                    
                    var_3_666 = and:int(var_3_D8:int, ldc:int(778032543))
                    var_14_113 = var_7_9F:double
                    var_16_117 = var_11_E9:int
                }
                else {
                    var_11_E9 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_89:int), and:int(ldc:int(18763), ldc:int(8209)))
                    var_12_10F = var_14_113 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89)
                    
                    if (cmplt:boolean(var_16_117 = var_11_E9:int, var_6_90:int)) {
                        var_9_C6 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E9:int)
                        var_16_117 = var_11_E9:int
                        var_14_113 = var_12_10F:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1540)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1999264621))
                        goto(Label_1390)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1261)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(1)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-26354459))
                        goto(Label_1142)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(529709563))
                        goto(Label_0998)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(16)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1987653148))
                        goto(Label_0862)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1785770023))
                        goto(Label_0699)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(2134011744))
                    }
                    else {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1453983525))
                        
                        if (cmplt:boolean(var_16_117:int, var_6_90:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0582)
                            }
                            
                            goto(Label_0862)
                        }
                    }
                    
                    Label_0423:
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-52092034))
                        goto(Label_1540)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-395319616))
                        goto(Label_1390)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(12954328))
                        goto(Label_1261)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1142)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1169250725))
                        goto(Label_0998)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0862)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0699)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(1767847899))
                            var_11_E9 = and:int(ldc:int(-23769), ldc:int(23768))
                            goto(Label_1529)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0582:
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(448777126))
                        goto(Label_1540)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1390)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(16)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(2146597396))
                        goto(Label_1261)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1200225226))
                        goto(Label_1142)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-396978805))
                        goto(Label_0998)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0862)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0423)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_666 = and:int(var_3_666:int, ldc:int(-855788361))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_113 = var_9_C6:double
                            goto(Label_0862)
                        }
                    }
                    
                    Label_0699:
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1233123303))
                        goto(Label_1540)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1840223823))
                        goto(Label_1390)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1139494001))
                        goto(Label_1261)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1142)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(931646530))
                        goto(Label_0998)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1128079431))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(-1059541650))
                            goto(Label_0582)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(1)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(-907908365))
                            goto(Label_0423)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(-75653184))
                            loopcontinue()
                        }
                        
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1140853601))
                        var_14_113 = mul:double(ldc:double(0.5), add:double(var_9_C6:double, var_14_113:double))
                    }
                    
                    Label_0862:
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1936621115))
                        goto(Label_1540)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1390)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1181814131))
                        goto(Label_1261)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-71361766))
                        goto(Label_1142)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(-2033956149))
                            goto(Label_0699)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(161701935))
                            goto(Label_0582)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(661587568))
                            goto(Label_0423)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_666 = and:int(var_3_666:int, ldc:int(206959067))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89:int), var_7_9F:double)) {
                                var_11_E9 = and:int(ldc:int(6189), ldc:int(1425))
                                goto(Label_1142)
                            }
                        }
                    }
                    
                    Label_0998:
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1540)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-127408391))
                        goto(Label_1390)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1261)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(128)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-2038760268))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(128)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(2115505609))
                            goto(Label_0862)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0699)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0582)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0423)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_666 = and:int(var_3_666:int, ldc:int(1339521175))
                        var_11_E9 = and:int(ldc:int(4035), ldc:int(-4068))
                    }
                    
                    Label_1142:
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1540)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1390)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1591986621))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(725530604))
                            goto(Label_0998)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0862)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0699)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(1)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(-465976230))
                            goto(Label_0582)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(16)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(1363861338))
                            goto(Label_0423)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_666 = and:int(var_3_666:int, ldc:int(-304229921))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                                goto(Label_1390)
                            }
                        }
                    }
                    
                    Label_1261:
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1540)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(481706483))
                            goto(Label_1142)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0998)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0862)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(128)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(-1023914513))
                            goto(Label_0699)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0582)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(-600599754))
                            goto(Label_0423)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(-746338282))
                            loopcontinue()
                        }
                        
                        var_3_666 = and:int(var_3_666:int, ldc:int(1365055671))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_113:double, var_5_89:int, var_16_117:int)
                        goto(Label_1529)
                    }
                    
                    Label_1390:
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(658667351))
                        goto(Label_1540)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1261)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(925045139))
                        goto(Label_1142)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(1)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-53309933))
                        goto(Label_0998)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0862)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1990701775))
                        goto(Label_0699)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1977867082))
                        goto(Label_0582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0423)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_666 = and:int(var_3_666:int, ldc:int(1859607223))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_113:double, ldc:double(0.0))
                    Label_1529:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_671 = var_5_89:int
                        
                        if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1540:
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(1)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1691863912))
                        goto(Label_1390)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1261)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(128)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(920877993))
                        goto(Label_1142)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0998)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0862)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0699)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0423)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-589882405))
                        var_17_671 = add:int(var_16_117:int, xor:int(ldc:int(12546), ldc:int(12547)))
                        looporswitchbreak()
                    }
                    
                    var_3_666 = and:int(var_3_666:int, ldc:int(2101065573))
                }
                
                var_3_666 = and:int(var_3_666:int, ldc:int(1179988123))
                
                if (cmple:boolean(var_5_89 = var_17_671:int, sub:int(var_6_90:int, xor:int(ldc:int(6528), ldc:int(6529))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0179:
        
        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2097152)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
