public class \u3504\ufe34\u600f\u6b0d\u69d9.\ub171\u64f2\u6c56\ufcaf\u56bd {
    public void \ub171\u64f2\u6c56\ufcaf\u56bd(\ud36e\u6bb9\u960f\u4c04\u64ab.\u1833\uc229\u8413\ud4fe\u5db4 p0) {
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
            putfield:\u1833\uc229\u8413\ud4fe\u5db4(\ub171\u64f2\u6c56\ufcaf\u56bd::\u97b7\u3504\u718f\u5bc4\ud51e\ufe34, this:\ub171\u64f2\u6c56\ufcaf\u56bd, p0:\u1833\uc229\u8413\ud4fe\u5db4)
            invokespecial:Object(Object::<init>, this:\ub171\u64f2\u6c56\ufcaf\u56bd)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void run() {
        var_3_90 : int
        stack_BA_0 : \ud4fe\u156b\ud523\ucef1\uc7fe [generated]
        stack_BA_1 : String [generated]
        expr_AA : Object[] [generated]
        stack_E6_0 : \ud4fe\u156b\ud523\ucef1\uc7fe [generated]
        stack_E6_1 : String [generated]
        expr_D6 : Object[] [generated]
        
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
        
        if (invokestatic:boolean(\ud4fe\u156b\ud523\ucef1\uc7fe::\u6198\u56bd\u12cb\ub18d\u5f50\ubf56, getfield:\ud4fe\u156b\ud523\ucef1\uc7fe(\u1833\uc229\u8413\ud4fe\u5db4::\u385b\uc31c\u47c2\uc238\u8d98\u97b7, getfield:\u1833\uc229\u8413\ud4fe\u5db4(\ub171\u64f2\u6c56\ufcaf\u56bd::\u97b7\u3504\u718f\u5bc4\ud51e\ufe34, this:\ub171\u64f2\u6c56\ufcaf\u56bd)))) {
            return:void()
        }
        
        invokevirtual:void(Logger::fine, invokestatic:Logger(\ud4fe\u156b\ud523\ucef1\uc7fe::\uceb8\u40a9\u0b8e\u4daf\ub32d\ufe34), loadelement:String(getstatic:String[](\ub171\u64f2\u6c56\ufcaf\u56bd::\u8308\u3e2a\ub6ab\ubefe\u4492\u71ae), and:int(ldc:int(23908), ldc:int(-23909))))
        var_3_90 = invokevirtual:int(\u5d20\u183a\u6bb9\ua61f\u4c04::\u4e72\ub1b9\ubded\ufe34\u7c6b\u416d, invokestatic:\u5d20\u183a\u6bb9\ua61f\u4c04(\ud4fe\u156b\ud523\ucef1\uc7fe::\u156b\u2dcc\u97b7\u6bb9\u5245\u392e, getfield:\ud4fe\u156b\ud523\ucef1\uc7fe(\u1833\uc229\u8413\ud4fe\u5db4::\u385b\uc31c\u47c2\uc238\u8d98\u97b7, getfield:\u1833\uc229\u8413\ud4fe\u5db4(\ub171\u64f2\u6c56\ufcaf\u56bd::\u97b7\u3504\u718f\u5bc4\ud51e\ufe34, this:\ub171\u64f2\u6c56\ufcaf\u56bd))))
        stack_BA_0 = getfield:\ud4fe\u156b\ud523\ucef1\uc7fe(\u1833\uc229\u8413\ud4fe\u5db4::\u385b\uc31c\u47c2\uc238\u8d98\u97b7, getfield:\u1833\uc229\u8413\ud4fe\u5db4(\ub171\u64f2\u6c56\ufcaf\u56bd::\u97b7\u3504\u718f\u5bc4\ud51e\ufe34, this:\ub171\u64f2\u6c56\ufcaf\u56bd))
        stack_BA_1 = loadelement:String(getstatic:String[](\ub171\u64f2\u6c56\ufcaf\u56bd::\u8308\u3e2a\ub6ab\ubefe\u4492\u71ae), xor:int(ldc:int(10760), ldc:int(10761)))
        expr_AA = newarray:Object[](java.lang.Object.class, and:int(ldc:int(12323), ldc:int(3845)))
        storeelement:Object(expr_AA:Object[], and:int(ldc:int(-14531), ldc:int(14530)), invokestatic:Integer[expected:Object](Integer::valueOf, var_3_90:int))
        invokestatic:void(\ud4fe\u156b\ud523\ucef1\uc7fe::\u47c2\ud171\u9937\uf94d\uae87\u34df, stack_BA_0:\ud4fe\u156b\ud523\ucef1\uc7fe, stack_BA_1:String, expr_AA:Object[])
        stack_E6_0 = getfield:\ud4fe\u156b\ud523\ucef1\uc7fe(\u1833\uc229\u8413\ud4fe\u5db4::\u385b\uc31c\u47c2\uc238\u8d98\u97b7, getfield:\u1833\uc229\u8413\ud4fe\u5db4(\ub171\u64f2\u6c56\ufcaf\u56bd::\u97b7\u3504\u718f\u5bc4\ud51e\ufe34, this:\ub171\u64f2\u6c56\ufcaf\u56bd))
        stack_E6_1 = loadelement:String(getstatic:String[](\ub171\u64f2\u6c56\ufcaf\u56bd::\u8308\u3e2a\ub6ab\ubefe\u4492\u71ae), and:int(ldc:int(16386), ldc:int(8318)))
        expr_D6 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(2737), ldc:int(4355)))
        storeelement:Object(expr_D6:Object[], and:int(ldc:int(-7920), ldc:int(5863)), invokestatic:Integer[expected:Object](Integer::valueOf, var_3_90:int))
        invokestatic:void(\ud4fe\u156b\ud523\ucef1\uc7fe::\u47c2\ud171\u9937\uf94d\uae87\u34df, stack_E6_0:\ud4fe\u156b\ud523\ucef1\uc7fe, stack_E6_1:String, expr_D6:Object[])
        
