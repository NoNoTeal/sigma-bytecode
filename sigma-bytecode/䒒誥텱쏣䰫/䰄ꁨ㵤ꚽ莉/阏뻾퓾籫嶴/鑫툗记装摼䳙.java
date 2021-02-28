public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u946b\ud217\u8bb0\u88c5\u647c\u4cd9 {
    public void \u946b\ud217\u8bb0\u88c5\u647c\u4cd9(java.lang.String p0, java.io.InputStream p1) {
        var_6_79 : MemoryStack
        var_7_80 : Throwable
        var_8_8A : \u8d90\u7006\u527a\ua3b4\u16f6\u4cd9
        var_9_91 : Throwable
        var_10_A6 : STBIReadCallback
        var_11_AD : Throwable
        var_12_C2 : STBISkipCallback
        var_13_C9 : Throwable
        var_14_DE : STBIEOFCallback
        var_15_E5 : Throwable
        var_16_F0 : STBIIOCallbacks
        var_17_126 : IntBuffer
        var_18_138 : IntBuffer
        var_16_1F1 : Throwable
        var_16_20D : Throwable
        var_21_246 : Throwable
        var_14_28C : Throwable
        var_14_2A8 : Throwable
        var_23_2E1 : Throwable
        var_12_327 : Throwable
        var_12_343 : Throwable
        var_25_37C : Throwable
        var_10_3C2 : Throwable
        var_10_3DE : Throwable
        var_27_417 : Throwable
        var_8_45D : Throwable
        var_8_479 : Throwable
        var_29_4B2 : Throwable
        
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
            invokespecial:Object(Object::<init>, this:\u946b\ud217\u8bb0\u88c5\u647c\u4cd9)
            monitorenter(getstatic:Object(\u946b\ud217\u8bb0\u88c5\u647c\u4cd9::\u759a\u3776\u7006\u3d64\u97e6\u47c2))
            
            try {
                var_6_79 = invokestatic:MemoryStack(MemoryStack::stackPush)
                var_7_80 = aconstnull:Throwable()
                
                try {
                    var_8_8A = invokestatic:\u8d90\u7006\u527a\ua3b4\u16f6\u4cd9(\u946b\ud217\u8bb0\u88c5\u647c\u4cd9::\u4f52\u71f1\ub19c\u64f2\u93a2\u8753, p1:InputStream)
                    var_9_91 = aconstnull:Throwable()
                    
                    try {
                        var_10_A6 = invokestatic:STBIReadCallback(STBIReadCallback::create, invokedynamic:STBIReadCallbackI(invoke:(L\u516c\u3d64\u718f\ub171\u6b5f/\u8d90\u7006\u527a\ua3b4\u16f6\u4cd9;)Lorg/lwjgl/stb/STBIReadCallbackI;, var_8_8A:\u8d90\u7006\u527a\ua3b4\u16f6\u4cd9))
                        var_11_AD = aconstnull:Throwable()
                        
                        try {
                            var_12_C2 = invokestatic:STBISkipCallback(STBISkipCallback::create, invokedynamic:STBISkipCallbackI(invoke:(L\u516c\u3d64\u718f\ub171\u6b5f/\u8d90\u7006\u527a\ua3b4\u16f6\u4cd9;)Lorg/lwjgl/stb/STBISkipCallbackI;, var_8_8A:\u8d90\u7006\u527a\ua3b4\u16f6\u4cd9))
                            var_13_C9 = aconstnull:Throwable()
                            
                            try {
                                var_14_DE = invokestatic:STBIEOFCallback(STBIEOFCallback::create, invokedynamic:STBIEOFCallbackI(invoke:(L\u516c\u3d64\u718f\ub171\u6b5f/\u8d90\u7006\u527a\ua3b4\u16f6\u4cd9;)Lorg/lwjgl/stb/STBIEOFCallbackI;, var_8_8A:\u8d90\u7006\u527a\ua3b4\u16f6\u4cd9))
                                var_15_E5 = aconstnull:Throwable()
                                
                                try {
                                    var_16_F0 = invokestatic:STBIIOCallbacks(STBIIOCallbacks::mallocStack, var_6_79:MemoryStack)
                                    invokevirtual:STBIIOCallbacks(STBIIOCallbacks::read, var_16_F0:STBIIOCallbacks, var_10_A6:STBIReadCallbackI)
                                    invokevirtual:STBIIOCallbacks(STBIIOCallbacks::skip, var_16_F0:STBIIOCallbacks, var_12_C2:STBISkipCallbackI)
                                    invokevirtual:STBIIOCallbacks(STBIIOCallbacks::eof, var_16_F0:STBIIOCallbacks, var_14_DE:STBIEOFCallbackI)
                                    var_17_126 = invokevirtual:IntBuffer(MemoryStack::mallocInt, var_6_79:MemoryStack, and:int(ldc:int(16417), ldc:int(3585)))
                                    var_18_138 = invokevirtual:IntBuffer(MemoryStack::mallocInt, var_6_79:MemoryStack, and:int(ldc:int(18737), ldc:int(8329)))
                                    
                                    if (logicalnot:boolean(invokestatic:boolean(STBImage::stbi_info_from_callbacks, var_16_F0:STBIIOCallbacks, ldc:long(0L), var_17_126:IntBuffer, var_18_138:IntBuffer, invokevirtual:IntBuffer(MemoryStack::mallocInt, var_6_79:MemoryStack, xor:int(ldc:int(4611), ldc:int(4610)))))) {
                                        athrow(initobject:IOException(IOException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u946b\ud217\u8bb0\u88c5\u647c\u4cd9::\u93a2\u965f\u6cfe\u59ec\u98a4\u718f), and:int(ldc:int(-4551), ldc:int(4550)))), p0:String), loadelement:String(getstatic:String[](\u946b\ud217\u8bb0\u88c5\u647c\u4cd9::\u93a2\u965f\u6cfe\u59ec\u98a4\u718f), xor:int(ldc:int(16899), ldc:int(16898)))), invokestatic:String(STBImage::stbi_failure_reason)))))
                                    }
                                    
                                    putfield:int(\u946b\ud217\u8bb0\u88c5\u647c\u4cd9::\uc29a\ub19c\u67d0\u385b\u5140\ua562, this:\u946b\ud217\u8bb0\u88c5\u647c\u4cd9, invokevirtual:int(IntBuffer::get, var_17_126:IntBuffer, and:int(ldc:int(-21584), ldc:int(21579))))
                                    putfield:int(\u946b\ud217\u8bb0\u88c5\u647c\u4cd9::\ucfaf\ud7e8\u5140\ub8be\u6198\uc910, this:\u946b\ud217\u8bb0\u88c5\u647c\u4cd9, invokevirtual:int(IntBuffer::get, var_18_138:IntBuffer, and:int(ldc:int(11537), ldc:int(-11546))))
                                    
                                    if (cmpeq:boolean(var_14_DE:STBIEOFCallback, aconstnull:STBIEOFCallback())) {
                                        goto(Label_0614)
                                    }
                                    
                                    if (cmpne:boolean(var_15_E5:Throwable, aconstnull:Throwable())) {
                                        try {
                                            invokevirtual:void(STBIEOFCallback::close, var_14_DE:STBIEOFCallback)
                                        }
                                        catch (java.lang.Throwable var_16_1F1) {
                                            invokevirtual:void(Throwable::addSuppressed, var_15_E5:Throwable, var_16_1F1:Throwable)
                                        }
                                        
                                        goto(Label_0614)
                                    }
                                    
                                    invokevirtual:void(STBIEOFCallback::close, var_14_DE:STBIEOFCallback)
                                }
                                catch (java.lang.Throwable var_16_20D) {
                                    var_15_E5 = var_16_20D:Throwable
                                    athrow(var_16_20D:Throwable)
                                }
                                finally {
                                    if (cmpne:boolean(var_14_DE:STBIEOFCallback, aconstnull:STBIEOFCallback())) {
                                        if (cmpne:boolean(var_15_E5:Throwable, aconstnull:Throwable())) {
                                            try {
                                                invokevirtual:void(STBIEOFCallback::close, var_14_DE:STBIEOFCallback)
                                            }
                                            catch (java.lang.Throwable var_21_246) {
                                                invokevirtual:void(Throwable::addSuppressed, var_15_E5:Throwable, var_21_246:Throwable)
                                            }
                                        }
                                        else {
                                            invokevirtual:void(STBIEOFCallback::close, var_14_DE:STBIEOFCallback)
                                        }
                                    }
                                }
                                
                                Label_0614:
                                
                                if (cmpeq:boolean(var_12_C2:STBISkipCallback, aconstnull:STBISkipCallback())) {
                                    goto(Label_0769)
                                }
                                
                                if (cmpne:boolean(var_13_C9:Throwable, aconstnull:Throwable())) {
                                    try {
                                        invokevirtual:void(STBISkipCallback::close, var_12_C2:STBISkipCallback)
                                    }
                                    catch (java.lang.Throwable var_14_28C) {
                                        invokevirtual:void(Throwable::addSuppressed, var_13_C9:Throwable, var_14_28C:Throwable)
                                    }
                                    
                                    goto(Label_0769)
                                }
                                
                                invokevirtual:void(STBISkipCallback::close, var_12_C2:STBISkipCallback)
                            }
                            catch (java.lang.Throwable var_14_2A8) {
                                var_13_C9 = var_14_2A8:Throwable
                                athrow(var_14_2A8:Throwable)
                            }
                            finally {
                                if (cmpne:boolean(var_12_C2:STBISkipCallback, aconstnull:STBISkipCallback())) {
                                    if (cmpne:boolean(var_13_C9:Throwable, aconstnull:Throwable())) {
                                        try {
                                            invokevirtual:void(STBISkipCallback::close, var_12_C2:STBISkipCallback)
                                        }
                                        catch (java.lang.Throwable var_23_2E1) {
                                            invokevirtual:void(Throwable::addSuppressed, var_13_C9:Throwable, var_23_2E1:Throwable)
                                        }
                                    }
                                    else {
                                        invokevirtual:void(STBISkipCallback::close, var_12_C2:STBISkipCallback)
                                    }
                                }
                            }
                            
                            Label_0769:
                            
                            if (cmpeq:boolean(var_10_A6:STBIReadCallback, aconstnull:STBIReadCallback())) {
                                goto(Label_0924)
                            }
                            
                            if (cmpne:boolean(var_11_AD:Throwable, aconstnull:Throwable())) {
                                try {
                                    invokevirtual:void(STBIReadCallback::close, var_10_A6:STBIReadCallback)
                                }
                                catch (java.lang.Throwable var_12_327) {
                                    invokevirtual:void(Throwable::addSuppressed, var_11_AD:Throwable, var_12_327:Throwable)
                                }
                                
                                goto(Label_0924)
                            }
                            
                            invokevirtual:void(STBIReadCallback::close, var_10_A6:STBIReadCallback)
                        }
                        catch (java.lang.Throwable var_12_343) {
                            var_11_AD = var_12_343:Throwable
                            athrow(var_12_343:Throwable)
                        }
                        finally {
                            if (cmpne:boolean(var_10_A6:STBIReadCallback, aconstnull:STBIReadCallback())) {
                                if (cmpne:boolean(var_11_AD:Throwable, aconstnull:Throwable())) {
                                    try {
                                        invokevirtual:void(STBIReadCallback::close, var_10_A6:STBIReadCallback)
                                    }
                                    catch (java.lang.Throwable var_25_37C) {
                                        invokevirtual:void(Throwable::addSuppressed, var_11_AD:Throwable, var_25_37C:Throwable)
                                    }
                                }
                                else {
                                    invokevirtual:void(STBIReadCallback::close, var_10_A6:STBIReadCallback)
                                }
                            }
                        }
                        
                        Label_0924:
                        
                        if (cmpeq:boolean(var_8_8A:\u8d90\u7006\u527a\ua3b4\u16f6\u4cd9, aconstnull:\u8d90\u7006\u527a\ua3b4\u16f6\u4cd9())) {
                            goto(Label_1079)
                        }
                        
                        if (cmpne:boolean(var_9_91:Throwable, aconstnull:Throwable())) {
                            try {
                                invokevirtual:void(\u8d90\u7006\u527a\ua3b4\u16f6\u4cd9::close, var_8_8A:\u8d90\u7006\u527a\ua3b4\u16f6\u4cd9)
                            }
                            catch (java.lang.Throwable var_10_3C2) {
                                invokevirtual:void(Throwable::addSuppressed, var_9_91:Throwable, var_10_3C2:Throwable)
                            }
                            
                            goto(Label_1079)
                        }
                        
                        invokevirtual:void(\u8d90\u7006\u527a\ua3b4\u16f6\u4cd9::close, var_8_8A:\u8d90\u7006\u527a\ua3b4\u16f6\u4cd9)
                    }
                    catch (java.lang.Throwable var_10_3DE) {
                        var_9_91 = var_10_3DE:Throwable
                        athrow(var_10_3DE:Throwable)
                    }
                    finally {
                        if (cmpne:boolean(var_8_8A:\u8d90\u7006\u527a\ua3b4\u16f6\u4cd9, aconstnull:\u8d90\u7006\u527a\ua3b4\u16f6\u4cd9())) {
                            if (cmpne:boolean(var_9_91:Throwable, aconstnull:Throwable())) {
                                try {
                                    invokevirtual:void(\u8d90\u7006\u527a\ua3b4\u16f6\u4cd9::close, var_8_8A:\u8d90\u7006\u527a\ua3b4\u16f6\u4cd9)
                                }
                                catch (java.lang.Throwable var_27_417) {
                                    invokevirtual:void(Throwable::addSuppressed, var_9_91:Throwable, var_27_417:Throwable)
                                }
                            }
                            else {
                                invokevirtual:void(\u8d90\u7006\u527a\ua3b4\u16f6\u4cd9::close, var_8_8A:\u8d90\u7006\u527a\ua3b4\u16f6\u4cd9)
                            }
                        }
                    }
                    
                    Label_1079:
                    
                    if (cmpeq:boolean(var_6_79:MemoryStack, aconstnull:MemoryStack())) {
                        return:void()
                    }
                    
                    if (cmpne:boolean(var_7_80:Throwable, aconstnull:Throwable())) {
                        try {
                            invokevirtual:void(MemoryStack::close, var_6_79:MemoryStack)
                        }
                        catch (java.lang.Throwable var_8_45D) {
                            invokevirtual:void(Throwable::addSuppressed, var_7_80:Throwable, var_8_45D:Throwable)
                        }
                        
                        return:void()
                    }
                    
                    invokevirtual:void(MemoryStack::close, var_6_79:MemoryStack)
                }
                catch (java.lang.Throwable var_8_479) {
                    var_7_80 = var_8_479:Throwable
                    athrow(var_8_479:Throwable)
                }
                finally {
                    if (cmpne:boolean(var_6_79:MemoryStack, aconstnull:MemoryStack())) {
                        if (cmpne:boolean(var_7_80:Throwable, aconstnull:Throwable())) {
                            try {
                                invokevirtual:void(MemoryStack::close, var_6_79:MemoryStack)
                            }
                            catch (java.lang.Throwable var_29_4B2) {
                                invokevirtual:void(Throwable::addSuppressed, var_7_80:Throwable, var_29_4B2:Throwable)
                            }
                        }
                        else {
                            invokevirtual:void(MemoryStack::close, var_6_79:MemoryStack)
                        }
                    }
                }
            }
            finally {
                monitorexit(getstatic:Object(\u946b\ud217\u8bb0\u88c5\u647c\u4cd9::\u759a\u3776\u7006\u3d64\u97e6\u47c2))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String toString() {
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
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u946b\ud217\u8bb0\u88c5\u647c\u4cd9::\u93a2\u965f\u6cfe\u59ec\u98a4\u718f), and:int(ldc:int(430), ldc:int(530)))), getfield:int(\u946b\ud217\u8bb0\u88c5\u647c\u4cd9::\uc29a\ub19c\u67d0\u385b\u5140\ua562, this:\u946b\ud217\u8bb0\u88c5\u647c\u4cd9)), loadelement:String(getstatic:String[](\u946b\ud217\u8bb0\u88c5\u647c\u4cd9::\u93a2\u965f\u6cfe\u59ec\u98a4\u718f), and:int(ldc:int(19), ldc:int(1187)))), getfield:int(\u946b\ud217\u8bb0\u88c5\u647c\u4cd9::\ucfaf\ud7e8\u5140\ub8be\u6198\uc910, this:\u946b\ud217\u8bb0\u88c5\u647c\u4cd9))))
        }
        
        goto(Label_0006)
    }
    
    private static \u516c\u3d64\u718f\ub171\u6b5f.\u8d90\u7006\u527a\ua3b4\u16f6\u4cd9 \u4f52\u71f1\ub19c\u64f2\u93a2\u8753(java.io.InputStream p0) {
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
            return:\u8d90\u7006\u527a\ua3b4\u16f6\u4cd9(ternaryop:\u8d90\u7006\u527a\ua3b4\u16f6\u4cd9(instanceof:boolean(java.io.FileInputStream.class, p0:InputStream), initobject:\ud217\ucef1\u8350\u3e75\uafe7\u9033[expected:\u8d90\u7006\u527a\ua3b4\u16f6\u4cd9](\ud217\ucef1\u8350\u3e75\uafe7\u9033::<init>, invokevirtual:FileChannel[expected:SeekableByteChannel](FileInputStream::getChannel, checkcast:FileInputStream(java.io.FileInputStream.class, p0:InputStream[expected:FileInputStream])), aconstnull:\u4e72\u5d20\u960f\u4179\u12b2\u51b2()), initobject:\u34df\u52d3\uc238\u67e9\u8bb0\u624e[expected:\u8d90\u7006\u527a\ua3b4\u16f6\u4cd9](\u34df\u52d3\uc238\u67e9\u8bb0\u624e::<init>, invokestatic:ReadableByteChannel(Channels::newChannel, p0:InputStream), aconstnull:\u4e72\u5d20\u960f\u4179\u12b2\u51b2())))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_223 : int
        expr_6B : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_C7_0 : byte[] [generated]
        stack_C9_0 : byte[] [generated]
        stack_F4_0 : byte[] [generated]
        stack_F6_0 : byte[] [generated]
        stack_128_0 : byte[] [generated]
        stack_1E7_0 : byte[] [generated]
        stack_236_0 : byte[] [generated]
        stack_2B1_0 : byte[] [generated]
        stack_307_0 : byte[] [generated]
        var_4_1C9 : int
        var_3_1CE : byte[]
        var_5_1CF : int
        var_0_250 : int
        expr_236 : byte [generated]
        stack_27F_2 : byte [generated]
        stack_253_0 : byte [generated]
        expr_9E : int [generated]
        var_2_C7 : byte[]
        expr_CB : int [generated]
        var_3_29F : byte[]
        var_5_2A0 : int
        expr_F6 : int [generated]
        var_3_2F5 : byte[]
        var_5_2F6 : int
        expr_30A : byte [generated]
        var_3_134 : String
        stack_1B8_0 : String[] [generated]
        expr_146 : String[] [generated]
        
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
        var_0_223 = and:int(ldc:int(730150902), ldc:int(2061974770))
        expr_6B = arraylength:int(stack_9C_0 = stack_9E_0 = stack_C7_0 = stack_C9_0 = stack_F4_0 = stack_F6_0 = stack_128_0 = stack_1E7_0 = stack_236_0 = stack_2B1_0 = stack_307_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("LkbdAqHptQ38momVbS1JcUG5bWGd8WVtZYUFmJJ0qDhKcarq7WI7DyscVg==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1C9 = expr_6B:int
        var_3_1CE = newarray:byte[](byte.class, expr_6B:int)
        var_5_1CF = expr_6B:int
        Label_0465:
        
        while (cmpne:boolean(and:int(var_0_223:int, ldc:int(1024)), ldc:int(0))) {
            var_0_223 = and:int(var_0_223:int, ldc:int(1856990718))
            var_5_1CF = add:int(var_5_1CF:int, ldc:int(-1))
            storeelement:byte(var_3_1CE:byte[], var_5_1CF:int, xor:byte(loadelement:byte(stack_1E7_0:byte[], var_5_1CF:int), ldc:byte(109)))
            
            if (cmpne:boolean(var_5_1CF:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C7_0 = stack_C9_0 = stack_F4_0 = stack_F6_0 = stack_128_0 = stack_1E7_0 = stack_236_0 = stack_2B1_0 = stack_307_0 = var_3_1CE:byte[]
            goto(Label_0112)
        }
        
        Label_0534:
        
        while (cmpne:boolean(and:int(var_0_223:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_250 = and:int(var_0_223:int, ldc:int(-1966228239))
            var_5_1CF = add:int(var_5_1CF:int, ldc:int(-1))
            expr_236 = stack_27F_2 = loadelement(stack_236_0, var_5_1CF)
            
            if (cmplt:boolean(add:int(add:int(var_5_1CF:int, ldc:int(5)), neg:int(var_4_1C9:int)), ldc:int(0))) {
                stack_27F_2 = stack_253_0 = add:byte(expr_236:byte, loadelement:byte(var_3_1CE:byte[], add:int(var_5_1CF:int, ldc:int(5))))
                goto(Label_0611)
            }
            
            Label_0579:
            
            if (cmpne:boolean(and:int(var_0_250:int, ldc:int(128)), ldc:int(0))) {
                var_0_250 = and:int(var_0_250:int, ldc:int(-1410997006))
                stack_27F_2 = stack_253_0 = add:byte(expr_236:byte, ldc:byte(5))
            }
            
            Label_0611:
            
            if (cmpeq:boolean(and:int(var_0_250:int, ldc:int(33554432)), ldc:int(0))) {
                var_0_250 = and:int(var_0_250:int, ldc:int(222432960))
                goto(Label_0579)
            }
            
            var_0_223 = and:int(var_0_250:int, ldc:int(529509875))
            storeelement:byte(var_3_1CE:byte[], var_5_1CF:int, stack_27F_2:byte)
            
            if (cmpne:boolean(var_5_1CF:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C7_0 = stack_C9_0 = stack_F4_0 = stack_F6_0 = stack_128_0 = stack_1E7_0 = stack_236_0 = stack_2B1_0 = stack_307_0 = var_3_1CE:byte[]
            goto(Label_0163)
        }
        
        var_0_223 = and:int(var_0_223:int, ldc:int(1612434956))
        goto(Label_0465)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_223:int, ldc:int(1024)), ldc:int(0))) {
            var_0_223 = and:int(var_0_223:int, ldc:int(-24140271))
            goto(Label_0251)
        }
        
        if (cmpne:boolean(and:int(var_0_223:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_223 = and:int(var_0_223:int, ldc:int(857478374))
            goto(Label_0208)
        }
        
        if (cmpne:boolean(and:int(var_0_223:int, ldc:int(262144)), ldc:int(0))) {
            var_0_223 = and:int(var_0_223:int, ldc:int(598554352))
            expr_9E = arraylength:int(stack_9E_0:byte[])
            
            if (cmpne:boolean(expr_9E:int, ldc:int(0))) {
                var_4_1C9 = expr_9E:int
                var_3_1CE = newarray:byte[](byte.class, expr_9E:int)
                var_5_1CF = expr_9E:int
                goto(Label_0534)
            }
        }
        
        Label_0163:
        
        if (cmpne:boolean(and:int(var_0_223:int, ldc:int(1073741824)), ldc:int(0))) {
            goto(Label_0251)
        }
        
        if (cmpne:boolean(and:int(var_0_223:int, ldc:int(16)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_223:int, ldc:int(8388608)), ldc:int(0))) {
                var_0_223 = and:int(var_0_223:int, ldc:int(95908950))
                goto(Label_0112)
            }
            
            var_0_223 = and:int(var_0_223:int, ldc:int(649948407))
            var_2_C7 = stack_C7_0:byte[]
            expr_CB = add:int(arraylength:int(stack_C9_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_CB:int, ldc:int(0))) {
                var_3_29F = newarray:byte[](byte.class, expr_CB:int)
                var_5_2A0 = expr_CB:int
                
                loop {
                    var_0_223 = and:int(var_0_223:int, ldc:int(-1966213132))
                    var_5_2A0 = add:int(var_5_2A0:int, ldc:int(-1))
                    storeelement:byte(var_3_29F:byte[], var_5_2A0:int, add:int(shl:int(loadelement:byte(stack_2B1_0:byte[], var_5_2A0:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_C7:byte[], add:int(var_5_2A0:int, and:int(ldc:int(2337), ldc:int(17999)))), ldc:int(6)), and:int(ldc:int(2443), ldc:int(12323)))))
                    
                    if (cmpne:boolean(var_5_2A0:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_C7_0 = stack_C9_0 = stack_F4_0 = stack_F6_0 = stack_128_0 = stack_1E7_0 = stack_236_0 = stack_2B1_0 = stack_307_0 = var_3_29F:byte[]
            }
        }
        
        Label_0208:
        
        if (cmpne:boolean(and:int(var_0_223:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_223:int, ldc:int(32)), ldc:int(0))) {
                var_0_223 = and:int(var_0_223:int, ldc:int(1126325646))
                goto(Label_0163)
            }
            
            if (cmpeq:boolean(and:int(var_0_223:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_223 = and:int(var_0_223:int, ldc:int(1660764150))
            expr_F6 = arraylength:int(stack_F6_0:byte[])
            
            if (cmpne:boolean(expr_F6:int, ldc:int(0))) {
                var_3_2F5 = newarray:byte[](byte.class, expr_F6:int)
                var_5_2F6 = expr_F6:int
                
                loop {
                    var_0_223 = and:int(var_0_223:int, ldc:int(-153616907))
                    var_5_2F6 = add:int(var_5_2F6:int, ldc:int(-1))
                    expr_30A = add:byte(loadelement:byte(stack_307_0:byte[], var_5_2F6:int), ldc:byte(41))
                    storeelement:byte(var_3_2F5:byte[], var_5_2F6:int, or:int(and:int(shl:int(expr_30A:byte, and:int(ldc:int(5284), ldc:int(21))), ldc:int(-16)), and:int(shr:int(expr_30A:byte[expected:int], and:int(ldc:int(10964), ldc:int(17669))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_2F6:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_C7_0 = stack_C9_0 = stack_F4_0 = stack_F6_0 = stack_128_0 = stack_1E7_0 = stack_236_0 = stack_2B1_0 = stack_307_0 = var_3_2F5:byte[]
            }
        }
        
        Label_0251:
        
        if (cmpeq:boolean(and:int(var_0_223:int, ldc:int(1024)), ldc:int(0))) {
            goto(Label_0208)
        }
        
        if (cmpeq:boolean(and:int(var_0_223:int, ldc:int(262144)), ldc:int(0))) {
            var_0_223 = and:int(var_0_223:int, ldc:int(1543172243))
            goto(Label_0163)
        }
        
        if (cmpeq:boolean(and:int(var_0_223:int, ldc:int(262144)), ldc:int(0))) {
            var_0_223 = and:int(var_0_223:int, ldc:int(224084687))
            goto(Label_0112)
        }
        
        var_3_134 = initobject:String(String::<init>, stack_128_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_1B8_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(2575), ldc:int(2571)))
        expr_146 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(10496), ldc:int(10500)))
        storeelement:String(expr_146:String[], xor:int(ldc:int(8196), ldc:int(8198)), invokevirtual:String[expected:String](String::substring, var_3_134:String, and:int(ldc:int(-8074), ldc:int(8073)), and:int(ldc:int(-23714), ldc:int(7329))))
        storeelement:String(expr_146:String[], xor:int(ldc:int(16896), ldc:int(16897)), invokevirtual:String[expected:String](String::substring, var_3_134:String, and:int(ldc:int(17807), ldc:int(-17808)), and:int(ldc:int(129), ldc:int(8501))))
        storeelement:String(expr_146:String[], and:int(ldc:int(16387), ldc:int(6611)), invokevirtual:String[expected:String](String::substring, var_3_134:String, and:int(ldc:int(24641), ldc:int(773)), xor:int(ldc:int(5161), ldc:int(5165))))
        storeelement:String(expr_146:String[], and:int(ldc:int(-424), ldc:int(422)), invokevirtual:String[expected:String](String::substring, var_3_134:String, and:int(ldc:int(20614), ldc:int(1140)), and:int(ldc:int(10042), ldc:int(18475))))
        putstatic:String[](\u946b\ud217\u8bb0\u88c5\u647c\u4cd9::\u93a2\u965f\u6cfe\u59ec\u98a4\u718f, expr_146:String[])
        putstatic:Object(\u946b\ud217\u8bb0\u88c5\u647c\u4cd9::\u759a\u3776\u7006\u3d64\u97e6\u47c2, initobject:Object(Object::<init>))
    }
    
    public void \u7873\u6d69\ub6ab\u59ec\uae5d\u3d64(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_667 : int
        var_5_89 : int
        var_6_90 : int
        var_7_9F : double
        var_9_C7 : double
        var_3_D9 : int
        var_11_EA : int
        var_14_114 : double
        var_16_118 : int
        var_12_110 : double
        var_17_672 : int
        
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
        var_3_667 = and:int(ldc:int(-1949864331), ldc:int(-594749540))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u946b\ud217\u8bb0\u88c5\u647c\u4cd9[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0179)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(8388608)), ldc:int(0))) {
            var_3_667 = and:int(var_3_667:int, ldc:int(-1858658564))
        }
        else {
            var_3_667 = and:int(var_3_667:int, ldc:int(-923984097))
            var_5_89 = and:int(ldc:int(2949), ldc:int(-8070))
            var_6_90 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9F = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-14664), ldc:int(10563)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C7 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D9 = and:int(var_3_667:int, ldc:int(-910264323))
                    var_9_C7 = sub:double(var_7_9F:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EA = var_5_89:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EA:int, sub:int(var_6_90:int, and:int(ldc:int(27781), ldc:int(3)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EA:int, and:int(ldc:int(8805), ldc:int(5523)))), var_7_9F:double))) {
                        inc:int(var_11_EA, ldc:int(1))
                    }
                    
                    var_3_667 = and:int(var_3_D9:int, ldc:int(-860920259))
                    var_14_114 = var_7_9F:double
                    var_16_118 = var_11_EA:int
                }
                else {
                    var_11_EA = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_89:int), xor:int(ldc:int(23040), ldc:int(23041)))
                    var_12_110 = var_14_114 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89)
                    
                    if (cmplt:boolean(var_16_118 = var_11_EA:int, var_6_90:int)) {
                        var_9_C7 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EA:int)
                        var_16_118 = var_11_EA:int
                        var_14_114 = var_12_110:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1521)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1367)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(128)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(1618705878))
                        goto(Label_1224)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-1495649036))
                        goto(Label_1113)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(1743411026))
                        goto(Label_0952)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0815)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(1070438036))
                        goto(Label_0696)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(701497550))
                        goto(Label_0585)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-1180729601))
                        
                        if (cmplt:boolean(var_16_118:int, var_6_90:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0585)
                            }
                            
                            goto(Label_0815)
                        }
                    }
                    
                    Label_0416:
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(183130284))
                        goto(Label_1521)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-1186697042))
                        goto(Label_1367)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(631413579))
                        goto(Label_1224)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1113)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0952)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(2)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-1609967950))
                        goto(Label_0815)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(1855009411))
                        goto(Label_0696)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_667:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_667 = and:int(var_3_667:int, ldc:int(-1884434795))
                            var_11_EA = and:int(ldc:int(10402), ldc:int(-10403))
                            goto(Label_1510)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0585:
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1521)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(16)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(473434460))
                        goto(Label_1367)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1224)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(1392154905))
                        goto(Label_1113)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0952)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0815)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(16)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-98605860))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_667 = and:int(var_3_667:int, ldc:int(-369123594))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_114 = var_9_C7:double
                            goto(Label_0815)
                        }
                    }
                    
                    Label_0696:
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1521)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1367)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1224)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(2)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-268700339))
                        goto(Label_1113)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(512)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-7742890))
                        goto(Label_0952)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(4)), ldc:int(0))) {
                            var_3_667 = and:int(var_3_667:int, ldc:int(575636064))
                            goto(Label_0585)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_667 = and:int(var_3_667:int, ldc:int(-1663789219))
                        var_14_114 = mul:double(ldc:double(0.5), add:double(var_9_C7:double, var_14_114:double))
                    }
                    
                    Label_0815:
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1521)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(2)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(342038895))
                        goto(Label_1367)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-298014818))
                        goto(Label_1224)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1113)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(308862633))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_667:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_667 = and:int(var_3_667:int, ldc:int(833164828))
                            goto(Label_0696)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_667 = and:int(var_3_667:int, ldc:int(1181755913))
                            goto(Label_0585)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0416)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_667:int, ldc:int(128)), ldc:int(0))) {
                            var_3_667 = and:int(var_3_667:int, ldc:int(1056955190))
                            loopcontinue()
                        }
                        
                        var_3_667 = and:int(var_3_667:int, ldc:int(-872485225))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89:int), var_7_9F:double)) {
                                var_11_EA = and:int(ldc:int(26117), ldc:int(4193))
                                goto(Label_1113)
                            }
                        }
                    }
                    
                    Label_0952:
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-478467747))
                        goto(Label_1521)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1367)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(16)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-1058404682))
                        goto(Label_1224)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(1134641426))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_667 = and:int(var_3_667:int, ldc:int(-1256059510))
                            goto(Label_0815)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(512)), ldc:int(0))) {
                            var_3_667 = and:int(var_3_667:int, ldc:int(73133839))
                            goto(Label_0696)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0585)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_667:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_667 = and:int(var_3_667:int, ldc:int(-660691138))
                        var_11_EA = and:int(ldc:int(-27906), ldc:int(27905))
                    }
                    
                    Label_1113:
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1521)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-530266322))
                        goto(Label_1367)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0952)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_667:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0815)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_667:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0696)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(16)), ldc:int(0))) {
                            var_3_667 = and:int(var_3_667:int, ldc:int(-379094198))
                            goto(Label_0585)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_667:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_667 = and:int(var_3_667:int, ldc:int(116053536))
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_667 = and:int(var_3_667:int, ldc:int(-1381222540))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                                goto(Label_1367)
                            }
                        }
                    }
                    
                    Label_1224:
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(512)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-2101487020))
                        goto(Label_1521)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-659569357))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_667:int, ldc:int(128)), ldc:int(0))) {
                            var_3_667 = and:int(var_3_667:int, ldc:int(-10431334))
                            goto(Label_1113)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0952)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(4)), ldc:int(0))) {
                            var_3_667 = and:int(var_3_667:int, ldc:int(318695483))
                            goto(Label_0815)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0696)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_667 = and:int(var_3_667:int, ldc:int(-1609111980))
                            goto(Label_0585)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_667 = and:int(var_3_667:int, ldc:int(-858914826))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_114:double, var_5_89:int, var_16_118:int)
                            goto(Label_1510)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1367:
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1521)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(512)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(611621491))
                        goto(Label_1224)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-1319232922))
                        goto(Label_1113)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(2)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(592725012))
                        goto(Label_0952)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0815)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0696)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(2)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-583738616))
                        goto(Label_0585)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(128)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-1781818279))
                        loopcontinue()
                    }
                    
                    var_3_667 = and:int(var_3_667:int, ldc:int(-24842244))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_114:double, ldc:double(0.0))
                    Label_1510:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_672 = var_5_89:int
                        
                        if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1521:
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(128)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(1676750669))
                        goto(Label_1367)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(2)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-558324622))
                        goto(Label_1224)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1113)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0952)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0815)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(924074595))
                        goto(Label_0696)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(1483274038))
                        goto(Label_0585)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(2)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(690084915))
                        goto(Label_0416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-845207916))
                        var_17_672 = add:int(var_16_118:int, and:int(ldc:int(6861), ldc:int(8209)))
                        looporswitchbreak()
                    }
                }
                
                var_3_667 = and:int(var_3_667:int, ldc:int(-811839521))
                
                if (cmple:boolean(var_5_89 = var_17_672:int, sub:int(var_6_90:int, and:int(ldc:int(7813), ldc:int(257))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0179:
        
        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(268435456)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
