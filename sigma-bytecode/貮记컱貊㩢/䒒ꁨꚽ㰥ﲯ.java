public class \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u4492\ua068\ua6bd\u3c25\ufcaf {
    public void \u4492\ua068\ua6bd\u3c25\ufcaf(\ud36e\u6bb9\u960f\u4c04\u64ab.\u12cb\u93a2\ubf56\uc229\u8d90 p0, java.lang.String p1, \u516c\u3d64\u718f\ub171\u6b5f.\uc910\ub6ab\uafe7\ud217\u7330\u600f p2) {
        var_6_94 : int
        var_7_BB : String
        var_8_CC : \u1833\ubff1\u960f\u516c\u4f52\u9a18
        var_9_10E : int
        
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
            invokespecial:\u12cb\u93a2\ubf56\uc229\u8d90(\u12cb\u93a2\ubf56\uc229\u8d90::<init>, this:\u4492\ua068\ua6bd\u3c25\ufcaf, p0:\u12cb\u93a2\ubf56\uc229\u8d90, p1:String)
            putfield:\u8d98\ua068\u4492\u9af2\u5f50(\u4492\ua068\ua6bd\u3c25\ufcaf::\ud158\u7ce1\ub32d\ufcaf\ub171, this:\u4492\ua068\ua6bd\u3c25\ufcaf, initobject:\u8d98\ua068\u4492\u9af2\u5f50(\u8d98\ua068\u4492\u9af2\u5f50::<init>, xor:int(ldc:int(16690), ldc:int(16448)), and:int(ldc:int(10903), ldc:int(5302)), getstatic:\u3711\u71f1\u7006\u92ee\ucef1(\u3711\u71f1\u7006\u92ee\ucef1::\u7049\u16f6\u8389\u392e\u5140)))
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u0b8e\ud4fe\uc229\u92ee\ud4fe, this:\u4492\ua068\ua6bd\u3c25\ufcaf[expected:\u12cb\u93a2\ubf56\uc229\u8d90], invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, invokevirtual:\u12cb\u93a2\ubf56\uc229\u8d90(\u12cb\u93a2\ubf56\uc229\u8d90::\ubf56\ubf56\u416d\u40a9\u52d3, this:\u4492\ua068\ua6bd\u3c25\ufcaf[expected:\u12cb\u93a2\ubf56\uc229\u8d90])))
            var_6_94 = and:int(ldc:int(-10685), ldc:int(2492))
            
            if (invokevirtual:boolean(\uc910\ub6ab\uafe7\ud217\u7330\u600f::\u92ff\u960f\uae5d\u62da\u16f6\u8753, p2:\uc910\ub6ab\uafe7\ud217\u7330\u600f, loadelement:String(getstatic:String[](\u4492\ua068\ua6bd\u3c25\ufcaf::\u4ab3\u99f7\u3a62\u3711\ub6ab), and:int(ldc:int(21763), ldc:int(-21860))))) {
                invokestatic:void(GL11::glTexEnvi, xor:int(ldc:int(12724), ldc:int(4788)), and:int(ldc:int(27266), ldc:int(9749)), xor:int(ldc:int(9337), ldc:int(9597)))
            }
            
            var_7_BB = invokevirtual:String(\uc910\ub6ab\uafe7\ud217\u7330\u600f::\ud51e\ub70c\u647c\u9255\u5654\u4f4a, p2:\uc910\ub6ab\uafe7\ud217\u7330\u600f, loadelement:String(getstatic:String[](\u4492\ua068\ua6bd\u3c25\ufcaf::\u4ab3\u99f7\u3a62\u3711\ub6ab), xor:int(ldc:int(20612), ldc:int(20613))))
            var_8_CC = invokevirtual:\u1833\ubff1\u960f\u516c\u4f52\u9a18(\uc910\ub6ab\uafe7\ud217\u7330\u600f::\u7006\u7043\u36d3\uc2e8\ub18d\uae87, p2:\uc910\ub6ab\uafe7\ud217\u7330\u600f, loadelement:String(getstatic:String[](\u4492\ua068\ua6bd\u3c25\ufcaf::\u4ab3\u99f7\u3a62\u3711\ub6ab), and:int(ldc:int(17502), ldc:int(12674))))
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u494c\u494c\ub32d\u36d3\u8753, this:\u4492\ua068\ua6bd\u3c25\ufcaf[expected:\u12cb\u93a2\ubf56\uc229\u8d90], initobject:\u7e3f\uc246\u9033\u3504\u6435(\u7e3f\uc246\u9033\u3504\u6435::<init>, this:\u4492\ua068\ua6bd\u3c25\ufcaf[expected:\u12cb\u93a2\ubf56\uc229\u8d90], loadelement:String(getstatic:String[](\u4492\ua068\ua6bd\u3c25\ufcaf::\u4ab3\u99f7\u3a62\u3711\ub6ab), and:int(ldc:int(14673), ldc:int(133))), and:int(ldc:int(-3808), ldc:int(3151)), var_6_94:int, and:int(ldc:int(138), ldc:int(-139)), and:int(ldc:int(-19108), ldc:int(19073)), getstatic:\u4c04\u6b0d\u61a4\u6435\u71ae(\u4c04\u6b0d\u61a4\u6435\u71ae::\u624e\u0b8e\ud158\ud158\ubf56), var_7_BB:String, getstatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\ua6bd\u4c04\u3a62\u47c2\ud158)))
            inc:int(var_6_94, ldc:int(55))
            var_9_10E = and:int(ldc:int(-11293), ldc:int(11288))
            
            while (cmplt:boolean(var_9_10E:int, invokevirtual:int(\u1833\ubff1\u960f\u516c\u4f52\u9a18::\u3711\u647c\u5654\u7bad\u718f\u494c, var_8_CC:\u1833\ubff1\u960f\u516c\u4f52\u9a18))) {
                invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u494c\u494c\ub32d\u36d3\u8753, this:\u4492\ua068\ua6bd\u3c25\ufcaf[expected:\u12cb\u93a2\ubf56\uc229\u8d90], initobject:\u7e3f\uc246\u9033\u3504\u6435(\u7e3f\uc246\u9033\u3504\u6435::<init>, this:\u4492\ua068\ua6bd\u3c25\ufcaf[expected:\u12cb\u93a2\ubf56\uc229\u8d90], invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u4492\ua068\ua6bd\u3c25\ufcaf::\u4ab3\u99f7\u3a62\u3711\ub6ab), xor:int(ldc:int(25), ldc:int(29)))), var_9_10E:int)), and:int(ldc:int(14016), ldc:int(-14017)), var_6_94:int, and:int(ldc:int(-18848), ldc:int(18581)), and:int(ldc:int(-21239), ldc:int(4854)), initobject:\u4c04\u6b0d\u61a4\u6435\u71ae(\u4c04\u6b0d\u61a4\u6435\u71ae::<init>, and:int(ldc:int(-12235), ldc:int(4042)), and:int(ldc:int(-14871), ldc:int(14870)), and:int(ldc:int(29746), ldc:int(-30587)), invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u6d99\u6fb0\ub102\u8413\u8350)), ldc:float(0.8f))), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u4492\ua068\ua6bd\u3c25\ufcaf::\u4ab3\u99f7\u3a62\u3711\ub6ab), and:int(ldc:int(3227), ldc:int(8807)))), invokevirtual:String(\u1833\ubff1\u960f\u516c\u4f52\u9a18::\u494c\u6198\u51b2\ub6ab\uae87\u600f, var_8_CC:\u1833\ubff1\u960f\u516c\u4f52\u9a18, var_9_10E:int))), getstatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\ua3b4\u4d85\u3e75\u6198\u7330)))
                inc:int(var_6_94, ldc:int(22))
                inc:int(var_9_10E, ldc:int(1))
            }
            
            inc:int(var_6_94, ldc:int(75))
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\uc9f6\u759a\u64ab\u97e6\u9255, this:\u4492\ua068\ua6bd\u3c25\ufcaf[expected:\u12cb\u93a2\ubf56\uc229\u8d90], var_6_94:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ucfaf\u7e3f\ube23\u4f52\u071d(float p0) {
        stack_9C_0 : float [generated]
        expr_6E : double[] [generated]
        
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
            stack_9C_0 = invokevirtual:float(\u8d98\ua068\u4492\u9af2\u5f50::\u34df\ubefe\uc2bd\u8308\u8d90\uc3e3, getfield:\u8d98\ua068\u4492\u9af2\u5f50(\u4492\ua068\ua6bd\u3c25\ufcaf::\ud158\u7ce1\ub32d\ufcaf\ub171, this:\u4492\ua068\ua6bd\u3c25\ufcaf))
            expr_6E = newarray:double[](double.class, and:int(ldc:int(10516), ldc:int(20495)))
            storeelement:double(expr_6E:double[], and:int(ldc:int(-28955), ldc:int(24850)), ldc:double(0.17))
            storeelement:double(expr_6E:double[], xor:int(ldc:int(-16384), ldc:int(-16383)), ldc:double(1.0))
            storeelement:double(expr_6E:double[], xor:int(ldc:int(257), ldc:int(259)), ldc:double(0.51))
            storeelement:double(expr_6E:double[], and:int(ldc:int(1287), ldc:int(16395)), ldc:double(1.0))
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u36d3\u8c8a\u3dd3\ud7e8\ud4fe, this:\u4492\ua068\ua6bd\u3c25\ufcaf[expected:\u12cb\u93a2\ubf56\uc229\u8d90], f2i:int(mul:float(sub:float(ldc:float(1.0f), invokestatic:float(\ud12e\u3dd3\u5245\ud217\u7c6b::\u624e\u6c56\uc84e\u5fe1\u47c2\u0800, stack_9C_0:float, expr_6E:double[])), ldc:float(100.0f))))
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u3e75\u88c5\u9033\u4bc8\ub113, this:\u4492\ua068\ua6bd\u3c25\ufcaf[expected:\u12cb\u93a2\ubf56\uc229\u8d90])
            p0 = mul:float(p0:float, invokevirtual:float(\u8d98\ua068\u4492\u9af2\u5f50::\u34df\ubefe\uc2bd\u8308\u8d90\uc3e3, getfield:\u8d98\ua068\u4492\u9af2\u5f50(\u4492\ua068\ua6bd\u3c25\ufcaf::\ud158\u7ce1\ub32d\ufcaf\ub171, this:\u4492\ua068\ua6bd\u3c25\ufcaf)))
            invokespecial:void(\u12cb\u93a2\ubf56\uc229\u8d90::\ucfaf\u7e3f\ube23\u4f52\u071d, this:\u4492\ua068\ua6bd\u3c25\ufcaf[expected:\u12cb\u93a2\ubf56\uc229\u8d90], p0:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_2A1 : int
        expr_6B : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_C9_0 : byte[] [generated]
        stack_CB_0 : byte[] [generated]
        stack_104_0 : byte[] [generated]
        stack_106_0 : byte[] [generated]
        stack_126_0 : byte[] [generated]
        stack_1FC_0 : byte[] [generated]
        stack_24F_0 : byte[] [generated]
        stack_2BA_0 : byte[] [generated]
        stack_317_0 : byte[] [generated]
        var_4_1D8 : int
        var_3_1DD : byte[]
        var_5_1DE : int
        expr_1FC : byte [generated]
        var_0_30D : int
        expr_317 : byte [generated]
        stack_347_2 : byte [generated]
        var_2_9C : byte[]
        expr_A0 : int [generated]
        var_3_23E : byte[]
        var_5_23F : int
        expr_CB : int [generated]
        expr_106 : int [generated]
        var_3_132 : String
        stack_1D1_0 : String[] [generated]
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
        var_0_2A1 = and:int(ldc:int(1813964982), ldc:int(1714421174))
        expr_6B = arraylength:int(stack_9C_0 = stack_9E_0 = stack_C9_0 = stack_CB_0 = stack_104_0 = stack_106_0 = stack_126_0 = stack_1FC_0 = stack_24F_0 = stack_2BA_0 = stack_317_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("drvWZkpySlJcbEpySlJ8vVJiVrVWXHy3Un5AakZAE7k=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1D8 = expr_6B:int
        var_3_1DD = newarray:byte[](byte.class, expr_6B:int)
        var_5_1DE = expr_6B:int
        Label_0480:
        
        while (cmpeq:boolean(and:int(var_0_2A1:int, ldc:int(8388608)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_2A1:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0662)
            }
            
            var_0_2A1 = and:int(var_0_2A1:int, ldc:int(809368575))
            var_5_1DE = add:int(var_5_1DE:int, ldc:int(-1))
            expr_1FC = loadelement:byte(stack_1FC_0:byte[], var_5_1DE:int)
            storeelement:byte(var_3_1DD:byte[], var_5_1DE:int, xor:int(or:int(and:int(shl:int(expr_1FC:byte, and:int(ldc:int(1092), ldc:int(134))), ldc:int(-16)), and:int(shr:int(expr_1FC:byte[expected:int], xor:int(ldc:int(17459), ldc:int(17463))), ldc:int(15))), ldc:int(123)))
            
            if (cmpne:boolean(var_5_1DE:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C9_0 = stack_CB_0 = stack_104_0 = stack_106_0 = stack_126_0 = stack_1FC_0 = stack_24F_0 = stack_2BA_0 = stack_317_0 = var_3_1DD:byte[]
            goto(Label_0112)
        }
        
        goto(Label_0745)
        Label_0662:
        
        while (cmpeq:boolean(and:int(var_0_2A1:int, ldc:int(4096)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_2A1:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0480)
            }
            
            var_0_2A1 = and:int(var_0_2A1:int, ldc:int(-1095827970))
            var_5_1DE = add:int(var_5_1DE:int, ldc:int(-1))
            storeelement:byte(var_3_1DD:byte[], var_5_1DE:int, add:byte(loadelement:byte(stack_2BA_0:byte[], var_5_1DE:int), ldc:byte(13)))
            
            if (cmpne:boolean(var_5_1DE:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C9_0 = stack_CB_0 = stack_104_0 = stack_106_0 = stack_126_0 = stack_1FC_0 = stack_24F_0 = stack_2BA_0 = stack_317_0 = var_3_1DD:byte[]
            goto(Label_0208)
        }
        
        var_0_2A1 = and:int(var_0_2A1:int, ldc:int(-2122252352))
        Label_0745:
        
        while (cmpeq:boolean(and:int(var_0_2A1:int, ldc:int(8388608)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_2A1:int, ldc:int(4)), ldc:int(0))) {
                var_0_2A1 = and:int(var_0_2A1:int, ldc:int(-1640629702))
                goto(Label_0480)
            }
            
            var_0_30D = and:int(var_0_2A1:int, ldc:int(662502646))
            var_5_1DE = add:int(var_5_1DE:int, ldc:int(-1))
            expr_317 = loadelement:byte(stack_317_0:byte[], var_5_1DE:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_1DE:int, ldc:int(1)), neg:int(var_4_1D8:int)), ldc:int(0))) {
                var_0_30D = and:int(var_0_30D:int, ldc:int(1013971326))
                stack_347_2 = add:byte(expr_317:byte, ldc:byte(1))
            }
            else {
                stack_347_2 = add:byte(expr_317:byte, loadelement:byte(var_3_1DD:byte[], add:int(var_5_1DE:int, ldc:int(1))))
            }
            
            var_0_2A1 = and:int(var_0_30D:int, ldc:int(-1238370242))
            storeelement:byte(var_3_1DD:byte[], var_5_1DE:int, stack_347_2:byte)
            
            if (cmpne:boolean(var_5_1DE:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C9_0 = stack_CB_0 = stack_104_0 = stack_106_0 = stack_126_0 = stack_1FC_0 = stack_24F_0 = stack_2BA_0 = stack_317_0 = var_3_1DD:byte[]
            goto(Label_0267)
        }
        
        var_0_2A1 = and:int(var_0_2A1:int, ldc:int(-1716352058))
        goto(Label_0662)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_2A1:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_2A1 = and:int(var_0_2A1:int, ldc:int(-1410339981))
            goto(Label_0267)
        }
        
        if (cmpeq:boolean(and:int(var_0_2A1:int, ldc:int(8192)), ldc:int(0))) {
            var_0_2A1 = and:int(var_0_2A1:int, ldc:int(535938591))
            goto(Label_0208)
        }
        
        if (cmpne:boolean(and:int(var_0_2A1:int, ldc:int(524288)), ldc:int(0))) {
            var_0_2A1 = and:int(var_0_2A1:int, ldc:int(-314638594))
            var_2_9C = stack_9C_0:byte[]
            expr_A0 = add:int(arraylength:int(stack_9E_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A0:int, ldc:int(0))) {
                var_3_23E = newarray:byte[](byte.class, expr_A0:int)
                var_5_23F = expr_A0:int
                
                loop {
                    var_0_2A1 = and:int(var_0_2A1:int, ldc:int(1639771894))
                    var_5_23F = add:int(var_5_23F:int, ldc:int(-1))
                    storeelement:byte(var_3_23E:byte[], var_5_23F:int, add:int(shl:int(loadelement:byte(stack_24F_0:byte[], var_5_23F:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_9C:byte[], add:int(var_5_23F:int, xor:int(ldc:int(1320), ldc:int(1321)))), ldc:int(5)), xor:int(ldc:int(4636), ldc:int(4635)))))
                    
                    if (cmpne:boolean(var_5_23F:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_C9_0 = stack_CB_0 = stack_104_0 = stack_106_0 = stack_126_0 = stack_1FC_0 = stack_24F_0 = stack_2BA_0 = stack_317_0 = var_3_23E:byte[]
            }
        }
        
        Label_0165:
        
        if (cmpne:boolean(and:int(var_0_2A1:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_0267)
        }
        
        if (cmpeq:boolean(and:int(var_0_2A1:int, ldc:int(512)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_2A1:int, ldc:int(262144)), ldc:int(0))) {
                var_0_2A1 = and:int(var_0_2A1:int, ldc:int(-1445548351))
                goto(Label_0112)
            }
            
            var_0_2A1 = and:int(var_0_2A1:int, ldc:int(-493029129))
            expr_CB = arraylength:int(stack_CB_0:byte[])
            
            if (cmpne:boolean(expr_CB:int, ldc:int(0))) {
                var_4_1D8 = expr_CB:int
                var_3_1DD = newarray:byte[](byte.class, expr_CB:int)
                var_5_1DE = expr_CB:int
                goto(Label_0662)
            }
        }
        
        Label_0208:
        
        if (cmpeq:boolean(and:int(var_0_2A1:int, ldc:int(262144)), ldc:int(0))) {
            var_0_2A1 = and:int(var_0_2A1:int, ldc:int(-364652617))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_2A1:int, ldc:int(8192)), ldc:int(0))) {
                var_0_2A1 = and:int(var_0_2A1:int, ldc:int(860607901))
                goto(Label_0165)
            }
            
            if (cmpeq:boolean(and:int(var_0_2A1:int, ldc:int(32768)), ldc:int(0))) {
                var_0_2A1 = and:int(var_0_2A1:int, ldc:int(1807779881))
                goto(Label_0112)
            }
            
            var_0_2A1 = and:int(var_0_2A1:int, ldc:int(1015872118))
            expr_106 = arraylength:int(stack_106_0:byte[])
            
            if (cmpne:boolean(expr_106:int, ldc:int(0))) {
                var_4_1D8 = expr_106:int
                var_3_1DD = newarray:byte[](byte.class, expr_106:int)
                var_5_1DE = expr_106:int
                goto(Label_0745)
            }
        }
        
        Label_0267:
        
        if (cmpne:boolean(and:int(var_0_2A1:int, ldc:int(64)), ldc:int(0))) {
            goto(Label_0208)
        }
        
        if (cmpeq:boolean(and:int(var_0_2A1:int, ldc:int(32)), ldc:int(0))) {
            goto(Label_0165)
        }
        
        if (cmpeq:boolean(and:int(var_0_2A1:int, ldc:int(65536)), ldc:int(0))) {
            var_3_132 = initobject:String(String::<init>, stack_126_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1D1_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(1479), ldc:int(2093)))
            expr_144 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(9223), ldc:int(6733)))
            storeelement:String(expr_144:String[], xor:int(ldc:int(517), ldc:int(518)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(7699), ldc:int(-24084)), and:int(ldc:int(4103), ldc:int(1379))))
            storeelement:String(expr_144:String[], and:int(ldc:int(4132), ldc:int(3484)), invokevirtual:String[expected:String](String::substring, var_3_132:String, xor:int(ldc:int(-31744), ldc:int(-31741)), and:int(ldc:int(16653), ldc:int(2249))))
            storeelement:String(expr_144:String[], and:int(ldc:int(3), ldc:int(20706)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(137), ldc:int(16493)), xor:int(ldc:int(94), ldc:int(78))))
            storeelement:String(expr_144:String[], and:int(ldc:int(-17998), ldc:int(17996)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(2392), ldc:int(4753)), xor:int(ldc:int(6403), ldc:int(6425))))
            storeelement:String(expr_144:String[], and:int(ldc:int(4313), ldc:int(18433)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(3227), ldc:int(16670)), xor:int(ldc:int(20602), ldc:int(20581))))
            putstatic:String[](\u4492\ua068\ua6bd\u3c25\ufcaf::\u4ab3\u99f7\u3a62\u3711\ub6ab, expr_144:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \ucb79\u5bc4\u760c\u8413\u156b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_631 : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_C7 : double
        var_3_D9 : int
        var_11_EA : int
        var_14_114 : double
        var_16_118 : int
        var_12_110 : double
        var_17_63C : int
        
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
        var_3_631 = and:int(ldc:int(1592686841), ldc:int(1286502831))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4492\ua068\ua6bd\u3c25\ufcaf[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(65536)), ldc:int(0))) {
            var_3_631 = and:int(var_3_631:int, ldc:int(2097151961))
            var_5_80 = and:int(ldc:int(-12701), ldc:int(12700))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-15579), ldc:int(13514)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C7 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D9 = and:int(var_3_631:int, ldc:int(1856989533))
                    var_9_C7 = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EA = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EA:int, sub:int(var_6_87:int, xor:int(ldc:int(20624), ldc:int(20625)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EA:int, and:int(ldc:int(12801), ldc:int(99)))), var_7_96:double))) {
                        inc:int(var_11_EA, ldc:int(1))
                    }
                    
                    var_3_631 = and:int(var_3_D9:int, ldc:int(1325361851))
                    var_14_114 = var_7_96:double
                    var_16_118 = var_11_EA:int
                }
                else {
                    var_11_EA = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), and:int(ldc:int(16465), ldc:int(4133)))
                    var_12_110 = var_14_114 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_118 = var_11_EA:int, var_6_87:int)) {
                        var_9_C7 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EA:int)
                        var_16_118 = var_11_EA:int
                        var_14_114 = var_12_110:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-1373784580))
                        goto(Label_1476)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(4)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(201338758))
                        goto(Label_1330)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1214)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1109)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0936)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-1877475182))
                        goto(Label_0832)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0710)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-1617397519))
                        goto(Label_0580)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(2108582189))
                        
                        if (cmplt:boolean(var_16_118:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0580)
                            }
                            
                            goto(Label_0832)
                        }
                    }
                    
                    Label_0407:
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-262374532))
                        goto(Label_1476)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1330)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1214)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1109)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(1758758535))
                        goto(Label_0936)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(8)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(1318684004))
                        goto(Label_0832)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(2)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-9105397))
                        goto(Label_0710)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_631 = and:int(var_3_631:int, ldc:int(-1275985302))
                            loopcontinue()
                        }
                        
                        var_3_631 = and:int(var_3_631:int, ldc:int(-843153891))
                        var_11_EA = and:int(ldc:int(15881), ldc:int(-16138))
                        goto(Label_1465)
                    }
                    
                    Label_0580:
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-531906136))
                        goto(Label_1476)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-8795034))
                        goto(Label_1330)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1214)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-1665769108))
                        goto(Label_1109)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(1779220758))
                        goto(Label_0936)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0832)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_631 = and:int(var_3_631:int, ldc:int(1723636901))
                            goto(Label_0407)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_631 = and:int(var_3_631:int, ldc:int(1336896493))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_114 = var_9_C7:double
                            goto(Label_0832)
                        }
                    }
                    
                    Label_0710:
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(1)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(1758881377))
                        goto(Label_1476)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1330)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(8)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-1758551248))
                        goto(Label_1214)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1109)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0936)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0580)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(8)), ldc:int(0))) {
                            var_3_631 = and:int(var_3_631:int, ldc:int(1467496404))
                            goto(Label_0407)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_631 = and:int(var_3_631:int, ldc:int(-557942469))
                        var_14_114 = mul:double(ldc:double(0.5), add:double(var_9_C7:double, var_14_114:double))
                    }
                    
                    Label_0832:
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1476)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(4)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(1220586770))
                        goto(Label_1330)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1214)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1109)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0710)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_631:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_631 = and:int(var_3_631:int, ldc:int(-1507518356))
                            goto(Label_0580)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_631:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0407)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_631 = and:int(var_3_631:int, ldc:int(2091842121))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_EA = xor:int(ldc:int(8448), ldc:int(8449))
                                goto(Label_1109)
                            }
                        }
                    }
                    
                    Label_0936:
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(1139086590))
                        goto(Label_1476)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(1906704215))
                        goto(Label_1330)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1214)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-829872021))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_631 = and:int(var_3_631:int, ldc:int(208025740))
                            goto(Label_0832)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_631 = and:int(var_3_631:int, ldc:int(240507871))
                            goto(Label_0710)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_631:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0580)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0407)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_631:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_631 = and:int(var_3_631:int, ldc:int(844617738))
                            loopcontinue()
                        }
                        
                        var_3_631 = and:int(var_3_631:int, ldc:int(1828613913))
                        var_11_EA = and:int(ldc:int(15105), ldc:int(-15108))
                    }
                    
                    Label_1109:
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1476)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(1578731787))
                        goto(Label_1330)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0936)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_631:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_631 = and:int(var_3_631:int, ldc:int(2142408535))
                            goto(Label_0832)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0710)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_631:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0580)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0407)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_631 = and:int(var_3_631:int, ldc:int(-302089121))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                                goto(Label_1330)
                            }
                        }
                    }
                    
                    Label_1214:
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1476)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-278843407))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_631:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_1109)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0936)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0832)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_631 = and:int(var_3_631:int, ldc:int(-734466822))
                            goto(Label_0710)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0580)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0407)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_631 = and:int(var_3_631:int, ldc:int(1841261823))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_114:double, var_5_80:int, var_16_118:int)
                            goto(Label_1465)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1330:
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(136343351))
                        goto(Label_1476)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(1390793147))
                        goto(Label_1214)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(1396050788))
                        goto(Label_1109)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0936)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0832)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0710)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-1339365216))
                        goto(Label_0580)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(2097152)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_631 = and:int(var_3_631:int, ldc:int(-38798723))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_114:double, ldc:double(0.0))
                    Label_1465:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_63C = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1476:
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1330)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(1555534646))
                        goto(Label_1214)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1109)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-465116876))
                        goto(Label_0936)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0832)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0710)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(11304488))
                        goto(Label_0580)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(1341123103))
                        var_17_63C = add:int(var_16_118:int, xor:int(ldc:int(4160), ldc:int(4161)))
                        looporswitchbreak()
                    }
                    
                    var_3_631 = and:int(var_3_631:int, ldc:int(879769178))
                }
                
                var_3_631 = and:int(var_3_631:int, ldc:int(2109631513))
                
                if (cmple:boolean(var_5_80 = var_17_63C:int, sub:int(var_6_87:int, and:int(ldc:int(2317), ldc:int(24785))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_631 = and:int(var_3_631:int, ldc:int(1920117025))
            goto(Label_0108)
        }
    }
}
