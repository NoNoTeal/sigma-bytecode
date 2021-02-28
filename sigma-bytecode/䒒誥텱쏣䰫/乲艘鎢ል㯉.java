public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4e72\u8258\u93a2\u120d\u3bc9 {
    public void \u4e72\u8258\u93a2\u120d\u3bc9() {
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
            invokespecial:Object(Object::<init>, this:\u4e72\u8258\u93a2\u120d\u3bc9)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.awt.image.BufferedImage \ubf56\u6ec6\ub113\u3dd3\u71f1\u3c25(java.awt.image.BufferedImage p0) {
        var_2_5F : int
        var_2_68 : int
        var_4_8B : BufferedImage
        var_5_92 : Graphics
        stack_DE_0 : int [generated]
        var_6_DE : int
        
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
        var_2_5F = and:int(ldc:int(999878181), ldc:int(2146955671))
        
        if (cmpne:boolean(p0:BufferedImage, aconstnull:BufferedImage())) {
            var_2_68 = and:int(var_2_5F:int, ldc:int(2127030295))
            putfield:int(\u4e72\u8258\u93a2\u120d\u3bc9::\u40a9\uc2e8\u836c\u8753\ua61f\u839e, this:\u4e72\u8258\u93a2\u120d\u3bc9, ldc:int(64))
            putfield:int(\u4e72\u8258\u93a2\u120d\u3bc9::\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f, this:\u4e72\u8258\u93a2\u120d\u3bc9, ldc:int(64))
            var_4_8B = initobject:BufferedImage(BufferedImage::<init>, getfield:int(\u4e72\u8258\u93a2\u120d\u3bc9::\u40a9\uc2e8\u836c\u8753\ua61f\u839e, this:\u4e72\u8258\u93a2\u120d\u3bc9), getfield:int(\u4e72\u8258\u93a2\u120d\u3bc9::\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f, this:\u4e72\u8258\u93a2\u120d\u3bc9), and:int(ldc:int(10), ldc:int(7170)))
            var_5_92 = invokevirtual:Graphics(BufferedImage::getGraphics, var_4_8B:BufferedImage)
            invokevirtual:boolean(Graphics::drawImage, var_5_92:Graphics, p0:BufferedImage[expected:Image], and:int(ldc:int(-10640), ldc:int(10639)), and:int(ldc:int(-9080), ldc:int(631)), checkcast:ImageObserver(java.awt.image.ImageObserver.class, aconstnull:ImageObserver()))
            
            if (cmpne:boolean(invokevirtual:int(BufferedImage::getHeight, p0:BufferedImage), ldc:int(32))) {
                var_2_68 = and:int(var_2_68:int, ldc:int(2123099479))
                stack_DE_0 = and:int(ldc:int(5801), ldc:int(-5804))
            }
            else {
                stack_DE_0 = and:int(ldc:int(1921), ldc:int(14385))
            }
            
            var_6_DE = stack_DE_0:int
            
            if (cmpne:boolean(var_6_DE:int, ldc:int(0))) {
                invokevirtual:void(Graphics::setColor, var_5_92:Graphics, initobject:Color(Color::<init>, and:int(ldc:int(22328), ldc:int(-24384)), and:int(ldc:int(-29867), ldc:int(25770)), and:int(ldc:int(9898), ldc:int(-13995)), and:int(ldc:int(3637), ldc:int(-11830))))
                invokevirtual:void(Graphics::fillRect, var_5_92:Graphics, and:int(ldc:int(22336), ldc:int(-24390)), ldc:int(32), ldc:int(64), ldc:int(32))
                invokevirtual:boolean(Graphics::drawImage, var_5_92:Graphics, var_4_8B:BufferedImage[expected:Image], ldc:int(24), ldc:int(48), ldc:int(20), ldc:int(52), xor:int(ldc:int(24577), ldc:int(24581)), ldc:int(16), ldc:int(8), ldc:int(20), checkcast:ImageObserver(java.awt.image.ImageObserver.class, aconstnull:ImageObserver()))
                invokevirtual:boolean(Graphics::drawImage, var_5_92:Graphics, var_4_8B:BufferedImage[expected:Image], ldc:int(28), ldc:int(48), ldc:int(24), ldc:int(52), ldc:int(8), ldc:int(16), ldc:int(12), ldc:int(20), checkcast:ImageObserver(java.awt.image.ImageObserver.class, aconstnull:ImageObserver()))
                invokevirtual:boolean(Graphics::drawImage, var_5_92:Graphics, var_4_8B:BufferedImage[expected:Image], ldc:int(20), ldc:int(52), ldc:int(16), ldc:int(64), ldc:int(8), ldc:int(20), ldc:int(12), ldc:int(32), checkcast:ImageObserver(java.awt.image.ImageObserver.class, aconstnull:ImageObserver()))
                invokevirtual:boolean(Graphics::drawImage, var_5_92:Graphics, var_4_8B:BufferedImage[expected:Image], ldc:int(24), ldc:int(52), ldc:int(20), ldc:int(64), and:int(ldc:int(2215), ldc:int(17412)), ldc:int(20), ldc:int(8), ldc:int(32), checkcast:ImageObserver(java.awt.image.ImageObserver.class, aconstnull:ImageObserver()))
                invokevirtual:boolean(Graphics::drawImage, var_5_92:Graphics, var_4_8B:BufferedImage[expected:Image], ldc:int(28), ldc:int(52), ldc:int(24), ldc:int(64), and:int(ldc:int(12864), ldc:int(-12865)), ldc:int(20), xor:int(ldc:int(529), ldc:int(533)), ldc:int(32), checkcast:ImageObserver(java.awt.image.ImageObserver.class, aconstnull:ImageObserver()))
                invokevirtual:boolean(Graphics::drawImage, var_5_92:Graphics, var_4_8B:BufferedImage[expected:Image], ldc:int(32), ldc:int(52), ldc:int(28), ldc:int(64), ldc:int(12), ldc:int(20), ldc:int(16), ldc:int(32), checkcast:ImageObserver(java.awt.image.ImageObserver.class, aconstnull:ImageObserver()))
                invokevirtual:boolean(Graphics::drawImage, var_5_92:Graphics, var_4_8B:BufferedImage[expected:Image], ldc:int(40), ldc:int(48), ldc:int(36), ldc:int(52), ldc:int(44), ldc:int(16), ldc:int(48), ldc:int(20), checkcast:ImageObserver(java.awt.image.ImageObserver.class, aconstnull:ImageObserver()))
                invokevirtual:boolean(Graphics::drawImage, var_5_92:Graphics, var_4_8B:BufferedImage[expected:Image], ldc:int(44), ldc:int(48), ldc:int(40), ldc:int(52), ldc:int(48), ldc:int(16), ldc:int(52), ldc:int(20), checkcast:ImageObserver(java.awt.image.ImageObserver.class, aconstnull:ImageObserver()))
                invokevirtual:boolean(Graphics::drawImage, var_5_92:Graphics, var_4_8B:BufferedImage[expected:Image], ldc:int(36), ldc:int(52), ldc:int(32), ldc:int(64), ldc:int(48), ldc:int(20), ldc:int(52), ldc:int(32), checkcast:ImageObserver(java.awt.image.ImageObserver.class, aconstnull:ImageObserver()))
                invokevirtual:boolean(Graphics::drawImage, var_5_92:Graphics, var_4_8B:BufferedImage[expected:Image], ldc:int(40), ldc:int(52), ldc:int(36), ldc:int(64), ldc:int(44), ldc:int(20), ldc:int(48), ldc:int(32), checkcast:ImageObserver(java.awt.image.ImageObserver.class, aconstnull:ImageObserver()))
                invokevirtual:boolean(Graphics::drawImage, var_5_92:Graphics, var_4_8B:BufferedImage[expected:Image], ldc:int(44), ldc:int(52), ldc:int(40), ldc:int(64), ldc:int(40), ldc:int(20), ldc:int(44), ldc:int(32), checkcast:ImageObserver(java.awt.image.ImageObserver.class, aconstnull:ImageObserver()))
                invokevirtual:boolean(Graphics::drawImage, var_5_92:Graphics, var_4_8B:BufferedImage[expected:Image], ldc:int(48), ldc:int(52), ldc:int(44), ldc:int(64), ldc:int(52), ldc:int(20), ldc:int(56), ldc:int(32), checkcast:ImageObserver(java.awt.image.ImageObserver.class, aconstnull:ImageObserver()))
            }
            
            invokevirtual:void(Graphics::dispose, var_5_92:Graphics)
            putfield:int[](\u4e72\u8258\u93a2\u120d\u3bc9::\u5f50\ucb79\u3e2a\ubb2b\ub6ab\ub83f, this:\u4e72\u8258\u93a2\u120d\u3bc9, invokevirtual:int[](DataBufferInt::getData, checkcast:DataBufferInt(java.awt.image.DataBufferInt.class, invokevirtual:DataBuffer(Raster::getDataBuffer, invokevirtual:WritableRaster(BufferedImage::getRaster, var_4_8B:BufferedImage)))))
            invokespecial:void(\u4e72\u8258\u93a2\u120d\u3bc9::\u98a4\ud171\u8aa5\u8df4\u120d\u6cfe, this:\u4e72\u8258\u93a2\u120d\u3bc9, and:int(ldc:int(-16140), ldc:int(16128)), and:int(ldc:int(6170), ldc:int(-6171)), ldc:int(32), ldc:int(16))
            
            if (cmpne:boolean(var_6_DE:int, ldc:int(0))) {
                invokespecial:void(\u4e72\u8258\u93a2\u120d\u3bc9::\ud36e\ubefe\u5140\ud158\uc9f6\ub70c, this:\u4e72\u8258\u93a2\u120d\u3bc9, ldc:int(32), and:int(ldc:int(9910), ldc:int(-9911)), ldc:int(64), ldc:int(32))
            }
            
            invokespecial:void(\u4e72\u8258\u93a2\u120d\u3bc9::\u98a4\ud171\u8aa5\u8df4\u120d\u6cfe, this:\u4e72\u8258\u93a2\u120d\u3bc9, and:int(ldc:int(-11406), ldc:int(11405)), ldc:int(16), ldc:int(64), ldc:int(32))
            invokespecial:void(\u4e72\u8258\u93a2\u120d\u3bc9::\u98a4\ud171\u8aa5\u8df4\u120d\u6cfe, this:\u4e72\u8258\u93a2\u120d\u3bc9, ldc:int(16), ldc:int(48), ldc:int(48), ldc:int(64))
            return:BufferedImage(var_4_8B:BufferedImage)
        }
        
        return:BufferedImage(aconstnull:BufferedImage())
    }
    
    private void \ud36e\ubefe\u5140\ud158\uc9f6\ub70c(int p0, int p1, int p2, int p3) {
        var_5_C8 : int
        var_7_64 : int
        var_8_B9 : int
        expr_1A4 : int[] [generated]
        expr_1B0 : int [generated]
        
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
        var_5_C8 = and:int(ldc:int(633182800), ldc:int(797955661))
        var_7_64 = p0:int
        
        loop {
            if (cmpeq:boolean(and:int(var_5_C8:int, ldc:int(16777216)), ldc:int(0))) {
                var_5_C8 = and:int(var_5_C8:int, ldc:int(-23951115))
                goto(Label_0331)
            }
            
            if (cmpne:boolean(and:int(var_5_C8:int, ldc:int(256)), ldc:int(0))) {
                var_5_C8 = and:int(var_5_C8:int, ldc:int(129940323))
                goto(Label_0151)
            }
            
            var_5_C8 = and:int(var_5_C8:int, ldc:int(-1254121479))
            
            if (cmpge:boolean(var_7_64:int, p2:int)) {
                goto(Label_0151)
            }
            
            var_8_B9 = p1:int
            Label_0187:
            
            while (cmpne:boolean(and:int(var_5_C8:int, ldc:int(32768)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_5_C8:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_0227)
                }
                
                var_5_C8 = and:int(var_5_C8:int, ldc:int(2139605513))
                
                if (cmpge:boolean(var_8_B9:int, p3:int)) {
                    goto(Label_0227)
                }
                
                if (cmplt:boolean(and:int(shr:int(loadelement:int(getfield:int[](\u4e72\u8258\u93a2\u120d\u3bc9::\u5f50\ucb79\u3e2a\ubb2b\ub6ab\ub83f, this:\u4e72\u8258\u93a2\u120d\u3bc9), add:int(var_7_64:int, mul:int(var_8_B9:int, getfield:int(\u4e72\u8258\u93a2\u120d\u3bc9::\u40a9\uc2e8\u836c\u8753\ua61f\u839e, this:\u4e72\u8258\u93a2\u120d\u3bc9)))), ldc:int(24)), xor:int(ldc:int(60), ldc:int(195))), and:int(ldc:int(8384), ldc:int(4275)))) {
                    return:void()
                }
                
                var_5_C8 = and:int(var_5_C8:int, ldc:int(1695935261))
                inc:int(var_8_B9, ldc:int(1))
            }
            
            var_5_C8 = and:int(var_5_C8:int, ldc:int(594859448))
            Label_0372:
            
            while (cmpne:boolean(and:int(var_5_C8:int, ldc:int(512)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_5_C8:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_0187)
                }
                
                var_5_C8 = and:int(var_5_C8:int, ldc:int(2134880921))
                
                if (cmpge:boolean(var_8_B9:int, p3:int)) {
                    var_5_C8 = and:int(var_5_C8:int, ldc:int(-1350197669))
                    inc:int(var_7_64, ldc:int(1))
                    goto(Label_0325)
                }
                
                expr_1A4 = getfield:int[](\u4e72\u8258\u93a2\u120d\u3bc9::\u5f50\ucb79\u3e2a\ubb2b\ub6ab\ub83f, this:\u4e72\u8258\u93a2\u120d\u3bc9)
                expr_1B0 = add:int(var_7_64:int, mul:int(var_8_B9:int, getfield:int(\u4e72\u8258\u93a2\u120d\u3bc9::\u40a9\uc2e8\u836c\u8753\ua61f\u839e, this:\u4e72\u8258\u93a2\u120d\u3bc9)))
                storeelement:int(expr_1A4:int[], expr_1B0:int, and:int(loadelement:int(expr_1A4:int[], expr_1B0:int), ldc:int(16777215)))
                inc:int(var_8_B9, ldc:int(1))
            }
            
            goto(Label_0227)
            Label_0151:
            
            if (cmpne:boolean(and:int(var_5_C8:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_0331)
            }
            
            if (cmpeq:boolean(and:int(var_5_C8:int, ldc:int(131072)), ldc:int(0))) {
                var_5_C8 = and:int(var_5_C8:int, ldc:int(-1218474018))
                var_7_64 = p0:int
                goto(Label_0325)
            }
            
            loopcontinue()
            Label_0227:
            
            if (cmpne:boolean(and:int(var_5_C8:int, ldc:int(268435456)), ldc:int(0))) {
                goto(Label_0372)
            }
            
            if (cmpne:boolean(and:int(var_5_C8:int, ldc:int(262144)), ldc:int(0))) {
                var_5_C8 = and:int(var_5_C8:int, ldc:int(-1085426980))
                inc:int(var_7_64, ldc:int(1))
                loopcontinue()
            }
            
            goto(Label_0187)
            Label_0325:
            
            if (cmplt:boolean(var_7_64:int, p2:int)) {
                var_8_B9 = p1:int
                goto(Label_0372)
            }
            
            Label_0331:
            
            if (cmpne:boolean(and:int(var_5_C8:int, ldc:int(8192)), ldc:int(0))) {
                var_5_C8 = and:int(var_5_C8:int, ldc:int(1606687074))
                goto(Label_0151)
            }
            
            if (cmpeq:boolean(and:int(var_5_C8:int, ldc:int(8192)), ldc:int(0))) {
                return:void()
            }
        }
    }
    
    private void \u98a4\ud171\u8aa5\u8df4\u120d\u6cfe(int p0, int p1, int p2, int p3) {
        var_5_A1 : int
        var_7_64 : int
        var_8_9A : int
        expr_BC : int[] [generated]
        expr_C8 : int [generated]
        
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
            var_5_A1 = and:int(ldc:int(-107185445), ldc:int(-4325430))
            var_7_64 = p0:int
            
            loop {
                if (cmpne:boolean(and:int(var_5_A1:int, ldc:int(8)), ldc:int(0))) {
                    var_5_A1 = and:int(var_5_A1:int, ldc:int(-574980389))
                    
                    if (cmplt:boolean(var_7_64:int, p2:int)) {
                        var_8_9A = p1:int
                        
                        loop {
                            var_5_A1 = and:int(var_5_A1:int, ldc:int(-572883204))
                            
                            if (cmpge:boolean(var_8_9A:int, p3:int)) {
                                looporswitchbreak()
                            }
                            
                            expr_BC = getfield:int[](\u4e72\u8258\u93a2\u120d\u3bc9::\u5f50\ucb79\u3e2a\ubb2b\ub6ab\ub83f, this:\u4e72\u8258\u93a2\u120d\u3bc9)
                            expr_C8 = add:int(var_7_64:int, mul:int(var_8_9A:int, getfield:int(\u4e72\u8258\u93a2\u120d\u3bc9::\u40a9\uc2e8\u836c\u8753\ua61f\u839e, this:\u4e72\u8258\u93a2\u120d\u3bc9)))
                            storeelement:int(expr_BC:int[], expr_C8:int, or:int(loadelement:int(expr_BC:int[], expr_C8:int), ldc:int(-16777216)))
                            inc:int(var_8_9A, ldc:int(1))
                        }
                        
                        var_5_A1 = and:int(var_5_A1:int, ldc:int(-576954898))
                        inc:int(var_7_64, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_5_A1:int, ldc:int(268435456)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_5_A1 = and:int(var_5_A1:int, ldc:int(-1270071470))
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
    
    public void \u8258\u72f1\u51fa\ub83f\u416d\ua562(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_602 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_60D : int
        
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
        var_3_602 = and:int(ldc:int(-1636548728), ldc:int(-747913277))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4e72\u8258\u93a2\u120d\u3bc9[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(524288)), ldc:int(0))) {
            var_3_602 = and:int(var_3_602:int, ldc:int(-135163914))
            var_5_7D = and:int(ldc:int(2658), ldc:int(-2660))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-10602), ldc:int(10601)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_602:int, ldc:int(-1594585198))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(16385), ldc:int(8359)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(384), ldc:int(385)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_602 = and:int(var_3_CA:int, ldc:int(-1586987094))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(-28384), ldc:int(-28383)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1295)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(256)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-1963855287))
                        goto(Label_1168)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(2059776634))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0892)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(628229174))
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(512)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(423738866))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-371594666))
                    }
                    else {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-417083460))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0770)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(256)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(1647292916))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(1919042099))
                        goto(Label_1295)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(128)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(29726668))
                        goto(Label_1168)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-1542224845))
                        goto(Label_0892)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-654328751))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-976755603))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(-834924666))
                            var_11_DB = and:int(ldc:int(21628), ldc:int(-21758))
                            goto(Label_1423)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0557:
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1295)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(512)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-659402094))
                        goto(Label_1168)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0892)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(512)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(671668298))
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(-1672149567))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_602 = and:int(var_3_602:int, ldc:int(-1715650683))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0770)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-2008267065))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1295)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1168)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(1845641276))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0892)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(64)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(1191034804))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_602 = and:int(var_3_602:int, ldc:int(-688754793))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0770:
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-816458687))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1295)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1168)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-914664391))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(646831584))
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(64)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(699382185))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(1560844303))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_602 = and:int(var_3_602:int, ldc:int(-130920525))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = and:int(ldc:int(6677), ldc:int(16395))
                                goto(Label_1043)
                            }
                        }
                    }
                    
                    Label_0892:
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1295)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(1263639717))
                        goto(Label_1168)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(256)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-1038742047))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0770)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(-877811860))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(1501017516))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_602 = and:int(var_3_602:int, ldc:int(-2082402432))
                        var_11_DB = and:int(ldc:int(21418), ldc:int(-23535))
                    }
                    
                    Label_1043:
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-770695616))
                        goto(Label_1295)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0892)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(-1466029827))
                            goto(Label_0770)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(128)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(1534778991))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(811027835))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(-891970403))
                            loopcontinue()
                        }
                        
                        var_3_602 = and:int(var_3_602:int, ldc:int(-2085617720))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1295)
                            }
                        }
                    }
                    
                    Label_1168:
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-1371677695))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(64)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(454374202))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_1043)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0892)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(128)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(-1703321447))
                            goto(Label_0770)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(256)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(-548650907))
                            loopcontinue()
                        }
                        
                        var_3_602 = and:int(var_3_602:int, ldc:int(-530264170))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                        goto(Label_1423)
                    }
                    
                    Label_1295:
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1168)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(1103399389))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-1932811457))
                        goto(Label_0892)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-1266273353))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-690635640))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(16384)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_602 = and:int(var_3_602:int, ldc:int(-1758126084))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1423:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_60D = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1434:
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1295)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-2071011308))
                        goto(Label_1168)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(578541201))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0892)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(1410361290))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-1019924562))
                        var_17_60D = add:int(var_16_109:int, and:int(ldc:int(5249), ldc:int(8279)))
                        looporswitchbreak()
                    }
                    
                    var_3_602 = and:int(var_3_602:int, ldc:int(717623138))
                }
                
                var_3_602 = and:int(var_3_602:int, ldc:int(-1184383079))
                
                if (cmple:boolean(var_5_7D = var_17_60D:int, sub:int(var_6_84:int, and:int(ldc:int(5121), ldc:int(8907))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(1024)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
