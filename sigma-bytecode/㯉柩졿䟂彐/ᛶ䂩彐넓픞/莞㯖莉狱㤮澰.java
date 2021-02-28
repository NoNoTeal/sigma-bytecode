public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u839e\u3bd6\u8389\u72f1\u392e\u6fb0 {
    private void \u839e\u3bd6\u8389\u72f1\u392e\u6fb0() {
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
            invokespecial:Object(Object::<init>, this:\u839e\u3bd6\u8389\u72f1\u392e\u6fb0)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u9af2\u416d\uceb8\ud12e\u7bad\uc246(java.lang.String[] p0) {
        var_1_111 : int
        var_3_105 : int
        var_3_19C : int
        
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
            var_1_111 = and:int(ldc:int(1605144027), ldc:int(799140115))
            
            if (cmple:boolean(arraylength:int(p0:String[]), ldc:int(0))) {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), and:int(ldc:int(5144), ldc:int(-5145))))
            }
            else {
                putstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud523\u7e3f\uf9c5\u527a\ud523\ub113, invokestatic:int(Integer::parseInt, loadelement:String(p0:String[], and:int(ldc:int(19505), ldc:int(-27698)))))
                putstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u93a2\ua3b4\ua3b4\u9a18\ud7e8\u7049, invokestatic:int(Integer::parseInt, loadelement:String(p0:String[], and:int(ldc:int(11529), ldc:int(16423)))))
                putstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u51fa\u873d\u7049\uff55\u99f7\ua068, invokestatic:int(Integer::parseInt, loadelement:String(p0:String[], and:int(ldc:int(4610), ldc:int(26782)))))
                putstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u3711\u7d52\u927d\u5db4\u4bc8\u6c56, invokestatic:int(Integer::parseInt, loadelement:String(p0:String[], xor:int(ldc:int(17428), ldc:int(17431)))))
                putstatic:boolean(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ufe34\u946b\u74b1\u7043\uff55\u3776, invokestatic:boolean(Boolean::parseBoolean, loadelement:String(p0:String[], xor:int(ldc:int(1288), ldc:int(1292)))))
                putstatic:boolean(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ufe34\u6d99\u3d4b\u873d\ub1b9\ub19c, invokestatic:boolean(Boolean::parseBoolean, loadelement:String(p0:String[], and:int(ldc:int(8237), ldc:int(197)))))
                putstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u8bb0\ua61f\uc238\uceb8\u93a2\uf995, invokestatic:int(Integer::parseInt, loadelement:String(p0:String[], ldc:int(6))))
                putstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u7e3f\u4bc8\u8753\u7af6\u3776\u34df, newarray:long[](long.class, getstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u8bb0\ua61f\uc238\uceb8\u93a2\uf995)))
                putstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u4492\u7ce1\u71ae\u3e2a\uc87f\u385b, newarray:long[](long.class, getstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u8bb0\ua61f\uc238\uceb8\u93a2\uf995)))
                putstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776, newarray:long[](long.class, getstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u8bb0\ua61f\uc238\uceb8\u93a2\uf995)))
                var_3_105 = and:int(ldc:int(-20362), ldc:int(20360))
                
                loop {
                    if (cmpeq:boolean(and:int(var_1_111:int, ldc:int(8388608)), ldc:int(0))) {
                        var_1_111 = and:int(var_1_111:int, ldc:int(1808343146))
                        goto(Label_0378)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_111:int, ldc:int(2048)), ldc:int(0))) {
                        var_1_111 = and:int(var_1_111:int, ldc:int(267440028))
                        
                        if (cmplt:boolean(var_3_105:int, getstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u8bb0\ua61f\uc238\uceb8\u93a2\uf995))) {
                            storeelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u7e3f\u4bc8\u8753\u7af6\u3776\u34df), var_3_105:int, i2l:long(invokestatic:int(Integer::parseInt, loadelement:String(p0:String[], add:int(ldc:int(7), var_3_105:int)))))
                            inc:int(var_3_105, ldc:int(1))
                            loopcontinue()
                        }
                    }
                    
                    Label_0296:
                    
                    if (cmpeq:boolean(and:int(var_1_111:int, ldc:int(32768)), ldc:int(0))) {
                        var_1_111 = and:int(var_1_111:int, ldc:int(-1707496470))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_1_111:int, ldc:int(33554432)), ldc:int(0))) {
                            var_1_111 = and:int(var_1_111:int, ldc:int(-747669790))
                            loopcontinue()
                        }
                        
                        var_1_111 = and:int(var_1_111:int, ldc:int(1341447031))
                        var_3_105 = and:int(ldc:int(-845), ldc:int(844))
                        
                        while (cmplt:boolean(var_3_105:int, getstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u8bb0\ua61f\uc238\uceb8\u93a2\uf995))) {
                            storeelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u4492\u7ce1\u71ae\u3e2a\uc87f\u385b), var_3_105:int, i2l:long(invokestatic:int(Integer::parseInt, loadelement:String(p0:String[], add:int(add:int(ldc:int(7), getstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u8bb0\ua61f\uc238\uceb8\u93a2\uf995)), var_3_105:int)))))
                            inc:int(var_3_105, ldc:int(1))
                        }
                    }
                    
                    Label_0378:
                    
                    if (cmpeq:boolean(and:int(var_1_111:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0296)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_111:int, ldc:int(134217728)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_1_111 = and:int(var_1_111:int, ldc:int(1991607344))
                }
                
                var_3_19C = and:int(ldc:int(23123), ldc:int(-31320))
                
                while (cmplt:boolean(var_3_19C:int, getstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u8bb0\ua61f\uc238\uceb8\u93a2\uf995))) {
                    storeelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_3_19C:int, i2l:long(invokestatic:int(Integer::parseInt, loadelement:String(p0:String[], add:int(add:int(add:int(ldc:int(7), getstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u8bb0\ua61f\uc238\uceb8\u93a2\uf995)), getstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u8bb0\ua61f\uc238\uceb8\u93a2\uf995)), var_3_19C:int)))))
                    inc:int(var_3_19C, ldc:int(1))
                }
            }
            
            invokestatic:void(\ud171\ua61f\u0800\u9a18\u392e\u4179::\u88c5\u8308\u183a\u8df4\u3d64\ub8be, getstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud523\u7e3f\uf9c5\u527a\ud523\ub113))
            invokestatic:void(\ud7e8\u5db4\u6b0d\u6c56\u7873\u9255::\ua3b4\u760c\u3d64\u392e\ucb79\u983f, i2l:long(getstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u93a2\ua3b4\ua3b4\u9a18\ud7e8\u7049)))
            invokestatic:void(\ud7e8\u5db4\u6b0d\u6c56\u7873\u9255::\u5d20\u8753\u6c52\u2dcc\u4f4a\u960f, i2l:long(getstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u51fa\u873d\u7049\uff55\u99f7\ua068)))
            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), xor:int(ldc:int(22016), ldc:int(22017)))), getstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud523\u7e3f\uf9c5\u527a\ud523\ub113))))
            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), xor:int(ldc:int(-32634), ldc:int(-32636)))), getstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u93a2\ua3b4\ua3b4\u9a18\ud7e8\u7049))))
            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), and:int(ldc:int(2119), ldc:int(547)))), getstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u51fa\u873d\u7049\uff55\u99f7\ua068))))
            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), and:int(ldc:int(3334), ldc:int(541)))), getstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u3711\u7d52\u927d\u5db4\u4bc8\u6c56))))
            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), xor:int(ldc:int(-16358), ldc:int(-16353)))), getstatic:boolean(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ufe34\u946b\u74b1\u7043\uff55\u3776))))
            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), and:int(ldc:int(16951), ldc:int(11406)))), getstatic:boolean(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ufe34\u6d99\u3d4b\u873d\ub1b9\ub19c))))
            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), and:int(ldc:int(6663), ldc:int(1351)))), getstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u8bb0\ua61f\uc238\uceb8\u93a2\uf995))))
            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), and:int(ldc:int(6252), ldc:int(16393)))), invokestatic:String(Arrays::toString, getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u7e3f\u4bc8\u8753\u7af6\u3776\u34df)))))
            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), and:int(ldc:int(25867), ldc:int(2713)))), invokestatic:String(Arrays::toString, getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u4492\u7ce1\u71ae\u3e2a\uc87f\u385b)))))
            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), and:int(ldc:int(8523), ldc:int(6286)))), invokestatic:String(Arrays::toString, getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776)))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u071d\u5bc4\u4e72\u3711\u47c2\u3e2a() {
        var_0_87 : int
        var_2_65 : double[]
        var_3_6B : double[]
        var_4_73 : int
        var_12_17A : \ua61f\u3776\uc238\u74b1\ub8be\u3c25
        var_8_185 : double[]
        var_0_11E : int
        var_5_122 : long
        var_7_131 : \ua61f\u3776\uc238\u74b1\ub8be\u3c25
        var_8_14B : double[]
        var_0_157 : int
        var_9_15B : double
        var_11_164 : int
        var_5_2E0 : long
        var_5_2F2 : long
        expr_200 : double[] [generated]
        expr_201 : int [generated]
        stack_25F_0 : PrintStream [generated]
        stack_24B_0 : StringBuilder [generated]
        stack_248_0 : String [generated]
        expr_235 : Object[] [generated]
        stack_2B6_0 : PrintStream [generated]
        stack_2A2_0 : StringBuilder [generated]
        stack_29F_0 : String [generated]
        expr_28C : Object[] [generated]
        
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
            var_0_87 = and:int(ldc:int(-1325382654), ldc:int(-1219272853))
            var_2_65 = newarray:double[](double.class, getstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u8bb0\ua61f\uc238\uceb8\u93a2\uf995))
            var_3_6B = newarray:double[](double.class, getstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u8bb0\ua61f\uc238\uceb8\u93a2\uf995))
            var_4_73 = and:int(ldc:int(-27912), ldc:int(25863))
            
            loop {
                if (cmpeq:boolean(and:int(var_0_87:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_0260)
                }
                
                if (cmpne:boolean(and:int(var_0_87:int, ldc:int(65536)), ldc:int(0))) {
                    var_0_87 = and:int(var_0_87:int, ldc:int(-1276986265))
                }
                else {
                    var_0_87 = and:int(var_0_87:int, ldc:int(-239282849))
                    
                    if (cmplt:boolean(var_4_73:int, getstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u8bb0\ua61f\uc238\uceb8\u93a2\uf995))) {
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), and:int(ldc:int(10379), ldc:int(523)))), loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u7e3f\u4bc8\u8753\u7af6\u3776\u34df), var_4_73:int))))
                        
                        if (logicalnot:boolean(getstatic:boolean(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ufe34\u946b\u74b1\u7043\uff55\u3776))) {
                            goto(Label_0260)
                        }
                        
                        var_12_17A = initobject:\ua61f\u3776\uc238\u74b1\ub8be\u3c25(\ua61f\u3776\uc238\u74b1\ub8be\u3c25::<init>, loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u7e3f\u4bc8\u8753\u7af6\u3776\u34df), var_4_73:int))
                        var_8_185 = newarray:double[](double.class, l2i:int(loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u7e3f\u4bc8\u8753\u7af6\u3776\u34df), var_4_73:int)))
                        invokestatic:void(\u7af6\u5654\u56bd\u6198\ub6ab\ub8be::\u446c\ub1b9\u624e\ud171\u97b7\u3e2a, loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u7e3f\u4bc8\u8753\u7af6\u3776\u34df), var_4_73:int), var_8_185:double[])
                        invokevirtual:void(\ua61f\u3776\uc238\u74b1\ub8be\u3c25::\u6b0d\u6ec6\u6435\u8aa5\uc4d2\u7d52, var_12_17A:\ua61f\u3776\uc238\u74b1\ub8be\u3c25, var_8_185:double[], getstatic:boolean(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ufe34\u6d99\u3d4b\u873d\ub1b9\ub19c))
                        invokestatic:void(\u7af6\u5654\u56bd\u6198\ub6ab\ub8be::\u446c\ub1b9\u624e\ud171\u97b7\u3e2a, loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u7e3f\u4bc8\u8753\u7af6\u3776\u34df), var_4_73:int), var_8_185:double[])
                        invokevirtual:void(\ua61f\u3776\uc238\u74b1\ub8be\u3c25::\u6b0d\u6ec6\u6435\u8aa5\uc4d2\u7d52, var_12_17A:\ua61f\u3776\uc238\u74b1\ub8be\u3c25, var_8_185:double[], getstatic:boolean(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ufe34\u6d99\u3d4b\u873d\ub1b9\ub19c))
                        goto(Label_0260)
                    }
                }
                
                Label_0152:
                
                if (cmpne:boolean(and:int(var_0_87:int, ldc:int(16384)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_0_87:int, ldc:int(268435456)), ldc:int(0))) {
                        var_0_87 = and:int(var_0_87:int, ldc:int(486554497))
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                Label_0260:
                
                if (cmpne:boolean(and:int(var_0_87:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_0152)
                }
                
                if (cmpeq:boolean(and:int(var_0_87:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_0_87 = and:int(var_0_87:int, ldc:int(518803659))
                }
                else {
                    var_0_11E = and:int(var_0_87:int, ldc:int(-1313581834))
                    var_5_122 = invokestatic:long(System::nanoTime)
                    var_7_131 = initobject:\ua61f\u3776\uc238\u74b1\ub8be\u3c25(\ua61f\u3776\uc238\u74b1\ub8be\u3c25::<init>, loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u7e3f\u4bc8\u8753\u7af6\u3776\u34df), var_4_73:int))
                    storeelement:double(var_3_6B:double[], var_4_73:int, div:double(l2d:double(sub:long(invokestatic:long(System::nanoTime), var_5_122:long)), ldc:double(1000000.0)))
                    var_8_14B = newarray:double[](double.class, l2i:int(loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u7e3f\u4bc8\u8753\u7af6\u3776\u34df), var_4_73:int)))
                    
                    if (getstatic:boolean(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ufe34\u946b\u74b1\u7043\uff55\u3776)) {
                        invokestatic:void(\u7af6\u5654\u56bd\u6198\ub6ab\ub8be::\u446c\ub1b9\u624e\ud171\u97b7\u3e2a, loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u7e3f\u4bc8\u8753\u7af6\u3776\u34df), var_4_73:int), var_8_14B:double[])
                        invokevirtual:void(\ua61f\u3776\uc238\u74b1\ub8be\u3c25::\u6b0d\u6ec6\u6435\u8aa5\uc4d2\u7d52, var_7_131:\ua61f\u3776\uc238\u74b1\ub8be\u3c25, var_8_14B:double[], getstatic:boolean(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ufe34\u6d99\u3d4b\u873d\ub1b9\ub19c))
                        invokestatic:void(\u7af6\u5654\u56bd\u6198\ub6ab\ub8be::\u446c\ub1b9\u624e\ud171\u97b7\u3e2a, loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u7e3f\u4bc8\u8753\u7af6\u3776\u34df), var_4_73:int), var_8_14B:double[])
                        invokevirtual:void(\ua61f\u3776\uc238\u74b1\ub8be\u3c25::\u6b0d\u6ec6\u6435\u8aa5\uc4d2\u7d52, var_7_131:\ua61f\u3776\uc238\u74b1\ub8be\u3c25, var_8_14B:double[], getstatic:boolean(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ufe34\u6d99\u3d4b\u873d\ub1b9\ub19c))
                    }
                    
                    var_0_157 = and:int(var_0_11E:int, ldc:int(-1259092045))
                    var_9_15B = ldc:double(1.7976931348623157E308)
                    var_11_164 = and:int(ldc:int(-13158), ldc:int(12581))
                    
                    while (cmplt:boolean(var_11_164:int, getstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u3711\u7d52\u927d\u5db4\u4bc8\u6c56))) {
                        invokestatic:void(\u7af6\u5654\u56bd\u6198\ub6ab\ub8be::\u446c\ub1b9\u624e\ud171\u97b7\u3e2a, loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u7e3f\u4bc8\u8753\u7af6\u3776\u34df), var_4_73:int), var_8_14B:double[])
                        var_5_2E0 = invokestatic:long(System::nanoTime)
                        invokevirtual:void(\ua61f\u3776\uc238\u74b1\ub8be\u3c25::\u6b0d\u6ec6\u6435\u8aa5\uc4d2\u7d52, var_7_131:\ua61f\u3776\uc238\u74b1\ub8be\u3c25, var_8_14B:double[], getstatic:boolean(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ufe34\u6d99\u3d4b\u873d\ub1b9\ub19c))
                        var_5_2F2 = sub:long(invokestatic:long(System::nanoTime), var_5_2E0:long)
                        
                        if (cmplt:boolean(l2d:double(var_5_2F2:long), var_9_15B:double)) {
                            var_9_15B = l2d:double(var_5_2F2:long)
                        }
                        
                        var_0_157 = and:int(var_0_157:int, ldc:int(-110434981))
                        inc:int(var_11_164, ldc:int(1))
                    }
                    
                    var_0_87 = and:int(var_0_157:int, ldc:int(-1153415786))
                    storeelement:double(var_2_65:double[], var_4_73:int, div:double(var_9_15B:double, ldc:double(1000000.0)))
                    expr_200 = var_3_6B:double[]
                    expr_201 = var_4_73:int
                    storeelement:double(expr_200:double[], expr_201:int, add:double(loadelement:double(expr_200:double[], expr_201:int), loadelement:double(var_2_65:double[], var_4_73:int)))
                    stack_25F_0 = getstatic:PrintStream(System::out)
                    stack_24B_0 = invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), and:int(ldc:int(17548), ldc:int(8716))))
                    stack_248_0 = loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), and:int(ldc:int(335), ldc:int(19117)))
                    expr_235 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(779), ldc:int(2177)))
                    storeelement:Object(expr_235:Object[], and:int(ldc:int(-6045), ldc:int(4764)), invokestatic:Double[expected:Object](Double::valueOf, loadelement:double(var_2_65:double[], var_4_73:int)))
                    invokevirtual:void(PrintStream::println, stack_25F_0:PrintStream, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, stack_24B_0:StringBuilder, invokestatic:String(String::format, stack_248_0:String, expr_235:Object[])), loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), and:int(ldc:int(47), ldc:int(16398))))))
                    stack_2B6_0 = getstatic:PrintStream(System::out)
                    stack_2A2_0 = invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), and:int(ldc:int(15439), ldc:int(16687))))
                    stack_29F_0 = loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), xor:int(ldc:int(23), ldc:int(26)))
                    expr_28C = newarray:Object[](java.lang.Object.class, and:int(ldc:int(2837), ldc:int(5121)))
                    storeelement:Object(expr_28C:Object[], and:int(ldc:int(789), ldc:int(-25494)), invokestatic:Double[expected:Object](Double::valueOf, loadelement:double(var_3_6B:double[], var_4_73:int)))
                    invokevirtual:void(PrintStream::println, stack_2B6_0:PrintStream, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, stack_2A2_0:StringBuilder, invokestatic:String(String::format, stack_29F_0:String, expr_28C:Object[])), loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), and:int(ldc:int(15), ldc:int(6158))))))
                    invokestatic:void(System::gc)
                    invokestatic:void(\ud7e8\u5db4\u6b0d\u6c56\u7873\u9255::\u97b7\u52d3\u9af2\u97e6\u836c\uf94d, ldc:long(5000L))
                    inc:int(var_4_73, ldc:int(1))
                }
            }
            
            invokestatic:void(\u7af6\u5654\u56bd\u6198\ub6ab\ub8be::\u4c04\u69d9\u983f\uc2e8\u3e75\uc2e8, loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), and:int(ldc:int(4368), ldc:int(25304))), getstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud523\u7e3f\uf9c5\u527a\ud523\ub113), getstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u3711\u7d52\u927d\u5db4\u4bc8\u6c56), getstatic:boolean(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ufe34\u946b\u74b1\u7043\uff55\u3776), getstatic:boolean(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ufe34\u6d99\u3d4b\u873d\ub1b9\ub19c), getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u7e3f\u4bc8\u8753\u7af6\u3776\u34df), var_2_65:double[], var_3_6B:double[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u4c04\ub70c\u416d\u4d85\uc238\u4179() {
        var_0_5F : int
        var_2_65 : double[]
        var_3_6B : double[]
        var_4_73 : int
        var_12_19C : \uc9f6\u6b0d\ub19c\u3e75\u9033\ub18d
        var_8_1B9 : \ub102\u5245\u3dd3\ud523\ud171\uc87f
        var_0_12D : int
        var_5_131 : long
        var_7_146 : \uc9f6\u6b0d\ub19c\u3e75\u9033\ub18d
        var_8_172 : \ub102\u5245\u3dd3\ud523\ud171\uc87f
        var_9_177 : double
        var_11_180 : int
        var_5_2F5 : long
        var_5_307 : long
        expr_20F : double[] [generated]
        expr_210 : int [generated]
        stack_26E_0 : PrintStream [generated]
        stack_25A_0 : StringBuilder [generated]
        stack_257_0 : String [generated]
        expr_244 : Object[] [generated]
        stack_2C5_0 : PrintStream [generated]
        stack_2B1_0 : StringBuilder [generated]
        stack_2AE_0 : String [generated]
        expr_29B : Object[] [generated]
        
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
            var_0_5F = and:int(ldc:int(-1140335640), ldc:int(-35741702))
            var_2_65 = newarray:double[](double.class, getstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u8bb0\ua61f\uc238\uceb8\u93a2\uf995))
            var_3_6B = newarray:double[](double.class, getstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u8bb0\ua61f\uc238\uceb8\u93a2\uf995))
            var_4_73 = and:int(ldc:int(5638), ldc:int(-5639))
            
            loop {
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(67108864)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-1974610880))
                    goto(Label_0283)
                }
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(32)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(980541927))
                }
                else {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-1107822594))
                    
                    if (cmplt:boolean(var_4_73:int, getstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u8bb0\ua61f\uc238\uceb8\u93a2\uf995))) {
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), xor:int(ldc:int(17166), ldc:int(17183)))), loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u4492\u7ce1\u71ae\u3e2a\uc87f\u385b), var_4_73:int)), loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), xor:int(ldc:int(2068), ldc:int(2054)))), loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u4492\u7ce1\u71ae\u3e2a\uc87f\u385b), var_4_73:int))))
                        
                        if (logicalnot:boolean(getstatic:boolean(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ufe34\u946b\u74b1\u7043\uff55\u3776))) {
                            goto(Label_0283)
                        }
                        
                        var_12_19C = initobject:\uc9f6\u6b0d\ub19c\u3e75\u9033\ub18d(\uc9f6\u6b0d\ub19c\u3e75\u9033\ub18d::<init>, loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u4492\u7ce1\u71ae\u3e2a\uc87f\u385b), var_4_73:int), loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u4492\u7ce1\u71ae\u3e2a\uc87f\u385b), var_4_73:int))
                        var_8_1B9 = initobject:\ub102\u5245\u3dd3\ud523\ud171\uc87f(\ub102\u5245\u3dd3\ud523\ud171\uc87f::<init>, mul:long(loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u4492\u7ce1\u71ae\u3e2a\uc87f\u385b), var_4_73:int), loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u4492\u7ce1\u71ae\u3e2a\uc87f\u385b), var_4_73:int)), and:int[expected:boolean](ldc:int(-11044), ldc:int(2849)))
                        invokestatic:void(\u7af6\u5654\u56bd\u6198\ub6ab\ub8be::\u5d20\uc229\uae5d\u0a06\u0b8e\u759a, loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u4492\u7ce1\u71ae\u3e2a\uc87f\u385b), var_4_73:int), loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u4492\u7ce1\u71ae\u3e2a\uc87f\u385b), var_4_73:int), var_8_1B9:\ub102\u5245\u3dd3\ud523\ud171\uc87f)
                        invokevirtual:void(\uc9f6\u6b0d\ub19c\u3e75\u9033\ub18d::\ud51e\u4975\u3776\ub18d\u51b2\u3711, var_12_19C:\uc9f6\u6b0d\ub19c\u3e75\u9033\ub18d, var_8_1B9:\ub102\u5245\u3dd3\ud523\ud171\uc87f, getstatic:boolean(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ufe34\u6d99\u3d4b\u873d\ub1b9\ub19c))
                        invokestatic:void(\u7af6\u5654\u56bd\u6198\ub6ab\ub8be::\u5d20\uc229\uae5d\u0a06\u0b8e\u759a, loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u4492\u7ce1\u71ae\u3e2a\uc87f\u385b), var_4_73:int), loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u4492\u7ce1\u71ae\u3e2a\uc87f\u385b), var_4_73:int), var_8_1B9:\ub102\u5245\u3dd3\ud523\ud171\uc87f)
                        invokevirtual:void(\uc9f6\u6b0d\ub19c\u3e75\u9033\ub18d::\ud51e\u4975\u3776\ub18d\u51b2\u3711, var_12_19C:\uc9f6\u6b0d\ub19c\u3e75\u9033\ub18d, var_8_1B9:\ub102\u5245\u3dd3\ud523\ud171\uc87f, getstatic:boolean(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ufe34\u6d99\u3d4b\u873d\ub1b9\ub19c))
                        goto(Label_0283)
                    }
                }
                
                Label_0160:
                
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(32)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(16)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    loopcontinue()
                }
                
                Label_0283:
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_0160)
                }
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(32768)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_0_12D = and:int(var_0_5F:int, ldc:int(2103375608))
                var_5_131 = invokestatic:long(System::nanoTime)
                var_7_146 = initobject:\uc9f6\u6b0d\ub19c\u3e75\u9033\ub18d(\uc9f6\u6b0d\ub19c\u3e75\u9033\ub18d::<init>, loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u4492\u7ce1\u71ae\u3e2a\uc87f\u385b), var_4_73:int), loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u4492\u7ce1\u71ae\u3e2a\uc87f\u385b), var_4_73:int))
                storeelement:double(var_3_6B:double[], var_4_73:int, div:double(l2d:double(sub:long(invokestatic:long(System::nanoTime), var_5_131:long)), ldc:double(1000000.0)))
                var_8_172 = initobject:\ub102\u5245\u3dd3\ud523\ud171\uc87f(\ub102\u5245\u3dd3\ud523\ud171\uc87f::<init>, mul:long(loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u4492\u7ce1\u71ae\u3e2a\uc87f\u385b), var_4_73:int), loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u4492\u7ce1\u71ae\u3e2a\uc87f\u385b), var_4_73:int)), and:int[expected:boolean](ldc:int(-2100), ldc:int(2099)))
                var_9_177 = ldc:double(1.7976931348623157E308)
                var_11_180 = and:int(ldc:int(7362), ldc:int(-7364))
                
                while (cmplt:boolean(var_11_180:int, getstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u3711\u7d52\u927d\u5db4\u4bc8\u6c56))) {
                    invokestatic:void(\u7af6\u5654\u56bd\u6198\ub6ab\ub8be::\u5d20\uc229\uae5d\u0a06\u0b8e\u759a, loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u4492\u7ce1\u71ae\u3e2a\uc87f\u385b), var_4_73:int), loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u4492\u7ce1\u71ae\u3e2a\uc87f\u385b), var_4_73:int), var_8_172:\ub102\u5245\u3dd3\ud523\ud171\uc87f)
                    var_5_2F5 = invokestatic:long(System::nanoTime)
                    invokevirtual:void(\uc9f6\u6b0d\ub19c\u3e75\u9033\ub18d::\ud51e\u4975\u3776\ub18d\u51b2\u3711, var_7_146:\uc9f6\u6b0d\ub19c\u3e75\u9033\ub18d, var_8_172:\ub102\u5245\u3dd3\ud523\ud171\uc87f, getstatic:boolean(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ufe34\u6d99\u3d4b\u873d\ub1b9\ub19c))
                    var_5_307 = sub:long(invokestatic:long(System::nanoTime), var_5_2F5:long)
                    
                    if (cmplt:boolean(l2d:double(var_5_307:long), var_9_177:double)) {
                        var_9_177 = l2d:double(var_5_307:long)
                    }
                    
                    var_0_12D = and:int(var_0_12D:int, ldc:int(2094977258))
                    inc:int(var_11_180, ldc:int(1))
                }
                
                var_0_5F = and:int(var_0_12D:int, ldc:int(-54071059))
                storeelement:double(var_2_65:double[], var_4_73:int, div:double(var_9_177:double, ldc:double(1000000.0)))
                expr_20F = var_3_6B:double[]
                expr_210 = var_4_73:int
                storeelement:double(expr_20F:double[], expr_210:int, add:double(loadelement:double(expr_20F:double[], expr_210:int), loadelement:double(var_2_65:double[], var_4_73:int)))
                stack_26E_0 = getstatic:PrintStream(System::out)
                stack_25A_0 = invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), xor:int(ldc:int(2245), ldc:int(2249))))
                stack_257_0 = loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), xor:int(ldc:int(-24566), ldc:int(-24569)))
                expr_244 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(1045), ldc:int(585)))
                storeelement:Object(expr_244:Object[], and:int(ldc:int(26266), ldc:int(-26620)), invokestatic:Double[expected:Object](Double::valueOf, loadelement:double(var_2_65:double[], var_4_73:int)))
                invokevirtual:void(PrintStream::println, stack_26E_0:PrintStream, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, stack_25A_0:StringBuilder, invokestatic:String(String::format, stack_257_0:String, expr_244:Object[])), loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), xor:int(ldc:int(26638), ldc:int(26624))))))
                stack_2C5_0 = getstatic:PrintStream(System::out)
                stack_2B1_0 = invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), and:int(ldc:int(4111), ldc:int(8255))))
                stack_2AE_0 = loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), and:int(ldc:int(8205), ldc:int(20015)))
                expr_29B = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(264), ldc:int(265)))
                storeelement:Object(expr_29B:Object[], and:int(ldc:int(-25216), ldc:int(25206)), invokestatic:Double[expected:Object](Double::valueOf, loadelement:double(var_3_6B:double[], var_4_73:int)))
                invokevirtual:void(PrintStream::println, stack_2C5_0:PrintStream, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, stack_2B1_0:StringBuilder, invokestatic:String(String::format, stack_2AE_0:String, expr_29B:Object[])), loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), xor:int(ldc:int(265), ldc:int(263))))))
                invokestatic:void(System::gc)
                invokestatic:void(\ud7e8\u5db4\u6b0d\u6c56\u7873\u9255::\u97b7\u52d3\u9af2\u97e6\u836c\uf94d, ldc:long(5000L))
                inc:int(var_4_73, ldc:int(1))
            }
            
            invokestatic:void(\u7af6\u5654\u56bd\u6198\ub6ab\ub8be::\u4c04\u69d9\u983f\uc2e8\u3e75\uc2e8, loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), xor:int(ldc:int(12304), ldc:int(12291))), getstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud523\u7e3f\uf9c5\u527a\ud523\ub113), getstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u3711\u7d52\u927d\u5db4\u4bc8\u6c56), getstatic:boolean(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ufe34\u946b\u74b1\u7043\uff55\u3776), getstatic:boolean(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ufe34\u6d99\u3d4b\u873d\ub1b9\ub19c), getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u4492\u7ce1\u71ae\u3e2a\uc87f\u385b), var_2_65:double[], var_3_6B:double[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u8258\ucfaf\u6c56\u12cb\u67e9\uae87() {
        var_0_126 : int
        var_2_65 : double[]
        var_3_6B : double[]
        var_4_73 : int
        var_12_19C : \uc9f6\u6b0d\ub19c\u3e75\u9033\ub18d
        var_8_1B0 : double[][]
        var_0_136 : int
        var_5_13A : long
        var_7_14F : \uc9f6\u6b0d\ub19c\u3e75\u9033\ub18d
        var_8_172 : double[][]
        var_9_177 : double
        var_11_180 : int
        var_5_2F0 : long
        var_5_302 : long
        expr_207 : double[] [generated]
        expr_208 : int [generated]
        stack_266_0 : PrintStream [generated]
        stack_252_0 : StringBuilder [generated]
        stack_24F_0 : String [generated]
        expr_23C : Object[] [generated]
        stack_2BD_0 : PrintStream [generated]
        stack_2A9_0 : StringBuilder [generated]
        stack_2A6_0 : String [generated]
        expr_293 : Object[] [generated]
        var_8_2C4 : double[][]
        
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
            var_0_126 = and:int(ldc:int(1584764584), ldc:int(-1631791944))
            var_2_65 = newarray:double[](double.class, getstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u8bb0\ua61f\uc238\uceb8\u93a2\uf995))
            var_3_6B = newarray:double[](double.class, getstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u8bb0\ua61f\uc238\uceb8\u93a2\uf995))
            var_4_73 = and:int(ldc:int(358), ldc:int(-1896))
            
            loop {
                if (cmpeq:boolean(and:int(var_0_126:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_0283)
                }
                
                if (cmpne:boolean(and:int(var_0_126:int, ldc:int(32)), ldc:int(0))) {
                    var_0_126 = and:int(var_0_126:int, ldc:int(-1209017095))
                    
                    if (cmplt:boolean(var_4_73:int, getstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u8bb0\ua61f\uc238\uceb8\u93a2\uf995))) {
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), and:int(ldc:int(24732), ldc:int(1044)))), loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u4492\u7ce1\u71ae\u3e2a\uc87f\u385b), var_4_73:int)), loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), and:int(ldc:int(8210), ldc:int(4306)))), loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u4492\u7ce1\u71ae\u3e2a\uc87f\u385b), var_4_73:int))))
                        
                        if (logicalnot:boolean(getstatic:boolean(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ufe34\u946b\u74b1\u7043\uff55\u3776))) {
                            goto(Label_0283)
                        }
                        
                        var_12_19C = initobject:\uc9f6\u6b0d\ub19c\u3e75\u9033\ub18d(\uc9f6\u6b0d\ub19c\u3e75\u9033\ub18d::<init>, loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u4492\u7ce1\u71ae\u3e2a\uc87f\u385b), var_4_73:int), loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u4492\u7ce1\u71ae\u3e2a\uc87f\u385b), var_4_73:int))
                        var_8_1B0 = multianewarray:double[][](double[][].class, l2i:int(loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u4492\u7ce1\u71ae\u3e2a\uc87f\u385b), var_4_73:int)), l2i:int(loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u4492\u7ce1\u71ae\u3e2a\uc87f\u385b), var_4_73:int)))
                        invokestatic:void(\u7af6\u5654\u56bd\u6198\ub6ab\ub8be::\u5d20\uc229\uae5d\u0a06\u0b8e\u759a, loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u4492\u7ce1\u71ae\u3e2a\uc87f\u385b), var_4_73:int), loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u4492\u7ce1\u71ae\u3e2a\uc87f\u385b), var_4_73:int), var_8_1B0:double[][])
                        invokevirtual:void(\uc9f6\u6b0d\ub19c\u3e75\u9033\ub18d::\ud51e\u4975\u3776\ub18d\u51b2\u3711, var_12_19C:\uc9f6\u6b0d\ub19c\u3e75\u9033\ub18d, var_8_1B0:double[][], getstatic:boolean(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ufe34\u6d99\u3d4b\u873d\ub1b9\ub19c))
                        invokestatic:void(\u7af6\u5654\u56bd\u6198\ub6ab\ub8be::\u5d20\uc229\uae5d\u0a06\u0b8e\u759a, loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u4492\u7ce1\u71ae\u3e2a\uc87f\u385b), var_4_73:int), loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u4492\u7ce1\u71ae\u3e2a\uc87f\u385b), var_4_73:int), var_8_1B0:double[][])
                        invokevirtual:void(\uc9f6\u6b0d\ub19c\u3e75\u9033\ub18d::\ud51e\u4975\u3776\ub18d\u51b2\u3711, var_12_19C:\uc9f6\u6b0d\ub19c\u3e75\u9033\ub18d, var_8_1B0:double[][], getstatic:boolean(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ufe34\u6d99\u3d4b\u873d\ub1b9\ub19c))
                        goto(Label_0283)
                    }
                }
                
                Label_0144:
                
                if (cmpeq:boolean(and:int(var_0_126:int, ldc:int(268435456)), ldc:int(0))) {
                    var_0_126 = and:int(var_0_126:int, ldc:int(-1752214458))
                }
                else {
                    if (cmpeq:boolean(and:int(var_0_126:int, ldc:int(2097152)), ldc:int(0))) {
                        var_0_126 = and:int(var_0_126:int, ldc:int(2029476824))
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                Label_0283:
                
                if (cmpeq:boolean(and:int(var_0_126:int, ldc:int(2097152)), ldc:int(0))) {
                    var_0_126 = and:int(var_0_126:int, ldc:int(942767009))
                    goto(Label_0144)
                }
                
                if (cmpne:boolean(and:int(var_0_126:int, ldc:int(1)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_0_136 = and:int(var_0_126:int, ldc:int(-798122753))
                var_5_13A = invokestatic:long(System::nanoTime)
                var_7_14F = initobject:\uc9f6\u6b0d\ub19c\u3e75\u9033\ub18d(\uc9f6\u6b0d\ub19c\u3e75\u9033\ub18d::<init>, loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u4492\u7ce1\u71ae\u3e2a\uc87f\u385b), var_4_73:int), loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u4492\u7ce1\u71ae\u3e2a\uc87f\u385b), var_4_73:int))
                storeelement:double(var_3_6B:double[], var_4_73:int, div:double(l2d:double(sub:long(invokestatic:long(System::nanoTime), var_5_13A:long)), ldc:double(1000000.0)))
                var_8_172 = multianewarray:double[][](double[][].class, l2i:int(loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u4492\u7ce1\u71ae\u3e2a\uc87f\u385b), var_4_73:int)), l2i:int(loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u4492\u7ce1\u71ae\u3e2a\uc87f\u385b), var_4_73:int)))
                var_9_177 = ldc:double(1.7976931348623157E308)
                var_11_180 = and:int(ldc:int(6603), ldc:int(-6604))
                
                while (cmplt:boolean(var_11_180:int, getstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u3711\u7d52\u927d\u5db4\u4bc8\u6c56))) {
                    invokestatic:void(\u7af6\u5654\u56bd\u6198\ub6ab\ub8be::\u5d20\uc229\uae5d\u0a06\u0b8e\u759a, loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u4492\u7ce1\u71ae\u3e2a\uc87f\u385b), var_4_73:int), loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u4492\u7ce1\u71ae\u3e2a\uc87f\u385b), var_4_73:int), var_8_172:double[][])
                    var_5_2F0 = invokestatic:long(System::nanoTime)
                    invokevirtual:void(\uc9f6\u6b0d\ub19c\u3e75\u9033\ub18d::\ud51e\u4975\u3776\ub18d\u51b2\u3711, var_7_14F:\uc9f6\u6b0d\ub19c\u3e75\u9033\ub18d, var_8_172:double[][], getstatic:boolean(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ufe34\u6d99\u3d4b\u873d\ub1b9\ub19c))
                    var_5_302 = sub:long(invokestatic:long(System::nanoTime), var_5_2F0:long)
                    
                    if (cmplt:boolean(l2d:double(var_5_302:long), var_9_177:double)) {
                        var_9_177 = l2d:double(var_5_302:long)
                    }
                    
                    var_0_136 = and:int(var_0_136:int, ldc:int(837350842))
                    inc:int(var_11_180, ldc:int(1))
                }
                
                var_0_126 = and:int(var_0_136:int, ldc:int(-198453841))
                storeelement:double(var_2_65:double[], var_4_73:int, div:double(var_9_177:double, ldc:double(1000000.0)))
                expr_207 = var_3_6B:double[]
                expr_208 = var_4_73:int
                storeelement:double(expr_207:double[], expr_208:int, add:double(loadelement:double(expr_207:double[], expr_208:int), loadelement:double(var_2_65:double[], var_4_73:int)))
                stack_266_0 = getstatic:PrintStream(System::out)
                stack_252_0 = invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), and:int(ldc:int(268), ldc:int(174))))
                stack_24F_0 = loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), xor:int(ldc:int(-8165), ldc:int(-8170)))
                expr_23C = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(24712), ldc:int(24713)))
                storeelement:Object(expr_23C:Object[], and:int(ldc:int(21563), ldc:int(-30076)), invokestatic:Double[expected:Object](Double::valueOf, loadelement:double(var_2_65:double[], var_4_73:int)))
                invokevirtual:void(PrintStream::println, stack_266_0:PrintStream, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, stack_252_0:StringBuilder, invokestatic:String(String::format, stack_24F_0:String, expr_23C:Object[])), loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), and:int(ldc:int(8238), ldc:int(590))))))
                stack_2BD_0 = getstatic:PrintStream(System::out)
                stack_2A9_0 = invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), xor:int(ldc:int(16449), ldc:int(16462))))
                stack_2A6_0 = loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), and:int(ldc:int(1117), ldc:int(28941)))
                expr_293 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(136), ldc:int(137)))
                storeelement:Object(expr_293:Object[], and:int(ldc:int(-10917), ldc:int(10916)), invokestatic:Double[expected:Object](Double::valueOf, loadelement:double(var_3_6B:double[], var_4_73:int)))
                invokevirtual:void(PrintStream::println, stack_2BD_0:PrintStream, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, stack_2A9_0:StringBuilder, invokestatic:String(String::format, stack_2A6_0:String, expr_293:Object[])), loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), and:int(ldc:int(1806), ldc:int(15))))))
                var_8_2C4 = checkcast:double[][](double[][].class, aconstnull:double[][]())
                invokestatic:void(System::gc)
                invokestatic:void(\ud7e8\u5db4\u6b0d\u6c56\u7873\u9255::\u97b7\u52d3\u9af2\u97e6\u836c\uf94d, ldc:long(5000L))
                inc:int(var_4_73, ldc:int(1))
            }
            
            invokestatic:void(\u7af6\u5654\u56bd\u6198\ub6ab\ub8be::\u4c04\u69d9\u983f\uc2e8\u3e75\uc2e8, loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), xor:int(ldc:int(5248), ldc:int(5269))), getstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud523\u7e3f\uf9c5\u527a\ud523\ub113), getstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u3711\u7d52\u927d\u5db4\u4bc8\u6c56), getstatic:boolean(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ufe34\u946b\u74b1\u7043\uff55\u3776), getstatic:boolean(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ufe34\u6d99\u3d4b\u873d\ub1b9\ub19c), getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u4492\u7ce1\u71ae\u3e2a\uc87f\u385b), var_2_65:double[], var_3_6B:double[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u64f2\u6b5f\u3e75\uc229\u5d20\u759a() {
        var_0_61 : int
        var_2_67 : double[]
        var_3_6D : double[]
        var_4_75 : int
        var_12_1C5 : \ufe34\ua6bd\u16f6\u9255\u6cfe\u8d90
        var_8_1E9 : \ub102\u5245\u3dd3\ud523\ud171\uc87f
        var_0_143 : int
        var_5_147 : long
        var_7_162 : \ufe34\ua6bd\u16f6\u9255\u6cfe\u8d90
        var_8_195 : \ub102\u5245\u3dd3\ud523\ud171\uc87f
        var_9_19A : double
        var_11_1A3 : int
        var_5_338 : long
        var_5_34A : long
        expr_24C : double[] [generated]
        expr_24D : int [generated]
        stack_2AB_0 : PrintStream [generated]
        stack_297_0 : StringBuilder [generated]
        stack_294_0 : String [generated]
        expr_281 : Object[] [generated]
        stack_302_0 : PrintStream [generated]
        stack_2EE_0 : StringBuilder [generated]
        stack_2EB_0 : String [generated]
        expr_2D8 : Object[] [generated]
        
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
            var_0_61 = and:int(ldc:int(-1553206734), ldc:int(-1581035272))
            var_2_67 = newarray:double[](double.class, getstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u8bb0\ua61f\uc238\uceb8\u93a2\uf995))
            var_3_6D = newarray:double[](double.class, getstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u8bb0\ua61f\uc238\uceb8\u93a2\uf995))
            var_4_75 = and:int(ldc:int(4490), ldc:int(-21899))
            
            loop {
                if (cmpne:boolean(and:int(var_0_61:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_0303)
                }
                
                if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_0_61 = and:int(var_0_61:int, ldc:int(32130612))
                }
                else {
                    var_0_61 = and:int(var_0_61:int, ldc:int(-1843727))
                    
                    if (cmplt:boolean(var_4_75:int, getstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u8bb0\ua61f\uc238\uceb8\u93a2\uf995))) {
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), and:int(ldc:int(3350), ldc:int(4182)))), loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int)), loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), xor:int(ldc:int(1064), ldc:int(1082)))), loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int)), loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), and:int(ldc:int(17459), ldc:int(2266)))), loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int))))
                        
                        if (logicalnot:boolean(getstatic:boolean(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ufe34\u946b\u74b1\u7043\uff55\u3776))) {
                            goto(Label_0303)
                        }
                        
                        var_12_1C5 = initobject:\ufe34\ua6bd\u16f6\u9255\u6cfe\u8d90(\ufe34\ua6bd\u16f6\u9255\u6cfe\u8d90::<init>, loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int), loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int), loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int))
                        var_8_1E9 = initobject:\ub102\u5245\u3dd3\ud523\ud171\uc87f(\ub102\u5245\u3dd3\ud523\ud171\uc87f::<init>, mul:long(mul:long(loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int), loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int)), loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int)), and:int[expected:boolean](ldc:int(16604), ldc:int(-16605)))
                        invokestatic:void(\u7af6\u5654\u56bd\u6198\ub6ab\ub8be::\u6c52\ufcaf\u516c\u3a62\ucef1\ud12e, loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int), loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int), loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int), var_8_1E9:\ub102\u5245\u3dd3\ud523\ud171\uc87f)
                        invokevirtual:void(\ufe34\ua6bd\u16f6\u9255\u6cfe\u8d90::\u71ae\uc9f6\ubded\ub32d\u4975\u4492, var_12_1C5:\ufe34\ua6bd\u16f6\u9255\u6cfe\u8d90, var_8_1E9:\ub102\u5245\u3dd3\ud523\ud171\uc87f, getstatic:boolean(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ufe34\u6d99\u3d4b\u873d\ub1b9\ub19c))
                        invokestatic:void(\u7af6\u5654\u56bd\u6198\ub6ab\ub8be::\u6c52\ufcaf\u516c\u3a62\ucef1\ud12e, loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int), loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int), loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int), var_8_1E9:\ub102\u5245\u3dd3\ud523\ud171\uc87f)
                        invokevirtual:void(\ufe34\ua6bd\u16f6\u9255\u6cfe\u8d90::\u71ae\uc9f6\ubded\ub32d\u4975\u4492, var_12_1C5:\ufe34\ua6bd\u16f6\u9255\u6cfe\u8d90, var_8_1E9:\ub102\u5245\u3dd3\ud523\ud171\uc87f, getstatic:boolean(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ufe34\u6d99\u3d4b\u873d\ub1b9\ub19c))
                        goto(Label_0303)
                    }
                }
                
                Label_0156:
                
                if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(8388608)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_0_61:int, ldc:int(16384)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    loopcontinue()
                }
                
                Label_0303:
                
                if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_0156)
                }
                
                if (cmpne:boolean(and:int(var_0_61:int, ldc:int(134217728)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_0_143 = and:int(var_0_61:int, ldc:int(-1385210217))
                var_5_147 = invokestatic:long(System::nanoTime)
                var_7_162 = initobject:\ufe34\ua6bd\u16f6\u9255\u6cfe\u8d90(\ufe34\ua6bd\u16f6\u9255\u6cfe\u8d90::<init>, loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int), loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int), loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int))
                storeelement:double(var_3_6D:double[], var_4_75:int, div:double(l2d:double(sub:long(invokestatic:long(System::nanoTime), var_5_147:long)), ldc:double(1000000.0)))
                var_8_195 = initobject:\ub102\u5245\u3dd3\ud523\ud171\uc87f(\ub102\u5245\u3dd3\ud523\ud171\uc87f::<init>, mul:long(mul:long(loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int), loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int)), loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int)), and:int[expected:boolean](ldc:int(14416), ldc:int(-14673)))
                var_9_19A = ldc:double(1.7976931348623157E308)
                var_11_1A3 = and:int(ldc:int(-845), ldc:int(844))
                
                while (cmplt:boolean(var_11_1A3:int, getstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u3711\u7d52\u927d\u5db4\u4bc8\u6c56))) {
                    invokestatic:void(\u7af6\u5654\u56bd\u6198\ub6ab\ub8be::\u6c52\ufcaf\u516c\u3a62\ucef1\ud12e, loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int), loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int), loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int), var_8_195:\ub102\u5245\u3dd3\ud523\ud171\uc87f)
                    var_5_338 = invokestatic:long(System::nanoTime)
                    invokevirtual:void(\ufe34\ua6bd\u16f6\u9255\u6cfe\u8d90::\u71ae\uc9f6\ubded\ub32d\u4975\u4492, var_7_162:\ufe34\ua6bd\u16f6\u9255\u6cfe\u8d90, var_8_195:\ub102\u5245\u3dd3\ud523\ud171\uc87f, getstatic:boolean(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ufe34\u6d99\u3d4b\u873d\ub1b9\ub19c))
                    var_5_34A = sub:long(invokestatic:long(System::nanoTime), var_5_338:long)
                    
                    if (cmplt:boolean(l2d:double(var_5_34A:long), var_9_19A:double)) {
                        var_9_19A = l2d:double(var_5_34A:long)
                    }
                    
                    var_0_143 = and:int(var_0_143:int, ldc:int(2111789276))
                    inc:int(var_11_1A3, ldc:int(1))
                }
                
                var_0_61 = and:int(var_0_143:int, ldc:int(-246945029))
                storeelement:double(var_2_67:double[], var_4_75:int, div:double(var_9_19A:double, ldc:double(1000000.0)))
                expr_24C = var_3_6D:double[]
                expr_24D = var_4_75:int
                storeelement:double(expr_24C:double[], expr_24D:int, add:double(loadelement:double(expr_24C:double[], expr_24D:int), loadelement:double(var_2_67:double[], var_4_75:int)))
                stack_2AB_0 = getstatic:PrintStream(System::out)
                stack_297_0 = invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), and:int(ldc:int(269), ldc:int(10926))))
                stack_294_0 = loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), and:int(ldc:int(397), ldc:int(10303)))
                expr_281 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(8457), ldc:int(2581)))
                storeelement:Object(expr_281:Object[], and:int(ldc:int(16691), ldc:int(-17720)), invokestatic:Double[expected:Object](Double::valueOf, loadelement:double(var_2_67:double[], var_4_75:int)))
                invokevirtual:void(PrintStream::println, stack_2AB_0:PrintStream, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, stack_297_0:StringBuilder, invokestatic:String(String::format, stack_294_0:String, expr_281:Object[])), loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), and:int(ldc:int(24606), ldc:int(2094))))))
                stack_302_0 = getstatic:PrintStream(System::out)
                stack_2EE_0 = invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), and:int(ldc:int(2575), ldc:int(4543))))
                stack_2EB_0 = loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), xor:int(ldc:int(36), ldc:int(41)))
                expr_2D8 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(-22524), ldc:int(-22523)))
                storeelement:Object(expr_2D8:Object[], and:int(ldc:int(-18172), ldc:int(18011)), invokestatic:Double[expected:Object](Double::valueOf, loadelement:double(var_3_6D:double[], var_4_75:int)))
                invokevirtual:void(PrintStream::println, stack_302_0:PrintStream, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, stack_2EE_0:StringBuilder, invokestatic:String(String::format, stack_2EB_0:String, expr_2D8:Object[])), loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), xor:int(ldc:int(-32763), ldc:int(-32757))))))
                invokestatic:void(System::gc)
                invokestatic:void(\ud7e8\u5db4\u6b0d\u6c56\u7873\u9255::\u97b7\u52d3\u9af2\u97e6\u836c\uf94d, ldc:long(5000L))
                inc:int(var_4_75, ldc:int(1))
            }
            
            invokestatic:void(\u7af6\u5654\u56bd\u6198\ub6ab\ub8be::\u4c04\u69d9\u983f\uc2e8\u3e75\uc2e8, loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), xor:int(ldc:int(-16342), ldc:int(-16323))), getstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud523\u7e3f\uf9c5\u527a\ud523\ub113), getstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u3711\u7d52\u927d\u5db4\u4bc8\u6c56), getstatic:boolean(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ufe34\u946b\u74b1\u7043\uff55\u3776), getstatic:boolean(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ufe34\u6d99\u3d4b\u873d\ub1b9\ub19c), getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_2_67:double[], var_3_6D:double[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u74b1\u6198\u4e72\ub32d\u7d52\u7006() {
        var_0_61 : int
        var_2_67 : double[]
        var_3_6D : double[]
        var_4_75 : int
        var_12_1C8 : \ufe34\ua6bd\u16f6\u9255\u6cfe\u8d90
        var_8_1E3 : double[][][]
        var_0_14F : int
        var_5_153 : long
        var_7_16E : \ufe34\ua6bd\u16f6\u9255\u6cfe\u8d90
        var_8_198 : double[][][]
        var_9_19D : double
        var_11_1A6 : int
        var_5_335 : long
        var_5_347 : long
        expr_246 : double[] [generated]
        expr_247 : int [generated]
        stack_2A5_0 : PrintStream [generated]
        stack_291_0 : StringBuilder [generated]
        stack_28E_0 : String [generated]
        expr_27B : Object[] [generated]
        stack_2FC_0 : PrintStream [generated]
        stack_2E8_0 : StringBuilder [generated]
        stack_2E5_0 : String [generated]
        expr_2D2 : Object[] [generated]
        var_8_303 : double[][][]
        
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
            var_0_61 = and:int(ldc:int(1443419032), ldc:int(-780544003))
            var_2_67 = newarray:double[](double.class, getstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u8bb0\ua61f\uc238\uceb8\u93a2\uf995))
            var_3_6D = newarray:double[](double.class, getstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u8bb0\ua61f\uc238\uceb8\u93a2\uf995))
            var_4_75 = and:int(ldc:int(20000), ldc:int(-20001))
            
            loop {
                if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(512)), ldc:int(0))) {
                    var_0_61 = and:int(var_0_61:int, ldc:int(1518562247))
                    goto(Label_0305)
                }
                
                if (cmpne:boolean(and:int(var_0_61:int, ldc:int(256)), ldc:int(0))) {
                    var_0_61 = and:int(var_0_61:int, ldc:int(-547507298))
                    
                    if (cmplt:boolean(var_4_75:int, getstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u8bb0\ua61f\uc238\uceb8\u93a2\uf995))) {
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), and:int(ldc:int(4504), ldc:int(8313)))), loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int)), loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), and:int(ldc:int(14866), ldc:int(17778)))), loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int)), loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), and:int(ldc:int(6554), ldc:int(8210)))), loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int))))
                        
                        if (logicalnot:boolean(getstatic:boolean(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ufe34\u946b\u74b1\u7043\uff55\u3776))) {
                            goto(Label_0305)
                        }
                        
                        var_12_1C8 = initobject:\ufe34\ua6bd\u16f6\u9255\u6cfe\u8d90(\ufe34\ua6bd\u16f6\u9255\u6cfe\u8d90::<init>, loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int), loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int), loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int))
                        var_8_1E3 = multianewarray:double[][][](double[][][].class, l2i:int(loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int)), l2i:int(loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int)), l2i:int(loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int)))
                        invokestatic:void(\u7af6\u5654\u56bd\u6198\ub6ab\ub8be::\u6c52\ufcaf\u516c\u3a62\ucef1\ud12e, loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int), loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int), loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int), var_8_1E3:double[][][])
                        invokevirtual:void(\ufe34\ua6bd\u16f6\u9255\u6cfe\u8d90::\u71ae\uc9f6\ubded\ub32d\u4975\u4492, var_12_1C8:\ufe34\ua6bd\u16f6\u9255\u6cfe\u8d90, var_8_1E3:double[][][], getstatic:boolean(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ufe34\u6d99\u3d4b\u873d\ub1b9\ub19c))
                        invokestatic:void(\u7af6\u5654\u56bd\u6198\ub6ab\ub8be::\u6c52\ufcaf\u516c\u3a62\ucef1\ud12e, loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int), loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int), loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int), var_8_1E3:double[][][])
                        invokevirtual:void(\ufe34\ua6bd\u16f6\u9255\u6cfe\u8d90::\u71ae\uc9f6\ubded\ub32d\u4975\u4492, var_12_1C8:\ufe34\ua6bd\u16f6\u9255\u6cfe\u8d90, var_8_1E3:double[][][], getstatic:boolean(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ufe34\u6d99\u3d4b\u873d\ub1b9\ub19c))
                        goto(Label_0305)
                    }
                }
                
                Label_0157:
                
                if (cmpne:boolean(and:int(var_0_61:int, ldc:int(256)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(8192)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    loopcontinue()
                }
                
                Label_0305:
                
                if (cmpne:boolean(and:int(var_0_61:int, ldc:int(8192)), ldc:int(0))) {
                    var_0_61 = and:int(var_0_61:int, ldc:int(394629611))
                    goto(Label_0157)
                }
                
                if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(512)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_0_14F = and:int(var_0_61:int, ldc:int(-538987523))
                var_5_153 = invokestatic:long(System::nanoTime)
                var_7_16E = initobject:\ufe34\ua6bd\u16f6\u9255\u6cfe\u8d90(\ufe34\ua6bd\u16f6\u9255\u6cfe\u8d90::<init>, loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int), loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int), loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int))
                storeelement:double(var_3_6D:double[], var_4_75:int, div:double(l2d:double(sub:long(invokestatic:long(System::nanoTime), var_5_153:long)), ldc:double(1000000.0)))
                var_8_198 = multianewarray:double[][][](double[][][].class, l2i:int(loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int)), l2i:int(loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int)), l2i:int(loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int)))
                var_9_19D = ldc:double(1.7976931348623157E308)
                var_11_1A6 = and:int(ldc:int(-28000), ldc:int(27997))
                
                while (cmplt:boolean(var_11_1A6:int, getstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u3711\u7d52\u927d\u5db4\u4bc8\u6c56))) {
                    invokestatic:void(\u7af6\u5654\u56bd\u6198\ub6ab\ub8be::\u6c52\ufcaf\u516c\u3a62\ucef1\ud12e, loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int), loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int), loadelement:long(getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_4_75:int), var_8_198:double[][][])
                    var_5_335 = invokestatic:long(System::nanoTime)
                    invokevirtual:void(\ufe34\ua6bd\u16f6\u9255\u6cfe\u8d90::\u71ae\uc9f6\ubded\ub32d\u4975\u4492, var_7_16E:\ufe34\ua6bd\u16f6\u9255\u6cfe\u8d90, var_8_198:double[][][], getstatic:boolean(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ufe34\u6d99\u3d4b\u873d\ub1b9\ub19c))
                    var_5_347 = sub:long(invokestatic:long(System::nanoTime), var_5_335:long)
                    
                    if (cmplt:boolean(l2d:double(var_5_347:long), var_9_19D:double)) {
                        var_9_19D = l2d:double(var_5_347:long)
                    }
                    
                    var_0_14F = and:int(var_0_14F:int, ldc:int(-201402470))
                    inc:int(var_11_1A6, ldc:int(1))
                }
                
                var_0_61 = and:int(var_0_14F:int, ldc:int(-740715586))
                storeelement:double(var_2_67:double[], var_4_75:int, div:double(var_9_19D:double, ldc:double(1000000.0)))
                expr_246 = var_3_6D:double[]
                expr_247 = var_4_75:int
                storeelement:double(expr_246:double[], expr_247:int, add:double(loadelement:double(expr_246:double[], expr_247:int), loadelement:double(var_2_67:double[], var_4_75:int)))
                stack_2A5_0 = getstatic:PrintStream(System::out)
                stack_291_0 = invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), and:int(ldc:int(734), ldc:int(45))))
                stack_28E_0 = loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), xor:int(ldc:int(4226), ldc:int(4239)))
                expr_27B = newarray:Object[](java.lang.Object.class, and:int(ldc:int(1281), ldc:int(133)))
                storeelement:Object(expr_27B:Object[], and:int(ldc:int(24106), ldc:int(-24111)), invokestatic:Double[expected:Object](Double::valueOf, loadelement:double(var_2_67:double[], var_4_75:int)))
                invokevirtual:void(PrintStream::println, stack_2A5_0:PrintStream, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, stack_291_0:StringBuilder, invokestatic:String(String::format, stack_28E_0:String, expr_27B:Object[])), loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), and:int(ldc:int(1038), ldc:int(62))))))
                stack_2FC_0 = getstatic:PrintStream(System::out)
                stack_2E8_0 = invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), and:int(ldc:int(15), ldc:int(26687))))
                stack_2E5_0 = loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), xor:int(ldc:int(4622), ldc:int(4611)))
                expr_2D2 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(1088), ldc:int(1089)))
                storeelement:Object(expr_2D2:Object[], and:int(ldc:int(-27638), ldc:int(11105)), invokestatic:Double[expected:Object](Double::valueOf, loadelement:double(var_3_6D:double[], var_4_75:int)))
                invokevirtual:void(PrintStream::println, stack_2FC_0:PrintStream, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, stack_2E8_0:StringBuilder, invokestatic:String(String::format, stack_2E5_0:String, expr_2D2:Object[])), loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), and:int(ldc:int(4270), ldc:int(8782))))))
                var_8_303 = checkcast:double[][][](double[][][].class, aconstnull:double[][][]())
                invokestatic:void(System::gc)
                invokestatic:void(\ud7e8\u5db4\u6b0d\u6c56\u7873\u9255::\u97b7\u52d3\u9af2\u97e6\u836c\uf94d, ldc:long(5000L))
                inc:int(var_4_75, ldc:int(1))
            }
            
            invokestatic:void(\u7af6\u5654\u56bd\u6198\ub6ab\ub8be::\u4c04\u69d9\u983f\uc2e8\u3e75\uc2e8, loadelement:String(getstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6), and:int(ldc:int(3609), ldc:int(91))), getstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud523\u7e3f\uf9c5\u527a\ud523\ub113), getstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u3711\u7d52\u927d\u5db4\u4bc8\u6c56), getstatic:boolean(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ufe34\u946b\u74b1\u7043\uff55\u3776), getstatic:boolean(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ufe34\u6d99\u3d4b\u873d\ub1b9\ub19c), getstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776), var_2_67:double[], var_3_6D:double[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void main(java.lang.String[] p0) {
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
            invokestatic:void(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u9af2\u416d\uceb8\ud12e\u7bad\uc246, p0:String[])
            invokestatic:void(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u071d\u5bc4\u4e72\u3711\u47c2\u3e2a)
            invokestatic:void(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u4c04\ub70c\u416d\u4d85\uc238\u4179)
            invokestatic:void(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u8258\ucfaf\u6c56\u12cb\u67e9\uae87)
            invokestatic:void(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u64f2\u6b5f\u3e75\uc229\u5d20\u759a)
            invokestatic:void(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u74b1\u6198\u4e72\ub32d\u7d52\u7006)
            invokestatic:void(System::exit, and:int(ldc:int(25289), ldc:int(-25310)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_67E : int
        expr_6E : int [generated]
        stack_93_0 : byte[] [generated]
        stack_95_0 : byte[] [generated]
        stack_B3_0 : byte[] [generated]
        stack_B5_0 : byte[] [generated]
        stack_D9_0 : byte[] [generated]
        stack_5D3_0 : byte[] [generated]
        stack_62A_0 : byte[] [generated]
        stack_691_0 : byte[] [generated]
        var_4_5B5 : int
        var_3_5BA : byte[]
        var_5_5BB : int
        expr_5D3 : byte [generated]
        var_0_687 : int
        expr_691 : byte [generated]
        stack_6C1_2 : byte [generated]
        var_2_93 : byte[]
        expr_97 : int [generated]
        var_3_618 : byte[]
        var_5_619 : int
        expr_B5 : int [generated]
        var_3_E5 : String
        stack_3BB_0 : String[] [generated]
        expr_F7 : String[] [generated]
        expr_3E8 : long[] [generated]
        expr_47D : long[] [generated]
        expr_512 : long[] [generated]
        
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
        var_0_67E = and:int(ldc:int(-627195825), ldc:int(-633361301))
        expr_6E = arraylength:int(stack_93_0 = stack_95_0 = stack_B3_0 = stack_B5_0 = stack_D9_0 = stack_5D3_0 = stack_62A_0 = stack_691_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("Lf6KsM81lkSgkKpctqLTGVa2Vi4bXIhU1T2KprK2qLBEkKi6NH5CL/6KsM81lkSgkKpctqLTGVa2Vi4bXIhUtLKiwzWKprK2qLBEkKi6NH6iDbZSqiIX/byGvtRm8L6omlayzRVUiKxetqCOxTeeWCQboFKqDJjMvrpAmFgq9KaSCJSeZAVcLBlUkEgk+sC+ukCYWCr0ppIIlJhqtD2+trigw5SedFADXCwZVJBIJPrAvrpAmFgq9KaSCJSYarQ9vra4oMOUmHpQA1wsGVSQSCT6wL66QJhYKvSmkgiUmmi0Pb62uKDDlJ50UANcLBlUkEgk+sC+ukCYWCr0ppIIlJpotD2+trigw5SaeFADXCwZVJBIJDu4ili2tlCUqGjOukKGqnjOvrpAmFhqrpKOFJhEObCmRrCKWLa2UJSoaM66QoaqeM6+ukCYWGquko4UmuiKuLa4oEwUmEQ5sKZGsIpYtrZQlKhozrpChqp4zr66QJhYaq6SjhSa6Iq4trigTBSaSjmwpkawili2tlCUqGjOukKGqnjOvrpAmFhqrpKOFJTuiri2uKBMFJhEObCmRrCKWLa2UJSoaM66QoaqeM6+ukCYWGquko4UlO6KuLa4oEwUlEg5sKZGjHSEroCktqAo7nA7hHSMmKi6rsvscAuiilSOx+BwC7BQkEgk6nALsFKEWqQs5HAbVJBIiiKQmrI66nAbVJBIiiKSmLI66nAbVJBIiiKcnrI66nAbVoRapLSKDPK6uLgwlGrkcBtWhFqktIoM8rq4uDCWaORwdKg=")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_5B5 = expr_6E:int
        var_3_5BA = newarray:byte[](byte.class, expr_6E:int)
        var_5_5BB = expr_6E:int
        Label_1469:
        
        while (cmpne:boolean(and:int(var_0_67E:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_67E = and:int(var_0_67E:int, ldc:int(-1621115313))
            var_5_5BB = add:int(var_5_5BB:int, ldc:int(-1))
            expr_5D3 = loadelement:byte(stack_5D3_0:byte[], var_5_5BB:int)
            storeelement:byte(var_3_5BA:byte[], var_5_5BB:int, add:int(xor:int(or:int(and:int(shl:int(expr_5D3:byte, xor:int(ldc:int(-26606), ldc:int(-26602))), ldc:int(-16)), and:int(shr:int(expr_5D3:byte[expected:int], and:int(ldc:int(1029), ldc:int(4236))), ldc:int(15))), ldc:int(61)), ldc:int(41)))
            
            if (cmpne:boolean(var_5_5BB:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_95_0 = stack_93_0 = stack_B3_0 = stack_B5_0 = stack_D9_0 = stack_5D3_0 = stack_62A_0 = stack_691_0 = var_3_5BA:byte[]
            goto(Label_0115)
        }
        
        Label_1649:
        
        while (cmpne:boolean(and:int(var_0_67E:int, ldc:int(64)), ldc:int(0))) {
            var_0_687 = and:int(var_0_67E:int, ldc:int(-635589889))
            var_5_5BB = add:int(var_5_5BB:int, ldc:int(-1))
            expr_691 = loadelement:byte(stack_691_0:byte[], var_5_5BB:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_5BB:int, ldc:int(1)), neg:int(var_4_5B5:int)), ldc:int(0))) {
                var_0_687 = and:int(var_0_687:int, ldc:int(-620901521))
                stack_6C1_2 = add:byte(expr_691:byte, ldc:byte(1))
            }
            else {
                stack_6C1_2 = add:byte(expr_691:byte, loadelement:byte(var_3_5BA:byte[], add:int(var_5_5BB:int, ldc:int(1))))
            }
            
            var_0_67E = and:int(var_0_687:int, ldc:int(-1687298961))
            storeelement:byte(var_3_5BA:byte[], var_5_5BB:int, stack_6C1_2:byte)
            
            if (cmpne:boolean(var_5_5BB:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_95_0 = stack_93_0 = stack_B3_0 = stack_B5_0 = stack_D9_0 = stack_5D3_0 = stack_62A_0 = stack_691_0 = var_3_5BA:byte[]
            goto(Label_0186)
        }
        
        var_0_67E = and:int(var_0_67E:int, ldc:int(-965987511))
        goto(Label_1469)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_67E:int, ldc:int(8)), ldc:int(0))) {
            var_0_67E = and:int(var_0_67E:int, ldc:int(-405928171))
            goto(Label_0186)
        }
        
        if (cmpne:boolean(and:int(var_0_67E:int, ldc:int(65536)), ldc:int(0))) {
            var_0_67E = and:int(var_0_67E:int, ldc:int(-10631045))
            var_2_93 = stack_93_0:byte[]
            expr_97 = add:int(arraylength:int(stack_95_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_97:int, ldc:int(0))) {
                var_3_618 = newarray:byte[](byte.class, expr_97:int)
                var_5_619 = expr_97:int
                
                loop {
                    var_0_67E = and:int(var_0_67E:int, ldc:int(-1155550209))
                    var_5_619 = add:int(var_5_619:int, ldc:int(-1))
                    storeelement:byte(var_3_618:byte[], var_5_619:int, add:int(shl:int(loadelement:byte(stack_62A_0:byte[], var_5_619:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_93:byte[], add:int(var_5_619:int, and:int(ldc:int(1045), ldc:int(18945)))), ldc:int(5)), and:int(ldc:int(17247), ldc:int(3111)))))
                    
                    if (cmpne:boolean(var_5_619:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_95_0 = stack_93_0 = stack_B3_0 = stack_B5_0 = stack_D9_0 = stack_5D3_0 = stack_62A_0 = stack_691_0 = var_3_618:byte[]
            }
        }
        
        Label_0156:
        
        if (cmpne:boolean(and:int(var_0_67E:int, ldc:int(64)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_67E:int, ldc:int(268435456)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_67E = and:int(var_0_67E:int, ldc:int(-627056165))
            expr_B5 = arraylength:int(stack_B5_0:byte[])
            
            if (cmpne:boolean(expr_B5:int, ldc:int(0))) {
                var_4_5B5 = expr_B5:int
                var_3_5BA = newarray:byte[](byte.class, expr_B5:int)
                var_5_5BB = expr_B5:int
                goto(Label_1649)
            }
        }
        
        Label_0186:
        
        if (cmpeq:boolean(and:int(var_0_67E:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0156)
        }
        
        if (cmpeq:boolean(and:int(var_0_67E:int, ldc:int(8)), ldc:int(0))) {
            var_0_67E = and:int(var_0_67E:int, ldc:int(1033109141))
            goto(Label_0115)
        }
        
        var_3_E5 = initobject:String(String::<init>, stack_D9_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_3BB_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(16795), ldc:int(8222)))
        expr_F7 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(158), ldc:int(16410)))
        storeelement:String(expr_F7:String[], xor:int(ldc:int(16402), ldc:int(16413)), invokevirtual:String[expected:String](String::substring, var_3_E5:String, and:int(ldc:int(-3455), ldc:int(2428)), xor:int(ldc:int(527), ldc:int(552))))
        storeelement:String(expr_F7:String[], xor:int(ldc:int(1027), ldc:int(1039)), invokevirtual:String[expected:String](String::substring, var_3_E5:String, xor:int(ldc:int(298), ldc:int(269)), and:int(ldc:int(5367), ldc:int(19281))))
        storeelement:String(expr_F7:String[], and:int(ldc:int(78), ldc:int(13070)), invokevirtual:String[expected:String](String::substring, var_3_E5:String, and:int(ldc:int(2385), ldc:int(9427)), xor:int(ldc:int(59), ldc:int(109))))
        storeelement:String(expr_F7:String[], xor:int(ldc:int(5904), ldc:int(5890)), invokevirtual:String[expected:String](String::substring, var_3_E5:String, and:int(ldc:int(18519), ldc:int(1878)), xor:int(ldc:int(595), ldc:int(522))))
        storeelement:String(expr_F7:String[], xor:int(ldc:int(-16374), ldc:int(-16377)), invokevirtual:String[expected:String](String::substring, var_3_E5:String, and:int(ldc:int(123), ldc:int(19549)), xor:int(ldc:int(67), ldc:int(30))))
        storeelement:String(expr_F7:String[], and:int(ldc:int(6326), ldc:int(-6327)), invokevirtual:String[expected:String](String::substring, var_3_E5:String, xor:int(ldc:int(28741), ldc:int(28696)), xor:int(ldc:int(-32465), ldc:int(-32424))))
        storeelement:String(expr_F7:String[], and:int(ldc:int(491), ldc:int(13323)), invokevirtual:String[expected:String](String::substring, var_3_E5:String, and:int(ldc:int(119), ldc:int(4855)), and:int(ldc:int(28830), ldc:int(1998))))
        storeelement:String(expr_F7:String[], and:int(ldc:int(12825), ldc:int(243)), invokevirtual:String[expected:String](String::substring, var_3_E5:String, xor:int(ldc:int(215), ldc:int(89)), xor:int(ldc:int(8252), ldc:int(8332))))
        storeelement:String(expr_F7:String[], xor:int(ldc:int(-24557), ldc:int(-24569)), invokevirtual:String[expected:String](String::substring, var_3_E5:String, and:int(ldc:int(5361), ldc:int(18612)), and:int(ldc:int(978), ldc:int(28922))))
        storeelement:String(expr_F7:String[], and:int(ldc:int(30), ldc:int(2582)), invokevirtual:String[expected:String](String::substring, var_3_E5:String, xor:int(ldc:int(4461), ldc:int(4543)), and:int(ldc:int(1780), ldc:int(500))))
        storeelement:String(expr_F7:String[], xor:int(ldc:int(-19950), ldc:int(-19958)), invokevirtual:String[expected:String](String::substring, var_3_E5:String, and:int(ldc:int(6397), ldc:int(1012)), xor:int(ldc:int(7204), ldc:int(7474))))
        storeelement:String(expr_F7:String[], and:int(ldc:int(16400), ldc:int(2416)), invokevirtual:String[expected:String](String::substring, var_3_E5:String, and:int(ldc:int(18710), ldc:int(1462)), xor:int(ldc:int(4796), ldc:int(5002))))
        storeelement:String(expr_F7:String[], and:int(ldc:int(25875), ldc:int(91)), invokevirtual:String[expected:String](String::substring, var_3_E5:String, xor:int(ldc:int(1036), ldc:int(1338)), and:int(ldc:int(351), ldc:int(24927))))
        storeelement:String(expr_F7:String[], xor:int(ldc:int(4269), ldc:int(4280)), invokevirtual:String[expected:String](String::substring, var_3_E5:String, and:int(ldc:int(20831), ldc:int(479)), and:int(ldc:int(2440), ldc:int(16845))))
        storeelement:String(expr_F7:String[], xor:int(ldc:int(-28471), ldc:int(-28450)), invokevirtual:String[expected:String](String::substring, var_3_E5:String, xor:int(ldc:int(1223), ldc:int(1359)), and:int(ldc:int(27061), ldc:int(1011))))
        storeelement:String(expr_F7:String[], xor:int(ldc:int(4289), ldc:int(4312)), invokevirtual:String[expected:String](String::substring, var_3_E5:String, xor:int(ldc:int(100), ldc:int(469)), and:int(ldc:int(25050), ldc:int(991))))
        storeelement:String(expr_F7:String[], and:int(ldc:int(150), ldc:int(17702)), invokevirtual:String[expected:String](String::substring, var_3_E5:String, xor:int(ldc:int(-30248), ldc:int(-30718)), xor:int(ldc:int(-32422), ldc:int(-32580))))
        storeelement:String(expr_F7:String[], and:int(ldc:int(197), ldc:int(8197)), invokevirtual:String[expected:String](String::substring, var_3_E5:String, xor:int(ldc:int(327), ldc:int(161)), and:int(ldc:int(505), ldc:int(13809))))
        storeelement:String(expr_F7:String[], and:int(ldc:int(6436), ldc:int(8836)), invokevirtual:String[expected:String](String::substring, var_3_E5:String, xor:int(ldc:int(38), ldc:int(471)), xor:int(ldc:int(249), ldc:int(256))))
        storeelement:String(expr_F7:String[], xor:int(ldc:int(-24058), ldc:int(-24063)), invokevirtual:String[expected:String](String::substring, var_3_E5:String, xor:int(ldc:int(17098), ldc:int(17203)), and:int(ldc:int(4993), ldc:int(25111))))
        storeelement:String(expr_F7:String[], xor:int(ldc:boolean(0), ldc:boolean(1)), invokevirtual:String[expected:String](String::substring, var_3_E5:String, and:int(ldc:int(8899), ldc:int(6689)), and:int(ldc:int(29370), ldc:int(1803))))
        storeelement:String(expr_F7:String[], xor:int(ldc:int(66), ldc:int(74)), invokevirtual:String[expected:String](String::substring, var_3_E5:String, xor:int(ldc:int(8475), ldc:int(8977)), and:int(ldc:int(21142), ldc:int(534))))
        storeelement:String(expr_F7:String[], xor:int(ldc:int(-32668), ldc:int(-32659)), invokevirtual:String[expected:String](String::substring, var_3_E5:String, and:int(ldc:int(4630), ldc:int(1822)), and:int(ldc:int(8930), ldc:int(19234))))
        storeelement:String(expr_F7:String[], and:int(ldc:int(24874), ldc:int(2058)), invokevirtual:String[expected:String](String::substring, var_3_E5:String, xor:int(ldc:int(8197), ldc:int(8743)), xor:int(ldc:int(65), ldc:int(623))))
        storeelement:String(expr_F7:String[], xor:int(ldc:int(9224), ldc:int(9226)), invokevirtual:String[expected:String](String::substring, var_3_E5:String, xor:int(ldc:int(20726), ldc:int(21208)), xor:int(ldc:int(25517), ldc:int(24978))))
        storeelement:String(expr_F7:String[], and:int(ldc:int(12579), ldc:int(17479)), invokevirtual:String[expected:String](String::substring, var_3_E5:String, and:int(ldc:int(5759), ldc:int(2623)), and:int(ldc:int(22098), ldc:int(597))))
        putstatic:String[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u6c52\uc229\u385b\ud4fe\u6bb9\uc9f6, expr_F7:String[])
        putstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud523\u7e3f\uf9c5\u527a\ud523\ub113, ldc:int(8))
        putstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u3711\u7d52\u927d\u5db4\u4bc8\u6c56, xor:int(ldc:int(687), ldc:int(615)))
        putstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u8bb0\ua61f\uc238\uceb8\u93a2\uf995, ldc:int(16))
        putstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u93a2\ua3b4\ua3b4\u9a18\ud7e8\u7049, ldc:int(65636))
        putstatic:int(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u51fa\u873d\u7049\uff55\u99f7\ua068, ldc:int(65636))
        putstatic:boolean(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ufe34\u946b\u74b1\u7043\uff55\u3776, xor:int[expected:boolean](ldc:int(-31726), ldc:int(-31725)))
        expr_3E8 = newarray:long[](long.class, ldc:int(16))
        storeelement:long(expr_3E8:long[], and:int(ldc:int(-8491), ldc:int(8490)), ldc:long(262144L))
        storeelement:long(expr_3E8:long[], xor:int(ldc:int(4178), ldc:int(4179)), ldc:long(524288L))
        storeelement:long(expr_3E8:long[], and:int(ldc:int(2), ldc:int(20022)), ldc:long(1048576L))
        storeelement:long(expr_3E8:long[], xor:int(ldc:int(25091), ldc:int(25088)), ldc:long(2097152L))
        storeelement:long(expr_3E8:long[], and:int(ldc:int(9350), ldc:int(4124)), ldc:long(4194304L))
        storeelement:long(expr_3E8:long[], xor:int(ldc:int(2125), ldc:int(2120)), ldc:long(8388608L))
        storeelement:long(expr_3E8:long[], ldc:int(6), ldc:long(16777216L))
        storeelement:long(expr_3E8:long[], ldc:int(7), ldc:long(33554432L))
        storeelement:long(expr_3E8:long[], ldc:int(8), ldc:long(10368L))
        storeelement:long(expr_3E8:long[], ldc:int(9), ldc:long(27000L))
        storeelement:long(expr_3E8:long[], ldc:int(10), ldc:long(75600L))
        storeelement:long(expr_3E8:long[], ldc:int(11), ldc:long(165375L))
        storeelement:long(expr_3E8:long[], ldc:int(12), ldc:long(362880L))
        storeelement:long(expr_3E8:long[], ldc:int(13), ldc:long(1562500L))
        storeelement:long(expr_3E8:long[], ldc:int(14), ldc:long(3211264L))
        storeelement:long(expr_3E8:long[], ldc:int(15), ldc:long(6250000L))
        putstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u7e3f\u4bc8\u8753\u7af6\u3776\u34df, expr_3E8:long[])
        expr_47D = newarray:long[](long.class, ldc:int(16))
        storeelement:long(expr_47D:long[], and:int(ldc:int(-19086), ldc:int(19084)), ldc:long(256L))
        storeelement:long(expr_47D:long[], xor:int(ldc:int(8229), ldc:int(8228)), ldc:long(512L))
        storeelement:long(expr_47D:long[], xor:int(ldc:int(20481), ldc:int(20483)), ldc:long(1024L))
        storeelement:long(expr_47D:long[], xor:int(ldc:int(8222), ldc:int(8221)), ldc:long(2048L))
        storeelement:long(expr_47D:long[], xor:int(ldc:int(73), ldc:int(77)), ldc:long(4096L))
        storeelement:long(expr_47D:long[], and:int(ldc:int(4119), ldc:int(17413)), ldc:long(8192L))
        storeelement:long(expr_47D:long[], ldc:int(6), ldc:long(16384L))
        storeelement:long(expr_47D:long[], ldc:int(7), ldc:long(32768L))
        storeelement:long(expr_47D:long[], ldc:int(8), ldc:long(260L))
        storeelement:long(expr_47D:long[], ldc:int(9), ldc:long(520L))
        storeelement:long(expr_47D:long[], ldc:int(10), ldc:long(1050L))
        storeelement:long(expr_47D:long[], ldc:int(11), ldc:long(1458L))
        storeelement:long(expr_47D:long[], ldc:int(12), ldc:long(1960L))
        storeelement:long(expr_47D:long[], ldc:int(13), ldc:long(2916L))
        storeelement:long(expr_47D:long[], ldc:int(14), ldc:long(4116L))
        storeelement:long(expr_47D:long[], ldc:int(15), ldc:long(5832L))
        putstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\u4492\u7ce1\u71ae\u3e2a\uc87f\u385b, expr_47D:long[])
        expr_512 = newarray:long[](long.class, ldc:int(16))
        storeelement:long(expr_512:long[], and:int(ldc:int(10522), ldc:int(-11708)), ldc:long(16L))
        storeelement:long(expr_512:long[], and:int(ldc:int(24609), ldc:int(7177)), ldc:long(32L))
        storeelement:long(expr_512:long[], and:int(ldc:int(1163), ldc:int(2)), ldc:long(64L))
        storeelement:long(expr_512:long[], xor:int(ldc:int(16436), ldc:int(16439)), ldc:long(128L))
        storeelement:long(expr_512:long[], and:int(ldc:int(100), ldc:int(20620)), ldc:long(256L))
        storeelement:long(expr_512:long[], and:int(ldc:int(581), ldc:int(24581)), ldc:long(512L))
        storeelement:long(expr_512:long[], ldc:int(6), ldc:long(1024L))
        storeelement:long(expr_512:long[], ldc:int(7), ldc:long(2048L))
        storeelement:long(expr_512:long[], ldc:int(8), ldc:long(5L))
        storeelement:long(expr_512:long[], ldc:int(9), ldc:long(17L))
        storeelement:long(expr_512:long[], ldc:int(10), ldc:long(30L))
        storeelement:long(expr_512:long[], ldc:int(11), ldc:long(95L))
        storeelement:long(expr_512:long[], ldc:int(12), ldc:long(180L))
        storeelement:long(expr_512:long[], ldc:int(13), ldc:long(270L))
        storeelement:long(expr_512:long[], ldc:int(14), ldc:long(324L))
        storeelement:long(expr_512:long[], ldc:int(15), ldc:long(420L))
        putstatic:long[](\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ud217\u5245\u5d20\u4492\u3a62\u3776, expr_512:long[])
        putstatic:boolean(\u839e\u3bd6\u8389\u72f1\u392e\u6fb0::\ufe34\u6d99\u3d4b\u873d\ub1b9\ub19c, and:int[expected:boolean](ldc:int(18826), ldc:int(-18827)))
    }
    
    public void \u36d3\u8c8a\u6d99\ubb2b\uc3e3\ud217(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_63D : int
        var_5_89 : int
        var_6_90 : int
        var_7_9F : double
        var_9_C6 : double
        var_3_D8 : int
        var_11_E9 : int
        var_14_113 : double
        var_16_117 : int
        var_12_10F : double
        var_17_648 : int
        
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
        var_3_63D = and:int(ldc:int(-922993430), ldc:int(1274814132))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u839e\u3bd6\u8389\u72f1\u392e\u6fb0[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0179)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(256)), ldc:int(0))) {
            var_3_63D = and:int(var_3_63D:int, ldc:int(-714933250))
        }
        else {
            var_3_63D = and:int(var_3_63D:int, ldc:int(-553865310))
            var_5_89 = and:int(ldc:int(16926), ldc:int(-25183))
            var_6_90 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9F = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-17903), ldc:int(16870)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C6 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D8 = and:int(var_3_63D:int, ldc:int(1988017765))
                    var_9_C6 = sub:double(var_7_9F:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E9 = var_5_89:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E9:int, sub:int(var_6_90:int, xor:int(ldc:int(60), ldc:int(61)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E9:int, and:int(ldc:int(1953), ldc:int(2121)))), var_7_9F:double))) {
                        inc:int(var_11_E9, ldc:int(1))
                    }
                    
                    var_3_63D = and:int(var_3_D8:int, ldc:int(1694254266))
                    var_14_113 = var_7_9F:double
                    var_16_117 = var_11_E9:int
                }
                else {
                    var_11_E9 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_89:int), and:int(ldc:int(4163), ldc:int(2577)))
                    var_12_10F = var_14_113 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89)
                    
                    if (cmplt:boolean(var_16_117 = var_11_E9:int, var_6_90:int)) {
                        var_9_C6 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E9:int)
                        var_16_117 = var_11_E9:int
                        var_14_113 = var_12_10F:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1516)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1364)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1224)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1934879943))
                        goto(Label_1096)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-583353280))
                        goto(Label_0958)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0821)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0556)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1893705195))
                        
                        if (cmplt:boolean(var_16_117:int, var_6_90:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0556)
                            }
                            
                            goto(Label_0821)
                        }
                    }
                    
                    Label_0385:
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1516)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-197878747))
                        goto(Label_1364)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1064851789))
                        goto(Label_1224)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1096)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1988845548))
                        goto(Label_0958)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0821)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(449139481))
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(-1169422662))
                            loopcontinue()
                        }
                        
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-530753947))
                        var_11_E9 = and:int(ldc:int(-31770), ldc:int(15385))
                        goto(Label_1505)
                    }
                    
                    Label_0556:
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1516)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-140886823))
                        goto(Label_1364)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1224)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1096)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(2112068716))
                        goto(Label_0958)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-25606618))
                        goto(Label_0821)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(-1257410601))
                            goto(Label_0385)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-880987076))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_113 = var_9_C6:double
                            goto(Label_0821)
                        }
                    }
                    
                    Label_0676:
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1615945324))
                        goto(Label_1516)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1364)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-68649631))
                        goto(Label_1224)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1733214267))
                        goto(Label_1096)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-217610620))
                        goto(Label_0958)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-62259918))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0556)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0385)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(1663926847))
                            loopcontinue()
                        }
                        
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1390282465))
                        var_14_113 = mul:double(ldc:double(0.5), add:double(var_9_C6:double, var_14_113:double))
                    }
                    
                    Label_0821:
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1988118674))
                        goto(Label_1516)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1032162100))
                        goto(Label_1364)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1441603648))
                        goto(Label_1224)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1883962165))
                        goto(Label_1096)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(1981484694))
                            goto(Label_0556)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0385)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(512)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(1662326505))
                            loopcontinue()
                        }
                        
                        var_3_63D = and:int(var_3_63D:int, ldc:int(2069650615))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89:int), var_7_9F:double)) {
                                var_11_E9 = xor:int(ldc:int(2049), ldc:int(2048))
                                goto(Label_1096)
                            }
                        }
                    }
                    
                    Label_0958:
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1516)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1364)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1224)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(219117863))
                            goto(Label_0821)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(256)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(-1403982154))
                            goto(Label_0556)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0385)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-144778208))
                        var_11_E9 = and:int(ldc:int(-3187), ldc:int(3186))
                    }
                    
                    Label_1096:
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-109422673))
                        goto(Label_1516)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-40443054))
                        goto(Label_1364)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0958)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0821)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(146646412))
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(799377573))
                            goto(Label_0556)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0385)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(-1473368053))
                            loopcontinue()
                        }
                        
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-369291801))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                                goto(Label_1364)
                            }
                        }
                    }
                    
                    Label_1224:
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1932636023))
                        goto(Label_1516)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1830273842))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(-577662676))
                            goto(Label_1096)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0958)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0821)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(1613435920))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(256)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(91391038))
                            goto(Label_0556)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0385)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(16)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(1197436666))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_113:double, var_5_89:int, var_16_117:int)
                            goto(Label_1505)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1364:
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1873417330))
                        goto(Label_1516)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-814051700))
                        goto(Label_1224)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-625247030))
                        goto(Label_1096)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1262549242))
                        goto(Label_0958)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0821)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0556)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1738954796))
                        goto(Label_0385)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(256)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_63D = and:int(var_3_63D:int, ldc:int(-796940363))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_113:double, ldc:double(0.0))
                    Label_1505:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_648 = var_5_89:int
                        
                        if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1516:
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1797062028))
                        goto(Label_1364)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1224)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1096)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0958)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0821)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0556)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0385)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-631466832))
                        var_17_648 = add:int(var_16_117:int, and:int(ldc:int(4185), ldc:int(19587)))
                        looporswitchbreak()
                    }
                }
                
                var_3_63D = and:int(var_3_63D:int, ldc:int(-369275033))
                
                if (cmple:boolean(var_5_89 = var_17_648:int, sub:int(var_6_90:int, and:int(ldc:int(2049), ldc:int(24657))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0179:
        
        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(32768)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
