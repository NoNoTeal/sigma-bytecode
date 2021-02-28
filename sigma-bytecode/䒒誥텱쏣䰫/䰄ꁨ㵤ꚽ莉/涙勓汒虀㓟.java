public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u6d99\u52d3\u6c52\u8640\u34df {
    public void \u6d99\u52d3\u6c52\u8640\u34df() {
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
            invokespecial:Object(Object::<init>, this:\u6d99\u52d3\u6c52\u8640\u34df)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u8753\u7043\u6b5f\u8df4\u6c52() {
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
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u6c52\u156b\u4179\u5654\uceb8\u9af2)
            invokestatic:void(GL11::glPushAttrib, ldc:int(1048575))
            invokestatic:void(GL11::glDisable, xor:int(ldc:int(1000), ldc:int(2088)))
            invokestatic:void(GL11::glDisable, and:int(ldc:int(3563), ldc:int(15861)))
            invokestatic:void(GL11::glDisable, and:int(ldc:int(2904), ldc:int(2896)))
            invokestatic:void(GL11::glEnable, xor:int(ldc:int(9), ldc:int(3051)))
            invokestatic:void(GL11::glBlendFunc, and:int(ldc:int(9154), ldc:int(4891)), xor:int(ldc:int(9579), ldc:int(9832)))
            invokestatic:void(GL11::glLineWidth, ldc:float(3.0f))
            invokestatic:void(GL11::glEnable, xor:int(ldc:int(1356), ldc:int(3692)))
            invokestatic:void(GL11::glEnable, xor:int(ldc:int(5575), ldc:int(7767)))
            invokestatic:void(GL11::glClear, xor:int(ldc:int(1019), ldc:int(2043)))
            invokestatic:void(GL11::glClearStencil, ldc:int(15))
            invokestatic:void(GL11::glStencilFunc, xor:int(ldc:int(5409), ldc:int(5921)), xor:int(ldc:int(-27632), ldc:int(-27631)), ldc:int(15))
            invokestatic:void(GL11::glStencilOp, xor:int(ldc:int(2153), ldc:int(5736)), xor:int(ldc:int(15045), ldc:int(9412)), and:int(ldc:int(32465), ldc:int(7693)))
            invokestatic:void(GL11::glPolygonMode, and:int(ldc:int(1289), ldc:int(1084)), and:int(ldc:int(15235), ldc:int(7037)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u7c6b\u9937\u1187\u624e\u3dd3() {
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
            invokestatic:void(GL11::glStencilFunc, and:int(ldc:int(520), ldc:int(1889)), and:int(ldc:int(-26252), ldc:int(25226)), ldc:int(15))
            invokestatic:void(GL11::glStencilOp, xor:int(ldc:int(17124), ldc:int(23781)), xor:int(ldc:int(1780), ldc:int(6389)), and:int(ldc:int(7937), ldc:int(15873)))
            invokestatic:void(GL11::glPolygonMode, xor:int(ldc:int(1009), ldc:int(2041)), xor:int(ldc:int(22550), ldc:int(17172)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \ub8be\u4ab3\u446c\u16f6\u0a06() {
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
            invokestatic:void(GL11::glStencilFunc, xor:int(ldc:int(1042), ldc:int(1552)), xor:int(ldc:int(40), ldc:int(41)), ldc:int(15))
            invokestatic:void(GL11::glStencilOp, xor:int(ldc:int(10025), ldc:int(14633)), xor:int(ldc:int(1486), ldc:int(7118)), xor:int(ldc:int(11867), ldc:int(12379)))
            invokestatic:void(GL11::glPolygonMode, and:int(ldc:int(1129), ldc:int(19854)), and:int(ldc:int(23299), ldc:int(7049)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u92ff\u4179\u9033\u3bc9\u385b() {
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
            invokestatic:void(GL11::glDepthMask, and:int[expected:boolean](ldc:int(12595), ldc:int(-13108)))
            invokestatic:void(GL11::glDisable, xor:int(ldc:int(11106), ldc:int(8211)))
            invokestatic:void(GL11::glEnable, xor:int(ldc:int(1907), ldc:int(11633)))
            invokestatic:void(GL11::glPolygonOffset, ldc:float(1.0f), ldc:float(-2000000.0f))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \uc29a\ufe34\u494c\u4cd9\u2dcc() {
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
            invokestatic:void(GL11::glPolygonOffset, ldc:float(1.0f), ldc:float(2000000.0f))
            invokestatic:void(GL11::glDisable, xor:int(ldc:int(4301), ldc:int(15055)))
            invokestatic:void(GL11::glEnable, xor:int(ldc:int(19770), ldc:int(17995)))
            invokestatic:void(GL11::glDepthMask, and:int[expected:boolean](ldc:int(4177), ldc:int(5)))
            invokestatic:void(GL11::glDisable, and:int(ldc:int(11184), ldc:int(20368)))
            invokestatic:void(GL11::glDisable, xor:int(ldc:int(1514), ldc:int(3786)))
            invokestatic:void(GL11::glHint, xor:int(ldc:int(1887), ldc:int(2829)), xor:int(ldc:int(3750), ldc:int(8102)))
            invokestatic:void(GL11::glEnable, xor:int(ldc:int(1126), ldc:int(3972)))
            invokestatic:void(GL11::glEnable, xor:int(ldc:int(1995), ldc:int(3227)))
            invokestatic:void(GL11::glEnable, and:int(ldc:int(3571), ldc:int(8169)))
            invokestatic:void(GL11::glEnable, and:int(ldc:int(19400), ldc:int(8164)))
            invokestatic:void(GL11::glPopAttrib)
            invokestatic:void(\u6d99\u52d3\u6c52\u8640\u34df::\u9af2\u7ce1\u927d\ud523\u3a62, initobject:\u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330(\u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330::<init>, ldc:float(255.0f), ldc:float(255.0f), ldc:float(255.0f), ldc:float(1.0f)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u9af2\u7ce1\u927d\ud523\u3a62(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330 p0) {
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
            invokestatic:void(GL11::glColor4d, f2d:double(div:float(i2f:float(invokevirtual:int(\u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330::\u946b\uc246\ub6ab\u99f7\u527a\u4bc8, p0:\u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330)), ldc:float(255.0f))), f2d:double(div:float(i2f:float(invokevirtual:int(\u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330::\u839e\ud217\u9937\u5245\u5d20\u99f7, p0:\u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330)), ldc:float(255.0f))), f2d:double(div:float(i2f:float(invokevirtual:int(\u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330::\u494c\u7c6b\u836c\u4179\u9033\uc84e, p0:\u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330)), ldc:float(255.0f))), f2d:double(div:float(i2f:float(invokevirtual:int(\u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330::\u74b1\u7c6b\u4d85\u839e\u16f6\u72f1, p0:\u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330)), ldc:float(255.0f))))
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
    
    public void \u6bb9\u4bc8\ubff1\ud171\ube23(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_64B : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_656 : int
        
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
        var_3_64B = and:int(ldc:int(-350188222), ldc:int(-1083830434))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6d99\u52d3\u6c52\u8640\u34df[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(8388608)), ldc:int(0))) {
            var_3_64B = and:int(var_3_64B:int, ldc:int(-1485521102))
            var_5_7D = and:int(ldc:int(29664), ldc:int(-29684))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(246), ldc:int(-18679)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_64B:int, ldc:int(-215705729))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(8448), ldc:int(8449)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(-16064), ldc:int(-16063)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_64B = and:int(var_3_D2:int, ldc:int(-77519090))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(5209), ldc:int(771)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1505)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1493220790))
                        goto(Label_1347)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-1314226459))
                        goto(Label_1210)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1082)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-877974263))
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-1141850201))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1505)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1347)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1025134289))
                        goto(Label_1210)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1218066132))
                        goto(Label_1082)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(390426901))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1823015382))
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(256)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-1482013346))
                            var_11_E3 = and:int(ldc:int(-6280), ldc:int(6275))
                            goto(Label_1494)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0533:
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1867771061))
                        goto(Label_1505)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1686675983))
                        goto(Label_1347)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1115421781))
                        goto(Label_1210)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1082)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-1962222317))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(545843883))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(407200272))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(8)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-242269379))
                            loopcontinue()
                        }
                        
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-1288138986))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(129149868))
                        goto(Label_1505)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(857618227))
                        goto(Label_1347)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1210)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1963131897))
                        goto(Label_1082)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-944870177))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-744782982))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-470917158))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0794:
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-296929528))
                        goto(Label_1505)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-29167990))
                        goto(Label_1347)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(8947464))
                        goto(Label_1210)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(725759472))
                        goto(Label_1082)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-1484421858))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-76941470))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(8449), ldc:int(16903))
                                goto(Label_1082)
                            }
                        }
                    }
                    
                    Label_0913:
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(16)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-848364992))
                        goto(Label_1505)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1347)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(206322317))
                        goto(Label_1210)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-397163078))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-318807555))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(2002387537))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(1163669226))
                            loopcontinue()
                        }
                        
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-1086790249))
                        var_11_E3 = and:int(ldc:int(20542), ldc:int(-20607))
                    }
                    
                    Label_1082:
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(879762839))
                        goto(Label_1505)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1347)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0913)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(16)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(1279513484))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(4)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-667982250))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-927828324))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-526856423))
                            loopcontinue()
                        }
                        
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-1279830218))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1347)
                            }
                        }
                    }
                    
                    Label_1210:
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-1193885468))
                        goto(Label_1505)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-1618024469))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(1250851517))
                            goto(Label_1082)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0913)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(4)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-378365527))
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(8)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(996003150))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(16)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-1347457030))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1494)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1347:
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1505)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1210)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(516447536))
                        goto(Label_1082)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1072457812))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(16)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(829751457))
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(460244972))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1927903457))
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(2031142681))
                        loopcontinue()
                    }
                    
                    var_3_64B = and:int(var_3_64B:int, ldc:int(-215339181))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1494:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_656 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1505:
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1347)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1210)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-388798239))
                        goto(Label_1082)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-1788820953))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1485849287))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-395633727))
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-1284147357))
                        var_17_656 = add:int(var_16_111:int, and:int(ldc:int(25985), ldc:int(2657)))
                        looporswitchbreak()
                    }
                }
                
                var_3_64B = and:int(var_3_64B:int, ldc:int(-345618653))
                
                if (cmple:boolean(var_5_7D = var_17_656:int, sub:int(var_6_84:int, and:int(ldc:int(24649), ldc:int(2453))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(16384)), ldc:int(0))) {
            var_3_64B = and:int(var_3_64B:int, ldc:int(96508012))
            goto(Label_0106)
        }
    }
}
