public final class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\uae5d\u64f2\u8709\u6ec6\ud4fe\u71ae {
    public void \uae5d\u64f2\u8709\u6ec6\ud4fe\u71ae() {
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
            invokespecial:Object(Object::<init>, this:\uae5d\u64f2\u8709\u6ec6\ud4fe\u71ae)
            putfield:CountDownLatch(\uae5d\u64f2\u8709\u6ec6\ud4fe\u71ae::\u3bd6\u836c\u0c95\uae87\u3e2a\uc87f, this:\uae5d\u64f2\u8709\u6ec6\ud4fe\u71ae, initobject:CountDownLatch(CountDownLatch::<init>, xor:int(ldc:int(-14320), ldc:int(-14319))))
            putfield:long(\uae5d\u64f2\u8709\u6ec6\ud4fe\u71ae::\u64f2\u7873\u67d0\u527a\u97e6\u0a06, this:\uae5d\u64f2\u8709\u6ec6\ud4fe\u71ae, ldc:long(-1L))
            putfield:long(\uae5d\u64f2\u8709\u6ec6\ud4fe\u71ae::\u7006\ubb2b\uc31c\u16f6\u8753\ubefe, this:\uae5d\u64f2\u8709\u6ec6\ud4fe\u71ae, ldc:long(-1L))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7af6\u3d4b\uc2e8\u7330\u3e75\u8c8a() {
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
        
        if (cmpeq:boolean(getfield:long(\uae5d\u64f2\u8709\u6ec6\ud4fe\u71ae::\u64f2\u7873\u67d0\u527a\u97e6\u0a06, this:\uae5d\u64f2\u8709\u6ec6\ud4fe\u71ae), ldc:long(-1L))) {
            putfield:long(\uae5d\u64f2\u8709\u6ec6\ud4fe\u71ae::\u64f2\u7873\u67d0\u527a\u97e6\u0a06, this:\uae5d\u64f2\u8709\u6ec6\ud4fe\u71ae, invokestatic:long(System::nanoTime))
            return:void()
        }
        
        athrow(initobject:IllegalStateException(IllegalStateException::<init>))
    }
    
    public void \u88c5\u1833\u8258\u5654\ud7e8\u3d64() {
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
        
        if (logicaland:boolean(cmpeq:boolean(getfield:long(\uae5d\u64f2\u8709\u6ec6\ud4fe\u71ae::\u7006\ubb2b\uc31c\u16f6\u8753\ubefe, this:\uae5d\u64f2\u8709\u6ec6\ud4fe\u71ae), ldc:long(-1L)), cmpne:boolean(getfield:long(\uae5d\u64f2\u8709\u6ec6\ud4fe\u71ae::\u64f2\u7873\u67d0\u527a\u97e6\u0a06, this:\uae5d\u64f2\u8709\u6ec6\ud4fe\u71ae), ldc:long(-1L)))) {
            putfield:long(\uae5d\u64f2\u8709\u6ec6\ud4fe\u71ae::\u7006\ubb2b\uc31c\u16f6\u8753\ubefe, this:\uae5d\u64f2\u8709\u6ec6\ud4fe\u71ae, invokestatic:long(System::nanoTime))
            invokevirtual:void(CountDownLatch::countDown, getfield:CountDownLatch(\uae5d\u64f2\u8709\u6ec6\ud4fe\u71ae::\u3bd6\u836c\u0c95\uae87\u3e2a\uc87f, this:\uae5d\u64f2\u8709\u6ec6\ud4fe\u71ae))
            return:void()
        }
        
        athrow(initobject:IllegalStateException(IllegalStateException::<init>))
    }
    
    public void \ubf56\u3bc9\u927d\uc246\ufcaf\u9937() {
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
        
        if (logicaland:boolean(cmpeq:boolean(getfield:long(\uae5d\u64f2\u8709\u6ec6\ud4fe\u71ae::\u7006\ubb2b\uc31c\u16f6\u8753\ubefe, this:\uae5d\u64f2\u8709\u6ec6\ud4fe\u71ae), ldc:long(-1L)), cmpne:boolean(getfield:long(\uae5d\u64f2\u8709\u6ec6\ud4fe\u71ae::\u64f2\u7873\u67d0\u527a\u97e6\u0a06, this:\uae5d\u64f2\u8709\u6ec6\ud4fe\u71ae), ldc:long(-1L)))) {
            putfield:long(\uae5d\u64f2\u8709\u6ec6\ud4fe\u71ae::\u7006\ubb2b\uc31c\u16f6\u8753\ubefe, this:\uae5d\u64f2\u8709\u6ec6\ud4fe\u71ae, sub:long(getfield:long(\uae5d\u64f2\u8709\u6ec6\ud4fe\u71ae::\u64f2\u7873\u67d0\u527a\u97e6\u0a06, this:\uae5d\u64f2\u8709\u6ec6\ud4fe\u71ae), ldc:long(1L)))
            invokevirtual:void(CountDownLatch::countDown, getfield:CountDownLatch(\uae5d\u64f2\u8709\u6ec6\ud4fe\u71ae::\u3bd6\u836c\u0c95\uae87\u3e2a\uc87f, this:\uae5d\u64f2\u8709\u6ec6\ud4fe\u71ae))
            return:void()
        }
        
        athrow(initobject:IllegalStateException(IllegalStateException::<init>))
    }
    
    public long \u8308\uc9f6\u5f50\ub6ab\ubff1\u5d20() {
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
            invokevirtual:void(CountDownLatch::await, getfield:CountDownLatch(\uae5d\u64f2\u8709\u6ec6\ud4fe\u71ae::\u3bd6\u836c\u0c95\uae87\u3e2a\uc87f, this:\uae5d\u64f2\u8709\u6ec6\ud4fe\u71ae))
            return:long(sub:long(getfield:long(\uae5d\u64f2\u8709\u6ec6\ud4fe\u71ae::\u7006\ubb2b\uc31c\u16f6\u8753\ubefe, this:\uae5d\u64f2\u8709\u6ec6\ud4fe\u71ae), getfield:long(\uae5d\u64f2\u8709\u6ec6\ud4fe\u71ae::\u64f2\u7873\u67d0\u527a\u97e6\u0a06, this:\uae5d\u64f2\u8709\u6ec6\ud4fe\u71ae)))
        }
        
        goto(Label_0006)
    }
    
