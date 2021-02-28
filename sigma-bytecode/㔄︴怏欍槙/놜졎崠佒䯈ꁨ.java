public class \u3504\ufe34\u600f\u6b0d\u69d9.\ub19c\uc84e\u5d20\u4f52\u4bc8\ua068 {
    private void \ub19c\uc84e\u5d20\u4f52\u4bc8\ua068() {
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
            invokespecial:Object(Object::<init>, this:\ub19c\uc84e\u5d20\u4f52\u4bc8\ua068)
            athrow(initobject:IllegalStateException(IllegalStateException::<init>, loadelement:String(getstatic:String[](\ub19c\uc84e\u5d20\u4f52\u4bc8\ua068::\ucef1\u5fe1\u92ee\u4daf\u9937\u0800), and:int(ldc:int(18714), ldc:int(-18715)))))
        }
        
        goto(Label_0006)
    }
    
    public static boolean \ud4fe\u0a06\uc238\uafe7\u92ee\u965f(java.nio.ByteBuffer p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ub171\u8df4\ub70c\u7006\uc238\u3bc9 p1, java.nio.channels.ByteChannel p2) {
        var_3_9D : int
        var_5_6C : int
        stack_CB_0 : int [generated]
        
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
        var_3_9D = and:int(ldc:int(-2010052085), ldc:int(-1388759413))
        invokevirtual:Buffer(Buffer::clear, p0:ByteBuffer[expected:Buffer])
        var_5_6C = invokeinterface:int(ReadableByteChannel::read, p2:ByteChannel[expected:ReadableByteChannel], p0:ByteBuffer)
        invokevirtual:Buffer(Buffer::flip, p0:ByteBuffer[expected:Buffer])
        
        if (cmpne:boolean(var_5_6C:int, ldc:int(-1))) {
            loop {
                if (cmpeq:boolean(and:int(var_3_9D:int, ldc:int(536870912)), ldc:int(0))) {
                    var_3_9D = and:int(var_3_9D:int, ldc:int(-629460276))
                    
                    if (cmpne:boolean(var_5_6C:int, ldc:int(0))) {
                        stack_CB_0 = xor:int(ldc:int(1106), ldc:int(1107))
                        looporswitchbreak()
                    }
                }
                
                if (cmpne:boolean(and:int(var_3_9D:int, ldc:int(134217728)), ldc:int(0))) {
                    var_3_9D = and:int(var_3_9D:int, ldc:int(-17575038))
                    stack_CB_0 = and:int(ldc:int(5315), ldc:int(-7908))
                    looporswitchbreak()
                }
                
                var_3_9D = and:int(var_3_9D:int, ldc:int(2142937225))
            }
            
            return:boolean(stack_CB_0:int)
        }
        
        invokevirtual:void(\ub171\u8df4\ub70c\u7006\uc238\u3bc9::\ua562\u67d0\u97e6\u8d90\uf995\u3e2a, p1:\ub171\u8df4\ub70c\u7006\uc238\u3bc9)
        return:boolean(and:int[expected:boolean](ldc:int(-10744), ldc:int(10738)))
    }
    
    public static boolean \uc9f6\uc238\uc229\u0c95\u6cfe\u516c(java.nio.ByteBuffer p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ub171\u8df4\ub70c\u7006\uc238\u3bc9 p1, \u47c2\u2dcc\u12cb\ud171\u8c8a.\uafe7\u47c2\uff55\ub19c\uc9f6\u61a4 p2) {
        var_5_6C : int
        
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
        invokevirtual:Buffer(Buffer::clear, p0:ByteBuffer[expected:Buffer])
        var_5_6C = invokeinterface:int(\uafe7\u47c2\uff55\ub19c\uc9f6\u61a4::\u5140\ubf56\u3bd6\u8bb0\ud4fe\u64ab, p2:\uafe7\u47c2\uff55\ub19c\uc9f6\u61a4, p0:ByteBuffer)
        invokevirtual:Buffer(Buffer::flip, p0:ByteBuffer[expected:Buffer])
        
        if (cmpne:boolean(var_5_6C:int, ldc:int(-1))) {
            return:boolean(invokeinterface:boolean(\uafe7\u47c2\uff55\ub19c\uc9f6\u61a4::\uc229\u3bd6\u97b7\ud171\ucb79\uf9c5, p2:\uafe7\u47c2\uff55\ub19c\uc9f6\u61a4))
        }
        
        invokevirtual:void(\ub171\u8df4\ub70c\u7006\uc238\u3bc9::\ua562\u67d0\u97e6\u8d90\uf995\u3e2a, p1:\ub171\u8df4\ub70c\u7006\uc238\u3bc9)
        return:boolean(and:int[expected:boolean](ldc:int(20890), ldc:int(-22940)))
    }
    
    public static boolean \u759a\u3776\ud51e\uc2bd\ud51e\u3711(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ub171\u8df4\ub70c\u7006\uc238\u3bc9 p0, java.nio.channels.ByteChannel p1) {
        var_4_75 : ByteBuffer
        var_5_78 : \uafe7\u47c2\uff55\ub19c\uc9f6\u61a4
        
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
        
        if (cmpne:boolean(p0:\ub171\u8df4\ub70c\u7006\uc238\u3bc9, aconstnull:\ub171\u8df4\ub70c\u7006\uc238\u3bc9())) {
            var_4_75 = checkcast:ByteBuffer(java.nio.ByteBuffer.class, invokeinterface:ByteBuffer(Queue<ByteBuffer>::peek, getfield:BlockingQueue<ByteBuffer>[expected:Queue<ByteBuffer>](\ub171\u8df4\ub70c\u7006\uc238\u3bc9::\ud171\uae5d\u12cb\u5f50\u4cd9\u7006, p0:\ub171\u8df4\ub70c\u7006\uc238\u3bc9)))
            var_5_78 = aconstnull:\uafe7\u47c2\uff55\ub19c\uc9f6\u61a4()
            
            if (cmpne:boolean(var_4_75:ByteBuffer, aconstnull:ByteBuffer())) {
                loop {
                    invokeinterface:int(WritableByteChannel::write, p1:ByteChannel[expected:WritableByteChannel], var_4_75:ByteBuffer)
                    
                    if (cmpgt:boolean(invokevirtual:int(Buffer::remaining, var_4_75:ByteBuffer[expected:Buffer]), ldc:int(0))) {
                        return:boolean(and:int[expected:boolean](ldc:int(29288), ldc:int(-31337)))
                    }
                    
                    invokeinterface:Object(Queue<Object>::poll, getfield:BlockingQueue<ByteBuffer>[expected:Queue<Object>](\ub171\u8df4\ub70c\u7006\uc238\u3bc9::\ud171\uae5d\u12cb\u5f50\u4cd9\u7006, p0:\ub171\u8df4\ub70c\u7006\uc238\u3bc9))
                    var_4_75 = checkcast:ByteBuffer(java.nio.ByteBuffer.class, invokeinterface:ByteBuffer(Queue<ByteBuffer>::peek, getfield:BlockingQueue<ByteBuffer>[expected:Queue<ByteBuffer>](\ub171\u8df4\ub70c\u7006\uc238\u3bc9::\ud171\uae5d\u12cb\u5f50\u4cd9\u7006, p0:\ub171\u8df4\ub70c\u7006\uc238\u3bc9)))
                    
                    if (cmpne:boolean(var_4_75:ByteBuffer, aconstnull:ByteBuffer())) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
            }
            else {
                if (instanceof:boolean(\u47c2\u2dcc\u12cb\ud171\u8c8a.\uafe7\u47c2\uff55\ub19c\uc9f6\u61a4.class, p1:ByteChannel)) {
                    var_5_78 = checkcast:\uafe7\u47c2\uff55\ub19c\uc9f6\u61a4(\u47c2\u2dcc\u12cb\ud171\u8c8a.\uafe7\u47c2\uff55\ub19c\uc9f6\u61a4.class, p1:ByteChannel[expected:\uafe7\u47c2\uff55\ub19c\uc9f6\u61a4])
                    
                    if (invokeinterface:boolean(\uafe7\u47c2\uff55\ub19c\uc9f6\u61a4::\ub102\ubcb0\u99f7\ubb2b\u4c2b\u6b0d, var_5_78:\uafe7\u47c2\uff55\ub19c\uc9f6\u61a4)) {
                        invokeinterface:void(\uafe7\u47c2\uff55\ub19c\uc9f6\u61a4::\ub18d\u7049\u99f7\u6bb9\uf94d\ub32d, var_5_78:\uafe7\u47c2\uff55\ub19c\uc9f6\u61a4)
                    }
                }
            }
            
            if (invokeinterface:boolean(Collection<E>::isEmpty, getfield:BlockingQueue<ByteBuffer>[expected:Collection<ByteBuffer>](\ub171\u8df4\ub70c\u7006\uc238\u3bc9::\ud171\uae5d\u12cb\u5f50\u4cd9\u7006, p0:\ub171\u8df4\ub70c\u7006\uc238\u3bc9))) {
                if (invokevirtual:boolean(\ub171\u8df4\ub70c\u7006\uc238\u3bc9::\u8389\u92ff\ud7e8\u7bad\u1187\u2dcc, p0:\ub171\u8df4\ub70c\u7006\uc238\u3bc9)) {
                    if (cmpne:boolean(invokevirtual:\u7d52\u51fa\u88c5\u52d3\u7873\ub6ab(\ub171\u8df4\ub70c\u7006\uc238\u3bc9::\u40a9\u4d85\uc31c\ua6bd\ud171\u4f52, p0:\ub171\u8df4\ub70c\u7006\uc238\u3bc9), aconstnull:\u7d52\u51fa\u88c5\u52d3\u7873\ub6ab())) {
                        if (cmpne:boolean(invokevirtual:\u6ec6\uc9f6\u8aa5\ub70c\ub8be\ubcb0(\u7d52\u51fa\u88c5\u52d3\u7873\ub6ab::\u9255\uafe7\u7af6\u76bc\u624e\u624e, invokevirtual:\u7d52\u51fa\u88c5\u52d3\u7873\ub6ab(\ub171\u8df4\ub70c\u7006\uc238\u3bc9::\u40a9\u4d85\uc31c\ua6bd\ud171\u4f52, p0:\ub171\u8df4\ub70c\u7006\uc238\u3bc9)), aconstnull:\u6ec6\uc9f6\u8aa5\ub70c\ub8be\ubcb0())) {
                            if (cmpeq:boolean(invokevirtual:\u6ec6\uc9f6\u8aa5\ub70c\ub8be\ubcb0(\u7d52\u51fa\u88c5\u52d3\u7873\ub6ab::\u9255\uafe7\u7af6\u76bc\u624e\u624e, invokevirtual:\u7d52\u51fa\u88c5\u52d3\u7873\ub6ab(\ub171\u8df4\ub70c\u7006\uc238\u3bc9::\u40a9\u4d85\uc31c\ua6bd\ud171\u4f52, p0:\ub171\u8df4\ub70c\u7006\uc238\u3bc9)), getstatic:\u6ec6\uc9f6\u8aa5\ub70c\ub8be\ubcb0(\u6ec6\uc9f6\u8aa5\ub70c\ub8be\ubcb0::\u52d3\ud4fe\ud4fe\u67d0\u494c\ucfaf))) {
                                invokevirtual:void(\ub171\u8df4\ub70c\u7006\uc238\u3bc9::\u960f\u59ec\u16f6\u51b2\u8df4\u3d64, p0:\ub171\u8df4\ub70c\u7006\uc238\u3bc9)
                            }
                        }
                    }
                }
            }
            
            return:boolean(ternaryop:int(logicaland:boolean(cmpne:boolean(var_5_78:\uafe7\u47c2\uff55\ub19c\uc9f6\u61a4, aconstnull:\uafe7\u47c2\uff55\ub19c\uc9f6\u61a4()), invokeinterface:boolean(\uafe7\u47c2\uff55\ub19c\uc9f6\u61a4::\ub102\ubcb0\u99f7\ubb2b\u4c2b\u6b0d, checkcast:\uafe7\u47c2\uff55\ub19c\uc9f6\u61a4(\u47c2\u2dcc\u12cb\ud171\u8c8a.\uafe7\u47c2\uff55\ub19c\uc9f6\u61a4.class, p1:ByteChannel[expected:\uafe7\u47c2\uff55\ub19c\uc9f6\u61a4]))), and:int(ldc:int(-13037), ldc:int(13028)), and:int(ldc:int(17313), ldc:int(10323))))
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(4737), ldc:int(-4738)))
    }
    
    static {
        var_0_187 : int
        expr_6B : int [generated]
        stack_A4_0 : byte[] [generated]
        stack_A6_0 : byte[] [generated]
        stack_CF_0 : byte[] [generated]
        stack_D1_0 : byte[] [generated]
        stack_FA_0 : byte[] [generated]
        stack_FC_0 : byte[] [generated]
        stack_12E_0 : byte[] [generated]
        stack_1A0_0 : byte[] [generated]
        stack_1F3_0 : byte[] [generated]
        stack_279_0 : byte[] [generated]
        stack_2CC_0 : byte[] [generated]
        var_4_174 : int
        var_3_179 : byte[]
        var_5_17A : int
        var_0_1E9 : int
        expr_1F3 : byte [generated]
        stack_22F_2 : byte [generated]
        stack_20E_0 : byte [generated]
        expr_279 : byte [generated]
        expr_A6 : int [generated]
        expr_D1 : int [generated]
        var_2_FA : byte[]
        expr_FE : int [generated]
        var_3_2BB : byte[]
        var_5_2BC : int
        var_3_13A : String
        stack_16D_0 : String[] [generated]
        expr_14C : String[] [generated]
        
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
        var_0_187 = and:int(ldc:int(-1171170541), ldc:int(-164006939))
        expr_6B = arraylength:int(stack_A4_0 = stack_A6_0 = stack_CF_0 = stack_D1_0 = stack_FA_0 = stack_FC_0 = stack_12E_0 = stack_1A0_0 = stack_1F3_0 = stack_279_0 = stack_2CC_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("4sTm8J7UzBjq64TZ20s=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_174 = expr_6B:int
        var_3_179 = newarray:byte[](byte.class, expr_6B:int)
        var_5_17A = expr_6B:int
        Label_0380:
        
        while (cmpne:boolean(and:int(var_0_187:int, ldc:int(536870912)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_187:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_0463)
            }
            
            var_0_187 = and:int(var_0_187:int, ldc:int(-75514601))
            var_5_17A = add:int(var_5_17A:int, ldc:int(-1))
            storeelement:byte(var_3_179:byte[], var_5_17A:int, add:byte(loadelement:byte(stack_1A0_0:byte[], var_5_17A:int), ldc:byte(37)))
            
            if (cmpne:boolean(var_5_17A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_CF_0 = stack_D1_0 = stack_FA_0 = stack_FC_0 = stack_12E_0 = stack_1A0_0 = stack_1F3_0 = stack_279_0 = stack_2CC_0 = var_3_179:byte[]
            goto(Label_0112)
        }
        
        var_0_187 = and:int(var_0_187:int, ldc:int(-682495232))
        goto(Label_0597)
        Label_0463:
        
        while (cmpne:boolean(and:int(var_0_187:int, ldc:int(268435456)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_187:int, ldc:int(1)), ldc:int(0))) {
                var_0_187 = and:int(var_0_187:int, ldc:int(-1269733050))
                goto(Label_0380)
            }
            
            var_0_1E9 = and:int(var_0_187:int, ldc:int(-1235364355))
            var_5_17A = add:int(var_5_17A:int, ldc:int(-1))
            expr_1F3 = stack_22F_2 = loadelement(stack_1F3_0, var_5_17A)
            
            if (cmplt:boolean(add:int(add:int(var_5_17A:int, ldc:int(3)), neg:int(var_4_174:int)), ldc:int(0))) {
                stack_22F_2 = stack_20E_0 = add:byte(expr_1F3:byte, loadelement:byte(var_3_179:byte[], add:int(var_5_17A:int, ldc:int(3))))
                goto(Label_0542)
            }
            
            Label_0512:
            
            if (cmpeq:boolean(and:int(var_0_1E9:int, ldc:int(8388608)), ldc:int(0))) {
                var_0_1E9 = and:int(var_0_1E9:int, ldc:int(-4345513))
                stack_22F_2 = stack_20E_0 = add:byte(expr_1F3:byte, ldc:byte(3))
            }
            
            Label_0542:
            
            if (cmpeq:boolean(and:int(var_0_1E9:int, ldc:int(1048576)), ldc:int(0))) {
                goto(Label_0512)
            }
            
            var_0_187 = and:int(var_0_1E9:int, ldc:int(-1284254831))
            storeelement:byte(var_3_179:byte[], var_5_17A:int, stack_22F_2:byte)
            
            if (cmpne:boolean(var_5_17A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_CF_0 = stack_D1_0 = stack_FA_0 = stack_FC_0 = stack_12E_0 = stack_1A0_0 = stack_1F3_0 = stack_279_0 = stack_2CC_0 = var_3_179:byte[]
            goto(Label_0171)
        }
        
        Label_0597:
        
        while (cmpne:boolean(and:int(var_0_187:int, ldc:int(536870912)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_187:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0380)
            }
            
            var_0_187 = and:int(var_0_187:int, ldc:int(-1145603833))
            var_5_17A = add:int(var_5_17A:int, ldc:int(-1))
            expr_279 = loadelement:byte(stack_279_0:byte[], var_5_17A:int)
            storeelement:byte(var_3_179:byte[], var_5_17A:int, xor:int(or:int(and:int(shl:int(expr_279:byte, xor:int(ldc:int(529), ldc:int(533))), ldc:int(-16)), and:int(shr:int(expr_279:byte[expected:int], xor:int(ldc:int(8200), ldc:int(8204))), ldc:int(15))), ldc:int(7)))
            
            if (cmpne:boolean(var_5_17A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_CF_0 = stack_D1_0 = stack_FA_0 = stack_FC_0 = stack_12E_0 = stack_1A0_0 = stack_1F3_0 = stack_279_0 = stack_2CC_0 = var_3_179:byte[]
            goto(Label_0214)
        }
        
        var_0_187 = and:int(var_0_187:int, ldc:int(-1868117385))
        goto(Label_0463)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_187:int, ldc:int(524288)), ldc:int(0))) {
            var_0_187 = and:int(var_0_187:int, ldc:int(1723120778))
            goto(Label_0259)
        }
        
        if (cmpeq:boolean(and:int(var_0_187:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_187 = and:int(var_0_187:int, ldc:int(-563714600))
            goto(Label_0214)
        }
        
        if (cmpeq:boolean(and:int(var_0_187:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_187 = and:int(var_0_187:int, ldc:int(1125342213))
        }
        else {
            var_0_187 = and:int(var_0_187:int, ldc:int(-155733023))
            expr_A6 = arraylength:int(stack_A6_0:byte[])
            
            if (cmpne:boolean(expr_A6:int, ldc:int(0))) {
                var_4_174 = expr_A6:int
                var_3_179 = newarray:byte[](byte.class, expr_A6:int)
                var_5_17A = expr_A6:int
                goto(Label_0463)
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_0_187:int, ldc:int(4096)), ldc:int(0))) {
            var_0_187 = and:int(var_0_187:int, ldc:int(472440671))
            goto(Label_0259)
        }
        
        if (cmpeq:boolean(and:int(var_0_187:int, ldc:int(524288)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_187:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_187 = and:int(var_0_187:int, ldc:int(-1292124225))
            expr_D1 = arraylength:int(stack_D1_0:byte[])
            
            if (cmpne:boolean(expr_D1:int, ldc:int(0))) {
                var_4_174 = expr_D1:int
                var_3_179 = newarray:byte[](byte.class, expr_D1:int)
                var_5_17A = expr_D1:int
                goto(Label_0597)
            }
        }
        
        Label_0214:
        
        if (cmpne:boolean(and:int(var_0_187:int, ldc:int(268435456)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_187:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_0171)
            }
            
            if (cmpeq:boolean(and:int(var_0_187:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_187 = and:int(var_0_187:int, ldc:int(503465570))
                goto(Label_0112)
            }
            
            var_0_187 = and:int(var_0_187:int, ldc:int(-134489771))
            var_2_FA = stack_FA_0:byte[]
            expr_FE = add:int(arraylength:int(stack_FC_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_FE:int, ldc:int(0))) {
                var_3_2BB = newarray:byte[](byte.class, expr_FE:int)
                var_5_2BC = expr_FE:int
                
                loop {
                    var_0_187 = and:int(var_0_187:int, ldc:int(-143541833))
                    var_5_2BC = add:int(var_5_2BC:int, ldc:int(-1))
                    storeelement:byte(var_3_2BB:byte[], var_5_2BC:int, add:int(shl:int(loadelement:byte(stack_2CC_0:byte[], var_5_2BC:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_FA:byte[], add:int(var_5_2BC:int, xor:int(ldc:int(332), ldc:int(333)))), ldc:int(4)), and:int(ldc:int(1583), ldc:int(20495)))))
                    
                    if (cmpne:boolean(var_5_2BC:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A6_0 = stack_A4_0 = stack_CF_0 = stack_D1_0 = stack_FA_0 = stack_FC_0 = stack_12E_0 = stack_1A0_0 = stack_1F3_0 = stack_279_0 = stack_2CC_0 = var_3_2BB:byte[]
            }
        }
        
        Label_0259:
        
        if (cmpeq:boolean(and:int(var_0_187:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_187 = and:int(var_0_187:int, ldc:int(-1458113865))
            goto(Label_0214)
        }
        
        if (cmpeq:boolean(and:int(var_0_187:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0171)
        }
        
        if (cmpne:boolean(and:int(var_0_187:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_187 = and:int(var_0_187:int, ldc:int(-984080229))
            goto(Label_0112)
        }
        
        var_3_13A = initobject:String(String::<init>, stack_12E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_16D_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(10253), ldc:int(273)))
        expr_14C = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(16784), ldc:int(16785)))
        storeelement:String(expr_14C:String[], and:int(ldc:int(13754), ldc:int(-13820)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, and:int(ldc:int(6199), ldc:int(-7288)), xor:int(ldc:int(6412), ldc:int(6401))))
        putstatic:String[](\ub19c\uc84e\u5d20\u4f52\u4bc8\ua068::\ucef1\u5fe1\u92ee\u4daf\u9937\u0800, expr_14C:String[])
    }
    
    public void \uae87\u51fa\u3bd6\u0800\uf995\u59ec(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6CC : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D3 : int
        var_11_E4 : int
        var_14_10E : double
        var_16_112 : int
        var_12_10A : double
        var_17_6D7 : int
        
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
        var_3_6CC = and:int(ldc:int(547285179), ldc:int(-1545608582))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub19c\uc84e\u5d20\u4f52\u4bc8\ua068[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(32)), ldc:int(0))) {
            var_3_6CC = and:int(var_3_6CC:int, ldc:int(-234407762))
        }
        else {
            var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1732324098))
            var_5_85 = and:int(ldc:int(-27374), ldc:int(27297))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(20039), ldc:int(-28232)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D3 = and:int(var_3_6CC:int, ldc:int(379501354))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E4 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E4:int, sub:int(var_6_8C:int, xor:int(ldc:int(2052), ldc:int(2053)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E4:int, and:int(ldc:int(2245), ldc:int(25137)))), var_7_9B:double))) {
                        inc:int(var_11_E4, ldc:int(1))
                    }
                    
                    var_3_6CC = and:int(var_3_D3:int, ldc:int(-1157710342))
                    var_14_10E = var_7_9B:double
                    var_16_112 = var_11_E4:int
                }
                else {
                    var_11_E4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(-32572), ldc:int(-32571)))
                    var_12_10A = var_14_10E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_112 = var_11_E4:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E4:int)
                        var_16_112 = var_11_E4:int
                        var_14_10E = var_12_10A:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1633857402))
                        goto(Label_1632)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(497883682))
                        goto(Label_1451)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1302)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0981)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1744640188))
                        goto(Label_0839)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0569)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(94340858))
                        
                        if (cmplt:boolean(var_16_112:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0569)
                            }
                            
                            goto(Label_0839)
                        }
                    }
                    
                    Label_0390:
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(1522879323))
                        goto(Label_1632)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(1239211876))
                        goto(Label_1451)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1302)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-538684624))
                        goto(Label_0981)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(278340555))
                        goto(Label_0839)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-314202959))
                        goto(Label_0702)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1724747408))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(882884523))
                            var_11_E4 = and:int(ldc:int(2304), ldc:int(-2305))
                            goto(Label_1621)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0569:
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-804045708))
                        goto(Label_1632)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(209129069))
                        goto(Label_1451)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1302)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1803269762))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0981)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0839)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(-806696217))
                            goto(Label_0390)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(487282925))
                            loopcontinue()
                        }
                        
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(2059336186))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10E = var_9_C1:double
                            goto(Label_0839)
                        }
                    }
                    
                    Label_0702:
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-593410811))
                        goto(Label_1632)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1392727934))
                        goto(Label_1451)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1302)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(1489341669))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0981)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0569)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1752699570))
                            goto(Label_0390)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(-95308565))
                            loopcontinue()
                        }
                        
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-459306437))
                        var_14_10E = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10E:double))
                    }
                    
                    Label_0839:
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1622556588))
                        goto(Label_1632)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1451)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(333701362))
                        goto(Label_1302)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1724262687))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-31096231))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1917496830))
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(797264074))
                            goto(Label_0569)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0390)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(1268686971))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E4 = and:int(ldc:int(16921), ldc:int(1029))
                                goto(Label_1146)
                            }
                        }
                    }
                    
                    Label_0981:
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(49393590))
                        goto(Label_1632)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1451)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(1544013557))
                        goto(Label_1302)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0839)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(433028255))
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0569)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(257322704))
                            goto(Label_0390)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(1084736210))
                            loopcontinue()
                        }
                        
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(1054857518))
                        var_11_E4 = and:int(ldc:int(23266), ldc:int(-23291))
                    }
                    
                    Label_1146:
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1035943424))
                        goto(Label_1632)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(1472464042))
                        goto(Label_1451)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(513485662))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(1086119367))
                            goto(Label_0981)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1615930525))
                            goto(Label_0839)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1228732354))
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(1493620361))
                            goto(Label_0569)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1992895082))
                            goto(Label_0390)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1482687238))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E4:int, ldc:int(0))) {
                                goto(Label_1451)
                            }
                        }
                    }
                    
                    Label_1302:
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(1026503691))
                        goto(Label_1632)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1586687050))
                            goto(Label_1146)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1355274644))
                            goto(Label_0981)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(1001974919))
                            goto(Label_0839)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(32)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(-374051565))
                            goto(Label_0569)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(1979841862))
                            goto(Label_0390)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(413125034))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10E:double, var_5_85:int, var_16_112:int)
                            goto(Label_1621)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1451:
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-267138865))
                        goto(Label_1632)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1302)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-2094131427))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(504743697))
                        goto(Label_0981)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-842031165))
                        goto(Label_0839)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(992502095))
                        goto(Label_0702)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(1351013249))
                        goto(Label_0569)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(1546959672))
                        goto(Label_0390)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(904066692))
                        loopcontinue()
                    }
                    
                    var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1600209794))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10E:double, ldc:double(0.0))
                    Label_1621:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6D7 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1632:
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(255942759))
                        goto(Label_1451)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(463032679))
                        goto(Label_1302)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0981)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0839)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-319847693))
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0569)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0390)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(127899707))
                        var_17_6D7 = add:int(var_16_112:int, and:int(ldc:int(6745), ldc:int(16391)))
                        looporswitchbreak()
                    }
                    
                    var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1028800659))
                }
                
                var_3_6CC = and:int(var_3_6CC:int, ldc:int(2147400878))
                
                if (cmple:boolean(var_5_85 = var_17_6D7:int, sub:int(var_6_8C:int, xor:int(ldc:int(16385), ldc:int(16384))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(67108864)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
