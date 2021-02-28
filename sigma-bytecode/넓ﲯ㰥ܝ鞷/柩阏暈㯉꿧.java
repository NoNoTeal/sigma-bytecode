public class \ub113\ufcaf\u3c25\u071d\u97b7.\u67e9\u960f\uf9c5\u3bc9\uafe7 {
    public void \u67e9\u960f\uf9c5\u3bc9\uafe7() {
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
            invokespecial:Object(Object::<init>, this:\u67e9\u960f\uf9c5\u3bc9\uafe7)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe \u071d\u3bd6\u071d\u446c\u3711\u416d(java.lang.String p0, java.awt.image.BufferedImage p1) {
        var_2_5F : int
        var_4_75 : BufferedImage
        var_5_90 : BufferedImage
        var_6_9E : int
        var_7_F2 : int
        var_8_15E : Color
        var_9_1A7 : int
        stack_1FD_0 : \ubcb0\uc246\ua6bd\u527a\u97e6\ubefe [generated]
        var_4_202 : IOException
        
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
        var_2_5F = and:int(ldc:int(1321821658), ldc:int(115141857))
        
        try {
            var_2_5F = and:int(var_2_5F:int, ldc:int(886897352))
            var_4_75 = invokestatic:BufferedImage(ImageIO::read, invokevirtual:InputStream(ClassLoader::getResourceAsStream, invokevirtual:ClassLoader(Class<T>::getClassLoader, invokevirtual:Class<? extends \u6b0d\ua068\uc4d2\u5245\u4d85>(\u6b0d\ua068\uc4d2\u5245\u4d85::getClass, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c))), p0:String))
            var_2_5F = and:int(var_2_5F:int, ldc:int(-1208457730))
            var_5_90 = initobject:BufferedImage(BufferedImage::<init>, invokevirtual:int(BufferedImage::getWidth, p1:BufferedImage), invokevirtual:int(BufferedImage::getHeight, p1:BufferedImage), invokevirtual:int(BufferedImage::getType, var_4_75:BufferedImage))
            var_2_5F = and:int(var_2_5F:int, ldc:int(620455402))
            var_6_9E = and:int(ldc:int(9884), ldc:int(-26335))
            
            loop {
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_0216)
                }
                
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(4194304)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(-825174734))
                }
                else {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(938010610))
                    
                    if (cmpge:boolean(var_6_9E:int, invokevirtual:int(BufferedImage::getHeight, var_4_75:BufferedImage))) {
                        looporswitchbreak()
                    }
                }
                
                Label_0197:
                
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(16777216)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(4096)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_5F = and:int(var_2_5F:int, ldc:int(1727723243))
                }
                
                Label_0216:
                
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_0197)
                }
                
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(4)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1108380181))
                var_7_F2 = and:int(ldc:int(2470), ldc:int(-2472))
                
                loop {
                    if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(32768)), ldc:int(0))) {
                        var_2_5F = and:int(var_2_5F:int, ldc:int(215773688))
                        
                        if (cmpge:boolean(var_7_F2:int, invokevirtual:int(BufferedImage::getWidth, var_4_75:BufferedImage))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_0273:
                    
                    if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_2_5F = and:int(var_2_5F:int, ldc:int(-437422857))
                    }
                    
                    Label_0292:
                    
                    if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_2_5F = and:int(var_2_5F:int, ldc:int(-1474975160))
                        goto(Label_0273)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(64)), ldc:int(0))) {
                        var_2_5F = and:int(var_2_5F:int, ldc:int(2013074537))
                    }
                    else {
                        var_2_5F = and:int(var_2_5F:int, ldc:int(-723558151))
                        var_8_15E = initobject:Color(Color::<init>, invokevirtual:int(BufferedImage::getRGB, var_4_75:BufferedImage, var_7_F2:int, var_6_9E:int), xor:int[expected:boolean](ldc:int(2124), ldc:int(2125)))
                        
                        loop {
                            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(1048576)), ldc:int(0))) {
                                var_2_5F = and:int(var_2_5F:int, ldc:int(1830431632))
                            }
                            else {
                                var_2_5F = and:int(var_2_5F:int, ldc:int(1592388836))
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), invokevirtual:int(Color::getAlpha, var_8_15E:Color))
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(32)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                            
                            var_2_5F = and:int(var_2_5F:int, ldc:int(654462422))
                        }
                        
                        var_2_5F = and:int(var_2_5F:int, ldc:int(1825272008))
                        var_9_1A7 = invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, invokevirtual:int(BufferedImage::getRGB, p1:BufferedImage, var_7_F2:int, var_6_9E:int), div:float(i2f:float(invokevirtual:int(Color::getAlpha, var_8_15E:Color)), ldc:float(255.0f)))
                        
                        loop {
                            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(2048)), ldc:int(0))) {
                                var_2_5F = and:int(var_2_5F:int, ldc:int(1976133568))
                                invokevirtual:void(BufferedImage::setRGB, var_5_90:BufferedImage, var_7_F2:int, var_6_9E:int, var_9_1A7:int)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(268435456)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                            
                            var_2_5F = and:int(var_2_5F:int, ldc:int(-779551528))
                        }
                        
                        var_2_5F = and:int(var_2_5F:int, ldc:int(349828585))
                        inc:int(var_7_F2, ldc:int(1))
                    }
                }
                
                inc:int(var_6_9E, ldc:int(1))
            }
            
            stack_1FD_0 = invokestatic:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe(\u5245\u7af6\u6bb9\u3e2a\u8bb0\uc7fe::\ud523\u4c2b\uc2bd\u97e6\ubff1\u759a, loadelement:String(getstatic:String[](\u67e9\u960f\uf9c5\u3bc9\uafe7::\u873d\u7d52\u7006\ubded\u3bc9), and:int(ldc:int(-10502), ldc:int(10501))), var_5_90:BufferedImage)
            var_2_5F = and:int(var_2_5F:int, ldc:int(-1627619385))
            return:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe(stack_1FD_0:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe)
        }
        catch (java.io.IOException var_4_202) {
            invokevirtual:void(Throwable::printStackTrace, var_4_202:IOException[expected:Throwable])
            return:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe(aconstnull:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe())
        }
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe \u6c56\u647c\u97b7\u6d99\u5654\u385b(java.awt.image.BufferedImage p0) {
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
            return:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe(invokestatic:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe(\u67e9\u960f\uf9c5\u3bc9\uafe7::\u071d\u3bd6\u071d\u446c\u3711\u416d, loadelement:String(getstatic:String[](\u67e9\u960f\uf9c5\u3bc9\uafe7::\u873d\u7d52\u7006\ubded\u3bc9), xor:int(ldc:int(16419), ldc:int(16418))), p0:BufferedImage))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_17A : int
        expr_6B : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_B7_0 : byte[] [generated]
        stack_B9_0 : byte[] [generated]
        stack_E4_0 : byte[] [generated]
        stack_E6_0 : byte[] [generated]
        stack_106_0 : byte[] [generated]
        stack_18C_0 : byte[] [generated]
        stack_20B_0 : byte[] [generated]
        stack_245_0 : byte[] [generated]
        stack_29A_0 : byte[] [generated]
        var_4_167 : int
        var_3_16C : byte[]
        var_5_16D : int
        var_0_1A4 : int
        expr_18C : byte [generated]
        stack_1D0_2 : byte [generated]
        stack_1A7_0 : byte [generated]
        expr_96 : int [generated]
        var_2_B7 : byte[]
        expr_BB : int [generated]
        var_3_234 : byte[]
        var_5_235 : int
        expr_E6 : int [generated]
        var_3_289 : byte[]
        var_5_28A : int
        expr_29D : byte [generated]
        var_3_112 : String
        stack_160_0 : String[] [generated]
        expr_124 : String[] [generated]
        
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
        var_0_17A = and:int(ldc:int(-1080669014), ldc:int(-3678789))
        expr_6B = arraylength:int(stack_94_0 = stack_96_0 = stack_B7_0 = stack_B9_0 = stack_E4_0 = stack_E6_0 = stack_106_0 = stack_18C_0 = stack_20B_0 = stack_245_0 = stack_29A_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("0Aj5B+AU61HM2BNRszQFr0wB2d8LLenuOctNq0QBuAtOqkj1x1LH8PtdrfpFpCjw+12dpQ==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_167 = expr_6B:int
        var_3_16C = newarray:byte[](byte.class, expr_6B:int)
        var_5_16D = expr_6B:int
        Label_0367:
        
        while (cmpeq:boolean(and:int(var_0_17A:int, ldc:int(256)), ldc:int(0))) {
            var_0_1A4 = and:int(var_0_17A:int, ldc:int(-1079378769))
            var_5_16D = add:int(var_5_16D:int, ldc:int(-1))
            expr_18C = stack_1D0_2 = loadelement(stack_18C_0, var_5_16D)
            
            if (cmplt:boolean(add:int(add:int(var_5_16D:int, ldc:int(1)), neg:int(var_4_167:int)), ldc:int(0))) {
                stack_1D0_2 = stack_1A7_0 = add:byte(expr_18C:byte, loadelement:byte(var_3_16C:byte[], add:int(var_5_16D:int, ldc:int(1))))
                goto(Label_0439)
            }
            
            Label_0409:
            
            if (cmpne:boolean(and:int(var_0_1A4:int, ldc:int(536870912)), ldc:int(0))) {
                var_0_1A4 = and:int(var_0_1A4:int, ldc:int(-1078047698))
                stack_1D0_2 = stack_1A7_0 = add:byte(expr_18C:byte, ldc:byte(1))
            }
            
            Label_0439:
            
            if (cmpeq:boolean(and:int(var_0_1A4:int, ldc:int(536870912)), ldc:int(0))) {
                var_0_1A4 = and:int(var_0_1A4:int, ldc:int(765120450))
                goto(Label_0409)
            }
            
            var_0_17A = and:int(var_0_1A4:int, ldc:int(-2340298))
            storeelement:byte(var_3_16C:byte[], var_5_16D:int, stack_1D0_2:byte)
            
            if (cmpne:boolean(var_5_16D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_B7_0 = stack_B9_0 = stack_E4_0 = stack_E6_0 = stack_106_0 = stack_18C_0 = stack_20B_0 = stack_245_0 = stack_29A_0 = var_3_16C:byte[]
            goto(Label_0112)
        }
        
        var_0_17A = and:int(var_0_17A:int, ldc:int(-306560924))
        Label_0502:
        
        while (cmpne:boolean(and:int(var_0_17A:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_17A = and:int(var_0_17A:int, ldc:int(-5190030))
            var_5_16D = add:int(var_5_16D:int, ldc:int(-1))
            storeelement:byte(var_3_16C:byte[], var_5_16D:int, xor:byte(loadelement:byte(stack_20B_0:byte[], var_5_16D:int), ldc:byte(102)))
            
            if (cmpne:boolean(var_5_16D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_B7_0 = stack_B9_0 = stack_E4_0 = stack_E6_0 = stack_106_0 = stack_18C_0 = stack_20B_0 = stack_245_0 = stack_29A_0 = var_3_16C:byte[]
            goto(Label_0155)
        }
        
        goto(Label_0367)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_17A:int, ldc:int(65536)), ldc:int(0))) {
            var_0_17A = and:int(var_0_17A:int, ldc:int(1316560331))
            goto(Label_0235)
        }
        
        if (cmpeq:boolean(and:int(var_0_17A:int, ldc:int(2048)), ldc:int(0))) {
            goto(Label_0192)
        }
        
        if (cmpeq:boolean(and:int(var_0_17A:int, ldc:int(65536)), ldc:int(0))) {
            var_0_17A = and:int(var_0_17A:int, ldc:int(-538013))
            expr_96 = arraylength:int(stack_96_0:byte[])
            
            if (cmpne:boolean(expr_96:int, ldc:int(0))) {
                var_4_167 = expr_96:int
                var_3_16C = newarray:byte[](byte.class, expr_96:int)
                var_5_16D = expr_96:int
                goto(Label_0502)
            }
        }
        
        Label_0155:
        
        if (cmpeq:boolean(and:int(var_0_17A:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_0235)
        }
        
        if (cmpeq:boolean(and:int(var_0_17A:int, ldc:int(65536)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_17A:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_17A = and:int(var_0_17A:int, ldc:int(-1081017409))
            var_2_B7 = stack_B7_0:byte[]
            expr_BB = add:int(arraylength:int(stack_B9_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_BB:int, ldc:int(0))) {
                var_3_234 = newarray:byte[](byte.class, expr_BB:int)
                var_5_235 = expr_BB:int
                
                loop {
                    var_0_17A = and:int(var_0_17A:int, ldc:int(-1073750938))
                    var_5_235 = add:int(var_5_235:int, ldc:int(-1))
                    storeelement:byte(var_3_234:byte[], var_5_235:int, add:int(shl:int(loadelement:byte(stack_245_0:byte[], var_5_235:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_B7:byte[], add:int(var_5_235:int, xor:int(ldc:int(5250), ldc:int(5251)))), ldc:int(6)), and:int(ldc:int(8203), ldc:int(2563)))))
                    
                    if (cmpne:boolean(var_5_235:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_B7_0 = stack_B9_0 = stack_E4_0 = stack_E6_0 = stack_106_0 = stack_18C_0 = stack_20B_0 = stack_245_0 = stack_29A_0 = var_3_234:byte[]
            }
        }
        
        Label_0192:
        
        if (cmpne:boolean(and:int(var_0_17A:int, ldc:int(33554432)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_17A:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_0155)
            }
            
            if (cmpeq:boolean(and:int(var_0_17A:int, ldc:int(32)), ldc:int(0))) {
                var_0_17A = and:int(var_0_17A:int, ldc:int(-1036311309))
                goto(Label_0112)
            }
            
            var_0_17A = and:int(var_0_17A:int, ldc:int(-5898310))
            expr_E6 = arraylength:int(stack_E6_0:byte[])
            
            if (cmpne:boolean(expr_E6:int, ldc:int(0))) {
                var_3_289 = newarray:byte[](byte.class, expr_E6:int)
                var_5_28A = expr_E6:int
                
                loop {
                    var_0_17A = and:int(var_0_17A:int, ldc:int(-2434689))
                    var_5_28A = add:int(var_5_28A:int, ldc:int(-1))
                    expr_29D = add:byte(loadelement:byte(stack_29A_0:byte[], var_5_28A:int), ldc:byte(31))
                    storeelement:byte(var_3_289:byte[], var_5_28A:int, or:int(and:int(shl:int(expr_29D:byte, and:int(ldc:int(29749), ldc:int(654))), ldc:int(-16)), and:int(shr:int(expr_29D:byte[expected:int], xor:int(ldc:int(18), ldc:int(22))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_28A:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_B7_0 = stack_B9_0 = stack_E4_0 = stack_E6_0 = stack_106_0 = stack_18C_0 = stack_20B_0 = stack_245_0 = stack_29A_0 = var_3_289:byte[]
            }
        }
        
        Label_0235:
        
        if (cmpeq:boolean(and:int(var_0_17A:int, ldc:int(32)), ldc:int(0))) {
            goto(Label_0192)
        }
        
        if (cmpeq:boolean(and:int(var_0_17A:int, ldc:int(16384)), ldc:int(0))) {
            goto(Label_0155)
        }
        
        if (cmpne:boolean(and:int(var_0_17A:int, ldc:int(536870912)), ldc:int(0))) {
            var_3_112 = initobject:String(String::<init>, stack_106_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_160_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(2720), ldc:int(2722)))
            expr_124 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(1031), ldc:int(2370)))
            storeelement:String(expr_124:String[], xor:int(ldc:int(8468), ldc:int(8469)), invokevirtual:String[expected:String](String::substring, var_3_112:String, and:int(ldc:int(2730), ldc:int(-2731)), xor:int(ldc:int(3098), ldc:int(3125))))
            storeelement:String(expr_124:String[], and:int(ldc:int(-17121), ldc:int(17120)), invokevirtual:String[expected:String](String::substring, var_3_112:String, xor:int(ldc:int(8197), ldc:int(8234)), xor:int(ldc:int(16432), ldc:int(16387))))
            putstatic:String[](\u67e9\u960f\uf9c5\u3bc9\uafe7::\u873d\u7d52\u7006\ubded\u3bc9, expr_124:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \ua562\u62da\u183a\u52d3\u9af2\u5140(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_60F : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C3 : double
        var_3_D5 : int
        var_11_E6 : int
        var_14_110 : double
        var_16_114 : int
        var_12_10C : double
        var_17_61A : int
        
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
        var_3_60F = and:int(ldc:int(-1698755117), ldc:int(-626039581))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u67e9\u960f\uf9c5\u3bc9\uafe7[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(524288)), ldc:int(0))) {
            var_3_60F = and:int(var_3_60F:int, ldc:int(-2023141786))
        }
        else {
            var_3_60F = and:int(var_3_60F:int, ldc:int(-90242305))
            var_5_85 = and:int(ldc:int(-16747), ldc:int(16746))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-20938), ldc:int(20937)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C3 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D5 = and:int(var_3_60F:int, ldc:int(-117495594))
                    var_9_C3 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E6 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E6:int, sub:int(var_6_8C:int, xor:int(ldc:int(4104), ldc:int(4105)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E6:int, and:int(ldc:int(11033), ldc:int(135)))), var_7_9B:double))) {
                        inc:int(var_11_E6, ldc:int(1))
                    }
                    
                    var_3_60F = and:int(var_3_D5:int, ldc:int(-792877750))
                    var_14_110 = var_7_9B:double
                    var_16_114 = var_11_E6:int
                }
                else {
                    var_11_E6 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(18), ldc:int(19)))
                    var_12_10C = var_14_110 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_114 = var_11_E6:int, var_6_8C:int)) {
                        var_9_C3 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E6:int)
                        var_16_114 = var_11_E6:int
                        var_14_110 = var_12_10C:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(-1759925470))
                        goto(Label_1446)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1306)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1197)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1088)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0933)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(1814236229))
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0701)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(2)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(-1272359317))
                        goto(Label_0566)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(987310503))
                    }
                    else {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(-1232222257))
                        
                        if (cmplt:boolean(var_16_114:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0566)
                            }
                            
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0399:
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(489521495))
                        goto(Label_1446)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1306)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(-568573929))
                        goto(Label_1197)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1088)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0933)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(2)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(-480496439))
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(-1176613481))
                        goto(Label_0701)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_60F = and:int(var_3_60F:int, ldc:int(-529257501))
                            loopcontinue()
                        }
                        
                        var_3_60F = and:int(var_3_60F:int, ldc:int(-1716522254))
                        var_11_E6 = and:int(ldc:int(8048), ldc:int(-24436))
                        goto(Label_1435)
                    }
                    
                    Label_0566:
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1446)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(-416915795))
                        goto(Label_1306)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1197)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(-472559893))
                        goto(Label_1088)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0933)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(-1214300645))
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(-1240482563))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_60F = and:int(var_3_60F:int, ldc:int(-939127286))
                            goto(Label_0399)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_60F = and:int(var_3_60F:int, ldc:int(-2101914833))
                            loopcontinue()
                        }
                        
                        var_3_60F = and:int(var_3_60F:int, ldc:int(-1077044002))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_110 = var_9_C3:double
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0701:
                    
                    if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1446)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(-2072188328))
                        goto(Label_1306)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1197)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1088)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(1005279921))
                        goto(Label_0933)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(-1960943955))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_60F = and:int(var_3_60F:int, ldc:int(-149446265))
                            goto(Label_0566)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0399)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_60F = and:int(var_3_60F:int, ldc:int(151867922))
                            loopcontinue()
                        }
                        
                        var_3_60F = and:int(var_3_60F:int, ldc:int(-139478933))
                        var_14_110 = mul:double(ldc:double(0.5), add:double(var_9_C3:double, var_14_110:double))
                    }
                    
                    Label_0834:
                    
                    if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1446)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1306)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1197)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(1754339842))
                        goto(Label_1088)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0701)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(64)), ldc:int(0))) {
                            var_3_60F = and:int(var_3_60F:int, ldc:int(-91128050))
                            goto(Label_0566)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0399)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60F = and:int(var_3_60F:int, ldc:int(-117608853))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E6 = xor:int(ldc:int(8458), ldc:int(8459))
                                goto(Label_1088)
                            }
                        }
                    }
                    
                    Label_0933:
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1446)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1306)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1197)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(1556209780))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0834)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_60F = and:int(var_3_60F:int, ldc:int(228660144))
                            goto(Label_0701)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_60F = and:int(var_3_60F:int, ldc:int(943296976))
                            goto(Label_0566)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_60F = and:int(var_3_60F:int, ldc:int(-2088353998))
                            goto(Label_0399)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60F = and:int(var_3_60F:int, ldc:int(-1176563733))
                        var_11_E6 = and:int(ldc:int(3479), ldc:int(-3480))
                    }
                    
                    Label_1088:
                    
                    if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1446)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(-85207458))
                        goto(Label_1306)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(-30342129))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0933)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0834)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0701)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0566)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0399)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_60F = and:int(var_3_60F:int, ldc:int(2040241744))
                            loopcontinue()
                        }
                        
                        var_3_60F = and:int(var_3_60F:int, ldc:int(-576857754))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E6:int, ldc:int(0))) {
                                goto(Label_1306)
                            }
                        }
                    }
                    
                    Label_1197:
                    
                    if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1446)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_1088)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0933)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0834)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_60F = and:int(var_3_60F:int, ldc:int(-149343443))
                            goto(Label_0701)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0566)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_60F = and:int(var_3_60F:int, ldc:int(-1030934721))
                            goto(Label_0399)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_60F = and:int(var_3_60F:int, ldc:int(-1073920185))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_110:double, var_5_85:int, var_16_114:int)
                            goto(Label_1435)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1306:
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1446)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(199883310))
                        goto(Label_1197)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1088)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0933)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(-395863723))
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(64)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(-1474831022))
                        goto(Label_0701)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0566)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(700871916))
                        goto(Label_0399)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(64)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_60F = and:int(var_3_60F:int, ldc:int(-1836191373))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_110:double, ldc:double(0.0))
                    Label_1435:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_61A = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E6:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1446:
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(1924049956))
                        goto(Label_1306)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1197)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(1447832043))
                        goto(Label_1088)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0933)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(2)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(-727185007))
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0701)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0566)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(1311167270))
                        goto(Label_0399)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(64)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(-587263669))
                        var_17_61A = add:int(var_16_114:int, xor:int(ldc:int(16398), ldc:int(16399)))
                        looporswitchbreak()
                    }
                }
                
                var_3_60F = and:int(var_3_60F:int, ldc:int(-1081229622))
                
                if (cmple:boolean(var_5_85 = var_17_61A:int, sub:int(var_6_8C:int, xor:int(ldc:int(20740), ldc:int(20741))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(2147483647)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
