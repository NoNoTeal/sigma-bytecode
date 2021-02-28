public class \u5d20\u7043\u88c5\u5db4\uf94d.\u69d9\uc229\u6ec6\u71f1\u2dcc\ud7e8 {
    public void \u69d9\uc229\u6ec6\u71f1\u2dcc\ud7e8(\u59ec\u8413\u97e6\uc229\u3776.\u34df\u7d52\u7049\u5140\ucfaf\ub70c p0, \u47c2\u2dcc\u12cb\ud171\u8c8a.\uff55\u873d\ubded\u759a\u9255\uc229 p1, \u6435\ub8be\u718f\u6b0d\u67e9.\u71f1\ub7dc\u98a4\ub19c\ud7e8\u51b2 p2) {
        var_6_6D : float
        var_7_73 : float
        var_8_79 : float
        var_10_86 : float
        var_11_8D : float
        expr_96 : float[] [generated]
        var_12_B3 : float[]
        expr_F9 : float[] [generated]
        var_13_119 : float[]
        
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
            invokespecial:Object(Object::<init>, this:\u69d9\uc229\u6ec6\u71f1\u2dcc\ud7e8)
            putfield:\u71f1\ub7dc\u98a4\ub19c\ud7e8\u51b2(\u69d9\uc229\u6ec6\u71f1\u2dcc\ud7e8::\u8258\u6b5f\uc229\u56bd\u7e3f\u92ee, this:\u69d9\uc229\u6ec6\u71f1\u2dcc\ud7e8, p2:\u71f1\ub7dc\u98a4\ub19c\ud7e8\u51b2)
            var_6_6D = invokevirtual:float(\u71f1\ub7dc\u98a4\ub19c\ud7e8\u51b2::\ube23\uf995\u92ee\u3e2a\uafe7\uf94d, p2:\u71f1\ub7dc\u98a4\ub19c\ud7e8\u51b2)
            var_7_73 = invokevirtual:float(\u71f1\ub7dc\u98a4\ub19c\ud7e8\u51b2::\u4f4a\u6d69\u760c\u5140\u3e75\u3a62, p2:\u71f1\ub7dc\u98a4\ub19c\ud7e8\u51b2)
            var_8_79 = invokevirtual:float(\u71f1\ub7dc\u98a4\ub19c\ud7e8\u51b2::\uc29a\ub18d\u69d9\u8753\u4c04\u51b2, p2:\u71f1\ub7dc\u98a4\ub19c\ud7e8\u51b2)
            var_10_86 = sub:float(invokevirtual:float(\u71f1\ub7dc\u98a4\ub19c\ud7e8\u51b2::\u4975\ud217\u7c6b\uc84e\u7e3f\u8bb0, p2:\u71f1\ub7dc\u98a4\ub19c\ud7e8\u51b2), var_7_73:float)
            var_11_8D = sub:float(var_8_79:float, var_6_6D:float)
            expr_96 = newarray:float[](float.class, xor:int(ldc:int(4705), ldc:int(4707)))
            storeelement:float(expr_96:float[], and:int(ldc:int(-776), ldc:int(775)), var_6_6D:float)
            storeelement:float(expr_96:float[], xor:int(ldc:int(4194), ldc:int(4195)), add:float(var_7_73:float, div:float(var_10_86:float, ldc:float(2.0f))))
            var_12_B3 = expr_96:float[]
            invokevirtual:void(\uff55\u873d\ubded\u759a\u9255\uc229::\u6c52\u3c25\ud12e\u3d4b\u8d90\uae5d, invokevirtual:\uff55\u873d\ubded\u759a\u9255\uc229(\u71f1\ub7dc\u98a4\ub19c\ud7e8\u51b2::\u4492\u64ab\u839e\u4cd9\u12cb\u516c, p2:\u71f1\ub7dc\u98a4\ub19c\ud7e8\u51b2), var_12_B3:float[], and:int(ldc:int(10019), ldc:int(-12144)), var_12_B3:float[], and:int(ldc:int(-31383), ldc:int(31382)), xor:int(ldc:int(4104), ldc:int(4105)))
            invokevirtual:void(\uff55\u873d\ubded\u759a\u9255\uc229::\u6c52\u3c25\ud12e\u3d4b\u8d90\uae5d, p1:\uff55\u873d\ubded\u759a\u9255\uc229, var_12_B3:float[], and:int(ldc:int(2204), ldc:int(-2973)), var_12_B3:float[], and:int(ldc:int(1506), ldc:int(-18404)), xor:int(ldc:int(17672), ldc:int(17673)))
            expr_F9 = newarray:float[](float.class, and:int(ldc:int(20683), ldc:int(8994)))
            storeelement:float(expr_F9:float[], and:int(ldc:int(22402), ldc:int(-22476)), add:float(var_6_6D:float, var_11_8D:float))
            storeelement:float(expr_F9:float[], xor:int(ldc:int(5640), ldc:int(5641)), add:float(var_7_73:float, div:float(var_10_86:float, ldc:float(2.0f))))
            var_13_119 = expr_F9:float[]
            invokevirtual:void(\uff55\u873d\ubded\u759a\u9255\uc229::\u6c52\u3c25\ud12e\u3d4b\u8d90\uae5d, invokevirtual:\uff55\u873d\ubded\u759a\u9255\uc229(\u71f1\ub7dc\u98a4\ub19c\ud7e8\u51b2::\u4492\u64ab\u839e\u4cd9\u12cb\u516c, p2:\u71f1\ub7dc\u98a4\ub19c\ud7e8\u51b2), var_13_119:float[], and:int(ldc:int(-25149), ldc:int(25144)), var_13_119:float[], and:int(ldc:int(-21604), ldc:int(20579)), and:int(ldc:int(157), ldc:int(291)))
            invokevirtual:void(\uff55\u873d\ubded\u759a\u9255\uc229::\u6c52\u3c25\ud12e\u3d4b\u8d90\uae5d, p1:\uff55\u873d\ubded\u759a\u9255\uc229, var_13_119:float[], and:int(ldc:int(19730), ldc:int(-19891)), var_13_119:float[], and:int(ldc:int(-23214), ldc:int(21164)), and:int(ldc:int(3113), ldc:int(17173)))
            putfield:\u72f1\u8c8a\ua562\ub8be\u8258\u9033(\u69d9\uc229\u6ec6\u71f1\u2dcc\ud7e8::\ub70c\u9255\u960f\u3bc9\u9937\u8bb0, this:\u69d9\uc229\u6ec6\u71f1\u2dcc\ud7e8, initobject:\u72f1\u8c8a\ua562\ub8be\u8258\u9033(\u72f1\u8c8a\ua562\ub8be\u8258\u9033::<init>, loadelement:float(var_12_B3:float[], and:int(ldc:int(-24721), ldc:int(24720))), loadelement:float(var_12_B3:float[], and:int(ldc:int(67), ldc:int(10785)))))
            putfield:\u72f1\u8c8a\ua562\ub8be\u8258\u9033(\u69d9\uc229\u6ec6\u71f1\u2dcc\ud7e8::\u4f4a\u3bd6\u8389\ubcb0\ucfaf\ub18d, this:\u69d9\uc229\u6ec6\u71f1\u2dcc\ud7e8, initobject:\u72f1\u8c8a\ua562\ub8be\u8258\u9033(\u72f1\u8c8a\ua562\ub8be\u8258\u9033::<init>, loadelement:float(var_13_119:float[], and:int(ldc:int(29512), ldc:int(-29657))), loadelement:float(var_13_119:float[], and:int(ldc:int(9859), ldc:int(16677)))))
            putfield:\u67e9\u839e\uc238\u8413\u59ec\u9937(\u69d9\uc229\u6ec6\u71f1\u2dcc\ud7e8::\u600f\ud217\uc910\u4cd9\u4c04\ub102, this:\u69d9\uc229\u6ec6\u71f1\u2dcc\ud7e8, initobject:\u67e9\u839e\uc238\u8413\u59ec\u9937(\u67e9\u839e\uc238\u8413\u59ec\u9937::<init>, getfield:\u72f1\u8c8a\ua562\ub8be\u8258\u9033(\u69d9\uc229\u6ec6\u71f1\u2dcc\ud7e8::\ub70c\u9255\u960f\u3bc9\u9937\u8bb0, this:\u69d9\uc229\u6ec6\u71f1\u2dcc\ud7e8), getfield:\u72f1\u8c8a\ua562\ub8be\u8258\u9033(\u69d9\uc229\u6ec6\u71f1\u2dcc\ud7e8::\u4f4a\u3bd6\u8389\ubcb0\ucfaf\ub18d, this:\u69d9\uc229\u6ec6\u71f1\u2dcc\ud7e8)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u72f1\u8c8a\ua562\ub8be\u8258\u9033 \ucef1\ufcaf\u9af2\u4975\u6cfe\u4e72(float p0, float p1) {
        var_5_67 : \u72f1\u8c8a\ua562\ub8be\u8258\u9033
        
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
            var_5_67 = initobject:\u72f1\u8c8a\ua562\ub8be\u8258\u9033(\u72f1\u8c8a\ua562\ub8be\u8258\u9033::<init>)
            invokevirtual:void(\u67e9\u839e\uc238\u8413\u59ec\u9937::\ufcaf\u0a06\uc9f6\uf94d\u527a\u4c04, getfield:\u67e9\u839e\uc238\u8413\u59ec\u9937(\u69d9\uc229\u6ec6\u71f1\u2dcc\ud7e8::\u600f\ud217\uc910\u4cd9\u4c04\ub102, this:\u69d9\uc229\u6ec6\u71f1\u2dcc\ud7e8), initobject:\u72f1\u8c8a\ua562\ub8be\u8258\u9033(\u72f1\u8c8a\ua562\ub8be\u8258\u9033::<init>, p0:float, p1:float), var_5_67:\u72f1\u8c8a\ua562\ub8be\u8258\u9033)
            return:\u72f1\u8c8a\ua562\ub8be\u8258\u9033(initobject:\u72f1\u8c8a\ua562\ub8be\u8258\u9033(\u72f1\u8c8a\ua562\ub8be\u8258\u9033::<init>, div:float(invokevirtual:float(\u72f1\u8c8a\ua562\ub8be\u8258\u9033::\u61a4\uae87\u156b\ubb2b\ufe34\u3711, var_5_67:\u72f1\u8c8a\ua562\ub8be\u8258\u9033, getfield:\u72f1\u8c8a\ua562\ub8be\u8258\u9033(\u69d9\uc229\u6ec6\u71f1\u2dcc\ud7e8::\ub70c\u9255\u960f\u3bc9\u9937\u8bb0, this:\u69d9\uc229\u6ec6\u71f1\u2dcc\ud7e8)), invokevirtual:float(\u67e9\u839e\uc238\u8413\u59ec\u9937::\u8d98\u51b2\u12b2\u4ab3\u34df\u8c8a, getfield:\u67e9\u839e\uc238\u8413\u59ec\u9937(\u69d9\uc229\u6ec6\u71f1\u2dcc\ud7e8::\u600f\ud217\uc910\u4cd9\u4c04\ub102, this:\u69d9\uc229\u6ec6\u71f1\u2dcc\ud7e8))), ldc:float(0.0f)))
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
    
    public void \ub19c\u47c2\u9937\u3dd3\u4daf\u7ce1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_61B : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_626 : int
        
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
        var_3_61B = and:int(ldc:int(1397791280), ldc:int(-554374614))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u69d9\uc229\u6ec6\u71f1\u2dcc\ud7e8[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(524288)), ldc:int(0))) {
            var_3_61B = and:int(var_3_61B:int, ldc:int(641640343))
        }
        else {
            var_3_61B = and:int(var_3_61B:int, ldc:int(1451220246))
            var_5_85 = and:int(ldc:int(21026), ldc:int(-21027))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-25509), ldc:int(25508)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_61B:int, ldc:int(-615461792))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(4674), ldc:int(4675)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(9), ldc:int(8)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_61B = and:int(var_3_D2:int, ldc:int(1515774302))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(6401), ldc:int(9217)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-137969045))
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1340)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1210)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(308482241))
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1548529187))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1859033086))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1528749005))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-233835966))
                        goto(Label_1458)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1340)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1155406744))
                        goto(Label_1210)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-275463824))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(1784981538))
                            loopcontinue()
                        }
                        
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1540619556))
                        var_11_E3 = and:int(ldc:int(27660), ldc:int(-28173))
                        goto(Label_1447)
                    }
                    
                    Label_0541:
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1458)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1371258319))
                        goto(Label_1340)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-11864416))
                        goto(Label_1210)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1997134623))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-751412086))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(-121954608))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(-1106348229))
                            loopcontinue()
                        }
                        
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-749171360))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1458)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(588695239))
                        goto(Label_1340)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-468357285))
                        goto(Label_1210)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(2106665859))
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(-373820540))
                            loopcontinue()
                        }
                        
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-139020936))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0786:
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1621101808))
                        goto(Label_1458)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1340)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(846066794))
                        goto(Label_1210)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(162516276))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(1728812640))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1515298326))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(8737), ldc:int(8736))
                                goto(Label_1067)
                            }
                        }
                    }
                    
                    Label_0897:
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1560113219))
                        goto(Label_1458)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(473939879))
                        goto(Label_1340)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(583241373))
                        goto(Label_1210)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1216953773))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(-1946859976))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(1986520577))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(-917347015))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-541476755))
                        var_11_E3 = and:int(ldc:int(6190), ldc:int(-6191))
                    }
                    
                    Label_1067:
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1997995336))
                        goto(Label_1458)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1673401500))
                        goto(Label_1340)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(625810682))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0897)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(-1487066849))
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(1957500318))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(1753540789))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(897622671))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(1019281137))
                            loopcontinue()
                        }
                        
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-23800269))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1340)
                            }
                        }
                    }
                    
                    Label_1210:
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(2114230169))
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(2037998335))
                            goto(Label_1067)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(114417374))
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(-950823831))
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(128)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(1147657740))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(-17583049))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1447)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1340:
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1210)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1393261988))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(438629781))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(2097152)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_61B = and:int(var_3_61B:int, ldc:int(1473953763))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1447:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_626 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1458:
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(57981117))
                        goto(Label_1340)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1210)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1644964836))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1300626001))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1569072283))
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1379913378))
                        var_17_626 = add:int(var_16_111:int, xor:int(ldc:int(45), ldc:int(44)))
                        looporswitchbreak()
                    }
                }
                
                var_3_61B = and:int(var_3_61B:int, ldc:int(1998384269))
                
                if (cmple:boolean(var_5_85 = var_17_626:int, sub:int(var_6_8C:int, xor:int(ldc:int(66), ldc:int(67))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(65536)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
