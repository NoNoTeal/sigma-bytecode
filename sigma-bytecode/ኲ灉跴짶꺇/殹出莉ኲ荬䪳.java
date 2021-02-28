public class \u12b2\u7049\u8df4\uc9f6\uae87.\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3 {
    public void \u6bb9\u51fa\u8389\u12b2\u836c\u4ab3(\u12b2\u4e72\u8df4\u67e9\u67e9.\ua3b4\u965f\u6d99\u4492\ud4fe\u7006 p0, \u5d20\u7043\u88c5\u5db4\uf94d.\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3 p1) {
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
            invokespecial:\u836c\uc229\u8d98\u3d64\u8bb0\ube23(\u836c\uc229\u8d98\u3d64\u8bb0\ube23::<init>, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3, initobject:StringTextComponent[expected:ITextComponent](StringTextComponent::<init>, invokestatic:String(\u6fb0\u99f7\u7330\u624e\u97e6\u760c::\u7e3f\ua562\ubb2b\u61a4\u7330\u4c2b, loadelement:String(getstatic:String[](\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\u3e75\u6fb0\uc87f\ub8be\u6bb9\u3dd3), and:int(ldc:int(-18709), ldc:int(18708))), newarray:Object[](java.lang.Object.class, and:int(ldc:int(25734), ldc:int(-25735))))))
            putfield:\u59ec\u647c\u6c52\u600f\u34df\uc29a(\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\u6d99\u1833\u5245\u7873\u92ee\uc246, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3, initobject:\u59ec\u647c\u6c52\u600f\u34df\uc29a(\u59ec\u647c\u6c52\u600f\u34df\uc29a::<init>, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], initobject:\uc238\u4f52\u93a2\u9a18\u7006\u16f6[expected:\uc2e8\ub32d\u836c\ubff1\uf9c5\uc87f](\uc238\u4f52\u93a2\u9a18\u7006\u16f6::<init>)))
            putfield:String(\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\ufcaf\u8389\u3a62\u0c95\u6bb9\u9937, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3, aconstnull:String())
            putfield:String(\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\u4179\uc29a\u7af6\ud171\ua068\u3dd3, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3, aconstnull:String())
            putfield:boolean(\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\u67d0\u120d\u600f\ubefe\u4cd9\ubded, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3, and:int[expected:boolean](ldc:int(13780), ldc:int(-13813)))
            putfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\u3e75\ub8be\uc246\u6b5f\u527a\ud7e8, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3, p0:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006)
            putfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\u927d\uc31c\u4daf\ua6bd\u6d99\u1187, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3, p1:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6bb9\u51fa\u8389\u12b2\u836c\u4ab3(\u12b2\u4e72\u8df4\u67e9\u67e9.\ua3b4\u965f\u6d99\u4492\ud4fe\u7006 p0, \u5d20\u7043\u88c5\u5db4\uf94d.\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3 p1, java.lang.String p2) {
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
            invokespecial:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3(\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::<init>, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3, p0:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006, p1:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3)
            
            if (cmpne:boolean(putfield:String(\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\ufcaf\u8389\u3a62\u0c95\u6bb9\u9937, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3, p2:String), aconstnull:String())) {
                putfield:String(\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\u4179\uc29a\u7af6\ud171\ua068\u3dd3, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3, invokestatic:String(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u52d3\u392e\u92ff\u647c\u6cfe\u873d, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\u3e75\u6fb0\uc87f\ub8be\u6bb9\u3dd3), xor:int(ldc:int(-29664), ldc:int(-29663)))), p2:String)), p2:String))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u72f1\u5f50\u51fa\ubcb0\u0b8e\uafe7() {
        var_1_5F : int
        var_3_62 : int
        var_5_6E : int
        var_6_72 : int
        var_7_76 : int
        var_8_7A : int
        var_9_8A : int
        var_10_93 : \u120d\u7c6b\u1187\u52d3\u3e75\u446c[]
        var_11_152 : int
        var_12_167 : int
        var_13_18F : \u120d\u7c6b\u1187\u52d3\u3e75\u446c
        var_14_1B4 : int
        var_15_1BB : int
        var_16_1CE : int
        var_17_1F4 : int
        var_18_1FE : int
        var_19_205 : int
        var_20_20E : String
        var_21_232 : \u98a4\u64f2\u7043\u76bc\u34df\uceb8
        
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
            var_1_5F = and:int(ldc:int(752033281), ldc:int(-78151809))
            var_3_62 = ldc:int(100)
            var_5_6E = ldc:int(30)
            var_6_72 = ldc:int(20)
            var_7_76 = ldc:int(120)
            var_8_7A = ldc:int(20)
            var_9_8A = invokestatic:int(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u51b2\u8389\u52d3\u0c95\u965f\u4cd9, getfield:String(\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\ufcaf\u8389\u3a62\u0c95\u6bb9\u9937, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3), and:int(ldc:int(20490), ldc:int(9250)))
            var_10_93 = invokestatic:\u120d\u7c6b\u1187\u52d3\u3e75\u446c[](\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u3bd6\u446c\uc238\uc87f\u40a9\u527a, getfield:String(\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\ufcaf\u8389\u3a62\u0c95\u6bb9\u9937, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3))
            
            if (cmpne:boolean(var_10_93:\u120d\u7c6b\u1187\u52d3\u3e75\u446c[], aconstnull:\u120d\u7c6b\u1187\u52d3\u3e75\u446c[]())) {
                var_11_152 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u3e75\u4bc8\u416d\u92ff\u7c6b\ub6ab, div:double(i2d:double(arraylength:int(var_10_93:\u120d\u7c6b\u1187\u52d3\u3e75\u446c[])), ldc:double(9.0)))
                
                if (cmplt:boolean(var_9_8A:int, var_11_152:int)) {
                    var_9_8A = var_11_152:int
                }
                
                var_1_5F = and:int(var_1_5F:int, ldc:int(511434339))
                var_12_167 = and:int(ldc:int(-17003), ldc:int(17002))
                
                while (cmplt:boolean(var_12_167:int, arraylength:int(var_10_93:\u120d\u7c6b\u1187\u52d3\u3e75\u446c[]))) {
                    var_13_18F = loadelement:\u120d\u7c6b\u1187\u52d3\u3e75\u446c(var_10_93:\u120d\u7c6b\u1187\u52d3\u3e75\u446c[], var_12_167:int)
                    
                    if (cmpne:boolean(var_13_18F:\u120d\u7c6b\u1187\u52d3\u3e75\u446c, aconstnull:\u120d\u7c6b\u1187\u52d3\u3e75\u446c())) {
                        if (invokevirtual:boolean(\u120d\u7c6b\u1187\u52d3\u3e75\u446c::\u12cb\u56bd\u67e9\u2dcc\ubefe\uc238, var_13_18F:\u120d\u7c6b\u1187\u52d3\u3e75\u446c)) {
                            var_14_1B4 = rem:int(var_12_167:int, var_9_8A:int)
                            var_15_1BB = div:int(var_12_167:int, var_9_8A:int)
                            var_16_1CE = invokestatic:int(Math::min, div:int(getfield:int(\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3), var_9_8A:int), xor:int(ldc:int(8200), ldc:int(8384)))
                            var_17_1F4 = add:int(add:int(mul:int(var_14_1B4:int, var_16_1CE:int), xor:int(ldc:int(266), ldc:int(271))), div:int(sub:int(getfield:int(\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3), mul:int(var_16_1CE:int, var_9_8A:int)), and:int(ldc:int(758), ldc:int(2))))
                            var_18_1FE = add:int(var_5_6E:int, mul:int(var_15_1BB:int, var_6_72:int))
                            var_19_205 = sub:int(var_16_1CE:int, ldc:int(10))
                            var_20_20E = invokestatic:String(\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\u4975\uc31c\u6c56\uf94d\u6d99\ub1b9, var_13_18F:\u120d\u7c6b\u1187\u52d3\u3e75\u446c, var_19_205:int)
                            
                            if (logicalnot:boolean(invokestatic:boolean(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u3c25\u836c\ua6bd\uc4d2\u4975\u0b8e, invokevirtual:String(\u120d\u7c6b\u1187\u52d3\u3e75\u446c::\uc2e8\u5654\u4daf\u4ab3\u7ce1\u385b, var_13_18F:\u120d\u7c6b\u1187\u52d3\u3e75\u446c)))) {
                                var_21_232 = initobject:\u98a4\u64f2\u7043\u76bc\u34df\uceb8(\u98a4\u64f2\u7043\u76bc\u34df\uceb8::<init>, add:int(var_3_62:int, var_12_167:int), var_17_1F4:int, var_18_1FE:int, var_19_205:int, var_8_7A:int, var_13_18F:\u120d\u7c6b\u1187\u52d3\u3e75\u446c, var_20_20E:String)
                            }
                            else {
                                var_21_232 = initobject:\ua562\u40a9\ua6bd\ua562\u34df\uf995[expected:\u98a4\u64f2\u7043\u76bc\u34df\uceb8](\ua562\u40a9\ua6bd\ua562\u34df\uf995::<init>, add:int(var_3_62:int, var_12_167:int), var_17_1F4:int, var_18_1FE:int, var_19_205:int, var_8_7A:int, var_13_18F:\u120d\u7c6b\u1187\u52d3\u3e75\u446c, var_20_20E:String)
                            }
                            
                            putfield:boolean(\u98a4\u64f2\u7043\u76bc\u34df\uceb8::\uf995\ub102\u9255\ucfaf\ucfaf\u7330, var_21_232:\u98a4\u64f2\u7043\u76bc\u34df\uceb8, invokevirtual:boolean(\u120d\u7c6b\u1187\u52d3\u3e75\u446c::\u99f7\u8709\ua562\uc2bd\u6435\ubefe, var_13_18F:\u120d\u7c6b\u1187\u52d3\u3e75\u446c))
                            invokevirtual:\u98a4\u64f2\u7043\u76bc\u34df\uceb8(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u92ff\uafe7\u3e2a\u98a4\u8c8a\u16f6, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], var_21_232:\u98a4\u64f2\u7043\u76bc\u34df\uceb8)
                        }
                    }
                    
                    inc:int(var_12_167, ldc:int(1))
                }
            }
            
            invokevirtual:\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u92ff\uafe7\u3e2a\u98a4\u8c8a\u16f6, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], initobject:\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56(\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56::<init>, xor:int(ldc:int(-31665), ldc:int(-31610)), sub:int(sub:int(div:int(getfield:int(\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3), xor:int(ldc:int(7169), ldc:int(7171))), var_7_76:int), ldc:int(20)), add:int(add:int(div:int(getfield:int(\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\u6d69\ud12e\u4bc8\ubded\u120d\u0800, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3), ldc:int(6)), and:int(ldc:int(10217), ldc:int(16556))), ldc:int(11)), var_7_76:int, var_8_7A:int, invokestatic:String(\u6fb0\u99f7\u7330\u624e\u97e6\u760c::\u7e3f\ua562\ubb2b\u61a4\u7330\u4c2b, loadelement:String(getstatic:String[](\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\u3e75\u6fb0\uc87f\ub8be\u6bb9\u3dd3), xor:int(ldc:int(4101), ldc:int(4103))), newarray:Object[](java.lang.Object.class, and:int(ldc:int(-20965), ldc:int(20964))))))
            invokevirtual:\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u92ff\uafe7\u3e2a\u98a4\u8c8a\u16f6, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], initobject:\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56(\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56::<init>, and:int(ldc:int(5324), ldc:int(456)), add:int(div:int(getfield:int(\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3), xor:int(ldc:int(129), ldc:int(131))), ldc:int(20)), add:int(add:int(div:int(getfield:int(\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\u6d69\ud12e\u4bc8\ubded\u120d\u0800, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3), ldc:int(6)), xor:int(ldc:int(-32171), ldc:int(-32003))), ldc:int(11)), var_7_76:int, var_8_7A:int, invokestatic:String(\u6fb0\u99f7\u7330\u624e\u97e6\u760c::\u7e3f\ua562\ubb2b\u61a4\u7330\u4c2b, loadelement:String(getstatic:String[](\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\u3e75\u6fb0\uc87f\ub8be\u6bb9\u3dd3), and:int(ldc:int(24699), ldc:int(4867))), newarray:Object[](java.lang.Object.class, and:int(ldc:int(28424), ldc:int(-28521))))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static java.lang.String \u4975\uc31c\u6c56\uf94d\u6d99\ub1b9(\u3504\ufe34\u600f\u6b0d\u69d9.\u120d\u7c6b\u1187\u52d3\u3e75\u446c p0, int p1) {
        var_4_64 : String
        var_5_78 : \ucef1\u99f7\u4e72\u7873\u0800\u72f1
        var_5_B2 : \u392e\u3c25\u527a\u0800\u5bc4\u494c
        
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
        var_4_64 = invokevirtual:String(\u120d\u7c6b\u1187\u52d3\u3e75\u446c::\ubcb0\u9af2\u446c\u71f1\u52d3\u5140, p0:\u120d\u7c6b\u1187\u52d3\u3e75\u446c)
        
        if (logicalnot:boolean(instanceof:boolean(\u5d20\u97b7\u8753\u873d\u16f6.\u392e\u3c25\u527a\u0800\u5bc4\u494c.class, p0:\u120d\u7c6b\u1187\u52d3\u3e75\u446c))) {
            var_5_78 = getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u92ff\u4179\u3d64\ud217\ucb79, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\ube23\ufcaf\u6198\u8413\u97e6\uc87f))
            
            while (logicaland:boolean(cmpge:boolean(add:int(invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u6435\u516c\u873d\u88c5\u3d4b\u1187, var_5_78:\ucef1\u99f7\u4e72\u7873\u0800\u72f1, var_4_64:String), add:int(invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u6435\u516c\u873d\u88c5\u3d4b\u1187, var_5_78:\ucef1\u99f7\u4e72\u7873\u0800\u72f1, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\u3e75\u6fb0\uc87f\ub8be\u6bb9\u3dd3), xor:int(ldc:int(-30624), ldc:int(-30619)))), invokestatic:String(\u6b0d\u392e\u0c95\u4f4a\u8389\uc9f6::\u99f7\ub19c\ucfaf\u6b0d\u4f52\ud171)))), and:int(ldc:int(4109), ldc:int(9717)))), p1:int), cmpgt:boolean(invokevirtual:int(String::length, var_4_64:String), ldc:int(0)))) {
                var_4_64 = invokevirtual:String(String::substring, var_4_64:String, and:int(ldc:int(-57), ldc:int(56)), sub:int(invokevirtual:int(String::length, var_4_64:String), xor:int(ldc:int(-32640), ldc:int(-32639))))
            }
            
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), var_4_64:String), loadelement:String(getstatic:String[](\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\u3e75\u6fb0\uc87f\ub8be\u6bb9\u3dd3), and:int(ldc:int(9805), ldc:int(405)))), ternaryop:String(invokevirtual:boolean(\u120d\u7c6b\u1187\u52d3\u3e75\u446c::\ubb2b\u67e9\u6c56\u6ec6\ube23\uc7fe, p0:\u120d\u7c6b\u1187\u52d3\u3e75\u446c), invokevirtual:String(\u120d\u7c6b\u1187\u52d3\u3e75\u446c::\u4d85\ud4fe\ub113\u4e72\u8709\uc910, p0:\u120d\u7c6b\u1187\u52d3\u3e75\u446c, invokevirtual:String(\u120d\u7c6b\u1187\u52d3\u3e75\u446c::\ua6bd\u7c6b\u946b\u7c6b\u9255\u6b5f, p0:\u120d\u7c6b\u1187\u52d3\u3e75\u446c)), loadelement:String(getstatic:String[](\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\u3e75\u6fb0\uc87f\ub8be\u6bb9\u3dd3), and:int(ldc:int(25102), ldc:int(1286))))), invokevirtual:String(\u120d\u7c6b\u1187\u52d3\u3e75\u446c::\u99f7\u071d\u416d\uc910\u3a62\u6b5f, p0:\u120d\u7c6b\u1187\u52d3\u3e75\u446c, invokevirtual:String(\u120d\u7c6b\u1187\u52d3\u3e75\u446c::\ua6bd\u7c6b\u946b\u7c6b\u9255\u6b5f, p0:\u120d\u7c6b\u1187\u52d3\u3e75\u446c)))))
        }
        
        var_5_B2 = checkcast:\u392e\u3c25\u527a\u0800\u5bc4\u494c(\u5d20\u97b7\u8753\u873d\u16f6.\u392e\u3c25\u527a\u0800\u5bc4\u494c.class, p0:\u120d\u7c6b\u1187\u52d3\u3e75\u446c[expected:\u392e\u3c25\u527a\u0800\u5bc4\u494c])
        return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), var_4_64:String), loadelement:String(getstatic:String[](\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\u3e75\u6fb0\uc87f\ub8be\u6bb9\u3dd3), xor:int(ldc:int(24618), ldc:int(24622))))))
    }
    
    public void \u5d20\u16f6\uc9f6\ucef1\u8308\u4f4a(\u6435\ub8be\u718f\u6b0d\u67e9.\u5654\u3e75\u92ff\u97e6\u8c8a\uf995 p0) {
        var_2_1DD : int
        var_4_78 : \u4cd9\u4daf\u4cd9\ud158\u446c\ubf56
        var_5_F6 : \u98a4\u64f2\u7043\u76bc\u34df\uceb8
        var_6_FD : \u120d\u7c6b\u1187\u52d3\u3e75\u446c
        var_5_1C5 : \u120d\u7c6b\u1187\u52d3\u3e75\u446c[]
        var_6_1CE : int
        
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
            var_2_1DD = and:int(ldc:int(1357793415), ldc:int(359279095))
            
            if (instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56.class, p0:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995)) {
                var_4_78 = checkcast:\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56.class, p0:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995[expected:\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56])
                
                if (getfield:boolean(\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56::\uf995\ub102\u9255\ucfaf\ucfaf\u7330, var_4_78:\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56)) {
                    if (cmplt:boolean(getfield:int(\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56::\u4f4a\u8df4\uafe7\ud12e\u4f52\u3d4b, var_4_78:\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56), xor:int(ldc:int(1083), ldc:int(1267)))) {
                        if (instanceof:boolean(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u98a4\u64f2\u7043\u76bc\u34df\uceb8.class, var_4_78:\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56)) {
                            var_5_F6 = checkcast:\u98a4\u64f2\u7043\u76bc\u34df\uceb8(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u98a4\u64f2\u7043\u76bc\u34df\uceb8.class, var_4_78:\u98a4\u64f2\u7043\u76bc\u34df\uceb8)
                            var_6_FD = invokevirtual:\u120d\u7c6b\u1187\u52d3\u3e75\u446c(\u98a4\u64f2\u7043\u76bc\u34df\uceb8::\u3bc9\ub6ab\uc910\u873d\u34df\u9255, var_5_F6:\u98a4\u64f2\u7043\u76bc\u34df\uceb8)
                            
                            if (instanceof:boolean(\u5d20\u97b7\u8753\u873d\u16f6.\u392e\u3c25\u527a\u0800\u5bc4\u494c.class, var_6_FD:\u120d\u7c6b\u1187\u52d3\u3e75\u446c)) {
                                invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3), initobject:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3(\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::<init>, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\u927d\uc31c\u4daf\ua6bd\u6d99\u1187, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3), invokevirtual:String(\u120d\u7c6b\u1187\u52d3\u3e75\u446c::\uc2e8\u5654\u4daf\u4ab3\u7ce1\u385b, var_6_FD:\u120d\u7c6b\u1187\u52d3\u3e75\u446c)))
                                return:void()
                            }
                            
                            loop {
                                if (cmpeq:boolean(and:int(var_2_1DD:int, ldc:int(2048)), ldc:int(0))) {
                                    goto(Label_0330)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_1DD:int, ldc:int(1048576)), ldc:int(0))) {
                                    var_2_1DD = and:int(var_2_1DD:int, ldc:int(811835308))
                                    
                                    if (invokestatic:boolean(\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\u40a9\u8350\ud12e\u8258\u0a06\ub7dc)) {
                                        invokevirtual:void(\u120d\u7c6b\u1187\u52d3\u3e75\u446c::\u8258\uc229\u64ab\ucfaf\u5db4\u6c56, var_6_FD:\u120d\u7c6b\u1187\u52d3\u3e75\u446c)
                                        goto(Label_0330)
                                    }
                                }
                                
                                Label_0291:
                                
                                if (cmpne:boolean(and:int(var_2_1DD:int, ldc:int(4)), ldc:int(0))) {
                                    if (cmpne:boolean(and:int(var_2_1DD:int, ldc:int(1048576)), ldc:int(0))) {
                                        var_2_1DD = and:int(var_2_1DD:int, ldc:int(2143605750))
                                        loopcontinue()
                                    }
                                    
                                    var_2_1DD = and:int(var_2_1DD:int, ldc:int(2034933692))
                                    
                                    if (invokevirtual:boolean(\u98a4\u64f2\u7043\u76bc\u34df\uceb8::\u71f1\u392e\u5245\u494c\u88c5\u97b7, var_5_F6:\u98a4\u64f2\u7043\u76bc\u34df\uceb8)) {
                                        invokevirtual:void(\u120d\u7c6b\u1187\u52d3\u3e75\u446c::\u64ab\u4492\u759a\u3e2a\u0a06\u7c6b, var_6_FD:\u120d\u7c6b\u1187\u52d3\u3e75\u446c)
                                    }
                                }
                                
                                Label_0330:
                                
                                if (cmpeq:boolean(and:int(var_2_1DD:int, ldc:int(4)), ldc:int(0))) {
                                    var_2_1DD = and:int(var_2_1DD:int, ldc:int(-1484815640))
                                    goto(Label_0291)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_1DD:int, ldc:int(1048576)), ldc:int(0))) {
                                    looporswitchbreak()
                                }
                            }
                            
                            var_2_1DD = and:int(var_2_1DD:int, ldc:int(-1972216665))
                            invokespecial:void(\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\u4492\u61a4\u6c52\u4c04\u3e75\u7ce1, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3)
                            putfield:boolean(\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\u67d0\u120d\u600f\ubefe\u4cd9\ubded, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3, xor:int[expected:boolean](ldc:int(650), ldc:int(651)))
                        }
                    }
                    
                    loop {
                        if (cmpne:boolean(and:int(var_2_1DD:int, ldc:int(134217728)), ldc:int(0))) {
                            var_2_1DD = and:int(var_2_1DD:int, ldc:int(607730648))
                        }
                        else {
                            var_2_1DD = and:int(var_2_1DD:int, ldc:int(122900468))
                            
                            if (cmpeq:boolean(getfield:int(\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56::\u4f4a\u8df4\uafe7\ud12e\u4f52\u3d4b, var_4_78:\u98a4\u64f2\u7043\u76bc\u34df\uceb8[expected:\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56]), xor:int(ldc:int(-32478), ldc:int(-32277)))) {
                                var_5_1C5 = invokestatic:\u120d\u7c6b\u1187\u52d3\u3e75\u446c[](\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u3711\u8709\ub18d\u4975\u7c6b\ub19c, invokestatic:\u120d\u7c6b\u1187\u52d3\u3e75\u446c[](\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u3bd6\u446c\uc238\uc87f\u40a9\u527a))
                                var_6_1CE = and:int(ldc:int(-2036), ldc:int(1011))
                                
                                loop {
                                    if (cmpne:boolean(and:int(var_2_1DD:int, ldc:int(1048576)), ldc:int(0))) {
                                        var_2_1DD = and:int(var_2_1DD:int, ldc:int(-2064965055))
                                    }
                                    else {
                                        var_2_1DD = and:int(var_2_1DD:int, ldc:int(-2064938337))
                                        
                                        if (cmplt:boolean(var_6_1CE:int, arraylength:int(var_5_1C5:\u120d\u7c6b\u1187\u52d3\u3e75\u446c[]))) {
                                            invokevirtual:void(\u120d\u7c6b\u1187\u52d3\u3e75\u446c::\u8258\uc229\u64ab\ucfaf\u5db4\u6c56, loadelement:\u120d\u7c6b\u1187\u52d3\u3e75\u446c(var_5_1C5:\u120d\u7c6b\u1187\u52d3\u3e75\u446c[], var_6_1CE:int))
                                            putfield:boolean(\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\u67d0\u120d\u600f\ubefe\u4cd9\ubded, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3, and:int[expected:boolean](ldc:int(129), ldc:int(16675)))
                                            inc:int(var_6_1CE, ldc:int(1))
                                            loopcontinue()
                                        }
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_2_1DD:int, ldc:int(2147483647)), ldc:int(0))) {
                                        looporswitchbreak()
                                    }
                                }
                                
                                var_2_1DD = and:int(var_2_1DD:int, ldc:int(635591869))
                                invokespecial:void(\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\u4492\u61a4\u6c52\u4c04\u3e75\u7ce1, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3)
                            }
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_1DD:int, ldc:int(4096)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    var_2_1DD = and:int(var_2_1DD:int, ldc:int(928177141))
                    
                    if (cmpeq:boolean(getfield:int(\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56::\u4f4a\u8df4\uafe7\ud12e\u4f52\u3d4b, var_4_78:\u98a4\u64f2\u7043\u76bc\u34df\uceb8[expected:\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56]), and:int(ldc:int(4302), ldc:int(201)))) {
                        if (getfield:boolean(\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\u67d0\u120d\u600f\ubefe\u4cd9\ubded, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3)) {
                            invokestatic:void(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\ub8be\u5d20\u6fb0\u839e\ua562\u946b)
                            putfield:boolean(\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\u67d0\u120d\u600f\ubefe\u4cd9\ubded, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3, and:int[expected:boolean](ldc:int(26625), ldc:int(-26626)))
                            invokestatic:void(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u9033\u8308\ufe34\u93a2\uff55\u9a18)
                        }
                        
                        var_2_1DD = and:int(var_2_1DD:int, ldc:int(-765809465))
                        invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3), getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\u3e75\ub8be\uc246\u6b5f\u527a\ud7e8, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3))
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u760c\ud51e\u3e2a\uc910\uc7fe\u71ae() {
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
            
            if (getfield:boolean(\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\u67d0\u120d\u600f\ubefe\u4cd9\ubded, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3)) {
                invokestatic:void(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\ub8be\u5d20\u6fb0\u839e\ua562\u946b)
                putfield:boolean(\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\u67d0\u120d\u600f\ubefe\u4cd9\ubded, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3, and:int[expected:boolean](ldc:int(13484), ldc:int(-13501)))
                invokestatic:void(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u9033\u8308\ufe34\u93a2\uff55\u9a18)
            }
            
            invokespecial:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u760c\ud51e\u3e2a\uc910\uc7fe\u71ae, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u36d3\uc238\ud12e\u836c\ube23\ua562(\u6435\ub8be\u718f\u6b0d\u67e9.\u5654\u3e75\u92ff\u97e6\u8c8a\uf995 p0) {
        var_2_8C : int
        var_4_78 : \u98a4\u64f2\u7043\u76bc\u34df\uceb8
        var_5_7F : \u120d\u7c6b\u1187\u52d3\u3e75\u446c
        
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
            var_2_8C = and:int(ldc:int(2068724387), ldc:int(2072165347))
            
            if (instanceof:boolean(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u98a4\u64f2\u7043\u76bc\u34df\uceb8.class, p0:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995)) {
                var_4_78 = checkcast:\u98a4\u64f2\u7043\u76bc\u34df\uceb8(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u98a4\u64f2\u7043\u76bc\u34df\uceb8.class, p0:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995[expected:\u98a4\u64f2\u7043\u76bc\u34df\uceb8])
                var_5_7F = invokevirtual:\u120d\u7c6b\u1187\u52d3\u3e75\u446c(\u98a4\u64f2\u7043\u76bc\u34df\uceb8::\u3bc9\ub6ab\uc910\u873d\u34df\u9255, var_4_78:\u98a4\u64f2\u7043\u76bc\u34df\uceb8)
                
                if (logicalnot:boolean(invokestatic:boolean(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u40a9\u8350\ud12e\u8258\u0a06\ub7dc))) {
                    var_2_8C = and:int(var_2_8C:int, ldc:int(-98828301))
                    
                    if (invokevirtual:boolean(\u98a4\u64f2\u7043\u76bc\u34df\uceb8::\u71f1\u392e\u5245\u494c\u88c5\u97b7, var_4_78:\u98a4\u64f2\u7043\u76bc\u34df\uceb8)) {
                        invokevirtual:void(\u120d\u7c6b\u1187\u52d3\u3e75\u446c::\u9af2\u5f50\u3711\u8413\u72f1\u2dcc, var_5_7F:\u120d\u7c6b\u1187\u52d3\u3e75\u446c)
                    }
                }
                else {
                    invokevirtual:void(\u120d\u7c6b\u1187\u52d3\u3e75\u446c::\u8258\uc229\u64ab\ucfaf\u5db4\u6c56, var_5_7F:\u120d\u7c6b\u1187\u52d3\u3e75\u446c)
                }
                
                var_2_8C = and:int(var_2_8C:int, ldc:int(-91505693))
                invokespecial:void(\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\u4492\u61a4\u6c52\u4c04\u3e75\u7ce1, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3)
                putfield:boolean(\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\u67d0\u120d\u600f\ubefe\u4cd9\ubded, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3, and:int[expected:boolean](ldc:int(2213), ldc:int(513)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u4492\u61a4\u6c52\u4c04\u3e75\u7ce1() {
        var_1_61 : int
        var_3_6B : Iterator<\u5654\u3e75\u92ff\u97e6\u8c8a\uf995>
        var_1_E3 : int
        var_4_B1 : \u5654\u3e75\u92ff\u97e6\u8c8a\uf995
        var_5_CD : \u98a4\u64f2\u7043\u76bc\u34df\uceb8
        var_6_D4 : \u120d\u7c6b\u1187\u52d3\u3e75\u446c
        
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
            var_1_61 = and:int(ldc:int(-1186909383), ldc:int(-40386722))
            var_3_6B = invokeinterface:Iterator<\u5654\u3e75\u92ff\u97e6\u8c8a\uf995>(List<\u5654\u3e75\u92ff\u97e6\u8c8a\uf995>::iterator, getfield:List<\u5654\u3e75\u92ff\u97e6\u8c8a\uf995>(\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\u1187\u647c\u40a9\ub1b9\u4d85\u7049, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3))
            
            loop {
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(8192)), ldc:int(0))) {
                    var_1_E3 = and:int(var_1_61:int, ldc:int(-790092748))
                }
                else {
                    var_1_E3 = and:int(var_1_61:int, ldc:int(928088031))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_3_6B:Iterator<\u5654\u3e75\u92ff\u97e6\u8c8a\uf995>)) {
                        var_4_B1 = checkcast:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995(\u6435\ub8be\u718f\u6b0d\u67e9.\u5654\u3e75\u92ff\u97e6\u8c8a\uf995.class, invokeinterface:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995(Iterator<\u5654\u3e75\u92ff\u97e6\u8c8a\uf995>::next, var_3_6B:Iterator<\u5654\u3e75\u92ff\u97e6\u8c8a\uf995>))
                        
                        if (instanceof:boolean(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u98a4\u64f2\u7043\u76bc\u34df\uceb8.class, var_4_B1:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995)) {
                            var_5_CD = checkcast:\u98a4\u64f2\u7043\u76bc\u34df\uceb8(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u98a4\u64f2\u7043\u76bc\u34df\uceb8.class, var_4_B1:\u98a4\u64f2\u7043\u76bc\u34df\uceb8)
                            var_6_D4 = invokevirtual:\u120d\u7c6b\u1187\u52d3\u3e75\u446c(\u98a4\u64f2\u7043\u76bc\u34df\uceb8::\u3bc9\ub6ab\uc910\u873d\u34df\u9255, var_5_CD:\u98a4\u64f2\u7043\u76bc\u34df\uceb8)
                            
                            if (instanceof:boolean(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u7e3f\u64ab\uc2e8\u3776\ud36e\u4c2b.class, var_6_D4:\u120d\u7c6b\u1187\u52d3\u3e75\u446c)) {
                                invokevirtual:void(\u7e3f\u64ab\uc2e8\u3776\ud36e\u4c2b::\uf995\u8753\ubcb0\u5140\u4179\u873d, checkcast:\u7e3f\u64ab\uc2e8\u3776\ud36e\u4c2b(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u7e3f\u64ab\uc2e8\u3776\ud36e\u4c2b.class, var_6_D4:\u7e3f\u64ab\uc2e8\u3776\ud36e\u4c2b[expected:\u120d\u7c6b\u1187\u52d3\u3e75\u446c]))
                            }
                            
                            var_1_E3 = and:int(var_1_E3:int, ldc:int(935979838))
                            invokevirtual:void(\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56::\u8350\u51b2\u3c25\u71ae\ube23\u6fb0, var_5_CD:\u98a4\u64f2\u7043\u76bc\u34df\uceb8[expected:\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56], invokestatic:String(\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\u4975\uc31c\u6c56\uf94d\u6d99\ub1b9, var_6_D4:\u7e3f\u64ab\uc2e8\u3776\ud36e\u4c2b[expected:\u120d\u7c6b\u1187\u52d3\u3e75\u446c], invokevirtual:int(\u5654\u3e75\u92ff\u97e6\u8c8a\uf995::\u494c\u3711\u3776\u67e9\u74b1\u836c, var_5_CD:\u98a4\u64f2\u7043\u76bc\u34df\uceb8[expected:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995])))
                            invokevirtual:void(\u98a4\u64f2\u7043\u76bc\u34df\uceb8::\ucfaf\ubf56\u71f1\u8df4\u183a\u51fa, var_5_CD:\u98a4\u64f2\u7043\u76bc\u34df\uceb8)
                        }
                        
                        var_1_61 = and:int(var_1_E3:int, ldc:int(602269080))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_1_E3:int, ldc:int(8192)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_1_61 = and:int(var_1_E3:int, ldc:int(514611563))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, int p1, int p2, float p3) {
        var_5_63 : int
        
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
            var_5_63 = and:int(ldc:int(-1236763646), ldc:int(-681521222))
            invokevirtual:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u0a06\u12cb\u97b7\u4492\u1833\ubded, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
            
            if (cmpeq:boolean(getfield:String(\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\u4179\uc29a\u7af6\ud171\ua068\u3dd3, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3), aconstnull:String())) {
                var_5_63 = and:int(var_5_63:int, ldc:int(-1762767534))
                invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ub19c\u3dd3\u7043\u76bc\uc910\uc4d2, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\u9255\u6d69\u960f\uc87f\ud171\u6c56, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3), getfield:ITextComponent(\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\ud36e\uafe7\ubf56\uc229\u51b2\u8413, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3), div:int(getfield:int(\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3), and:int(ldc:int(16418), ldc:int(4190))), ldc:int(15), ldc:int(16777215))
            }
            else {
                invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ub19c\u3dd3\u7043\u76bc\uc910\uc4d2, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\u9255\u6d69\u960f\uc87f\ud171\u6c56, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3), getfield:String(\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\u4179\uc29a\u7af6\ud171\ua068\u3dd3, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3), div:int(getfield:int(\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3), and:int(ldc:int(9426), ldc:int(4618))), ldc:int(15), ldc:int(16777215))
            }
            
            invokespecial:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:float)
            invokevirtual:void(\u59ec\u647c\u6c52\u600f\u34df\uc29a::\ua068\uc7fe\u839e\u5140\uafe7\u8aa5, getfield:\u59ec\u647c\u6c52\u600f\u34df\uc29a(\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\u6d99\u1833\u5245\u7873\u92ee\uc246, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, getfield:List<\u5654\u3e75\u92ff\u97e6\u8c8a\uf995>(\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\u1187\u647c\u40a9\ub1b9\u4d85\u7049, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_2D5 : int
        expr_68 : byte[] [generated]
        var_2_6C : byte[]
        stack_A7_0 : byte[] [generated]
        stack_A9_0 : byte[] [generated]
        stack_CE_0 : byte[] [generated]
        stack_D0_0 : byte[] [generated]
        stack_110_0 : byte[] [generated]
        stack_112_0 : byte[] [generated]
        stack_13F_0 : byte[] [generated]
        stack_299_0 : byte[] [generated]
        stack_2E8_0 : byte[] [generated]
        stack_366_0 : byte[] [generated]
        expr_70 : int [generated]
        var_3_229 : byte[]
        var_4_22A : int
        expr_A9 : int [generated]
        var_5_27A : int
        var_3_27F : byte[]
        var_4_280 : int
        var_0_302 : int
        expr_2E8 : byte [generated]
        stack_331_2 : byte [generated]
        stack_305_0 : byte [generated]
        expr_D0 : int [generated]
        expr_112 : int [generated]
        var_3_354 : byte[]
        var_4_355 : int
        expr_369 : byte [generated]
        var_3_14B : String
        stack_220_0 : String[] [generated]
        expr_15D : String[] [generated]
        
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
            var_0_2D5 = and:int(ldc:int(-81406410), ldc:int(-1724849))
            expr_68 = var_2_6C = stack_A7_0 = stack_A9_0 = stack_CE_0 = stack_D0_0 = stack_110_0 = stack_112_0 = stack_13F_0 = stack_299_0 = stack_2E8_0 = stack_366_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("BsyurCQRscjJS+eySc2uzs7PyuBKxE2rTUnqzrEzqcjBTGwyyMUuwzDYMbVGOMFLQs0yRrMxRTHOw0vmVlXSMA=="))
            expr_70 = add:int(arraylength:int(expr_68:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_70:int, ldc:int(0))) {
                var_3_229 = newarray:byte[](byte.class, expr_70:int)
                var_4_22A = expr_70:int
                
                loop {
                    var_0_2D5 = and:int(var_0_2D5:int, ldc:int(-566387082))
                    var_4_22A = add:int(var_4_22A:int, ldc:int(-1))
                    storeelement:byte(var_3_229:byte[], var_4_22A:int, add:int(shl:int(loadelement:byte(expr_68:byte[], var_4_22A:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_6C:byte[], add:int(var_4_22A:int, and:int(ldc:int(7185), ldc:int(16397)))), ldc:int(3)), xor:int(ldc:int(2646), ldc:int(2633)))))
                    
                    if (cmpne:boolean(var_4_22A:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A9_0 = stack_A7_0 = stack_CE_0 = stack_D0_0 = stack_110_0 = stack_112_0 = stack_13F_0 = stack_299_0 = stack_2E8_0 = stack_366_0 = var_3_229:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_2D5:int, ldc:int(512)), ldc:int(0))) {
                    var_0_2D5 = and:int(var_0_2D5:int, ldc:int(-317168003))
                    goto(Label_0279)
                }
                
                if (cmpeq:boolean(and:int(var_0_2D5:int, ldc:int(268435456)), ldc:int(0))) {
                    var_0_2D5 = and:int(var_0_2D5:int, ldc:int(1022800390))
                    goto(Label_0213)
                }
                
                if (cmpne:boolean(and:int(var_0_2D5:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0174)
                }
                
                var_0_2D5 = and:int(var_0_2D5:int, ldc:int(1592770413))
                expr_A9 = arraylength:int(stack_A9_0:byte[])
                
                if (cmpeq:boolean(expr_A9:int, ldc:int(0))) {
                    goto(Label_0174)
                }
                
                var_5_27A = expr_A9:int
                var_3_27F = newarray:byte[](byte.class, expr_A9:int)
                var_4_280 = expr_A9:int
                Label_0642:
                
                while (cmpne:boolean(and:int(var_0_2D5:int, ldc:int(2097152)), ldc:int(0))) {
                    var_0_2D5 = and:int(var_0_2D5:int, ldc:int(-13262947))
                    var_4_280 = add:int(var_4_280:int, ldc:int(-1))
                    storeelement:byte(var_3_27F:byte[], var_4_280:int, xor:byte(loadelement:byte(stack_299_0:byte[], var_4_280:int), ldc:byte(57)))
                    
                    if (cmpne:boolean(var_4_280:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A9_0 = stack_A7_0 = stack_CE_0 = stack_D0_0 = stack_110_0 = stack_112_0 = stack_13F_0 = stack_299_0 = stack_2E8_0 = stack_366_0 = var_3_27F:byte[]
                    goto(Label_0174)
                }
                
                Label_0712:
                
                while (cmpne:boolean(and:int(var_0_2D5:int, ldc:int(65536)), ldc:int(0))) {
                    var_0_302 = and:int(var_0_2D5:int, ldc:int(1585305199))
                    var_4_280 = add:int(var_4_280:int, ldc:int(-1))
                    expr_2E8 = stack_331_2 = loadelement(stack_2E8_0, var_4_280)
                    
                    if (cmplt:boolean(add:int(add:int(var_4_280:int, ldc:int(4)), neg:int(var_5_27A:int)), ldc:int(0))) {
                        stack_331_2 = stack_305_0 = add:byte(expr_2E8:byte, loadelement:byte(var_3_27F:byte[], add:int(var_4_280:int, ldc:int(4))))
                        goto(Label_0789)
                    }
                    
                    Label_0757:
                    
                    if (cmpne:boolean(and:int(var_0_302:int, ldc:int(33554432)), ldc:int(0))) {
                        var_0_302 = and:int(var_0_302:int, ldc:int(-563227025))
                        stack_331_2 = stack_305_0 = add:byte(expr_2E8:byte, ldc:byte(4))
                    }
                    
                    Label_0789:
                    
                    if (cmpeq:boolean(and:int(var_0_302:int, ldc:int(32768)), ldc:int(0))) {
                        var_0_302 = and:int(var_0_302:int, ldc:int(-1825220118))
                        goto(Label_0757)
                    }
                    
                    var_0_2D5 = and:int(var_0_302:int, ldc:int(-622334250))
                    storeelement:byte(var_3_27F:byte[], var_4_280:int, stack_331_2:byte)
                    
                    if (cmpne:boolean(var_4_280:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A9_0 = stack_A7_0 = stack_CE_0 = stack_D0_0 = stack_110_0 = stack_112_0 = stack_13F_0 = stack_299_0 = stack_2E8_0 = stack_366_0 = var_3_27F:byte[]
                    goto(Label_0213)
                }
                
                var_0_2D5 = and:int(var_0_2D5:int, ldc:int(657049561))
                goto(Label_0642)
                Label_0174:
                
                if (cmpeq:boolean(and:int(var_0_2D5:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_0279)
                }
                
                if (cmpeq:boolean(and:int(var_0_2D5:int, ldc:int(64)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_0_2D5:int, ldc:int(1048576)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_2D5 = and:int(var_0_2D5:int, ldc:int(2117439319))
                    expr_D0 = arraylength:int(stack_D0_0:byte[])
                    
                    if (cmpne:boolean(expr_D0:int, ldc:int(0))) {
                        var_5_27A = expr_D0:int
                        var_3_27F = newarray:byte[](byte.class, expr_D0:int)
                        var_4_280 = expr_D0:int
                        goto(Label_0712)
                    }
                }
                
                Label_0213:
                
                if (cmpeq:boolean(and:int(var_0_2D5:int, ldc:int(1024)), ldc:int(0))) {
                    var_0_2D5 = and:int(var_0_2D5:int, ldc:int(-2100004483))
                }
                else {
                    if (cmpne:boolean(and:int(var_0_2D5:int, ldc:int(1048576)), ldc:int(0))) {
                        var_0_2D5 = and:int(var_0_2D5:int, ldc:int(-1868813790))
                        goto(Label_0174)
                    }
                    
                    if (cmpeq:boolean(and:int(var_0_2D5:int, ldc:int(262144)), ldc:int(0))) {
                        var_0_2D5 = and:int(var_0_2D5:int, ldc:int(483344583))
                        loopcontinue()
                    }
                    
                    var_0_2D5 = and:int(var_0_2D5:int, ldc:int(-625107044))
                    expr_112 = arraylength:int(stack_112_0:byte[])
                    
                    if (cmpne:boolean(expr_112:int, ldc:int(0))) {
                        var_3_354 = newarray:byte[](byte.class, expr_112:int)
                        var_4_355 = expr_112:int
                        
                        loop {
                            var_0_2D5 = and:int(var_0_2D5:int, ldc:int(1583853260))
                            var_4_355 = add:int(var_4_355:int, ldc:int(-1))
                            expr_369 = add:byte(loadelement:byte(stack_366_0:byte[], var_4_355:int), ldc:byte(95))
                            storeelement:byte(var_3_354:byte[], var_4_355:int, or:int(and:int(shl:int(expr_369:byte, and:int(ldc:int(8262), ldc:int(2061))), ldc:int(-16)), and:int(shr:int(expr_369:byte[expected:int], and:int(ldc:int(260), ldc:int(8718))), ldc:int(15))))
                            
                            if (cmpne:boolean(var_4_355:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_A9_0 = stack_A7_0 = stack_CE_0 = stack_D0_0 = stack_110_0 = stack_112_0 = stack_13F_0 = stack_299_0 = stack_2E8_0 = stack_366_0 = var_3_354:byte[]
                    }
                }
                
                Label_0279:
                
                if (cmpne:boolean(and:int(var_0_2D5:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0213)
                }
                
                if (cmpeq:boolean(and:int(var_0_2D5:int, ldc:int(4)), ldc:int(0))) {
                    var_0_2D5 = and:int(var_0_2D5:int, ldc:int(-721802473))
                    goto(Label_0174)
                }
                
                if (cmpne:boolean(and:int(var_0_2D5:int, ldc:int(268435456)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_14B = initobject:String(String::<init>, stack_13F_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_220_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(14687), ldc:int(135)))
            expr_15D = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(31015), ldc:int(1175)))
            storeelement:String(expr_15D:String[], and:int(ldc:int(20006), ldc:int(12302)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(-26728), ldc:int(26727)), and:int(ldc:int(-4320), ldc:int(4319))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(18124), ldc:int(4)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(20684), ldc:int(-22765)), and:int(ldc:int(1611), ldc:int(20739))))
            storeelement:String(expr_15D:String[], xor:int(ldc:int(5139), ldc:int(5142)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(-30719), ldc:int(-30718)), xor:int(ldc:int(1027), ldc:int(1030))))
            storeelement:String(expr_15D:String[], xor:int(ldc:int(3337), ldc:int(3339)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(5805), ldc:int(2055)), and:int(ldc:int(4147), ldc:int(851))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(1059), ldc:int(26707)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(7), ldc:int(20)), xor:int(ldc:int(8375), ldc:int(8364))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(-31097), ldc:int(27000)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(2075), ldc:int(20635)), xor:int(ldc:int(4112), ldc:int(4136))))
            storeelement:String(expr_15D:String[], xor:int(ldc:int(-32671), ldc:int(-32672)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(4733), ldc:int(312)), and:int(ldc:int(16511), ldc:int(6719))))
            putstatic:String[](\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3::\u3e75\u6fb0\uc87f\ub8be\u6bb9\u3dd3, expr_15D:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7330\u0c95\u3504\ubcb0\u4d85\ubff1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_67B : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_686 : int
        
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
        var_3_67B = and:int(ldc:int(-1107575197), ldc:int(-1242310765))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6bb9\u51fa\u8389\u12b2\u836c\u4ab3[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
            var_3_67B = and:int(var_3_67B:int, ldc:int(1280693629))
        }
        else {
            var_3_67B = and:int(var_3_67B:int, ldc:int(1710481091))
            var_5_8A = and:int(ldc:int(-23674), ldc:int(22585))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(5538), ldc:int(-7603)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_67B:int, ldc:int(2144589363))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, and:int(ldc:int(1557), ldc:int(8449)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, xor:int(ldc:int(12384), ldc:int(12385)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_67B = and:int(var_3_E3:int, ldc:int(1976827790))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(1029), ldc:int(1)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1934250881))
                        goto(Label_1537)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-2108886959))
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1110)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1566754041))
                        goto(Label_0968)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(563301432))
                    }
                    else {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1039644170))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0586)
                            }
                            
                            goto(Label_0825)
                        }
                    }
                    
                    Label_0420:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1537)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(483221752))
                        goto(Label_1110)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1537592206))
                        goto(Label_0968)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1689486654))
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1433757554))
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(2010889930))
                            var_11_F4 = and:int(ldc:int(-25372), ldc:int(25369))
                            goto(Label_1526)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0586:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1537)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-2109327767))
                        goto(Label_1110)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(333613925))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-680706033))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1146446422))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(2113918591))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0825)
                        }
                    }
                    
                    Label_0711:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1110)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(770889178))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1131910415))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1378101485))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0825:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1957687519))
                        goto(Label_1537)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1455047602))
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1110)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(2072497220))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(767697004))
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1485449822))
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1700762929))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1039392475))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = xor:int(ldc:int(-16384), ldc:int(-16383))
                                goto(Label_1110)
                            }
                        }
                    }
                    
                    Label_0968:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1994641553))
                        goto(Label_1537)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0825)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-987852690))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-405285361))
                        var_11_F4 = and:int(ldc:int(12707), ldc:int(-14780))
                    }
                    
                    Label_1110:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1196307406))
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(305053119))
                            goto(Label_0968)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0825)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-826345717))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1342449946))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1389)
                            }
                        }
                    }
                    
                    Label_1226:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-32358730))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_1110)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-290998149))
                            goto(Label_0968)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1472257845))
                            goto(Label_0825)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1608453314))
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(220499384))
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1989377736))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1223398253))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1978906410))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                        goto(Label_1526)
                    }
                    
                    Label_1389:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1578589114))
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1110)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1100330902))
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(100302938))
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(895165129))
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_67B = and:int(var_3_67B:int, ldc:int(1577049927))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1526:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_686 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1537:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-469190225))
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-807476385))
                        goto(Label_1110)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1891968701))
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(371175518))
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(98025206))
                        var_17_686 = add:int(var_16_122:int, xor:int(ldc:int(99), ldc:int(98)))
                        looporswitchbreak()
                    }
                    
                    var_3_67B = and:int(var_3_67B:int, ldc:int(-800748737))
                }
                
                var_3_67B = and:int(var_3_67B:int, ldc:int(-1107831217))
                
                if (cmple:boolean(var_5_8A = var_17_686:int, sub:int(var_6_91:int, and:int(ldc:int(17425), ldc:int(943))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
            var_3_67B = and:int(var_3_67B:int, ldc:int(-596643747))
            goto(Label_0108)
        }
    }
}
