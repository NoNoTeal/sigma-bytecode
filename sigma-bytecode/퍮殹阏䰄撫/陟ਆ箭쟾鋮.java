public class \ud36e\u6bb9\u960f\u4c04\u64ab.\u965f\u0a06\u7bad\uc7fe\u92ee {
    public void \u965f\u0a06\u7bad\uc7fe\u92ee() {
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
            invokespecial:Object(Object::<init>, this:\u965f\u0a06\u7bad\uc7fe\u92ee)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc \u51b2\u3776\u67e9\u3bc9\u4f4a\ud4fe(java.io.File p0) {
        var_3_6D : FileInputStream
        var_4_6F : Throwable
        var_5_75 : \uc31c\uc87f\uc246\u3776\ub7dc
        var_6_A6 : Throwable
        var_8_C9 : Throwable
        
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
            var_3_6D = initobject:FileInputStream(FileInputStream::<init>, p0:File)
            var_4_6F = aconstnull:Throwable()
            
            try {
                var_5_75 = invokestatic:\uc31c\uc87f\uc246\u3776\ub7dc(\u965f\u0a06\u7bad\uc7fe\u92ee::\u4bc8\u156b\u4d85\u5f50\u51fa\u4bc8, var_3_6D:FileInputStream[expected:InputStream])
            }
            catch (java.lang.Throwable var_6_A6) {
                var_4_6F = var_6_A6:Throwable
                athrow(var_6_A6:Throwable)
            }
            finally {
                if (cmpne:boolean(var_3_6D:FileInputStream, aconstnull:FileInputStream())) {
                    if (cmpne:boolean(var_4_6F:Throwable, aconstnull:Throwable())) {
                        try {
                            invokevirtual:void(InputStream::close, var_3_6D:FileInputStream[expected:InputStream])
                        }
                        catch (java.lang.Throwable var_8_C9) {
                            invokevirtual:void(Throwable::addSuppressed, var_4_6F:Throwable, var_8_C9:Throwable)
                        }
                    }
                    else {
                        invokevirtual:void(InputStream::close, var_3_6D:FileInputStream[expected:InputStream])
                    }
                }
            }
            
            return:\uc31c\uc87f\uc246\u3776\ub7dc(var_5_75:\uc31c\uc87f\uc246\u3776\ub7dc)
        }
        
        goto(Label_0006)
    }
    
    public static \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc \u4bc8\u156b\u4d85\u5f50\u51fa\u4bc8(java.io.InputStream p0) {
        var_3_7B : DataInputStream
        var_4_7D : Throwable
        var_5_86 : \uc31c\uc87f\uc246\u3776\ub7dc
        var_6_B7 : Throwable
        var_8_DA : Throwable
        
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
            var_3_7B = initobject:DataInputStream(DataInputStream::<init>, initobject:BufferedInputStream[expected:InputStream](BufferedInputStream::<init>, initobject:GZIPInputStream[expected:InputStream](GZIPInputStream::<init>, p0:InputStream)))
            var_4_7D = aconstnull:Throwable()
            
            try {
                var_5_86 = invokestatic:\uc31c\uc87f\uc246\u3776\ub7dc(\u965f\u0a06\u7bad\uc7fe\u92ee::\ubff1\ua6bd\u4c04\u7049\ua3b4\u12cb, var_3_7B:DataInputStream[expected:DataInput], getstatic:\u8aa5\u0800\u5654\u3e75\ud51e(\u8aa5\u0800\u5654\u3e75\ud51e::\u0c95\uc2bd\uc87f\u946b\ub70c\u16f6))
            }
            catch (java.lang.Throwable var_6_B7) {
                var_4_7D = var_6_B7:Throwable
                athrow(var_6_B7:Throwable)
            }
            finally {
                if (cmpne:boolean(var_3_7B:DataInputStream, aconstnull:DataInputStream())) {
                    if (cmpne:boolean(var_4_7D:Throwable, aconstnull:Throwable())) {
                        try {
                            invokevirtual:void(FilterInputStream::close, var_3_7B:DataInputStream[expected:FilterInputStream])
                        }
                        catch (java.lang.Throwable var_8_DA) {
                            invokevirtual:void(Throwable::addSuppressed, var_4_7D:Throwable, var_8_DA:Throwable)
                        }
                    }
                    else {
                        invokevirtual:void(FilterInputStream::close, var_3_7B:DataInputStream[expected:FilterInputStream])
                    }
                }
            }
            
            return:\uc31c\uc87f\uc246\u3776\ub7dc(var_5_86:\uc31c\uc87f\uc246\u3776\ub7dc)
        }
        
        goto(Label_0006)
    }
    
    public static void \ub32d\u494c\ubff1\u36d3\uf995\u12b2(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p0, java.io.File p1) {
        var_4_6D : FileOutputStream
        var_5_70 : Throwable
        var_6_AA : Throwable
        var_8_CF : Throwable
        
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
            var_4_6D = initobject:FileOutputStream(FileOutputStream::<init>, p1:File)
            var_5_70 = aconstnull:Throwable()
            
            try {
                invokestatic:void(\u965f\u0a06\u7bad\uc7fe\u92ee::\u3d64\u1833\u416d\u5245\uc229\u93a2, p0:\uc31c\uc87f\uc246\u3776\ub7dc, var_4_6D:FileOutputStream[expected:OutputStream])
            }
            catch (java.lang.Throwable var_6_AA) {
                var_5_70 = var_6_AA:Throwable
                athrow(var_6_AA:Throwable)
            }
            finally {
                if (cmpne:boolean(var_4_6D:FileOutputStream, aconstnull:FileOutputStream())) {
                    if (cmpne:boolean(var_5_70:Throwable, aconstnull:Throwable())) {
                        try {
                            invokevirtual:void(OutputStream::close, var_4_6D:FileOutputStream[expected:OutputStream])
                        }
                        catch (java.lang.Throwable var_8_CF) {
                            invokevirtual:void(Throwable::addSuppressed, var_5_70:Throwable, var_8_CF:Throwable)
                        }
                    }
                    else {
                        invokevirtual:void(OutputStream::close, var_4_6D:FileOutputStream[expected:OutputStream])
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u3d64\u1833\u416d\u5245\uc229\u93a2(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p0, java.io.OutputStream p1) {
        var_4_7B : DataOutputStream
        var_5_7E : Throwable
        var_6_B8 : Throwable
        var_8_DD : Throwable
        
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
            var_4_7B = initobject:DataOutputStream(DataOutputStream::<init>, initobject:BufferedOutputStream[expected:OutputStream](BufferedOutputStream::<init>, initobject:GZIPOutputStream[expected:OutputStream](GZIPOutputStream::<init>, p1:OutputStream)))
            var_5_7E = aconstnull:Throwable()
            
            try {
                invokestatic:void(\u965f\u0a06\u7bad\uc7fe\u92ee::\u8753\ufcaf\u120d\u3c25\u4492\u64ab, p0:\uc31c\uc87f\uc246\u3776\ub7dc, var_4_7B:DataOutputStream[expected:DataOutput])
            }
            catch (java.lang.Throwable var_6_B8) {
                var_5_7E = var_6_B8:Throwable
                athrow(var_6_B8:Throwable)
            }
            finally {
                if (cmpne:boolean(var_4_7B:DataOutputStream, aconstnull:DataOutputStream())) {
                    if (cmpne:boolean(var_5_7E:Throwable, aconstnull:Throwable())) {
                        try {
                            invokevirtual:void(FilterOutputStream::close, var_4_7B:DataOutputStream[expected:FilterOutputStream])
                        }
                        catch (java.lang.Throwable var_8_DD) {
                            invokevirtual:void(Throwable::addSuppressed, var_5_7E:Throwable, var_8_DD:Throwable)
                        }
                    }
                    else {
                        invokevirtual:void(FilterOutputStream::close, var_4_7B:DataOutputStream[expected:FilterOutputStream])
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u8753\ufcaf\u120d\u3c25\u4492\u64ab(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p0, java.io.File p1) {
        var_4_6D : FileOutputStream
        var_5_75 : Throwable
        var_6_80 : DataOutputStream
        var_7_83 : Throwable
        var_8_BD : Throwable
        var_10_E2 : Throwable
        var_6_130 : Throwable
        var_12_155 : Throwable
        
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
            var_4_6D = initobject:FileOutputStream(FileOutputStream::<init>, p1:File)
            var_5_75 = aconstnull:Throwable()
            
            try {
                var_6_80 = initobject:DataOutputStream(DataOutputStream::<init>, var_4_6D:FileOutputStream[expected:OutputStream])
                var_7_83 = aconstnull:Throwable()
                
                try {
                    invokestatic:void(\u965f\u0a06\u7bad\uc7fe\u92ee::\u8753\ufcaf\u120d\u3c25\u4492\u64ab, p0:\uc31c\uc87f\uc246\u3776\ub7dc, var_6_80:DataOutputStream[expected:DataOutput])
                }
                catch (java.lang.Throwable var_8_BD) {
                    var_7_83 = var_8_BD:Throwable
                    athrow(var_8_BD:Throwable)
                }
                finally {
                    if (cmpne:boolean(var_6_80:DataOutputStream, aconstnull:DataOutputStream())) {
                        if (cmpne:boolean(var_7_83:Throwable, aconstnull:Throwable())) {
                            try {
                                invokevirtual:void(FilterOutputStream::close, var_6_80:DataOutputStream[expected:FilterOutputStream])
                            }
                            catch (java.lang.Throwable var_10_E2) {
                                invokevirtual:void(Throwable::addSuppressed, var_7_83:Throwable, var_10_E2:Throwable)
                            }
                        }
                        else {
                            invokevirtual:void(FilterOutputStream::close, var_6_80:DataOutputStream[expected:FilterOutputStream])
                        }
                    }
                }
            }
            catch (java.lang.Throwable var_6_130) {
                var_5_75 = var_6_130:Throwable
                athrow(var_6_130:Throwable)
            }
            finally {
                if (cmpne:boolean(var_4_6D:FileOutputStream, aconstnull:FileOutputStream())) {
                    if (cmpne:boolean(var_5_75:Throwable, aconstnull:Throwable())) {
                        try {
                            invokevirtual:void(FileOutputStream::close, var_4_6D:FileOutputStream)
                        }
                        catch (java.lang.Throwable var_12_155) {
                            invokevirtual:void(Throwable::addSuppressed, var_5_75:Throwable, var_12_155:Throwable)
                        }
                    }
                    else {
                        invokevirtual:void(FileOutputStream::close, var_4_6D:FileOutputStream)
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc \ubff1\ua6bd\u4c04\u7049\ua3b4\u12cb(java.io.File p0) {
        var_1_5F : int
        var_3_CE : FileInputStream
        var_4_D5 : Throwable
        var_5_DF : DataInputStream
        var_6_E2 : Throwable
        var_7_EC : \uc31c\uc87f\uc246\u3776\ub7dc
        var_8_120 : Throwable
        var_10_145 : Throwable
        var_5_190 : Throwable
        var_12_1B3 : Throwable
        
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
        var_1_5F = and:int(ldc:int(1467857162), ldc:int(-60181890))
        
        loop {
            if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(2147483647)), ldc:int(0))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(566636539))
                goto(Label_0165)
            }
            
            if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(64)), ldc:int(0))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(2114143082))
            }
            else {
                var_1_5F = and:int(var_1_5F:int, ldc:int(1731081556))
                
                if (invokevirtual:boolean(File::exists, p0:File)) {
                    var_3_CE = initobject:FileInputStream(FileInputStream::<init>, p0:File)
                    var_4_D5 = aconstnull:Throwable()
                    
                    try {
                        var_5_DF = initobject:DataInputStream(DataInputStream::<init>, var_3_CE:FileInputStream[expected:InputStream])
                        var_6_E2 = aconstnull:Throwable()
                        
                        try {
                            var_7_EC = invokestatic:\uc31c\uc87f\uc246\u3776\ub7dc(\u965f\u0a06\u7bad\uc7fe\u92ee::\ubff1\ua6bd\u4c04\u7049\ua3b4\u12cb, var_5_DF:DataInputStream[expected:DataInput], getstatic:\u8aa5\u0800\u5654\u3e75\ud51e(\u8aa5\u0800\u5654\u3e75\ud51e::\u0c95\uc2bd\uc87f\u946b\ub70c\u16f6))
                        }
                        catch (java.lang.Throwable var_8_120) {
                            var_6_E2 = var_8_120:Throwable
                            athrow(var_8_120:Throwable)
                        }
                        finally {
                            if (cmpne:boolean(var_5_DF:DataInputStream, aconstnull:DataInputStream())) {
                                if (cmpne:boolean(var_6_E2:Throwable, aconstnull:Throwable())) {
                                    try {
                                        invokevirtual:void(FilterInputStream::close, var_5_DF:DataInputStream[expected:FilterInputStream])
                                    }
                                    catch (java.lang.Throwable var_10_145) {
                                        invokevirtual:void(Throwable::addSuppressed, var_6_E2:Throwable, var_10_145:Throwable)
                                    }
                                }
                                else {
                                    invokevirtual:void(FilterInputStream::close, var_5_DF:DataInputStream[expected:FilterInputStream])
                                }
                            }
                        }
                    }
                    catch (java.lang.Throwable var_5_190) {
                        var_4_D5 = var_5_190:Throwable
                        athrow(var_5_190:Throwable)
                    }
                    finally {
                        if (cmpne:boolean(var_3_CE:FileInputStream, aconstnull:FileInputStream())) {
                            if (cmpne:boolean(var_4_D5:Throwable, aconstnull:Throwable())) {
                                try {
                                    invokevirtual:void(FileInputStream::close, var_3_CE:FileInputStream)
                                }
                                catch (java.lang.Throwable var_12_1B3) {
                                    invokevirtual:void(Throwable::addSuppressed, var_4_D5:Throwable, var_12_1B3:Throwable)
                                }
                            }
                            else {
                                invokevirtual:void(FileInputStream::close, var_3_CE:FileInputStream)
                            }
                        }
                    }
                    
                    return:\uc31c\uc87f\uc246\u3776\ub7dc(var_7_EC:\uc31c\uc87f\uc246\u3776\ub7dc)
                }
            }
            
            Label_0138:
            
            if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(1)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(67108864)), ldc:int(0))) {
                    var_1_5F = and:int(var_1_5F:int, ldc:int(-322068367))
                    loopcontinue()
                }
                
                var_1_5F = and:int(var_1_5F:int, ldc:int(1828354253))
            }
            
            Label_0165:
            
            if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(16384)), ldc:int(0))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(1690979778))
                goto(Label_0138)
            }
            
            if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(524288)), ldc:int(0))) {
                return:\uc31c\uc87f\uc246\u3776\ub7dc(aconstnull:\uc31c\uc87f\uc246\u3776\ub7dc())
            }
        }
    }
    
    public static \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc \ubff1\ua6bd\u4c04\u7049\ua3b4\u12cb(java.io.DataInput p0) {
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
            return:\uc31c\uc87f\uc246\u3776\ub7dc(invokestatic:\uc31c\uc87f\uc246\u3776\ub7dc(\u965f\u0a06\u7bad\uc7fe\u92ee::\ubff1\ua6bd\u4c04\u7049\ua3b4\u12cb, p0:DataInput, getstatic:\u8aa5\u0800\u5654\u3e75\ud51e(\u8aa5\u0800\u5654\u3e75\ud51e::\u0c95\uc2bd\uc87f\u946b\ub70c\u16f6)))
        }
        
        goto(Label_0006)
    }
    
    public static \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc \ubff1\ua6bd\u4c04\u7049\ua3b4\u12cb(java.io.DataInput p0, \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u8aa5\u0800\u5654\u3e75\ud51e p1) {
        var_4_6C : \u93a2\u97b7\u647c\ud36e\u64ab
        
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
        var_4_6C = invokestatic:\u93a2\u97b7\u647c\ud36e\u64ab(\u965f\u0a06\u7bad\uc7fe\u92ee::\ubff1\ua6bd\u4c04\u7049\ua3b4\u12cb, p0:DataInput, and:int(ldc:int(7179), ldc:int(-16144)), p1:\u8aa5\u0800\u5654\u3e75\ud51e)
        
        if (logicalnot:boolean(instanceof:boolean(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc.class, var_4_6C:\u93a2\u97b7\u647c\ud36e\u64ab))) {
            athrow(initobject:IOException(IOException::<init>, loadelement:String(getstatic:String[](\u965f\u0a06\u7bad\uc7fe\u92ee::\u8aa5\u600f\u446c\u7d52\u76bc\u4f52), and:int(ldc:int(17613), ldc:int(-17614)))))
        }
        
        return:\uc31c\uc87f\uc246\u3776\ub7dc(checkcast:\uc31c\uc87f\uc246\u3776\ub7dc(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc.class, var_4_6C:\uc31c\uc87f\uc246\u3776\ub7dc[expected:\u93a2\u97b7\u647c\ud36e\u64ab]))
    }
    
    public static void \u8753\ufcaf\u120d\u3c25\u4492\u64ab(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p0, java.io.DataOutput p1) {
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
            invokestatic:void(\u965f\u0a06\u7bad\uc7fe\u92ee::\u6ec6\u16f6\uc87f\ua562\u3a62\u16f6, p0:\uc31c\uc87f\uc246\u3776\ub7dc[expected:\u93a2\u97b7\u647c\ud36e\u64ab], p1:DataOutput)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void \u6ec6\u16f6\uc87f\ua562\u3a62\u16f6(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u93a2\u97b7\u647c\ud36e\u64ab p0, java.io.DataOutput p1) {
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
            invokeinterface:void(DataOutput::writeByte, p1:DataOutput, invokeinterface:byte[expected:int](\u93a2\u97b7\u647c\ud36e\u64ab::\u98a4\u72f1\u7006\u3bd6\u59ec\u7e3f, p0:\u93a2\u97b7\u647c\ud36e\u64ab))
            
            if (cmpne:boolean(invokeinterface:byte(\u93a2\u97b7\u647c\ud36e\u64ab::\u98a4\u72f1\u7006\u3bd6\u59ec\u7e3f, p0:\u93a2\u97b7\u647c\ud36e\u64ab), ldc:byte(0))) {
                invokeinterface:void(DataOutput::writeUTF, p1:DataOutput, loadelement:String(getstatic:String[](\u965f\u0a06\u7bad\uc7fe\u92ee::\u8aa5\u600f\u446c\u7d52\u76bc\u4f52), and:int(ldc:int(3073), ldc:int(4619))))
                invokeinterface:void(\u93a2\u97b7\u647c\ud36e\u64ab::\u8cae\u3711\u071d\u92ee\ub113\u3776, p0:\u93a2\u97b7\u647c\ud36e\u64ab, p1:DataOutput)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u93a2\u97b7\u647c\ud36e\u64ab \ubff1\ua6bd\u4c04\u7049\ua3b4\u12cb(java.io.DataInput p0, int p1, \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u8aa5\u0800\u5654\u3e75\ud51e p2) {
        var_3_130 : int
        var_5_6B : byte
        stack_143_0 : Object [generated]
        var_7_15F : \u1833\u88c5\u0b8e\uc9f6\u960f\u839e
        var_6_148 : IOException
        
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
            var_3_130 = and:int(and:int(ldc:int(456765213), ldc:int(533606311)), ldc:int(-15781923))
            var_5_6B = invokeinterface:byte(DataInput::readByte, p0:DataInput)
            
            loop {
                if (cmpne:boolean(and:int(var_3_130:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_3_130 = and:int(var_3_130:int, ldc:int(1731684729))
                    goto(Label_0263)
                }
                
                if (cmpeq:boolean(and:int(var_3_130:int, ldc:int(2048)), ldc:int(0))) {
                    var_3_130 = and:int(var_3_130:int, ldc:int(662607508))
                    goto(Label_0214)
                }
                
                if (cmpeq:boolean(and:int(var_3_130:int, ldc:int(1024)), ldc:int(0))) {
                    var_3_130 = and:int(var_3_130:int, ldc:int(-2032577299))
                }
                else {
                    var_3_130 = and:int(var_3_130:int, ldc:int(-71340257))
                    
                    if (cmpne:boolean(var_5_6B:byte, ldc:byte(0))) {
                        invokeinterface:String(DataInput::readUTF, p0:DataInput)
                        goto(Block_12)
                    }
                }
                
                Label_0164:
                
                if (cmpne:boolean(and:int(var_3_130:int, ldc:int(16384)), ldc:int(0))) {
                    var_3_130 = and:int(var_3_130:int, ldc:int(-1752699863))
                    goto(Label_0263)
                }
                
                if (cmpeq:boolean(and:int(var_3_130:int, ldc:int(256)), ldc:int(0))) {
                    var_3_130 = and:int(var_3_130:int, ldc:int(1804400542))
                }
                else {
                    if (cmpne:boolean(and:int(var_3_130:int, ldc:int(32)), ldc:int(0))) {
                        var_3_130 = and:int(var_3_130:int, ldc:int(-207585739))
                        loopcontinue()
                    }
                    
                    var_3_130 = and:int(var_3_130:int, ldc:int(-1957528187))
                }
                
                Label_0214:
                
                if (cmpeq:boolean(and:int(var_3_130:int, ldc:int(1)), ldc:int(0))) {
                    var_3_130 = and:int(var_3_130:int, ldc:int(-1155212992))
                }
                else {
                    if (cmpne:boolean(and:int(var_3_130:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_130:int, ldc:int(16384)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    loopcontinue()
                }
                
                Block_12:
                
                try {
                    Label_0263:
                    
                    if (cmpne:boolean(and:int(var_3_130:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_130 = and:int(var_3_130:int, ldc:int(1646923649))
                        goto(Label_0214)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_130:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_130:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_130 = and:int(var_3_130:int, ldc:int(-1087509145))
                        stack_143_0 = invokeinterface:?[expected:Object](\u7bad\uc238\u3a62\ua562\u7af6<?>::\uc2e8\uc31c\u74b1\u0c95\u839e\u3c25, invokestatic:\u7bad\uc238\u3a62\ua562\u7af6<?>(\u6198\u98a4\u61a4\u7ce1\u4ab3::\ub7dc\u7330\u5fe1\u6d69\u8d98\u416d, var_5_6B:byte[expected:int]), p0:DataInput, p1:int, p2:\u8aa5\u0800\u5654\u3e75\ud51e)
                        var_3_130 = and:int(var_3_130:int, ldc:int(-1624068337))
                        return:\u93a2\u97b7\u647c\ud36e\u64ab(stack_143_0:Object[expected:?])
                    }
                    
                    var_3_130 = and:int(var_3_130:int, ldc:int(-1594769210))
                }
                catch (java.io.IOException var_6_148) {
                    var_7_15F = invokestatic:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e(\u1833\u88c5\u0b8e\uc9f6\u960f\u839e::\ubcb0\u59ec\u6d99\u156b\u0800\u946b, var_6_148:IOException[expected:Throwable], loadelement:String(getstatic:String[](\u965f\u0a06\u7bad\uc7fe\u92ee::\u8aa5\u600f\u446c\u7d52\u76bc\u4f52), and:int(ldc:int(1026), ldc:int(8562))))
                    invokevirtual:\u446c\u67d0\ua562\u97b7\u6c56\u59ec(\u446c\u67d0\ua562\u97b7\u6c56\u59ec::\u7af6\u67d0\ub113\u4daf\u12b2\ufcaf, invokevirtual:\u446c\u67d0\ua562\u97b7\u6c56\u59ec(\u1833\u88c5\u0b8e\uc9f6\u960f\u839e::\u8c8a\u6b0d\uae87\u7330\u446c\uc9f6, var_7_15F:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e, loadelement:String(getstatic:String[](\u965f\u0a06\u7bad\uc7fe\u92ee::\u8aa5\u600f\u446c\u7d52\u76bc\u4f52), xor:int(ldc:int(2705), ldc:int(2706)))), loadelement:String(getstatic:String[](\u965f\u0a06\u7bad\uc7fe\u92ee::\u8aa5\u600f\u446c\u7d52\u76bc\u4f52), xor:int(ldc:int(8899), ldc:int(8903))), invokestatic:Byte[expected:Object](Byte::valueOf, var_5_6B:byte))
                    athrow(initobject:\uceb8\u8258\uf9c5\uc229\u7330\ucfaf(\uceb8\u8258\uf9c5\uc229\u7330\ucfaf::<init>, var_7_15F:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e))
                }
            }
            
            return:\u93a2\u97b7\u647c\ud36e\u64ab(getstatic:\ubded\uc9f6\u071d\u8258\u0c95[expected:\u93a2\u97b7\u647c\ud36e\u64ab](\ubded\uc9f6\u071d\u8258\u0c95::\ubb2b\u9033\u3c25\u927d\u62da\u5140))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_2AB : int
        expr_6E : int [generated]
        stack_91_0 : byte[] [generated]
        stack_93_0 : byte[] [generated]
        stack_C3_0 : byte[] [generated]
        stack_C5_0 : byte[] [generated]
        stack_FC_0 : byte[] [generated]
        stack_FE_0 : byte[] [generated]
        stack_133_0 : byte[] [generated]
        stack_204_0 : byte[] [generated]
        stack_258_0 : byte[] [generated]
        stack_2BE_0 : byte[] [generated]
        stack_33A_0 : byte[] [generated]
        var_4_1E5 : int
        var_3_1EA : byte[]
        var_5_1EB : int
        expr_204 : byte [generated]
        var_0_2D7 : int
        expr_2BE : byte [generated]
        stack_305_2 : byte [generated]
        stack_2DA_0 : byte [generated]
        var_2_91 : byte[]
        expr_95 : int [generated]
        var_3_246 : byte[]
        var_5_247 : int
        expr_C5 : int [generated]
        expr_FE : int [generated]
        var_3_328 : byte[]
        var_5_329 : int
        var_3_13F : String
        stack_1DE_0 : String[] [generated]
        expr_151 : String[] [generated]
        
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
        var_0_2AB = and:int(ldc:int(189365588), ldc:int(-2130145))
        expr_6E = arraylength:int(stack_91_0 = stack_93_0 = stack_C3_0 = stack_C5_0 = stack_FC_0 = stack_FE_0 = stack_133_0 = stack_204_0 = stack_258_0 = stack_2BE_0 = stack_33A_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("VA+707EPmeIqUJcouRXXlVR6VP5WFXZyhwWbypNGH+qJNb8x/JFm5GKfhXKRdH7Oco8Dbo2JqZHiN0xOWGyNHK+nuY+R")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_1E5 = expr_6E:int
        var_3_1EA = newarray:byte[](byte.class, expr_6E:int)
        var_5_1EB = expr_6E:int
        Label_0493:
        
        while (cmpeq:boolean(and:int(var_0_2AB:int, ldc:int(32768)), ldc:int(0))) {
            var_0_2AB = and:int(var_0_2AB:int, ldc:int(-1677721826))
            var_5_1EB = add:int(var_5_1EB:int, ldc:int(-1))
            expr_204 = loadelement:byte(stack_204_0:byte[], var_5_1EB:int)
            storeelement:byte(var_3_1EA:byte[], var_5_1EB:int, xor:int(or:int(and:int(shl:int(expr_204:byte, and:int(ldc:int(12302), ldc:int(18372))), ldc:int(-16)), and:int(shr:int(expr_204:byte[expected:int], xor:int(ldc:int(6161), ldc:int(6165))), ldc:int(15))), ldc:int(89)))
            
            if (cmpne:boolean(var_5_1EB:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_93_0 = stack_91_0 = stack_C3_0 = stack_C5_0 = stack_FC_0 = stack_FE_0 = stack_133_0 = stack_204_0 = stack_258_0 = stack_2BE_0 = stack_33A_0 = var_3_1EA:byte[]
            goto(Label_0115)
        }
        
        Label_0671:
        
        while (cmpne:boolean(and:int(var_0_2AB:int, ldc:int(8192)), ldc:int(0))) {
            var_0_2D7 = and:int(var_0_2AB:int, ldc:int(-77628585))
            var_5_1EB = add:int(var_5_1EB:int, ldc:int(-1))
            expr_2BE = stack_305_2 = loadelement(stack_2BE_0, var_5_1EB)
            
            if (cmplt:boolean(add:int(add:int(var_5_1EB:int, ldc:int(6)), neg:int(var_4_1E5:int)), ldc:int(0))) {
                stack_305_2 = stack_2DA_0 = add:byte(expr_2BE:byte, loadelement:byte(var_3_1EA:byte[], add:int(var_5_1EB:int, ldc:int(6))))
                goto(Label_0746)
            }
            
            Label_0715:
            
            if (cmpne:boolean(and:int(var_0_2D7:int, ldc:int(524288)), ldc:int(0))) {
                var_0_2D7 = and:int(var_0_2D7:int, ldc:int(-1409549377))
                stack_305_2 = stack_2DA_0 = add:byte(expr_2BE:byte, ldc:byte(6))
            }
            
            Label_0746:
            
            if (cmpne:boolean(and:int(var_0_2D7:int, ldc:int(1)), ldc:int(0))) {
                var_0_2D7 = and:int(var_0_2D7:int, ldc:int(-1838276379))
                goto(Label_0715)
            }
            
            var_0_2AB = and:int(var_0_2D7:int, ldc:int(1263270740))
            storeelement:byte(var_3_1EA:byte[], var_5_1EB:int, stack_305_2:byte)
            
            if (cmpne:boolean(var_5_1EB:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_93_0 = stack_91_0 = stack_C3_0 = stack_C5_0 = stack_FC_0 = stack_FE_0 = stack_133_0 = stack_204_0 = stack_258_0 = stack_2BE_0 = stack_33A_0 = var_3_1EA:byte[]
            goto(Label_0202)
        }
        
        var_0_2AB = and:int(var_0_2AB:int, ldc:int(1262647534))
        goto(Label_0493)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_2AB:int, ldc:int(32768)), ldc:int(0))) {
            goto(Label_0259)
        }
        
        if (cmpeq:boolean(and:int(var_0_2AB:int, ldc:int(2048)), ldc:int(0))) {
            goto(Label_0202)
        }
        
        if (cmpne:boolean(and:int(var_0_2AB:int, ldc:int(2048)), ldc:int(0))) {
            var_0_2AB = and:int(var_0_2AB:int, ldc:int(1272969814))
            var_2_91 = stack_91_0:byte[]
            expr_95 = add:int(arraylength:int(stack_93_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_95:int, ldc:int(0))) {
                var_3_246 = newarray:byte[](byte.class, expr_95:int)
                var_5_247 = expr_95:int
                
                loop {
                    var_0_2AB = and:int(var_0_2AB:int, ldc:int(1072299893))
                    var_5_247 = add:int(var_5_247:int, ldc:int(-1))
                    storeelement:byte(var_3_246:byte[], var_5_247:int, add:int(shl:int(loadelement:byte(stack_258_0:byte[], var_5_247:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_91:byte[], add:int(var_5_247:int, and:int(ldc:int(13571), ldc:int(16421)))), ldc:int(5)), and:int(ldc:int(551), ldc:int(8327)))))
                    
                    if (cmpne:boolean(var_5_247:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_93_0 = stack_91_0 = stack_C3_0 = stack_C5_0 = stack_FC_0 = stack_FE_0 = stack_133_0 = stack_204_0 = stack_258_0 = stack_2BE_0 = stack_33A_0 = var_3_246:byte[]
            }
        }
        
        Label_0154:
        
        if (cmpeq:boolean(and:int(var_0_2AB:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_2AB = and:int(var_0_2AB:int, ldc:int(-1076863620))
            goto(Label_0259)
        }
        
        if (cmpne:boolean(and:int(var_0_2AB:int, ldc:int(134217728)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_2AB:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_2AB = and:int(var_0_2AB:int, ldc:int(-874546604))
            expr_C5 = arraylength:int(stack_C5_0:byte[])
            
            if (cmpne:boolean(expr_C5:int, ldc:int(0))) {
                var_4_1E5 = expr_C5:int
                var_3_1EA = newarray:byte[](byte.class, expr_C5:int)
                var_5_1EB = expr_C5:int
                goto(Label_0671)
            }
        }
        
        Label_0202:
        
        if (cmpne:boolean(and:int(var_0_2AB:int, ldc:int(16777216)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_2AB:int, ldc:int(33554432)), ldc:int(0))) {
                var_0_2AB = and:int(var_0_2AB:int, ldc:int(-1918003132))
                goto(Label_0154)
            }
            
            if (cmpeq:boolean(and:int(var_0_2AB:int, ldc:int(65536)), ldc:int(0))) {
                var_0_2AB = and:int(var_0_2AB:int, ldc:int(-116686802))
                goto(Label_0115)
            }
            
            var_0_2AB = and:int(var_0_2AB:int, ldc:int(1274673622))
            expr_FE = arraylength:int(stack_FE_0:byte[])
            
            if (cmpne:boolean(expr_FE:int, ldc:int(0))) {
                var_3_328 = newarray:byte[](byte.class, expr_FE:int)
                var_5_329 = expr_FE:int
                
                loop {
                    var_0_2AB = and:int(var_0_2AB:int, ldc:int(1869348349))
                    var_5_329 = add:int(var_5_329:int, ldc:int(-1))
                    storeelement:byte(var_3_328:byte[], var_5_329:int, add:byte(loadelement:byte(stack_33A_0:byte[], var_5_329:int), ldc:byte(85)))
                    
                    if (cmpne:boolean(var_5_329:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_93_0 = stack_91_0 = stack_C3_0 = stack_C5_0 = stack_FC_0 = stack_FE_0 = stack_133_0 = stack_204_0 = stack_258_0 = stack_2BE_0 = stack_33A_0 = var_3_328:byte[]
            }
        }
        
        Label_0259:
        
        if (cmpeq:boolean(and:int(var_0_2AB:int, ldc:int(65536)), ldc:int(0))) {
            var_0_2AB = and:int(var_0_2AB:int, ldc:int(-1690128735))
            goto(Label_0202)
        }
        
        if (cmpne:boolean(and:int(var_0_2AB:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_2AB = and:int(var_0_2AB:int, ldc:int(1401826727))
            goto(Label_0154)
        }
        
        if (cmpeq:boolean(and:int(var_0_2AB:int, ldc:int(536870912)), ldc:int(0))) {
            var_3_13F = initobject:String(String::<init>, stack_133_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1DE_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(18450), ldc:int(18455)))
            expr_151 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(2837), ldc:int(101)))
            storeelement:String(expr_151:String[], xor:int(ldc:int(36), ldc:int(37)), invokevirtual:String[expected:String](String::substring, var_3_13F:String, and:int(ldc:int(-16177), ldc:int(15904)), and:int(ldc:int(22108), ldc:int(-22111))))
            storeelement:String(expr_151:String[], xor:int(ldc:int(-15343), ldc:int(-15341)), invokevirtual:String[expected:String](String::substring, var_3_13F:String, and:int(ldc:int(6496), ldc:int(-14689)), and:int(ldc:int(84), ldc:int(10680))))
            storeelement:String(expr_151:String[], and:int(ldc:int(6855), ldc:int(24587)), invokevirtual:String[expected:String](String::substring, var_3_13F:String, xor:int(ldc:int(8192), ldc:int(8208)), and:int(ldc:int(23), ldc:int(11807))))
            storeelement:String(expr_151:String[], and:int(ldc:int(-30596), ldc:int(6019)), invokevirtual:String[expected:String](String::substring, var_3_13F:String, and:int(ldc:int(17751), ldc:int(12439)), xor:int(ldc:int(8719), ldc:int(8755))))
            storeelement:String(expr_151:String[], and:int(ldc:int(4), ldc:int(18573)), invokevirtual:String[expected:String](String::substring, var_3_13F:String, xor:int(ldc:int(4), ldc:int(56)), and:int(ldc:int(25678), ldc:int(6228))))
            putstatic:String[](\u965f\u0a06\u7bad\uc7fe\u92ee::\u8aa5\u600f\u446c\u7d52\u76bc\u4f52, expr_151:String[])
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \uc246\u392e\u9937\u4d85\u64ab\u647c(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_61C : int
        var_5_89 : int
        var_6_90 : int
        var_7_9F : double
        var_9_C6 : double
        var_3_D8 : int
        var_11_E9 : int
        var_14_113 : double
        var_16_117 : int
        var_12_10F : double
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
        var_3_61C = and:int(ldc:int(234718423), ldc:int(354274769))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u965f\u0a06\u7bad\uc7fe\u92ee[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0179)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(4096)), ldc:int(0))) {
            var_3_61C = and:int(var_3_61C:int, ldc:int(-919032892))
        }
        else {
            var_3_61C = and:int(var_3_61C:int, ldc:int(400420429))
            var_5_89 = and:int(ldc:int(14508), ldc:int(-14767))
            var_6_90 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9F = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(5609), ldc:int(-30208)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C6 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D8 = and:int(var_3_61C:int, ldc:int(-983586869))
                    var_9_C6 = sub:double(var_7_9F:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E9 = var_5_89:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E9:int, sub:int(var_6_90:int, xor:int(ldc:int(4241), ldc:int(4240)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E9:int, xor:int(ldc:int(-29632), ldc:int(-29631)))), var_7_9F:double))) {
                        inc:int(var_11_E9, ldc:int(1))
                    }
                    
                    var_3_61C = and:int(var_3_D8:int, ldc:int(-1518362765))
                    var_14_113 = var_7_9F:double
                    var_16_117 = var_11_E9:int
                }
                else {
                    var_11_E9 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_89:int), xor:int(ldc:int(9216), ldc:int(9217)))
                    var_12_10F = var_14_113 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89)
                    
                    if (cmplt:boolean(var_16_117 = var_11_E9:int, var_6_90:int)) {
                        var_9_C6 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E9:int)
                        var_16_117 = var_11_E9:int
                        var_14_113 = var_12_10F:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1448)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-2003062693))
                        goto(Label_1305)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1201)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-714124371))
                        goto(Label_1074)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(100884880))
                        goto(Label_0939)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0812)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0683)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-573136207))
                        goto(Label_0554)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-839008809))
                        
                        if (cmplt:boolean(var_16_117:int, var_6_90:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0554)
                            }
                            
                            goto(Label_0812)
                        }
                    }
                    
                    Label_0403:
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1448)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1305)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(695723275))
                        goto(Label_1201)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1074)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(1397855698))
                        goto(Label_0939)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0812)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0683)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(2095307910))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(512)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(-2046837555))
                            var_11_E9 = and:int(ldc:int(-7042), ldc:int(7041))
                            goto(Label_1437)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0554:
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1448)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-469720927))
                        goto(Label_1305)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1201)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1074)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(1)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(942547245))
                        goto(Label_0939)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1727485462))
                        goto(Label_0812)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1452000890))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(-778835282))
                            goto(Label_0403)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61C = and:int(var_3_61C:int, ldc:int(1193274853))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_113 = var_9_C6:double
                            goto(Label_0812)
                        }
                    }
                    
                    Label_0683:
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(1214925940))
                        goto(Label_1448)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1305)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1201)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1074)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0939)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(998871989))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(1660564314))
                            goto(Label_0554)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(1764074724))
                            goto(Label_0403)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61C = and:int(var_3_61C:int, ldc:int(1572857333))
                        var_14_113 = mul:double(ldc:double(0.5), add:double(var_9_C6:double, var_14_113:double))
                    }
                    
                    Label_0812:
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(64)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-9812664))
                        goto(Label_1448)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1926200790))
                        goto(Label_1305)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1201)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1074)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(1642023645))
                            goto(Label_0683)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(1591653787))
                            goto(Label_0554)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0403)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(64)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(2089453439))
                            loopcontinue()
                        }
                        
                        var_3_61C = and:int(var_3_61C:int, ldc:int(1876922181))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89:int), var_7_9F:double)) {
                                var_11_E9 = and:int(ldc:int(16533), ldc:int(3075))
                                goto(Label_1074)
                            }
                        }
                    }
                    
                    Label_0939:
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1448)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1305)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1201)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0812)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0683)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(1522097060))
                            goto(Label_0554)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(583278706))
                            goto(Label_0403)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61C = and:int(var_3_61C:int, ldc:int(262002401))
                        var_11_E9 = and:int(ldc:int(8873), ldc:int(-8874))
                    }
                    
                    Label_1074:
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1342546168))
                        goto(Label_1448)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-2142248966))
                        goto(Label_1305)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(1276162939))
                            goto(Label_0939)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(-1115548423))
                            goto(Label_0812)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0683)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(1)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(1676957393))
                            goto(Label_0554)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0403)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61C = and:int(var_3_61C:int, ldc:int(1461581279))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                                goto(Label_1305)
                            }
                        }
                    }
                    
                    Label_1201:
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1448)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_1074)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0939)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0812)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0683)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0554)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0403)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(-32843805))
                            loopcontinue()
                        }
                        
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-979511831))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_113:double, var_5_89:int, var_16_117:int)
                        goto(Label_1437)
                    }
                    
                    Label_1305:
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1448)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1201)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1074)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(353090886))
                        goto(Label_0939)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(1683112117))
                        goto(Label_0812)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0683)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0554)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1817167135))
                        goto(Label_0403)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(1164070620))
                        loopcontinue()
                    }
                    
                    var_3_61C = and:int(var_3_61C:int, ldc:int(-1780627641))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_113:double, ldc:double(0.0))
                    Label_1437:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_627 = var_5_89:int
                        
                        if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1448:
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(673953558))
                        goto(Label_1305)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-290618685))
                        goto(Label_1201)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(1176262004))
                        goto(Label_1074)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0939)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-706708685))
                        goto(Label_0812)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0683)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0554)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-165471168))
                        goto(Label_0403)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(1065335887))
                        var_17_627 = add:int(var_16_117:int, and:int(ldc:int(25859), ldc:int(1)))
                        looporswitchbreak()
                    }
                }
                
                var_3_61C = and:int(var_3_61C:int, ldc:int(-1920991527))
                
                if (cmple:boolean(var_5_89 = var_17_627:int, sub:int(var_6_90:int, and:int(ldc:int(25091), ldc:int(7449))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0179:
        
        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(524288)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