    public long \u8308\uc9f6\u5f50\ub6ab\ubff1\u5d20(long p0, java.util.concurrent.TimeUnit p1) {
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
        
        if (logicalnot:boolean(invokevirtual:boolean(CountDownLatch::await, getfield:CountDownLatch(\uae5d\u64f2\u8709\u6ec6\ud4fe\u71ae::\u3bd6\u836c\u0c95\uae87\u3e2a\uc87f, this:\uae5d\u64f2\u8709\u6ec6\ud4fe\u71ae), p0:long, p1:TimeUnit))) {
            return:long(ldc:long(-2L))
        }
        
        return:long(sub:long(getfield:long(\uae5d\u64f2\u8709\u6ec6\ud4fe\u71ae::\u7006\ubb2b\uc31c\u16f6\u8753\ubefe, this:\uae5d\u64f2\u8709\u6ec6\ud4fe\u71ae), getfield:long(\uae5d\u64f2\u8709\u6ec6\ud4fe\u71ae::\u64f2\u7873\u67d0\u527a\u97e6\u0a06, this:\uae5d\u64f2\u8709\u6ec6\ud4fe\u71ae)))
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
    
    public void \u72f1\u1833\u4cd9\u67d0\u3d64\uceb8(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5F5 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_600 : int
        
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
        var_3_5F5 = and:int(ldc:int(-1465882534), ldc:int(475773566))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uae5d\u64f2\u8709\u6ec6\ud4fe\u71ae[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(901587242))
        }
        else {
            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1344881582))
            var_5_85 = and:int(ldc:int(2565), ldc:int(-2566))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-7204), ldc:int(3107)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_5F5:int, ldc:int(1782840787))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, xor:int(ldc:int(16412), ldc:int(16413)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(8329), ldc:int(8328)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_5F5 = and:int(var_3_DA:int, ldc:int(521828735))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(10587), ldc:int(517)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1917436617))
                        goto(Label_0857)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(2070229712))
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1882329897))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0525)
                            }
                            
                            goto(Label_0738)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1754280123))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1328429891))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0857)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1584495740))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-586318629))
                            var_11_EB = and:int(ldc:int(-10788), ldc:int(10755))
                            goto(Label_1423)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0525:
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-594230516))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(449697577))
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(38939934))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0857)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-685672275))
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(984010343))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-917603494))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0738)
                        }
                    }
                    
                    Label_0644:
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1494265677))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0857)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-117134245))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0738:
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1139846127))
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1158127543))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(776337317))
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-612085719))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1944852822))
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1861941854))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = and:int(ldc:int(4097), ldc:int(513))
                                goto(Label_1027)
                            }
                        }
                    }
                    
                    Label_0857:
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(2068194584))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1987463601))
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(647225890))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(875825549))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0738)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1741511300))
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-506395935))
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1527415869))
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1096668461))
                        var_11_EB = and:int(ldc:int(25117), ldc:int(-25118))
                    }
                    
                    Label_1027:
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-133649601))
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-208945238))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1537729921))
                            goto(Label_0857)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1174617487))
                            goto(Label_0738)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1750248179))
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(599671320))
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(152239830))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1300)
                            }
                        }
                    }
                    
                    Label_1154:
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(2061210431))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1716532222))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(781579275))
                            goto(Label_1027)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0857)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(299331290))
                            goto(Label_0738)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-982018895))
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-2110358024))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1861584874))
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1534750558))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                        goto(Label_1423)
                    }
                    
                    Label_1300:
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-588203009))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1587455140))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1209649637))
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0857)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1751301632))
                        goto(Label_0525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(64)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-620332965))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1423:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_600 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1434:
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-994923430))
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0857)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-484841764))
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-308433582))
                        var_17_600 = add:int(var_16_119:int, xor:int(ldc:int(66), ldc:int(67)))
                        looporswitchbreak()
                    }
                    
                    var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1856636464))
                }
                
                var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1009855735))
                
                if (cmple:boolean(var_5_85 = var_17_600:int, sub:int(var_6_8C:int, xor:int(ldc:int(10372), ldc:int(10373))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(32)), ldc:int(0))) {
            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1119883997))
            goto(Label_0106)
        }
    }
}
