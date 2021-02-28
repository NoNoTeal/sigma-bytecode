public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u8c8a\ub70c\u6198\u392e\u446c\u0b8e {
    public void \u8c8a\ub70c\u6198\u392e\u446c\u0b8e(\u5d20\u7043\u88c5\u5db4\uf94d.\u5245\u6c52\ua068\u9a18\uc4d2\uae87 p0, \u12b2\u7049\u8df4\uc9f6\uae87.\u8cae\u3504\ubff1\ud36e\u2dcc\u5d20 p1, int p2, int p3, int p4, \u3d64\u7af6\uae87\uc238\u7d52.\u8df4\u392e\u7e3f\ub1b9\u7d52\uc29a p5, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u5db4\u69d9\u34df\ub83f\ub32d\ud217 p6, java.nio.ByteBuffer p7, int p8, boolean p9, boolean p10) {
        var_14_BD : int
        var_15_E5 : int
        
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
            invokespecial:Object(Object::<init>, this:\u8c8a\ub70c\u6198\u392e\u446c\u0b8e)
            putfield:\u5245\u6c52\ua068\u9a18\uc4d2\uae87(\u8c8a\ub70c\u6198\u392e\u446c\u0b8e::\u8753\u8389\ua068\u392e\u6d69\u5bc4, this:\u8c8a\ub70c\u6198\u392e\u446c\u0b8e, p0:\u5245\u6c52\ua068\u9a18\uc4d2\uae87)
            putfield:int(\u8c8a\ub70c\u6198\u392e\u446c\u0b8e::\u6cfe\uae87\u7ce1\u5140\uae5d\u34df, this:\u8c8a\ub70c\u6198\u392e\u446c\u0b8e, p8:int)
            putfield:int(\u8c8a\ub70c\u6198\u392e\u446c\u0b8e::\u946b\u8cae\u88c5\u960f\u88c5\u446c, this:\u8c8a\ub70c\u6198\u392e\u446c\u0b8e, invokestatic:int(GL11::glGenTextures))
            invokestatic:void(GL11::glBindTexture, invokevirtual:int(\u8c8a\ub70c\u6198\u392e\u446c\u0b8e::\u51fa\u64f2\u6198\u960f\u7e3f\uf995, this:\u8c8a\ub70c\u6198\u392e\u446c\u0b8e), getfield:int(\u8c8a\ub70c\u6198\u392e\u446c\u0b8e::\u946b\u8cae\u88c5\u960f\u88c5\u446c, this:\u8c8a\ub70c\u6198\u392e\u446c\u0b8e))
            invokestatic:void(\uc910\uc2e8\u3e2a\u3bd6\u836c\uff55::\u5654\uc9f6\u51fa\uc87f\u8640\u0c95)
            var_14_BD = ternaryop:int(p10:boolean, ldc:int(33071), and:int(ldc:int(10529), ldc:int(28435)))
            var_15_E5 = ternaryop:int(p9:boolean, xor:int(ldc:int(31996), ldc:int(23293)), xor:int(ldc:int(18404), ldc:int(25060)))
            
            switch (loadelement:int(getstatic:int[](\u647c\u8258\u74b1\u9255\uc4d2\u8c8a::\uafe7\ubf56\u647c\u527a\uc29a\u6d69), invokevirtual:int(Enum<E>::ordinal, p0:\u5245\u6c52\ua068\u9a18\uc4d2\uae87[expected:Enum<\u5245\u6c52\ua068\u9a18\uc4d2\uae87>]))) {
                case 1:
                    invokestatic:void(GL11::glTexImage1D, and:int(ldc:int(3552), ldc:int(3558)), and:int(ldc:int(20965), ldc:int(-20968)), invokevirtual:int(\u8cae\u3504\ubff1\ud36e\u2dcc\u5d20::\ub102\u4daf\u960f\ubf56\u4f52\u3dd3, p1:\u8cae\u3504\ubff1\ud36e\u2dcc\u5d20), p2:int, and:int(ldc:int(24730), ldc:int(-24987)), invokevirtual:int(\u8df4\u392e\u7e3f\ub1b9\u7d52\uc29a::\u6b0d\u7e3f\ud217\u0c95\u836c\uc238, p5:\u8df4\u392e\u7e3f\ub1b9\u7d52\uc29a), invokevirtual:int(\u5db4\u69d9\u34df\ub83f\ub32d\ud217::\u71ae\u9937\u446c\u64f2\u5140\u61a4, p6:\u5db4\u69d9\u34df\ub83f\ub32d\ud217), p7:ByteBuffer)
                    invokestatic:void(GL11::glTexParameteri, and:int(ldc:int(7653), ldc:int(28642)), xor:int(ldc:int(8327), ldc:int(2181)), var_14_BD:int)
                    invokestatic:void(GL11::glTexParameteri, xor:int(ldc:int(-26868), ldc:int(-25876)), xor:int(ldc:int(6331), ldc:int(12475)), var_15_E5:int)
                    invokestatic:void(GL11::glTexParameteri, and:int(ldc:int(4080), ldc:int(7649)), and:int(ldc:int(14793), ldc:int(11283)), var_15_E5:int)
                    looporswitchbreak()
                
                case 2:
                    invokestatic:void(GL11::glTexImage2D, xor:int(ldc:int(4757), ldc:int(8052)), and:int(ldc:int(-8208), ldc:int(8207)), invokevirtual:int(\u8cae\u3504\ubff1\ud36e\u2dcc\u5d20::\ub102\u4daf\u960f\ubf56\u4f52\u3dd3, p1:\u8cae\u3504\ubff1\ud36e\u2dcc\u5d20), p2:int, p3:int, and:int(ldc:int(-23274), ldc:int(6825)), invokevirtual:int(\u8df4\u392e\u7e3f\ub1b9\u7d52\uc29a::\u6b0d\u7e3f\ud217\u0c95\u836c\uc238, p5:\u8df4\u392e\u7e3f\ub1b9\u7d52\uc29a), invokevirtual:int(\u5db4\u69d9\u34df\ub83f\ub32d\ud217::\u71ae\u9937\u446c\u64f2\u5140\u61a4, p6:\u5db4\u69d9\u34df\ub83f\ub32d\ud217), p7:ByteBuffer)
                    invokestatic:void(GL11::glTexParameteri, xor:int(ldc:int(18157), ldc:int(19212)), and:int(ldc:int(26626), ldc:int(10434)), var_14_BD:int)
                    invokestatic:void(GL11::glTexParameteri, and:int(ldc:int(3553), ldc:int(8161)), and:int(ldc:int(10259), ldc:int(26663)), var_14_BD:int)
                    invokestatic:void(GL11::glTexParameteri, and:int(ldc:int(20449), ldc:int(3557)), xor:int(ldc:int(312), ldc:int(10552)), var_15_E5:int)
                    invokestatic:void(GL11::glTexParameteri, and:int(ldc:int(28131), ldc:int(3581)), xor:int(ldc:int(5297), ldc:int(15536)), var_15_E5:int)
                    looporswitchbreak()
                
                case 3:
                    invokestatic:void(GL20::glTexImage3D, ldc:int(32879), and:int(ldc:int(-25127), ldc:int(25094)), invokevirtual:int(\u8cae\u3504\ubff1\ud36e\u2dcc\u5d20::\ub102\u4daf\u960f\ubf56\u4f52\u3dd3, p1:\u8cae\u3504\ubff1\ud36e\u2dcc\u5d20), p2:int, p3:int, p4:int, and:int(ldc:int(20016), ldc:int(-20027)), invokevirtual:int(\u8df4\u392e\u7e3f\ub1b9\u7d52\uc29a::\u6b0d\u7e3f\ud217\u0c95\u836c\uc238, p5:\u8df4\u392e\u7e3f\ub1b9\u7d52\uc29a), invokevirtual:int(\u5db4\u69d9\u34df\ub83f\ub32d\ud217::\u71ae\u9937\u446c\u64f2\u5140\u61a4, p6:\u5db4\u69d9\u34df\ub83f\ub32d\ud217), p7:ByteBuffer)
                    invokestatic:void(GL11::glTexParameteri, ldc:int(32879), xor:int(ldc:int(-26420), ldc:int(-20274)), var_14_BD:int)
                    invokestatic:void(GL11::glTexParameteri, ldc:int(32879), xor:int(ldc:int(16348), ldc:int(6111)), var_14_BD:int)
                    invokestatic:void(GL11::glTexParameteri, ldc:int(32879), ldc:int(32882), var_14_BD:int)
                    invokestatic:void(GL11::glTexParameteri, ldc:int(32879), and:int(ldc:int(27333), ldc:int(10240)), var_15_E5:int)
                    invokestatic:void(GL11::glTexParameteri, ldc:int(32879), xor:int(ldc:int(9066), ldc:int(2923)), var_15_E5:int)
                    looporswitchbreak()
                
                case 4:
                    invokestatic:void(GL11::glTexImage2D, ldc:int(34037), and:int(ldc:int(9267), ldc:int(-9268)), invokevirtual:int(\u8cae\u3504\ubff1\ud36e\u2dcc\u5d20::\ub102\u4daf\u960f\ubf56\u4f52\u3dd3, p1:\u8cae\u3504\ubff1\ud36e\u2dcc\u5d20), p2:int, p3:int, and:int(ldc:int(-21451), ldc:int(5066)), invokevirtual:int(\u8df4\u392e\u7e3f\ub1b9\u7d52\uc29a::\u6b0d\u7e3f\ud217\u0c95\u836c\uc238, p5:\u8df4\u392e\u7e3f\ub1b9\u7d52\uc29a), invokevirtual:int(\u5db4\u69d9\u34df\ub83f\ub32d\ud217::\u71ae\u9937\u446c\u64f2\u5140\u61a4, p6:\u5db4\u69d9\u34df\ub83f\ub32d\ud217), p7:ByteBuffer)
                    invokestatic:void(GL11::glTexParameteri, ldc:int(34037), and:int(ldc:int(31299), ldc:int(10242)), var_14_BD:int)
                    invokestatic:void(GL11::glTexParameteri, ldc:int(34037), and:int(ldc:int(14351), ldc:int(11427)), var_14_BD:int)
                    invokestatic:void(GL11::glTexParameteri, ldc:int(34037), xor:int(ldc:int(24920), ldc:int(18776)), var_15_E5:int)
                    invokestatic:void(GL11::glTexParameteri, ldc:int(34037), and:int(ldc:int(10633), ldc:int(14343)), var_15_E5:int)
                    looporswitchbreak()
            }
            
            invokestatic:void(GL11::glBindTexture, invokevirtual:int(\u8c8a\ub70c\u6198\u392e\u446c\u0b8e::\u51fa\u64f2\u6198\u960f\u7e3f\uf995, this:\u8c8a\ub70c\u6198\u392e\u446c\u0b8e), and:int(ldc:int(-8521), ldc:int(8520)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u51fa\u64f2\u6198\u960f\u7e3f\uf995() {
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
            return:int(invokevirtual:int(\u5245\u6c52\ua068\u9a18\uc4d2\uae87::\u3d4b\u4daf\u120d\u67d0\u760c\u6d69, getfield:\u5245\u6c52\ua068\u9a18\uc4d2\uae87(\u8c8a\ub70c\u6198\u392e\u446c\u0b8e::\u8753\u8389\ua068\u392e\u6d69\u5bc4, this:\u8c8a\ub70c\u6198\u392e\u446c\u0b8e)))
        }
        
        goto(Label_0006)
    }
    
    public int \u98a4\ubded\u760c\uae87\u74b1\u34df() {
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
            return:int(getfield:int(\u8c8a\ub70c\u6198\u392e\u446c\u0b8e::\u946b\u8cae\u88c5\u960f\u88c5\u446c, this:\u8c8a\ub70c\u6198\u392e\u446c\u0b8e))
        }
        
        goto(Label_0006)
    }
    
    public int \u718f\ud158\u4bc8\uceb8\u0800\u4492() {
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
            return:int(getfield:int(\u8c8a\ub70c\u6198\u392e\u446c\u0b8e::\u6cfe\uae87\u7ce1\u5140\uae5d\u34df, this:\u8c8a\ub70c\u6198\u392e\u446c\u0b8e))
        }
        
        goto(Label_0006)
    }
    
    public void \uc31c\u3bd6\ub8be\u7006\u1833\u9033() {
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
            
            if (cmpgt:boolean(getfield:int(\u8c8a\ub70c\u6198\u392e\u446c\u0b8e::\u946b\u8cae\u88c5\u960f\u88c5\u446c, this:\u8c8a\ub70c\u6198\u392e\u446c\u0b8e), ldc:int(0))) {
                invokestatic:void(GL11::glDeleteTextures, getfield:int(\u8c8a\ub70c\u6198\u392e\u446c\u0b8e::\u946b\u8cae\u88c5\u960f\u88c5\u446c, this:\u8c8a\ub70c\u6198\u392e\u446c\u0b8e))
                putfield:int(\u8c8a\ub70c\u6198\u392e\u446c\u0b8e::\u946b\u8cae\u88c5\u960f\u88c5\u446c, this:\u8c8a\ub70c\u6198\u392e\u446c\u0b8e, and:int(ldc:int(29210), ldc:int(-29275)))
            }
            
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
    
    public void \uc238\u1187\u6cfe\ubff1\ua3b4\u52d3(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_63D : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_648 : int
        
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
        var_3_63D = and:int(ldc:int(160697235), ldc:int(1406557171))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8c8a\ub70c\u6198\u392e\u446c\u0b8e[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_63D = and:int(var_3_63D:int, ldc:int(-2115607139))
        }
        else {
            var_3_63D = and:int(var_3_63D:int, ldc:int(-675455085))
            var_5_85 = and:int(ldc:int(-30199), ldc:int(12694))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(25734), ldc:int(-25751)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_63D:int, ldc:int(-1848184838))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(3589), ldc:int(8193)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(16601), ldc:int(261)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_63D = and:int(var_3_D2:int, ldc:int(-1382278474))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(17093), ldc:int(8193)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-534064412))
                        goto(Label_1474)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1343)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1197)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1063)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1868659097))
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-288337345))
                    }
                    else {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(366607039))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1106720445))
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1659554170))
                        goto(Label_1343)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1865541232))
                        goto(Label_1197)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1063)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(155034446))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(512)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(-499196641))
                            loopcontinue()
                        }
                        
                        var_3_63D = and:int(var_3_63D:int, ldc:int(330495923))
                        var_11_E3 = and:int(ldc:int(-20723), ldc:int(4338))
                        goto(Label_1463)
                    }
                    
                    Label_0541:
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1493780547))
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1343)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1197)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1005157117))
                        goto(Label_1063)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(986588514))
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-665254718))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1256844928))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(-1893702944))
                            loopcontinue()
                        }
                        
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1143321601))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(546481804))
                        goto(Label_1343)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(2095964067))
                        goto(Label_1197)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1999958344))
                        goto(Label_1063)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1898458750))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(-726887089))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(512)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(-1531384664))
                            loopcontinue()
                        }
                        
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-370048042))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0802:
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(2092301543))
                        goto(Label_1474)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1343)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1088294377))
                        goto(Label_1197)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1271456268))
                        goto(Label_1063)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(8)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(1414488188))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(272205453))
                            loopcontinue()
                        }
                        
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1179024709))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:boolean(0), ldc:boolean(1))
                                goto(Label_1063)
                            }
                        }
                    }
                    
                    Label_0921:
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(724656358))
                        goto(Label_1343)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1197)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(406975779))
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(-1348045388))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1673011155))
                        var_11_E3 = and:int(ldc:int(10804), ldc:int(-10997))
                    }
                    
                    Label_1063:
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1474)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1343)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(870971272))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(8)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(-184719703))
                            goto(Label_0921)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(-939433645))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(1860622738))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(512)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(1637946270))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(64)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(-1939300632))
                            loopcontinue()
                        }
                        
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-71976973))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1343)
                            }
                        }
                    }
                    
                    Label_1197:
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1086887183))
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1701158678))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_1063)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0921)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(1477222366))
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(512)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(1921416707))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(142547189))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(1080052521))
                            loopcontinue()
                        }
                        
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1569917846))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1463)
                    }
                    
                    Label_1343:
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1312243086))
                        goto(Label_1474)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1197)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1063)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1427289460))
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-489195060))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(512)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_63D = and:int(var_3_63D:int, ldc:int(-1478854921))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1463:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_648 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1474:
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1343)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1197)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-99912640))
                        goto(Label_1063)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-28844768))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(309430480))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1156783564))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1224060650))
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-102976777))
                        var_17_648 = add:int(var_16_111:int, and:int(ldc:int(15411), ldc:int(193)))
                        looporswitchbreak()
                    }
                    
                    var_3_63D = and:int(var_3_63D:int, ldc:int(-1966873212))
                }
                
                var_3_63D = and:int(var_3_63D:int, ldc:int(1542940314))
                
                if (cmple:boolean(var_5_85 = var_17_648:int, sub:int(var_6_8C:int, xor:int(ldc:int(1232), ldc:int(1233))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(128)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
