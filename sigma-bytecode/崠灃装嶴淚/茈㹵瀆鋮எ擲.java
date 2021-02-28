public class \u5d20\u7043\u88c5\u5db4\uf94d.\u8308\u3e75\u7006\u92ee\u0b8e\u64f2 {
    public void \u8308\u3e75\u7006\u92ee\u0b8e\u64f2() {
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
            invokespecial:Object(Object::<init>, this:\u8308\u3e75\u7006\u92ee\u0b8e\u64f2)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static java.awt.image.BufferedImage \u3bd6\ua6bd\uae87\uafe7\u36d3\u59ec() {
        var_2_69 : Graphics2D
        
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
            var_2_69 = checkcast:Graphics2D(java.awt.Graphics2D.class, invokevirtual:Graphics[expected:Graphics2D](BufferedImage::getGraphics, getstatic:BufferedImage(\u8308\u3e75\u7006\u92ee\u0b8e\u64f2::\u16f6\ud12e\u0b8e\u0b8e\u8413\u88c5)))
            invokevirtual:void(Graphics2D::setComposite, var_2_69:Graphics2D, getstatic:AlphaComposite[expected:Composite](AlphaComposite::Clear))
            invokevirtual:void(Graphics::fillRect, var_2_69:Graphics2D[expected:Graphics], and:int(ldc:int(4568), ldc:int(-6109)), and:int(ldc:int(1665), ldc:int(-1666)), xor:int(ldc:int(22542), ldc:int(22798)), and:int(ldc:int(4380), ldc:int(2434)))
            invokevirtual:void(Graphics2D::setComposite, var_2_69:Graphics2D, getstatic:AlphaComposite[expected:Composite](AlphaComposite::SrcOver))
            invokevirtual:void(Graphics::setColor, var_2_69:Graphics2D[expected:Graphics], getstatic:Color(Color::white))
            return:BufferedImage(getstatic:BufferedImage(\u8308\u3e75\u7006\u92ee\u0b8e\u64f2::\u16f6\ud12e\u0b8e\u0b8e\u8413\u88c5))
        }
        
        goto(Label_0006)
    }
    
    public static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u92ff\ubf56\u4cd9\ubefe\u4cd9\u8aa5 \u718f\u9033\uc238\uae5d\u71ae\u4e72(java.lang.String p0, java.awt.Color p1) {
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
            return:\u92ff\ubf56\u4cd9\ubefe\u4cd9\u8aa5(initobject:\ub70c\ub7dc\u8df4\u927d\u8258\u6fb0[expected:\u92ff\ubf56\u4cd9\ubefe\u4cd9\u8aa5](\ub70c\ub7dc\u8df4\u927d\u8258\u6fb0::<init>, p0:String, invokestatic:String(\u8308\u3e75\u7006\u92ee\u0b8e\u64f2::toString, p1:Color)))
        }
        
        goto(Label_0006)
    }
    
    public static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u92ff\ubf56\u4cd9\ubefe\u4cd9\u8aa5 \u927d\u0800\ub7dc\u8753\u927d\u6435(java.lang.String p0, int p1, java.lang.String p2) {
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
            return:\u92ff\ubf56\u4cd9\ubefe\u4cd9\u8aa5(initobject:\u9937\uafe7\u5245\uc2e8\u4e72\u9937[expected:\u92ff\ubf56\u4cd9\ubefe\u4cd9\u8aa5](\u9937\uafe7\u5245\uc2e8\u4e72\u9937::<init>, p0:String, invokestatic:String(String::valueOf, p1:int), p1:int, p2:String))
        }
        
        goto(Label_0006)
    }
    
    public static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u92ff\ubf56\u4cd9\ubefe\u4cd9\u8aa5 \u4bc8\u12b2\u8350\u8df4\u88c5\u4f52(java.lang.String p0, float p1, float p2, float p3, java.lang.String p4) {
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
            return:\u92ff\ubf56\u4cd9\ubefe\u4cd9\u8aa5(initobject:\u0c95\u8640\u6bb9\u927d\ud171\ub102[expected:\u92ff\ubf56\u4cd9\ubefe\u4cd9\u8aa5](\u0c95\u8640\u6bb9\u927d\ud171\ub102::<init>, p0:String, invokestatic:String(String::valueOf, p1:float), p1:float, p2:float, p3:float, p4:String))
        }
        
        goto(Label_0006)
    }
    
    public static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u92ff\ubf56\u4cd9\ubefe\u4cd9\u8aa5 \u5245\uc229\u9255\uc31c\ua6bd\u64f2(java.lang.String p0, boolean p1, java.lang.String p2) {
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
            return:\u92ff\ubf56\u4cd9\ubefe\u4cd9\u8aa5(initobject:\ub7dc\u494c\u8753\u8cae\u6198\u3dd3[expected:\u92ff\ubf56\u4cd9\ubefe\u4cd9\u8aa5](\ub7dc\u494c\u8753\u8cae\u6198\u3dd3::<init>, p0:String, invokestatic:String(String::valueOf, p1:boolean), p1:boolean, p2:String))
        }
        
        goto(Label_0006)
    }
    
    public static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u92ff\ubf56\u4cd9\ubefe\u4cd9\u8aa5 \ufe34\u6fb0\uc2e8\u6c52\u759a\ucb79(java.lang.String p0, java.lang.String p1, java.lang.String[][] p2, java.lang.String p3) {
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
            return:\u92ff\ubf56\u4cd9\ubefe\u4cd9\u8aa5(initobject:\u624e\u71f1\ube23\u927d\u8d90\u6b0d[expected:\u92ff\ubf56\u4cd9\ubefe\u4cd9\u8aa5](\u624e\u71f1\ube23\u927d\u8d90\u6b0d::<init>, p0:String, invokevirtual:String(String::toString, p1:String), p2:String[][], p1:String, p3:String))
        }
        
        goto(Label_0006)
    }
    
    public static java.lang.String toString(java.awt.Color p0) {
        var_3_70 : String
        var_4_8B : String
        var_5_A8 : String
        
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
        
        if (cmpne:boolean(p0:Color, aconstnull:Color())) {
            var_3_70 = invokestatic:String(Integer::toHexString, invokevirtual:int(Color::getRed, p0:Color))
            
            if (cmpeq:boolean(invokevirtual:int(String::length, var_3_70:String), and:int(ldc:int(6369), ldc:int(17419)))) {
                var_3_70 = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u8308\u3e75\u7006\u92ee\u0b8e\u64f2::\ucef1\u52d3\u7006\u88c5\ub19c\u8d90), xor:int(ldc:int(2056), ldc:int(2057)))), var_3_70:String))
            }
            
            var_4_8B = invokestatic:String(Integer::toHexString, invokevirtual:int(Color::getGreen, p0:Color))
            
            if (cmpeq:boolean(invokevirtual:int(String::length, var_4_8B:String), xor:int(ldc:int(195), ldc:int(194)))) {
                var_4_8B = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u8308\u3e75\u7006\u92ee\u0b8e\u64f2::\ucef1\u52d3\u7006\u88c5\ub19c\u8d90), xor:int(ldc:int(-23424), ldc:int(-23423)))), var_4_8B:String))
            }
            
            var_5_A8 = invokestatic:String(Integer::toHexString, invokevirtual:int(Color::getBlue, p0:Color))
            
            if (cmpeq:boolean(invokevirtual:int(String::length, var_5_A8:String), xor:int(ldc:int(19488), ldc:int(19489)))) {
                var_5_A8 = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u8308\u3e75\u7006\u92ee\u0b8e\u64f2::\ucef1\u52d3\u7006\u88c5\ub19c\u8d90), and:int(ldc:int(5553), ldc:int(1)))), var_5_A8:String))
            }
            
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), var_3_70:String), var_4_8B:String), var_5_A8:String)))
        }
        
        athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\u8308\u3e75\u7006\u92ee\u0b8e\u64f2::\ucef1\u52d3\u7006\u88c5\ub19c\u8d90), and:int(ldc:int(-7489), ldc:int(7488)))))
    }
    
    public static java.awt.Color \u5f50\ub18d\ud7e8\u624e\uc84e\ub6ab(java.lang.String p0) {
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
        
        if (logicaland:boolean(cmpne:boolean(p0:String, aconstnull:String()), cmpeq:boolean(invokevirtual:int(String::length, p0:String), ldc:int(6)))) {
            return:Color(initobject:Color(Color::<init>, invokestatic:int(Integer::parseInt, invokevirtual:String(String::substring, p0:String, and:int(ldc:int(-19694), ldc:int(2284)), and:int(ldc:int(12546), ldc:int(17046))), ldc:int(16)), invokestatic:int(Integer::parseInt, invokevirtual:String(String::substring, p0:String, and:int(ldc:int(2), ldc:int(8758)), xor:int(ldc:int(2077), ldc:int(2073))), ldc:int(16)), invokestatic:int(Integer::parseInt, invokevirtual:String(String::substring, p0:String, xor:int(ldc:int(641), ldc:int(645)), ldc:int(6)), ldc:int(16))))
        }
        
        return:Color(getstatic:Color(Color::white))
    }
    
    static {
        var_0_99 : int
        expr_65 : byte[] [generated]
        stack_85_0 : byte[] [generated]
        stack_87_0 : byte[] [generated]
        stack_AB_0 : byte[] [generated]
        stack_AD_0 : byte[] [generated]
        stack_D6_0 : byte[] [generated]
        stack_1E1_0 : byte[] [generated]
        stack_236_0 : byte[] [generated]
        expr_6B : int [generated]
        var_4_156 : int
        var_3_15B : byte[]
        var_5_15C : int
        var_0_184 : int
        expr_16C : byte [generated]
        stack_1B0_2 : byte [generated]
        stack_187_0 : byte [generated]
        var_2_85 : byte[]
        expr_89 : int [generated]
        var_3_1D0 : byte[]
        var_5_1D1 : int
        expr_AD : int [generated]
        var_3_225 : byte[]
        var_5_226 : int
        expr_239 : byte [generated]
        var_3_E2 : String
        stack_130_0 : String[] [generated]
        expr_F4 : String[] [generated]
        
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
            var_0_99 = and:int(ldc:int(-205805316), ldc:int(-247599268))
            expr_65 = stack_85_0 = stack_87_0 = stack_AB_0 = stack_AD_0 = stack_D6_0 = stack_1E1_0 = stack_236_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("hyEADhnB8TP1AQYZxu0+uf1O9/LPe64="))
            expr_6B = arraylength:int(expr_65:byte[])
            
            if (cmpne:boolean(expr_6B:int, ldc:int(0))) {
                var_4_156 = expr_6B:int
                var_3_15B = newarray:byte[](byte.class, expr_6B:int)
                var_5_15C = expr_6B:int
                
                loop {
                    var_0_184 = and:int(var_0_99:int, ldc:int(-180355654))
                    var_5_15C = add:int(var_5_15C:int, ldc:int(-1))
                    expr_16C = stack_1B0_2 = loadelement(expr_65, var_5_15C)
                    
                    if (cmplt:boolean(add:int(add:int(var_5_15C:int, ldc:int(2)), neg:int(var_4_156:int)), ldc:int(0))) {
                        stack_1B0_2 = stack_187_0 = add:byte(expr_16C:byte, loadelement:byte(var_3_15B:byte[], add:int(var_5_15C:int, ldc:int(2))))
                        goto(Label_0407)
                    }
                    
                    Label_0377:
                    
                    if (cmpne:boolean(and:int(var_0_184:int, ldc:int(1048576)), ldc:int(0))) {
                        var_0_184 = and:int(var_0_184:int, ldc:int(-281039022))
                        stack_1B0_2 = stack_187_0 = add:byte(expr_16C:byte, ldc:byte(2))
                    }
                    
                    Label_0407:
                    
                    if (cmpne:boolean(and:int(var_0_184:int, ldc:int(1)), ldc:int(0))) {
                        var_0_184 = and:int(var_0_184:int, ldc:int(2104036108))
                        goto(Label_0377)
                    }
                    
                    var_0_99 = and:int(var_0_184:int, ldc:int(-138412898))
                    storeelement:byte(var_3_15B:byte[], var_5_15C:int, stack_1B0_2:byte)
                    
                    if (cmpne:boolean(var_5_15C:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_87_0 = stack_85_0 = stack_AB_0 = stack_AD_0 = stack_D6_0 = stack_1E1_0 = stack_236_0 = var_3_15B:byte[]
            }
            
            loop {
                if (cmpne:boolean(and:int(var_0_99:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_0178)
                }
                
                if (cmpne:boolean(and:int(var_0_99:int, ldc:int(16)), ldc:int(0))) {
                    var_0_99 = and:int(var_0_99:int, ldc:int(-71438530))
                    var_2_85 = stack_85_0:byte[]
                    expr_89 = add:int(arraylength:int(stack_87_0:byte[]), ldc:int(-1))
                    
                    if (cmpne:boolean(expr_89:int, ldc:int(0))) {
                        var_3_1D0 = newarray:byte[](byte.class, expr_89:int)
                        var_5_1D1 = expr_89:int
                        
                        loop {
                            var_0_99 = and:int(var_0_99:int, ldc:int(-302273192))
                            var_5_1D1 = add:int(var_5_1D1:int, ldc:int(-1))
                            storeelement:byte(var_3_1D0:byte[], var_5_1D1:int, add:int(shl:int(loadelement:byte(stack_1E1_0:byte[], var_5_1D1:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_85:byte[], add:int(var_5_1D1:int, xor:int(ldc:int(11268), ldc:int(11269)))), ldc:int(4)), xor:int(ldc:int(-31220), ldc:int(-31229)))))
                            
                            if (cmpne:boolean(var_5_1D1:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_87_0 = stack_85_0 = stack_AB_0 = stack_AD_0 = stack_D6_0 = stack_1E1_0 = stack_236_0 = var_3_1D0:byte[]
                    }
                }
                
                Label_0142:
                
                if (cmpeq:boolean(and:int(var_0_99:int, ldc:int(2048)), ldc:int(0))) {
                    var_0_99 = and:int(var_0_99:int, ldc:int(-826990628))
                }
                else {
                    if (cmpeq:boolean(and:int(var_0_99:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_99 = and:int(var_0_99:int, ldc:int(-176165319))
                    expr_AD = arraylength:int(stack_AD_0:byte[])
                    
                    if (cmpne:boolean(expr_AD:int, ldc:int(0))) {
                        var_3_225 = newarray:byte[](byte.class, expr_AD:int)
                        var_5_226 = expr_AD:int
                        
                        loop {
                            var_0_99 = and:int(var_0_99:int, ldc:int(-310384292))
                            var_5_226 = add:int(var_5_226:int, ldc:int(-1))
                            expr_239 = add:byte(loadelement:byte(stack_236_0:byte[], var_5_226:int), ldc:byte(124))
                            storeelement:byte(var_3_225:byte[], var_5_226:int, xor:int(or:int(and:int(shl:int(expr_239:byte, and:int(ldc:int(16452), ldc:int(822))), ldc:int(-16)), and:int(shr:int(expr_239:byte[expected:int], and:int(ldc:int(324), ldc:int(18100))), ldc:int(15))), ldc:int(91)))
                            
                            if (cmpne:boolean(var_5_226:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_87_0 = stack_85_0 = stack_AB_0 = stack_AD_0 = stack_D6_0 = stack_1E1_0 = stack_236_0 = var_3_225:byte[]
                    }
                }
                
                Label_0178:
                
                if (cmpeq:boolean(and:int(var_0_99:int, ldc:int(2048)), ldc:int(0))) {
                    var_0_99 = and:int(var_0_99:int, ldc:int(1530343433))
                    goto(Label_0142)
                }
                
                if (cmpeq:boolean(and:int(var_0_99:int, ldc:int(1)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_99 = and:int(var_0_99:int, ldc:int(622679283))
            }
            
            var_3_E2 = initobject:String(String::<init>, stack_D6_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_130_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(178), ldc:int(16450)))
            expr_F4 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-27644), ldc:int(-27642)))
            storeelement:String(expr_F4:String[], and:int(ldc:int(4129), ldc:int(1155)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(-14202), ldc:int(13160)), xor:int(ldc:int(-4096), ldc:int(-4095))))
            storeelement:String(expr_F4:String[], and:int(ldc:int(1038), ldc:int(-1039)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(33), ldc:int(5331)), xor:int(ldc:int(338), ldc:int(324))))
            putstatic:String[](\u8308\u3e75\u7006\u92ee\u0b8e\u64f2::\ucef1\u52d3\u7006\u88c5\ub19c\u8d90, expr_F4:String[])
            putstatic:BufferedImage(\u8308\u3e75\u7006\u92ee\u0b8e\u64f2::\u16f6\ud12e\u0b8e\u0b8e\u8413\u88c5, initobject:BufferedImage(BufferedImage::<init>, xor:int(ldc:int(2086), ldc:int(2342)), xor:int(ldc:int(24725), ldc:int(24981)), and:int(ldc:int(1034), ldc:int(24722))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ud158\u4ab3\u92ee\u927d\u6b5f\u71f1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6AF : int
        var_5_89 : int
        var_6_90 : int
        var_7_9F : double
        var_9_C7 : double
        var_3_D9 : int
        var_11_EA : int
        var_14_114 : double
        var_16_118 : int
        var_12_110 : double
        var_17_6BA : int
        
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
        var_3_6AF = and:int(ldc:int(-1824609684), ldc:int(-747688968))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8308\u3e75\u7006\u92ee\u0b8e\u64f2[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0179)
        }
        
        Label_0107:
        
        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(16384)), ldc:int(0))) {
            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1326058624))
        }
        else {
            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-689112067))
            var_5_89 = and:int(ldc:int(16961), ldc:int(-16962))
            var_6_90 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9F = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(8362), ldc:int(-8363)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C7 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D9 = and:int(var_3_6AF:int, ldc:int(-1752204435))
                    var_9_C7 = sub:double(var_7_9F:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EA = var_5_89:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EA:int, sub:int(var_6_90:int, xor:int(ldc:int(6404), ldc:int(6405)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EA:int, and:int(ldc:int(9), ldc:int(16981)))), var_7_9F:double))) {
                        inc:int(var_11_EA, ldc:int(1))
                    }
                    
                    var_3_6AF = and:int(var_3_D9:int, ldc:int(-1312003073))
                    var_14_114 = var_7_9F:double
                    var_16_118 = var_11_EA:int
                }
                else {
                    var_11_EA = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_89:int), xor:int(ldc:int(-23296), ldc:int(-23295)))
                    var_12_110 = var_14_114 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89)
                    
                    if (cmplt:boolean(var_16_118 = var_11_EA:int, var_6_90:int)) {
                        var_9_C7 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EA:int)
                        var_16_118 = var_11_EA:int
                        var_14_114 = var_12_110:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1739395912))
                        goto(Label_1590)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(312604008))
                        goto(Label_1444)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1329884334))
                        goto(Label_1291)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1177)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1179827680))
                        goto(Label_1017)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0883)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0724)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1918647914))
                        goto(Label_0592)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1914674595))
                    }
                    else {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1817202696))
                        
                        if (cmplt:boolean(var_16_118:int, var_6_90:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0592)
                            }
                            
                            goto(Label_0883)
                        }
                    }
                    
                    Label_0427:
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1104390484))
                        goto(Label_1590)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1444)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-86486958))
                        goto(Label_1291)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1463154167))
                        goto(Label_1177)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1455638613))
                        goto(Label_1017)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0883)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0724)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(512)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-549568533))
                            var_11_EA = and:int(ldc:int(4314), ldc:int(-6363))
                            goto(Label_1579)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0592:
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1550197251))
                        goto(Label_1590)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1537492275))
                        goto(Label_1444)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1337023842))
                        goto(Label_1291)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-9370098))
                        goto(Label_1177)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1017)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0883)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1283912855))
                            goto(Label_0427)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-113312146))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_114 = var_9_C7:double
                            goto(Label_0883)
                        }
                    }
                    
                    Label_0724:
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(705850378))
                        goto(Label_1590)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1547940963))
                        goto(Label_1444)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1291)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1725934106))
                        goto(Label_1177)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1667638168))
                        goto(Label_1017)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1073424433))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(1441244737))
                            goto(Label_0592)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0427)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-92090549))
                            loopcontinue()
                        }
                        
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1786877076))
                        var_14_114 = mul:double(ldc:double(0.5), add:double(var_9_C7:double, var_14_114:double))
                    }
                    
                    Label_0883:
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-227943502))
                        goto(Label_1590)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1444)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(92382077))
                        goto(Label_1291)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-773565012))
                        goto(Label_1177)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-2101777315))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0724)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0592)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0427)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(332582607))
                            loopcontinue()
                        }
                        
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-646136194))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89:int), var_7_9F:double)) {
                                var_11_EA = and:int(ldc:int(29717), ldc:int(129))
                                goto(Label_1177)
                            }
                        }
                    }
                    
                    Label_1017:
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1023547186))
                        goto(Label_1590)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1444)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1291)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0883)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0724)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(32)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(2007159165))
                            goto(Label_0592)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1549431167))
                            goto(Label_0427)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-297864619))
                            loopcontinue()
                        }
                        
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1239553288))
                        var_11_EA = and:int(ldc:int(19022), ldc:int(-19055))
                    }
                    
                    Label_1177:
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(2012856393))
                        goto(Label_1590)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(2135196392))
                        goto(Label_1444)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(1723613720))
                            goto(Label_1017)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0883)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0724)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0592)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0427)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-178278674))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                                goto(Label_1444)
                            }
                        }
                    }
                    
                    Label_1291:
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1562922504))
                        goto(Label_1590)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1664256946))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(1573659923))
                            goto(Label_1177)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_1017)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0883)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(32)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(1182884859))
                            goto(Label_0724)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-926385389))
                            goto(Label_0592)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0427)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-387780474))
                            loopcontinue()
                        }
                        
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-550573458))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_114:double, var_5_89:int, var_16_118:int)
                        goto(Label_1579)
                    }
                    
                    Label_1444:
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-2115528330))
                        goto(Label_1590)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1291)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1177)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(885845512))
                        goto(Label_1017)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1042677954))
                        goto(Label_0883)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0724)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0592)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1449239281))
                        loopcontinue()
                    }
                    
                    var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1218549143))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_114:double, ldc:double(0.0))
                    Label_1579:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6BA = var_5_89:int
                        
                        if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1590:
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1444)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(541987735))
                        goto(Label_1291)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1177)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1622264235))
                        goto(Label_1017)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1532570714))
                        goto(Label_0883)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0724)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1895428754))
                        goto(Label_0592)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0427)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-538002436))
                        var_17_6BA = add:int(var_16_118:int, xor:int(ldc:int(270), ldc:int(271)))
                        looporswitchbreak()
                    }
                    
                    var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1754901945))
                }
                
                var_3_6AF = and:int(var_3_6AF:int, ldc:int(-637600788))
                
                if (cmple:boolean(var_5_89 = var_17_6BA:int, sub:int(var_6_90:int, and:int(ldc:int(6169), ldc:int(1155))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0179:
        
        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(134217728)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0107)
    }
}
