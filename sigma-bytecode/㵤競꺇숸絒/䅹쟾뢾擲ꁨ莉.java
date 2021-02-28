public class \u3d64\u7af6\uae87\uc238\u7d52.\u4179\uc7fe\ub8be\u64f2\ua068\u8389 {
    public void \u4179\uc7fe\ub8be\u64f2\ua068\u8389(java.nio.ByteBuffer p0, javax.sound.sampled.AudioFormat p1) {
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
            invokespecial:Object(Object::<init>, this:\u4179\uc7fe\ub8be\u64f2\ua068\u8389)
            putfield:ByteBuffer(\u4179\uc7fe\ub8be\u64f2\ua068\u8389::\u4cd9\ub32d\uff55\u5654\u9937\ubded, this:\u4179\uc7fe\ub8be\u64f2\ua068\u8389, p0:ByteBuffer)
            putfield:AudioFormat(\u4179\uc7fe\ub8be\u64f2\ua068\u8389::\uae87\u8cae\u6c56\uff55\uc2e8\u8d90, this:\u4179\uc7fe\ub8be\u64f2\ua068\u8389, p1:AudioFormat)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.OptionalInt \ubb2b\u6d99\ub102\ub171\uf9c5\ub70c() {
        var_1_5F : int
        var_1_91 : int
        var_3_99 : int
        var_4_A3 : int[]
        var_1_BF : int
        
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
        var_1_5F = and:int(ldc:int(986841699), ldc:int(861150817))
        
        if (logicalnot:boolean(getfield:boolean(\u4179\uc7fe\ub8be\u64f2\ua068\u8389::\u9a18\u9255\ub171\ub70c\u4ab3\u4f52, this:\u4179\uc7fe\ub8be\u64f2\ua068\u8389))) {
            if (cmpne:boolean(getfield:ByteBuffer(\u4179\uc7fe\ub8be\u64f2\ua068\u8389::\u4cd9\ub32d\uff55\u5654\u9937\ubded, this:\u4179\uc7fe\ub8be\u64f2\ua068\u8389), aconstnull:ByteBuffer())) {
                goto(Label_0134)
            }
            
            return:OptionalInt(invokestatic:OptionalInt(OptionalInt::empty))
        }
        
        Label_0103:
        
        if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(64)), ldc:int(0))) {
            return:OptionalInt(invokestatic:OptionalInt(OptionalInt::of, getfield:int(\u4179\uc7fe\ub8be\u64f2\ua068\u8389::\u4d85\u93a2\ud4fe\u8258\u3bc9\u4daf, this:\u4179\uc7fe\ub8be\u64f2\ua068\u8389)))
        }
        
        Label_0134:
        
        if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(1048576)), ldc:int(0))) {
            goto(Label_0103)
        }
        
        var_1_91 = and:int(var_1_5F:int, ldc:int(751987047))
        var_3_99 = invokestatic:int(\u446c\u8308\u4c2b\ucb79\u4bc8\u8258::\ud523\u3bc9\u64ab\u5d20\u5245\uc84e, getfield:AudioFormat(\u4179\uc7fe\ub8be\u64f2\ua068\u8389::\uae87\u8cae\u6c56\uff55\uc2e8\u8d90, this:\u4179\uc7fe\ub8be\u64f2\ua068\u8389))
        var_4_A3 = newarray:int[](int.class, and:int(ldc:int(129), ldc:int(10353)))
        invokestatic:void(AL10::alGenBuffers, var_4_A3:int[])
        
        if (invokestatic:boolean(\u446c\u8308\u4c2b\ucb79\u4bc8\u8258::\u927d\ub171\u516c\u0c95\u98a4\uc229, loadelement:String(getstatic:String[](\u4179\uc7fe\ub8be\u64f2\ua068\u8389::\u9a18\u97e6\u0800\u2dcc\ud4fe\u4f52), and:int(ldc:int(-16552), ldc:int(16550))))) {
            return:OptionalInt(invokestatic:OptionalInt(OptionalInt::empty))
        }
        
        var_1_BF = and:int(var_1_91:int, ldc:int(-1502361504))
        invokestatic:void(AL10::alBufferData, loadelement:int(var_4_A3:int[], and:int(ldc:int(19497), ldc:int(-19562))), var_3_99:int, getfield:ByteBuffer(\u4179\uc7fe\ub8be\u64f2\ua068\u8389::\u4cd9\ub32d\uff55\u5654\u9937\ubded, this:\u4179\uc7fe\ub8be\u64f2\ua068\u8389), f2i:int(invokevirtual:float(AudioFormat::getSampleRate, getfield:AudioFormat(\u4179\uc7fe\ub8be\u64f2\ua068\u8389::\uae87\u8cae\u6c56\uff55\uc2e8\u8d90, this:\u4179\uc7fe\ub8be\u64f2\ua068\u8389))))
        
        if (logicalnot:boolean(invokestatic:boolean(\u446c\u8308\u4c2b\ucb79\u4bc8\u8258::\u927d\ub171\u516c\u0c95\u98a4\uc229, loadelement:String(getstatic:String[](\u4179\uc7fe\ub8be\u64f2\ua068\u8389::\u9a18\u97e6\u0800\u2dcc\ud4fe\u4f52), and:int(ldc:int(1283), ldc:int(22549)))))) {
            var_1_5F = and:int(var_1_BF:int, ldc:int(1725066860))
            putfield:int(\u4179\uc7fe\ub8be\u64f2\ua068\u8389::\u4d85\u93a2\ud4fe\u8258\u3bc9\u4daf, this:\u4179\uc7fe\ub8be\u64f2\ua068\u8389, loadelement:int(var_4_A3:int[], and:int(ldc:int(-23400), ldc:int(6469))))
            putfield:boolean(\u4179\uc7fe\ub8be\u64f2\ua068\u8389::\u9a18\u9255\ub171\ub70c\u4ab3\u4f52, this:\u4179\uc7fe\ub8be\u64f2\ua068\u8389, and:int[expected:boolean](ldc:int(10323), ldc:int(20513)))
            putfield:ByteBuffer(\u4179\uc7fe\ub8be\u64f2\ua068\u8389::\u4cd9\ub32d\uff55\u5654\u9937\ubded, this:\u4179\uc7fe\ub8be\u64f2\ua068\u8389, aconstnull:ByteBuffer())
            goto(Label_0103)
        }
        
        return:OptionalInt(invokestatic:OptionalInt(OptionalInt::empty))
    }
    
    public void \u839e\u6198\u4975\u40a9\u6198\u8bb0() {
        expr_83 : int[] [generated]
        
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
            
            if (getfield:boolean(\u4179\uc7fe\ub8be\u64f2\ua068\u8389::\u9a18\u9255\ub171\ub70c\u4ab3\u4f52, this:\u4179\uc7fe\ub8be\u64f2\ua068\u8389)) {
                expr_83 = newarray:int[](int.class, xor:int(ldc:int(5648), ldc:int(5649)))
                storeelement:int(expr_83:int[], and:int(ldc:int(-5064), ldc:int(4998)), getfield:int(\u4179\uc7fe\ub8be\u64f2\ua068\u8389::\u4d85\u93a2\ud4fe\u8258\u3bc9\u4daf, this:\u4179\uc7fe\ub8be\u64f2\ua068\u8389))
                invokestatic:void(AL10::alDeleteBuffers, expr_83:int[])
                
                if (invokestatic:boolean(\u446c\u8308\u4c2b\ucb79\u4bc8\u8258::\u927d\ub171\u516c\u0c95\u98a4\uc229, loadelement:String(getstatic:String[](\u4179\uc7fe\ub8be\u64f2\ua068\u8389::\u9a18\u97e6\u0800\u2dcc\ud4fe\u4f52), and:int(ldc:int(99), ldc:int(130))))) {
                    return:void()
                }
            }
            
            putfield:boolean(\u4179\uc7fe\ub8be\u64f2\ua068\u8389::\u9a18\u9255\ub171\ub70c\u4ab3\u4f52, this:\u4179\uc7fe\ub8be\u64f2\ua068\u8389, and:int[expected:boolean](ldc:int(2724), ldc:int(-2725)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.OptionalInt \ufe34\ua61f\u92ff\ud7e8\u7ce1\u516c() {
        var_3_64 : OptionalInt
        
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
            var_3_64 = invokevirtual:OptionalInt(\u4179\uc7fe\ub8be\u64f2\ua068\u8389::\ubb2b\u6d99\ub102\ub171\uf9c5\ub70c, this:\u4179\uc7fe\ub8be\u64f2\ua068\u8389)
            putfield:boolean(\u4179\uc7fe\ub8be\u64f2\ua068\u8389::\u9a18\u9255\ub171\ub70c\u4ab3\u4f52, this:\u4179\uc7fe\ub8be\u64f2\ua068\u8389, and:int[expected:boolean](ldc:int(-5194), ldc:int(5193)))
            return:OptionalInt(var_3_64:OptionalInt)
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1A5 : int
        expr_6B : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_C7_0 : byte[] [generated]
        stack_C9_0 : byte[] [generated]
        stack_F2_0 : byte[] [generated]
        stack_F4_0 : byte[] [generated]
        stack_116_0 : byte[] [generated]
        stack_1BE_0 : byte[] [generated]
        stack_211_0 : byte[] [generated]
        stack_29F_0 : byte[] [generated]
        stack_2F2_0 : byte[] [generated]
        var_4_192 : int
        var_3_197 : byte[]
        var_5_198 : int
        var_0_229 : int
        expr_211 : byte [generated]
        stack_255_2 : byte [generated]
        stack_22C_0 : byte [generated]
        expr_29F : byte [generated]
        expr_9E : int [generated]
        expr_C9 : int [generated]
        var_2_F2 : byte[]
        expr_F6 : int [generated]
        var_3_2E1 : byte[]
        var_5_2E2 : int
        var_3_122 : String
        stack_18B_0 : String[] [generated]
        expr_134 : String[] [generated]
        
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
        var_0_1A5 = and:int(ldc:int(84525670), ldc:int(1200476781))
        expr_6B = arraylength:int(stack_9C_0 = stack_9E_0 = stack_C7_0 = stack_C9_0 = stack_F2_0 = stack_F4_0 = stack_116_0 = stack_1BE_0 = stack_211_0 = stack_29F_0 = stack_2F2_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("PdtU0kPVp6ulMSx5KlDT2DkvWK8oJlxTcdCoq6UxLEko0VxRvtzdwtLRKq+xLnWrqVkvAixZY8jISN6O")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_192 = expr_6B:int
        var_3_197 = newarray:byte[](byte.class, expr_6B:int)
        var_5_198 = expr_6B:int
        Label_0410:
        
        while (cmpeq:boolean(and:int(var_0_1A5:int, ldc:int(8388608)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_1A5:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_0493)
            }
            
            var_0_1A5 = and:int(var_0_1A5:int, ldc:int(1468002292))
            var_5_198 = add:int(var_5_198:int, ldc:int(-1))
            storeelement:byte(var_3_197:byte[], var_5_198:int, xor:byte(loadelement:byte(stack_1BE_0:byte[], var_5_198:int), ldc:byte(81)))
            
            if (cmpne:boolean(var_5_198:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C7_0 = stack_C9_0 = stack_F2_0 = stack_F4_0 = stack_116_0 = stack_1BE_0 = stack_211_0 = stack_29F_0 = stack_2F2_0 = var_3_197:byte[]
            goto(Label_0112)
        }
        
        var_0_1A5 = and:int(var_0_1A5:int, ldc:int(1818868950))
        goto(Label_0635)
        Label_0493:
        
        while (cmpeq:boolean(and:int(var_0_1A5:int, ldc:int(2048)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_1A5:int, ldc:int(8192)), ldc:int(0))) {
                var_0_1A5 = and:int(var_0_1A5:int, ldc:int(2039154504))
                goto(Label_0410)
            }
            
            var_0_229 = and:int(var_0_1A5:int, ldc:int(860871285))
            var_5_198 = add:int(var_5_198:int, ldc:int(-1))
            expr_211 = stack_255_2 = loadelement(stack_211_0, var_5_198)
            
            if (cmplt:boolean(add:int(add:int(var_5_198:int, ldc:int(5)), neg:int(var_4_192:int)), ldc:int(0))) {
                stack_255_2 = stack_22C_0 = add:byte(expr_211:byte, loadelement:byte(var_3_197:byte[], add:int(var_5_198:int, ldc:int(5))))
                goto(Label_0572)
            }
            
            Label_0542:
            
            if (cmpeq:boolean(and:int(var_0_229:int, ldc:int(131072)), ldc:int(0))) {
                var_0_229 = and:int(var_0_229:int, ldc:int(1328402158))
                stack_255_2 = stack_22C_0 = add:byte(expr_211:byte, ldc:byte(5))
            }
            
            Label_0572:
            
            if (cmpeq:boolean(and:int(var_0_229:int, ldc:int(16777216)), ldc:int(0))) {
                var_0_229 = and:int(var_0_229:int, ldc:int(1191621207))
                goto(Label_0542)
            }
            
            var_0_1A5 = and:int(var_0_229:int, ldc:int(-1455438171))
            storeelement:byte(var_3_197:byte[], var_5_198:int, stack_255_2:byte)
            
            if (cmpne:boolean(var_5_198:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C7_0 = stack_C9_0 = stack_F2_0 = stack_F4_0 = stack_116_0 = stack_1BE_0 = stack_211_0 = stack_29F_0 = stack_2F2_0 = var_3_197:byte[]
            goto(Label_0163)
        }
        
        Label_0635:
        
        while (cmpne:boolean(and:int(var_0_1A5:int, ldc:int(32768)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1A5:int, ldc:int(16777216)), ldc:int(0))) {
                var_0_1A5 = and:int(var_0_1A5:int, ldc:int(317887119))
                goto(Label_0410)
            }
            
            var_0_1A5 = and:int(var_0_1A5:int, ldc:int(60677927))
            var_5_198 = add:int(var_5_198:int, ldc:int(-1))
            expr_29F = loadelement:byte(stack_29F_0:byte[], var_5_198:int)
            storeelement:byte(var_3_197:byte[], var_5_198:int, add:int(or:int(and:int(shl:int(expr_29F:byte, and:int(ldc:int(863), ldc:int(4100))), ldc:int(-16)), and:int(shr:int(expr_29F:byte[expected:int], xor:int(ldc:int(-32759), ldc:int(-32755))), ldc:int(15))), ldc:int(74)))
            
            if (cmpne:boolean(var_5_198:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C7_0 = stack_C9_0 = stack_F2_0 = stack_F4_0 = stack_116_0 = stack_1BE_0 = stack_211_0 = stack_29F_0 = stack_2F2_0 = var_3_197:byte[]
            goto(Label_0206)
        }
        
        goto(Label_0493)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_1A5:int, ldc:int(8192)), ldc:int(0))) {
            goto(Label_0251)
        }
        
        if (cmpne:boolean(and:int(var_0_1A5:int, ldc:int(8)), ldc:int(0))) {
            var_0_1A5 = and:int(var_0_1A5:int, ldc:int(-270921580))
            goto(Label_0206)
        }
        
        if (cmpne:boolean(and:int(var_0_1A5:int, ldc:int(8)), ldc:int(0))) {
            var_0_1A5 = and:int(var_0_1A5:int, ldc:int(-1816682113))
        }
        else {
            var_0_1A5 = and:int(var_0_1A5:int, ldc:int(1057998845))
            expr_9E = arraylength:int(stack_9E_0:byte[])
            
            if (cmpne:boolean(expr_9E:int, ldc:int(0))) {
                var_4_192 = expr_9E:int
                var_3_197 = newarray:byte[](byte.class, expr_9E:int)
                var_5_198 = expr_9E:int
                goto(Label_0493)
            }
        }
        
        Label_0163:
        
        if (cmpeq:boolean(and:int(var_0_1A5:int, ldc:int(524288)), ldc:int(0))) {
            goto(Label_0251)
        }
        
        if (cmpeq:boolean(and:int(var_0_1A5:int, ldc:int(32)), ldc:int(0))) {
            var_0_1A5 = and:int(var_0_1A5:int, ldc:int(93053353))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_1A5:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_1A5 = and:int(var_0_1A5:int, ldc:int(-44302531))
            expr_C9 = arraylength:int(stack_C9_0:byte[])
            
            if (cmpne:boolean(expr_C9:int, ldc:int(0))) {
                var_4_192 = expr_C9:int
                var_3_197 = newarray:byte[](byte.class, expr_C9:int)
                var_5_198 = expr_C9:int
                goto(Label_0635)
            }
        }
        
        Label_0206:
        
        if (cmpne:boolean(and:int(var_0_1A5:int, ldc:int(524288)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1A5:int, ldc:int(4)), ldc:int(0))) {
                var_0_1A5 = and:int(var_0_1A5:int, ldc:int(616952021))
                goto(Label_0163)
            }
            
            if (cmpeq:boolean(and:int(var_0_1A5:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_1A5 = and:int(var_0_1A5:int, ldc:int(693093990))
            var_2_F2 = stack_F2_0:byte[]
            expr_F6 = add:int(arraylength:int(stack_F4_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_F6:int, ldc:int(0))) {
                var_3_2E1 = newarray:byte[](byte.class, expr_F6:int)
                var_5_2E2 = expr_F6:int
                
                loop {
                    var_0_1A5 = and:int(var_0_1A5:int, ldc:int(1641802293))
                    var_5_2E2 = add:int(var_5_2E2:int, ldc:int(-1))
                    storeelement:byte(var_3_2E1:byte[], var_5_2E2:int, add:int(shl:int(loadelement:byte(stack_2F2_0:byte[], var_5_2E2:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_F2:byte[], add:int(var_5_2E2:int, and:int(ldc:int(1), ldc:int(49)))), ldc:int(3)), and:int(ldc:int(2239), ldc:int(21087)))))
                    
                    if (cmpne:boolean(var_5_2E2:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_C7_0 = stack_C9_0 = stack_F2_0 = stack_F4_0 = stack_116_0 = stack_1BE_0 = stack_211_0 = stack_29F_0 = stack_2F2_0 = var_3_2E1:byte[]
            }
        }
        
        Label_0251:
        
        if (cmpeq:boolean(and:int(var_0_1A5:int, ldc:int(512)), ldc:int(0))) {
            goto(Label_0206)
        }
        
        if (cmpeq:boolean(and:int(var_0_1A5:int, ldc:int(524288)), ldc:int(0))) {
            goto(Label_0163)
        }
        
        if (cmpne:boolean(and:int(var_0_1A5:int, ldc:int(65536)), ldc:int(0))) {
            var_3_122 = initobject:String(String::<init>, stack_116_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_18B_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(204), ldc:int(207)))
            expr_134 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(8323), ldc:int(22639)))
            storeelement:String(expr_134:String[], and:int(ldc:int(16425), ldc:int(10497)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(10524), ldc:int(-14783)), and:int(ldc:int(17237), ldc:int(10429))))
            storeelement:String(expr_134:String[], and:int(ldc:int(4565), ldc:int(-4568)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(4189), ldc:int(2583)), xor:int(ldc:int(4388), ldc:int(4352))))
            storeelement:String(expr_134:String[], xor:int(ldc:int(8356), ldc:int(8358)), invokevirtual:String[expected:String](String::substring, var_3_122:String, xor:int(ldc:int(3413), ldc:int(3441)), and:int(ldc:int(8443), ldc:int(4667))))
            putstatic:String[](\u4179\uc7fe\ub8be\u64f2\ua068\u8389::\u9a18\u97e6\u0800\u2dcc\ud4fe\u4f52, expr_134:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u183a\u836c\u647c\u624e\u7af6\ub102(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_645 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_650 : int
        
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
        var_3_645 = and:int(ldc:int(1143321036), ldc:int(-544475649))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4179\uc7fe\ub8be\u64f2\ua068\u8389[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_645 = and:int(var_3_645:int, ldc:int(2129009481))
            var_5_7D = and:int(ldc:int(-15946), ldc:int(15945))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(8399), ldc:int(-8400)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_645:int, ldc:int(-282437041))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(18305), ldc:int(2049)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(9729), ldc:int(4107)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_645 = and:int(var_3_D2:int, ldc:int(1441881839))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(6155), ldc:int(25393)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1472)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1330)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1097755360))
                        goto(Label_1202)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1086)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(2127204390))
                        goto(Label_0925)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(609973179))
                        goto(Label_0817)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(64)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1771607896))
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(64)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1961810109))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1191316172))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0817)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1472)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1133440049))
                        goto(Label_1330)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1086)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1262111970))
                        goto(Label_0925)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(1)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1398508384))
                        goto(Label_0817)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(64)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-135879845))
                            var_11_E3 = and:int(ldc:int(-21286), ldc:int(21025))
                            goto(Label_1461)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0541:
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1472)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-716297318))
                        goto(Label_1330)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(1)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1692440479))
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-2104723747))
                        goto(Label_1086)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(119324124))
                        goto(Label_0925)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(791438136))
                        goto(Label_0817)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(512)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(290221898))
                            loopcontinue()
                        }
                        
                        var_3_645 = and:int(var_3_645:int, ldc:int(1435920459))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0817)
                        }
                    }
                    
                    Label_0676:
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(318332597))
                        goto(Label_1472)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1330)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1385599354))
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1086)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0925)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1032982586))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(1422201430))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(512)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(1582823968))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(2)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(1035164087))
                            loopcontinue()
                        }
                        
                        var_3_645 = and:int(var_3_645:int, ldc:int(-856736689))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0817:
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1472)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1330)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1770924690))
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1086)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(512)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(448315190))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-1359844384))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_645 = and:int(var_3_645:int, ldc:int(1728986239))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(-32250), ldc:int(-32249))
                                goto(Label_1086)
                            }
                        }
                    }
                    
                    Label_0925:
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(512)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(151119423))
                        goto(Label_1472)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(2)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1234497696))
                        goto(Label_1330)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(64)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(772613235))
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(194496817))
                            goto(Label_0817)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(16)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(1156669013))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_645 = and:int(var_3_645:int, ldc:int(-679026737))
                        var_11_E3 = and:int(ldc:int(-15377), ldc:int(15376))
                    }
                    
                    Label_1086:
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(1)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(317374111))
                        goto(Label_1472)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1330)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0925)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-499710994))
                            goto(Label_0817)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(1590899986))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-1303877297))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_645 = and:int(var_3_645:int, ldc:int(-175791156))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1330)
                            }
                        }
                    }
                    
                    Label_1202:
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1472)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(125368981))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_1086)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(16)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-1645052825))
                            goto(Label_0925)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(110595014))
                            goto(Label_0817)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-1004307883))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(8)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(1275138286))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1461)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1330:
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1472)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(64)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-383302970))
                        goto(Label_1086)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1540688712))
                        goto(Label_0925)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0817)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(2130319030))
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(16)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1638253955))
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(64)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_645 = and:int(var_3_645:int, ldc:int(2140533358))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1461:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_650 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1472:
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(749976278))
                        goto(Label_1330)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(2)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1647794373))
                        goto(Label_1202)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(416491319))
                        goto(Label_1086)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1594929259))
                        goto(Label_0925)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0817)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(16)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(121281088))
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(16)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1835144843))
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(64)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-850249764))
                        var_17_650 = add:int(var_16_111:int, and:int(ldc:int(17763), ldc:int(2581)))
                        looporswitchbreak()
                    }
                    
                    var_3_645 = and:int(var_3_645:int, ldc:int(-269184668))
                }
                
                var_3_645 = and:int(var_3_645:int, ldc:int(-187578246))
                
                if (cmple:boolean(var_5_7D = var_17_650:int, sub:int(var_6_84:int, xor:int(ldc:int(-16375), ldc:int(-16376))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(64)), ldc:int(0))) {
            var_3_645 = and:int(var_3_645:int, ldc:int(607183339))
            goto(Label_0106)
        }
    }
}
