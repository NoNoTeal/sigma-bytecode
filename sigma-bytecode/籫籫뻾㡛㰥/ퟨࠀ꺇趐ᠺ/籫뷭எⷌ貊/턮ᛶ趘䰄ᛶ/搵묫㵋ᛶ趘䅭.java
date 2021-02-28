public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u6435\ubb2b\u3d4b\u16f6\u8d98\u416d<L, R> {
    private void \u6435\ubb2b\u3d4b\u16f6\u8d98\u416d(java.util.Optional<L> p0, java.util.Optional<R> p1) {
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
        invokespecial:Object(Object::<init>, this:\u6435\ubb2b\u3d4b\u16f6\u8d98\u416d<L, R>)
        putfield:Optional<L>(\u6435\ubb2b\u3d4b\u16f6\u8d98\u416d::\u52d3\u960f\u760c\u92ee\u965f\u12cb, this:\u6435\ubb2b\u3d4b\u16f6\u8d98\u416d<L, R>, p0:Optional<L>)
        putfield:Optional<R>(\u6435\ubb2b\u3d4b\u16f6\u8d98\u416d::\u6c56\u4bc8\u97b7\u4c04\uc29a\u3c25, this:\u6435\ubb2b\u3d4b\u16f6\u8d98\u416d<L, R>, p1:Optional<R>)
        
        if (logicalnot:boolean(logicalor:boolean(invokevirtual:boolean(Optional<T>::isPresent, getfield:Optional<L>(\u6435\ubb2b\u3d4b\u16f6\u8d98\u416d::\u52d3\u960f\u760c\u92ee\u965f\u12cb, this:\u6435\ubb2b\u3d4b\u16f6\u8d98\u416d<L, R>)), invokevirtual:boolean(Optional<T>::isPresent, getfield:Optional<R>(\u6435\ubb2b\u3d4b\u16f6\u8d98\u416d::\u6c56\u4bc8\u97b7\u4c04\uc29a\u3c25, this:\u6435\ubb2b\u3d4b\u16f6\u8d98\u416d<L, R>))))) {
            athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\u6435\ubb2b\u3d4b\u16f6\u8d98\u416d::\ua3b4\u965f\u4e72\u51fa\u97e6\ud12e), and:int(ldc:int(29746), ldc:int(-29876)))))
        }
        
        if (logicaland:boolean(invokevirtual:boolean(Optional<T>::isPresent, getfield:Optional<L>(\u6435\ubb2b\u3d4b\u16f6\u8d98\u416d::\u52d3\u960f\u760c\u92ee\u965f\u12cb, this:\u6435\ubb2b\u3d4b\u16f6\u8d98\u416d<L, R>)), invokevirtual:boolean(Optional<T>::isPresent, getfield:Optional<R>(\u6435\ubb2b\u3d4b\u16f6\u8d98\u416d::\u6c56\u4bc8\u97b7\u4c04\uc29a\u3c25, this:\u6435\ubb2b\u3d4b\u16f6\u8d98\u416d<L, R>)))) {
            athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\u6435\ubb2b\u3d4b\u16f6\u8d98\u416d::\ua3b4\u965f\u4e72\u51fa\u97e6\ud12e), xor:int(ldc:int(897), ldc:int(896)))))
        }
    }
    
    public java.util.Optional<L> \u416d\u47c2\u3504\u8d98\u8389\ub70c() {
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
            return:Optional<L>(getfield:Optional<L>(\u6435\ubb2b\u3d4b\u16f6\u8d98\u416d::\u52d3\u960f\u760c\u92ee\u965f\u12cb, this:\u6435\ubb2b\u3d4b\u16f6\u8d98\u416d<L, R>))
        }
        
        goto(Label_0006)
    }
    
    public java.util.Optional<R> \u385b\u3504\u7c6b\u3dd3\u6bb9\u4d85() {
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
            return:Optional<R>(getfield:Optional<R>(\u6435\ubb2b\u3d4b\u16f6\u8d98\u416d::\u6c56\u4bc8\u97b7\u4c04\uc29a\u3c25, this:\u6435\ubb2b\u3d4b\u16f6\u8d98\u416d<L, R>))
        }
        
        goto(Label_0006)
    }
    
    public static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u6435\ubb2b\u3d4b\u16f6\u8d98\u416d<L, R> \u40a9\u5fe1\u72f1\u946b\u624e\ub8be(L p0) {
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
            return:\u6435\ubb2b\u3d4b\u16f6\u8d98\u416d<L, R>(initobject:\u6435\ubb2b\u3d4b\u16f6\u8d98\u416d<L, R>(\u6435\ubb2b\u3d4b\u16f6\u8d98\u416d<L, R>::<init>, invokestatic:Optional<L>(Optional<T>::of, p0:L), invokestatic:Optional<R>(Optional<T>::empty)))
        }
        
        goto(Label_0006)
    }
    
    public static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u6435\ubb2b\u3d4b\u16f6\u8d98\u416d \ua562\u97b7\ub18d\u7006\uc84e\u600f(R p0) {
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
            return:\u6435\ubb2b\u3d4b\u16f6\u8d98\u416d(initobject:\u6435\ubb2b\u3d4b\u16f6\u8d98\u416d(\u6435\ubb2b\u3d4b\u16f6\u8d98\u416d<L, R>::<init>, invokestatic:Optional<L>(Optional<T>::empty), invokestatic:Optional<R>(Optional<T>::of, p0:R)))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_249 : int
        expr_65 : byte[] [generated]
        var_2_69 : byte[]
        stack_9E_0 : byte[] [generated]
        stack_A0_0 : byte[] [generated]
        stack_D1_0 : byte[] [generated]
        stack_D3_0 : byte[] [generated]
        stack_104_0 : byte[] [generated]
        stack_106_0 : byte[] [generated]
        stack_126_0 : byte[] [generated]
        stack_1F6_0 : byte[] [generated]
        stack_25B_0 : byte[] [generated]
        stack_2CB_0 : byte[] [generated]
        expr_6D : int [generated]
        var_3_189 : byte[]
        var_4_18A : int
        expr_A0 : int [generated]
        var_5_1D9 : int
        var_3_1DE : byte[]
        var_4_1DF : int
        expr_1F6 : byte [generated]
        var_0_251 : int
        expr_25B : byte [generated]
        stack_297_2 : byte [generated]
        stack_276_0 : byte [generated]
        expr_D3 : int [generated]
        expr_106 : int [generated]
        var_3_2BA : byte[]
        var_4_2BB : int
        var_3_132 : String
        stack_180_0 : String[] [generated]
        expr_144 : String[] [generated]
        
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
            var_0_249 = and:int(ldc:int(-1411704332), ldc:int(-2363045))
            expr_65 = var_2_69 = stack_9E_0 = stack_A0_0 = stack_D1_0 = stack_D3_0 = stack_104_0 = stack_106_0 = stack_126_0 = stack_1F6_0 = stack_25B_0 = stack_2CB_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("JyOz57x+X4/v77Nbu4z3ipeXc++j4Ctvtzsz+EAcK2tXx3/nI7PnvH5fj+/vs1u7jPeKl5dz76tvr7hAHCtMB+OIAA=="))
            expr_6D = add:int(arraylength:int(expr_65:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_6D:int, ldc:int(0))) {
                var_3_189 = newarray:byte[](byte.class, expr_6D:int)
                var_4_18A = expr_6D:int
                
                loop {
                    var_0_249 = and:int(var_0_249:int, ldc:int(-103083401))
                    var_4_18A = add:int(var_4_18A:int, ldc:int(-1))
                    storeelement:byte(var_3_189:byte[], var_4_18A:int, add:int(shl:int(loadelement:byte(expr_65:byte[], var_4_18A:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_69:byte[], add:int(var_4_18A:int, and:int(ldc:int(81), ldc:int(39)))), ldc:int(6)), xor:int(ldc:int(-28410), ldc:int(-28411)))))
                    
                    if (cmpne:boolean(var_4_18A:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A0_0 = stack_9E_0 = stack_D1_0 = stack_D3_0 = stack_104_0 = stack_106_0 = stack_126_0 = stack_1F6_0 = stack_25B_0 = stack_2CB_0 = var_3_189:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_249:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_0267)
                }
                
                if (cmpeq:boolean(and:int(var_0_249:int, ldc:int(16)), ldc:int(0))) {
                    var_0_249 = and:int(var_0_249:int, ldc:int(1138045117))
                    goto(Label_0216)
                }
                
                if (cmpne:boolean(and:int(var_0_249:int, ldc:int(2097152)), ldc:int(0))) {
                    var_0_249 = and:int(var_0_249:int, ldc:int(409956130))
                    goto(Label_0165)
                }
                
                var_0_249 = and:int(var_0_249:int, ldc:int(-1378165424))
                expr_A0 = arraylength:int(stack_A0_0:byte[])
                
                if (cmpeq:boolean(expr_A0:int, ldc:int(0))) {
                    goto(Label_0165)
                }
                
                var_5_1D9 = expr_A0:int
                var_3_1DE = newarray:byte[](byte.class, expr_A0:int)
                var_4_1DF = expr_A0:int
                Label_0481:
                
                while (cmpne:boolean(and:int(var_0_249:int, ldc:int(131072)), ldc:int(0))) {
                    var_0_249 = and:int(var_0_249:int, ldc:int(-1151706286))
                    var_4_1DF = add:int(var_4_1DF:int, ldc:int(-1))
                    expr_1F6 = loadelement:byte(stack_1F6_0:byte[], var_4_1DF:int)
                    storeelement:byte(var_3_1DE:byte[], var_4_1DF:int, add:int(or:int(and:int(shl:int(expr_1F6:byte, xor:int(ldc:int(4101), ldc:int(4097))), ldc:int(-16)), and:int(shr:int(expr_1F6:byte[expected:int], and:int(ldc:int(20743), ldc:int(8268))), ldc:int(15))), ldc:int(21)))
                    
                    if (cmpne:boolean(var_4_1DF:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A0_0 = stack_9E_0 = stack_D1_0 = stack_D3_0 = stack_104_0 = stack_106_0 = stack_126_0 = stack_1F6_0 = stack_25B_0 = stack_2CB_0 = var_3_1DE:byte[]
                    goto(Label_0165)
                }
                
                Label_0574:
                
                while (cmpeq:boolean(and:int(var_0_249:int, ldc:int(2)), ldc:int(0))) {
                    var_0_251 = and:int(var_0_249:int, ldc:int(-33664423))
                    var_4_1DF = add:int(var_4_1DF:int, ldc:int(-1))
                    expr_25B = stack_297_2 = loadelement(stack_25B_0, var_4_1DF)
                    
                    if (cmplt:boolean(add:int(add:int(var_4_1DF:int, ldc:int(4)), neg:int(var_5_1D9:int)), ldc:int(0))) {
                        stack_297_2 = stack_276_0 = add:byte(expr_25B:byte, loadelement:byte(var_3_1DE:byte[], add:int(var_4_1DF:int, ldc:int(4))))
                        goto(Label_0646)
                    }
                    
                    Label_0616:
                    
                    if (cmpne:boolean(and:int(var_0_251:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_0_251 = and:int(var_0_251:int, ldc:int(-77857833))
                        stack_297_2 = stack_276_0 = add:byte(expr_25B:byte, ldc:byte(4))
                    }
                    
                    Label_0646:
                    
                    if (cmpne:boolean(and:int(var_0_251:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0616)
                    }
                    
                    var_0_249 = and:int(var_0_251:int, ldc:int(-1084302602))
                    storeelement:byte(var_3_1DE:byte[], var_4_1DF:int, stack_297_2:byte)
                    
                    if (cmpne:boolean(var_4_1DF:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A0_0 = stack_9E_0 = stack_D1_0 = stack_D3_0 = stack_104_0 = stack_106_0 = stack_126_0 = stack_1F6_0 = stack_25B_0 = stack_2CB_0 = var_3_1DE:byte[]
                    goto(Label_0216)
                }
                
                var_0_249 = and:int(var_0_249:int, ldc:int(693384609))
                goto(Label_0481)
                Label_0165:
                
                if (cmpeq:boolean(and:int(var_0_249:int, ldc:int(64)), ldc:int(0))) {
                    var_0_249 = and:int(var_0_249:int, ldc:int(-1451221875))
                    goto(Label_0267)
                }
                
                if (cmpne:boolean(and:int(var_0_249:int, ldc:int(64)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_0_249:int, ldc:int(134217728)), ldc:int(0))) {
                        var_0_249 = and:int(var_0_249:int, ldc:int(935620220))
                        loopcontinue()
                    }
                    
                    var_0_249 = and:int(var_0_249:int, ldc:int(-1073793805))
                    expr_D3 = arraylength:int(stack_D3_0:byte[])
                    
                    if (cmpne:boolean(expr_D3:int, ldc:int(0))) {
                        var_5_1D9 = expr_D3:int
                        var_3_1DE = newarray:byte[](byte.class, expr_D3:int)
                        var_4_1DF = expr_D3:int
                        goto(Label_0574)
                    }
                }
                
                Label_0216:
                
                if (cmpeq:boolean(and:int(var_0_249:int, ldc:int(1048576)), ldc:int(0))) {
                    var_0_249 = and:int(var_0_249:int, ldc:int(230951170))
                }
                else {
                    if (cmpne:boolean(and:int(var_0_249:int, ldc:int(512)), ldc:int(0))) {
                        var_0_249 = and:int(var_0_249:int, ldc:int(493249992))
                        goto(Label_0165)
                    }
                    
                    if (cmpeq:boolean(and:int(var_0_249:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_249 = and:int(var_0_249:int, ldc:int(-67413930))
                    expr_106 = arraylength:int(stack_106_0:byte[])
                    
                    if (cmpne:boolean(expr_106:int, ldc:int(0))) {
                        var_3_2BA = newarray:byte[](byte.class, expr_106:int)
                        var_4_2BB = expr_106:int
                        
                        loop {
                            var_0_249 = and:int(var_0_249:int, ldc:int(-1344302601))
                            var_4_2BB = add:int(var_4_2BB:int, ldc:int(-1))
                            storeelement:byte(var_3_2BA:byte[], var_4_2BB:int, xor:byte(loadelement:byte(stack_2CB_0:byte[], var_4_2BB:int), ldc:byte(111)))
                            
                            if (cmpne:boolean(var_4_2BB:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_A0_0 = stack_9E_0 = stack_D1_0 = stack_D3_0 = stack_104_0 = stack_106_0 = stack_126_0 = stack_1F6_0 = stack_25B_0 = stack_2CB_0 = var_3_2BA:byte[]
                    }
                }
                
                Label_0267:
                
                if (cmpeq:boolean(and:int(var_0_249:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0216)
                }
                
                if (cmpne:boolean(and:int(var_0_249:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_0165)
                }
                
                if (cmpeq:boolean(and:int(var_0_249:int, ldc:int(1024)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_132 = initobject:String(String::<init>, stack_126_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_180_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(8198), ldc:int(16411)))
            expr_144 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(194), ldc:int(8202)))
            storeelement:String(expr_144:String[], and:int(ldc:int(31396), ldc:int(-32743)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(-20182), ldc:int(20053)), and:int(ldc:int(4339), ldc:int(8999))))
            storeelement:String(expr_144:String[], xor:int(ldc:int(1824), ldc:int(1825)), invokevirtual:String[expected:String](String::substring, var_3_132:String, xor:int(ldc:int(4691), ldc:int(4720)), and:int(ldc:int(20566), ldc:int(2379))))
            putstatic:String[](\u6435\ubb2b\u3d4b\u16f6\u8d98\u416d::\ua3b4\u965f\u4e72\u51fa\u97e6\ud12e, expr_144:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4f52\ufcaf\ud171\u965f\u8bb0\uc4d2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5EF : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_5FA : int
        
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
        var_3_5EF = and:int(ldc:int(200702304), ldc:int(-320504892))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6435\ubb2b\u3d4b\u16f6\u8d98\u416d<L, R>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(8192)), ldc:int(0))) {
            var_3_5EF = and:int(var_3_5EF:int, ldc:int(150086856))
        }
        else {
            var_3_5EF = and:int(var_3_5EF:int, ldc:int(-1124898236))
            var_5_85 = and:int(ldc:int(-10997), ldc:int(10948))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-28734), ldc:int(28701)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_5EF:int, ldc:int(-16941880))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(16645), ldc:int(1)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(40), ldc:int(41)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_5EF = and:int(var_3_DA:int, ldc:int(-34947861))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(16705), ldc:int(7297)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5EF:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1406)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1140)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EF:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1015)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0857)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EF:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5EF = and:int(var_3_5EF:int, ldc:int(-147271646))
                        goto(Label_0525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5EF = and:int(var_3_5EF:int, ldc:int(1780541795))
                    }
                    else {
                        var_3_5EF = and:int(var_3_5EF:int, ldc:int(-319227658))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0525)
                            }
                            
                            goto(Label_0738)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpne:boolean(and:int(var_3_5EF:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1406)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EF:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1140)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1015)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5EF = and:int(var_3_5EF:int, ldc:int(1190944670))
                        goto(Label_0857)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5EF = and:int(var_3_5EF:int, ldc:int(964055874))
                        goto(Label_0738)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EF:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EF:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5EF = and:int(var_3_5EF:int, ldc:int(-693917769))
                            loopcontinue()
                        }
                        
                        var_3_5EF = and:int(var_3_5EF:int, ldc:int(-856478716))
                        var_11_EB = and:int(ldc:int(-17635), ldc:int(17634))
                        goto(Label_1395)
                    }
                    
                    Label_0525:
                    
                    if (cmpne:boolean(and:int(var_3_5EF:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1406)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5EF = and:int(var_3_5EF:int, ldc:int(259813406))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5EF = and:int(var_3_5EF:int, ldc:int(-323327520))
                        goto(Label_1140)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EF:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5EF = and:int(var_3_5EF:int, ldc:int(-639538398))
                        goto(Label_1015)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5EF = and:int(var_3_5EF:int, ldc:int(-1396436504))
                        goto(Label_0857)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EF:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EF:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5EF = and:int(var_3_5EF:int, ldc:int(-1485072558))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5EF:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5EF = and:int(var_3_5EF:int, ldc:int(-268797367))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0738)
                        }
                    }
                    
                    Label_0644:
                    
                    if (cmpne:boolean(and:int(var_3_5EF:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1406)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1140)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1015)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0857)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EF:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5EF = and:int(var_3_5EF:int, ldc:int(1667817535))
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5EF = and:int(var_3_5EF:int, ldc:int(217737562))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0738:
                    
                    if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5EF = and:int(var_3_5EF:int, ldc:int(-34028284))
                        goto(Label_1406)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5EF = and:int(var_3_5EF:int, ldc:int(1399918639))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EF:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1140)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EF:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1015)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EF:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5EF = and:int(var_3_5EF:int, ldc:int(-2123583053))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5EF:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5EF = and:int(var_3_5EF:int, ldc:int(-1739353404))
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EF:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5EF = and:int(var_3_5EF:int, ldc:int(-1689230292))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5EF = and:int(var_3_5EF:int, ldc:int(-1640290))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = and:int(ldc:int(20481), ldc:int(2113))
                                goto(Label_1015)
                            }
                        }
                    }
                    
                    Label_0857:
                    
                    if (cmpne:boolean(and:int(var_3_5EF:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5EF = and:int(var_3_5EF:int, ldc:int(665382214))
                        goto(Label_1406)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EF:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5EF = and:int(var_3_5EF:int, ldc:int(-194770815))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1140)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EF:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5EF = and:int(var_3_5EF:int, ldc:int(708900898))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5EF:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0738)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5EF = and:int(var_3_5EF:int, ldc:int(142789564))
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EF:int, ldc:int(512)), ldc:int(0))) {
                            var_3_5EF = and:int(var_3_5EF:int, ldc:int(-448880044))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5EF = and:int(var_3_5EF:int, ldc:int(-872551285))
                        var_11_EB = and:int(ldc:int(-17461), ldc:int(17460))
                    }
                    
                    Label_1015:
                    
                    if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5EF = and:int(var_3_5EF:int, ldc:int(1833851))
                        goto(Label_1406)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5EF = and:int(var_3_5EF:int, ldc:int(810830402))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5EF = and:int(var_3_5EF:int, ldc:int(268787983))
                            goto(Label_0857)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EF:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0738)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5EF = and:int(var_3_5EF:int, ldc:int(-1718390900))
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EF:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_5EF = and:int(var_3_5EF:int, ldc:int(683341431))
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EF:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5EF = and:int(var_3_5EF:int, ldc:int(-35029208))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1276)
                            }
                        }
                    }
                    
                    Label_1140:
                    
                    if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5EF = and:int(var_3_5EF:int, ldc:int(-1430247923))
                        goto(Label_1406)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EF:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5EF = and:int(var_3_5EF:int, ldc:int(-2102130838))
                            goto(Label_1015)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EF:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5EF = and:int(var_3_5EF:int, ldc:int(-1604519471))
                            goto(Label_0857)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0738)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EF:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5EF = and:int(var_3_5EF:int, ldc:int(436108878))
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5EF = and:int(var_3_5EF:int, ldc:int(2031918546))
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_5EF = and:int(var_3_5EF:int, ldc:int(1811119501))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1395)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1276:
                    
                    if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1406)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1140)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5EF = and:int(var_3_5EF:int, ldc:int(-653450563))
                        goto(Label_1015)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0857)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5EF = and:int(var_3_5EF:int, ldc:int(-25512637))
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EF:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EF:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EF:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5EF = and:int(var_3_5EF:int, ldc:int(-2010025172))
                        loopcontinue()
                    }
                    
                    var_3_5EF = and:int(var_3_5EF:int, ldc:int(-1963643169))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1395:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5FA = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1406:
                    
                    if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EF:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1140)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5EF = and:int(var_3_5EF:int, ldc:int(-1738334010))
                        goto(Label_1015)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EF:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5EF = and:int(var_3_5EF:int, ldc:int(1126458362))
                        goto(Label_0857)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5EF = and:int(var_3_5EF:int, ldc:int(525586319))
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5EF = and:int(var_3_5EF:int, ldc:int(1130314073))
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EF:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5EF = and:int(var_3_5EF:int, ldc:int(-268730535))
                        var_17_5FA = add:int(var_16_119:int, xor:int(ldc:int(16448), ldc:int(16449)))
                        looporswitchbreak()
                    }
                    
                    var_3_5EF = and:int(var_3_5EF:int, ldc:int(-262149974))
                }
                
                var_3_5EF = and:int(var_3_5EF:int, ldc:int(-1628164869))
                
                if (cmple:boolean(var_5_85 = var_17_5FA:int, sub:int(var_6_8C:int, and:int(ldc:int(1029), ldc:int(14595))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_5EF:int, ldc:int(2048)), ldc:int(0))) {
            var_3_5EF = and:int(var_3_5EF:int, ldc:int(44546186))
            goto(Label_0106)
        }
    }
}
