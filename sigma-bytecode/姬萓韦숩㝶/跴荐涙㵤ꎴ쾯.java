public class \u59ec\u8413\u97e6\uc229\u3776.\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf {
    private void \u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf() {
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
            invokespecial:Object(Object::<init>, this:\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \uf9c5\uafe7\u16f6\u3e75\u416d\u88c5(java.lang.String[] p0) {
        var_1_118 : int
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
            var_1_118 = and:int(ldc:int(-1165636033), ldc:int(-3285285))
            
            if (cmple:boolean(arraylength:int(p0:String[]), ldc:int(0))) {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), and:int(ldc:int(-15964), ldc:int(7771))))
            }
            else {
                putstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u4ab3\uc238\u64f2\u8d90\u7e3f\u6fb0, invokestatic:int(Integer::parseInt, loadelement:String(p0:String[], and:int(ldc:int(27746), ldc:int(-28540)))))
                putstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\uc229\u74b1\u5245\u51b2\u8aa5\u4daf, invokestatic:int(Integer::parseInt, loadelement:String(p0:String[], and:int(ldc:int(17443), ldc:int(10577)))))
                putstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u4c2b\u5140\u12cb\u647c\u2dcc\u5d20, invokestatic:int(Integer::parseInt, loadelement:String(p0:String[], xor:int(ldc:int(4160), ldc:int(4162)))))
                putstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ua3b4\u3bc9\ud7e8\ud217\u8753\ua3b4, invokestatic:int(Integer::parseInt, loadelement:String(p0:String[], and:int(ldc:int(10275), ldc:int(1155)))))
                putstatic:boolean(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\uc7fe\u0a06\ua3b4\u7c6b\u8aa5\u4bc8, invokestatic:boolean(Boolean::parseBoolean, loadelement:String(p0:String[], xor:int(ldc:int(24771), ldc:int(24775)))))
                putstatic:boolean(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u0b8e\u36d3\u6d99\uf94d\uae5d\u8bb0, invokestatic:boolean(Boolean::parseBoolean, loadelement:String(p0:String[], xor:int(ldc:int(-28542), ldc:int(-28537)))))
                putstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u4492\ubefe\u3e75\u4e72\u3d4b\u62da, invokestatic:int(Integer::parseInt, loadelement:String(p0:String[], ldc:int(6))))
                putstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u183a\u64ab\u527a\u4daf\u6c52\u97b7, newarray:long[](long.class, getstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u4492\ubefe\u3e75\u4e72\u3d4b\u62da)))
                putstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ucfaf\u69d9\u1187\u6198\u6c56\u8308, newarray:long[](long.class, getstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u4492\ubefe\u3e75\u4e72\u3d4b\u62da)))
                putstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae, newarray:long[](long.class, getstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u4492\ubefe\u3e75\u4e72\u3d4b\u62da)))
                var_3_105 = and:int(ldc:int(-2408), ldc:int(2407))
                
                loop {
                    if (cmpeq:boolean(and:int(var_1_118:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0378)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_118:int, ldc:int(64)), ldc:int(0))) {
                        var_1_118 = and:int(var_1_118:int, ldc:int(-1545233188))
                    }
                    else {
                        var_1_118 = and:int(var_1_118:int, ldc:int(-14508225))
                        
                        if (cmplt:boolean(var_3_105:int, getstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u4492\ubefe\u3e75\u4e72\u3d4b\u62da))) {
                            storeelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u183a\u64ab\u527a\u4daf\u6c52\u97b7), var_3_105:int, i2l:long(invokestatic:int(Integer::parseInt, loadelement:String(p0:String[], add:int(ldc:int(7), var_3_105:int)))))
                            inc:int(var_3_105, ldc:int(1))
                            loopcontinue()
                        }
                    }
                    
                    Label_0296:
                    
                    if (cmpne:boolean(and:int(var_1_118:int, ldc:int(64)), ldc:int(0))) {
                        var_1_118 = and:int(var_1_118:int, ldc:int(-1568193857))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_1_118:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_1_118 = and:int(var_1_118:int, ldc:int(-1504219242))
                            loopcontinue()
                        }
                        
                        var_1_118 = and:int(var_1_118:int, ldc:int(-10633377))
                        var_3_105 = and:int(ldc:int(20608), ldc:int(-20609))
                        
                        while (cmplt:boolean(var_3_105:int, getstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u4492\ubefe\u3e75\u4e72\u3d4b\u62da))) {
                            storeelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ucfaf\u69d9\u1187\u6198\u6c56\u8308), var_3_105:int, i2l:long(invokestatic:int(Integer::parseInt, loadelement:String(p0:String[], add:int(add:int(ldc:int(7), getstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u4492\ubefe\u3e75\u4e72\u3d4b\u62da)), var_3_105:int)))))
                            inc:int(var_3_105, ldc:int(1))
                        }
                    }
                    
                    Label_0378:
                    
                    if (cmpne:boolean(and:int(var_1_118:int, ldc:int(4194304)), ldc:int(0))) {
                        var_1_118 = and:int(var_1_118:int, ldc:int(-824003407))
                        goto(Label_0296)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_118:int, ldc:int(524288)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
                
                var_3_19C = and:int(ldc:int(-9812), ldc:int(9299))
                
                while (cmplt:boolean(var_3_19C:int, getstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u4492\ubefe\u3e75\u4e72\u3d4b\u62da))) {
                    storeelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_3_19C:int, i2l:long(invokestatic:int(Integer::parseInt, loadelement:String(p0:String[], add:int(add:int(add:int(ldc:int(7), getstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u4492\ubefe\u3e75\u4e72\u3d4b\u62da)), getstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u4492\ubefe\u3e75\u4e72\u3d4b\u62da)), var_3_19C:int)))))
                    inc:int(var_3_19C, ldc:int(1))
                }
            }
            
            invokestatic:void(\ud171\ua61f\u0800\u9a18\u392e\u4179::\u88c5\u8308\u183a\u8df4\u3d64\ub8be, getstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u4ab3\uc238\u64f2\u8d90\u7e3f\u6fb0))
            invokestatic:void(\ud7e8\u5db4\u6b0d\u6c56\u7873\u9255::\ua3b4\u760c\u3d64\u392e\ucb79\u983f, i2l:long(getstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\uc229\u74b1\u5245\u51b2\u8aa5\u4daf)))
            invokestatic:void(\ud7e8\u5db4\u6b0d\u6c56\u7873\u9255::\u5d20\u8753\u6c52\u2dcc\u4f4a\u960f, i2l:long(getstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u4c2b\u5140\u12cb\u647c\u2dcc\u5d20)))
            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), xor:int(ldc:int(6210), ldc:int(6211)))), getstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u4ab3\uc238\u64f2\u8d90\u7e3f\u6fb0))))
            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), and:int(ldc:int(195), ldc:int(34)))), getstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\uc229\u74b1\u5245\u51b2\u8aa5\u4daf))))
            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), xor:int(ldc:int(-32568), ldc:int(-32565)))), getstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u4c2b\u5140\u12cb\u647c\u2dcc\u5d20))))
            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), and:int(ldc:int(9286), ldc:int(20484)))), getstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ua3b4\u3bc9\ud7e8\ud217\u8753\ua3b4))))
            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), xor:int(ldc:int(3078), ldc:int(3075)))), getstatic:boolean(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\uc7fe\u0a06\ua3b4\u7c6b\u8aa5\u4bc8))))
            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), xor:int(ldc:int(16977), ldc:int(16983)))), getstatic:boolean(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u0b8e\u36d3\u6d99\uf94d\uae5d\u8bb0))))
            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), and:int(ldc:int(24975), ldc:int(6695)))), getstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u4492\ubefe\u3e75\u4e72\u3d4b\u62da))))
            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), xor:int(ldc:int(22), ldc:int(30)))), invokestatic:String(Arrays::toString, getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u183a\u64ab\u527a\u4daf\u6c52\u97b7)))))
            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), xor:int(ldc:int(-24573), ldc:int(-24566)))), invokestatic:String(Arrays::toString, getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ucfaf\u69d9\u1187\u6198\u6c56\u8308)))))
            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), xor:int(ldc:int(197), ldc:int(207)))), invokestatic:String(Arrays::toString, getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae)))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u600f\u7d52\u183a\ub113\ubf56\u7043() {
        var_0_80 : int
        var_2_65 : double[]
        var_3_6B : double[]
        var_4_73 : int
        var_12_177 : \u51b2\ua562\u7ce1\u8308\u3e2a\u446c
        var_8_182 : double[]
        var_0_126 : int
        var_5_12A : long
        var_7_139 : \u51b2\ua562\u7ce1\u8308\u3e2a\u446c
        var_8_153 : double[]
        var_9_158 : double
        var_11_161 : int
        var_5_2A6 : long
        var_5_2B5 : long
        expr_1C6 : double[] [generated]
        expr_1C7 : int [generated]
        stack_225_0 : PrintStream [generated]
        stack_211_0 : StringBuilder [generated]
        stack_20E_0 : String [generated]
        expr_1FB : Object[] [generated]
        stack_27C_0 : PrintStream [generated]
        stack_268_0 : StringBuilder [generated]
        stack_265_0 : String [generated]
        expr_252 : Object[] [generated]
        
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
            var_0_80 = and:int(ldc:int(-779180826), ldc:int(-928039738))
            var_2_65 = newarray:double[](double.class, getstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u4492\ubefe\u3e75\u4e72\u3d4b\u62da))
            var_3_6B = newarray:double[](double.class, getstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u4492\ubefe\u3e75\u4e72\u3d4b\u62da))
            var_4_73 = and:int(ldc:int(-26539), ldc:int(25506))
            
            loop {
                if (cmpeq:boolean(and:int(var_0_80:int, ldc:int(131072)), ldc:int(0))) {
                    var_0_80 = and:int(var_0_80:int, ldc:int(1335389574))
                    goto(Label_0260)
                }
                
                if (cmpeq:boolean(and:int(var_0_80:int, ldc:int(4)), ldc:int(0))) {
                    var_0_80 = and:int(var_0_80:int, ldc:int(1826497730))
                }
                else {
                    var_0_80 = and:int(var_0_80:int, ldc:int(-541705010))
                    
                    if (cmplt:boolean(var_4_73:int, getstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u4492\ubefe\u3e75\u4e72\u3d4b\u62da))) {
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), and:int(ldc:int(1803), ldc:int(22639)))), loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u183a\u64ab\u527a\u4daf\u6c52\u97b7), var_4_73:int))))
                        
                        if (logicalnot:boolean(getstatic:boolean(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\uc7fe\u0a06\ua3b4\u7c6b\u8aa5\u4bc8))) {
                            goto(Label_0260)
                        }
                        
                        var_12_177 = initobject:\u51b2\ua562\u7ce1\u8308\u3e2a\u446c(\u51b2\ua562\u7ce1\u8308\u3e2a\u446c::<init>, loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u183a\u64ab\u527a\u4daf\u6c52\u97b7), var_4_73:int))
                        var_8_182 = newarray:double[](double.class, l2i:int(loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u183a\u64ab\u527a\u4daf\u6c52\u97b7), var_4_73:int)))
                        invokestatic:void(\u7af6\u5654\u56bd\u6198\ub6ab\ub8be::\u446c\ub1b9\u624e\ud171\u97b7\u3e2a, loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u183a\u64ab\u527a\u4daf\u6c52\u97b7), var_4_73:int), var_8_182:double[])
                        invokevirtual:void(\u51b2\ua562\u7ce1\u8308\u3e2a\u446c::\u4f52\u718f\u7043\u74b1\uceb8\u72f1, var_12_177:\u51b2\ua562\u7ce1\u8308\u3e2a\u446c, var_8_182:double[])
                        invokestatic:void(\u7af6\u5654\u56bd\u6198\ub6ab\ub8be::\u446c\ub1b9\u624e\ud171\u97b7\u3e2a, loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u183a\u64ab\u527a\u4daf\u6c52\u97b7), var_4_73:int), var_8_182:double[])
                        invokevirtual:void(\u51b2\ua562\u7ce1\u8308\u3e2a\u446c::\u4f52\u718f\u7043\u74b1\uceb8\u72f1, var_12_177:\u51b2\ua562\u7ce1\u8308\u3e2a\u446c, var_8_182:double[])
                        goto(Label_0260)
                    }
                }
                
                Label_0160:
                
                if (cmpne:boolean(and:int(var_0_80:int, ldc:int(4)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_0_80:int, ldc:int(8192)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    loopcontinue()
                }
                
                Label_0260:
                
                if (cmpne:boolean(and:int(var_0_80:int, ldc:int(4096)), ldc:int(0))) {
                    var_0_80 = and:int(var_0_80:int, ldc:int(-74139000))
                    goto(Label_0160)
                }
                
                if (cmpeq:boolean(and:int(var_0_80:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_0_80 = and:int(var_0_80:int, ldc:int(-112104020))
                }
                else {
                    var_0_126 = and:int(var_0_80:int, ldc:int(2127281350))
                    var_5_12A = invokestatic:long(System::nanoTime)
                    var_7_139 = initobject:\u51b2\ua562\u7ce1\u8308\u3e2a\u446c(\u51b2\ua562\u7ce1\u8308\u3e2a\u446c::<init>, loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u183a\u64ab\u527a\u4daf\u6c52\u97b7), var_4_73:int))
                    storeelement:double(var_3_6B:double[], var_4_73:int, div:double(l2d:double(sub:long(invokestatic:long(System::nanoTime), var_5_12A:long)), ldc:double(1000000.0)))
                    var_8_153 = newarray:double[](double.class, l2i:int(loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u183a\u64ab\u527a\u4daf\u6c52\u97b7), var_4_73:int)))
                    var_9_158 = ldc:double(1.7976931348623157E308)
                    var_11_161 = and:int(ldc:int(-29007), ldc:int(28750))
                    
                    while (cmplt:boolean(var_11_161:int, getstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ua3b4\u3bc9\ud7e8\ud217\u8753\ua3b4))) {
                        invokestatic:void(\u7af6\u5654\u56bd\u6198\ub6ab\ub8be::\u446c\ub1b9\u624e\ud171\u97b7\u3e2a, loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u183a\u64ab\u527a\u4daf\u6c52\u97b7), var_4_73:int), var_8_153:double[])
                        var_5_2A6 = invokestatic:long(System::nanoTime)
                        invokevirtual:void(\u51b2\ua562\u7ce1\u8308\u3e2a\u446c::\u4f52\u718f\u7043\u74b1\uceb8\u72f1, var_7_139:\u51b2\ua562\u7ce1\u8308\u3e2a\u446c, var_8_153:double[])
                        var_5_2B5 = sub:long(invokestatic:long(System::nanoTime), var_5_2A6:long)
                        
                        if (cmplt:boolean(l2d:double(var_5_2B5:long), var_9_158:double)) {
                            var_9_158 = l2d:double(var_5_2B5:long)
                        }
                        
                        var_0_126 = and:int(var_0_126:int, ldc:int(1554425831))
                        inc:int(var_11_161, ldc:int(1))
                    }
                    
                    var_0_80 = and:int(var_0_126:int, ldc:int(-1025839161))
                    storeelement:double(var_2_65:double[], var_4_73:int, div:double(var_9_158:double, ldc:double(1000000.0)))
                    expr_1C6 = var_3_6B:double[]
                    expr_1C7 = var_4_73:int
                    storeelement:double(expr_1C6:double[], expr_1C7:int, add:double(loadelement:double(expr_1C6:double[], expr_1C7:int), loadelement:double(var_2_65:double[], var_4_73:int)))
                    stack_225_0 = getstatic:PrintStream(System::out)
                    stack_211_0 = invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), xor:int(ldc:int(4933), ldc:int(4937))))
                    stack_20E_0 = loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), and:int(ldc:int(1549), ldc:int(13)))
                    expr_1FB = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(13344), ldc:int(13345)))
                    storeelement:Object(expr_1FB:Object[], and:int(ldc:int(-16109), ldc:int(5832)), invokestatic:Double[expected:Object](Double::valueOf, loadelement:double(var_2_65:double[], var_4_73:int)))
                    invokevirtual:void(PrintStream::println, stack_225_0:PrintStream, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, stack_211_0:StringBuilder, invokestatic:String(String::format, stack_20E_0:String, expr_1FB:Object[])), loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), xor:int(ldc:int(390), ldc:int(392))))))
                    stack_27C_0 = getstatic:PrintStream(System::out)
                    stack_268_0 = invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), xor:int(ldc:int(285), ldc:int(274))))
                    stack_265_0 = loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), xor:int(ldc:int(9231), ldc:int(9218)))
                    expr_252 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(1), ldc:int(10907)))
                    storeelement:Object(expr_252:Object[], and:int(ldc:int(10253), ldc:int(-10256)), invokestatic:Double[expected:Object](Double::valueOf, loadelement:double(var_3_6B:double[], var_4_73:int)))
                    invokevirtual:void(PrintStream::println, stack_27C_0:PrintStream, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, stack_268_0:StringBuilder, invokestatic:String(String::format, stack_265_0:String, expr_252:Object[])), loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), and:int(ldc:int(20622), ldc:int(1103))))))
                    invokestatic:void(System::gc)
                    invokestatic:void(\ud7e8\u5db4\u6b0d\u6c56\u7873\u9255::\u97b7\u52d3\u9af2\u97e6\u836c\uf94d, ldc:long(5000L))
                    inc:int(var_4_73, ldc:int(1))
                }
            }
            
            invokestatic:void(\u7af6\u5654\u56bd\u6198\ub6ab\ub8be::\u4c04\u69d9\u983f\uc2e8\u3e75\uc2e8, loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), xor:int(ldc:int(587), ldc:int(603))), getstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u4ab3\uc238\u64f2\u8d90\u7e3f\u6fb0), getstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ua3b4\u3bc9\ud7e8\ud217\u8753\ua3b4), getstatic:boolean(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\uc7fe\u0a06\ua3b4\u7c6b\u8aa5\u4bc8), getstatic:boolean(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u0b8e\u36d3\u6d99\uf94d\uae5d\u8bb0), getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u183a\u64ab\u527a\u4daf\u6c52\u97b7), var_2_65:double[], var_3_6B:double[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u7043\u6b5f\ub83f\u97e6\u36d3\ud12e() {
        var_0_5F : int
        var_2_65 : double[]
        var_3_6B : double[]
        var_4_73 : int
        var_12_19C : \u12cb\uc246\ub113\u6bb9\u7c6b\u3d64
        var_8_1B9 : \ub102\u5245\u3dd3\ud523\ud171\uc87f
        var_0_12D : int
        var_5_131 : long
        var_7_146 : \u12cb\uc246\ub113\u6bb9\u7c6b\u3d64
        var_8_172 : \ub102\u5245\u3dd3\ud523\ud171\uc87f
        var_9_177 : double
        var_11_180 : int
        var_5_2EF : long
        var_5_2FE : long
        expr_209 : double[] [generated]
        expr_20A : int [generated]
        stack_268_0 : PrintStream [generated]
        stack_254_0 : StringBuilder [generated]
        stack_251_0 : String [generated]
        expr_23E : Object[] [generated]
        stack_2BF_0 : PrintStream [generated]
        stack_2AB_0 : StringBuilder [generated]
        stack_2A8_0 : String [generated]
        expr_295 : Object[] [generated]
        
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
            var_0_5F = and:int(ldc:int(-22638570), ldc:int(-836325876))
            var_2_65 = newarray:double[](double.class, getstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u4492\ubefe\u3e75\u4e72\u3d4b\u62da))
            var_3_6B = newarray:double[](double.class, getstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u4492\ubefe\u3e75\u4e72\u3d4b\u62da))
            var_4_73 = and:int(ldc:int(-536), ldc:int(535))
            
            loop {
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_0283)
                }
                
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(256)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(1905959021))
                }
                else {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(1274490506))
                    
                    if (cmplt:boolean(var_4_73:int, getstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u4492\ubefe\u3e75\u4e72\u3d4b\u62da))) {
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), xor:int(ldc:int(-14262), ldc:int(-14245)))), loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ucfaf\u69d9\u1187\u6198\u6c56\u8308), var_4_73:int)), loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), xor:int(ldc:int(2), ldc:int(16)))), loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ucfaf\u69d9\u1187\u6198\u6c56\u8308), var_4_73:int))))
                        
                        if (logicalnot:boolean(getstatic:boolean(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\uc7fe\u0a06\ua3b4\u7c6b\u8aa5\u4bc8))) {
                            goto(Label_0283)
                        }
                        
                        var_12_19C = initobject:\u12cb\uc246\ub113\u6bb9\u7c6b\u3d64(\u12cb\uc246\ub113\u6bb9\u7c6b\u3d64::<init>, loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ucfaf\u69d9\u1187\u6198\u6c56\u8308), var_4_73:int), loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ucfaf\u69d9\u1187\u6198\u6c56\u8308), var_4_73:int))
                        var_8_1B9 = initobject:\ub102\u5245\u3dd3\ud523\ud171\uc87f(\ub102\u5245\u3dd3\ud523\ud171\uc87f::<init>, mul:long(loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ucfaf\u69d9\u1187\u6198\u6c56\u8308), var_4_73:int), loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ucfaf\u69d9\u1187\u6198\u6c56\u8308), var_4_73:int)), and:int[expected:boolean](ldc:int(3922), ldc:int(-4064)))
                        invokestatic:void(\u7af6\u5654\u56bd\u6198\ub6ab\ub8be::\u5d20\uc229\uae5d\u0a06\u0b8e\u759a, loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ucfaf\u69d9\u1187\u6198\u6c56\u8308), var_4_73:int), loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ucfaf\u69d9\u1187\u6198\u6c56\u8308), var_4_73:int), var_8_1B9:\ub102\u5245\u3dd3\ud523\ud171\uc87f)
                        invokevirtual:void(\u12cb\uc246\ub113\u6bb9\u7c6b\u3d64::\u7006\u183a\u7af6\u88c5\u62da\ub102, var_12_19C:\u12cb\uc246\ub113\u6bb9\u7c6b\u3d64, var_8_1B9:\ub102\u5245\u3dd3\ud523\ud171\uc87f)
                        invokestatic:void(\u7af6\u5654\u56bd\u6198\ub6ab\ub8be::\u5d20\uc229\uae5d\u0a06\u0b8e\u759a, loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ucfaf\u69d9\u1187\u6198\u6c56\u8308), var_4_73:int), loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ucfaf\u69d9\u1187\u6198\u6c56\u8308), var_4_73:int), var_8_1B9:\ub102\u5245\u3dd3\ud523\ud171\uc87f)
                        invokevirtual:void(\u12cb\uc246\ub113\u6bb9\u7c6b\u3d64::\u7006\u183a\u7af6\u88c5\u62da\ub102, var_12_19C:\u12cb\uc246\ub113\u6bb9\u7c6b\u3d64, var_8_1B9:\ub102\u5245\u3dd3\ud523\ud171\uc87f)
                        goto(Label_0283)
                    }
                }
                
                Label_0152:
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(65536)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(65536)), ldc:int(0))) {
                        var_0_5F = and:int(var_0_5F:int, ldc:int(1801223378))
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                Label_0283:
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_0152)
                }
                
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(1024)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_0_12D = and:int(var_0_5F:int, ldc:int(-542801769))
                var_5_131 = invokestatic:long(System::nanoTime)
                var_7_146 = initobject:\u12cb\uc246\ub113\u6bb9\u7c6b\u3d64(\u12cb\uc246\ub113\u6bb9\u7c6b\u3d64::<init>, loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ucfaf\u69d9\u1187\u6198\u6c56\u8308), var_4_73:int), loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ucfaf\u69d9\u1187\u6198\u6c56\u8308), var_4_73:int))
                storeelement:double(var_3_6B:double[], var_4_73:int, div:double(l2d:double(sub:long(invokestatic:long(System::nanoTime), var_5_131:long)), ldc:double(1000000.0)))
                var_8_172 = initobject:\ub102\u5245\u3dd3\ud523\ud171\uc87f(\ub102\u5245\u3dd3\ud523\ud171\uc87f::<init>, mul:long(loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ucfaf\u69d9\u1187\u6198\u6c56\u8308), var_4_73:int), loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ucfaf\u69d9\u1187\u6198\u6c56\u8308), var_4_73:int)), and:int[expected:boolean](ldc:int(-23753), ldc:int(19648)))
                var_9_177 = ldc:double(1.7976931348623157E308)
                var_11_180 = and:int(ldc:int(12500), ldc:int(-13014))
                
                while (cmplt:boolean(var_11_180:int, getstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ua3b4\u3bc9\ud7e8\ud217\u8753\ua3b4))) {
                    invokestatic:void(\u7af6\u5654\u56bd\u6198\ub6ab\ub8be::\u5d20\uc229\uae5d\u0a06\u0b8e\u759a, loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ucfaf\u69d9\u1187\u6198\u6c56\u8308), var_4_73:int), loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ucfaf\u69d9\u1187\u6198\u6c56\u8308), var_4_73:int), var_8_172:\ub102\u5245\u3dd3\ud523\ud171\uc87f)
                    var_5_2EF = invokestatic:long(System::nanoTime)
                    invokevirtual:void(\u12cb\uc246\ub113\u6bb9\u7c6b\u3d64::\u7006\u183a\u7af6\u88c5\u62da\ub102, var_7_146:\u12cb\uc246\ub113\u6bb9\u7c6b\u3d64, var_8_172:\ub102\u5245\u3dd3\ud523\ud171\uc87f)
                    var_5_2FE = sub:long(invokestatic:long(System::nanoTime), var_5_2EF:long)
                    
                    if (cmplt:boolean(l2d:double(var_5_2FE:long), var_9_177:double)) {
                        var_9_177 = l2d:double(var_5_2FE:long)
                    }
                    
                    var_0_12D = and:int(var_0_12D:int, ldc:int(-21539741))
                    inc:int(var_11_180, ldc:int(1))
                }
                
                var_0_5F = and:int(var_0_12D:int, ldc:int(1789158599))
                storeelement:double(var_2_65:double[], var_4_73:int, div:double(var_9_177:double, ldc:double(1000000.0)))
                expr_209 = var_3_6B:double[]
                expr_20A = var_4_73:int
                storeelement:double(expr_209:double[], expr_20A:int, add:double(loadelement:double(expr_209:double[], expr_20A:int), loadelement:double(var_2_65:double[], var_4_73:int)))
                stack_268_0 = getstatic:PrintStream(System::out)
                stack_254_0 = invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), xor:int(ldc:int(9349), ldc:int(9353))))
                stack_251_0 = loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), and:int(ldc:int(3181), ldc:int(157)))
                expr_23E = newarray:Object[](java.lang.Object.class, and:int(ldc:int(20551), ldc:int(2057)))
                storeelement:Object(expr_23E:Object[], and:int(ldc:int(-20049), ldc:int(20032)), invokestatic:Double[expected:Object](Double::valueOf, loadelement:double(var_2_65:double[], var_4_73:int)))
                invokevirtual:void(PrintStream::println, stack_268_0:PrintStream, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, stack_254_0:StringBuilder, invokestatic:String(String::format, stack_251_0:String, expr_23E:Object[])), loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), xor:int(ldc:int(69), ldc:int(75))))))
                stack_2BF_0 = getstatic:PrintStream(System::out)
                stack_2AB_0 = invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), and:int(ldc:int(20623), ldc:int(8783))))
                stack_2A8_0 = loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), xor:int(ldc:int(3233), ldc:int(3244)))
                expr_295 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(1), ldc:int(5133)))
                storeelement:Object(expr_295:Object[], and:int(ldc:int(-16261), ldc:int(7812)), invokestatic:Double[expected:Object](Double::valueOf, loadelement:double(var_3_6B:double[], var_4_73:int)))
                invokevirtual:void(PrintStream::println, stack_2BF_0:PrintStream, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, stack_2AB_0:StringBuilder, invokestatic:String(String::format, stack_2A8_0:String, expr_295:Object[])), loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), and:int(ldc:int(1582), ldc:int(8207))))))
                invokestatic:void(System::gc)
                invokestatic:void(\ud7e8\u5db4\u6b0d\u6c56\u7873\u9255::\u97b7\u52d3\u9af2\u97e6\u836c\uf94d, ldc:long(5000L))
                inc:int(var_4_73, ldc:int(1))
            }
            
            invokestatic:void(\u7af6\u5654\u56bd\u6198\ub6ab\ub8be::\u4c04\u69d9\u983f\uc2e8\u3e75\uc2e8, loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), and:int(ldc:int(827), ldc:int(24663))), getstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u4ab3\uc238\u64f2\u8d90\u7e3f\u6fb0), getstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ua3b4\u3bc9\ud7e8\ud217\u8753\ua3b4), getstatic:boolean(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\uc7fe\u0a06\ua3b4\u7c6b\u8aa5\u4bc8), getstatic:boolean(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u0b8e\u36d3\u6d99\uf94d\uae5d\u8bb0), getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ucfaf\u69d9\u1187\u6198\u6c56\u8308), var_2_65:double[], var_3_6B:double[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \uae5d\ud51e\u5bc4\u72f1\u1833\u47c2() {
        var_0_5F : int
        var_2_65 : double[]
        var_3_6B : double[]
        var_4_73 : int
        var_12_1A4 : \u12cb\uc246\ub113\u6bb9\u7c6b\u3d64
        var_8_1B8 : double[][]
        var_0_13E : int
        var_5_142 : long
        var_7_157 : \u12cb\uc246\ub113\u6bb9\u7c6b\u3d64
        var_8_17A : double[][]
        var_9_17F : double
        var_11_188 : int
        var_5_2F2 : long
        var_5_301 : long
        expr_209 : double[] [generated]
        expr_20A : int [generated]
        stack_268_0 : PrintStream [generated]
        stack_254_0 : StringBuilder [generated]
        stack_251_0 : String [generated]
        expr_23E : Object[] [generated]
        stack_2BF_0 : PrintStream [generated]
        stack_2AB_0 : StringBuilder [generated]
        stack_2A8_0 : String [generated]
        expr_295 : Object[] [generated]
        var_8_2C6 : double[][]
        
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
            var_0_5F = and:int(ldc:int(-1199517773), ldc:int(-1577628742))
            var_2_65 = newarray:double[](double.class, getstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u4492\ubefe\u3e75\u4e72\u3d4b\u62da))
            var_3_6B = newarray:double[](double.class, getstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u4492\ubefe\u3e75\u4e72\u3d4b\u62da))
            var_4_73 = and:int(ldc:int(-32761), ldc:int(12600))
            
            loop {
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_0283)
                }
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(128)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(543043925))
                }
                else {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-1579982854))
                    
                    if (cmplt:boolean(var_4_73:int, getstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u4492\ubefe\u3e75\u4e72\u3d4b\u62da))) {
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), and:int(ldc:int(1333), ldc:int(18646)))), loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ucfaf\u69d9\u1187\u6198\u6c56\u8308), var_4_73:int)), loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), xor:int(ldc:int(281), ldc:int(267)))), loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ucfaf\u69d9\u1187\u6198\u6c56\u8308), var_4_73:int))))
                        
                        if (logicalnot:boolean(getstatic:boolean(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\uc7fe\u0a06\ua3b4\u7c6b\u8aa5\u4bc8))) {
                            goto(Label_0283)
                        }
                        
                        var_12_1A4 = initobject:\u12cb\uc246\ub113\u6bb9\u7c6b\u3d64(\u12cb\uc246\ub113\u6bb9\u7c6b\u3d64::<init>, loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ucfaf\u69d9\u1187\u6198\u6c56\u8308), var_4_73:int), loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ucfaf\u69d9\u1187\u6198\u6c56\u8308), var_4_73:int))
                        var_8_1B8 = multianewarray:double[][](double[][].class, l2i:int(loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ucfaf\u69d9\u1187\u6198\u6c56\u8308), var_4_73:int)), l2i:int(loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ucfaf\u69d9\u1187\u6198\u6c56\u8308), var_4_73:int)))
                        invokestatic:void(\u7af6\u5654\u56bd\u6198\ub6ab\ub8be::\u5d20\uc229\uae5d\u0a06\u0b8e\u759a, loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ucfaf\u69d9\u1187\u6198\u6c56\u8308), var_4_73:int), loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ucfaf\u69d9\u1187\u6198\u6c56\u8308), var_4_73:int), var_8_1B8:double[][])
                        invokevirtual:void(\u12cb\uc246\ub113\u6bb9\u7c6b\u3d64::\u7006\u183a\u7af6\u88c5\u62da\ub102, var_12_1A4:\u12cb\uc246\ub113\u6bb9\u7c6b\u3d64, var_8_1B8:double[][])
                        invokestatic:void(\u7af6\u5654\u56bd\u6198\ub6ab\ub8be::\u5d20\uc229\uae5d\u0a06\u0b8e\u759a, loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ucfaf\u69d9\u1187\u6198\u6c56\u8308), var_4_73:int), loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ucfaf\u69d9\u1187\u6198\u6c56\u8308), var_4_73:int), var_8_1B8:double[][])
                        invokevirtual:void(\u12cb\uc246\ub113\u6bb9\u7c6b\u3d64::\u7006\u183a\u7af6\u88c5\u62da\ub102, var_12_1A4:\u12cb\uc246\ub113\u6bb9\u7c6b\u3d64, var_8_1B8:double[][])
                        goto(Label_0283)
                    }
                }
                
                Label_0152:
                
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(8388608)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_0_5F = and:int(var_0_5F:int, ldc:int(1509352959))
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                Label_0283:
                
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(33554432)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-423724192))
                    goto(Label_0152)
                }
                
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(64)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(495167421))
                }
                else {
                    var_0_13E = and:int(var_0_5F:int, ldc:int(-156371029))
                    var_5_142 = invokestatic:long(System::nanoTime)
                    var_7_157 = initobject:\u12cb\uc246\ub113\u6bb9\u7c6b\u3d64(\u12cb\uc246\ub113\u6bb9\u7c6b\u3d64::<init>, loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ucfaf\u69d9\u1187\u6198\u6c56\u8308), var_4_73:int), loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ucfaf\u69d9\u1187\u6198\u6c56\u8308), var_4_73:int))
                    storeelement:double(var_3_6B:double[], var_4_73:int, div:double(l2d:double(sub:long(invokestatic:long(System::nanoTime), var_5_142:long)), ldc:double(1000000.0)))
                    var_8_17A = multianewarray:double[][](double[][].class, l2i:int(loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ucfaf\u69d9\u1187\u6198\u6c56\u8308), var_4_73:int)), l2i:int(loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ucfaf\u69d9\u1187\u6198\u6c56\u8308), var_4_73:int)))
                    var_9_17F = ldc:double(1.7976931348623157E308)
                    var_11_188 = and:int(ldc:int(-2757), ldc:int(2756))
                    
                    while (cmplt:boolean(var_11_188:int, getstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ua3b4\u3bc9\ud7e8\ud217\u8753\ua3b4))) {
                        invokestatic:void(\u7af6\u5654\u56bd\u6198\ub6ab\ub8be::\u5d20\uc229\uae5d\u0a06\u0b8e\u759a, loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ucfaf\u69d9\u1187\u6198\u6c56\u8308), var_4_73:int), loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ucfaf\u69d9\u1187\u6198\u6c56\u8308), var_4_73:int), var_8_17A:double[][])
                        var_5_2F2 = invokestatic:long(System::nanoTime)
                        invokevirtual:void(\u12cb\uc246\ub113\u6bb9\u7c6b\u3d64::\u7006\u183a\u7af6\u88c5\u62da\ub102, var_7_157:\u12cb\uc246\ub113\u6bb9\u7c6b\u3d64, var_8_17A:double[][])
                        var_5_301 = sub:long(invokestatic:long(System::nanoTime), var_5_2F2:long)
                        
                        if (cmplt:boolean(l2d:double(var_5_301:long), var_9_17F:double)) {
                            var_9_17F = l2d:double(var_5_301:long)
                        }
                        
                        var_0_13E = and:int(var_0_13E:int, ldc:int(-107822109))
                        inc:int(var_11_188, ldc:int(1))
                    }
                    
                    var_0_5F = and:int(var_0_13E:int, ldc:int(-1128897621))
                    storeelement:double(var_2_65:double[], var_4_73:int, div:double(var_9_17F:double, ldc:double(1000000.0)))
                    expr_209 = var_3_6B:double[]
                    expr_20A = var_4_73:int
                    storeelement:double(expr_209:double[], expr_20A:int, add:double(loadelement:double(expr_209:double[], expr_20A:int), loadelement:double(var_2_65:double[], var_4_73:int)))
                    stack_268_0 = getstatic:PrintStream(System::out)
                    stack_254_0 = invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), xor:int(ldc:int(691), ldc:int(703))))
                    stack_251_0 = loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), and:int(ldc:int(4237), ldc:int(13)))
                    expr_23E = newarray:Object[](java.lang.Object.class, and:int(ldc:int(9493), ldc:int(3)))
                    storeelement:Object(expr_23E:Object[], and:int(ldc:int(8395), ldc:int(-9420)), invokestatic:Double[expected:Object](Double::valueOf, loadelement:double(var_2_65:double[], var_4_73:int)))
                    invokevirtual:void(PrintStream::println, stack_268_0:PrintStream, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, stack_254_0:StringBuilder, invokestatic:String(String::format, stack_251_0:String, expr_23E:Object[])), loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), and:int(ldc:int(4190), ldc:int(1039))))))
                    stack_2BF_0 = getstatic:PrintStream(System::out)
                    stack_2AB_0 = invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), xor:int(ldc:int(2057), ldc:int(2054))))
                    stack_2A8_0 = loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), xor:int(ldc:int(145), ldc:int(156)))
                    expr_295 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(8257), ldc:int(3329)))
                    storeelement:Object(expr_295:Object[], and:int(ldc:int(30096), ldc:int(-30609)), invokestatic:Double[expected:Object](Double::valueOf, loadelement:double(var_3_6B:double[], var_4_73:int)))
                    invokevirtual:void(PrintStream::println, stack_2BF_0:PrintStream, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, stack_2AB_0:StringBuilder, invokestatic:String(String::format, stack_2A8_0:String, expr_295:Object[])), loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), and:int(ldc:int(13534), ldc:int(14))))))
                    var_8_2C6 = checkcast:double[][](double[][].class, aconstnull:double[][]())
                    invokestatic:void(System::gc)
                    invokestatic:void(\ud7e8\u5db4\u6b0d\u6c56\u7873\u9255::\u97b7\u52d3\u9af2\u97e6\u836c\uf94d, ldc:long(5000L))
                    inc:int(var_4_73, ldc:int(1))
                }
            }
            
            invokestatic:void(\u7af6\u5654\u56bd\u6198\ub6ab\ub8be::\u4c04\u69d9\u983f\uc2e8\u3e75\uc2e8, loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), and:int(ldc:int(11287), ldc:int(4181))), getstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u4ab3\uc238\u64f2\u8d90\u7e3f\u6fb0), getstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ua3b4\u3bc9\ud7e8\ud217\u8753\ua3b4), getstatic:boolean(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\uc7fe\u0a06\ua3b4\u7c6b\u8aa5\u4bc8), getstatic:boolean(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u0b8e\u36d3\u6d99\uf94d\uae5d\u8bb0), getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ucfaf\u69d9\u1187\u6198\u6c56\u8308), var_2_65:double[], var_3_6B:double[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u5db4\u156b\u4ab3\u69d9\uc229\uff55() {
        var_0_61 : int
        var_2_67 : double[]
        var_3_6D : double[]
        var_4_75 : int
        var_12_1C6 : \u156b\u8bb0\ub102\u6b5f\ucef1\uf9c5
        var_8_1EA : \ub102\u5245\u3dd3\ud523\ud171\uc87f
        var_0_144 : int
        var_5_148 : long
        var_7_163 : \u156b\u8bb0\ub102\u6b5f\ucef1\uf9c5
        var_8_196 : \ub102\u5245\u3dd3\ud523\ud171\uc87f
        var_9_19B : double
        var_11_1A4 : int
        var_5_333 : long
        var_5_342 : long
        expr_247 : double[] [generated]
        expr_248 : int [generated]
        stack_2A6_0 : PrintStream [generated]
        stack_292_0 : StringBuilder [generated]
        stack_28F_0 : String [generated]
        expr_27C : Object[] [generated]
        stack_2FD_0 : PrintStream [generated]
        stack_2E9_0 : StringBuilder [generated]
        stack_2E6_0 : String [generated]
        expr_2D3 : Object[] [generated]
        
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
            var_0_61 = and:int(ldc:int(1984846499), ldc:int(1054776317))
            var_2_67 = newarray:double[](double.class, getstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u4492\ubefe\u3e75\u4e72\u3d4b\u62da))
            var_3_6D = newarray:double[](double.class, getstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u4492\ubefe\u3e75\u4e72\u3d4b\u62da))
            var_4_75 = and:int(ldc:int(1701), ldc:int(-1710))
            
            loop {
                if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_0295)
                }
                
                if (cmpne:boolean(and:int(var_0_61:int, ldc:int(4194304)), ldc:int(0))) {
                    var_0_61 = and:int(var_0_61:int, ldc:int(-1762919429))
                    
                    if (cmplt:boolean(var_4_75:int, getstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u4492\ubefe\u3e75\u4e72\u3d4b\u62da))) {
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), xor:int(ldc:int(4115), ldc:int(4101)))), loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int)), loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), and:int(ldc:int(21051), ldc:int(150)))), loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int)), loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), and:int(ldc:int(30106), ldc:int(2679)))), loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int))))
                        
                        if (logicalnot:boolean(getstatic:boolean(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\uc7fe\u0a06\ua3b4\u7c6b\u8aa5\u4bc8))) {
                            goto(Label_0295)
                        }
                        
                        var_12_1C6 = initobject:\u156b\u8bb0\ub102\u6b5f\ucef1\uf9c5(\u156b\u8bb0\ub102\u6b5f\ucef1\uf9c5::<init>, loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int), loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int), loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int))
                        var_8_1EA = initobject:\ub102\u5245\u3dd3\ud523\ud171\uc87f(\ub102\u5245\u3dd3\ud523\ud171\uc87f::<init>, mul:long(mul:long(loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int), loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int)), loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int)), and:int[expected:boolean](ldc:int(-3036), ldc:int(2266)))
                        invokestatic:void(\u7af6\u5654\u56bd\u6198\ub6ab\ub8be::\u6c52\ufcaf\u516c\u3a62\ucef1\ud12e, loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int), loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int), loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int), var_8_1EA:\ub102\u5245\u3dd3\ud523\ud171\uc87f)
                        invokevirtual:void(\u156b\u8bb0\ub102\u6b5f\ucef1\uf9c5::\uc229\u0a06\u600f\ubf56\u40a9\u624e, var_12_1C6:\u156b\u8bb0\ub102\u6b5f\ucef1\uf9c5, var_8_1EA:\ub102\u5245\u3dd3\ud523\ud171\uc87f)
                        invokestatic:void(\u7af6\u5654\u56bd\u6198\ub6ab\ub8be::\u6c52\ufcaf\u516c\u3a62\ucef1\ud12e, loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int), loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int), loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int), var_8_1EA:\ub102\u5245\u3dd3\ud523\ud171\uc87f)
                        invokevirtual:void(\u156b\u8bb0\ub102\u6b5f\ucef1\uf9c5::\uc229\u0a06\u600f\ubf56\u40a9\u624e, var_12_1C6:\u156b\u8bb0\ub102\u6b5f\ucef1\uf9c5, var_8_1EA:\ub102\u5245\u3dd3\ud523\ud171\uc87f)
                        goto(Label_0295)
                    }
                }
                
                Label_0148:
                
                if (cmpne:boolean(and:int(var_0_61:int, ldc:int(33554432)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(4)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    loopcontinue()
                }
                
                Label_0295:
                
                if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(33554432)), ldc:int(0))) {
                    var_0_61 = and:int(var_0_61:int, ldc:int(1366600498))
                    goto(Label_0148)
                }
                
                if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(32)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_0_144 = and:int(var_0_61:int, ldc:int(-1361388893))
                var_5_148 = invokestatic:long(System::nanoTime)
                var_7_163 = initobject:\u156b\u8bb0\ub102\u6b5f\ucef1\uf9c5(\u156b\u8bb0\ub102\u6b5f\ucef1\uf9c5::<init>, loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int), loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int), loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int))
                storeelement:double(var_3_6D:double[], var_4_75:int, div:double(l2d:double(sub:long(invokestatic:long(System::nanoTime), var_5_148:long)), ldc:double(1000000.0)))
                var_8_196 = initobject:\ub102\u5245\u3dd3\ud523\ud171\uc87f(\ub102\u5245\u3dd3\ud523\ud171\uc87f::<init>, mul:long(mul:long(loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int), loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int)), loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int)), and:int[expected:boolean](ldc:int(24606), ldc:int(-24607)))
                var_9_19B = ldc:double(1.7976931348623157E308)
                var_11_1A4 = and:int(ldc:int(-1536), ldc:int(1371))
                
                while (cmplt:boolean(var_11_1A4:int, getstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ua3b4\u3bc9\ud7e8\ud217\u8753\ua3b4))) {
                    invokestatic:void(\u7af6\u5654\u56bd\u6198\ub6ab\ub8be::\u6c52\ufcaf\u516c\u3a62\ucef1\ud12e, loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int), loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int), loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int), var_8_196:\ub102\u5245\u3dd3\ud523\ud171\uc87f)
                    var_5_333 = invokestatic:long(System::nanoTime)
                    invokevirtual:void(\u156b\u8bb0\ub102\u6b5f\ucef1\uf9c5::\uc229\u0a06\u600f\ubf56\u40a9\u624e, var_7_163:\u156b\u8bb0\ub102\u6b5f\ucef1\uf9c5, var_8_196:\ub102\u5245\u3dd3\ud523\ud171\uc87f)
                    var_5_342 = sub:long(invokestatic:long(System::nanoTime), var_5_333:long)
                    
                    if (cmplt:boolean(l2d:double(var_5_342:long), var_9_19B:double)) {
                        var_9_19B = l2d:double(var_5_342:long)
                    }
                    
                    var_0_144 = and:int(var_0_144:int, ldc:int(-277103365))
                    inc:int(var_11_1A4, ldc:int(1))
                }
                
                var_0_61 = and:int(var_0_144:int, ldc:int(-1745987409))
                storeelement:double(var_2_67:double[], var_4_75:int, div:double(var_9_19B:double, ldc:double(1000000.0)))
                expr_247 = var_3_6D:double[]
                expr_248 = var_4_75:int
                storeelement:double(expr_247:double[], expr_248:int, add:double(loadelement:double(expr_247:double[], expr_248:int), loadelement:double(var_2_67:double[], var_4_75:int)))
                stack_2A6_0 = getstatic:PrintStream(System::out)
                stack_292_0 = invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), and:int(ldc:int(5390), ldc:int(8204))))
                stack_28F_0 = loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), and:int(ldc:int(16397), ldc:int(4173)))
                expr_27C = newarray:Object[](java.lang.Object.class, and:int(ldc:int(1), ldc:int(22675)))
                storeelement:Object(expr_27C:Object[], and:int(ldc:int(4679), ldc:int(-4680)), invokestatic:Double[expected:Object](Double::valueOf, loadelement:double(var_2_67:double[], var_4_75:int)))
                invokevirtual:void(PrintStream::println, stack_2A6_0:PrintStream, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, stack_292_0:StringBuilder, invokestatic:String(String::format, stack_28F_0:String, expr_27C:Object[])), loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), xor:int(ldc:int(-16253), ldc:int(-16243))))))
                stack_2FD_0 = getstatic:PrintStream(System::out)
                stack_2E9_0 = invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), and:int(ldc:int(5519), ldc:int(27151))))
                stack_2E6_0 = loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), and:int(ldc:int(25133), ldc:int(5389)))
                expr_2D3 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(-31741), ldc:int(-31742)))
                storeelement:Object(expr_2D3:Object[], and:int(ldc:int(28808), ldc:int(-29833)), invokestatic:Double[expected:Object](Double::valueOf, loadelement:double(var_3_6D:double[], var_4_75:int)))
                invokevirtual:void(PrintStream::println, stack_2FD_0:PrintStream, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, stack_2E9_0:StringBuilder, invokestatic:String(String::format, stack_2E6_0:String, expr_2D3:Object[])), loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), xor:int(ldc:int(323), ldc:int(333))))))
                invokestatic:void(System::gc)
                invokestatic:void(\ud7e8\u5db4\u6b0d\u6c56\u7873\u9255::\u97b7\u52d3\u9af2\u97e6\u836c\uf94d, ldc:long(5000L))
                inc:int(var_4_75, ldc:int(1))
            }
            
            invokestatic:void(\u7af6\u5654\u56bd\u6198\ub6ab\ub8be::\u4c04\u69d9\u983f\uc2e8\u3e75\uc2e8, loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), and:int(ldc:int(791), ldc:int(1055))), getstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u4ab3\uc238\u64f2\u8d90\u7e3f\u6fb0), getstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ua3b4\u3bc9\ud7e8\ud217\u8753\ua3b4), getstatic:boolean(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\uc7fe\u0a06\ua3b4\u7c6b\u8aa5\u4bc8), getstatic:boolean(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u0b8e\u36d3\u6d99\uf94d\uae5d\u8bb0), getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_2_67:double[], var_3_6D:double[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u4492\u6435\u6d69\u4f52\u4f4a\uc3e3() {
        var_0_84 : int
        var_2_67 : double[]
        var_3_6D : double[]
        var_4_75 : int
        var_12_1D8 : \u156b\u8bb0\ub102\u6b5f\ucef1\uf9c5
        var_8_1F3 : double[][][]
        var_0_15F : int
        var_5_163 : long
        var_7_17E : \u156b\u8bb0\ub102\u6b5f\ucef1\uf9c5
        var_8_1A8 : double[][][]
        var_9_1AD : double
        var_11_1B6 : int
        var_5_33F : long
        var_5_34E : long
        expr_250 : double[] [generated]
        expr_251 : int [generated]
        stack_2AF_0 : PrintStream [generated]
        stack_29B_0 : StringBuilder [generated]
        stack_298_0 : String [generated]
        expr_285 : Object[] [generated]
        stack_306_0 : PrintStream [generated]
        stack_2F2_0 : StringBuilder [generated]
        stack_2EF_0 : String [generated]
        expr_2DC : Object[] [generated]
        var_8_30D : double[][][]
        
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
            var_0_84 = and:int(ldc:int(-1287295259), ldc:int(-1418379281))
            var_2_67 = newarray:double[](double.class, getstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u4492\ubefe\u3e75\u4e72\u3d4b\u62da))
            var_3_6D = newarray:double[](double.class, getstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u4492\ubefe\u3e75\u4e72\u3d4b\u62da))
            var_4_75 = and:int(ldc:int(-15974), ldc:int(15461))
            
            loop {
                if (cmpne:boolean(and:int(var_0_84:int, ldc:int(67108864)), ldc:int(0))) {
                    var_0_84 = and:int(var_0_84:int, ldc:int(-730909063))
                    goto(Label_0322)
                }
                
                if (cmpeq:boolean(and:int(var_0_84:int, ldc:int(524288)), ldc:int(0))) {
                    var_0_84 = and:int(var_0_84:int, ldc:int(-1150325004))
                    
                    if (cmplt:boolean(var_4_75:int, getstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u4492\ubefe\u3e75\u4e72\u3d4b\u62da))) {
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), xor:int(ldc:int(20616), ldc:int(20624)))), loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int)), loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), xor:int(ldc:int(8213), ldc:int(8199)))), loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int)), loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), and:int(ldc:int(1298), ldc:int(8339)))), loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int))))
                        
                        if (logicalnot:boolean(getstatic:boolean(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\uc7fe\u0a06\ua3b4\u7c6b\u8aa5\u4bc8))) {
                            goto(Label_0322)
                        }
                        
                        var_12_1D8 = initobject:\u156b\u8bb0\ub102\u6b5f\ucef1\uf9c5(\u156b\u8bb0\ub102\u6b5f\ucef1\uf9c5::<init>, loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int), loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int), loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int))
                        var_8_1F3 = multianewarray:double[][][](double[][][].class, l2i:int(loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int)), l2i:int(loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int)), l2i:int(loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int)))
                        invokestatic:void(\u7af6\u5654\u56bd\u6198\ub6ab\ub8be::\u6c52\ufcaf\u516c\u3a62\ucef1\ud12e, loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int), loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int), loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int), var_8_1F3:double[][][])
                        invokevirtual:void(\u156b\u8bb0\ub102\u6b5f\ucef1\uf9c5::\uc229\u0a06\u600f\ubf56\u40a9\u624e, var_12_1D8:\u156b\u8bb0\ub102\u6b5f\ucef1\uf9c5, var_8_1F3:double[][][])
                        invokestatic:void(\u7af6\u5654\u56bd\u6198\ub6ab\ub8be::\u6c52\ufcaf\u516c\u3a62\ucef1\ud12e, loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int), loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int), loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int), var_8_1F3:double[][][])
                        invokevirtual:void(\u156b\u8bb0\ub102\u6b5f\ucef1\uf9c5::\uc229\u0a06\u600f\ubf56\u40a9\u624e, var_12_1D8:\u156b\u8bb0\ub102\u6b5f\ucef1\uf9c5, var_8_1F3:double[][][])
                        goto(Label_0322)
                    }
                }
                
                Label_0157:
                
                if (cmpne:boolean(and:int(var_0_84:int, ldc:int(524288)), ldc:int(0))) {
                    var_0_84 = and:int(var_0_84:int, ldc:int(428874424))
                }
                else {
                    if (cmpne:boolean(and:int(var_0_84:int, ldc:int(524288)), ldc:int(0))) {
                        var_0_84 = and:int(var_0_84:int, ldc:int(285187161))
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                Label_0322:
                
                if (cmpne:boolean(and:int(var_0_84:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_0157)
                }
                
                if (cmpeq:boolean(and:int(var_0_84:int, ldc:int(4)), ldc:int(0))) {
                    var_0_84 = and:int(var_0_84:int, ldc:int(1469110965))
                }
                else {
                    var_0_15F = and:int(var_0_84:int, ldc:int(-143212554))
                    var_5_163 = invokestatic:long(System::nanoTime)
                    var_7_17E = initobject:\u156b\u8bb0\ub102\u6b5f\ucef1\uf9c5(\u156b\u8bb0\ub102\u6b5f\ucef1\uf9c5::<init>, loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int), loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int), loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int))
                    storeelement:double(var_3_6D:double[], var_4_75:int, div:double(l2d:double(sub:long(invokestatic:long(System::nanoTime), var_5_163:long)), ldc:double(1000000.0)))
                    var_8_1A8 = multianewarray:double[][][](double[][][].class, l2i:int(loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int)), l2i:int(loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int)), l2i:int(loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int)))
                    var_9_1AD = ldc:double(1.7976931348623157E308)
                    var_11_1B6 = and:int(ldc:int(26528), ldc:int(-26529))
                    
                    while (cmplt:boolean(var_11_1B6:int, getstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ua3b4\u3bc9\ud7e8\ud217\u8753\ua3b4))) {
                        invokestatic:void(\u7af6\u5654\u56bd\u6198\ub6ab\ub8be::\u6c52\ufcaf\u516c\u3a62\ucef1\ud12e, loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int), loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int), loadelement:long(getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_4_75:int), var_8_1A8:double[][][])
                        var_5_33F = invokestatic:long(System::nanoTime)
                        invokevirtual:void(\u156b\u8bb0\ub102\u6b5f\ucef1\uf9c5::\uc229\u0a06\u600f\ubf56\u40a9\u624e, var_7_17E:\u156b\u8bb0\ub102\u6b5f\ucef1\uf9c5, var_8_1A8:double[][][])
                        var_5_34E = sub:long(invokestatic:long(System::nanoTime), var_5_33F:long)
                        
                        if (cmplt:boolean(l2d:double(var_5_34E:long), var_9_1AD:double)) {
                            var_9_1AD = l2d:double(var_5_34E:long)
                        }
                        
                        var_0_15F = and:int(var_0_15F:int, ldc:int(-1075349762))
                        inc:int(var_11_1B6, ldc:int(1))
                    }
                    
                    var_0_84 = and:int(var_0_15F:int, ldc:int(-1211859226))
                    storeelement:double(var_2_67:double[], var_4_75:int, div:double(var_9_1AD:double, ldc:double(1000000.0)))
                    expr_250 = var_3_6D:double[]
                    expr_251 = var_4_75:int
                    storeelement:double(expr_250:double[], expr_251:int, add:double(loadelement:double(expr_250:double[], expr_251:int), loadelement:double(var_2_67:double[], var_4_75:int)))
                    stack_2AF_0 = getstatic:PrintStream(System::out)
                    stack_29B_0 = invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), and:int(ldc:int(7212), ldc:int(8975))))
                    stack_298_0 = loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), xor:int(ldc:int(22540), ldc:int(22529)))
                    expr_285 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(2064), ldc:int(2065)))
                    storeelement:Object(expr_285:Object[], and:int(ldc:int(-31913), ldc:int(11432)), invokestatic:Double[expected:Object](Double::valueOf, loadelement:double(var_2_67:double[], var_4_75:int)))
                    invokevirtual:void(PrintStream::println, stack_2AF_0:PrintStream, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, stack_29B_0:StringBuilder, invokestatic:String(String::format, stack_298_0:String, expr_285:Object[])), loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), xor:int(ldc:int(4131), ldc:int(4141))))))
                    stack_306_0 = getstatic:PrintStream(System::out)
                    stack_2F2_0 = invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), xor:int(ldc:int(6168), ldc:int(6167))))
                    stack_2EF_0 = loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), and:int(ldc:int(63), ldc:int(9229)))
                    expr_2DC = newarray:Object[](java.lang.Object.class, and:int(ldc:int(8705), ldc:int(7425)))
                    storeelement:Object(expr_2DC:Object[], and:int(ldc:int(24858), ldc:int(-30080)), invokestatic:Double[expected:Object](Double::valueOf, loadelement:double(var_3_6D:double[], var_4_75:int)))
                    invokevirtual:void(PrintStream::println, stack_306_0:PrintStream, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, stack_2F2_0:StringBuilder, invokestatic:String(String::format, stack_2EF_0:String, expr_2DC:Object[])), loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), xor:int(ldc:int(2077), ldc:int(2067))))))
                    var_8_30D = checkcast:double[][][](double[][][].class, aconstnull:double[][][]())
                    invokestatic:void(System::gc)
                    invokestatic:void(\ud7e8\u5db4\u6b0d\u6c56\u7873\u9255::\u97b7\u52d3\u9af2\u97e6\u836c\uf94d, ldc:long(5000L))
                    inc:int(var_4_75, ldc:int(1))
                }
            }
            
            invokestatic:void(\u7af6\u5654\u56bd\u6198\ub6ab\ub8be::\u4c04\u69d9\u983f\uc2e8\u3e75\uc2e8, loadelement:String(getstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95), xor:int(ldc:int(16448), ldc:int(16473))), getstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u4ab3\uc238\u64f2\u8d90\u7e3f\u6fb0), getstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ua3b4\u3bc9\ud7e8\ud217\u8753\ua3b4), getstatic:boolean(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\uc7fe\u0a06\ua3b4\u7c6b\u8aa5\u4bc8), getstatic:boolean(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u0b8e\u36d3\u6d99\uf94d\uae5d\u8bb0), getstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae), var_2_67:double[], var_3_6D:double[])
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
            invokestatic:void(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\uf9c5\uafe7\u16f6\u3e75\u416d\u88c5, p0:String[])
            invokestatic:void(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u600f\u7d52\u183a\ub113\ubf56\u7043)
            invokestatic:void(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u7043\u6b5f\ub83f\u97e6\u36d3\ud12e)
            invokestatic:void(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\uae5d\ud51e\u5bc4\u72f1\u1833\u47c2)
            invokestatic:void(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u5db4\u156b\u4ab3\u69d9\uc229\uff55)
            invokestatic:void(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u4492\u6435\u6d69\u4f52\u4f4a\uc3e3)
            invokestatic:void(System::exit, and:int(ldc:int(-10988), ldc:int(10923)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_611 : int
        expr_6E : int [generated]
        stack_92_0 : byte[] [generated]
        stack_94_0 : byte[] [generated]
        stack_CB_0 : byte[] [generated]
        stack_CD_0 : byte[] [generated]
        stack_FC_0 : byte[] [generated]
        stack_FE_0 : byte[] [generated]
        stack_120_0 : byte[] [generated]
        stack_624_0 : byte[] [generated]
        stack_682_0 : byte[] [generated]
        stack_6F4_0 : byte[] [generated]
        stack_74A_0 : byte[] [generated]
        var_4_5FC : int
        var_3_601 : byte[]
        var_5_602 : int
        expr_624 : byte [generated]
        var_0_678 : int
        expr_682 : byte [generated]
        stack_6C2_2 : byte [generated]
        stack_69F_0 : byte [generated]
        expr_94 : int [generated]
        var_2_CB : byte[]
        expr_CF : int [generated]
        var_3_6E2 : byte[]
        var_5_6E3 : int
        expr_FE : int [generated]
        var_3_738 : byte[]
        var_5_739 : int
        var_3_12C : String
        stack_402_0 : String[] [generated]
        expr_13E : String[] [generated]
        expr_42F : long[] [generated]
        expr_4C4 : long[] [generated]
        expr_559 : long[] [generated]
        
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
        var_0_611 = and:int(ldc:int(-990001456), ldc:int(-570972457))
        expr_6E = arraylength:int(stack_92_0 = stack_94_0 = stack_CB_0 = stack_CD_0 = stack_FC_0 = stack_FE_0 = stack_120_0 = stack_624_0 = stack_682_0 = stack_6F4_0 = stack_74A_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("okeaItyhXckTHR/DF1+TIswnnhMu/9eTU2xZ2V1cFhLS0kgHmx4nKUeaItyhXckTHR/DF1+TIswnnhMuzxAfAhARk2NZ2V1cFhLS0kgH0VOjrE1hzEOdfmNsKiARU9FcjlKS0+0ZkN9RQlBRX5ESGd3tDdNZn77fW11x11WYFgLWA+4uwOpZo+jM1orQ/lhbXXHXVZgWApYDH+9QZ+neT4HdTtDtkpUgWaPozNaK0P5YW11x11WYFgKWAx/vUGfp3k+BnU7Q7dKVIFmj6MzWitD+WFtdcddVmBYCVgMf75Bn6d5Pgd1O0O2SlSBZo+jM1orQ/lhbXXHXVZgWAlYDH++QZ+neT4FdTtDtE5UgWaPozNaDV69dnBxRXl1Ynl1QFJDZ3qyZW11B3lSVQ9YDm/hc4RGBkFacHFFeXVieXVAUkNnerJlbXUHeVJVDlhNfbxMXmF/B3U6T+FzhEYGQVpwcUV5dWJ5dUBSQ2d6smVtdQd5UlUOWE19vExeYX8GdTpP4nOERgZBWnBxRXl1Ynl1QFJDZ3qyZW11B3lSVQ1YTX29TF5hfwd1Ok/hc4RGBkFacHFFeXVieXVAUkNnerJlbXUHeVJVDVhNfb1MXmF/BXU6T+NzhkANbVtLSmF+MEQmRol5r3Z6Smk6WDldi3yDcDVDPU+JZN5tA1viUrxknmVAGEE9TLu+i3ALPn5CXVsPcaO+i3AKPn5CXlsPcaO+i3AJPn5CX1sPcKByg3NYT3dodXZAH3spQXpbhHKDc1hPd2h1dkAeeylBe5nFos1g=")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_5FC = expr_6E:int
        var_3_601 = newarray:byte[](byte.class, expr_6E:int)
        var_5_602 = expr_6E:int
        Label_1540:
        
        while (cmpne:boolean(and:int(var_0_611:int, ldc:int(262144)), ldc:int(0))) {
            var_0_611 = and:int(var_0_611:int, ldc:int(1280755393))
            var_5_602 = add:int(var_5_602:int, ldc:int(-1))
            expr_624 = loadelement:byte(stack_624_0:byte[], var_5_602:int)
            storeelement:byte(var_3_601:byte[], var_5_602:int, xor:int(or:int(and:int(shl:int(expr_624:byte, and:int(ldc:int(16398), ldc:int(8260))), ldc:int(-16)), and:int(shr:int(expr_624:byte[expected:int], and:int(ldc:int(4), ldc:int(22702))), ldc:int(15))), ldc:int(33)))
            
            if (cmpne:boolean(var_5_602:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_94_0 = stack_92_0 = stack_CB_0 = stack_CD_0 = stack_FC_0 = stack_FE_0 = stack_120_0 = stack_624_0 = stack_682_0 = stack_6F4_0 = stack_74A_0 = var_3_601:byte[]
            goto(Label_0115)
        }
        
        var_0_611 = and:int(var_0_611:int, ldc:int(-1355386289))
        Label_1644:
        
        while (cmpne:boolean(and:int(var_0_611:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_678 = and:int(var_0_611:int, ldc:int(1717555162))
            var_5_602 = add:int(var_5_602:int, ldc:int(-1))
            expr_682 = stack_6C2_2 = loadelement(stack_682_0, var_5_602)
            
            if (cmplt:boolean(add:int(add:int(var_5_602:int, ldc:int(4)), neg:int(var_4_5FC:int)), ldc:int(0))) {
                stack_6C2_2 = stack_69F_0 = add:byte(expr_682:byte, loadelement:byte(var_3_601:byte[], add:int(var_5_602:int, ldc:int(4))))
                goto(Label_1711)
            }
            
            Label_1679:
            
            if (cmpne:boolean(and:int(var_0_678:int, ldc:int(1048576)), ldc:int(0))) {
                var_0_678 = and:int(var_0_678:int, ldc:int(1565954042))
                stack_6C2_2 = stack_69F_0 = add:byte(expr_682:byte, ldc:byte(4))
            }
            
            Label_1711:
            
            if (cmpeq:boolean(and:int(var_0_678:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_1679)
            }
            
            var_0_611 = and:int(var_0_678:int, ldc:int(-1000556829))
            storeelement:byte(var_3_601:byte[], var_5_602:int, stack_6C2_2:byte)
            
            if (cmpne:boolean(var_5_602:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_94_0 = stack_92_0 = stack_CB_0 = stack_CD_0 = stack_FC_0 = stack_FE_0 = stack_120_0 = stack_624_0 = stack_682_0 = stack_6F4_0 = stack_74A_0 = var_3_601:byte[]
            goto(Label_0153)
        }
        
        goto(Label_1540)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_611:int, ldc:int(8)), ldc:int(0))) {
            goto(Label_0259)
        }
        
        if (cmpne:boolean(and:int(var_0_611:int, ldc:int(8)), ldc:int(0))) {
            goto(Label_0212)
        }
        
        if (cmpeq:boolean(and:int(var_0_611:int, ldc:int(4)), ldc:int(0))) {
            var_0_611 = and:int(var_0_611:int, ldc:int(2121721059))
            expr_94 = arraylength:int(stack_94_0:byte[])
            
            if (cmpne:boolean(expr_94:int, ldc:int(0))) {
                var_4_5FC = expr_94:int
                var_3_601 = newarray:byte[](byte.class, expr_94:int)
                var_5_602 = expr_94:int
                goto(Label_1644)
            }
        }
        
        Label_0153:
        
        if (cmpeq:boolean(and:int(var_0_611:int, ldc:int(262144)), ldc:int(0))) {
            var_0_611 = and:int(var_0_611:int, ldc:int(1113013943))
            goto(Label_0259)
        }
        
        if (cmpeq:boolean(and:int(var_0_611:int, ldc:int(32768)), ldc:int(0))) {
            var_0_611 = and:int(var_0_611:int, ldc:int(554796913))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_611:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_611 = and:int(var_0_611:int, ldc:int(1559609334))
            var_2_CB = stack_CB_0:byte[]
            expr_CF = add:int(arraylength:int(stack_CD_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_CF:int, ldc:int(0))) {
                var_3_6E2 = newarray:byte[](byte.class, expr_CF:int)
                var_5_6E3 = expr_CF:int
                
                loop {
                    var_0_611 = and:int(var_0_611:int, ldc:int(1314760665))
                    var_5_6E3 = add:int(var_5_6E3:int, ldc:int(-1))
                    storeelement:byte(var_3_6E2:byte[], var_5_6E3:int, add:int(shl:int(loadelement:byte(stack_6F4_0:byte[], var_5_6E3:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_CB:byte[], add:int(var_5_6E3:int, and:int(ldc:int(20613), ldc:int(9339)))), ldc:int(2)), xor:int(ldc:int(12310), ldc:int(12329)))))
                    
                    if (cmpne:boolean(var_5_6E3:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_94_0 = stack_92_0 = stack_CB_0 = stack_CD_0 = stack_FC_0 = stack_FE_0 = stack_120_0 = stack_624_0 = stack_682_0 = stack_6F4_0 = stack_74A_0 = var_3_6E2:byte[]
            }
        }
        
        Label_0212:
        
        if (cmpeq:boolean(and:int(var_0_611:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_611 = and:int(var_0_611:int, ldc:int(-1033395467))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_611:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0153)
            }
            
            if (cmpne:boolean(and:int(var_0_611:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_611 = and:int(var_0_611:int, ldc:int(1979559106))
            expr_FE = arraylength:int(stack_FE_0:byte[])
            
            if (cmpne:boolean(expr_FE:int, ldc:int(0))) {
                var_3_738 = newarray:byte[](byte.class, expr_FE:int)
                var_5_739 = expr_FE:int
                
                loop {
                    var_0_611 = and:int(var_0_611:int, ldc:int(2088156387))
                    var_5_739 = add:int(var_5_739:int, ldc:int(-1))
                    storeelement:byte(var_3_738:byte[], var_5_739:int, add:byte(loadelement:byte(stack_74A_0:byte[], var_5_739:int), ldc:byte(118)))
                    
                    if (cmpne:boolean(var_5_739:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_94_0 = stack_92_0 = stack_CB_0 = stack_CD_0 = stack_FC_0 = stack_FE_0 = stack_120_0 = stack_624_0 = stack_682_0 = stack_6F4_0 = stack_74A_0 = var_3_738:byte[]
            }
        }
        
        Label_0259:
        
        if (cmpne:boolean(and:int(var_0_611:int, ldc:int(536870912)), ldc:int(0))) {
            goto(Label_0212)
        }
        
        if (cmpeq:boolean(and:int(var_0_611:int, ldc:int(1048576)), ldc:int(0))) {
            goto(Label_0153)
        }
        
        if (cmpne:boolean(and:int(var_0_611:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_12C = initobject:String(String::<init>, stack_120_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_402_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(6343), ldc:int(6365)))
            expr_13E = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(8286), ldc:int(8260)))
            storeelement:String(expr_13E:String[], and:int(ldc:int(10639), ldc:int(63)), invokevirtual:String[expected:String](String::substring, var_3_12C:String, and:int(ldc:int(27988), ldc:int(-27989)), xor:int(ldc:int(1281), ldc:int(1318))))
            storeelement:String(expr_13E:String[], and:int(ldc:int(12317), ldc:int(18060)), invokevirtual:String[expected:String](String::substring, var_3_12C:String, and:int(ldc:int(39), ldc:int(63)), xor:int(ldc:int(559), ldc:int(638))))
            storeelement:String(expr_13E:String[], xor:int(ldc:int(5130), ldc:int(5124)), invokevirtual:String[expected:String](String::substring, var_3_12C:String, and:int(ldc:int(14449), ldc:int(89)), xor:int(ldc:int(2324), ldc:int(2370))))
            storeelement:String(expr_13E:String[], and:int(ldc:int(2523), ldc:int(8758)), invokevirtual:String[expected:String](String::substring, var_3_12C:String, and:int(ldc:int(3550), ldc:int(4214)), and:int(ldc:int(217), ldc:int(1371))))
            storeelement:String(expr_13E:String[], xor:int(ldc:int(-32628), ldc:int(-32639)), invokevirtual:String[expected:String](String::substring, var_3_12C:String, xor:int(ldc:int(-24523), ldc:int(-24468)), xor:int(ldc:int(-32696), ldc:int(-32747))))
            storeelement:String(expr_13E:String[], and:int(ldc:int(16951), ldc:int(-26552)), invokevirtual:String[expected:String](String::substring, var_3_12C:String, and:int(ldc:int(4447), ldc:int(3293)), and:int(ldc:int(2551), ldc:int(24703))))
            storeelement:String(expr_13E:String[], xor:int(ldc:int(16512), ldc:int(16523)), invokevirtual:String[expected:String](String::substring, var_3_12C:String, and:int(ldc:int(24831), ldc:int(1655)), xor:int(ldc:int(-15720), ldc:int(-15850))))
            storeelement:String(expr_13E:String[], xor:int(ldc:int(33), ldc:int(48)), invokevirtual:String[expected:String](String::substring, var_3_12C:String, and:int(ldc:int(1166), ldc:int(2734)), xor:int(ldc:int(744), ldc:int(600))))
            storeelement:String(expr_13E:String[], and:int(ldc:int(13460), ldc:int(16406)), invokevirtual:String[expected:String](String::substring, var_3_12C:String, and:int(ldc:int(244), ldc:int(4024)), xor:int(ldc:int(-16380), ldc:int(-16170))))
            storeelement:String(expr_13E:String[], xor:int(ldc:int(20521), ldc:int(20543)), invokevirtual:String[expected:String](String::substring, var_3_12C:String, and:int(ldc:int(20722), ldc:int(11730)), xor:int(ldc:int(6354), ldc:int(6182))))
            storeelement:String(expr_13E:String[], and:int(ldc:int(18588), ldc:int(56)), invokevirtual:String[expected:String](String::substring, var_3_12C:String, and:int(ldc:int(1780), ldc:int(2549)), and:int(ldc:int(918), ldc:int(351))))
            storeelement:String(expr_13E:String[], and:int(ldc:int(18072), ldc:int(2098)), invokevirtual:String[expected:String](String::substring, var_3_12C:String, xor:int(ldc:int(6224), ldc:int(6470)), and:int(ldc:int(1335), ldc:int(16822))))
            storeelement:String(expr_13E:String[], and:int(ldc:int(4635), ldc:int(211)), invokevirtual:String[expected:String](String::substring, var_3_12C:String, and:int(ldc:int(439), ldc:int(25406)), xor:int(ldc:int(-16176), ldc:int(-15985))))
            storeelement:String(expr_13E:String[], xor:int(ldc:int(73), ldc:int(92)), invokevirtual:String[expected:String](String::substring, var_3_12C:String, and:int(ldc:int(1887), ldc:int(8575)), xor:int(ldc:int(8343), ldc:int(8479))))
            storeelement:String(expr_13E:String[], xor:int(ldc:int(16462), ldc:int(16473)), invokevirtual:String[expected:String](String::substring, var_3_12C:String, and:int(ldc:int(19352), ldc:int(456)), and:int(ldc:int(8625), ldc:int(2489))))
            storeelement:String(expr_13E:String[], and:int(ldc:int(16921), ldc:int(5433)), invokevirtual:String[expected:String](String::substring, var_3_12C:String, and:int(ldc:int(435), ldc:int(27125)), and:int(ldc:int(19966), ldc:int(8667))))
            storeelement:String(expr_13E:String[], xor:int(ldc:int(6209), ldc:int(6215)), invokevirtual:String[expected:String](String::substring, var_3_12C:String, xor:int(ldc:int(4309), ldc:int(4367)), xor:int(ldc:int(-8060), ldc:int(-7838))))
            storeelement:String(expr_13E:String[], and:int(ldc:int(14597), ldc:int(16469)), invokevirtual:String[expected:String](String::substring, var_3_12C:String, and:int(ldc:int(1510), ldc:int(13286)), and:int(ldc:int(7669), ldc:int(1009))))
            storeelement:String(expr_13E:String[], xor:int(ldc:int(-32598), ldc:int(-32594)), invokevirtual:String[expected:String](String::substring, var_3_12C:String, xor:int(ldc:int(4444), ldc:int(4269)), and:int(ldc:int(4601), ldc:int(9721))))
            storeelement:String(expr_13E:String[], xor:int(ldc:int(4164), ldc:int(4163)), invokevirtual:String[expected:String](String::substring, var_3_12C:String, and:int(ldc:int(2045), ldc:int(23033)), xor:int(ldc:int(6276), ldc:int(6789))))
            storeelement:String(expr_13E:String[], and:int(ldc:int(12321), ldc:int(16669)), invokevirtual:String[expected:String](String::substring, var_3_12C:String, xor:int(ldc:int(184), ldc:int(697)), xor:int(ldc:int(-32310), ldc:int(-31808))))
            storeelement:String(expr_13E:String[], and:int(ldc:int(9352), ldc:int(23304)), invokevirtual:String[expected:String](String::substring, var_3_12C:String, xor:int(ldc:int(1551), ldc:int(1029)), and:int(ldc:int(29206), ldc:int(535))))
            storeelement:String(expr_13E:String[], xor:int(ldc:int(4359), ldc:int(4366)), invokevirtual:String[expected:String](String::substring, var_3_12C:String, xor:int(ldc:int(24976), ldc:int(25478)), xor:int(ldc:int(16443), ldc:int(16921))))
            storeelement:String(expr_13E:String[], and:int(ldc:int(650), ldc:int(12622)), invokevirtual:String[expected:String](String::substring, var_3_12C:String, xor:int(ldc:int(12562), ldc:int(13104)), and:int(ldc:int(19182), ldc:int(9006))))
            storeelement:String(expr_13E:String[], and:int(ldc:int(14), ldc:int(11267)), invokevirtual:String[expected:String](String::substring, var_3_12C:String, xor:int(ldc:int(1652), ldc:int(1114)), xor:int(ldc:int(597), ldc:int(106))))
            storeelement:String(expr_13E:String[], and:int(ldc:int(16387), ldc:int(1159)), invokevirtual:String[expected:String](String::substring, var_3_12C:String, xor:int(ldc:int(4881), ldc:int(4398)), xor:int(ldc:int(10239), ldc:int(9647))))
            putstatic:String[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u8709\ub8be\u3d4b\uc4d2\ud523\u0c95, expr_13E:String[])
            putstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u4ab3\uc238\u64f2\u8d90\u7e3f\u6fb0, ldc:int(8))
            putstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ua3b4\u3bc9\ud7e8\ud217\u8753\ua3b4, xor:int(ldc:int(2216), ldc:int(2144)))
            putstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u4492\ubefe\u3e75\u4e72\u3d4b\u62da, ldc:int(16))
            putstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\uc229\u74b1\u5245\u51b2\u8aa5\u4daf, ldc:int(65636))
            putstatic:int(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u4c2b\u5140\u12cb\u647c\u2dcc\u5d20, ldc:int(65636))
            putstatic:boolean(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\uc7fe\u0a06\ua3b4\u7c6b\u8aa5\u4bc8, xor:int[expected:boolean](ldc:int(-24432), ldc:int(-24431)))
            expr_42F = newarray:long[](long.class, ldc:int(16))
            storeelement:long(expr_42F:long[], and:int(ldc:int(3876), ldc:int(-3877)), ldc:long(262144L))
            storeelement:long(expr_42F:long[], xor:int(ldc:int(-19968), ldc:int(-19967)), ldc:long(524288L))
            storeelement:long(expr_42F:long[], and:int(ldc:int(67), ldc:int(8490)), ldc:long(1048576L))
            storeelement:long(expr_42F:long[], xor:int(ldc:int(515), ldc:int(512)), ldc:long(2097152L))
            storeelement:long(expr_42F:long[], and:int(ldc:int(132), ldc:int(8743)), ldc:long(4194304L))
            storeelement:long(expr_42F:long[], xor:int(ldc:int(4106), ldc:int(4111)), ldc:long(8388608L))
            storeelement:long(expr_42F:long[], ldc:int(6), ldc:long(16777216L))
            storeelement:long(expr_42F:long[], ldc:int(7), ldc:long(33554432L))
            storeelement:long(expr_42F:long[], ldc:int(8), ldc:long(10368L))
            storeelement:long(expr_42F:long[], ldc:int(9), ldc:long(27000L))
            storeelement:long(expr_42F:long[], ldc:int(10), ldc:long(75600L))
            storeelement:long(expr_42F:long[], ldc:int(11), ldc:long(165375L))
            storeelement:long(expr_42F:long[], ldc:int(12), ldc:long(362880L))
            storeelement:long(expr_42F:long[], ldc:int(13), ldc:long(1562500L))
            storeelement:long(expr_42F:long[], ldc:int(14), ldc:long(3211264L))
            storeelement:long(expr_42F:long[], ldc:int(15), ldc:long(6250000L))
            putstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u183a\u64ab\u527a\u4daf\u6c52\u97b7, expr_42F:long[])
            expr_4C4 = newarray:long[](long.class, ldc:int(16))
            storeelement:long(expr_4C4:long[], and:int(ldc:int(4952), ldc:int(-21338)), ldc:long(256L))
            storeelement:long(expr_4C4:long[], and:int(ldc:int(4129), ldc:int(209)), ldc:long(512L))
            storeelement:long(expr_4C4:long[], and:int(ldc:int(21538), ldc:int(2310)), ldc:long(1024L))
            storeelement:long(expr_4C4:long[], xor:int(ldc:int(8704), ldc:int(8707)), ldc:long(2048L))
            storeelement:long(expr_4C4:long[], and:int(ldc:int(25876), ldc:int(4100)), ldc:long(4096L))
            storeelement:long(expr_4C4:long[], xor:int(ldc:int(2573), ldc:int(2568)), ldc:long(8192L))
            storeelement:long(expr_4C4:long[], ldc:int(6), ldc:long(16384L))
            storeelement:long(expr_4C4:long[], ldc:int(7), ldc:long(32768L))
            storeelement:long(expr_4C4:long[], ldc:int(8), ldc:long(260L))
            storeelement:long(expr_4C4:long[], ldc:int(9), ldc:long(520L))
            storeelement:long(expr_4C4:long[], ldc:int(10), ldc:long(1050L))
            storeelement:long(expr_4C4:long[], ldc:int(11), ldc:long(1458L))
            storeelement:long(expr_4C4:long[], ldc:int(12), ldc:long(1960L))
            storeelement:long(expr_4C4:long[], ldc:int(13), ldc:long(2916L))
            storeelement:long(expr_4C4:long[], ldc:int(14), ldc:long(4116L))
            storeelement:long(expr_4C4:long[], ldc:int(15), ldc:long(5832L))
            putstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ucfaf\u69d9\u1187\u6198\u6c56\u8308, expr_4C4:long[])
            expr_559 = newarray:long[](long.class, ldc:int(16))
            storeelement:long(expr_559:long[], and:int(ldc:int(1510), ldc:int(-18415)), ldc:long(16L))
            storeelement:long(expr_559:long[], xor:int(ldc:int(432), ldc:int(433)), ldc:long(32L))
            storeelement:long(expr_559:long[], and:int(ldc:int(6190), ldc:int(9234)), ldc:long(64L))
            storeelement:long(expr_559:long[], xor:int(ldc:int(-16334), ldc:int(-16335)), ldc:long(128L))
            storeelement:long(expr_559:long[], and:int(ldc:int(1028), ldc:int(12997)), ldc:long(256L))
            storeelement:long(expr_559:long[], xor:int(ldc:int(11522), ldc:int(11527)), ldc:long(512L))
            storeelement:long(expr_559:long[], ldc:int(6), ldc:long(1024L))
            storeelement:long(expr_559:long[], ldc:int(7), ldc:long(2048L))
            storeelement:long(expr_559:long[], ldc:int(8), ldc:long(5L))
            storeelement:long(expr_559:long[], ldc:int(9), ldc:long(17L))
            storeelement:long(expr_559:long[], ldc:int(10), ldc:long(30L))
            storeelement:long(expr_559:long[], ldc:int(11), ldc:long(95L))
            storeelement:long(expr_559:long[], ldc:int(12), ldc:long(180L))
            storeelement:long(expr_559:long[], ldc:int(13), ldc:long(270L))
            storeelement:long(expr_559:long[], ldc:int(14), ldc:long(324L))
            storeelement:long(expr_559:long[], ldc:int(15), ldc:long(420L))
            putstatic:long[](\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\ube23\u3711\u839e\u4c04\ub7dc\u8cae, expr_559:long[])
            putstatic:boolean(\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf::\u0b8e\u36d3\u6d99\uf94d\uae5d\u8bb0, and:int[expected:boolean](ldc:int(-4620), ldc:int(4619)))
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u4ab3\uc31c\u6198\u8308\ua61f\u51b2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_66B : int
        var_5_89 : int
        var_6_90 : int
        var_7_9F : double
        var_9_C6 : double
        var_3_D8 : int
        var_11_E9 : int
        var_14_113 : double
        var_16_117 : int
        var_12_10F : double
        var_17_676 : int
        
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
        var_3_66B = and:int(ldc:int(-1100004287), ldc:int(-1620575637))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8df4\u8350\u6d99\u3d64\ua3b4\ucfaf[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0179)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_66B = and:int(var_3_66B:int, ldc:int(-2100491895))
        }
        else {
            var_3_66B = and:int(var_3_66B:int, ldc:int(-564661519))
            var_5_89 = and:int(ldc:int(-20734), ldc:int(20601))
            var_6_90 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9F = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-20495), ldc:int(20494)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C6 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D8 = and:int(var_3_66B:int, ldc:int(-18884781))
                    var_9_C6 = sub:double(var_7_9F:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E9 = var_5_89:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E9:int, sub:int(var_6_90:int, and:int(ldc:int(11329), ldc:int(13)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E9:int, and:int(ldc:int(9), ldc:int(6759)))), var_7_9F:double))) {
                        inc:int(var_11_E9, ldc:int(1))
                    }
                    
                    var_3_66B = and:int(var_3_D8:int, ldc:int(-1091738551))
                    var_14_113 = var_7_9F:double
                    var_16_117 = var_11_E9:int
                }
                else {
                    var_11_E9 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_89:int), and:int(ldc:int(769), ldc:int(13507)))
                    var_12_10F = var_14_113 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89)
                    
                    if (cmplt:boolean(var_16_117 = var_11_E9:int, var_6_90:int)) {
                        var_9_C6 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E9:int)
                        var_16_117 = var_11_E9:int
                        var_14_113 = var_12_10F:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-442610158))
                        goto(Label_1525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1383)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1230)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1129)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-623801133))
                        goto(Label_0957)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1510687062))
                        goto(Label_0828)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0709)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(270508049))
                        goto(Label_0596)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-889833901))
                    }
                    else {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1652688897))
                        
                        if (cmplt:boolean(var_16_117:int, var_6_90:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0596)
                            }
                            
                            goto(Label_0828)
                        }
                    }
                    
                    Label_0413:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1383)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1230)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1586728091))
                        goto(Label_1129)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1774000724))
                        goto(Label_0957)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-899390148))
                        goto(Label_0828)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(189727341))
                        goto(Label_0709)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1093238356))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(32)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(457425051))
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-556410885))
                        var_11_E9 = and:int(ldc:int(-10590), ldc:int(10569))
                        goto(Label_1514)
                    }
                    
                    Label_0596:
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-790505799))
                        goto(Label_1525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-325303442))
                        goto(Label_1383)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1230)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1129)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0957)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0828)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(64)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-962776069))
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1630712723))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_113 = var_9_C6:double
                            goto(Label_0828)
                        }
                    }
                    
                    Label_0709:
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-246186915))
                        goto(Label_1525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-2137754418))
                        goto(Label_1383)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1230)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1129)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0957)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0596)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(1)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-924389907))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-565848357))
                        var_14_113 = mul:double(ldc:double(0.5), add:double(var_9_C6:double, var_14_113:double))
                    }
                    
                    Label_0828:
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(783405204))
                        goto(Label_1383)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1230)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-194413910))
                        goto(Label_1129)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-598352648))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-1581730325))
                            goto(Label_0709)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-1826135131))
                            goto(Label_0596)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1108909471))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89:int), var_7_9F:double)) {
                                var_11_E9 = and:int(ldc:int(4485), ldc:int(1105))
                                goto(Label_1129)
                            }
                        }
                    }
                    
                    Label_0957:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1350256614))
                        goto(Label_1525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1391300190))
                        goto(Label_1383)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(475218751))
                        goto(Label_1230)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1847754658))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-735530190))
                            goto(Label_0828)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0709)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0596)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(1986184471))
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-582530339))
                        var_11_E9 = and:int(ldc:int(-19654), ldc:int(19525))
                    }
                    
                    Label_1129:
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1383)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1088131268))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0957)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0828)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0709)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0596)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-1836944386))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-37261069))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                                goto(Label_1383)
                            }
                        }
                    }
                    
                    Label_1230:
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(43109085))
                        goto(Label_1525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1442129710))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_1129)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0957)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0828)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-1647662336))
                            goto(Label_0709)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-1539492883))
                            goto(Label_0596)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(128)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-1399316689))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(1543665709))
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1115689767))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_113:double, var_5_89:int, var_16_117:int)
                        goto(Label_1514)
                    }
                    
                    Label_1383:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1230)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1611766299))
                        goto(Label_1129)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1405036969))
                        goto(Label_0957)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0828)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1251549189))
                        goto(Label_0709)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0596)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1595272392))
                        loopcontinue()
                    }
                    
                    var_3_66B = and:int(var_3_66B:int, ldc:int(-596810283))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_113:double, ldc:double(0.0))
                    Label_1514:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_676 = var_5_89:int
                        
                        if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1525:
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1413164501))
                        goto(Label_1383)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-920916060))
                        goto(Label_1230)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1813948252))
                        goto(Label_1129)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0957)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0828)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-541691220))
                        goto(Label_0709)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1921764877))
                        goto(Label_0596)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-563096719))
                        var_17_676 = add:int(var_16_117:int, and:int(ldc:int(417), ldc:int(9)))
                        looporswitchbreak()
                    }
                }
                
                var_3_66B = and:int(var_3_66B:int, ldc:int(-50367011))
                
                if (cmple:boolean(var_5_89 = var_17_676:int, sub:int(var_6_90:int, xor:int(ldc:boolean(0), ldc:boolean(1))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0179:
        
        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(128)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
