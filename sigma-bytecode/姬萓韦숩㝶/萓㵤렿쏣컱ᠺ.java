public class \u59ec\u8413\u97e6\uc229\u3776.\u8413\u3d64\ub83f\uc3e3\ucef1\u183a {
    public void \u8413\u3d64\ub83f\uc3e3\ucef1\u183a() {
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
            invokespecial:Object(Object::<init>, this:\u8413\u3d64\ub83f\uc3e3\ucef1\u183a)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7e3f\u8d98\u71f1\u0800\u3d64\u416d(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c p0, java.lang.String p1, java.io.OutputStream p2, boolean p3) {
        var_5_61 : int
        var_7_74 : int
        var_5_1CD : int
        var_8_87 : ByteBuffer
        var_9_90 : int
        var_11_1BE : int
        var_13_203 : \u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330
        var_5_C1 : int
        var_9_D1 : DataBufferByte
        expr_E6 : int[] [generated]
        var_11_145 : PixelInterleavedSampleModel
        stack_1AB_1 : ColorSpace [generated]
        expr_15C : int[] [generated]
        var_12_1AE : ComponentColorModel
        expr_269 : int[] [generated]
        stack_339_1 : ColorSpace [generated]
        expr_2EF : int[] [generated]
        
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
            var_5_61 = and:int(ldc:int(1240944653), ldc:int(1274633549))
            var_7_74 = mul:int(mul:int(and:int(ldc:int(4), ldc:int(12422)), invokevirtual:int(\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c::\uc238\uc29a\uf995\u5245\ucef1\u836c, p0:\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c)), invokevirtual:int(\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c::\uc31c\u3d64\uff55\u36d3\u3bd6\u12b2, p0:\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c))
            
            if (logicalnot:boolean(p3:boolean)) {
                var_7_74 = mul:int(mul:int(xor:int(ldc:int(16393), ldc:int(16394)), invokevirtual:int(\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c::\uc238\uc29a\uf995\u5245\ucef1\u836c, p0:\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c)), invokevirtual:int(\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c::\uc31c\u3d64\uff55\u36d3\u3bd6\u12b2, p0:\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c))
            }
            
            var_5_1CD = and:int(var_5_61:int, ldc:int(-103589217))
            var_8_87 = invokestatic:ByteBuffer(ByteBuffer::allocate, var_7_74:int)
            var_9_90 = and:int(ldc:int(8333), ldc:int(-8368))
            
            while (cmplt:boolean(var_9_90:int, invokevirtual:int(\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c::\uc31c\u3d64\uff55\u36d3\u3bd6\u12b2, p0:\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c))) {
                var_11_1BE = and:int(ldc:int(16817), ldc:int(-25522))
                
                loop {
                    if (cmpeq:boolean(and:int(var_5_1CD:int, ldc:int(134217728)), ldc:int(0))) {
                        var_5_1CD = and:int(var_5_1CD:int, ldc:int(1980701838))
                    }
                    else {
                        var_5_1CD = and:int(var_5_1CD:int, ldc:int(-840975831))
                        
                        if (cmplt:boolean(var_11_1BE:int, invokevirtual:int(\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c::\uc238\uc29a\uf995\u5245\ucef1\u836c, p0:\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c))) {
                            var_13_203 = invokevirtual:\u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330(\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c::\ua3b4\u946b\uceb8\u416d\ud12e\u0800, p0:\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c, var_11_1BE:int, var_9_90:int)
                            invokevirtual:ByteBuffer(ByteBuffer::put, var_8_87:ByteBuffer, i2b:byte(f2i:int(mul:float(getfield:float(\u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330::\u385b\uc4d2\u527a\u4cd9\u56bd\ubff1, var_13_203:\u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330), ldc:float(255.0f)))))
                            invokevirtual:ByteBuffer(ByteBuffer::put, var_8_87:ByteBuffer, i2b:byte(f2i:int(mul:float(getfield:float(\u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330::\uc31c\ua562\u64f2\u0a06\u839e\u120d, var_13_203:\u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330), ldc:float(255.0f)))))
                            invokevirtual:ByteBuffer(ByteBuffer::put, var_8_87:ByteBuffer, i2b:byte(f2i:int(mul:float(getfield:float(\u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330::\u5245\u3bc9\uc910\ub1b9\u4f52\uf94d, var_13_203:\u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330), ldc:float(255.0f)))))
                            
                            if (p3:boolean) {
                                invokevirtual:ByteBuffer(ByteBuffer::put, var_8_87:ByteBuffer, i2b:byte(f2i:int(mul:float(getfield:float(\u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330::\ubb2b\u3d64\ud171\u76bc\u071d\u8d90, var_13_203:\u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330), ldc:float(255.0f)))))
                            }
                            
                            var_5_1CD = and:int(var_5_1CD:int, ldc:int(2077981194))
                            inc:int(var_11_1BE, ldc:int(1))
                            loopcontinue()
                        }
                    }
                    
                    if (cmpne:boolean(and:int(var_5_1CD:int, ldc:int(1073741824)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
                
                var_5_1CD = and:int(var_5_1CD:int, ldc:int(-369911669))
                inc:int(var_9_90, ldc:int(1))
            }
            
            var_5_C1 = and:int(var_5_1CD:int, ldc:int(1307646073))
            var_9_D1 = initobject:DataBufferByte(DataBufferByte::<init>, invokevirtual:byte[](ByteBuffer::array, var_8_87:ByteBuffer), var_7_74:int)
            
            if (logicalnot:boolean(p3:boolean)) {
                var_5_C1 = and:int(var_5_C1:int, ldc:int(-805741798))
                expr_E6 = newarray:int[](int.class, and:int(ldc:int(15), ldc:int(29907)))
                storeelement:int(expr_E6:int[], and:int(ldc:int(10774), ldc:int(-15895)), and:int(ldc:int(28865), ldc:int(-28866)))
                storeelement:int(expr_E6:int[], and:int(ldc:int(901), ldc:int(18435)), xor:int(ldc:int(649), ldc:int(648)))
                storeelement:int(expr_E6:int[], and:int(ldc:int(2567), ldc:int(8242)), and:int(ldc:int(12931), ldc:int(14)))
                var_11_145 = initobject:PixelInterleavedSampleModel(PixelInterleavedSampleModel::<init>, and:int(ldc:int(4634), ldc:int(-4635)), invokevirtual:int(\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c::\uc238\uc29a\uf995\u5245\ucef1\u836c, p0:\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c), invokevirtual:int(\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c::\uc31c\u3d64\uff55\u36d3\u3bd6\u12b2, p0:\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c), xor:int(ldc:int(2564), ldc:int(2567)), mul:int(xor:int(ldc:int(-32766), ldc:int(-32767)), invokevirtual:int(\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c::\uc238\uc29a\uf995\u5245\ucef1\u836c, p0:\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c)), expr_E6:int[])
                stack_1AB_1 = invokestatic:ColorSpace(ColorSpace::getInstance, xor:int(ldc:int(257), ldc:int(745)))
                expr_15C = newarray:int[](int.class, xor:int(ldc:int(18480), ldc:int(18484)))
                storeelement:int(expr_15C:int[], and:int(ldc:int(-29800), ldc:int(29766)), ldc:int(8))
                storeelement:int(expr_15C:int[], xor:int(ldc:int(8258), ldc:int(8256)), storeelement:int(expr_15C:int[], xor:int(ldc:boolean(0), ldc:boolean(1)), ldc:int(8)))
                storeelement:int(expr_15C:int[], xor:int(ldc:int(-30175), ldc:int(-30174)), and:int(ldc:int(8437), ldc:int(-10998)))
                var_12_1AE = initobject:ComponentColorModel(ComponentColorModel::<init>, stack_1AB_1:ColorSpace, expr_15C:int[], and:int[expected:boolean](ldc:int(1176), ldc:int(-1177)), and:int[expected:boolean](ldc:int(18280), ldc:int(-18297)), and:int(ldc:int(16421), ldc:int(13915)), and:int(ldc:int(-7974), ldc:int(3873)))
            }
            else {
                expr_269 = newarray:int[](int.class, xor:int(ldc:int(4657), ldc:int(4661)))
                storeelement:int(expr_269:int[], and:int(ldc:int(-3966), ldc:int(1653)), and:int(ldc:int(25667), ldc:int(-25668)))
                storeelement:int(expr_269:int[], and:int(ldc:int(12817), ldc:int(9)), and:int(ldc:int(29705), ldc:int(1)))
                storeelement:int(expr_269:int[], and:int(ldc:int(21251), ldc:int(8322)), xor:int(ldc:int(-32703), ldc:int(-32701)))
                storeelement:int(expr_269:int[], xor:int(ldc:int(4106), ldc:int(4105)), and:int(ldc:int(5187), ldc:int(8719)))
                var_11_145 = initobject:PixelInterleavedSampleModel(PixelInterleavedSampleModel::<init>, and:int(ldc:int(-9652), ldc:int(435)), invokevirtual:int(\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c::\uc238\uc29a\uf995\u5245\ucef1\u836c, p0:\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c), invokevirtual:int(\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c::\uc31c\u3d64\uff55\u36d3\u3bd6\u12b2, p0:\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c), and:int(ldc:int(9429), ldc:int(16388)), mul:int(xor:int(ldc:int(-32761), ldc:int(-32765)), invokevirtual:int(\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c::\uc238\uc29a\uf995\u5245\ucef1\u836c, p0:\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c)), expr_269:int[])
                stack_339_1 = invokestatic:ColorSpace(ColorSpace::getInstance, and:int(ldc:int(22505), ldc:int(1016)))
                expr_2EF = newarray:int[](int.class, xor:int(ldc:int(2824), ldc:int(2828)))
                storeelement:int(expr_2EF:int[], and:int(ldc:int(4097), ldc:int(19017)), storeelement:int(expr_2EF:int[], and:int(ldc:int(-22021), ldc:int(22020)), ldc:int(8)))
                storeelement:int(expr_2EF:int[], and:int(ldc:int(83), ldc:int(3587)), storeelement:int(expr_2EF:int[], and:int(ldc:int(2070), ldc:int(8578)), ldc:int(8)))
                var_12_1AE = initobject:ComponentColorModel(ComponentColorModel::<init>, stack_339_1:ColorSpace, expr_2EF:int[], and:int[expected:boolean](ldc:int(16467), ldc:int(14465)), and:int[expected:boolean](ldc:int(-9377), ldc:int(9376)), and:int(ldc:int(17071), ldc:int(5123)), and:int(ldc:int(118), ldc:int(-119)))
            }
            
            invokestatic:boolean(ImageIO::write, initobject:BufferedImage(BufferedImage::<init>, var_12_1AE:ComponentColorModel[expected:ColorModel], invokestatic:WritableRaster(Raster::createWritableRaster, var_11_145:PixelInterleavedSampleModel[expected:SampleModel], var_9_D1:DataBufferByte[expected:DataBuffer], initobject:Point(Point::<init>, and:int(ldc:int(7329), ldc:int(-7330)), and:int(ldc:int(-15630), ldc:int(15628)))), and:int[expected:boolean](ldc:int(13592), ldc:int(-14137)), aconstnull:Hashtable<?, ?>()), p1:String, p2:OutputStream)
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
    
    public void \u8709\u6fb0\u3bd6\u6cfe\u4f52\uc910(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_61C : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_627 : int
        
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
        var_3_61C = and:int(ldc:int(-277289857), ldc:int(-8858243))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8413\u3d64\ub83f\uc3e3\ucef1\u183a[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(536870912)), ldc:int(0))) {
            var_3_61C = and:int(var_3_61C:int, ldc:int(-277293995))
            var_5_7D = and:int(ldc:int(18581), ldc:int(-30870))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(4918), ldc:int(-14135)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_61C:int, ldc:int(738196599))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(8388), ldc:int(8389)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(8200), ldc:int(8201)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_61C = and:int(var_3_D2:int, ldc:int(-109187235))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(29184), ldc:int(29185)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(1)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(1865642144))
                        goto(Label_1441)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-697856686))
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(1965584671))
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1048)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(1502592403))
                        goto(Label_0886)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(1519607082))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(967928784))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(1340417054))
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-369562155))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0413:
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1441)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1048)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0886)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1973706063))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(2038031871))
                            var_11_E3 = and:int(ldc:int(16442), ldc:int(-16443))
                            goto(Label_1430)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0541:
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(1)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1304673925))
                        goto(Label_1441)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(1563028018))
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1048)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0886)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-520296962))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(-826253028))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(-446450066))
                            loopcontinue()
                        }
                        
                        var_3_61C = and:int(var_3_61C:int, ldc:int(1845026551))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1441)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-162372669))
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(161896802))
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(1014427038))
                        goto(Label_1048)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0886)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(1570842851))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-268705931))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1441)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-87724853))
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1048)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(1)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(929258978))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(1)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(986799071))
                            loopcontinue()
                        }
                        
                        var_3_61C = and:int(var_3_61C:int, ldc:int(771546325))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(257), ldc:int(256))
                                goto(Label_1048)
                            }
                        }
                    }
                    
                    Label_0886:
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(128)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1546500945))
                        goto(Label_1441)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1283)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-265406664))
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(1092232431))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(1)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(183436114))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(622947942))
                            loopcontinue()
                        }
                        
                        var_3_61C = and:int(var_3_61C:int, ldc:int(695791229))
                        var_11_E3 = and:int(ldc:int(-15817), ldc:int(15560))
                    }
                    
                    Label_1048:
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1441)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-376968724))
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(499372689))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(2035722247))
                            goto(Label_0886)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(496729269))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1417874177))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1283)
                            }
                        }
                    }
                    
                    Label_1164:
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1441)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_1048)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(1)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(646111207))
                            goto(Label_0886)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(-517739023))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(128)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(746113668))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(512)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(-1443234475))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1430)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1283:
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(1335459356))
                        goto(Label_1441)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(818530261))
                        goto(Label_1048)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(79313358))
                        goto(Label_0886)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1753194033))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(1)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1224548311))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(64)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(1157721562))
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(128)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_61C = and:int(var_3_61C:int, ldc:int(-1174672003))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1430:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_627 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1441:
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1773647486))
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(1477202061))
                        goto(Label_1048)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(1225824714))
                        goto(Label_0886)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(1)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(375700540))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1473382393))
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-428452078))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(771356381))
                        var_17_627 = add:int(var_16_111:int, xor:int(ldc:int(4128), ldc:int(4129)))
                        looporswitchbreak()
                    }
                }
                
                var_3_61C = and:int(var_3_61C:int, ldc:int(1065273077))
                
                if (cmple:boolean(var_5_7D = var_17_627:int, sub:int(var_6_84:int, and:int(ldc:int(8705), ldc:int(18537))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(1)), ldc:int(0))) {
            var_3_61C = and:int(var_3_61C:int, ldc:int(2052709038))
            goto(Label_0106)
        }
    }
}
