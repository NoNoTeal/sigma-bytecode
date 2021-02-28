public class \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uc7fe\u6d69\ua3b4\u4f52\u873d {
    public void \uc7fe\u6d69\ua3b4\u4f52\u873d() {
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
            invokespecial:Object(Object::<init>, this:\uc7fe\u6d69\ua3b4\u4f52\u873d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static java.awt.image.BufferedImage \u97e6\u6198\u8258\u446c\ub7dc\u59ec(java.awt.image.BufferedImage p0, int p1) {
        var_2_5F : int
        var_4_A9 : ConvolveOp
        
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
        var_2_5F = and:int(ldc:int(-1726071290), ldc:int(1937694379))
        
        if (cmpeq:boolean(p0:BufferedImage, aconstnull:BufferedImage())) {
            return:BufferedImage(p0:BufferedImage)
        }
        
        do {
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(512)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-657569366))
            }
            else {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-178798709))
                
                if (cmpgt:boolean(invokevirtual:int(BufferedImage::getWidth, p0:BufferedImage), add:int(p1:int, p1:int))) {
                    loopcontinue()
                }
                
                return:BufferedImage(p0:BufferedImage)
            }
        } while (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(1024)), ldc:int(0)))
        
        if (cmpgt:boolean(invokevirtual:int(BufferedImage::getHeight, p0:BufferedImage), add:int(p1:int, p1:int))) {
            var_4_A9 = initobject:ConvolveOp(ConvolveOp::<init>, invokestatic:Kernel(\uc7fe\u6d69\ua3b4\u4f52\u873d::\u624e\u12cb\u93a2\u7006\uc31c\u7e3f, i2f:float(p1:int)))
            return:BufferedImage(invokevirtual:BufferedImage(BufferedImage::getSubimage, invokestatic:BufferedImage(\uc7fe\u6d69\ua3b4\u4f52\u873d::\u8350\u4f52\u62da\ub19c\ubf56\u12cb, invokeinterface:BufferedImage(BufferedImageOp::filter, var_4_A9:ConvolveOp[expected:BufferedImageOp], invokestatic:BufferedImage(\uc7fe\u6d69\ua3b4\u4f52\u873d::\u8350\u4f52\u62da\ub19c\ubf56\u12cb, invokeinterface:BufferedImage(BufferedImageOp::filter, var_4_A9:ConvolveOp[expected:BufferedImageOp], p0:BufferedImage, aconstnull:BufferedImage())), aconstnull:BufferedImage())), p1:int, p1:int, sub:int(sub:int(invokevirtual:int(BufferedImage::getWidth, p0:BufferedImage), p1:int), p1:int), sub:int(sub:int(invokevirtual:int(BufferedImage::getHeight, p0:BufferedImage), p1:int), p1:int)))
        }
        
        return:BufferedImage(p0:BufferedImage)
    }
    
    public static java.awt.image.BufferedImage \ud7e8\ua562\u0c95\u385b\u4f4a\u47c2(java.awt.image.BufferedImage p0, int p1) {
        var_2_5F : int
        var_2_11F : int
        var_4_7D : ConvolveOp
        var_5_83 : int
        var_6_89 : int
        var_7_AE : BufferedImage
        var_8_B7 : int
        var_9_119 : int
        
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
        var_2_5F = and:int(ldc:int(-1386382442), ldc:int(-1486885043))
        
        if (cmpne:boolean(p0:BufferedImage, aconstnull:BufferedImage())) {
            var_2_11F = and:int(var_2_5F:int, ldc:int(-1646432442))
            var_4_7D = initobject:ConvolveOp(ConvolveOp::<init>, invokestatic:Kernel(\uc7fe\u6d69\ua3b4\u4f52\u873d::\u624e\u12cb\u93a2\u7006\uc31c\u7e3f, i2f:float(p1:int)), xor:int(ldc:int(20612), ldc:int(20613)), aconstnull:RenderingHints())
            var_5_83 = invokevirtual:int(BufferedImage::getWidth, p0:BufferedImage)
            var_6_89 = invokevirtual:int(BufferedImage::getHeight, p0:BufferedImage)
            var_7_AE = initobject:BufferedImage(BufferedImage::<init>, add:int(var_6_89:int, mul:int(p1:int, xor:int(ldc:int(8448), ldc:int(8450)))), add:int(var_5_83:int, mul:int(p1:int, xor:int(ldc:int(4384), ldc:int(4386)))), invokevirtual:int(BufferedImage::getType, p0:BufferedImage))
            var_8_B7 = and:int(ldc:int(-689), ldc:int(688))
            
            while (cmplt:boolean(var_8_B7:int, var_5_83:int)) {
                var_9_119 = and:int(ldc:int(26202), ldc:int(-26203))
                
                loop {
                    var_2_11F = and:int(var_2_11F:int, ldc:int(-1925316834))
                    
                    if (cmpge:boolean(var_9_119:int, var_6_89:int)) {
                        looporswitchbreak()
                    }
                    
                    invokevirtual:void(BufferedImage::setRGB, var_7_AE:BufferedImage, add:int(var_8_B7:int, p1:int), add:int(var_9_119:int, div:int(p1:int, xor:int(ldc:int(4129), ldc:int(4131)))), invokevirtual:int(BufferedImage::getRGB, p0:BufferedImage, var_8_B7:int, var_9_119:int))
                    inc:int(var_9_119, ldc:int(1))
                }
                
                var_2_11F = and:int(var_2_11F:int, ldc:int(-1214383322))
                inc:int(var_8_B7, ldc:int(1))
            }
            
            return:BufferedImage(invokevirtual:BufferedImage(BufferedImage::getSubimage, invokestatic:BufferedImage(\uc7fe\u6d69\ua3b4\u4f52\u873d::\u8350\u4f52\u62da\ub19c\ubf56\u12cb, invokeinterface:BufferedImage(BufferedImageOp::filter, var_4_7D:ConvolveOp[expected:BufferedImageOp], invokestatic:BufferedImage(\uc7fe\u6d69\ua3b4\u4f52\u873d::\u8350\u4f52\u62da\ub19c\ubf56\u12cb, invokeinterface:BufferedImage(BufferedImageOp::filter, var_4_7D:ConvolveOp[expected:BufferedImageOp], var_7_AE:BufferedImage, aconstnull:BufferedImage())), aconstnull:BufferedImage())), p1:int, p1:int, sub:int(sub:int(invokevirtual:int(BufferedImage::getWidth, var_7_AE:BufferedImage), p1:int), p1:int), sub:int(sub:int(invokevirtual:int(BufferedImage::getHeight, var_7_AE:BufferedImage), p1:int), p1:int)))
        }
        
        return:BufferedImage(p0:BufferedImage)
    }
    
    public static java.awt.image.BufferedImage \u8350\u4f52\u62da\ub19c\ubf56\u12cb(java.awt.image.BufferedImage p0) {
        var_1_B6 : int
        var_3_64 : int
        var_4_69 : int
        var_5_79 : BufferedImage
        var_6_82 : int
        var_7_B0 : int
        
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
            var_1_B6 = and:int(ldc:int(1134569375), ldc:int(-259817633))
            var_3_64 = invokevirtual:int(BufferedImage::getWidth, p0:BufferedImage)
            var_4_69 = invokevirtual:int(BufferedImage::getHeight, p0:BufferedImage)
            var_5_79 = initobject:BufferedImage(BufferedImage::<init>, var_4_69:int, var_3_64:int, invokevirtual:int(BufferedImage::getType, p0:BufferedImage))
            var_6_82 = and:int(ldc:int(-26583), ldc:int(18390))
            
            loop {
                if (cmpne:boolean(and:int(var_1_B6:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_B6 = and:int(var_1_B6:int, ldc:int(-996835461))
                    
                    if (cmplt:boolean(var_6_82:int, var_3_64:int)) {
                        var_7_B0 = and:int(ldc:int(10641), ldc:int(-11666))
                        
                        loop {
                            var_1_B6 = and:int(var_1_B6:int, ldc:int(-17846373))
                            
                            if (cmpge:boolean(var_7_B0:int, var_4_69:int)) {
                                looporswitchbreak()
                            }
                            
                            invokevirtual:void(BufferedImage::setRGB, var_5_79:BufferedImage, sub:int(sub:int(var_4_69:int, xor:int(ldc:int(34), ldc:int(35))), var_7_B0:int), sub:int(sub:int(var_3_64:int, and:int(ldc:int(555), ldc:int(5))), var_6_82:int), invokevirtual:int(BufferedImage::getRGB, p0:BufferedImage, var_6_82:int, var_7_B0:int))
                            inc:int(var_7_B0, ldc:int(1))
                        }
                        
                        var_1_B6 = and:int(var_1_B6:int, ldc:int(1345025855))
                        inc:int(var_6_82, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_1_B6:int, ldc:int(65536)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:BufferedImage(var_5_79:BufferedImage)
        }
        
        goto(Label_0006)
    }
    
    public static java.awt.image.Kernel \u624e\u12cb\u93a2\u7006\uc31c\u7e3f(float p0) {
        var_1_108 : int
        var_3_66 : int
        var_4_78 : int
        var_5_7E : float[]
        var_6_84 : float
        var_7_8D : float
        var_9_A0 : float
        var_10_A5 : float
        var_11_A8 : float
        var_12_B1 : int
        var_13_B5 : int
        var_14_F3 : float
        var_13_E4 : int
        expr_16F : float[] [generated]
        expr_171 : int [generated]
        
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
            var_1_108 = and:int(ldc:int(417844951), ldc:int(-655368581))
            var_3_66 = d2i:int(invokestatic:double(Math::ceil, f2d:double(p0:float)))
            var_4_78 = add:int(mul:int(var_3_66:int, xor:int(ldc:int(6528), ldc:int(6530))), xor:int(ldc:int(8208), ldc:int(8209)))
            var_5_7E = newarray:float[](float.class, var_4_78:int)
            var_6_84 = div:float(p0:float, ldc:float(3.0f))
            var_7_8D = mul:float(mul:float(ldc:float(2.0f), var_6_84:float), var_6_84:float)
            var_9_A0 = d2f:float(invokestatic:double(Math::sqrt, f2d:double(d2f:float(mul:double(ldc:double(6.283185307179586), f2d:double(var_6_84:float))))))
            var_10_A5 = mul:float(p0:float, p0:float)
            var_11_A8 = ldc:float(0.0f)
            var_12_B1 = and:int(ldc:int(-15906), ldc:int(15873))
            var_13_B5 = neg:int(var_3_66:int)
            
            loop {
                if (cmpeq:boolean(and:int(var_1_108:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_108 = and:int(var_1_108:int, ldc:int(222962775))
                }
                else {
                    var_1_108 = and:int(var_1_108:int, ldc:int(1568141155))
                    
                    if (cmple:boolean(var_13_B5:int, var_3_66:int)) {
                        var_14_F3 = i2f:float(mul:int(var_13_B5:int, var_13_B5:int))
                        
                        if (cmpgt:boolean(var_14_F3:float, var_10_A5:float)) {
                            storeelement:float(var_5_7E:float[], var_12_B1:int, ldc:float(0.0f))
                            goto(Label_0297)
                        }
                        
                        Label_0253:
                        
                        if (cmpeq:boolean(and:int(var_1_108:int, ldc:int(33554432)), ldc:int(0))) {
                            var_1_108 = and:int(var_1_108:int, ldc:int(-596640865))
                            storeelement:float(var_5_7E:float[], var_12_B1:int, div:float(d2f:float(invokestatic:double(Math::exp, f2d:double(div:float(neg:float(var_14_F3:float), var_7_8D:float)))), var_9_A0:float))
                        }
                        
                        Label_0297:
                        
                        if (cmpeq:boolean(and:int(var_1_108:int, ldc:int(1048576)), ldc:int(0))) {
                            var_1_108 = and:int(var_1_108:int, ldc:int(494403535))
                            var_11_A8 = add:float(var_11_A8:float, loadelement:float(var_5_7E:float[], var_12_B1:int))
                            inc:int(var_12_B1, ldc:int(1))
                            inc:int(var_13_B5, ldc:int(1))
                            loopcontinue()
                        }
                        
                        goto(Label_0253)
                    }
                }
                
                if (cmpne:boolean(and:int(var_1_108:int, ldc:int(2147483647)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_13_E4 = and:int(ldc:int(1078), ldc:int(-11320))
            
            while (cmplt:boolean(var_13_E4:int, var_4_78:int)) {
                expr_16F = var_5_7E:float[]
                expr_171 = var_13_E4:int
                storeelement:float(expr_16F:float[], expr_171:int, div:float(loadelement:float(expr_16F:float[], expr_171:int), var_11_A8:float))
                inc:int(var_13_E4, ldc:int(1))
            }
            
            return:Kernel(initobject:Kernel(Kernel::<init>, var_4_78:int, xor:int(ldc:int(17504), ldc:int(17505)), var_5_7E:float[]))
        }
        
        goto(Label_0006)
    }
    
    public static java.awt.image.BufferedImage \u34df\u8d98\ua3b4\u873d\ud217\u4c2b(int p0, int p1, int p2, int p3, int p4, int p5, int p6, boolean p7) {
        var_8_61 : int
        var_10_6A : int
        var_8_27E : int
        var_11_B9 : ByteBuffer
        var_12_E8 : BufferedImage
        var_13_F4 : int
        var_14_190 : int
        var_15_28A : int
        
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
        var_8_61 = and:int(ldc:int(-2025881963), ldc:int(-453181481))
        var_10_6A = and:int(ldc:int(16413), ldc:int(900))
        p1 = f2i:int(mul:float(i2f:float(p1:int), getstatic:float(\ucfaf\ud217\u8df4\u52d3\u446c::\u0b8e\u74b1\ud36e\u9a18\ud36e)))
        p0 = f2i:int(mul:float(i2f:float(p0:int), getstatic:float(\ucfaf\ud217\u8df4\u52d3\u446c::\u0b8e\u74b1\ud36e\u9a18\ud36e)))
        p2 = f2i:int(mul:float(i2f:float(p2:int), getstatic:float(\ucfaf\ud217\u8df4\u52d3\u446c::\u0b8e\u74b1\ud36e\u9a18\ud36e)))
        p3 = f2i:int(mul:float(i2f:float(p3:int), getstatic:float(\ucfaf\ud217\u8df4\u52d3\u446c::\u0b8e\u74b1\ud36e\u9a18\ud36e)))
        p4 = f2i:int(mul:float(i2f:float(p4:int), getstatic:float(\ucfaf\ud217\u8df4\u52d3\u446c::\u0b8e\u74b1\ud36e\u9a18\ud36e)))
        p1 = sub:int(sub:int(invokevirtual:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\ucef1\u7c6b\u6d99\ud36e\u8bb0\u927d, getfield:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u98a4\uc2bd\ufcaf\u8d90\u9255\u8709, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350))), p1:int), p3:int)
        
        if (cmple:boolean(p4:int, ldc:int(0))) {
            p4 = and:int(ldc:int(6213), ldc:int(17))
        }
        
        var_8_27E = and:int(var_8_61:int, ldc:int(-706782465))
        var_11_B9 = invokestatic:ByteBuffer(BufferUtils::createByteBuffer, mul:int(mul:int(p2:int, p3:int), var_10_6A:int))
        invokestatic:void(GL11::glReadPixels, p0:int, p1:int, p2:int, p3:int, and:int(ldc:int(7112), ldc:int(6424)), xor:int(ldc:int(1935), ldc:int(5006)), var_11_B9:ByteBuffer)
        var_12_E8 = initobject:BufferedImage(BufferedImage::<init>, div:int(p2:int, p4:int), div:int(p3:int, p4:int), and:int(ldc:int(16529), ldc:int(1)))
        var_13_F4 = div:int(p4:int, xor:int(ldc:int(7), ldc:int(5)))
        
        while (cmplt:boolean(var_13_F4:int, p2:int)) {
            var_14_190 = div:int(p4:int, and:int(ldc:int(17415), ldc:int(4618)))
            
            loop {
                if (cmpeq:boolean(and:int(var_8_27E:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_0579)
                }
                
                if (cmpne:boolean(and:int(var_8_27E:int, ldc:int(268435456)), ldc:int(0))) {
                    var_8_27E = and:int(var_8_27E:int, ldc:int(-2030382474))
                    goto(Label_0536)
                }
                
                if (cmpeq:boolean(and:int(var_8_27E:int, ldc:int(67108864)), ldc:int(0))) {
                    var_8_27E = and:int(var_8_27E:int, ldc:int(-260441814))
                }
                else {
                    var_8_27E = and:int(var_8_27E:int, ldc:int(-717366649))
                    
                    if (cmplt:boolean(var_14_190:int, p3:int)) {
                        if (cmplt:boolean(div:int(var_13_F4:int, p4:int), div:int(p2:int, p4:int))) {
                            goto(Label_0536)
                        }
                        
                        goto(Label_0778)
                    }
                }
                
                Label_0459:
                
                if (cmpne:boolean(and:int(var_8_27E:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_0579)
                }
                
                if (cmpeq:boolean(and:int(var_8_27E:int, ldc:int(67108864)), ldc:int(0))) {
                    var_8_27E = and:int(var_8_27E:int, ldc:int(1936941638))
                }
                else {
                    if (cmpeq:boolean(and:int(var_8_27E:int, ldc:int(4096)), ldc:int(0))) {
                        var_8_27E = and:int(var_8_27E:int, ldc:int(-1507966834))
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                Label_0536:
                
                if (cmpeq:boolean(and:int(var_8_27E:int, ldc:int(32)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_8_27E:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0459)
                    }
                    
                    if (cmpeq:boolean(and:int(var_8_27E:int, ldc:int(524288)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_8_27E = and:int(var_8_27E:int, ldc:int(-948012307))
                    
                    if (cmpge:boolean(div:int(var_14_190:int, p4:int), div:int(p3:int, p4:int))) {
                        goto(Label_0778)
                    }
                }
                
                Label_0579:
                
                if (cmpeq:boolean(and:int(var_8_27E:int, ldc:int(67108864)), ldc:int(0))) {
                    var_8_27E = and:int(var_8_27E:int, ldc:int(1132147556))
                    goto(Label_0536)
                }
                
                if (cmpne:boolean(and:int(var_8_27E:int, ldc:int(2)), ldc:int(0))) {
                    var_8_27E = and:int(var_8_27E:int, ldc:int(-1860614281))
                    goto(Label_0459)
                }
                
                if (cmpne:boolean(and:int(var_8_27E:int, ldc:int(134217728)), ldc:int(0))) {
                    var_8_27E = and:int(var_8_27E:int, ldc:int(-1366214280))
                    loopcontinue()
                }
                
                var_8_27E = and:int(var_8_27E:int, ldc:int(-964829259))
                var_15_28A = mul:int(add:int(var_13_F4:int, mul:int(p2:int, var_14_190:int)), var_10_6A:int)
                invokevirtual:void(BufferedImage::setRGB, var_12_E8:BufferedImage, div:int(var_13_F4:int, p4:int), sub:int(div:int(p3:int, p4:int), add:int(div:int(var_14_190:int, p4:int), xor:int(ldc:int(396), ldc:int(397)))), or:int(or:int(or:int(ldc:int(-16777216), shl:int(and:int(invokevirtual:byte(ByteBuffer::get, var_11_B9:ByteBuffer, var_15_28A:int), xor:int(ldc:int(13369), ldc:int(13510))), ldc:int(16))), shl:int(and:int(invokevirtual:byte(ByteBuffer::get, var_11_B9:ByteBuffer, add:int(var_15_28A:int, and:int(ldc:int(18963), ldc:int(1025)))), and:int(ldc:int(7423), ldc:int(767))), ldc:int(8))), and:int(invokevirtual:byte(ByteBuffer::get, var_11_B9:ByteBuffer, add:int(var_15_28A:int, and:int(ldc:int(26), ldc:int(19587)))), and:int(ldc:int(25087), ldc:int(1279)))))
                Label_0778:
                var_8_27E = and:int(var_8_27E:int, ldc:int(-1625399369))
                var_14_190 = add:int(var_14_190:int, p4:int)
            }
            
            var_8_27E = and:int(var_8_27E:int, ldc:int(-138519579))
            var_13_F4 = add:int(var_13_F4:int, p4:int)
        }
        
        loop {
            if (cmpne:boolean(and:int(var_8_27E:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0348)
            }
            
            if (cmpeq:boolean(and:int(var_8_27E:int, ldc:int(268435456)), ldc:int(0))) {
                var_8_27E = and:int(var_8_27E:int, ldc:int(-2072159553))
                
                if (cmple:boolean(p5:int, xor:int(ldc:boolean(0), ldc:boolean(1)))) {
                    return:BufferedImage(var_12_E8:BufferedImage)
                }
            }
            
            Label_0310:
            
            if (cmpeq:boolean(and:int(var_8_27E:int, ldc:int(524288)), ldc:int(0))) {
                var_8_27E = and:int(var_8_27E:int, ldc:int(-318156291))
            }
            else {
                if (cmpeq:boolean(and:int(var_8_27E:int, ldc:int(512)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_8_27E = and:int(var_8_27E:int, ldc:int(-543203369))
                
                if (p7:boolean) {
                    return:BufferedImage(invokestatic:BufferedImage(\uc7fe\u6d69\ua3b4\u4f52\u873d::\u97e6\u6198\u8258\u446c\ub7dc\u59ec, invokestatic:BufferedImage(\uc7fe\u6d69\ua3b4\u4f52\u873d::\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a, var_12_E8:BufferedImage, p5:int), p5:int))
                }
            }
            
            Label_0348:
            
            if (cmpeq:boolean(and:int(var_8_27E:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0310)
            }
            
            if (cmpne:boolean(and:int(var_8_27E:int, ldc:int(1048576)), ldc:int(0))) {
                return:BufferedImage(invokestatic:BufferedImage(\uc7fe\u6d69\ua3b4\u4f52\u873d::\u97e6\u6198\u8258\u446c\ub7dc\u59ec, invokestatic:BufferedImage(\uc7fe\u6d69\ua3b4\u4f52\u873d::\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a, var_12_E8:BufferedImage, p5:int, p6:int), p5:int))
            }
        }
    }
    
    public static java.awt.image.BufferedImage \u34df\u8d98\ua3b4\u873d\ud217\u4c2b(int p0, int p1, int p2, int p3, int p4, int p5) {
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
            return:BufferedImage(invokestatic:BufferedImage(\uc7fe\u6d69\ua3b4\u4f52\u873d::\u34df\u8d98\ua3b4\u873d\ud217\u4c2b, p0:int, p1:int, p2:int, p3:int, p4:int, p5:int, getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u6c56\u3c25\u7af6\u4492\u97e6)), and:int[expected:boolean](ldc:int(-9037), ldc:int(9036))))
        }
        
        goto(Label_0006)
    }
    
    public static java.awt.image.BufferedImage \u34df\u8d98\ua3b4\u873d\ud217\u4c2b(int p0, int p1, int p2, int p3, int p4, int p5, int p6) {
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
            return:BufferedImage(invokestatic:BufferedImage(\uc7fe\u6d69\ua3b4\u4f52\u873d::\u34df\u8d98\ua3b4\u873d\ud217\u4c2b, p0:int, p1:int, p2:int, p3:int, p4:int, p5:int, p6:int, and:int[expected:boolean](ldc:int(6458), ldc:int(-6523))))
        }
        
        goto(Label_0006)
    }
    
    public static java.awt.image.BufferedImage \u34df\u8d98\ua3b4\u873d\ud217\u4c2b(int p0, int p1, int p2, int p3, int p4, int p5, boolean p6) {
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
            return:BufferedImage(invokestatic:BufferedImage(\uc7fe\u6d69\ua3b4\u4f52\u873d::\u34df\u8d98\ua3b4\u873d\ud217\u4c2b, p0:int, p1:int, p2:int, p3:int, p4:int, p5:int, getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u6c56\u3c25\u7af6\u4492\u97e6)), p6:boolean))
        }
        
        goto(Label_0006)
    }
    
    public static java.awt.image.BufferedImage \u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a(java.awt.image.BufferedImage p0, int p1, int p2) {
        var_3_C4 : int
        var_5_6E : int
        var_6_7E : int
        var_7_8F : BufferedImage
        var_8_A7 : int
        var_9_E2 : int
        
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
        var_3_C4 = and:int(ldc:int(-797186184), ldc:int(-536906375))
        var_5_6E = add:int(invokevirtual:int(BufferedImage::getWidth, p0:BufferedImage), mul:int(p1:int, and:int(ldc:int(2082), ldc:int(923))))
        var_6_7E = add:int(invokevirtual:int(BufferedImage::getHeight, p0:BufferedImage), mul:int(p1:int, xor:int(ldc:int(1033), ldc:int(1035))))
        var_7_8F = initobject:BufferedImage(BufferedImage::<init>, var_5_6E:int, var_6_7E:int, invokevirtual:int(BufferedImage::getType, p0:BufferedImage))
        
        if (cmpeq:boolean(p2:int, getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u6c56\u3c25\u7af6\u4492\u97e6)))) {
            goto(Label_0155)
        }
        
        var_8_A7 = and:int(ldc:int(-16353), ldc:int(16320))
        goto(Label_0185)
        Label_0228:
        
        while (cmpne:boolean(and:int(var_3_C4:int, ldc:int(1048576)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_3_C4:int, ldc:int(2)), ldc:int(0))) {
                var_3_C4 = and:int(var_3_C4:int, ldc:int(1571181100))
                goto(Label_0272)
            }
            
            var_3_C4 = and:int(var_3_C4:int, ldc:int(-60875271))
            
            if (cmpge:boolean(var_9_E2:int, var_6_7E:int)) {
                goto(Label_0272)
            }
            
            invokevirtual:void(BufferedImage::setRGB, var_7_8F:BufferedImage, var_8_A7:int, var_9_E2:int, p2:int)
            inc:int(var_9_E2, ldc:int(1))
        }
        
        var_3_C4 = and:int(var_3_C4:int, ldc:int(1078573113))
        Label_0380:
        
        while (cmpne:boolean(and:int(var_3_C4:int, ldc:int(256)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_3_C4:int, ldc:int(1073741824)), ldc:int(0))) {
                var_3_C4 = and:int(var_3_C4:int, ldc:int(95852048))
                goto(Label_0228)
            }
            
            var_3_C4 = and:int(var_3_C4:int, ldc:int(-614738081))
            
            if (cmpge:boolean(var_9_E2:int, invokevirtual:int(BufferedImage::getHeight, p0:BufferedImage))) {
                var_3_C4 = and:int(var_3_C4:int, ldc:int(-689973424))
                inc:int(var_8_A7, ldc:int(1))
                goto(Label_0332)
            }
            
            invokevirtual:void(BufferedImage::setRGB, var_7_8F:BufferedImage, add:int(p1:int, var_8_A7:int), add:int(p1:int, var_9_E2:int), invokevirtual:int(BufferedImage::getRGB, p0:BufferedImage, var_8_A7:int, var_9_E2:int))
            inc:int(var_9_E2, ldc:int(1))
        }
        
        goto(Label_0272)
        Label_0155:
        var_3_C4 = and:int(var_3_C4:int, ldc:int(-227057703))
        var_8_A7 = and:int(ldc:int(-25148), ldc:int(25139))
        goto(Label_0332)
        Label_0185:
        
        if (cmpeq:boolean(and:int(var_3_C4:int, ldc:int(16)), ldc:int(0))) {
            var_3_C4 = and:int(var_3_C4:int, ldc:int(-1353437817))
            goto(Label_0341)
        }
        
        var_3_C4 = and:int(var_3_C4:int, ldc:int(-60848293))
        
        if (cmpge:boolean(var_8_A7:int, var_5_6E:int)) {
            goto(Label_0155)
        }
        
        var_9_E2 = and:int(ldc:int(-19881), ldc:int(19880))
        goto(Label_0228)
        Label_0272:
        
        if (cmpne:boolean(and:int(var_3_C4:int, ldc:int(128)), ldc:int(0))) {
            var_3_C4 = and:int(var_3_C4:int, ldc:int(-964369528))
            goto(Label_0380)
        }
        
        if (cmpne:boolean(and:int(var_3_C4:int, ldc:int(1024)), ldc:int(0))) {
            var_3_C4 = and:int(var_3_C4:int, ldc:int(-251689095))
            inc:int(var_8_A7, ldc:int(1))
            goto(Label_0185)
        }
        
        goto(Label_0228)
        Label_0332:
        
        if (cmplt:boolean(var_8_A7:int, invokevirtual:int(BufferedImage::getWidth, p0:BufferedImage))) {
            var_9_E2 = and:int(ldc:int(2925), ldc:int(-2944))
            goto(Label_0380)
        }
        
        Label_0341:
        
        if (cmpeq:boolean(and:int(var_3_C4:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_C4 = and:int(var_3_C4:int, ldc:int(-363005731))
            goto(Label_0185)
        }
        
        return:BufferedImage(var_7_8F:BufferedImage)
    }
    
    public static java.awt.image.BufferedImage \u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a(java.awt.image.BufferedImage p0, int p1) {
        var_2_DF : int
        var_6_9A : BufferedImage
        var_7_A3 : int
        var_8_D8 : int
        
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
            var_2_DF = and:int(ldc:int(-306903229), ldc:int(-239268665))
            var_6_9A = invokestatic:BufferedImage(\uc7fe\u6d69\ua3b4\u4f52\u873d::\u76bc\u5fe1\u5fe1\u36d3\u93a2\u3d64, p0:BufferedImage, f2d:double(div:float(i2f:float(add:int(invokevirtual:int(BufferedImage::getWidth, p0:BufferedImage), mul:int(p1:int, and:int(ldc:int(1794), ldc:int(22559))))), i2f:float(invokevirtual:int(BufferedImage::getWidth, p0:BufferedImage)))), f2d:double(div:float(i2f:float(add:int(invokevirtual:int(BufferedImage::getHeight, p0:BufferedImage), mul:int(p1:int, xor:int(ldc:int(16896), ldc:int(16898))))), i2f:float(invokevirtual:int(BufferedImage::getHeight, p0:BufferedImage)))))
            var_7_A3 = and:int(ldc:int(-14100), ldc:int(13827))
            
            loop {
                if (cmpne:boolean(and:int(var_2_DF:int, ldc:int(536870912)), ldc:int(0))) {
                    var_2_DF = and:int(var_2_DF:int, ldc:int(-1141441294))
                    
                    if (cmplt:boolean(var_7_A3:int, invokevirtual:int(BufferedImage::getWidth, p0:BufferedImage))) {
                        var_8_D8 = and:int(ldc:int(2378), ldc:int(-2379))
                        
                        loop {
                            var_2_DF = and:int(var_2_DF:int, ldc:int(-153635081))
                            
                            if (cmpge:boolean(var_8_D8:int, invokevirtual:int(BufferedImage::getHeight, p0:BufferedImage))) {
                                looporswitchbreak()
                            }
                            
                            invokevirtual:void(BufferedImage::setRGB, var_6_9A:BufferedImage, add:int(p1:int, var_7_A3:int), add:int(p1:int, var_8_D8:int), invokevirtual:int(BufferedImage::getRGB, p0:BufferedImage, var_7_A3:int, var_8_D8:int))
                            inc:int(var_8_D8, ldc:int(1))
                        }
                        
                        var_2_DF = and:int(var_2_DF:int, ldc:int(-1227047642))
                        inc:int(var_7_A3, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_2_DF:int, ldc:int(536870912)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:BufferedImage(var_6_9A:BufferedImage)
        }
        
        goto(Label_0006)
    }
    
    public static java.awt.image.BufferedImage \uc910\u8d98\u8aa5\u3d4b\u6435\u5140(java.awt.image.BufferedImage p0, float p1, float p2, float p3) {
        var_4_C3 : int
        var_6_69 : int
        var_7_6F : int
        var_8_78 : int
        var_9_BB : int
        var_10_E6 : int
        var_14_11C : float[]
        
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
            var_4_C3 = and:int(ldc:int(-350098424), ldc:int(1847997755))
            var_6_69 = invokevirtual:int(BufferedImage::getWidth, p0:BufferedImage)
            var_7_6F = invokevirtual:int(BufferedImage::getHeight, p0:BufferedImage)
            var_8_78 = and:int(ldc:int(25475), ldc:int(-26524))
            
            loop {
                if (cmpne:boolean(and:int(var_4_C3:int, ldc:int(256)), ldc:int(0))) {
                    var_4_C3 = and:int(var_4_C3:int, ldc:int(-1812997956))
                }
                else {
                    var_4_C3 = and:int(var_4_C3:int, ldc:int(-218858106))
                    
                    if (cmplt:boolean(var_8_78:int, var_7_6F:int)) {
                        var_9_BB = and:int(ldc:int(12466), ldc:int(-13491))
                        
                        loop {
                            var_4_C3 = and:int(var_4_C3:int, ldc:int(-205777847))
                            
                            if (cmpge:boolean(var_9_BB:int, var_6_69:int)) {
                                looporswitchbreak()
                            }
                            
                            var_10_E6 = invokevirtual:int(BufferedImage::getRGB, p0:BufferedImage, var_9_BB:int, var_8_78:int)
                            var_14_11C = invokestatic:float[](Color::RGBtoHSB, and:int(shr:int(var_10_E6:int, ldc:int(16)), xor:int(ldc:int(-32763), ldc:int(-32518))), and:int(shr:int(var_10_E6:int, ldc:int(8)), xor:int(ldc:int(4396), ldc:int(4563))), and:int(var_10_E6:int, and:int(ldc:int(255), ldc:int(28927))), aconstnull:float[]())
                            invokevirtual:void(BufferedImage::setRGB, p0:BufferedImage, var_9_BB:int, var_8_78:int, invokestatic:int(Color::HSBtoRGB, invokestatic:float(Math::max, ldc:float(0.0f), invokestatic:float(Math::min, ldc:float(1.0f), add:float(loadelement:float(var_14_11C:float[], and:int(ldc:int(-7921), ldc:int(6896))), p1:float))), invokestatic:float(Math::max, ldc:float(0.0f), invokestatic:float(Math::min, ldc:float(1.0f), mul:float(loadelement:float(var_14_11C:float[], xor:int(ldc:int(-32640), ldc:int(-32639))), p2:float))), invokestatic:float(Math::max, ldc:float(0.0f), invokestatic:float(Math::min, ldc:float(1.0f), add:float(loadelement:float(var_14_11C:float[], xor:int(ldc:int(16512), ldc:int(16514))), p3:float)))))
                            inc:int(var_9_BB, ldc:int(1))
                        }
                        
                        var_4_C3 = and:int(var_4_C3:int, ldc:int(-207081560))
                        inc:int(var_8_78, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_4_C3:int, ldc:int(536870912)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:BufferedImage(p0:BufferedImage)
        }
        
        goto(Label_0006)
    }
    
    public static java.awt.image.BufferedImage \u76bc\u5fe1\u5fe1\u36d3\u93a2\u3d64(java.awt.image.BufferedImage p0, double p1, double p2) {
        var_7_66 : BufferedImage
        
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
            var_7_66 = aconstnull:BufferedImage()
            
            if (cmpne:boolean(p0:BufferedImage, aconstnull:BufferedImage())) {
                var_7_66 = initobject:BufferedImage(BufferedImage::<init>, d2i:int(mul:double(i2d:double(invokevirtual:int(BufferedImage::getWidth, p0:BufferedImage)), p1:double)), d2i:int(mul:double(i2d:double(invokevirtual:int(BufferedImage::getHeight, p0:BufferedImage)), p2:double)), invokevirtual:int(BufferedImage::getType, p0:BufferedImage))
                invokevirtual:void(Graphics2D::drawRenderedImage, invokevirtual:Graphics2D(BufferedImage::createGraphics, var_7_66:BufferedImage), p0:BufferedImage[expected:RenderedImage], invokestatic:AffineTransform(AffineTransform::getScaleInstance, p1:double, p2:double))
            }
            
            return:BufferedImage(var_7_66:BufferedImage)
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
    
    public void \u9033\u7bad\u446c\u446c\u600f\ud171(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_66B : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_676 : int
        
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
        var_3_66B = and:int(ldc:int(-1360534668), ldc:int(-1377471556))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc7fe\u6d69\ua3b4\u4f52\u873d[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(128)), ldc:int(0))) {
            var_3_66B = and:int(var_3_66B:int, ldc:int(2113754803))
            var_5_81 = and:int(ldc:int(12429), ldc:int(-12432))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-20770), ldc:int(20769)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_66B:int, ldc:int(-1343390024))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, and:int(ldc:int(3089), ldc:int(4681)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, xor:int(ldc:int(8448), ldc:int(8449)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_66B = and:int(var_3_D1:int, ldc:int(1056265398))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(641), ldc:int(18787)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1515)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1401927177))
                        goto(Label_1374)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1216)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1095)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(246310109))
                        goto(Label_0941)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(2145664851))
                        goto(Label_0820)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0712)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0576)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-2114290320))
                    }
                    else {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1021702522))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0576)
                            }
                            
                            goto(Label_0820)
                        }
                    }
                    
                    Label_0399:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1029497770))
                        goto(Label_1515)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1374)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(488642603))
                        goto(Label_1216)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1095)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1627215744))
                        goto(Label_0820)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1402900207))
                        goto(Label_0712)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1430711617))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-1468150319))
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1342877582))
                        var_11_E2 = and:int(ldc:int(-29043), ldc:int(29010))
                        goto(Label_1504)
                    }
                    
                    Label_0576:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1409352480))
                        goto(Label_1515)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1374)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1216)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(16)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(34838499))
                        goto(Label_1095)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(609167277))
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1389427531))
                        goto(Label_0820)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-227242312))
                            goto(Label_0399)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(155136729))
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-143940))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0820)
                        }
                    }
                    
                    Label_0712:
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1515)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1374)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1216)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1095)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1981996184))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-1543959602))
                            goto(Label_0576)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0399)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1023372988))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0820:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(608929312))
                        goto(Label_1515)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(16)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1440097806))
                        goto(Label_1374)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1216)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(2146942844))
                        goto(Label_1095)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0712)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0576)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(591783217))
                            goto(Label_0399)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1575843743))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = xor:int(ldc:int(-32572), ldc:int(-32571))
                                goto(Label_1095)
                            }
                        }
                    }
                    
                    Label_0941:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(16)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1349581782))
                        goto(Label_1515)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1374)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1216)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(853489405))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(1766518727))
                            goto(Label_0820)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0712)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0576)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0399)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(16)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-264919511))
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1628477001))
                        var_11_E2 = and:int(ldc:int(-18481), ldc:int(18480))
                    }
                    
                    Label_1095:
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1515)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(2128112060))
                        goto(Label_1374)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(61584469))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0941)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0820)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(668697880))
                            goto(Label_0712)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-783297338))
                            goto(Label_0576)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0399)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(754794681))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1374)
                            }
                        }
                    }
                    
                    Label_1216:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1183285186))
                        goto(Label_1515)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(1147775051))
                            goto(Label_1095)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(128)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-164880247))
                            goto(Label_0941)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-7987949))
                            goto(Label_0820)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(2)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-894726055))
                            goto(Label_0712)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0576)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(2)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(1206295910))
                            goto(Label_0399)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(637644181))
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1022349747))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                        goto(Label_1504)
                    }
                    
                    Label_1374:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1515)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-29755972))
                        goto(Label_1216)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1095)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1005917496))
                        goto(Label_0941)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1513715259))
                        goto(Label_0820)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0712)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0576)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(569831363))
                        goto(Label_0399)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(16384)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_66B = and:int(var_3_66B:int, ldc:int(-17874477))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1504:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_676 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1515:
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1921395528))
                        goto(Label_1374)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(2129243727))
                        goto(Label_1216)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1599707822))
                        goto(Label_1095)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1374089925))
                        goto(Label_0941)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-980353064))
                        goto(Label_0820)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0712)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(16)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-2081259566))
                        goto(Label_0576)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0399)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(16)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1342320321))
                        var_17_676 = add:int(var_16_110:int, xor:int(ldc:int(-16304), ldc:int(-16303)))
                        looporswitchbreak()
                    }
                }
                
                var_3_66B = and:int(var_3_66B:int, ldc:int(787434358))
                
                if (cmple:boolean(var_5_81 = var_17_676:int, sub:int(var_6_88:int, and:int(ldc:int(4201), ldc:int(16513))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2048)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
