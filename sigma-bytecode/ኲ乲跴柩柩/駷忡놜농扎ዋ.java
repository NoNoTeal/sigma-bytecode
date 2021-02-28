public class \u12b2\u4e72\u8df4\u67e9\u67e9.\u99f7\u5fe1\ub19c\ub18d\u624e\u12cb {
    public void \u99f7\u5fe1\ub19c\ub18d\u624e\u12cb(java.lang.ClassLoader p0) {
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
            invokespecial:\u99f7\u5fe1\ub19c\ub18d\u624e\u12cb(\u99f7\u5fe1\ub19c\ub18d\u624e\u12cb::<init>, this:\u99f7\u5fe1\ub19c\ub18d\u624e\u12cb, ldc:Class<Object>(java.lang.Object.class), p0:ClassLoader)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u99f7\u5fe1\ub19c\ub18d\u624e\u12cb(java.lang.Class<?> p0, java.lang.ClassLoader p1) {
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
        invokespecial:\u4d85\ubf56\u34df\ubefe\ub19c\u0b8e(\u4d85\ubf56\u34df\ubefe\ub19c\u0b8e::<init>, this:\u99f7\u5fe1\ub19c\ub18d\u624e\u12cb, p0:Class<?>)
        putfield:ClassLoader(\u99f7\u5fe1\ub19c\ub18d\u624e\u12cb::\ua3b4\ub6ab\u7873\u7043\u7873\u6fb0, this:\u99f7\u5fe1\ub19c\ub18d\u624e\u12cb, invokevirtual:ClassLoader(Class<T>::getClassLoader, ldc:Class<\u99f7\u5fe1\ub19c\ub18d\u624e\u12cb>(\u12b2\u4e72\u8df4\u67e9\u67e9.\u99f7\u5fe1\ub19c\ub18d\u624e\u12cb.class)))
        
        if (cmpne:boolean(p1:ClassLoader, aconstnull:ClassLoader())) {
            putfield:ClassLoader(\u99f7\u5fe1\ub19c\ub18d\u624e\u12cb::\ua3b4\ub6ab\u7873\u7043\u7873\u6fb0, this:\u99f7\u5fe1\ub19c\ub18d\u624e\u12cb, p1:ClassLoader)
            return:void()
        }
        
        athrow(initobject:NullPointerException(NullPointerException::<init>, loadelement:String(getstatic:String[](\u99f7\u5fe1\ub19c\ub18d\u624e\u12cb::\u5245\u3d4b\u8aa5\u59ec\u8258\u5db4), and:int(ldc:int(12712), ldc:int(-12713)))))
    }
    
    public java.lang.Class<?> \ub171\ua562\u3e75\u4ab3\ub102\ube23(java.lang.String p0) {
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
            return:Class<?>(invokestatic:Class<?>(Class<T>::forName, p0:String, xor:int[expected:boolean](ldc:int(2049), ldc:int(2048)), getfield:ClassLoader(\u99f7\u5fe1\ub19c\ub18d\u624e\u12cb::\ua3b4\ub6ab\u7873\u7043\u7873\u6fb0, this:\u99f7\u5fe1\ub19c\ub18d\u624e\u12cb)))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_22B : int
        expr_6B : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_C3_0 : byte[] [generated]
        stack_F4_0 : byte[] [generated]
        stack_F6_0 : byte[] [generated]
        stack_126_0 : byte[] [generated]
        stack_189_0 : byte[] [generated]
        stack_1D9_0 : byte[] [generated]
        stack_23D_0 : byte[] [generated]
        stack_2B5_0 : byte[] [generated]
        var_4_16C : int
        var_3_171 : byte[]
        var_5_172 : int
        expr_189 : byte [generated]
        var_0_255 : int
        expr_23D : byte [generated]
        stack_281_2 : byte [generated]
        stack_258_0 : byte [generated]
        var_2_94 : byte[]
        expr_98 : int [generated]
        var_3_1C8 : byte[]
        var_5_1C9 : int
        expr_C3 : int [generated]
        expr_F6 : int [generated]
        var_3_2A4 : byte[]
        var_5_2A5 : int
        var_3_132 : String
        stack_165_0 : String[] [generated]
        expr_144 : String[] [generated]
        
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
        var_0_22B = and:int(ldc:int(1721597735), ldc:int(1654471541))
        expr_6B = arraylength:int(stack_94_0 = stack_96_0 = stack_C1_0 = stack_C3_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_189_0 = stack_1D9_0 = stack_23D_0 = stack_2B5_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("APHMAYNOc/W9T/q7wY9yhEABsrsLEMV6ww==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_16C = expr_6B:int
        var_3_171 = newarray:byte[](byte.class, expr_6B:int)
        var_5_172 = expr_6B:int
        Label_0372:
        
        while (cmpeq:boolean(and:int(var_0_22B:int, ldc:int(128)), ldc:int(0))) {
            var_0_22B = and:int(var_0_22B:int, ldc:int(-119772322))
            var_5_172 = add:int(var_5_172:int, ldc:int(-1))
            expr_189 = loadelement:byte(stack_189_0:byte[], var_5_172:int)
            storeelement:byte(var_3_171:byte[], var_5_172:int, or:int(and:int(shl:int(expr_189:byte, and:int(ldc:int(4), ldc:int(4349))), ldc:int(-16)), and:int(shr:int(expr_189:byte[expected:int], and:int(ldc:int(2180), ldc:int(17421))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_172:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C1_0 = stack_C3_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_189_0 = stack_1D9_0 = stack_23D_0 = stack_2B5_0 = var_3_171:byte[]
            goto(Label_0112)
        }
        
        Label_0544:
        
        while (cmpne:boolean(and:int(var_0_22B:int, ldc:int(2048)), ldc:int(0))) {
            var_0_255 = and:int(var_0_22B:int, ldc:int(-209752135))
            var_5_172 = add:int(var_5_172:int, ldc:int(-1))
            expr_23D = stack_281_2 = loadelement(stack_23D_0, var_5_172)
            
            if (cmplt:boolean(add:int(add:int(var_5_172:int, ldc:int(2)), neg:int(var_4_16C:int)), ldc:int(0))) {
                stack_281_2 = stack_258_0 = add:byte(expr_23D:byte, loadelement:byte(var_3_171:byte[], add:int(var_5_172:int, ldc:int(2))))
                goto(Label_0616)
            }
            
            Label_0586:
            
            if (cmpne:boolean(and:int(var_0_255:int, ldc:int(2048)), ldc:int(0))) {
                var_0_255 = and:int(var_0_255:int, ldc:int(2065607588))
                stack_281_2 = stack_258_0 = add:byte(expr_23D:byte, ldc:byte(2))
            }
            
            Label_0616:
            
            if (cmpeq:boolean(and:int(var_0_255:int, ldc:int(512)), ldc:int(0))) {
                var_0_255 = and:int(var_0_255:int, ldc:int(-2092390050))
                goto(Label_0586)
            }
            
            var_0_22B = and:int(var_0_255:int, ldc:int(1757200233))
            storeelement:byte(var_3_171:byte[], var_5_172:int, stack_281_2:byte)
            
            if (cmpne:boolean(var_5_172:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C1_0 = stack_C3_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_189_0 = stack_1D9_0 = stack_23D_0 = stack_2B5_0 = var_3_171:byte[]
            goto(Label_0200)
        }
        
        var_0_22B = and:int(var_0_22B:int, ldc:int(-1448545102))
        goto(Label_0372)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_22B:int, ldc:int(64)), ldc:int(0))) {
            var_0_22B = and:int(var_0_22B:int, ldc:int(-2045146408))
            goto(Label_0251)
        }
        
        if (cmpeq:boolean(and:int(var_0_22B:int, ldc:int(1048576)), ldc:int(0))) {
            goto(Label_0200)
        }
        
        if (cmpne:boolean(and:int(var_0_22B:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_22B = and:int(var_0_22B:int, ldc:int(-138593403))
            var_2_94 = stack_94_0:byte[]
            expr_98 = add:int(arraylength:int(stack_96_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_98:int, ldc:int(0))) {
                var_3_1C8 = newarray:byte[](byte.class, expr_98:int)
                var_5_1C9 = expr_98:int
                
                loop {
                    var_0_22B = and:int(var_0_22B:int, ldc:int(1920954209))
                    var_5_1C9 = add:int(var_5_1C9:int, ldc:int(-1))
                    storeelement:byte(var_3_1C8:byte[], var_5_1C9:int, add:int(shl:int(loadelement:byte(stack_1D9_0:byte[], var_5_1C9:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_94:byte[], add:int(var_5_1C9:int, xor:int(ldc:int(3138), ldc:int(3139)))), ldc:int(2)), and:int(ldc:int(16959), ldc:int(63)))))
                    
                    if (cmpne:boolean(var_5_1C9:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_C1_0 = stack_C3_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_189_0 = stack_1D9_0 = stack_23D_0 = stack_2B5_0 = var_3_1C8:byte[]
            }
        }
        
        Label_0157:
        
        if (cmpeq:boolean(and:int(var_0_22B:int, ldc:int(8192)), ldc:int(0))) {
            var_0_22B = and:int(var_0_22B:int, ldc:int(-774591943))
            goto(Label_0251)
        }
        
        if (cmpeq:boolean(and:int(var_0_22B:int, ldc:int(64)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_22B:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_22B = and:int(var_0_22B:int, ldc:int(-417513688))
            expr_C3 = arraylength:int(stack_C3_0:byte[])
            
            if (cmpne:boolean(expr_C3:int, ldc:int(0))) {
                var_4_16C = expr_C3:int
                var_3_171 = newarray:byte[](byte.class, expr_C3:int)
                var_5_172 = expr_C3:int
                goto(Label_0544)
            }
        }
        
        Label_0200:
        
        if (cmpne:boolean(and:int(var_0_22B:int, ldc:int(64)), ldc:int(0))) {
            var_0_22B = and:int(var_0_22B:int, ldc:int(-95511362))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_22B:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_0157)
            }
            
            if (cmpeq:boolean(and:int(var_0_22B:int, ldc:int(256)), ldc:int(0))) {
                var_0_22B = and:int(var_0_22B:int, ldc:int(-1592951955))
                goto(Label_0112)
            }
            
            var_0_22B = and:int(var_0_22B:int, ldc:int(-354599068))
            expr_F6 = arraylength:int(stack_F6_0:byte[])
            
            if (cmpne:boolean(expr_F6:int, ldc:int(0))) {
                var_3_2A4 = newarray:byte[](byte.class, expr_F6:int)
                var_5_2A5 = expr_F6:int
                
                loop {
                    var_0_22B = and:int(var_0_22B:int, ldc:int(1790783292))
                    var_5_2A5 = add:int(var_5_2A5:int, ldc:int(-1))
                    storeelement:byte(var_3_2A4:byte[], var_5_2A5:int, add:byte(xor:byte(loadelement:byte(stack_2B5_0:byte[], var_5_2A5:int), ldc:byte(54)), ldc:byte(71)))
                    
                    if (cmpne:boolean(var_5_2A5:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_C1_0 = stack_C3_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_189_0 = stack_1D9_0 = stack_23D_0 = stack_2B5_0 = var_3_2A4:byte[]
            }
        }
        
        Label_0251:
        
        if (cmpeq:boolean(and:int(var_0_22B:int, ldc:int(8192)), ldc:int(0))) {
            var_0_22B = and:int(var_0_22B:int, ldc:int(1316325405))
            goto(Label_0200)
        }
        
        if (cmpeq:boolean(and:int(var_0_22B:int, ldc:int(8192)), ldc:int(0))) {
            goto(Label_0157)
        }
        
        if (cmpne:boolean(and:int(var_0_22B:int, ldc:int(8)), ldc:int(0))) {
            var_0_22B = and:int(var_0_22B:int, ldc:int(893520209))
            goto(Label_0112)
        }
        
        var_3_132 = initobject:String(String::<init>, stack_126_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_165_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(19369), ldc:int(5121)))
        expr_144 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-32704), ldc:int(-32703)))
        storeelement:String(expr_144:String[], and:int(ldc:int(5399), ldc:int(-13592)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(-30563), ldc:int(29986)), xor:int(ldc:int(16735), ldc:int(16711))))
        putstatic:String[](\u99f7\u5fe1\ub19c\ub18d\u624e\u12cb::\u5245\u3d4b\u8aa5\u59ec\u8258\u5db4, expr_144:String[])
    }
    
    public void \ubefe\u92ee\ua3b4\u071d\u64f2\ufcaf(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_610 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_61B : int
        
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
        var_3_610 = and:int(ldc:int(82878074), ldc:int(-1360527496))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u99f7\u5fe1\ub19c\ub18d\u624e\u12cb[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_610:int, ldc:int(262144)), ldc:int(0))) {
            var_3_610 = and:int(var_3_610:int, ldc:int(796704399))
        }
        else {
            var_3_610 = and:int(var_3_610:int, ldc:int(-136036905))
            var_5_85 = and:int(ldc:int(19937), ldc:int(-19950))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-20749), ldc:int(20748)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_610:int, ldc:int(1722113863))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(8287), ldc:int(17057)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(-32238), ldc:int(-32237)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_610 = and:int(var_3_D2:int, ldc:int(83212765))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(4105), ldc:int(9281)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1327)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1209)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(24065173))
                        goto(Label_1093)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(1)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-1799454690))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(4)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(1431682024))
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-1930387871))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(633444385))
                        goto(Label_1327)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-888058129))
                        goto(Label_1209)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(197741212))
                        goto(Label_1093)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-550663608))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_610:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_610 = and:int(var_3_610:int, ldc:int(2069571568))
                            loopcontinue()
                        }
                        
                        var_3_610 = and:int(var_3_610:int, ldc:int(-1242719524))
                        var_11_E3 = and:int(ldc:int(28356), ldc:int(-28357))
                        goto(Label_1455)
                    }
                    
                    Label_0541:
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-1443535670))
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(4)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-875345106))
                        goto(Label_1327)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1209)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(64)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-834773311))
                        goto(Label_1093)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-1668262211))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(64)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(1595722336))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_610 = and:int(var_3_610:int, ldc:int(-1341925424))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(64)), ldc:int(0))) {
                            var_3_610 = and:int(var_3_610:int, ldc:int(2146946240))
                            loopcontinue()
                        }
                        
                        var_3_610 = and:int(var_3_610:int, ldc:int(770423645))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0676:
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-700909588))
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-72951407))
                        goto(Label_1327)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1209)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1093)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(1)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(1149308289))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_610:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_610 = and:int(var_3_610:int, ldc:int(-1073824905))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0786:
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(944815768))
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1327)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(1833800435))
                        goto(Label_1209)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1093)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-138020462))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_610:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_610 = and:int(var_3_610:int, ldc:int(54989242))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_610 = and:int(var_3_610:int, ldc:int(-827641914))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_610:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_610 = and:int(var_3_610:int, ldc:int(349690079))
                            loopcontinue()
                        }
                        
                        var_3_610 = and:int(var_3_610:int, ldc:int(653507913))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(16433), ldc:int(1409))
                                goto(Label_1093)
                            }
                        }
                    }
                    
                    Label_0913:
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(1515881702))
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(1)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(376237196))
                        goto(Label_1327)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-574090972))
                        goto(Label_1209)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-1650697351))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_610:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_610:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_610 = and:int(var_3_610:int, ldc:int(1799021991))
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_610 = and:int(var_3_610:int, ldc:int(1957207103))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_610:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_610 = and:int(var_3_610:int, ldc:int(1293486048))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_610:int, ldc:int(1)), ldc:int(0))) {
                            var_3_610 = and:int(var_3_610:int, ldc:int(715037792))
                            loopcontinue()
                        }
                        
                        var_3_610 = and:int(var_3_610:int, ldc:int(246685177))
                        var_11_E3 = and:int(ldc:int(5816), ldc:int(-5819))
                    }
                    
                    Label_1093:
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(1)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-2048366321))
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1327)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0913)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_610:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_610 = and:int(var_3_610:int, ldc:int(586474819))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_610 = and:int(var_3_610:int, ldc:int(1852229608))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_610 = and:int(var_3_610:int, ldc:int(-251442536))
                            loopcontinue()
                        }
                        
                        var_3_610 = and:int(var_3_610:int, ldc:int(1856444763))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1327)
                            }
                        }
                    }
                    
                    Label_1209:
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_610:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_1093)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(64)), ldc:int(0))) {
                            var_3_610 = and:int(var_3_610:int, ldc:int(49379935))
                            goto(Label_0913)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_610:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_610 = and:int(var_3_610:int, ldc:int(555508645))
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_610:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_610:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_610 = and:int(var_3_610:int, ldc:int(1819920956))
                            loopcontinue()
                        }
                        
                        var_3_610 = and:int(var_3_610:int, ldc:int(1977645272))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1455)
                    }
                    
                    Label_1327:
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-1144638879))
                        goto(Label_1209)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1093)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-1391978477))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(1772253708))
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(64)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(565943948))
                        loopcontinue()
                    }
                    
                    var_3_610 = and:int(var_3_610:int, ldc:int(401588057))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1455:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_61B = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1466:
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1327)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1209)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1093)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(64)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-696879970))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-1508968434))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(1453874932))
                        var_17_61B = add:int(var_16_111:int, and:int(ldc:int(10289), ldc:int(5961)))
                        looporswitchbreak()
                    }
                }
                
                var_3_610 = and:int(var_3_610:int, ldc:int(-705078164))
                
                if (cmple:boolean(var_5_85 = var_17_61B:int, sub:int(var_6_8C:int, and:int(ldc:int(523), ldc:int(16401))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_610:int, ldc:int(67108864)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