        if (logicalnot:boolean(invokestatic:boolean(\ud4fe\u156b\ud523\ucef1\uc7fe::\u6198\u56bd\u12cb\ub18d\u5f50\ubf56, getfield:\ud4fe\u156b\ud523\ucef1\uc7fe(\u1833\uc229\u8413\ud4fe\u5db4::\u385b\uc31c\u47c2\uc238\u8d98\u97b7, getfield:\u1833\uc229\u8413\ud4fe\u5db4(\ub171\u64f2\u6c56\ufcaf\u56bd::\u97b7\u3504\u718f\u5bc4\ud51e\ufe34, this:\ub171\u64f2\u6c56\ufcaf\u56bd))))) {
            invokevirtual:\ud4fe\u156b\ud523\ucef1\uc7fe(\ud4fe\u156b\ud523\ucef1\uc7fe::\u12b2\ucfaf\ub8be\ucb79\u4cd9\u3c25, getfield:\ud4fe\u156b\ud523\ucef1\uc7fe(\u1833\uc229\u8413\ud4fe\u5db4::\u385b\uc31c\u47c2\uc238\u8d98\u97b7, getfield:\u1833\uc229\u8413\ud4fe\u5db4(\ub171\u64f2\u6c56\ufcaf\u56bd::\u97b7\u3504\u718f\u5bc4\ud51e\ufe34, this:\ub171\u64f2\u6c56\ufcaf\u56bd)), initobject:\u6d99\ud12e\u927d\u4daf\ua61f[expected:\u4cd9\u4daf\u647c\u6cfe\uc31c](\u6d99\ud12e\u927d\u4daf\ua61f::<init>, this:\ub171\u64f2\u6c56\ufcaf\u56bd))
        }
    }
    
    static {
        var_0_213 : int
        expr_6B : int [generated]
        stack_AB_0 : byte[] [generated]
        stack_AD_0 : byte[] [generated]
        stack_DD_0 : byte[] [generated]
        stack_DF_0 : byte[] [generated]
        stack_10F_0 : byte[] [generated]
        stack_111_0 : byte[] [generated]
        stack_14B_0 : byte[] [generated]
        stack_14D_0 : byte[] [generated]
        stack_184_0 : byte[] [generated]
        stack_22C_0 : byte[] [generated]
        stack_287_0 : byte[] [generated]
        stack_315_0 : byte[] [generated]
        stack_365_0 : byte[] [generated]
        stack_3BA_0 : byte[] [generated]
        var_4_200 : int
        var_3_205 : byte[]
        var_5_206 : int
        var_0_29F : int
        expr_287 : byte [generated]
        stack_2CB_2 : byte [generated]
        stack_2A2_0 : byte [generated]
        expr_315 : byte [generated]
        expr_AD : int [generated]
        expr_DF : int [generated]
        var_2_10F : byte[]
        expr_113 : int [generated]
        var_3_354 : byte[]
        var_5_355 : int
        expr_14D : int [generated]
        var_3_3A9 : byte[]
        var_5_3AA : int
        var_3_190 : String
        stack_1F9_0 : String[] [generated]
        expr_1A2 : String[] [generated]
        
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
        var_0_213 = and:int(ldc:int(542560703), ldc:int(-230770242))
        expr_6B = arraylength:int(stack_AB_0 = stack_AD_0 = stack_DD_0 = stack_DF_0 = stack_10F_0 = stack_111_0 = stack_14B_0 = stack_14D_0 = stack_184_0 = stack_22C_0 = stack_287_0 = stack_315_0 = stack_365_0 = stack_3BA_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("jcm9abW58daVqaDFjX3F0Y1xnfHFjX3F0Y3BsaFJjcm9aZXd/cWNfcXRjZF55VZfO6Y=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_200 = expr_6B:int
        var_3_205 = newarray:byte[](byte.class, expr_6B:int)
        var_5_206 = expr_6B:int
        Label_0520:
        
        while (cmpeq:boolean(and:int(var_0_213:int, ldc:int(1024)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_213:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0603)
            }
            
            var_0_213 = and:int(var_0_213:int, ldc:int(555194743))
            var_5_206 = add:int(var_5_206:int, ldc:int(-1))
            storeelement:byte(var_3_205:byte[], var_5_206:int, add:byte(loadelement:byte(stack_22C_0:byte[], var_5_206:int), ldc:byte(87)))
            
            if (cmpne:boolean(var_5_206:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AD_0 = stack_AB_0 = stack_DD_0 = stack_DF_0 = stack_10F_0 = stack_111_0 = stack_14B_0 = stack_14D_0 = stack_184_0 = stack_22C_0 = stack_287_0 = stack_315_0 = stack_365_0 = stack_3BA_0 = var_3_205:byte[]
            goto(Label_0112)
        }
        
        var_0_213 = and:int(var_0_213:int, ldc:int(-2092844761))
        goto(Label_0753)
        Label_0603:
        
        while (cmpne:boolean(and:int(var_0_213:int, ldc:int(256)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_213:int, ldc:int(262144)), ldc:int(0))) {
                var_0_213 = and:int(var_0_213:int, ldc:int(687800294))
                goto(Label_0520)
            }
            
            var_0_29F = and:int(var_0_213:int, ldc:int(-1187030602))
            var_5_206 = add:int(var_5_206:int, ldc:int(-1))
            expr_287 = stack_2CB_2 = loadelement(stack_287_0, var_5_206)
            
            if (cmplt:boolean(add:int(add:int(var_5_206:int, ldc:int(3)), neg:int(var_4_200:int)), ldc:int(0))) {
                stack_2CB_2 = stack_2A2_0 = add:byte(expr_287:byte, loadelement:byte(var_3_205:byte[], add:int(var_5_206:int, ldc:int(3))))
                goto(Label_0690)
            }
            
            Label_0660:
            
            if (cmpeq:boolean(and:int(var_0_29F:int, ldc:int(8192)), ldc:int(0))) {
                var_0_29F = and:int(var_0_29F:int, ldc:int(1058436022))
                stack_2CB_2 = stack_2A2_0 = add:byte(expr_287:byte, ldc:byte(3))
            }
            
            Label_0690:
            
            if (cmpne:boolean(and:int(var_0_29F:int, ldc:int(64)), ldc:int(0))) {
                var_0_29F = and:int(var_0_29F:int, ldc:int(-418373846))
                goto(Label_0660)
            }
            
            var_0_213 = and:int(var_0_29F:int, ldc:int(-88730690))
            storeelement:byte(var_3_205:byte[], var_5_206:int, stack_2CB_2:byte)
            
            if (cmpne:boolean(var_5_206:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AD_0 = stack_AB_0 = stack_DD_0 = stack_DF_0 = stack_10F_0 = stack_111_0 = stack_14B_0 = stack_14D_0 = stack_184_0 = stack_22C_0 = stack_287_0 = stack_315_0 = stack_365_0 = stack_3BA_0 = var_3_205:byte[]
            goto(Label_0178)
        }
        
        var_0_213 = and:int(var_0_213:int, ldc:int(-1703987930))
        Label_0753:
        
        while (cmpne:boolean(and:int(var_0_213:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_213:int, ldc:int(134217728)), ldc:int(0))) {
                var_0_213 = and:int(var_0_213:int, ldc:int(-859915888))
                goto(Label_0520)
            }
            
            var_0_213 = and:int(var_0_213:int, ldc:int(-142640330))
            var_5_206 = add:int(var_5_206:int, ldc:int(-1))
            expr_315 = loadelement:byte(stack_315_0:byte[], var_5_206:int)
            storeelement:byte(var_3_205:byte[], var_5_206:int, or:int(and:int(shl:int(expr_315:byte, and:int(ldc:int(589), ldc:int(10262))), ldc:int(-16)), and:int(shr:int(expr_315:byte[expected:int], xor:int(ldc:int(9986), ldc:int(9990))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_206:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AD_0 = stack_AB_0 = stack_DD_0 = stack_DF_0 = stack_10F_0 = stack_111_0 = stack_14B_0 = stack_14D_0 = stack_184_0 = stack_22C_0 = stack_287_0 = stack_315_0 = stack_365_0 = stack_3BA_0 = var_3_205:byte[]
            goto(Label_0228)
        }
        
        goto(Label_0603)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_213:int, ldc:int(33554432)), ldc:int(0))) {
            goto(Label_0338)
        }
        
        if (cmpne:boolean(and:int(var_0_213:int, ldc:int(64)), ldc:int(0))) {
            var_0_213 = and:int(var_0_213:int, ldc:int(669475118))
            goto(Label_0280)
        }
        
        if (cmpeq:boolean(and:int(var_0_213:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_213 = and:int(var_0_213:int, ldc:int(-1674001977))
            goto(Label_0228)
        }
        
        if (cmpeq:boolean(and:int(var_0_213:int, ldc:int(4096)), ldc:int(0))) {
            var_0_213 = and:int(var_0_213:int, ldc:int(275142574))
        }
        else {
            var_0_213 = and:int(var_0_213:int, ldc:int(1832885622))
            expr_AD = arraylength:int(stack_AD_0:byte[])
            
            if (cmpne:boolean(expr_AD:int, ldc:int(0))) {
                var_4_200 = expr_AD:int
                var_3_205 = newarray:byte[](byte.class, expr_AD:int)
                var_5_206 = expr_AD:int
                goto(Label_0603)
            }
        }
        
        Label_0178:
        
        if (cmpeq:boolean(and:int(var_0_213:int, ldc:int(4096)), ldc:int(0))) {
            var_0_213 = and:int(var_0_213:int, ldc:int(-473179608))
            goto(Label_0338)
        }
        
        if (cmpne:boolean(and:int(var_0_213:int, ldc:int(64)), ldc:int(0))) {
            goto(Label_0280)
        }
        
        if (cmpne:boolean(and:int(var_0_213:int, ldc:int(2)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_213:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_213 = and:int(var_0_213:int, ldc:int(-1126252681))
            expr_DF = arraylength:int(stack_DF_0:byte[])
            
            if (cmpne:boolean(expr_DF:int, ldc:int(0))) {
                var_4_200 = expr_DF:int
                var_3_205 = newarray:byte[](byte.class, expr_DF:int)
                var_5_206 = expr_DF:int
                goto(Label_0753)
            }
        }
        
        Label_0228:
        
        if (cmpeq:boolean(and:int(var_0_213:int, ldc:int(4)), ldc:int(0))) {
            goto(Label_0338)
        }
        
        if (cmpne:boolean(and:int(var_0_213:int, ldc:int(262144)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_213:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_0178)
            }
            
            if (cmpeq:boolean(and:int(var_0_213:int, ldc:int(256)), ldc:int(0))) {
                var_0_213 = and:int(var_0_213:int, ldc:int(-1294848004))
                goto(Label_0112)
            }
            
            var_0_213 = and:int(var_0_213:int, ldc:int(758545847))
            var_2_10F = stack_10F_0:byte[]
            expr_113 = add:int(arraylength:int(stack_111_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_113:int, ldc:int(0))) {
                var_3_354 = newarray:byte[](byte.class, expr_113:int)
                var_5_355 = expr_113:int
                
                loop {
                    var_0_213 = and:int(var_0_213:int, ldc:int(1060600702))
                    var_5_355 = add:int(var_5_355:int, ldc:int(-1))
                    storeelement:byte(var_3_354:byte[], var_5_355:int, add:int(shl:int(loadelement:byte(stack_365_0:byte[], var_5_355:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_10F:byte[], add:int(var_5_355:int, and:int(ldc:int(8269), ldc:int(16657)))), ldc:int(6)), xor:int(ldc:int(3073), ldc:int(3074)))))
                    
                    if (cmpne:boolean(var_5_355:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_AD_0 = stack_AB_0 = stack_DD_0 = stack_DF_0 = stack_10F_0 = stack_111_0 = stack_14B_0 = stack_14D_0 = stack_184_0 = stack_22C_0 = stack_287_0 = stack_315_0 = stack_365_0 = stack_3BA_0 = var_3_354:byte[]
            }
        }
        
        Label_0280:
        
        if (cmpne:boolean(and:int(var_0_213:int, ldc:int(8192)), ldc:int(0))) {
            var_0_213 = and:int(var_0_213:int, ldc:int(2029555942))
        }
        else {
            if (cmpne:boolean(and:int(var_0_213:int, ldc:int(67108864)), ldc:int(0))) {
                var_0_213 = and:int(var_0_213:int, ldc:int(943101913))
                goto(Label_0228)
            }
            
            if (cmpeq:boolean(and:int(var_0_213:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0178)
            }
            
            if (cmpeq:boolean(and:int(var_0_213:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_213 = and:int(var_0_213:int, ldc:int(1772089662))
            expr_14D = arraylength:int(stack_14D_0:byte[])
            
            if (cmpne:boolean(expr_14D:int, ldc:int(0))) {
                var_3_3A9 = newarray:byte[](byte.class, expr_14D:int)
                var_5_3AA = expr_14D:int
                
                loop {
                    var_0_213 = and:int(var_0_213:int, ldc:int(1639923703))
                    var_5_3AA = add:int(var_5_3AA:int, ldc:int(-1))
                    storeelement:byte(var_3_3A9:byte[], var_5_3AA:int, xor:byte(loadelement:byte(stack_3BA_0:byte[], var_5_3AA:int), ldc:byte(3)))
                    
                    if (cmpne:boolean(var_5_3AA:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_AD_0 = stack_AB_0 = stack_DD_0 = stack_DF_0 = stack_10F_0 = stack_111_0 = stack_14B_0 = stack_14D_0 = stack_184_0 = stack_22C_0 = stack_287_0 = stack_315_0 = stack_365_0 = stack_3BA_0 = var_3_3A9:byte[]
            }
        }
        
        Label_0338:
        
        if (cmpeq:boolean(and:int(var_0_213:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_213 = and:int(var_0_213:int, ldc:int(1026078316))
            goto(Label_0280)
        }
        
        if (cmpeq:boolean(and:int(var_0_213:int, ldc:int(2)), ldc:int(0))) {
            goto(Label_0228)
        }
        
        if (cmpeq:boolean(and:int(var_0_213:int, ldc:int(131072)), ldc:int(0))) {
            var_0_213 = and:int(var_0_213:int, ldc:int(1727936420))
            goto(Label_0178)
        }
        
        if (cmpne:boolean(and:int(var_0_213:int, ldc:int(131072)), ldc:int(0))) {
            var_3_190 = initobject:String(String::<init>, stack_184_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1F9_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(192), ldc:int(195)))
            expr_1A2 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(17179), ldc:int(3139)))
            storeelement:String(expr_1A2:String[], and:int(ldc:int(6800), ldc:int(-6801)), invokevirtual:String[expected:String](String::substring, var_3_190:String, and:int(ldc:int(31170), ldc:int(-32236)), and:int(ldc:int(55), ldc:int(30868))))
            storeelement:String(expr_1A2:String[], xor:int(ldc:int(-31216), ldc:int(-31215)), invokevirtual:String[expected:String](String::substring, var_3_190:String, xor:int(ldc:int(17429), ldc:int(17409)), xor:int(ldc:int(353), ldc:int(324))))
            storeelement:String(expr_1A2:String[], and:int(ldc:int(16410), ldc:int(231)), invokevirtual:String[expected:String](String::substring, var_3_190:String, xor:int(ldc:int(17433), ldc:int(17468)), xor:int(ldc:int(16412), ldc:int(16429))))
            putstatic:String[](\ub171\u64f2\u6c56\ufcaf\u56bd::\u8308\u3e2a\ub6ab\ubefe\u4492\u71ae, expr_1A2:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u71f1\ud7e8\u8389\u34df\u385b\uc3e3(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_642 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_64D : int
        
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
        var_3_642 = and:int(ldc:int(1055808564), ldc:int(231895549))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub171\u64f2\u6c56\ufcaf\u56bd[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_642:int, ldc:int(4)), ldc:int(0))) {
            var_3_642 = and:int(var_3_642:int, ldc:int(1456099126))
            var_5_7D = and:int(ldc:int(-4451), ldc:int(4450))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-3057), ldc:int(3056)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_642:int, ldc:int(1509877621))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(3075), ldc:int(4881)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(-29664), ldc:int(-29663)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_642 = and:int(var_3_CA:int, ldc:int(1373587196))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(4224), ldc:int(4225)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(16)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(1840514258))
                        goto(Label_1487)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(4)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-520949771))
                        goto(Label_1320)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-1846935563))
                        goto(Label_1183)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1064)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(128)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(469771448))
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0783)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0649)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(16)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(167287231))
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-1357378854))
                    }
                    else {
                        var_3_642 = and:int(var_3_642:int, ldc:int(938210485))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0783)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1487)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(64)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-575386015))
                        goto(Label_1320)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1183)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1064)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-983293393))
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-1400110458))
                        goto(Label_0783)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0649)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(64)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(768495294))
                            var_11_DB = and:int(ldc:int(30822), ldc:int(-31592))
                            goto(Label_1476)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0541:
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1487)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(2)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(72347836))
                        goto(Label_1320)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1183)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-1004745499))
                        goto(Label_1064)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0783)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(-1690466468))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_642 = and:int(var_3_642:int, ldc:int(164096821))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0783)
                        }
                    }
                    
                    Label_0649:
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(128)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-163272657))
                        goto(Label_1487)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1320)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1183)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(16)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(380690104))
                        goto(Label_1064)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(32)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(1529984299))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-123196815))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(32)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(-2101816076))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_642:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_642:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_642 = and:int(var_3_642:int, ldc:int(-1278774340))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0783:
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(2)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(1057506570))
                        goto(Label_1487)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(512)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(664901796))
                        goto(Label_1320)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(704531816))
                        goto(Label_1183)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1064)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(-1223213750))
                            goto(Label_0649)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_642:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(-640083185))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_642:int, ldc:int(64)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(-602340140))
                            loopcontinue()
                        }
                        
                        var_3_642 = and:int(var_3_642:int, ldc:int(1791970548))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = and:int(ldc:int(18655), ldc:int(801))
                                goto(Label_1064)
                            }
                        }
                    }
                    
                    Label_0921:
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1487)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1320)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(1604449570))
                        goto(Label_1183)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_642:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(-1712426982))
                            goto(Label_0783)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_642:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0649)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_642:int, ldc:int(128)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(-1666243595))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_642:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_642 = and:int(var_3_642:int, ldc:int(-2033463363))
                        var_11_DB = and:int(ldc:int(-3612), ldc:int(3603))
                    }
                    
                    Label_1064:
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(1207909768))
                        goto(Label_1487)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1320)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0921)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0783)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(32)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(-1954667562))
                            goto(Label_0649)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(-2081857077))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(32)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(-1848311950))
                            loopcontinue()
                        }
                        
                        var_3_642 = and:int(var_3_642:int, ldc:int(-1160296516))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1320)
                            }
                        }
                    }
                    
                    Label_1183:
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-2055541261))
                        goto(Label_1487)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-447440311))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_1064)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(673589116))
                            goto(Label_0921)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0783)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_642:int, ldc:int(2)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(2083178606))
                            goto(Label_0649)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_642:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_642:int, ldc:int(2)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(1118284565))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_642:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(-134755532))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1476)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1320:
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(912530582))
                        goto(Label_1487)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1183)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(490529477))
                        goto(Label_1064)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-948734624))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(593555495))
                        goto(Label_0783)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(16)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-1569776917))
                        goto(Label_0649)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(128)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-142444370))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-975531653))
                        loopcontinue()
                    }
                    
                    var_3_642 = and:int(var_3_642:int, ldc:int(-1846379593))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1476:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_64D = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1487:
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1320)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1183)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1064)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(4)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-594286641))
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-1499317535))
                        goto(Label_0783)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-1491917445))
                        goto(Label_0649)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(32)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(824813955))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(64)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-219261571))
                        var_17_64D = add:int(var_16_109:int, xor:int(ldc:int(-18432), ldc:int(-18431)))
                        looporswitchbreak()
                    }
                    
                    var_3_642 = and:int(var_3_642:int, ldc:int(1032319710))
                }
                
                var_3_642 = and:int(var_3_642:int, ldc:int(-186385482))
                
                if (cmple:boolean(var_5_7D = var_17_64D:int, sub:int(var_6_84:int, xor:int(ldc:int(57), ldc:int(56))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(2)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
