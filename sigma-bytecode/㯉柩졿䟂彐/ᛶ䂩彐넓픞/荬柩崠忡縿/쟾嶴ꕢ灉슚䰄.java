public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\uc7fe\u5db4\ua562\u7049\uc29a\u4c04 {
    public void \uc7fe\u5db4\ua562\u7049\uc29a\u4c04() {
        expr_70 : float[] [generated]
        expr_A5 : float[] [generated]
        
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
            invokespecial:\u3c25\u6ec6\uc9f6\ud158\ud171\u385b(\u3c25\u6ec6\uc9f6\ud158\ud171\u385b::<init>, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04)
            putfield:int(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u92ee\ubcb0\ufcaf\u51fa\u3bc9\u527a, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04, ldc:int(-1))
            expr_70 = newarray:float[](float.class, xor:int(ldc:int(0), ldc:int(4)))
            storeelement:float(expr_70:float[], xor:int(ldc:int(25604), ldc:int(25605)), storeelement:float(expr_70:float[], and:int(ldc:int(12586), ldc:int(-12587)), ldc:float(1.0f)))
            storeelement:float(expr_70:float[], and:int(ldc:int(17035), ldc:int(8231)), storeelement:float(expr_70:float[], xor:int(ldc:int(19585), ldc:int(19587)), ldc:float(1.0f)))
            putfield:float[](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u836c\ua3b4\u6ec6\u8709\u1187\u99f7, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04, expr_70:float[])
            expr_A5 = newarray:float[](float.class, xor:int(ldc:int(147), ldc:int(145)))
            storeelement:float(expr_A5:float[], and:int(ldc:int(289), ldc:int(13315)), storeelement:float(expr_A5:float[], and:int(ldc:int(23172), ldc:int(-23173)), ldc:float(0.0f)))
            putfield:float[](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\ub18d\ua068\uc29a\ud12e\u7af6\ub171, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04, expr_A5:float[])
            putfield:float[](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u600f\u3dd3\u76bc\u9a18\u6c56\u624e, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04, newarray:float[](float.class, xor:int(ldc:int(10883), ldc:int(4123))))
            putfield:float[](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u99f7\u3d4b\u9af2\ufe34\u5d20\uceb8, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04, newarray:float[](float.class, xor:int(ldc:int(19343), ldc:int(1455))))
            putfield:float[](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u67d0\u34df\u47c2\u52d3\u0a06\u3d64, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04, newarray:float[](float.class, xor:int(ldc:int(9554), ldc:int(8138))))
            putfield:FloatBuffer(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\ucfaf\ufe34\u62da\ubf56\uc229\u47c2, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04, invokestatic:FloatBuffer(BufferUtils::createFloatBuffer, xor:int(ldc:int(12989), ldc:int(2085))))
            putfield:FloatBuffer(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u156b\u52d3\u71ae\u6b0d\u6fb0\uafe7, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04, invokestatic:FloatBuffer(BufferUtils::createFloatBuffer, and:int(ldc:int(20000), ldc:int(20322))))
            putfield:FloatBuffer(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u3d4b\u7bad\ube23\u6198\u8753\u494c, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04, invokestatic:FloatBuffer(BufferUtils::createFloatBuffer, xor:int(ldc:int(10570), ldc:int(3674))))
            putfield:int(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u97e6\u183a\ub1b9\u5bc4\u4179\ubefe, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04, and:int(ldc:int(9110), ldc:int(-14239)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u12b2\u97b7\u600f\u3c25\u7330\u927d(int p0, int p1) {
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
            invokespecial:void(\u3c25\u6ec6\uc9f6\ud158\ud171\u385b::\u12b2\u97b7\u600f\u3c25\u7330\u927d, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04[expected:\u3c25\u6ec6\uc9f6\ud158\ud171\u385b], p0:int, p1:int)
            invokespecial:void(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u527a\ubded\u4daf\u8aa5\u4bc8\u7ce1, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04)
            invokestatic:void(GL11::glEnableClientState, ldc:int(32884))
            invokestatic:void(GL11::glEnableClientState, ldc:int(32888))
            invokestatic:void(GL11::glEnableClientState, ldc:int(32886))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u527a\ubded\u4daf\u8aa5\u4bc8\u7ce1() {
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
            putfield:int(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u93a2\uf94d\ubb2b\ub32d\ubf56\u0a06, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04, and:int(ldc:int(-3454), ldc:int(2428)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u8aa5\ub1b9\ufe34\ua068\u5fe1\uc238() {
        var_1_1E1 : int
        var_3_1DC : int
        
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
        var_1_1E1 = and:int(ldc:int(1817932170), ldc:int(-58986258))
        
        if (cmpeq:boolean(getfield:int(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u93a2\uf94d\ubb2b\ub32d\ubf56\u0a06, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), ldc:int(0))) {
            return:void()
        }
        
        loop {
            if (cmpeq:boolean(and:int(var_1_1E1:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0166)
            }
            
            if (cmpeq:boolean(and:int(var_1_1E1:int, ldc:int(8)), ldc:int(0))) {
                var_1_1E1 = and:int(var_1_1E1:int, ldc:int(891530636))
            }
            else {
                var_1_1E1 = and:int(var_1_1E1:int, ldc:int(1053540206))
                
                if (cmpeq:boolean(getfield:int(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u92ee\ubcb0\ufcaf\u51fa\u3bc9\u527a, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), ldc:int(-1))) {
                    return:void()
                }
            }
            
            Label_0138:
            
            if (cmpne:boolean(and:int(var_1_1E1:int, ldc:int(524288)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_1_1E1:int, ldc:int(2)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_1_1E1 = and:int(var_1_1E1:int, ldc:int(1313584363))
                
                if (cmplt:boolean(getfield:int(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u93a2\uf94d\ubb2b\ub32d\ubf56\u0a06, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), ldc:int(20))) {
                    invokestatic:void(GL11::glBegin, getfield:int(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u92ee\ubcb0\ufcaf\u51fa\u3bc9\u527a, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04))
                    var_3_1DC = and:int(ldc:int(20265), ldc:int(-24362))
                    
                    loop {
                        var_1_1E1 = and:int(var_1_1E1:int, ldc:int(1266334191))
                        
                        if (cmpge:boolean(var_3_1DC:int, getfield:int(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u93a2\uf94d\ubb2b\ub32d\ubf56\u0a06, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04))) {
                            looporswitchbreak()
                        }
                        
                        invokestatic:void(GL11::glColor4f, loadelement:float(getfield:float[](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u99f7\u3d4b\u9af2\ufe34\u5d20\uceb8, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), add:int(mul:int(var_3_1DC:int, xor:int(ldc:int(-32379), ldc:int(-32383))), and:int(ldc:int(-25235), ldc:int(24722)))), loadelement:float(getfield:float[](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u99f7\u3d4b\u9af2\ufe34\u5d20\uceb8, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), add:int(mul:int(var_3_1DC:int, and:int(ldc:int(4311), ldc:int(12))), xor:int(ldc:int(2436), ldc:int(2437)))), loadelement:float(getfield:float[](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u99f7\u3d4b\u9af2\ufe34\u5d20\uceb8, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), add:int(mul:int(var_3_1DC:int, and:int(ldc:int(2164), ldc:int(8332))), xor:int(ldc:int(-27639), ldc:int(-27637)))), loadelement:float(getfield:float[](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u99f7\u3d4b\u9af2\ufe34\u5d20\uceb8, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), add:int(mul:int(var_3_1DC:int, and:int(ldc:int(2598), ldc:int(4109))), and:int(ldc:int(16967), ldc:int(8195)))))
                        invokestatic:void(GL11::glTexCoord2f, loadelement:float(getfield:float[](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u67d0\u34df\u47c2\u52d3\u0a06\u3d64, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), add:int(mul:int(var_3_1DC:int, and:int(ldc:int(2626), ldc:int(12298))), and:int(ldc:int(-21839), ldc:int(20806)))), loadelement:float(getfield:float[](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u67d0\u34df\u47c2\u52d3\u0a06\u3d64, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), add:int(mul:int(var_3_1DC:int, xor:int(ldc:int(17168), ldc:int(17170))), xor:int(ldc:int(8194), ldc:int(8195)))))
                        invokestatic:void(GL11::glVertex3f, loadelement:float(getfield:float[](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u600f\u3dd3\u76bc\u9a18\u6c56\u624e, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), add:int(mul:int(var_3_1DC:int, xor:int(ldc:int(1284), ldc:int(1287))), and:int(ldc:int(18700), ldc:int(-18701)))), loadelement:float(getfield:float[](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u600f\u3dd3\u76bc\u9a18\u6c56\u624e, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), add:int(mul:int(var_3_1DC:int, xor:int(ldc:int(-32477), ldc:int(-32480))), xor:int(ldc:int(257), ldc:int(256)))), loadelement:float(getfield:float[](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u600f\u3dd3\u76bc\u9a18\u6c56\u624e, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), add:int(mul:int(var_3_1DC:int, and:int(ldc:int(4139), ldc:int(1171))), and:int(ldc:int(4130), ldc:int(19330)))))
                        inc:int(var_3_1DC, ldc:int(1))
                    }
                    
                    invokestatic:void(GL11::glEnd)
                    putfield:int(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u92ee\ubcb0\ufcaf\u51fa\u3bc9\u527a, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04, ldc:int(-1))
                    return:void()
                }
            }
            
            Label_0166:
            
            if (cmpeq:boolean(and:int(var_1_1E1:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_0138)
            }
            
            if (cmpeq:boolean(and:int(var_1_1E1:int, ldc:int(1024)), ldc:int(0))) {
                invokevirtual:Buffer(Buffer::clear, getfield:FloatBuffer[expected:Buffer](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\ucfaf\ufe34\u62da\ubf56\uc229\u47c2, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04))
                invokevirtual:Buffer(Buffer::clear, getfield:FloatBuffer[expected:Buffer](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u156b\u52d3\u71ae\u6b0d\u6fb0\uafe7, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04))
                invokevirtual:Buffer(Buffer::clear, getfield:FloatBuffer[expected:Buffer](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u3d4b\u7bad\ube23\u6198\u8753\u494c, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04))
                invokevirtual:FloatBuffer(FloatBuffer::put, getfield:FloatBuffer(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\ucfaf\ufe34\u62da\ubf56\uc229\u47c2, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), getfield:float[](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u600f\u3dd3\u76bc\u9a18\u6c56\u624e, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), and:int(ldc:int(-7741), ldc:int(7720)), mul:int(getfield:int(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u93a2\uf94d\ubb2b\ub32d\ubf56\u0a06, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), and:int(ldc:int(267), ldc:int(6659))))
                invokevirtual:FloatBuffer(FloatBuffer::put, getfield:FloatBuffer(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u156b\u52d3\u71ae\u6b0d\u6fb0\uafe7, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), getfield:float[](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u99f7\u3d4b\u9af2\ufe34\u5d20\uceb8, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), and:int(ldc:int(18708), ldc:int(-18709)), mul:int(getfield:int(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u93a2\uf94d\ubb2b\ub32d\ubf56\u0a06, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), and:int(ldc:int(4), ldc:int(2805))))
                invokevirtual:FloatBuffer(FloatBuffer::put, getfield:FloatBuffer(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u3d4b\u7bad\ube23\u6198\u8753\u494c, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), getfield:float[](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u67d0\u34df\u47c2\u52d3\u0a06\u3d64, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), and:int(ldc:int(1957), ldc:int(-1960)), mul:int(getfield:int(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u93a2\uf94d\ubb2b\ub32d\ubf56\u0a06, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), xor:int(ldc:int(577), ldc:int(579))))
                invokevirtual:Buffer(Buffer::flip, getfield:FloatBuffer[expected:Buffer](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\ucfaf\ufe34\u62da\ubf56\uc229\u47c2, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04))
                invokevirtual:Buffer(Buffer::flip, getfield:FloatBuffer[expected:Buffer](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u156b\u52d3\u71ae\u6b0d\u6fb0\uafe7, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04))
                invokevirtual:Buffer(Buffer::flip, getfield:FloatBuffer[expected:Buffer](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u3d4b\u7bad\ube23\u6198\u8753\u494c, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04))
                invokestatic:void(GL11::glVertexPointer, xor:int(ldc:int(152), ldc:int(155)), and:int(ldc:int(-13809), ldc:int(13760)), and:int(ldc:int(-18897), ldc:int(18640)), getfield:FloatBuffer(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\ucfaf\ufe34\u62da\ubf56\uc229\u47c2, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04))
                invokestatic:void(GL11::glColorPointer, and:int(ldc:int(87), ldc:int(4140)), and:int(ldc:int(11718), ldc:int(-28103)), and:int(ldc:int(27913), ldc:int(-27934)), getfield:FloatBuffer(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u156b\u52d3\u71ae\u6b0d\u6fb0\uafe7, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04))
                invokestatic:void(GL11::glTexCoordPointer, xor:int(ldc:int(8326), ldc:int(8324)), and:int(ldc:int(-23475), ldc:int(19122)), and:int(ldc:int(18820), ldc:int(-18839)), getfield:FloatBuffer(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u3d4b\u7bad\ube23\u6198\u8753\u494c, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04))
                invokestatic:void(GL11::glDrawArrays, getfield:int(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u92ee\ubcb0\ufcaf\u51fa\u3bc9\u527a, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), and:int(ldc:int(714), ldc:int(-715)), getfield:int(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u93a2\uf94d\ubb2b\ub32d\ubf56\u0a06, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04))
                putfield:int(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u92ee\ubcb0\ufcaf\u51fa\u3bc9\u527a, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04, ldc:int(-1))
                return:void()
            }
            
            var_1_1E1 = and:int(var_1_1E1:int, ldc:int(846447144))
        }
    }
    
    private void \uae5d\uc2e8\u16f6\ud7e8\u7043\u67e9() {
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
        
        if (cmple:boolean(getfield:int(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u97e6\u183a\ub1b9\u5bc4\u4179\ubefe, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), ldc:int(0))) {
            if (cmpne:boolean(getfield:int(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u93a2\uf94d\ubb2b\ub32d\ubf56\u0a06, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), ldc:int(0))) {
                invokespecial:void(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u8aa5\ub1b9\ufe34\ua068\u5fe1\uc238, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04)
                invokespecial:void(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u527a\ubded\u4daf\u8aa5\u4bc8\u7ce1, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04)
            }
            
            invokespecial:void(\u3c25\u6ec6\uc9f6\ud158\ud171\u385b::\ud36e\uff55\ubded\u4179\ub113\ufe34, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04[expected:\u3c25\u6ec6\uc9f6\ud158\ud171\u385b], loadelement:float(getfield:float[](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u836c\ua3b4\u6ec6\u8709\u1187\u99f7, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), and:int(ldc:int(8164), ldc:int(-8165))), loadelement:float(getfield:float[](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u836c\ua3b4\u6ec6\u8709\u1187\u99f7, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), and:int(ldc:int(4161), ldc:int(521))), loadelement:float(getfield:float[](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u836c\ua3b4\u6ec6\u8709\u1187\u99f7, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), xor:int(ldc:int(610), ldc:int(608))), loadelement:float(getfield:float[](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u836c\ua3b4\u6ec6\u8709\u1187\u99f7, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), and:int(ldc:int(8291), ldc:int(19983))))
        }
    }
    
    public void \ufcaf\u8709\u839e\u446c\u3bc9\u2dcc() {
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
            invokespecial:void(\u3c25\u6ec6\uc9f6\ud158\ud171\u385b::\ufcaf\u8709\u839e\u446c\u3bc9\u2dcc, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04[expected:\u3c25\u6ec6\uc9f6\ud158\ud171\u385b])
            invokespecial:void(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\uae5d\uc2e8\u16f6\ud7e8\u7043\u67e9, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u51fa\uf94d\u494c\u385b\u9af2\uc29a(int p0) {
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
        
        if (cmple:boolean(getfield:int(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u97e6\u183a\ub1b9\u5bc4\u4179\ubefe, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), ldc:int(0))) {
            if (cmpne:boolean(getfield:int(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u92ee\ubcb0\ufcaf\u51fa\u3bc9\u527a, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), p0:int)) {
                invokespecial:void(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\uae5d\uc2e8\u16f6\ud7e8\u7043\u67e9, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04)
                putfield:int(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u92ee\ubcb0\ufcaf\u51fa\u3bc9\u527a, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04, p0:int)
            }
            
            return:void()
        }
        
        invokespecial:void(\u3c25\u6ec6\uc9f6\ud158\ud171\u385b::\u51fa\uf94d\u494c\u385b\u9af2\uc29a, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04[expected:\u3c25\u6ec6\uc9f6\ud158\ud171\u385b], p0:int)
    }
    
    public void \ud36e\uff55\ubded\u4179\ub113\ufe34(float p0, float p1, float p2, float p3) {
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
        p3 = mul:float(p3:float, getfield:float(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u416d\ua3b4\u6b0d\ub70c\ub32d\u983f, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04))
        storeelement:float(getfield:float[](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u836c\ua3b4\u6ec6\u8709\u1187\u99f7, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), and:int(ldc:int(-16259), ldc:int(12162)), p0:float)
        storeelement:float(getfield:float[](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u836c\ua3b4\u6ec6\u8709\u1187\u99f7, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), and:int(ldc:int(11281), ldc:int(171)), p1:float)
        storeelement:float(getfield:float[](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u836c\ua3b4\u6ec6\u8709\u1187\u99f7, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), and:int(ldc:int(6275), ldc:int(1554)), p2:float)
        storeelement:float(getfield:float[](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u836c\ua3b4\u6ec6\u8709\u1187\u99f7, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), xor:int(ldc:int(2050), ldc:int(2049)), p3:float)
        
        if (cmple:boolean(getfield:int(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u97e6\u183a\ub1b9\u5bc4\u4179\ubefe, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), ldc:int(0))) {
            return:void()
        }
        
        invokespecial:void(\u3c25\u6ec6\uc9f6\ud158\ud171\u385b::\ud36e\uff55\ubded\u4179\ub113\ufe34, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04[expected:\u3c25\u6ec6\uc9f6\ud158\ud171\u385b], p0:float, p1:float, p2:float, p3:float)
    }
    
    public void \uc31c\u624e\u516c\ub8be\ub113\ud158() {
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
        
        if (cmple:boolean(getfield:int(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u97e6\u183a\ub1b9\u5bc4\u4179\ubefe, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), ldc:int(0))) {
            return:void()
        }
        
        invokespecial:void(\u3c25\u6ec6\uc9f6\ud158\ud171\u385b::\uc31c\u624e\u516c\ub8be\ub113\ud158, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04[expected:\u3c25\u6ec6\uc9f6\ud158\ud171\u385b])
    }
    
    public void \ub1b9\u3711\u56bd\u9af2\uc29a\u6435(float p0, float p1) {
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
        
        if (cmple:boolean(getfield:int(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u97e6\u183a\ub1b9\u5bc4\u4179\ubefe, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), ldc:int(0))) {
            storeelement:float(getfield:float[](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\ub18d\ua068\uc29a\ud12e\u7af6\ub171, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), and:int(ldc:int(-31016), ldc:int(26915)), p0:float)
            storeelement:float(getfield:float[](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\ub18d\ua068\uc29a\ud12e\u7af6\ub171, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), xor:int(ldc:int(-30708), ldc:int(-30707)), p1:float)
            return:void()
        }
        
        invokespecial:void(\u3c25\u6ec6\uc9f6\ud158\ud171\u385b::\ub1b9\u3711\u56bd\u9af2\uc29a\u6435, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04[expected:\u3c25\u6ec6\uc9f6\ud158\ud171\u385b], p0:float, p1:float)
    }
    
    public void \u3d64\u1187\u8350\u64f2\ua61f\u7d52(float p0, float p1) {
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
        
        if (cmple:boolean(getfield:int(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u97e6\u183a\ub1b9\u5bc4\u4179\ubefe, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), ldc:int(0))) {
            invokevirtual:void(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u1187\uc87f\u527a\ud12e\uf94d\u0c95, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04, p0:float, p1:float, ldc:float(0.0f))
            return:void()
        }
        
        invokespecial:void(\u3c25\u6ec6\uc9f6\ud158\ud171\u385b::\u3d64\u1187\u8350\u64f2\ua61f\u7d52, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04[expected:\u3c25\u6ec6\uc9f6\ud158\ud171\u385b], p0:float, p1:float)
    }
    
    public void \u1187\uc87f\u527a\ud12e\uf94d\u0c95(float p0, float p1, float p2) {
        var_6_1F0 : int
        
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
        
        if (cmple:boolean(getfield:int(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u97e6\u183a\ub1b9\u5bc4\u4179\ubefe, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), ldc:int(0))) {
            storeelement:float(getfield:float[](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u600f\u3dd3\u76bc\u9a18\u6c56\u624e, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), add:int(mul:int(getfield:int(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u93a2\uf94d\ubb2b\ub32d\ubf56\u0a06, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), and:int(ldc:int(1123), ldc:int(10755))), and:int(ldc:int(9640), ldc:int(-9641))), p0:float)
            storeelement:float(getfield:float[](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u600f\u3dd3\u76bc\u9a18\u6c56\u624e, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), add:int(mul:int(getfield:int(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u93a2\uf94d\ubb2b\ub32d\ubf56\u0a06, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), and:int(ldc:int(11), ldc:int(18435))), xor:int(ldc:int(17), ldc:int(16))), p1:float)
            storeelement:float(getfield:float[](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u600f\u3dd3\u76bc\u9a18\u6c56\u624e, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), add:int(mul:int(getfield:int(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u93a2\uf94d\ubb2b\ub32d\ubf56\u0a06, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), and:int(ldc:int(16971), ldc:int(2087))), and:int(ldc:int(10050), ldc:int(16543))), p2:float)
            storeelement:float(getfield:float[](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u99f7\u3d4b\u9af2\ufe34\u5d20\uceb8, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), add:int(mul:int(getfield:int(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u93a2\uf94d\ubb2b\ub32d\ubf56\u0a06, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), xor:int(ldc:int(18441), ldc:int(18445))), and:int(ldc:int(2602), ldc:int(-19003))), loadelement:float(getfield:float[](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u836c\ua3b4\u6ec6\u8709\u1187\u99f7, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), and:int(ldc:int(3081), ldc:int(-3082))))
            storeelement:float(getfield:float[](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u99f7\u3d4b\u9af2\ufe34\u5d20\uceb8, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), add:int(mul:int(getfield:int(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u93a2\uf94d\ubb2b\ub32d\ubf56\u0a06, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), and:int(ldc:int(6980), ldc:int(1063))), and:int(ldc:int(24737), ldc:int(69))), loadelement:float(getfield:float[](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u836c\ua3b4\u6ec6\u8709\u1187\u99f7, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), and:int(ldc:int(8709), ldc:int(4353))))
            storeelement:float(getfield:float[](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u99f7\u3d4b\u9af2\ufe34\u5d20\uceb8, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), add:int(mul:int(getfield:int(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u93a2\uf94d\ubb2b\ub32d\ubf56\u0a06, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), and:int(ldc:int(17116), ldc:int(4))), and:int(ldc:int(22658), ldc:int(8774))), loadelement:float(getfield:float[](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u836c\ua3b4\u6ec6\u8709\u1187\u99f7, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), xor:int(ldc:int(3072), ldc:int(3074))))
            storeelement:float(getfield:float[](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u99f7\u3d4b\u9af2\ufe34\u5d20\uceb8, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), add:int(mul:int(getfield:int(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u93a2\uf94d\ubb2b\ub32d\ubf56\u0a06, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), xor:int(ldc:int(4227), ldc:int(4231))), xor:int(ldc:int(4126), ldc:int(4125))), loadelement:float(getfield:float[](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u836c\ua3b4\u6ec6\u8709\u1187\u99f7, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), xor:int(ldc:int(2060), ldc:int(2063))))
            storeelement:float(getfield:float[](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u67d0\u34df\u47c2\u52d3\u0a06\u3d64, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), add:int(mul:int(getfield:int(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u93a2\uf94d\ubb2b\ub32d\ubf56\u0a06, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), xor:int(ldc:int(-30718), ldc:int(-30720))), and:int(ldc:int(12056), ldc:int(-12059))), loadelement:float(getfield:float[](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\ub18d\ua068\uc29a\ud12e\u7af6\ub171, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), and:int(ldc:int(-13417), ldc:int(13416))))
            storeelement:float(getfield:float[](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u67d0\u34df\u47c2\u52d3\u0a06\u3d64, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), add:int(mul:int(getfield:int(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u93a2\uf94d\ubb2b\ub32d\ubf56\u0a06, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), xor:int(ldc:int(16514), ldc:int(16512))), and:int(ldc:int(8533), ldc:int(1569))), loadelement:float(getfield:float[](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\ub18d\ua068\uc29a\ud12e\u7af6\ub171, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), xor:int(ldc:int(-24063), ldc:int(-24064))))
            putfield:int(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u93a2\uf94d\ubb2b\ub32d\ubf56\u0a06, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04, add:int(getfield:int(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u93a2\uf94d\ubb2b\ub32d\ubf56\u0a06, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), xor:int(ldc:int(774), ldc:int(775))))
            
            if (cmpgt:boolean(getfield:int(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u93a2\uf94d\ubb2b\ub32d\ubf56\u0a06, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), xor:int(ldc:int(28793), ldc:int(25391)))) {
                if (invokespecial:boolean(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\uc2e8\u6d69\ua3b4\u6198\u647c\u3d4b, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04, getfield:int(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u93a2\uf94d\ubb2b\ub32d\ubf56\u0a06, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), getfield:int(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u92ee\ubcb0\ufcaf\u51fa\u3bc9\u527a, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04))) {
                    var_6_1F0 = getfield:int(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u92ee\ubcb0\ufcaf\u51fa\u3bc9\u527a, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04)
                    invokespecial:void(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\uae5d\uc2e8\u16f6\ud7e8\u7043\u67e9, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04)
                    putfield:int(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u92ee\ubcb0\ufcaf\u51fa\u3bc9\u527a, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04, var_6_1F0:int)
                }
            }
            
            return:void()
        }
        
        invokespecial:void(\u3c25\u6ec6\uc9f6\ud158\ud171\u385b::\u1187\uc87f\u527a\ud12e\uf94d\u0c95, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04[expected:\u3c25\u6ec6\uc9f6\ud158\ud171\u385b], p0:float, p1:float, p2:float)
    }
    
    private boolean \uc2e8\u6d69\ua3b4\u6198\u647c\u3d4b(int p0, int p1) {
        var_3_195 : int
        stack_15B_0 : int [generated]
        stack_FF_0 : int [generated]
        stack_1B0_0 : int [generated]
        
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
            var_3_195 = and:int(ldc:int(-1707731688), ldc:int(-878726088))
            
            loop {
                if (cmpne:boolean(and:int(var_3_195:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_0364)
                }
                
                if (cmpne:boolean(and:int(var_3_195:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0272)
                }
                
                if (cmpne:boolean(and:int(var_3_195:int, ldc:int(134217728)), ldc:int(0))) {
                    var_3_195 = and:int(var_3_195:int, ldc:int(-62990728))
                    
                    switch (p1:int) {
                        case 7:
                            if (cmpeq:boolean(rem:int(p0:int, and:int(ldc:int(6), ldc:int(60))), ldc:int(0))) {
                                looporswitchbreak()
                            }
                            
                            stack_15B_0 = stack_FF_0 = and(ldc(20257), ldc(-20386))
                            looporswitchbreak(Label_0235)
                        
                        case 4:
                            if (cmpeq:boolean(rem:int(p0:int, and:int(ldc:int(7), ldc:int(4387))), ldc:int(0))) {
                                goto(Label_0272)
                            }
                            
                            stack_15B_0 = stack_FF_0 = and(ldc(-29932), ldc(29930))
                            goto(Label_0327)
                        
                        case 6913:
                            if (cmpeq:boolean(rem:int(p0:int, and:int(ldc:int(5123), ldc:int(8706))), ldc:int(0))) {
                                goto(Label_0364)
                            }
                            
                            stack_1B0_0 = and:int[expected:boolean](ldc:int(-6013), ldc:int(5212))
                            return:boolean(stack_1B0_0:boolean)
                        
                        default:
                            return:boolean(and:int[expected:boolean](ldc:int(28833), ldc:int(-28834)))
                    }
                }
                
                Label_0172:
                
                if (cmpeq:boolean(and:int(var_3_195:int, ldc:int(131072)), ldc:int(0))) {
                    var_3_195 = and:int(var_3_195:int, ldc:int(-23618870))
                    goto(Label_0364)
                }
                
                if (cmpne:boolean(and:int(var_3_195:int, ldc:int(262144)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_3_195:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_195 = and:int(var_3_195:int, ldc:int(376394961))
                        loopcontinue()
                    }
                    
                    var_3_195 = and:int(var_3_195:int, ldc:int(962038812))
                    stack_15B_0 = stack_FF_0 = and(ldc(4161), ldc(16537))
                    looporswitchbreak()
                }
                
                Label_0272:
                
                if (cmpne:boolean(and:int(var_3_195:int, ldc:int(134217728)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_3_195:int, ldc:int(16)), ldc:int(0))) {
                        var_3_195 = and:int(var_3_195:int, ldc:int(347425388))
                        goto(Label_0172)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_195:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_195 = and:int(var_3_195:int, ldc:int(-1086425384))
                        stack_15B_0 = stack_FF_0 = and(ldc(24717), ldc(49))
                        goto(Label_0327)
                    }
                    
                    loopcontinue()
                }
                
                Label_0364:
                
                if (cmpne:boolean(and:int(var_3_195:int, ldc:int(16777216)), ldc:int(0))) {
                    var_3_195 = and:int(var_3_195:int, ldc:int(415595758))
                    goto(Label_0272)
                }
                
                if (cmpne:boolean(and:int(var_3_195:int, ldc:int(536870912)), ldc:int(0))) {
                    var_3_195 = and:int(var_3_195:int, ldc:int(1228351865))
                    goto(Label_0172)
                }
                
                if (cmpeq:boolean(and:int(var_3_195:int, ldc:int(16384)), ldc:int(0))) {
                    var_3_195 = and:int(var_3_195:int, ldc:int(-65624769))
                    stack_1B0_0 = and:int[expected:boolean](ldc:int(25121), ldc:int(1411))
                    return:boolean(stack_1B0_0:boolean[expected:int])
                }
            }
            
            Label_0235:
            
            if (cmpeq:boolean(and:int(var_3_195:int, ldc:int(536870912)), ldc:int(0))) {
                return:boolean(stack_FF_0:boolean)
            }
            
            var_3_195 = and:int(var_3_195:int, ldc:int(1743883652))
            Label_0327:
            
            if (cmpeq:boolean(and:int(var_3_195:int, ldc:int(1024)), ldc:int(0))) {
                var_3_195 = and:int(var_3_195:int, ldc:int(1986730482))
                goto(Label_0235)
            }
            
            return:boolean(stack_15B_0:int)
        }
        
        goto(Label_0006)
    }
    
    public void \ub83f\u8389\u3e75\u36d3\u836c\u5bc4(int p0, int p1) {
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
            invokespecial:void(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\uae5d\uc2e8\u16f6\ud7e8\u7043\u67e9, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04)
            invokespecial:void(\u3c25\u6ec6\uc9f6\ud158\ud171\u385b::\ub83f\u8389\u3e75\u36d3\u836c\u5bc4, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04[expected:\u3c25\u6ec6\uc9f6\ud158\ud171\u385b], p0:int, p1:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u9a18\u6fb0\u3d4b\u7ce1\u946b\ub113(int p0, int p1) {
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
            invokespecial:void(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\uae5d\uc2e8\u16f6\ud7e8\u7043\u67e9, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04)
            invokespecial:void(\u3c25\u6ec6\uc9f6\ud158\ud171\u385b::\u9a18\u6fb0\u3d4b\u7ce1\u946b\ub113, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04[expected:\u3c25\u6ec6\uc9f6\ud158\ud171\u385b], p0:int, p1:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6c52\u7049\u74b1\ua6bd\u6d69\u7330(int p0) {
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
            invokespecial:void(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\uae5d\uc2e8\u16f6\ud7e8\u7043\u67e9, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04)
            invokespecial:void(\u3c25\u6ec6\uc9f6\ud158\ud171\u385b::\u6c52\u7049\u74b1\ua6bd\u6d69\u7330, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04[expected:\u3c25\u6ec6\uc9f6\ud158\ud171\u385b], p0:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u385b\u52d3\u759a\u8258\uf94d\u960f(int p0) {
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
            invokespecial:void(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\uae5d\uc2e8\u16f6\ud7e8\u7043\u67e9, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04)
            invokespecial:void(\u3c25\u6ec6\uc9f6\ud158\ud171\u385b::\u385b\u52d3\u759a\u8258\uf94d\u960f, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04[expected:\u3c25\u6ec6\uc9f6\ud158\ud171\u385b], p0:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u16f6\ubb2b\u4f52\uceb8\u9a18\ufe34(int p0, java.nio.DoubleBuffer p1) {
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
            invokespecial:void(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\uae5d\uc2e8\u16f6\ud7e8\u7043\u67e9, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04)
            invokespecial:void(\u3c25\u6ec6\uc9f6\ud158\ud171\u385b::\u16f6\ubb2b\u4f52\uceb8\u9a18\ufe34, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04[expected:\u3c25\u6ec6\uc9f6\ud158\ud171\u385b], p0:int, p1:DoubleBuffer)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u5fe1\ub83f\u718f\uc29a\uc3e3\ub70c(boolean p0, boolean p1, boolean p2, boolean p3) {
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
            invokespecial:void(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\uae5d\uc2e8\u16f6\ud7e8\u7043\u67e9, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04)
            invokespecial:void(\u3c25\u6ec6\uc9f6\ud158\ud171\u385b::\u5fe1\ub83f\u718f\uc29a\uc3e3\ub70c, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04[expected:\u3c25\u6ec6\uc9f6\ud158\ud171\u385b], p0:boolean, p1:boolean, p2:boolean, p3:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ud158\u8753\u4daf\ub83f\u516c\u4cd9(int p0) {
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
            invokespecial:void(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\uae5d\uc2e8\u16f6\ud7e8\u7043\u67e9, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04)
            invokespecial:void(\u3c25\u6ec6\uc9f6\ud158\ud171\u385b::\ud158\u8753\u4daf\ub83f\u516c\u4cd9, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04[expected:\u3c25\u6ec6\uc9f6\ud158\ud171\u385b], p0:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u5d20\ub7dc\u51fa\u6d99\u74b1\u92ff(int p0) {
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
            invokespecial:void(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\uae5d\uc2e8\u16f6\ud7e8\u7043\u67e9, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04)
            invokespecial:void(\u3c25\u6ec6\uc9f6\ud158\ud171\u385b::\u5d20\ub7dc\u51fa\u6d99\u74b1\u92ff, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04[expected:\u3c25\u6ec6\uc9f6\ud158\ud171\u385b], p0:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uae5d\u7c6b\u4c04\u8cae\u67d0\ud36e(float p0) {
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
            invokespecial:void(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\uae5d\uc2e8\u16f6\ud7e8\u7043\u67e9, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04)
            invokespecial:void(\u3c25\u6ec6\uc9f6\ud158\ud171\u385b::\uae5d\u7c6b\u4c04\u8cae\u67d0\ud36e, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04[expected:\u3c25\u6ec6\uc9f6\ud158\ud171\u385b], p0:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u16f6\u983f\u7d52\u4c04\ucb79\u5654(float p0) {
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
            invokespecial:void(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\uae5d\uc2e8\u16f6\ud7e8\u7043\u67e9, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04)
            invokespecial:void(\u3c25\u6ec6\uc9f6\ud158\ud171\u385b::\u16f6\u983f\u7d52\u4c04\ucb79\u5654, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04[expected:\u3c25\u6ec6\uc9f6\ud158\ud171\u385b], p0:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ucb79\ufcaf\u36d3\ub6ab\u9033\u69d9() {
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
            invokespecial:void(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\uae5d\uc2e8\u16f6\ud7e8\u7043\u67e9, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04)
            invokespecial:void(\u3c25\u6ec6\uc9f6\ud158\ud171\u385b::\ucb79\ufcaf\u36d3\ub6ab\u9033\u69d9, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04[expected:\u3c25\u6ec6\uc9f6\ud158\ud171\u385b])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u3bd6\u516c\u9af2\ube23\u4c2b\u3d4b() {
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
            invokespecial:void(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\uae5d\uc2e8\u16f6\ud7e8\u7043\u67e9, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04)
            invokespecial:void(\u3c25\u6ec6\uc9f6\ud158\ud171\u385b::\u3bd6\u516c\u9af2\ube23\u4c2b\u3d4b, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04[expected:\u3c25\u6ec6\uc9f6\ud158\ud171\u385b])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ua068\ud7e8\u5bc4\ub19c\u8cae\uc84e(float p0, float p1, float p2, float p3) {
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
            invokespecial:void(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\uae5d\uc2e8\u16f6\ud7e8\u7043\u67e9, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04)
            invokespecial:void(\u3c25\u6ec6\uc9f6\ud158\ud171\u385b::\ua068\ud7e8\u5bc4\ub19c\u8cae\uc84e, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04[expected:\u3c25\u6ec6\uc9f6\ud158\ud171\u385b], p0:float, p1:float, p2:float, p3:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u600f\u3776\u8709\uc2e8\u4bc8\u8cae(float p0, float p1, float p2) {
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
            invokespecial:void(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\uae5d\uc2e8\u16f6\ud7e8\u7043\u67e9, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04)
            invokespecial:void(\u3c25\u6ec6\uc9f6\ud158\ud171\u385b::\u600f\u3776\u8709\uc2e8\u4bc8\u8cae, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04[expected:\u3c25\u6ec6\uc9f6\ud158\ud171\u385b], p0:float, p1:float, p2:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8258\u7006\u7049\u9a18\uc3e3\u6bb9(int p0, int p1, int p2, int p3) {
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
            invokespecial:void(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\uae5d\uc2e8\u16f6\ud7e8\u7043\u67e9, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04)
            invokespecial:void(\u3c25\u6ec6\uc9f6\ud158\ud171\u385b::\u8258\u7006\u7049\u9a18\uc3e3\u6bb9, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04[expected:\u3c25\u6ec6\uc9f6\ud158\ud171\u385b], p0:int, p1:int, p2:int, p3:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u718f\u8753\u8753\u7d52\ube23\u183a(int p0, int p1, int p2) {
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
            invokespecial:void(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\uae5d\uc2e8\u16f6\ud7e8\u7043\u67e9, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04)
            invokespecial:void(\u3c25\u6ec6\uc9f6\ud158\ud171\u385b::\u718f\u8753\u8753\u7d52\ube23\u183a, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04[expected:\u3c25\u6ec6\uc9f6\ud158\ud171\u385b], p0:int, p1:int, p2:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7bad\u76bc\u69d9\u97b7\u71ae\ub19c(float p0, float p1, float p2) {
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
            invokespecial:void(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\uae5d\uc2e8\u16f6\ud7e8\u7043\u67e9, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04)
            invokespecial:void(\u3c25\u6ec6\uc9f6\ud158\ud171\u385b::\u7bad\u76bc\u69d9\u97b7\u71ae\ub19c, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04[expected:\u3c25\u6ec6\uc9f6\ud158\ud171\u385b], p0:float, p1:float, p2:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u92ee\u3bc9\u99f7\u3c25\u965f\u3d4b() {
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
            putfield:int(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u97e6\u183a\ub1b9\u5bc4\u4179\ubefe, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04, sub:int(getfield:int(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u97e6\u183a\ub1b9\u5bc4\u4179\ubefe, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), and:int(ldc:int(5633), ldc:int(10471))))
            invokespecial:void(\u3c25\u6ec6\uc9f6\ud158\ud171\u385b::\u92ee\u3bc9\u99f7\u3c25\u965f\u3d4b, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04[expected:\u3c25\u6ec6\uc9f6\ud158\ud171\u385b])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u56bd\u960f\u3776\ub32d\u5d20\uc9f6(int p0, int p1) {
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
            putfield:int(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u97e6\u183a\ub1b9\u5bc4\u4179\ubefe, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04, add:int(getfield:int(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u97e6\u183a\ub1b9\u5bc4\u4179\ubefe, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04), xor:int(ldc:int(-26560), ldc:int(-26559))))
            invokespecial:void(\u3c25\u6ec6\uc9f6\ud158\ud171\u385b::\u56bd\u960f\u3776\ub32d\u5d20\uc9f6, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04[expected:\u3c25\u6ec6\uc9f6\ud158\ud171\u385b], p0:int, p1:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public float[] \u93a2\u6198\u0b8e\uc84e\u4d85\u4e72() {
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
            return:float[](getfield:float[](\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u836c\ua3b4\u6ec6\u8709\u1187\u99f7, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04))
        }
        
        goto(Label_0006)
    }
    
    public void \u3dd3\uc31c\ube23\uafe7\uc910\ua068(java.nio.FloatBuffer p0) {
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
            invokespecial:void(\uc7fe\u5db4\ua562\u7049\uc29a\u4c04::\u8aa5\ub1b9\ufe34\ua068\u5fe1\uc238, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04)
            invokespecial:void(\u3c25\u6ec6\uc9f6\ud158\ud171\u385b::\u3dd3\uc31c\ube23\uafe7\uc910\ua068, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04[expected:\u3c25\u6ec6\uc9f6\ud158\ud171\u385b], p0:FloatBuffer)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
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
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ua3b4\u71f1\ub70c\ua562\ufe34\u8258(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_62B : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_636 : int
        
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
        var_3_62B = and:int(ldc:int(-507665146), ldc:int(-546459331))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc7fe\u5db4\ua562\u7049\uc29a\u4c04[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_62B = and:int(var_3_62B:int, ldc:int(1014502423))
        }
        else {
            var_3_62B = and:int(var_3_62B:int, ldc:int(1500507448))
            var_5_8A = and:int(ldc:int(-8261), ldc:int(8260))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(2296), ldc:int(-6394)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_62B:int, ldc:int(1294854651))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, xor:int(ldc:int(-8188), ldc:int(-8187)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(2689), ldc:int(17505)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_62B = and:int(var_3_DA:int, ldc:int(1294988993))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(-32692), ldc:int(-32691)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1496)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1349)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(801805396))
                        goto(Label_1216)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1095)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0945)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0814)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0686)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0535)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(1844946288))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0535)
                            }
                            
                            goto(Label_0814)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1496)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1349)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1216)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1095)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-635023102))
                        goto(Label_0945)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0814)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-988572757))
                        goto(Label_0686)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(700164772))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(1405084139))
                            var_11_EB = and:int(ldc:int(9989), ldc:int(-10134))
                            goto(Label_1485)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0535:
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1496)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(1181964397))
                        goto(Label_1349)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1216)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(348135953))
                        goto(Label_1095)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-1506184163))
                        goto(Label_0945)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(224058345))
                        goto(Label_0814)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(1426519200))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(-330821421))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(-303822934))
                            loopcontinue()
                        }
                        
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-613964160))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0814)
                        }
                    }
                    
                    Label_0686:
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1496)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1349)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(1352842607))
                        goto(Label_1216)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1095)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0945)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-2098616426))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0535)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(8)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(17462742))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(134576765))
                            loopcontinue()
                        }
                        
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-177348121))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0814:
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1496)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1349)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(1086976396))
                        goto(Label_1216)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1095)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-849001404))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(-1484217917))
                            goto(Label_0686)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0535)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(-952834121))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(47387416))
                            loopcontinue()
                        }
                        
                        var_3_62B = and:int(var_3_62B:int, ldc:int(1202568300))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = and:int(ldc:int(20517), ldc:int(17))
                                goto(Label_1095)
                            }
                        }
                    }
                    
                    Label_0945:
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1496)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1349)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(182806894))
                        goto(Label_1216)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(915955607))
                            goto(Label_0814)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0686)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(652746134))
                            goto(Label_0535)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-584206458))
                        var_11_EB = and:int(ldc:int(19343), ldc:int(-23456))
                    }
                    
                    Label_1095:
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1496)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-2005048015))
                        goto(Label_1349)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0945)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(8)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(1096167539))
                            goto(Label_0814)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(621456557))
                            goto(Label_0686)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0535)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(-1643278474))
                            loopcontinue()
                        }
                        
                        var_3_62B = and:int(var_3_62B:int, ldc:int(1266004964))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1349)
                            }
                        }
                    }
                    
                    Label_1216:
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(1636861528))
                        goto(Label_1496)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(512)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(1121356434))
                            goto(Label_1095)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(-1522780416))
                            goto(Label_0945)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0814)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0686)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(159807808))
                            goto(Label_0535)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(1806691388))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                            goto(Label_1485)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1349:
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(853745734))
                        goto(Label_1496)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1216)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(868405665))
                        goto(Label_1095)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0945)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0814)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-25916903))
                        goto(Label_0686)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0535)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-602321740))
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(8)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_62B = and:int(var_3_62B:int, ldc:int(1361965400))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1485:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_636 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1496:
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1349)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1216)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(1470085188))
                        goto(Label_1095)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0945)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0814)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0686)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0535)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-43128607))
                        var_17_636 = add:int(var_16_119:int, xor:int(ldc:int(-32742), ldc:int(-32741)))
                        looporswitchbreak()
                    }
                }
                
                var_3_62B = and:int(var_3_62B:int, ldc:int(-911868073))
                
                if (cmple:boolean(var_5_8A = var_17_636:int, sub:int(var_6_91:int, and:int(ldc:int(1969), ldc:int(71))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(2097152)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
