public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u7873\u6bb9\u071d\u718f\u8cae {
    public void \u7873\u6bb9\u071d\u718f\u8cae() {
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
            invokespecial:Object(Object::<init>, this:\u7873\u6bb9\u071d\u718f\u8cae)
            putfield:\uae5d\u6b5f\u40a9\u3d4b\u4c2b(\u7873\u6bb9\u071d\u718f\u8cae::\ua61f\u183a\u6c52\uf9c5\u4cd9\u4d85, this:\u7873\u6bb9\u071d\u718f\u8cae, getstatic:\uae5d\u6b5f\u40a9\u3d4b\u4c2b(\uae5d\u6b5f\u40a9\u3d4b\u4c2b::\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a))
            putfield:\u7006\u3a62\u6d99\u183a\uc229(\u7873\u6bb9\u071d\u718f\u8cae::\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, this:\u7873\u6bb9\u071d\u718f\u8cae, initobject:\u7006\u3a62\u6d99\u183a\uc229(\u7006\u3a62\u6d99\u183a\uc229::<init>))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Object clone() {
        var_1_5F : int
        stack_6E_0 : Object [generated]
        var_3_73 : CloneNotSupportedException
        
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
        var_1_5F = and:int(ldc:int(1596196852), ldc:int(-79796397))
        
        try {
            var_1_5F = and:int(var_1_5F:int, ldc:int(1601089360))
            stack_6E_0 = invokespecial:Object(Object::clone, this:\u7873\u6bb9\u071d\u718f\u8cae[expected:Object])
            var_1_5F = and:int(var_1_5F:int, ldc:int(2146829625))
            return:Object(stack_6E_0:Object)
        }
        catch (java.lang.CloneNotSupportedException var_3_73) {
            athrow(initobject:InternalError(InternalError::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), this:\u7873\u6bb9\u071d\u718f\u8cae[expected:Object]), loadelement:String(getstatic:String[](\u7873\u6bb9\u071d\u718f\u8cae::\u183a\u7043\u51fa\u8cae\u0a06\u156b), and:int(ldc:int(1331), ldc:int(-1332)))), var_3_73:CloneNotSupportedException[expected:Object]))))
        }
    }
    
    public void \u8c8a\u527a\u927d\u4179\u5f50\uff55(\u5d20\u97b7\u8753\u873d\u16f6.\uae5d\u6b5f\u40a9\u3d4b\u4c2b p0) {
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
        
        if (cmpne:boolean(p0:\uae5d\u6b5f\u40a9\u3d4b\u4c2b, aconstnull:\uae5d\u6b5f\u40a9\u3d4b\u4c2b())) {
            putfield:\uae5d\u6b5f\u40a9\u3d4b\u4c2b(\u7873\u6bb9\u071d\u718f\u8cae::\ua61f\u183a\u6c52\uf9c5\u4cd9\u4d85, this:\u7873\u6bb9\u071d\u718f\u8cae, p0:\uae5d\u6b5f\u40a9\u3d4b\u4c2b)
            return:void()
        }
        
        athrow(initobject:NullPointerException(NullPointerException::<init>, loadelement:String(getstatic:String[](\u7873\u6bb9\u071d\u718f\u8cae::\u183a\u7043\u51fa\u8cae\u0a06\u156b), xor:int(ldc:int(534), ldc:int(535)))))
    }
    
    public \u5d20\u97b7\u8753\u873d\u16f6.\uae5d\u6b5f\u40a9\u3d4b\u4c2b \u8709\u5140\ub113\u3bd6\u5f50\u8640() {
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
            return:\uae5d\u6b5f\u40a9\u3d4b\u4c2b(getfield:\uae5d\u6b5f\u40a9\u3d4b\u4c2b(\u7873\u6bb9\u071d\u718f\u8cae::\ua61f\u183a\u6c52\uf9c5\u4cd9\u4d85, this:\u7873\u6bb9\u071d\u718f\u8cae))
        }
        
        goto(Label_0006)
    }
    
    public \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u7006\u3a62\u6d99\u183a\uc229 \u67e9\u3504\uf995\u62da\u516c\u76bc() {
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
            return:\u7006\u3a62\u6d99\u183a\uc229(getfield:\u7006\u3a62\u6d99\u183a\uc229(\u7873\u6bb9\u071d\u718f\u8cae::\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, this:\u7873\u6bb9\u071d\u718f\u8cae))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_227 : int
        expr_6B : int [generated]
        stack_A3_0 : byte[] [generated]
        stack_A5_0 : byte[] [generated]
        stack_EF_0 : byte[] [generated]
        stack_F1_0 : byte[] [generated]
        stack_131_0 : byte[] [generated]
        stack_133_0 : byte[] [generated]
        stack_173_0 : byte[] [generated]
        stack_175_0 : byte[] [generated]
        stack_1AC_0 : byte[] [generated]
        stack_239_0 : byte[] [generated]
        stack_273_0 : byte[] [generated]
        stack_2E6_0 : byte[] [generated]
        stack_347_0 : byte[] [generated]
        stack_3B7_0 : byte[] [generated]
        var_4_20D : int
        var_3_212 : byte[]
        var_5_213 : int
        expr_2E6 : byte [generated]
        var_0_33D : int
        expr_347 : byte [generated]
        stack_383_2 : byte [generated]
        stack_362_0 : byte [generated]
        var_2_A3 : byte[]
        expr_A7 : int [generated]
        var_3_262 : byte[]
        var_5_263 : int
        expr_F1 : int [generated]
        expr_133 : int [generated]
        expr_175 : int [generated]
        var_3_3A6 : byte[]
        var_5_3A7 : int
        var_3_1B8 : String
        stack_206_0 : String[] [generated]
        expr_1CA : String[] [generated]
        
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
        var_0_227 = and:int(ldc:int(83579047), ldc:int(-1897171729))
        expr_6B = arraylength:int(stack_A3_0 = stack_A5_0 = stack_EF_0 = stack_F1_0 = stack_131_0 = stack_133_0 = stack_173_0 = stack_175_0 = stack_1AC_0 = stack_239_0 = stack_273_0 = stack_2E6_0 = stack_347_0 = stack_3B7_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("QaUVSlPT")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_20D = expr_6B:int
        var_3_212 = newarray:byte[](byte.class, expr_6B:int)
        var_5_213 = expr_6B:int
        Label_0533:
        
        while (cmpne:boolean(and:int(var_0_227:int, ldc:int(1)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_227:int, ldc:int(32)), ldc:int(0))) {
                var_0_227 = and:int(var_0_227:int, ldc:int(179030600))
                goto(Label_0698)
            }
            
            var_0_227 = and:int(var_0_227:int, ldc:int(-51971907))
            var_5_213 = add:int(var_5_213:int, ldc:int(-1))
            storeelement:byte(var_3_212:byte[], var_5_213:int, xor:byte(loadelement:byte(stack_239_0:byte[], var_5_213:int), ldc:byte(67)))
            
            if (cmpne:boolean(var_5_213:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_EF_0 = stack_F1_0 = stack_131_0 = stack_133_0 = stack_173_0 = stack_175_0 = stack_1AC_0 = stack_239_0 = stack_273_0 = stack_2E6_0 = stack_347_0 = stack_3B7_0 = var_3_212:byte[]
            goto(Label_0112)
        }
        
        goto(Label_0811)
        Label_0698:
        
        while (cmpne:boolean(and:int(var_0_227:int, ldc:int(4)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_227:int, ldc:int(1)), ldc:int(0))) {
                var_0_227 = and:int(var_0_227:int, ldc:int(-978278980))
                goto(Label_0533)
            }
            
            var_0_227 = and:int(var_0_227:int, ldc:int(1710686005))
            var_5_213 = add:int(var_5_213:int, ldc:int(-1))
            expr_2E6 = loadelement:byte(stack_2E6_0:byte[], var_5_213:int)
            storeelement:byte(var_3_212:byte[], var_5_213:int, or:int(and:int(shl:int(expr_2E6:byte, and:int(ldc:int(4868), ldc:int(3220))), ldc:int(-16)), and:int(shr:int(expr_2E6:byte[expected:int], and:int(ldc:int(260), ldc:int(23558))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_213:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_EF_0 = stack_F1_0 = stack_131_0 = stack_133_0 = stack_173_0 = stack_175_0 = stack_1AC_0 = stack_239_0 = stack_273_0 = stack_2E6_0 = stack_347_0 = stack_3B7_0 = var_3_212:byte[]
            goto(Label_0246)
        }
        
        var_0_227 = and:int(var_0_227:int, ldc:int(-606379741))
        Label_0811:
        
        while (cmpne:boolean(and:int(var_0_227:int, ldc:int(67108864)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_227:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_0533)
            }
            
            var_0_33D = and:int(var_0_227:int, ldc:int(217028135))
            var_5_213 = add:int(var_5_213:int, ldc:int(-1))
            expr_347 = stack_383_2 = loadelement(stack_347_0, var_5_213)
            
            if (cmplt:boolean(add:int(add:int(var_5_213:int, ldc:int(3)), neg:int(var_4_20D:int)), ldc:int(0))) {
                stack_383_2 = stack_362_0 = add:byte(expr_347:byte, loadelement:byte(var_3_212:byte[], add:int(var_5_213:int, ldc:int(3))))
                goto(Label_0882)
            }
            
            Label_0852:
            
            if (cmpne:boolean(and:int(var_0_33D:int, ldc:int(2097152)), ldc:int(0))) {
                var_0_33D = and:int(var_0_33D:int, ldc:int(-319096979))
                stack_383_2 = stack_362_0 = add:byte(expr_347:byte, ldc:byte(3))
            }
            
            Label_0882:
            
            if (cmpeq:boolean(and:int(var_0_33D:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_0852)
            }
            
            var_0_227 = and:int(var_0_33D:int, ldc:int(1056873511))
            storeelement:byte(var_3_212:byte[], var_5_213:int, stack_383_2:byte)
            
            if (cmpne:boolean(var_5_213:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_EF_0 = stack_F1_0 = stack_131_0 = stack_133_0 = stack_173_0 = stack_175_0 = stack_1AC_0 = stack_239_0 = stack_273_0 = stack_2E6_0 = stack_347_0 = stack_3B7_0 = var_3_212:byte[]
            goto(Label_0312)
        }
        
        goto(Label_0698)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_227:int, ldc:int(2097152)), ldc:int(0))) {
            goto(Label_0378)
        }
        
        if (cmpeq:boolean(and:int(var_0_227:int, ldc:int(4194304)), ldc:int(0))) {
            goto(Label_0312)
        }
        
        if (cmpeq:boolean(and:int(var_0_227:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_227 = and:int(var_0_227:int, ldc:int(1530751174))
            goto(Label_0246)
        }
        
        if (cmpeq:boolean(and:int(var_0_227:int, ldc:int(4)), ldc:int(0))) {
            var_0_227 = and:int(var_0_227:int, ldc:int(-1094888496))
        }
        else {
            var_0_227 = and:int(var_0_227:int, ldc:int(1476293879))
            var_2_A3 = stack_A3_0:byte[]
            expr_A7 = add:int(arraylength:int(stack_A5_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A7:int, ldc:int(0))) {
                var_3_262 = newarray:byte[](byte.class, expr_A7:int)
                var_5_263 = expr_A7:int
                
                loop {
                    var_0_227 = and:int(var_0_227:int, ldc:int(-1226623001))
                    var_5_263 = add:int(var_5_263:int, ldc:int(-1))
                    storeelement:byte(var_3_262:byte[], var_5_263:int, add:int(shl:int(loadelement:byte(stack_273_0:byte[], var_5_263:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_A3:byte[], add:int(var_5_263:int, xor:int(ldc:int(-23551), ldc:int(-23552)))), ldc:int(3)), xor:int(ldc:int(16385), ldc:int(16414)))))
                    
                    if (cmpne:boolean(var_5_263:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A5_0 = stack_A3_0 = stack_EF_0 = stack_F1_0 = stack_131_0 = stack_133_0 = stack_173_0 = stack_175_0 = stack_1AC_0 = stack_239_0 = stack_273_0 = stack_2E6_0 = stack_347_0 = stack_3B7_0 = var_3_262:byte[]
            }
        }
        
        Label_0172:
        
        if (cmpeq:boolean(and:int(var_0_227:int, ldc:int(1)), ldc:int(0))) {
            var_0_227 = and:int(var_0_227:int, ldc:int(1582120742))
            goto(Label_0378)
        }
        
        if (cmpeq:boolean(and:int(var_0_227:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_227 = and:int(var_0_227:int, ldc:int(-613565305))
            goto(Label_0312)
        }
        
        if (cmpeq:boolean(and:int(var_0_227:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_227 = and:int(var_0_227:int, ldc:int(-1336331916))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_227:int, ldc:int(32)), ldc:int(0))) {
                var_0_227 = and:int(var_0_227:int, ldc:int(-1806388883))
                goto(Label_0112)
            }
            
            var_0_227 = and:int(var_0_227:int, ldc:int(-688933449))
            expr_F1 = arraylength:int(stack_F1_0:byte[])
            
            if (cmpne:boolean(expr_F1:int, ldc:int(0))) {
                var_4_20D = expr_F1:int
                var_3_212 = newarray:byte[](byte.class, expr_F1:int)
                var_5_213 = expr_F1:int
                goto(Label_0698)
            }
        }
        
        Label_0246:
        
        if (cmpeq:boolean(and:int(var_0_227:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_227 = and:int(var_0_227:int, ldc:int(-1864160556))
            goto(Label_0378)
        }
        
        if (cmpne:boolean(and:int(var_0_227:int, ldc:int(32)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_227:int, ldc:int(4)), ldc:int(0))) {
                var_0_227 = and:int(var_0_227:int, ldc:int(-457597392))
                goto(Label_0172)
            }
            
            if (cmpeq:boolean(and:int(var_0_227:int, ldc:int(67108864)), ldc:int(0))) {
                var_0_227 = and:int(var_0_227:int, ldc:int(-2075574348))
                goto(Label_0112)
            }
            
            var_0_227 = and:int(var_0_227:int, ldc:int(1878405991))
            expr_133 = arraylength:int(stack_133_0:byte[])
            
            if (cmpne:boolean(expr_133:int, ldc:int(0))) {
                var_4_20D = expr_133:int
                var_3_212 = newarray:byte[](byte.class, expr_133:int)
                var_5_213 = expr_133:int
                goto(Label_0811)
            }
        }
        
        Label_0312:
        
        if (cmpeq:boolean(and:int(var_0_227:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_227 = and:int(var_0_227:int, ldc:int(1763330613))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_227:int, ldc:int(67108864)), ldc:int(0))) {
                var_0_227 = and:int(var_0_227:int, ldc:int(2144183494))
                goto(Label_0246)
            }
            
            if (cmpeq:boolean(and:int(var_0_227:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_0172)
            }
            
            if (cmpeq:boolean(and:int(var_0_227:int, ldc:int(131072)), ldc:int(0))) {
                var_0_227 = and:int(var_0_227:int, ldc:int(-1933257960))
                goto(Label_0112)
            }
            
            var_0_227 = and:int(var_0_227:int, ldc:int(-1778945297))
            expr_175 = arraylength:int(stack_175_0:byte[])
            
            if (cmpne:boolean(expr_175:int, ldc:int(0))) {
                var_3_3A6 = newarray:byte[](byte.class, expr_175:int)
                var_5_3A7 = expr_175:int
                
                loop {
                    var_0_227 = and:int(var_0_227:int, ldc:int(1340292845))
                    var_5_3A7 = add:int(var_5_3A7:int, ldc:int(-1))
                    storeelement:byte(var_3_3A6:byte[], var_5_3A7:int, add:byte(loadelement:byte(stack_3B7_0:byte[], var_5_3A7:int), ldc:byte(80)))
                    
                    if (cmpne:boolean(var_5_3A7:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A5_0 = stack_A3_0 = stack_EF_0 = stack_F1_0 = stack_131_0 = stack_133_0 = stack_173_0 = stack_175_0 = stack_1AC_0 = stack_239_0 = stack_273_0 = stack_2E6_0 = stack_347_0 = stack_3B7_0 = var_3_3A6:byte[]
            }
        }
        
        Label_0378:
        
        if (cmpeq:boolean(and:int(var_0_227:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0312)
        }
        
        if (cmpeq:boolean(and:int(var_0_227:int, ldc:int(1)), ldc:int(0))) {
            var_0_227 = and:int(var_0_227:int, ldc:int(640328525))
            goto(Label_0246)
        }
        
        if (cmpeq:boolean(and:int(var_0_227:int, ldc:int(67108864)), ldc:int(0))) {
            goto(Label_0172)
        }
        
        if (cmpeq:boolean(and:int(var_0_227:int, ldc:int(4)), ldc:int(0))) {
            var_0_227 = and:int(var_0_227:int, ldc:int(-2003684205))
            goto(Label_0112)
        }
        
        var_3_1B8 = initobject:String(String::<init>, stack_1AC_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_206_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(16400), ldc:int(16402)))
        expr_1CA = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(578), ldc:int(17411)))
        storeelement:String(expr_1CA:String[], and:int(ldc:int(27160), ldc:int(-28475)), invokevirtual:String[expected:String](String::substring, var_3_1B8:String, and:int(ldc:int(-31445), ldc:int(21204)), xor:int(ldc:int(160), ldc:int(162))))
        storeelement:String(expr_1CA:String[], xor:int(ldc:int(-23296), ldc:int(-23295)), invokevirtual:String[expected:String](String::substring, var_3_1B8:String, and:int(ldc:int(4618), ldc:int(34)), xor:int(ldc:int(4162), ldc:int(4167))))
        putstatic:String[](\u7873\u6bb9\u071d\u718f\u8cae::\u183a\u7043\u51fa\u8cae\u0a06\u156b, expr_1CA:String[])
    }
    
    public void \u4f4a\u7bad\u9a18\u6c52\u760c\u9937(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_60D : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_618 : int
        
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
        var_3_60D = and:int(ldc:int(-811499269), ldc:int(-1897291331))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7873\u6bb9\u071d\u718f\u8cae[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_60D = and:int(var_3_60D:int, ldc:int(736260634))
        }
        else {
            var_3_60D = and:int(var_3_60D:int, ldc:int(-275581997))
            var_5_85 = and:int(ldc:int(18571), ldc:int(-18576))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-17742), ldc:int(17676)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_60D:int, ldc:int(-1211596133))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, xor:int(ldc:int(6164), ldc:int(6165)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(4033), ldc:int(8231)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_60D = and:int(var_3_DA:int, ldc:int(-806318663))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(6529), ldc:int(1091)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1285)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1158)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1272878857))
                        goto(Label_0898)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1030754338))
                        goto(Label_0782)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1857045170))
                        goto(Label_0650)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1736491155))
                    }
                    else {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(126985213))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0782)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1689714323))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1285)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1158)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-2076574056))
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0898)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0782)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0650)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(2113907516))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-961873929))
                            var_11_EB = and:int(ldc:int(20634), ldc:int(-29371))
                            goto(Label_1423)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0541:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1285)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(484159371))
                        goto(Label_1158)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1387318560))
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0898)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-2006603211))
                        goto(Label_0782)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1204790171))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0782)
                        }
                    }
                    
                    Label_0650:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-951888482))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1285)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1158)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1399246452))
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1297646870))
                        goto(Label_0898)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-2129398430))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1333255972))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1188158201))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0782:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1868819161))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1285)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1158)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(2147203974))
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(41596562))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0650)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(686840805))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(916645303))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(-32670), ldc:int(-32669))
                                goto(Label_1059)
                            }
                        }
                    }
                    
                    Label_0898:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1046705724))
                        goto(Label_1285)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(977395070))
                        goto(Label_1158)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-386819368))
                            goto(Label_0782)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0650)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(31326251))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-1659615791))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-542712579))
                        var_11_EB = and:int(ldc:int(5331), ldc:int(-24280))
                    }
                    
                    Label_1059:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1375838038))
                        goto(Label_1285)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0898)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0782)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0650)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1179105763))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-943915789))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1285)
                            }
                        }
                    }
                    
                    Label_1158:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1950820763))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1408001500))
                            goto(Label_1059)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0898)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0782)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0650)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1163628808))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(771375948))
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1346581797))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                        goto(Label_1423)
                    }
                    
                    Label_1285:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1920142071))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-634489174))
                        goto(Label_1158)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(5422603))
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-71404920))
                        goto(Label_0898)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1807234049))
                        goto(Label_0782)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0650)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(128)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_60D = and:int(var_3_60D:int, ldc:int(-271609679))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1423:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_618 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1434:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-2112023304))
                        goto(Label_1285)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1288118525))
                        goto(Label_1158)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0898)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0782)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0650)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-99453265))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(249553559))
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-138425103))
                        var_17_618 = add:int(var_16_119:int, and:int(ldc:int(9857), ldc:int(6409)))
                        looporswitchbreak()
                    }
                    
                    var_3_60D = and:int(var_3_60D:int, ldc:int(-1041023164))
                }
                
                var_3_60D = and:int(var_3_60D:int, ldc:int(2129563123))
                
                if (cmple:boolean(var_5_85 = var_17_618:int, sub:int(var_6_8C:int, and:int(ldc:int(6481), ldc:int(513))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_60D = and:int(var_3_60D:int, ldc:int(-2028918804))
            goto(Label_0106)
        }
    }
}
