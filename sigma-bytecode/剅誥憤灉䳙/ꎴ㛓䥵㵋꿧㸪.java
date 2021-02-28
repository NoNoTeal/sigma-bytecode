public class \u5245\u8aa5\u61a4\u7049\u4cd9.\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a {
    public void \ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a(java.io.InputStream p0) {
        var_4_9C : MemoryStack
        var_5_9F : Throwable
        var_6_B1 : IntBuffer
        var_7_C3 : IntBuffer
        var_8_107 : int
        var_9_151 : int
        var_8_1D8 : STBVorbisInfo
        var_6_23C : Throwable
        var_6_258 : Throwable
        var_11_291 : Throwable
        
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
            invokespecial:Object(Object::<init>, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a)
            putfield:ByteBuffer(\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\u98a4\ubff1\u960f\u4cd9\u74b1\u64ab, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a, invokestatic:ByteBuffer(MemoryUtil::memAlloc, xor:int(ldc:int(-31010), ldc:int(-22818))))
            putfield:InputStream(\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\uc84e\u1187\u624e\ud217\u4c04\ud217, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a, p0:InputStream)
            invokevirtual:Buffer(Buffer::limit, getfield:ByteBuffer[expected:Buffer](\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\u98a4\ubff1\u960f\u4cd9\u74b1\u64ab, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a), and:int(ldc:int(-5722), ldc:int(5209)))
            var_4_9C = invokestatic:MemoryStack(MemoryStack::stackPush)
            var_5_9F = aconstnull:Throwable()
            
            try {
                var_6_B1 = invokevirtual:IntBuffer(MemoryStack::mallocInt, var_4_9C:MemoryStack, and:int(ldc:int(9989), ldc:int(20521)))
                var_7_C3 = invokevirtual:IntBuffer(MemoryStack::mallocInt, var_4_9C:MemoryStack, xor:int(ldc:int(-28639), ldc:int(-28640)))
                
                while (cmpeq:boolean(getfield:long(\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\uc238\u839e\ua3b4\u1187\u392e\u8c8a, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a), ldc:long(0L))) {
                    if (logicalnot:boolean(invokespecial:boolean(\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\u64f2\u946b\u4492\u40a9\u647c\u7043, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a))) {
                        athrow(initobject:IOException(IOException::<init>, loadelement:String(getstatic:String[](\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\ud523\u9033\u4975\u97e6\u3504\uc7fe), and:int(ldc:int(12531), ldc:int(-12532)))))
                    }
                    
                    var_8_107 = invokevirtual:int(Buffer::position, getfield:ByteBuffer[expected:Buffer](\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\u98a4\ubff1\u960f\u4cd9\u74b1\u64ab, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a))
                    invokevirtual:Buffer(Buffer::position, getfield:ByteBuffer[expected:Buffer](\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\u98a4\ubff1\u960f\u4cd9\u74b1\u64ab, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a), and:int(ldc:int(-27687), ldc:int(27654)))
                    putfield:long(\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\uc238\u839e\ua3b4\u1187\u392e\u8c8a, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a, invokestatic:long(STBVorbis::stb_vorbis_open_pushdata, getfield:ByteBuffer(\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\u98a4\ubff1\u960f\u4cd9\u74b1\u64ab, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a), var_6_B1:IntBuffer, var_7_C3:IntBuffer, checkcast:STBVorbisAlloc(org.lwjgl.stb.STBVorbisAlloc.class, aconstnull:STBVorbisAlloc())))
                    invokevirtual:Buffer(Buffer::position, getfield:ByteBuffer[expected:Buffer](\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\u98a4\ubff1\u960f\u4cd9\u74b1\u64ab, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a), var_8_107:int)
                    var_9_151 = invokevirtual:int(IntBuffer::get, var_7_C3:IntBuffer, and:int(ldc:int(8824), ldc:int(-11005)))
                    
                    if (cmpeq:boolean(var_9_151:int, xor:int(ldc:int(3120), ldc:int(3121)))) {
                        invokespecial:void(\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\u516c\u7bad\u8d98\u88c5\u52d3\u6b0d, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a)
                    }
                    else {
                        if (cmpne:boolean(var_9_151:int, ldc:int(0))) {
                            athrow(initobject:IOException(IOException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\ud523\u9033\u4975\u97e6\u3504\uc7fe), and:int(ldc:int(16393), ldc:int(2613)))), var_9_151:int))))
                        }
                        
                        loopcontinue()
                    }
                }
                
                invokevirtual:Buffer(Buffer::position, getfield:ByteBuffer[expected:Buffer](\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\u98a4\ubff1\u960f\u4cd9\u74b1\u64ab, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a), add:int(invokevirtual:int(Buffer::position, getfield:ByteBuffer[expected:Buffer](\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\u98a4\ubff1\u960f\u4cd9\u74b1\u64ab, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a)), invokevirtual:int(IntBuffer::get, var_6_B1:IntBuffer, and:int(ldc:int(-27205), ldc:int(27204)))))
                var_8_1D8 = invokestatic:STBVorbisInfo(STBVorbisInfo::mallocStack, var_4_9C:MemoryStack)
                invokestatic:STBVorbisInfo(STBVorbis::stb_vorbis_get_info, getfield:long(\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\uc238\u839e\ua3b4\u1187\u392e\u8c8a, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a), var_8_1D8:STBVorbisInfo)
                putfield:AudioFormat(\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\u1187\u64f2\u0a06\ubcb0\u34df\u52d3, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a, initobject:AudioFormat(AudioFormat::<init>, i2f:float(invokevirtual:int(STBVorbisInfo::sample_rate, var_8_1D8:STBVorbisInfo)), ldc:int(16), invokevirtual:int(STBVorbisInfo::channels, var_8_1D8:STBVorbisInfo), and:int[expected:boolean](ldc:int(519), ldc:int(4097)), and:int[expected:boolean](ldc:int(12815), ldc:int(-15968))))
                
                if (cmpeq:boolean(var_4_9C:MemoryStack, aconstnull:MemoryStack())) {
                    return:void()
                }
                
                if (cmpne:boolean(var_5_9F:Throwable, aconstnull:Throwable())) {
                    try {
                        invokevirtual:void(MemoryStack::close, var_4_9C:MemoryStack)
                    }
                    catch (java.lang.Throwable var_6_23C) {
                        invokevirtual:void(Throwable::addSuppressed, var_5_9F:Throwable, var_6_23C:Throwable)
                    }
                    
                    return:void()
                }
                
                invokevirtual:void(MemoryStack::close, var_4_9C:MemoryStack)
            }
            catch (java.lang.Throwable var_6_258) {
                var_5_9F = var_6_258:Throwable
                athrow(var_6_258:Throwable)
            }
            finally {
                if (cmpne:boolean(var_4_9C:MemoryStack, aconstnull:MemoryStack())) {
                    if (cmpne:boolean(var_5_9F:Throwable, aconstnull:Throwable())) {
                        try {
                            invokevirtual:void(MemoryStack::close, var_4_9C:MemoryStack)
                        }
                        catch (java.lang.Throwable var_11_291) {
                            invokevirtual:void(Throwable::addSuppressed, var_5_9F:Throwable, var_11_291:Throwable)
                        }
                    }
                    else {
                        invokevirtual:void(MemoryStack::close, var_4_9C:MemoryStack)
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private boolean \u64f2\u946b\u4492\u40a9\u647c\u7043() {
        var_3_67 : int
        var_4_71 : int
        var_5_81 : byte[]
        var_6_8C : int
        var_7_A0 : int
        
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
        var_3_67 = invokevirtual:int(Buffer::limit, getfield:ByteBuffer[expected:Buffer](\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\u98a4\ubff1\u960f\u4cd9\u74b1\u64ab, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a))
        var_4_71 = sub:int(invokevirtual:int(Buffer::capacity, getfield:ByteBuffer[expected:Buffer](\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\u98a4\ubff1\u960f\u4cd9\u74b1\u64ab, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a)), var_3_67:int)
        
        if (cmpeq:boolean(var_4_71:int, ldc:int(0))) {
            return:boolean(and:int[expected:boolean](ldc:int(6437), ldc:int(8721)))
        }
        
        var_5_81 = newarray:byte[](byte.class, var_4_71:int)
        var_6_8C = invokevirtual:int(InputStream::read, getfield:InputStream(\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\uc84e\u1187\u624e\ud217\u4c04\ud217, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a), var_5_81:byte[])
        
        if (cmpne:boolean(var_6_8C:int, ldc:int(-1))) {
            var_7_A0 = invokevirtual:int(Buffer::position, getfield:ByteBuffer[expected:Buffer](\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\u98a4\ubff1\u960f\u4cd9\u74b1\u64ab, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a))
            invokevirtual:Buffer(Buffer::limit, getfield:ByteBuffer[expected:Buffer](\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\u98a4\ubff1\u960f\u4cd9\u74b1\u64ab, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a), add:int(var_3_67:int, var_6_8C:int))
            invokevirtual:Buffer(Buffer::position, getfield:ByteBuffer[expected:Buffer](\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\u98a4\ubff1\u960f\u4cd9\u74b1\u64ab, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a), var_3_67:int)
            invokevirtual:ByteBuffer(ByteBuffer::put, getfield:ByteBuffer(\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\u98a4\ubff1\u960f\u4cd9\u74b1\u64ab, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a), var_5_81:byte[], and:int(ldc:int(-23935), ldc:int(7454)), var_6_8C:int)
            invokevirtual:Buffer(Buffer::position, getfield:ByteBuffer[expected:Buffer](\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\u98a4\ubff1\u960f\u4cd9\u74b1\u64ab, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a), var_7_A0:int)
            return:boolean(xor:int[expected:boolean](ldc:int(12418), ldc:int(12419)))
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(-28714), ldc:int(28713)))
    }
    
    private void \u516c\u7bad\u8d98\u88c5\u52d3\u6b0d() {
        var_1_5F : int
        stack_89_0 : int [generated]
        var_1_88 : int
        var_3_89 : int
        stack_BA_0 : int [generated]
        var_1_136 : int
        stack_137_0 : int [generated]
        var_5_13A : ByteBuffer
        
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
            var_1_5F = and:int(ldc:int(923921933), ldc:int(-2019710683))
            
            if (cmpne:boolean(invokevirtual:int(Buffer::position, getfield:ByteBuffer[expected:Buffer](\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\u98a4\ubff1\u960f\u4cd9\u74b1\u64ab, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a)), ldc:int(0))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-315232405))
                stack_89_0 = and:int(ldc:int(-6266), ldc:int(6249))
            }
            else {
                stack_89_0 = and:int(ldc:int(197), ldc:int(5377))
            }
            
            var_1_88 = and:int(var_1_5F:int, ldc:int(-1623332195))
            var_3_89 = stack_89_0:int
            
            if (cmpne:boolean(invokevirtual:int(Buffer::position, getfield:ByteBuffer[expected:Buffer](\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\u98a4\ubff1\u960f\u4cd9\u74b1\u64ab, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a)), invokevirtual:int(Buffer::limit, getfield:ByteBuffer[expected:Buffer](\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\u98a4\ubff1\u960f\u4cd9\u74b1\u64ab, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a)))) {
                var_1_88 = and:int(var_1_88:int, ldc:int(356511635))
                stack_BA_0 = and:int(ldc:int(-30863), ldc:int(30732))
            }
            else {
                stack_BA_0 = and:int(ldc:int(393), ldc:int(513))
            }
            
            var_1_136 = and:int(var_1_88:int, ldc:int(1058536421))
            
            if (cmpne:boolean(stack_BA_0:int, ldc:int(0))) {
                if (cmpeq:boolean(var_3_89:int, ldc:int(0))) {
                    invokevirtual:Buffer(Buffer::position, getfield:ByteBuffer[expected:Buffer](\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\u98a4\ubff1\u960f\u4cd9\u74b1\u64ab, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a), and:int(ldc:int(958), ldc:int(-18367)))
                    invokevirtual:Buffer(Buffer::limit, getfield:ByteBuffer[expected:Buffer](\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\u98a4\ubff1\u960f\u4cd9\u74b1\u64ab, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a), and:int(ldc:int(-16870), ldc:int(484)))
                    return:void()
                }
            }
            
            loop {
                if (cmpne:boolean(and:int(var_1_136:int, ldc:int(16777216)), ldc:int(0))) {
                    var_1_136 = and:int(var_1_136:int, ldc:int(-1887962395))
                    
                    if (cmpne:boolean(var_3_89:int, ldc:int(0))) {
                        stack_137_0 = mul:int(and:int(ldc:int(17674), ldc:int(6146)), invokevirtual:int(Buffer::capacity, getfield:ByteBuffer[expected:Buffer](\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\u98a4\ubff1\u960f\u4cd9\u74b1\u64ab, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a)))
                        looporswitchbreak()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_1_136:int, ldc:int(64)), ldc:int(0))) {
                    var_1_136 = and:int(var_1_136:int, ldc:int(362097209))
                    stack_137_0 = invokevirtual:int(Buffer::capacity, getfield:ByteBuffer[expected:Buffer](\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\u98a4\ubff1\u960f\u4cd9\u74b1\u64ab, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a))
                    looporswitchbreak()
                }
                
                var_1_136 = and:int(var_1_136:int, ldc:int(-1248573646))
            }
            
            var_1_136 = and:int(var_1_136:int, ldc:int(1025456221))
            var_5_13A = invokestatic:ByteBuffer(MemoryUtil::memAlloc, stack_137_0:int)
            invokevirtual:ByteBuffer(ByteBuffer::put, var_5_13A:ByteBuffer, getfield:ByteBuffer(\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\u98a4\ubff1\u960f\u4cd9\u74b1\u64ab, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a))
            invokestatic:void(MemoryUtil::memFree, getfield:ByteBuffer[expected:Buffer](\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\u98a4\ubff1\u960f\u4cd9\u74b1\u64ab, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a))
            invokevirtual:Buffer(Buffer::flip, var_5_13A:ByteBuffer[expected:Buffer])
            putfield:ByteBuffer(\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\u98a4\ubff1\u960f\u4cd9\u74b1\u64ab, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a, var_5_13A:ByteBuffer)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private boolean \ub8be\u3e75\ub7dc\u960f\u8cae\uf94d(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u4c04\u927d\u71f1\u3c25\u97b7\u983f p0) {
        var_2_5F : int
        var_2_6B : int
        var_4_A5 : MemoryStack
        var_5_A8 : Throwable
        var_6_B6 : PointerBuffer
        var_7_C4 : IntBuffer
        var_8_D2 : IntBuffer
        var_10_100 : int
        var_11_18E : int
        var_12_1A1 : int
        var_13_1AA : PointerBuffer
        var_6_29E : Throwable
        var_17_2C3 : Throwable
        
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
        var_2_5F = and:int(ldc:int(-241983441), ldc:int(-215490497))
        
        loop {
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(512)), ldc:int(0))) {
                var_2_6B = and:int(var_2_5F:int, ldc:int(1099370733))
            }
            else {
                var_2_6B = and:int(var_2_5F:int, ldc:int(-201863003))
                
                if (cmpne:boolean(getfield:long(\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\uc238\u839e\ua3b4\u1187\u392e\u8c8a, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a), ldc:long(0L))) {
                    var_4_A5 = invokestatic:MemoryStack(MemoryStack::stackPush)
                    var_5_A8 = aconstnull:Throwable()
                    
                    try {
                        var_6_B6 = invokevirtual:PointerBuffer(MemoryStack::mallocPointer, var_4_A5:MemoryStack, and:int(ldc:int(3113), ldc:int(8785)))
                        var_7_C4 = invokevirtual:IntBuffer(MemoryStack::mallocInt, var_4_A5:MemoryStack, and:int(ldc:int(17), ldc:int(303)))
                        var_8_D2 = invokevirtual:IntBuffer(MemoryStack::mallocInt, var_4_A5:MemoryStack, xor:int(ldc:int(9240), ldc:int(9241)))
                        
                        loop {
                            invokevirtual:Buffer(Buffer::position, getfield:ByteBuffer[expected:Buffer](\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\u98a4\ubff1\u960f\u4cd9\u74b1\u64ab, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a), add:int(invokevirtual:int(Buffer::position, getfield:ByteBuffer[expected:Buffer](\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\u98a4\ubff1\u960f\u4cd9\u74b1\u64ab, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a)), invokestatic:int(STBVorbis::stb_vorbis_decode_frame_pushdata, getfield:long(\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\uc238\u839e\ua3b4\u1187\u392e\u8c8a, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a), getfield:ByteBuffer(\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\u98a4\ubff1\u960f\u4cd9\u74b1\u64ab, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a), var_7_C4:IntBuffer, var_6_B6:PointerBuffer, var_8_D2:IntBuffer)))
                            var_10_100 = invokestatic:int(STBVorbis::stb_vorbis_get_error, getfield:long(\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\uc238\u839e\ua3b4\u1187\u392e\u8c8a, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a))
                            
                            if (cmpeq:boolean(var_10_100:int, xor:int(ldc:int(736), ldc:int(737)))) {
                                invokespecial:void(\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\u516c\u7bad\u8d98\u88c5\u52d3\u6b0d, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a)
                                
                                if (logicalnot:boolean(invokespecial:boolean(\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\u64f2\u946b\u4492\u40a9\u647c\u7043, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a))) {
                                    return:boolean(and:int[expected:boolean](ldc:int(4848), ldc:int(-4853)))
                                }
                                
                                loopcontinue()
                            }
                            else {
                                if (cmpne:boolean(var_10_100:int, ldc:int(0))) {
                                    athrow(initobject:IOException(IOException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\ud523\u9033\u4975\u97e6\u3504\uc7fe), and:int(ldc:int(2689), ldc:int(341)))), var_10_100:int))))
                                }
                                
                                var_11_18E = invokevirtual:int(IntBuffer::get, var_8_D2:IntBuffer, and:int(ldc:int(13864), ldc:int(-30509)))
                                
                                if (cmpeq:boolean(var_11_18E:int, ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_12_1A1 = invokevirtual:int(IntBuffer::get, var_7_C4:IntBuffer, and:int(ldc:int(-18464), ldc:int(18462)))
                                var_13_1AA = invokevirtual:PointerBuffer(PointerBuffer::getPointerBuffer, var_6_B6:PointerBuffer, var_12_1A1:int)
                                
                                if (cmpeq:boolean(var_12_1A1:int, and:int(ldc:int(28689), ldc:int(3331)))) {
                                    invokespecial:void(\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\u8aa5\u34df\ub32d\ud36e\u8d98\u8350, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a, invokevirtual:FloatBuffer(PointerBuffer::getFloatBuffer, var_13_1AA:PointerBuffer, and:int(ldc:int(-20279), ldc:int(20004)), var_11_18E:int), p0:\u4c04\u927d\u71f1\u3c25\u97b7\u983f)
                                    return:boolean(xor:int[expected:boolean](ldc:int(18472), ldc:int(18473)))
                                }
                                
                                if (cmpeq:boolean(var_12_1A1:int, and:int(ldc:int(16514), ldc:int(10858)))) {
                                    invokespecial:void(\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\u156b\u7af6\u8d90\u9255\u983f\u69d9, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a, invokevirtual:FloatBuffer(PointerBuffer::getFloatBuffer, var_13_1AA:PointerBuffer, and:int(ldc:int(-5911), ldc:int(1814)), var_11_18E:int), invokevirtual:FloatBuffer(PointerBuffer::getFloatBuffer, var_13_1AA:PointerBuffer, and:int(ldc:int(8235), ldc:int(1025)), var_11_18E:int), p0:\u4c04\u927d\u71f1\u3c25\u97b7\u983f)
                                    return:boolean(xor:int[expected:boolean](ldc:int(2100), ldc:int(2101)))
                                }
                                
                                athrow(initobject:IllegalStateException(IllegalStateException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\ud523\u9033\u4975\u97e6\u3504\uc7fe), xor:int(ldc:int(1153), ldc:int(1155)))), var_12_1A1:int))))
                            }
                        }
                    }
                    catch (java.lang.Throwable var_6_29E) {
                        var_5_A8 = var_6_29E:Throwable
                        athrow(var_6_29E:Throwable)
                    }
                    finally {
                        if (cmpne:boolean(var_4_A5:MemoryStack, aconstnull:MemoryStack())) {
                            if (cmpne:boolean(var_5_A8:Throwable, aconstnull:Throwable())) {
                                try {
                                    invokevirtual:void(MemoryStack::close, var_4_A5:MemoryStack)
                                }
                                catch (java.lang.Throwable var_17_2C3) {
                                    invokevirtual:void(Throwable::addSuppressed, var_5_A8:Throwable, var_17_2C3:Throwable)
                                }
                            }
                            else {
                                invokevirtual:void(MemoryStack::close, var_4_A5:MemoryStack)
                            }
                        }
                    }
                }
            }
            
            if (cmpne:boolean(and:int(var_2_6B:int, ldc:int(131072)), ldc:int(0))) {
                return:boolean(and:int[expected:boolean](ldc:int(21705), ldc:int(-29902)))
            }
            
            var_2_5F = and:int(var_2_6B:int, ldc:int(1304741370))
        }
    }
    
    private void \u8aa5\u34df\ub32d\ud36e\u8d98\u8350(java.nio.FloatBuffer p0, \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u4c04\u927d\u71f1\u3c25\u97b7\u983f p1) {
        var_3_5F : int
        
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
            var_3_5F = and:int(ldc:int(-88107899), ldc:int(-1076496961))
            
            loop {
                var_3_5F = and:int(var_3_5F:int, ldc:int(1066638769))
                
                if (logicalnot:boolean(invokevirtual:boolean(Buffer::hasRemaining, p0:FloatBuffer[expected:Buffer]))) {
                    looporswitchbreak()
                }
                
                invokevirtual:void(\u4c04\u927d\u71f1\u3c25\u97b7\u983f::\uf94d\u16f6\u72f1\ud171\u8709\u9af2, p1:\u4c04\u927d\u71f1\u3c25\u97b7\u983f, invokevirtual:float(FloatBuffer::get, p0:FloatBuffer))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u156b\u7af6\u8d90\u9255\u983f\u69d9(java.nio.FloatBuffer p0, java.nio.FloatBuffer p1, \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u4c04\u927d\u71f1\u3c25\u97b7\u983f p2) {
        var_4_63 : int
        
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
            var_4_63 = and:int(ldc:int(1486501133), ldc:int(-1079846433))
            
            loop {
                var_4_63 = and:int(var_4_63:int, ldc:int(-69226083))
                
                if (logicalnot:boolean(logicaland:boolean(invokevirtual:boolean(Buffer::hasRemaining, p0:FloatBuffer[expected:Buffer]), invokevirtual:boolean(Buffer::hasRemaining, p1:FloatBuffer[expected:Buffer])))) {
                    looporswitchbreak()
                }
                
                invokevirtual:void(\u4c04\u927d\u71f1\u3c25\u97b7\u983f::\uf94d\u16f6\u72f1\ud171\u8709\u9af2, p2:\u4c04\u927d\u71f1\u3c25\u97b7\u983f, invokevirtual:float(FloatBuffer::get, p0:FloatBuffer))
                invokevirtual:void(\u4c04\u927d\u71f1\u3c25\u97b7\u983f::\uf94d\u16f6\u72f1\ud171\u8709\u9af2, p2:\u4c04\u927d\u71f1\u3c25\u97b7\u983f, invokevirtual:float(FloatBuffer::get, p1:FloatBuffer))
            }
            
            return:void()
        }
        
        goto(Label_0006)
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
            
            if (cmpne:boolean(getfield:long(\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\uc238\u839e\ua3b4\u1187\u392e\u8c8a, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a), ldc:long(0L))) {
                invokestatic:void(STBVorbis::stb_vorbis_close, getfield:long(\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\uc238\u839e\ua3b4\u1187\u392e\u8c8a, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a))
                putfield:long(\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\uc238\u839e\ua3b4\u1187\u392e\u8c8a, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a, ldc:long(0L))
            }
            
            invokestatic:void(MemoryUtil::memFree, getfield:ByteBuffer[expected:Buffer](\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\u98a4\ubff1\u960f\u4cd9\u74b1\u64ab, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a))
            invokevirtual:void(InputStream::close, getfield:InputStream(\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\uc84e\u1187\u624e\ud217\u4c04\ud217, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public javax.sound.sampled.AudioFormat \u4492\u2dcc\u4c04\u92ff\uf94d\u6198() {
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
            return:AudioFormat(getfield:AudioFormat(\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\u1187\u64f2\u0a06\ubcb0\u34df\u52d3, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a))
        }
        
        goto(Label_0006)
    }
    
    public java.nio.ByteBuffer \u494c\u3a62\u9033\u47c2\u3504\uc87f(int p0) {
        var_2_61 : int
        var_4_72 : \u4c04\u927d\u71f1\u3c25\u97b7\u983f
        
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
            var_2_61 = and:int(ldc:int(1959191862), ldc:int(-63182026))
            var_4_72 = initobject:\u4c04\u927d\u71f1\u3c25\u97b7\u983f(\u4c04\u927d\u71f1\u3c25\u97b7\u983f::<init>, add:int(p0:int, xor:int(ldc:int(327), ldc:int(8519))))
            
            loop {
                var_2_61 = and:int(var_2_61:int, ldc:int(2133257075))
                
                if (logicaland:boolean(invokespecial:boolean(\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\ub8be\u3e75\ub7dc\u960f\u8cae\uf94d, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a, var_4_72:\u4c04\u927d\u71f1\u3c25\u97b7\u983f), cmplt:boolean(invokestatic:int(\u4c04\u927d\u71f1\u3c25\u97b7\u983f::\u8753\u3504\u8640\u0b8e\u76bc\u5db4, var_4_72:\u4c04\u927d\u71f1\u3c25\u97b7\u983f), p0:int))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
            
            return:ByteBuffer(invokevirtual:ByteBuffer(\u4c04\u927d\u71f1\u3c25\u97b7\u983f::\u9937\u40a9\u5db4\ud51e\u071d\u5bc4, var_4_72:\u4c04\u927d\u71f1\u3c25\u97b7\u983f))
        }
        
        goto(Label_0006)
    }
    
    public java.nio.ByteBuffer \u3dd3\u071d\u62da\ub113\ubf56\u69d9() {
        var_1_61 : int
        var_3_70 : \u4c04\u927d\u71f1\u3c25\u97b7\u983f
        
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
            var_1_61 = and:int(ldc:int(286025905), ldc:int(65187065))
            var_3_70 = initobject:\u4c04\u927d\u71f1\u3c25\u97b7\u983f(\u4c04\u927d\u71f1\u3c25\u97b7\u983f::<init>, and:int(ldc:int(17970), ldc:int(24585)))
            
            loop {
                var_1_61 = and:int(var_1_61:int, ldc:int(-1544012869))
                
                if (logicalnot:boolean(invokespecial:boolean(\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\ub8be\u3e75\ub7dc\u960f\u8cae\uf94d, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a, var_3_70:\u4c04\u927d\u71f1\u3c25\u97b7\u983f))) {
                    looporswitchbreak()
                }
            }
            
            return:ByteBuffer(invokevirtual:ByteBuffer(\u4c04\u927d\u71f1\u3c25\u97b7\u983f::\u9937\u40a9\u5db4\ud51e\u071d\u5bc4, var_3_70:\u4c04\u927d\u71f1\u3c25\u97b7\u983f))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_80 : int
        expr_6E : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_C5_0 : byte[] [generated]
        stack_C7_0 : byte[] [generated]
        stack_EE_0 : byte[] [generated]
        stack_189_0 : byte[] [generated]
        stack_1EB_0 : byte[] [generated]
        stack_266_0 : byte[] [generated]
        var_4_16A : int
        var_3_16F : byte[]
        var_5_170 : int
        expr_18F : byte [generated]
        var_0_205 : int
        expr_1EB : byte [generated]
        stack_234_2 : byte [generated]
        stack_208_0 : byte [generated]
        expr_96 : int [generated]
        var_2_C5 : byte[]
        expr_C9 : int [generated]
        var_3_254 : byte[]
        var_5_255 : int
        var_3_FA : String
        stack_163_0 : String[] [generated]
        expr_10C : String[] [generated]
        
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
        var_0_80 = and:int(ldc:int(-525495478), ldc:int(-1262505645))
        expr_6E = arraylength:int(stack_94_0 = stack_96_0 = stack_C5_0 = stack_C7_0 = stack_EE_0 = stack_189_0 = stack_1EB_0 = stack_266_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("U5e0th6HETy2D5OuNNInbx6TI6ignHnawE+XtLYehxE8iSe4nBzMJ28eoA+TqjbWCU2otI2uLo8FmLyogR60GyqgC56ajaicffo6CLqB")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_16A = expr_6E:int
        var_3_16F = newarray:byte[](byte.class, expr_6E:int)
        var_5_170 = expr_6E:int
        Label_0370:
        
        while (cmpeq:boolean(and:int(var_0_80:int, ldc:int(32)), ldc:int(0))) {
            var_0_80 = and:int(var_0_80:int, ldc:int(-1259358973))
            var_5_170 = add:int(var_5_170:int, ldc:int(-1))
            expr_18F = add:byte(xor:byte(loadelement:byte(stack_189_0:byte[], var_5_170:int), ldc:byte(6)), ldc:byte(104))
            storeelement:byte(var_3_16F:byte[], var_5_170:int, or:int(and:int(shl:int(expr_18F:byte, and:int(ldc:int(3108), ldc:int(8390))), ldc:int(-16)), and:int(shr:int(expr_18F:byte[expected:int], and:int(ldc:int(12326), ldc:int(845))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_170:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C5_0 = stack_C7_0 = stack_EE_0 = stack_189_0 = stack_1EB_0 = stack_266_0 = var_3_16F:byte[]
            goto(Label_0115)
        }
        
        Label_0468:
        
        while (cmpne:boolean(and:int(var_0_80:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_205 = and:int(var_0_80:int, ldc:int(-487713534))
            var_5_170 = add:int(var_5_170:int, ldc:int(-1))
            expr_1EB = stack_234_2 = loadelement(stack_1EB_0, var_5_170)
            
            if (cmplt:boolean(add:int(add:int(var_5_170:int, ldc:int(2)), neg:int(var_4_16A:int)), ldc:int(0))) {
                stack_234_2 = stack_208_0 = add:byte(expr_1EB:byte, loadelement:byte(var_3_16F:byte[], add:int(var_5_170:int, ldc:int(2))))
                goto(Label_0536)
            }
            
            Label_0504:
            
            if (cmpeq:boolean(and:int(var_0_205:int, ldc:int(16)), ldc:int(0))) {
                var_0_205 = and:int(var_0_205:int, ldc:int(-51561581))
                stack_234_2 = stack_208_0 = add:byte(expr_1EB:byte, ldc:byte(2))
            }
            
            Label_0536:
            
            if (cmpne:boolean(and:int(var_0_205:int, ldc:int(67108864)), ldc:int(0))) {
                var_0_205 = and:int(var_0_205:int, ldc:int(-1654830940))
                goto(Label_0504)
            }
            
            var_0_80 = and:int(var_0_205:int, ldc:int(-504417830))
            storeelement:byte(var_3_16F:byte[], var_5_170:int, stack_234_2:byte)
            
            if (cmpne:boolean(var_5_170:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C5_0 = stack_C7_0 = stack_EE_0 = stack_189_0 = stack_1EB_0 = stack_266_0 = var_3_16F:byte[]
            goto(Label_0155)
        }
        
        goto(Label_0370)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_80:int, ldc:int(524288)), ldc:int(0))) {
            var_0_80 = and:int(var_0_80:int, ldc:int(57711437))
            goto(Label_0206)
        }
        
        if (cmpeq:boolean(and:int(var_0_80:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_80 = and:int(var_0_80:int, ldc:int(-1309689993))
            expr_96 = arraylength:int(stack_96_0:byte[])
            
            if (cmpne:boolean(expr_96:int, ldc:int(0))) {
                var_4_16A = expr_96:int
                var_3_16F = newarray:byte[](byte.class, expr_96:int)
                var_5_170 = expr_96:int
                goto(Label_0468)
            }
        }
        
        Label_0155:
        
        if (cmpeq:boolean(and:int(var_0_80:int, ldc:int(524288)), ldc:int(0))) {
            var_0_80 = and:int(var_0_80:int, ldc:int(-1756836884))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_80:int, ldc:int(2097152)), ldc:int(0))) {
                var_0_80 = and:int(var_0_80:int, ldc:int(542262323))
                goto(Label_0115)
            }
            
            var_0_80 = and:int(var_0_80:int, ldc:int(-1376927806))
            var_2_C5 = stack_C5_0:byte[]
            expr_C9 = add:int(arraylength:int(stack_C7_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_C9:int, ldc:int(0))) {
                var_3_254 = newarray:byte[](byte.class, expr_C9:int)
                var_5_255 = expr_C9:int
                
                loop {
                    var_0_80 = and:int(var_0_80:int, ldc:int(-424692937))
                    var_5_255 = add:int(var_5_255:int, ldc:int(-1))
                    storeelement:byte(var_3_254:byte[], var_5_255:int, add:int(shl:int(loadelement:byte(stack_266_0:byte[], var_5_255:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_C5:byte[], add:int(var_5_255:int, xor:int(ldc:int(1040), ldc:int(1041)))), ldc:int(5)), and:int(ldc:int(6151), ldc:int(167)))))
                    
                    if (cmpne:boolean(var_5_255:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_C5_0 = stack_C7_0 = stack_EE_0 = stack_189_0 = stack_1EB_0 = stack_266_0 = var_3_254:byte[]
            }
        }
        
        Label_0206:
        
        if (cmpeq:boolean(and:int(var_0_80:int, ldc:int(262144)), ldc:int(0))) {
            goto(Label_0155)
        }
        
        if (cmpeq:boolean(and:int(var_0_80:int, ldc:int(262144)), ldc:int(0))) {
            var_0_80 = and:int(var_0_80:int, ldc:int(2041714037))
            goto(Label_0115)
        }
        
        var_3_FA = initobject:String(String::<init>, stack_EE_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_163_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(19459), ldc:int(771)))
        expr_10C = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(8711), ldc:int(3171)))
        storeelement:String(expr_10C:String[], and:int(ldc:int(-2267), ldc:int(2266)), invokevirtual:String[expected:String](String::substring, var_3_FA:String, and:int(ldc:int(17031), ldc:int(-17032)), xor:int(ldc:int(2640), ldc:int(2633))))
        storeelement:String(expr_10C:String[], and:int(ldc:int(10245), ldc:int(5233)), invokevirtual:String[expected:String](String::substring, var_3_FA:String, xor:int(ldc:int(8384), ldc:int(8409)), and:int(ldc:int(439), ldc:int(29753))))
        storeelement:String(expr_10C:String[], and:int(ldc:int(12490), ldc:int(16438)), invokevirtual:String[expected:String](String::substring, var_3_FA:String, and:int(ldc:int(121), ldc:int(8369)), and:int(ldc:int(20941), ldc:int(9325))))
        putstatic:String[](\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\ud523\u9033\u4975\u97e6\u3504\uc7fe, expr_10C:String[])
    }
    
    public void \uc2bd\u0c95\u64ab\u5bc4\u72f1\u624e(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6C3 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_6CE : int
        
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
        var_3_6C3 = and:int(ldc:int(-59917438), ldc:int(-1108558954))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-2028386940))
        }
        else {
            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1143162891))
            var_5_8A = and:int(ldc:int(12916), ldc:int(-12917))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-10408), ldc:int(10374)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_6C3:int, ldc:int(-85132308))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, and:int(ldc:int(28809), ldc:int(801)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(1293), ldc:int(4609)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_6C3 = and:int(var_3_DA:int, ldc:int(-1201882234))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(-28662), ldc:int(-28661)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1610)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1445)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1503713757))
                        goto(Label_1283)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1169)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0993)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1778507769))
                        goto(Label_0863)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(894616066))
                        goto(Label_0717)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-521155580))
                        goto(Label_0584)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1719966866))
                    }
                    else {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1199637547))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0584)
                            }
                            
                            goto(Label_0863)
                        }
                    }
                    
                    Label_0418:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1619046732))
                        goto(Label_1610)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(346024155))
                        goto(Label_1445)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1283)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(739616171))
                        goto(Label_1169)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0993)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1589976028))
                        goto(Label_0863)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0717)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-19021827))
                            var_11_EB = and:int(ldc:int(-12799), ldc:int(12540))
                            goto(Label_1599)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0584:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1610)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1445)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-42939474))
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-2143377716))
                        goto(Label_1169)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1993571468))
                        goto(Label_0993)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-310820577))
                        goto(Label_0863)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0418)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(2145104181))
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-59769967))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0863)
                        }
                    }
                    
                    Label_0717:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-547057775))
                        goto(Label_1610)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1445)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1503781853))
                        goto(Label_1169)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1992561018))
                        goto(Label_0993)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(512)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-210326401))
                            goto(Label_0584)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1617778057))
                            goto(Label_0418)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1529245652))
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1142033530))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0863:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-654519145))
                        goto(Label_1610)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(936257733))
                        goto(Label_1445)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1283)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-909000215))
                        goto(Label_1169)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(512)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(187521567))
                            goto(Label_0717)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0584)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1013768537))
                            goto(Label_0418)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1073742890))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = xor:int(ldc:int(36), ldc:int(37))
                                goto(Label_1169)
                            }
                        }
                    }
                    
                    Label_0993:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-714314088))
                        goto(Label_1610)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1445)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1178727082))
                        goto(Label_1283)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1696424553))
                            goto(Label_0863)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1043714482))
                            goto(Label_0717)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-563056277))
                            goto(Label_0584)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0418)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1727448516))
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1092750413))
                        var_11_EB = and:int(ldc:int(-5621), ldc:int(5600))
                    }
                    
                    Label_1169:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1610)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1692502427))
                        goto(Label_1445)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0993)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1233632711))
                            goto(Label_0863)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0717)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0584)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(584143392))
                            goto(Label_0418)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-131174))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1445)
                            }
                        }
                    }
                    
                    Label_1283:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1092366070))
                        goto(Label_1610)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-120409453))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-227708807))
                            goto(Label_1169)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-581130830))
                            goto(Label_0993)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0863)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(2095992848))
                            goto(Label_0717)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(297634907))
                            goto(Label_0584)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0418)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(934776776))
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-60965895))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                        goto(Label_1599)
                    }
                    
                    Label_1445:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1610)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1526130365))
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1169)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-883122675))
                        goto(Label_0993)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(351322380))
                        goto(Label_0863)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0717)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-242830850))
                        goto(Label_0584)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-164527417))
                        goto(Label_0418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1418640322))
                        loopcontinue()
                    }
                    
                    var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1075842086))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1599:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6CE = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1610:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(194585373))
                        goto(Label_1445)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1169)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1972549519))
                        goto(Label_0993)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0863)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0717)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(717601915))
                        goto(Label_0584)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-610005235))
                        goto(Label_0418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1159874591))
                        var_17_6CE = add:int(var_16_119:int, xor:int(ldc:int(8608), ldc:int(8609)))
                        looporswitchbreak()
                    }
                    
                    var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-785224790))
                }
                
                var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-85147748))
                
                if (cmple:boolean(var_5_8A = var_17_6CE:int, sub:int(var_6_91:int, xor:int(ldc:int(-14332), ldc:int(-14331))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(128)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
