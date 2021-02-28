public class \u51b2\u6fb0\ufcaf\u61a4\u0800.\u6435\u71f1\u8bb0\uc910\u7c6b\u8350 {
    public void \u6435\u71f1\u8bb0\uc910\u7c6b\u8350(java.nio.ByteBuffer p0, org.lwjgl.stb.STBTTFontinfo p1, float p2, float p3, float p4, float p5, java.lang.String p6) {
        var_10_E0 : MemoryStack
        var_11_E3 : Throwable
        var_12_F5 : IntBuffer
        var_12_16D : Throwable
        var_12_189 : Throwable
        var_16_1C2 : Throwable
        
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
            invokespecial:Object(Object::<init>, this:\u6435\u71f1\u8bb0\uc910\u7c6b\u8350)
            putfield:IntSet(\u6435\u71f1\u8bb0\uc910\u7c6b\u8350::\ub18d\u56bd\uf9c5\u62da\u3dd3\uc9f6, this:\u6435\u71f1\u8bb0\uc910\u7c6b\u8350, initobject:IntArraySet[expected:IntSet](IntArraySet::<init>))
            putfield:ByteBuffer(\u6435\u71f1\u8bb0\uc910\u7c6b\u8350::\u7330\u6b0d\u59ec\u97e6\u67e9\u8258, this:\u6435\u71f1\u8bb0\uc910\u7c6b\u8350, p0:ByteBuffer)
            putfield:STBTTFontinfo(\u6435\u71f1\u8bb0\uc910\u7c6b\u8350::\u69d9\u8413\uc2bd\u88c5\u4d85\ua61f, this:\u6435\u71f1\u8bb0\uc910\u7c6b\u8350, p1:STBTTFontinfo)
            putfield:float(\u6435\u71f1\u8bb0\uc910\u7c6b\u8350::\u8cae\u97e6\uc29a\u6ec6\uc246\u8d90, this:\u6435\u71f1\u8bb0\uc910\u7c6b\u8350, p3:float)
            invokeinterface:void(IntStream::forEach, invokevirtual:IntStream(CharSequence::codePoints, p6:String[expected:CharSequence]), invokedynamic:IntConsumer(accept:(Lit/unimi/dsi/fastutil/ints/IntSet;)Ljava/util/function/IntConsumer;, getfield:IntSet(\u6435\u71f1\u8bb0\uc910\u7c6b\u8350::\ub18d\u56bd\uf9c5\u62da\u3dd3\uc9f6, this:\u6435\u71f1\u8bb0\uc910\u7c6b\u8350)))
            putfield:float(\u6435\u71f1\u8bb0\uc910\u7c6b\u8350::\ua3b4\u4975\u7873\u0c95\u946b\u6c52, this:\u6435\u71f1\u8bb0\uc910\u7c6b\u8350, mul:float(p4:float, p3:float))
            putfield:float(\u6435\u71f1\u8bb0\uc910\u7c6b\u8350::\u6cfe\ud12e\ubcb0\u4daf\uc3e3\u4e72, this:\u6435\u71f1\u8bb0\uc910\u7c6b\u8350, mul:float(p5:float, p3:float))
            putfield:float(\u6435\u71f1\u8bb0\uc910\u7c6b\u8350::\u7330\uae5d\uc4d2\ua6bd\u8cae\ub6ab, this:\u6435\u71f1\u8bb0\uc910\u7c6b\u8350, invokestatic:float(STBTruetype::stbtt_ScaleForPixelHeight, p1:STBTTFontinfo, mul:float(p2:float, p3:float)))
            var_10_E0 = invokestatic:MemoryStack(MemoryStack::stackPush)
            var_11_E3 = aconstnull:Throwable()
            
            try {
                var_12_F5 = invokevirtual:IntBuffer(MemoryStack::mallocInt, var_10_E0:MemoryStack, and:int(ldc:int(17191), ldc:int(8193)))
                invokestatic:void(STBTruetype::stbtt_GetFontVMetrics, p1:STBTTFontinfo, var_12_F5:IntBuffer, invokevirtual:IntBuffer(MemoryStack::mallocInt, var_10_E0:MemoryStack, xor:int(ldc:int(2352), ldc:int(2353))), invokevirtual:IntBuffer(MemoryStack::mallocInt, var_10_E0:MemoryStack, and:int(ldc:int(20481), ldc:int(1345))))
                putfield:float(\u6435\u71f1\u8bb0\uc910\u7c6b\u8350::\u7330\u12cb\u6ec6\u3bd6\u52d3\u4bc8, this:\u6435\u71f1\u8bb0\uc910\u7c6b\u8350, mul:float(i2f:float(invokevirtual:int(IntBuffer::get, var_12_F5:IntBuffer, and:int(ldc:int(8785), ldc:int(-8786)))), getfield:float(\u6435\u71f1\u8bb0\uc910\u7c6b\u8350::\u7330\uae5d\uc4d2\ua6bd\u8cae\ub6ab, this:\u6435\u71f1\u8bb0\uc910\u7c6b\u8350)))
                
                if (cmpeq:boolean(var_10_E0:MemoryStack, aconstnull:MemoryStack())) {
                    return:void()
                }
                
                if (cmpne:boolean(var_11_E3:Throwable, aconstnull:Throwable())) {
                    try {
                        invokevirtual:void(MemoryStack::close, var_10_E0:MemoryStack)
                    }
                    catch (java.lang.Throwable var_12_16D) {
                        invokevirtual:void(Throwable::addSuppressed, var_11_E3:Throwable, var_12_16D:Throwable)
                    }
                    
                    return:void()
                }
                
                invokevirtual:void(MemoryStack::close, var_10_E0:MemoryStack)
            }
            catch (java.lang.Throwable var_12_189) {
                var_11_E3 = var_12_189:Throwable
                athrow(var_12_189:Throwable)
            }
            finally {
                if (cmpne:boolean(var_10_E0:MemoryStack, aconstnull:MemoryStack())) {
                    if (cmpne:boolean(var_11_E3:Throwable, aconstnull:Throwable())) {
                        try {
                            invokevirtual:void(MemoryStack::close, var_10_E0:MemoryStack)
                        }
                        catch (java.lang.Throwable var_16_1C2) {
                            invokevirtual:void(Throwable::addSuppressed, var_11_E3:Throwable, var_16_1C2:Throwable)
                        }
                    }
                    else {
                        invokevirtual:void(MemoryStack::close, var_10_E0:MemoryStack)
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u6fb0\u527a\ub83f\ua61f\ubff1\uc246 \u5245\uae87\u3d64\u3e75\u6bb9\u4f52(int p0) {
        var_2_5F : int
        var_2_6B : int
        var_4_A3 : MemoryStack
        var_5_A6 : Throwable
        var_6_B4 : IntBuffer
        var_7_C2 : IntBuffer
        var_8_D0 : IntBuffer
        var_9_DE : IntBuffer
        var_10_E8 : int
        var_17_244 : \u6fb0\u527a\ub83f\ua61f\ubff1\uc246
        var_11_129 : int
        var_12_144 : int
        var_13_15C : IntBuffer
        var_14_16A : IntBuffer
        var_6_278 : Throwable
        var_19_29D : Throwable
        
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
        var_2_5F = and:int(ldc:int(-2074302490), ldc:int(-1555175505))
        
        loop {
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(2)), ldc:int(0))) {
                var_2_6B = and:int(var_2_5F:int, ldc:int(-343370132))
            }
            else {
                var_2_6B = and:int(var_2_5F:int, ldc:int(-1042520214))
                
                if (logicalnot:boolean(invokeinterface:boolean(IntSet::contains, getfield:IntSet(\u6435\u71f1\u8bb0\uc910\u7c6b\u8350::\ub18d\u56bd\uf9c5\u62da\u3dd3\uc9f6, this:\u6435\u71f1\u8bb0\uc910\u7c6b\u8350), p0:int))) {
                    var_4_A3 = invokestatic:MemoryStack(MemoryStack::stackPush)
                    var_5_A6 = aconstnull:Throwable()
                    
                    try {
                        var_6_B4 = invokevirtual:IntBuffer(MemoryStack::mallocInt, var_4_A3:MemoryStack, xor:int(ldc:int(-24542), ldc:int(-24541)))
                        var_7_C2 = invokevirtual:IntBuffer(MemoryStack::mallocInt, var_4_A3:MemoryStack, xor:int(ldc:int(-20472), ldc:int(-20471)))
                        var_8_D0 = invokevirtual:IntBuffer(MemoryStack::mallocInt, var_4_A3:MemoryStack, xor:int(ldc:int(139), ldc:int(138)))
                        var_9_DE = invokevirtual:IntBuffer(MemoryStack::mallocInt, var_4_A3:MemoryStack, xor:int(ldc:int(-16127), ldc:int(-16128)))
                        var_10_E8 = invokestatic:int(STBTruetype::stbtt_FindGlyphIndex, getfield:STBTTFontinfo(\u6435\u71f1\u8bb0\uc910\u7c6b\u8350::\u69d9\u8413\uc2bd\u88c5\u4d85\ua61f, this:\u6435\u71f1\u8bb0\uc910\u7c6b\u8350), p0:int)
                        
                        if (cmpeq:boolean(var_10_E8:int, ldc:int(0))) {
                            var_17_244 = aconstnull:\u6fb0\u527a\ub83f\ua61f\ubff1\uc246()
                            return:\u6fb0\u527a\ub83f\ua61f\ubff1\uc246(checkcast:\u6fb0\u527a\ub83f\ua61f\ubff1\uc246(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u6fb0\u527a\ub83f\ua61f\ubff1\uc246.class, var_17_244:\u6fb0\u527a\ub83f\ua61f\ubff1\uc246))
                        }
                        
                        invokestatic:void(STBTruetype::stbtt_GetGlyphBitmapBoxSubpixel, getfield:STBTTFontinfo(\u6435\u71f1\u8bb0\uc910\u7c6b\u8350::\u69d9\u8413\uc2bd\u88c5\u4d85\ua61f, this:\u6435\u71f1\u8bb0\uc910\u7c6b\u8350), var_10_E8:int, getfield:float(\u6435\u71f1\u8bb0\uc910\u7c6b\u8350::\u7330\uae5d\uc4d2\ua6bd\u8cae\ub6ab, this:\u6435\u71f1\u8bb0\uc910\u7c6b\u8350), getfield:float(\u6435\u71f1\u8bb0\uc910\u7c6b\u8350::\u7330\uae5d\uc4d2\ua6bd\u8cae\ub6ab, this:\u6435\u71f1\u8bb0\uc910\u7c6b\u8350), getfield:float(\u6435\u71f1\u8bb0\uc910\u7c6b\u8350::\ua3b4\u4975\u7873\u0c95\u946b\u6c52, this:\u6435\u71f1\u8bb0\uc910\u7c6b\u8350), getfield:float(\u6435\u71f1\u8bb0\uc910\u7c6b\u8350::\u6cfe\ud12e\ubcb0\u4daf\uc3e3\u4e72, this:\u6435\u71f1\u8bb0\uc910\u7c6b\u8350), var_6_B4:IntBuffer, var_7_C2:IntBuffer, var_8_D0:IntBuffer, var_9_DE:IntBuffer)
                        var_11_129 = sub:int(invokevirtual:int(IntBuffer::get, var_8_D0:IntBuffer, and:int(ldc:int(-31672), ldc:int(23461))), invokevirtual:int(IntBuffer::get, var_6_B4:IntBuffer, and:int(ldc:int(-13119), ldc:int(9008))))
                        var_12_144 = sub:int(invokevirtual:int(IntBuffer::get, var_9_DE:IntBuffer, and:int(ldc:int(3716), ldc:int(-3733))), invokevirtual:int(IntBuffer::get, var_7_C2:IntBuffer, and:int(ldc:int(-11529), ldc:int(11528))))
                        
                        if (logicaland:boolean(cmpne:boolean(var_11_129:int, ldc:int(0)), cmpne:boolean(var_12_144:int, ldc:int(0)))) {
                            var_13_15C = invokevirtual:IntBuffer(MemoryStack::mallocInt, var_4_A3:MemoryStack, and:int(ldc:int(4609), ldc:int(289)))
                            var_14_16A = invokevirtual:IntBuffer(MemoryStack::mallocInt, var_4_A3:MemoryStack, and:int(ldc:int(13507), ldc:int(25)))
                            invokestatic:void(STBTruetype::stbtt_GetGlyphHMetrics, getfield:STBTTFontinfo(\u6435\u71f1\u8bb0\uc910\u7c6b\u8350::\u69d9\u8413\uc2bd\u88c5\u4d85\ua61f, this:\u6435\u71f1\u8bb0\uc910\u7c6b\u8350), var_10_E8:int, var_13_15C:IntBuffer, var_14_16A:IntBuffer)
                            return:\u6fb0\u527a\ub83f\ua61f\ubff1\uc246(initobject:\u6fb0\u527a\ub83f\ua61f\ubff1\uc246(\u6fb0\u527a\ub83f\ua61f\ubff1\uc246::<init>, this:\u6435\u71f1\u8bb0\uc910\u7c6b\u8350, invokevirtual:int(IntBuffer::get, var_6_B4:IntBuffer, and:int(ldc:int(17812), ldc:int(-17813))), invokevirtual:int(IntBuffer::get, var_8_D0:IntBuffer, and:int(ldc:int(7306), ldc:int(-16267))), neg:int(invokevirtual:int(IntBuffer::get, var_7_C2:IntBuffer, and:int(ldc:int(24591), ldc:int(-24592)))), neg:int(invokevirtual:int(IntBuffer::get, var_9_DE:IntBuffer, and:int(ldc:int(26721), ldc:int(-26738)))), mul:float(i2f:float(invokevirtual:int(IntBuffer::get, var_13_15C:IntBuffer, and:int(ldc:int(5903), ldc:int(-22416)))), getfield:float(\u6435\u71f1\u8bb0\uc910\u7c6b\u8350::\u7330\uae5d\uc4d2\ua6bd\u8cae\ub6ab, this:\u6435\u71f1\u8bb0\uc910\u7c6b\u8350)), mul:float(i2f:float(invokevirtual:int(IntBuffer::get, var_14_16A:IntBuffer, and:int(ldc:int(-28036), ldc:int(25986)))), getfield:float(\u6435\u71f1\u8bb0\uc910\u7c6b\u8350::\u7330\uae5d\uc4d2\ua6bd\u8cae\ub6ab, this:\u6435\u71f1\u8bb0\uc910\u7c6b\u8350)), var_10_E8:int, aconstnull:\u839e\u64f2\u8d90\ufcaf\u40a9\u8753()))
                        }
                        
                        return:\u6fb0\u527a\ub83f\ua61f\ubff1\uc246(aconstnull:\u6fb0\u527a\ub83f\ua61f\ubff1\uc246())
                    }
                    catch (java.lang.Throwable var_6_278) {
                        var_5_A6 = var_6_278:Throwable
                        athrow(var_6_278:Throwable)
                    }
                    finally {
                        if (cmpne:boolean(var_4_A3:MemoryStack, aconstnull:MemoryStack())) {
                            if (cmpne:boolean(var_5_A6:Throwable, aconstnull:Throwable())) {
                                try {
                                    invokevirtual:void(MemoryStack::close, var_4_A3:MemoryStack)
                                }
                                catch (java.lang.Throwable var_19_29D) {
                                    invokevirtual:void(Throwable::addSuppressed, var_5_A6:Throwable, var_19_29D:Throwable)
                                }
                            }
                            else {
                                invokevirtual:void(MemoryStack::close, var_4_A3:MemoryStack)
                            }
                        }
                    }
                    
                    return:\u6fb0\u527a\ub83f\ua61f\ubff1\uc246(checkcast:\u6fb0\u527a\ub83f\ua61f\ubff1\uc246(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u6fb0\u527a\ub83f\ua61f\ubff1\uc246.class, var_17_244:\u6fb0\u527a\ub83f\ua61f\ubff1\uc246))
                }
            }
            
            if (cmpeq:boolean(and:int(var_2_6B:int, ldc:int(4096)), ldc:int(0))) {
                return:\u6fb0\u527a\ub83f\ua61f\ubff1\uc246(aconstnull:\u6fb0\u527a\ub83f\ua61f\ubff1\uc246())
            }
            
            var_2_5F = and:int(var_2_6B:int, ldc:int(1339003067))
        }
    }
    
    public void close() {
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
            invokevirtual:void(STBTTFontinfo::free, getfield:STBTTFontinfo(\u6435\u71f1\u8bb0\uc910\u7c6b\u8350::\u69d9\u8413\uc2bd\u88c5\u4d85\ua61f, this:\u6435\u71f1\u8bb0\uc910\u7c6b\u8350))
            invokestatic:void(MemoryUtil::memFree, getfield:ByteBuffer[expected:Buffer](\u6435\u71f1\u8bb0\uc910\u7c6b\u8350::\u7330\u6b0d\u59ec\u97e6\u67e9\u8258, this:\u6435\u71f1\u8bb0\uc910\u7c6b\u8350))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public it.unimi.dsi.fastutil.ints.IntSet \u516c\u34df\uc246\u6ec6\u7873\u64ab() {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    public \u71f1\uc910\u3bc9\u516c\u93a2.\u8258\u8389\ub18d\u718f\u61a4\ubf56 \u5245\uae87\u3d64\u3e75\u6bb9\u4f52(int p0) {
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
            return:\u8258\u8389\ub18d\u718f\u61a4\ubf56(invokevirtual:\u6fb0\u527a\ub83f\ua61f\ubff1\uc246[expected:\u8258\u8389\ub18d\u718f\u61a4\ubf56](\u6435\u71f1\u8bb0\uc910\u7c6b\u8350::\u5245\uae87\u3d64\u3e75\u6bb9\u4f52, this:\u6435\u71f1\u8bb0\uc910\u7c6b\u8350, p0:int))
        }
        
        goto(Label_0006)
    }
    
    private boolean lambda$\u120d\u527a\u72f1\uc84e\u7006\u4c04$0(int p0) {
        var_2_61 : int
        stack_90_0 : int [generated]
        
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
            var_2_61 = and:int(ldc:int(-1186356369), ldc:int(1970142363))
            
            if (invokeinterface:boolean(IntSet::contains, getfield:IntSet(\u6435\u71f1\u8bb0\uc910\u7c6b\u8350::\ub18d\u56bd\uf9c5\u62da\u3dd3\uc9f6, this:\u6435\u71f1\u8bb0\uc910\u7c6b\u8350), p0:int)) {
                var_2_61 = and:int(var_2_61:int, ldc:int(885996137))
                stack_90_0 = and:int(ldc:int(-25426), ldc:int(24913))
            }
            else {
                stack_90_0 = xor:int(ldc:int(4128), ldc:int(4129))
            }
            
            return:boolean(stack_90_0:int)
        }
        
        goto(Label_0006)
    }
    
    public static float \u8df4\u76bc\u759a\u7af6\u4f52\uc2bd(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u6435\u71f1\u8bb0\uc910\u7c6b\u8350 p0) {
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
            return:float(getfield:float(\u6435\u71f1\u8bb0\uc910\u7c6b\u8350::\u8cae\u97e6\uc29a\u6ec6\uc246\u8d90, p0:\u6435\u71f1\u8bb0\uc910\u7c6b\u8350))
        }
        
        goto(Label_0006)
    }
    
    public static float \u3bc9\u3dd3\ud7e8\ud4fe\u8c8a\uae87(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u6435\u71f1\u8bb0\uc910\u7c6b\u8350 p0) {
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
            return:float(getfield:float(\u6435\u71f1\u8bb0\uc910\u7c6b\u8350::\ua3b4\u4975\u7873\u0c95\u946b\u6c52, p0:\u6435\u71f1\u8bb0\uc910\u7c6b\u8350))
        }
        
        goto(Label_0006)
    }
    
    public static float \u8350\ub8be\u983f\u8bb0\u183a\u12b2(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u6435\u71f1\u8bb0\uc910\u7c6b\u8350 p0) {
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
            return:float(getfield:float(\u6435\u71f1\u8bb0\uc910\u7c6b\u8350::\u7330\u12cb\u6ec6\u3bd6\u52d3\u4bc8, p0:\u6435\u71f1\u8bb0\uc910\u7c6b\u8350))
        }
        
        goto(Label_0006)
    }
    
    public static float \u6cfe\u40a9\u3711\u71ae\u69d9\uceb8(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u6435\u71f1\u8bb0\uc910\u7c6b\u8350 p0) {
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
            return:float(getfield:float(\u6435\u71f1\u8bb0\uc910\u7c6b\u8350::\u6cfe\ud12e\ubcb0\u4daf\uc3e3\u4e72, p0:\u6435\u71f1\u8bb0\uc910\u7c6b\u8350))
        }
        
        goto(Label_0006)
    }
    
    public static org.lwjgl.stb.STBTTFontinfo \ub83f\ud7e8\u4daf\uc229\u4e72\u4cd9(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u6435\u71f1\u8bb0\uc910\u7c6b\u8350 p0) {
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
            return:STBTTFontinfo(getfield:STBTTFontinfo(\u6435\u71f1\u8bb0\uc910\u7c6b\u8350::\u69d9\u8413\uc2bd\u88c5\u4d85\ua61f, p0:\u6435\u71f1\u8bb0\uc910\u7c6b\u8350))
        }
        
        goto(Label_0006)
    }
    
    public static float \ud51e\u5bc4\u7d52\ub83f\u7873\u839e(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u6435\u71f1\u8bb0\uc910\u7c6b\u8350 p0) {
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
            return:float(getfield:float(\u6435\u71f1\u8bb0\uc910\u7c6b\u8350::\u7330\uae5d\uc4d2\ua6bd\u8cae\ub6ab, p0:\u6435\u71f1\u8bb0\uc910\u7c6b\u8350))
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
    
    public void \u16f6\ua068\u965f\ua068\u51b2\ud171(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_65C : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D0 : double
        var_3_E2 : int
        var_11_F3 : int
        var_14_11D : double
        var_16_121 : int
        var_12_119 : double
        var_17_667 : int
        
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
        var_3_65C = and:int(ldc:int(830760991), ldc:int(-203753409))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6435\u71f1\u8bb0\uc910\u7c6b\u8350[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(16)), ldc:int(0))) {
            var_3_65C = and:int(var_3_65C:int, ldc:int(629542245))
        }
        else {
            var_3_65C = and:int(var_3_65C:int, ldc:int(-1108122125))
            var_5_8A = and:int(ldc:int(24620), ldc:int(-24624))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-7809), ldc:int(7808)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D0 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E2 = and:int(var_3_65C:int, ldc:int(-1132073697))
                    var_9_D0 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F3 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F3:int, sub:int(var_6_91:int, and:int(ldc:int(7425), ldc:int(581)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F3:int, xor:int(ldc:int(2062), ldc:int(2063)))), var_7_A0:double))) {
                        inc:int(var_11_F3, ldc:int(1))
                    }
                    
                    var_3_65C = and:int(var_3_E2:int, ldc:int(-1326810977))
                    var_14_11D = var_7_A0:double
                    var_16_121 = var_11_F3:int
                }
                else {
                    var_11_F3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(132), ldc:int(133)))
                    var_12_119 = var_14_11D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_121 = var_11_F3:int, var_6_91:int)) {
                        var_9_D0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F3:int)
                        var_16_121 = var_11_F3:int
                        var_14_11D = var_12_119:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-578555301))
                        goto(Label_1421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1258)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1143)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(411975678))
                        goto(Label_0992)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0858)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(646944518))
                        goto(Label_0708)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0592)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(921825815))
                        
                        if (cmplt:boolean(var_16_121:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0592)
                            }
                            
                            goto(Label_0858)
                        }
                    }
                    
                    Label_0409:
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(256)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(190815316))
                        goto(Label_1533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1258)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1317490402))
                        goto(Label_1143)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(1)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1753339299))
                        goto(Label_0992)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(318632995))
                        goto(Label_0858)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0708)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1811157193))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(-79497186))
                            loopcontinue()
                        }
                        
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-207787973))
                        var_11_F3 = and:int(ldc:int(-3215), ldc:int(3212))
                        goto(Label_1522)
                    }
                    
                    Label_0592:
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1258)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(173385381))
                        goto(Label_1143)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1804872538))
                        goto(Label_0992)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0858)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0409)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(-1752621431))
                            loopcontinue()
                        }
                        
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1126438317))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11D = var_9_D0:double
                            goto(Label_0858)
                        }
                    }
                    
                    Label_0708:
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(128)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-116623646))
                        goto(Label_1533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(622758361))
                        goto(Label_1258)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1143)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0992)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1785781474))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(1)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(572499141))
                            goto(Label_0592)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(-400662052))
                            goto(Label_0409)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(963268762))
                            loopcontinue()
                        }
                        
                        var_3_65C = and:int(var_3_65C:int, ldc:int(916319735))
                        var_14_11D = mul:double(ldc:double(0.5), add:double(var_9_D0:double, var_14_11D:double))
                    }
                    
                    Label_0858:
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-926988309))
                        goto(Label_1258)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(750217537))
                        goto(Label_1143)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(713785886))
                            goto(Label_0708)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(256)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(137292818))
                            goto(Label_0592)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0409)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(256)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(211430959))
                            loopcontinue()
                        }
                        
                        var_3_65C = and:int(var_3_65C:int, ldc:int(847443963))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F3 = and:int(ldc:int(8193), ldc:int(5905))
                                goto(Label_1143)
                            }
                        }
                    }
                    
                    Label_0992:
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1258)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0858)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(16)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(-919336639))
                            goto(Label_0708)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(1041647220))
                            goto(Label_0592)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0409)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(352959495))
                            loopcontinue()
                        }
                        
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1108746181))
                        var_11_F3 = and:int(ldc:int(-23970), ldc:int(19841))
                    }
                    
                    Label_1143:
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-2017538654))
                        goto(Label_1533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(1)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(934883556))
                        goto(Label_1421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0992)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0858)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0708)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0592)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(2030650126))
                            goto(Label_0409)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65C = and:int(var_3_65C:int, ldc:int(2055760287))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                                goto(Label_1421)
                            }
                        }
                    }
                    
                    Label_1258:
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-31698377))
                        goto(Label_1533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(32)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(620129797))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(-920730159))
                            goto(Label_1143)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(292457588))
                            goto(Label_0992)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(1631444439))
                            goto(Label_0858)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0708)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0592)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(16)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(-1931595932))
                            goto(Label_0409)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(1)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(1439181964))
                            loopcontinue()
                        }
                        
                        var_3_65C = and:int(var_3_65C:int, ldc:int(956071127))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11D:double, var_5_8A:int, var_16_121:int)
                        goto(Label_1522)
                    }
                    
                    Label_1421:
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1258)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1143)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0992)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0858)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0708)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0592)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0409)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(2097152)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_65C = and:int(var_3_65C:int, ldc:int(-75438337))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11D:double, ldc:double(0.0))
                    Label_1522:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_667 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1533:
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1258)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1143)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-2023392011))
                        goto(Label_0992)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(16)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1697287231))
                        goto(Label_0858)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0708)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0592)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0409)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(32)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1210614313))
                        var_17_667 = add:int(var_16_121:int, xor:int(ldc:int(197), ldc:int(196)))
                        looporswitchbreak()
                    }
                }
                
                var_3_65C = and:int(var_3_65C:int, ldc:int(-171773441))
                
                if (cmple:boolean(var_5_8A = var_17_667:int, sub:int(var_6_91:int, and:int(ldc:int(97), ldc:int(24857))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2)), ldc:int(0))) {
            var_3_65C = and:int(var_3_65C:int, ldc:int(515167494))
            goto(Label_0108)
        }
    }
}
