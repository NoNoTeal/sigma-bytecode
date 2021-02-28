public class \u6435\ub8be\u718f\u6b0d\u67e9.\ub32d\u2dcc\uae5d\uc910\uf995\u51fa {
    public void \ub32d\u2dcc\uae5d\uc910\uf995\u51fa(\u3d64\u7af6\uae87\uc238\u7d52.\u4492\u62da\ub102\u4bc8\u120d\u8350 p0) {
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
            putfield:\u4492\u62da\ub102\u4bc8\u120d\u8350(\ub32d\u2dcc\uae5d\uc910\uf995\u51fa::\ubcb0\uc9f6\u34df\uae5d\uc7fe\uceb8, this:\ub32d\u2dcc\uae5d\uc910\uf995\u51fa, p0:\u4492\u62da\ub102\u4bc8\u120d\u8350)
            invokespecial:Object(Object::<init>, this:\ub32d\u2dcc\uae5d\uc910\uf995\u51fa)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u62da\u0b8e\u6198\u647c\u7043\u3711(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 p0) {
        var_2_E8 : int
        var_4_64 : \u99f7\ubcb0\u97e6\u67e9\u51b2\u8709
        var_5_7F : int
        var_6_9A : int
        var_7_B5 : int
        var_8_CB : int
        var_9_D2 : \u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a[]
        var_10_DB : int
        var_11_16C : \u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a
        var_10_12B : int
        
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
            var_2_E8 = and:int(ldc:int(740962417), ldc:int(1550743288))
            var_4_64 = invokevirtual:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6b0d\u6bb9\u6fb0\u5245\u4975\u624e, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4)
            var_5_7F = d2i:int(invokestatic:double(Math::floor, f2d:double(invokevirtual:float(Float::floatValue, checkcast:Float(java.lang.Float.class, invokevirtual:Float(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u120d\u51b2\u071d\u071d\u5140\u0800, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u4ab3\ub32d\u72f1\u873d\u9a18\uf995[expected:\u1833\ud171\u8350\ubded\u34df\uc9f6<Float>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\ua61f\u5fe1\uc84e\u7049\u62da\u51fa), and:int(ldc:int(-5081), ldc:int(5072))))))))
            var_6_9A = d2i:int(invokestatic:double(Math::floor, f2d:double(invokevirtual:float(Float::floatValue, checkcast:Float(java.lang.Float.class, invokevirtual:Float(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u120d\u51b2\u071d\u071d\u5140\u0800, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u4ab3\ub32d\u72f1\u873d\u9a18\uf995[expected:\u1833\ud171\u8350\ubded\u34df\uc9f6<Float>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\ua61f\u5fe1\uc84e\u7049\u62da\u51fa), and:int(ldc:int(17075), ldc:int(13577))))))))
            var_7_B5 = d2i:int(invokestatic:double(Math::floor, f2d:double(invokevirtual:float(Float::floatValue, checkcast:Float(java.lang.Float.class, invokevirtual:Float(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u120d\u51b2\u071d\u071d\u5140\u0800, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u4ab3\ub32d\u72f1\u873d\u9a18\uf995[expected:\u1833\ud171\u8350\ubded\u34df\uc9f6<Float>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\ua61f\u5fe1\uc84e\u7049\u62da\u51fa), and:int(ldc:int(25175), ldc:int(3082))))))))
            var_8_CB = invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokevirtual:Integer(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u120d\u51b2\u071d\u071d\u5140\u0800, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u6198\u4975\ub83f\ub7dc\u3d64\u5140), and:int(ldc:int(22840), ldc:int(-22841)))))
            var_9_D2 = newarray:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a[](\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a.class, var_8_CB:int)
            var_10_DB = and:int(ldc:int(31233), ldc:int(-31270))
            
            loop {
                if (cmpne:boolean(and:int(var_2_E8:int, ldc:int(512)), ldc:int(0))) {
                    var_2_E8 = and:int(var_2_E8:int, ldc:int(950981931))
                }
                else {
                    var_2_E8 = and:int(var_2_E8:int, ldc:int(1501510110))
                    
                    if (cmplt:boolean(var_10_DB:int, var_8_CB:int)) {
                        var_11_16C = initobject:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a(\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a::<init>, add:byte[expected:int](var_5_7F:byte, invokevirtual:byte(Byte::byteValue, checkcast:Byte(java.lang.Byte.class, invokevirtual:Byte(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Byte>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u7330\u16f6\ucfaf\u6435\u8753\u4cd9))))), i2s:short(add:byte[expected:int](var_6_9A:byte, invokevirtual:byte(Byte::byteValue, checkcast:Byte(java.lang.Byte.class, invokevirtual:Byte(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Byte>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u7330\u16f6\ucfaf\u6435\u8753\u4cd9)))))), add:byte[expected:int](var_7_B5:byte, invokevirtual:byte(Byte::byteValue, checkcast:Byte(java.lang.Byte.class, invokevirtual:Byte(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Byte>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u7330\u16f6\ucfaf\u6435\u8753\u4cd9))))))
                        storeelement:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a(var_9_D2:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a[], var_10_DB:int, var_11_16C:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a)
                        invokestatic:void(\uc87f\u69d9\u7d52\u40a9\u64f2\u3d64::\uc4d2\ubefe\u6d69\ub7dc\u6b0d\u76bc, var_4_64:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709, invokevirtual:int(\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a::\u7043\u56bd\u12cb\u5654\u40a9\u3d64, var_11_16C:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a), invokevirtual:short(\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a::\u7330\u97b7\u983f\u494c\u5f50\u8709, var_11_16C:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a), invokevirtual:int(\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a::\u9033\u9937\u516c\ub102\u1833\u7330, var_11_16C:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a), and:int(ldc:int(-23607), ldc:int(23604)))
                        inc:int(var_10_DB, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_2_E8:int, ldc:int(16384)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_E8 = and:int(var_2_E8:int, ldc:int(243376239))
            }
            
            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ub18d\u4f4a\u446c\u3bd6\u0a06\u4daf, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, ldc:Class<\u1833\u624e\u3bd6\uf9c5\uc84e\uc87f>(\u47c2\u2dcc\u12cb\ud171\u8c8a.\u1833\u624e\u3bd6\uf9c5\uc84e\uc87f.class), and:int[expected:boolean](ldc:int(17413), ldc:int(145)), and:int[expected:boolean](ldc:int(2563), ldc:int(197)))
            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u4ab3\u7043\ud523\ub1b9\ub83f\u760c, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4)
            var_10_12B = and:int(ldc:int(-29795), ldc:int(29794))
            
            while (cmplt:boolean(var_10_12B:int, var_8_CB:int)) {
                invokestatic:void(\uc87f\u69d9\u7d52\u40a9\u64f2\u3d64::\u392e\ud51e\u965f\uc229\u647c\u6b0d, var_4_64:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709, loadelement:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a(var_9_D2:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a[], var_10_12B:int))
                inc:int(var_10_12B, ldc:int(1))
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
    
    public void \u8cae\u5654\u3bd6\u6c56\u93a2\u7330(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5F7 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
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
        var_3_5F7 = and:int(ldc:int(-1973075440), ldc:int(-1708373729))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub32d\u2dcc\uae5d\uc910\uf995\u51fa[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(16)), ldc:int(0))) {
            var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-1953445805))
            var_5_7D = and:int(ldc:int(4148), ldc:int(-4149))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(9038), ldc:int(-9167)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5F7:int, ldc:int(-1853527342))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(1098), ldc:int(1099)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(593), ldc:int(6147)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5F7 = and:int(var_3_D2:int, ldc:int(-383559727))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(7459), ldc:int(16525)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1441)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1311)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-489170884))
                        goto(Label_1175)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1041)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-892167522))
                        goto(Label_0899)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-864977816))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-721893543))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1441)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-1433173824))
                        goto(Label_1311)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(851208999))
                        goto(Label_1175)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1041)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-588047662))
                        goto(Label_0899)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(1419791011))
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(1080384269))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5F7 = and:int(var_3_5F7:int, ldc:int(1096048542))
                            loopcontinue()
                        }
                        
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-193962829))
                        var_11_E3 = and:int(ldc:int(-14543), ldc:int(14414))
                        goto(Label_1430)
                    }
                    
                    Label_0549:
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-1721714089))
                        goto(Label_1441)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1311)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1175)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1041)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0899)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(1703376689))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(628350830))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_5F7 = and:int(var_3_5F7:int, ldc:int(657779540))
                            loopcontinue()
                        }
                        
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-408034384))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1441)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1311)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1175)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(548817477))
                        goto(Label_1041)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(1280228451))
                        goto(Label_0899)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(740701339))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5F7 = and:int(var_3_5F7:int, ldc:int(2098296799))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5F7 = and:int(var_3_5F7:int, ldc:int(1169568853))
                            loopcontinue()
                        }
                        
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-711557647))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0786:
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(1677263636))
                        goto(Label_1441)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-481302109))
                        goto(Label_1311)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1175)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1041)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-632791236))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-929852831))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-645994571))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(137), ldc:int(65))
                                goto(Label_1041)
                            }
                        }
                    }
                    
                    Label_0899:
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-570490500))
                        goto(Label_1441)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-1365700850))
                        goto(Label_1311)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1175)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-1151210035))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-942448137))
                        var_11_E3 = and:int(ldc:int(8534), ldc:int(-8535))
                    }
                    
                    Label_1041:
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-1014543048))
                        goto(Label_1441)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(890410116))
                        goto(Label_1311)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(258783233))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-1706951390))
                            goto(Label_0899)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-1331470786))
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5F7 = and:int(var_3_5F7:int, ldc:int(2127146356))
                            loopcontinue()
                        }
                        
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-154147561))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1311)
                            }
                        }
                    }
                    
                    Label_1175:
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-1875277667))
                        goto(Label_1441)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5F7 = and:int(var_3_5F7:int, ldc:int(1736945495))
                            goto(Label_1041)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0899)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-1363587169))
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-318006900))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5F7 = and:int(var_3_5F7:int, ldc:int(602328151))
                            loopcontinue()
                        }
                        
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-885503465))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1430)
                    }
                    
                    Label_1311:
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1441)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1175)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1041)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-804747495))
                        goto(Label_0899)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-1708587510))
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(1359423322))
                        loopcontinue()
                    }
                    
                    var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-1141123489))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1430:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_602 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1441:
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(2126827070))
                        goto(Label_1311)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1175)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1041)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0899)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-982018379))
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-1585494287))
                        var_17_602 = add:int(var_16_111:int, and:int(ldc:int(11713), ldc:int(4661)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-930527433))
                
                if (cmple:boolean(var_5_7D = var_17_602:int, sub:int(var_6_84:int, and:int(ldc:int(655), ldc:int(1025))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-608218331))
            goto(Label_0106)
        }
    }
}
