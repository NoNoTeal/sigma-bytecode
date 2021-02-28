public class \u5245\u8aa5\u61a4\u7049\u4cd9.\u600f\u7006\u6435\ud217\uc9f6\u6c52 {
    public void \u600f\u7006\u6435\ud217\uc9f6\u6c52(java.io.File p0) {
        var_4_9E : DirectoryStream<Path>
        var_5_A1 : Throwable
        var_6_AE : Iterator<Path>
        var_7_CC : Path
        expr_DB : LinkOption[] [generated]
        var_6_131 : Throwable
        var_6_14F : Throwable
        var_9_18A : Throwable
        var_4_1B3 : Exception
        
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
            invokespecial:Object(Object::<init>, this:\u600f\u7006\u6435\ud217\uc9f6\u6c52)
            putfield:Path(\u600f\u7006\u6435\ud217\uc9f6\u6c52::\u92ff\uc2e8\u64ab\u99f7\u5d20\u3d64, this:\u600f\u7006\u6435\ud217\uc9f6\u6c52, invokevirtual:Path(File::toPath, p0:File))
            putfield:WatchService(\u600f\u7006\u6435\ud217\uc9f6\u6c52::\u71ae\u960f\u7873\u416d\u7bad\u416d, this:\u600f\u7006\u6435\ud217\uc9f6\u6c52, invokevirtual:WatchService(FileSystem::newWatchService, invokeinterface:FileSystem(Path::getFileSystem, getfield:Path(\u600f\u7006\u6435\ud217\uc9f6\u6c52::\u92ff\uc2e8\u64ab\u99f7\u5d20\u3d64, this:\u600f\u7006\u6435\ud217\uc9f6\u6c52))))
            
            try {
                invokespecial:void(\u600f\u7006\u6435\ud217\uc9f6\u6c52::\u8350\ub8be\u600f\u0b8e\u4f4a\u52d3, this:\u600f\u7006\u6435\ud217\uc9f6\u6c52, getfield:Path(\u600f\u7006\u6435\ud217\uc9f6\u6c52::\u92ff\uc2e8\u64ab\u99f7\u5d20\u3d64, this:\u600f\u7006\u6435\ud217\uc9f6\u6c52))
                var_4_9E = invokestatic:DirectoryStream<Path>(Files::newDirectoryStream, getfield:Path(\u600f\u7006\u6435\ud217\uc9f6\u6c52::\u92ff\uc2e8\u64ab\u99f7\u5d20\u3d64, this:\u600f\u7006\u6435\ud217\uc9f6\u6c52))
                var_5_A1 = aconstnull:Throwable()
                
                try {
                    var_6_AE = invokeinterface:Iterator<Path>(DirectoryStream<Path>::iterator, var_4_9E:DirectoryStream<Path>)
                    
                    while (invokeinterface:boolean(Iterator::hasNext, var_6_AE:Iterator)) {
                        var_7_CC = checkcast:Path(java.nio.file.Path.class, invokeinterface:Path(Iterator<Path>::next, var_6_AE:Iterator<Path>))
                        expr_DB = newarray:LinkOption[](java.nio.file.LinkOption.class, xor:int(ldc:int(12336), ldc:int(12337)))
                        storeelement:LinkOption(expr_DB:LinkOption[], and:int(ldc:int(11096), ldc:int(-11101)), getstatic:LinkOption(LinkOption::NOFOLLOW_LINKS))
                        
                        if (invokestatic:boolean(Files::isDirectory, var_7_CC:Path, expr_DB:LinkOption[])) {
                            invokespecial:void(\u600f\u7006\u6435\ud217\uc9f6\u6c52::\u8350\ub8be\u600f\u0b8e\u4f4a\u52d3, this:\u600f\u7006\u6435\ud217\uc9f6\u6c52, var_7_CC:Path)
                        }
                    }
                    
                    if (cmpeq:boolean(var_4_9E:DirectoryStream<Path>, aconstnull:DirectoryStream<Path>())) {
                        return:void()
                    }
                    
                    if (cmpne:boolean(var_5_A1:Throwable, aconstnull:Throwable())) {
                        try {
                            invokeinterface:void(Closeable::close, var_4_9E:DirectoryStream<Path>[expected:Closeable])
                        }
                        catch (java.lang.Throwable var_6_131) {
                            invokevirtual:void(Throwable::addSuppressed, var_5_A1:Throwable, var_6_131:Throwable)
                        }
                        
                        return:void()
                    }
                    
                    invokeinterface:void(Closeable::close, var_4_9E:DirectoryStream<Path>[expected:Closeable])
                }
                catch (java.lang.Throwable var_6_14F) {
                    var_5_A1 = var_6_14F:Throwable
                    athrow(var_6_14F:Throwable)
                }
                finally {
                    if (cmpne:boolean(var_4_9E:DirectoryStream<Path>, aconstnull:DirectoryStream<Path>())) {
                        if (cmpne:boolean(var_5_A1:Throwable, aconstnull:Throwable())) {
                            try {
                                invokeinterface:void(Closeable::close, var_4_9E:DirectoryStream<Path>[expected:Closeable])
                            }
                            catch (java.lang.Throwable var_9_18A) {
                                invokevirtual:void(Throwable::addSuppressed, var_5_A1:Throwable, var_9_18A:Throwable)
                            }
                        }
                        else {
                            invokeinterface:void(Closeable::close, var_4_9E:DirectoryStream<Path>[expected:Closeable])
                        }
                    }
                }
            }
            catch (java.lang.Exception var_4_1B3) {
                invokeinterface:void(WatchService::close, getfield:WatchService(\u600f\u7006\u6435\ud217\uc9f6\u6c52::\u71ae\u960f\u7873\u416d\u7bad\u416d, this:\u600f\u7006\u6435\ud217\uc9f6\u6c52))
                athrow(var_4_1B3:Exception)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u5245\u8aa5\u61a4\u7049\u4cd9.\u600f\u7006\u6435\ud217\uc9f6\u6c52 \u759a\u873d\u0c95\u7af6\ub102\u8350(java.io.File p0) {
        var_1_5F : int
        expr_65 : \u600f\u7006\u6435\ud217\uc9f6\u6c52 [generated]
        var_3_77 : IOException
        
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
        var_1_5F = and:int(ldc:int(672851375), ldc:int(1796077495))
        
        try {
            var_1_5F = and:int(var_1_5F:int, ldc:int(1012399871))
            expr_65 = initobject:\u600f\u7006\u6435\ud217\uc9f6\u6c52(\u600f\u7006\u6435\ud217\uc9f6\u6c52::<init>, p0:File)
            var_1_5F = and:int(var_1_5F:int, ldc:int(2118443239))
            return:\u600f\u7006\u6435\ud217\uc9f6\u6c52(expr_65:\u600f\u7006\u6435\ud217\uc9f6\u6c52)
        }
        catch (java.io.IOException var_3_77) {
            invokeinterface:void(Logger::warn, invokestatic:Logger(\u4492\u4ab3\u97e6\u71ae\ucfaf\u7873::\u4975\u4f4a\ud523\u8350\u64f2\uc87f), loadelement:String(getstatic:String[](\u600f\u7006\u6435\ud217\uc9f6\u6c52::\u446c\u8d98\uc7fe\u4c2b\u8258\u4f4a), and:int(ldc:int(-5019), ldc:int(4762))), p0:File[expected:Object], var_3_77:IOException[expected:Object])
            return:\u600f\u7006\u6435\ud217\uc9f6\u6c52(aconstnull:\u600f\u7006\u6435\ud217\uc9f6\u6c52())
        }
    }
    
    private void \u8350\ub8be\u600f\u0b8e\u4f4a\u52d3(java.nio.file.Path p0) {
        stack_93_1 : WatchService [generated]
        expr_6C : Kind[] [generated]
        
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
            stack_93_1 = getfield:WatchService(\u600f\u7006\u6435\ud217\uc9f6\u6c52::\u71ae\u960f\u7873\u416d\u7bad\u416d, this:\u600f\u7006\u6435\ud217\uc9f6\u6c52)
            expr_6C = newarray:Kind[](java.nio.file.WatchEvent.Kind.class, and:int(ldc:int(1035), ldc:int(16535)))
            storeelement:Kind(expr_6C:Kind[], and:int(ldc:int(7709), ldc:int(-16000)), getstatic:Kind<Path>(StandardWatchEventKinds::ENTRY_CREATE))
            storeelement:Kind(expr_6C:Kind[], and:int(ldc:int(2633), ldc:int(13459)), getstatic:Kind<Path>(StandardWatchEventKinds::ENTRY_DELETE))
            storeelement:Kind(expr_6C:Kind[], and:int(ldc:int(654), ldc:int(14706)), getstatic:Kind<Path>(StandardWatchEventKinds::ENTRY_MODIFY))
            invokeinterface:WatchKey(Path::register, p0:Path, stack_93_1:WatchService, expr_6C:Kind<?>[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u8753\uc246\ub18d\uc7fe\u624e\u8753() {
        var_1_5F : int
        var_3_67 : int
        var_1_A0 : int
        var_4_77 : WatchKey
        var_5_93 : Iterator<WatchEvent<?>>
        var_6_D8 : WatchEvent<Path>
        var_7_123 : Path
        expr_12E : LinkOption[] [generated]
        
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
            var_1_5F = and:int(ldc:int(-1350757255), ldc:int(930834155))
            var_3_67 = and:int(ldc:int(-4132), ldc:int(4131))
            
            loop {
                var_1_A0 = and:int(var_1_5F:int, ldc:int(-1143472257))
                
                if (cmpeq:boolean(var_4_77 = invokeinterface:WatchKey(WatchService::poll, getfield:WatchService(\u600f\u7006\u6435\ud217\uc9f6\u6c52::\u71ae\u960f\u7873\u416d\u7bad\u416d, this:\u600f\u7006\u6435\ud217\uc9f6\u6c52)), aconstnull:WatchKey())) {
                    looporswitchbreak()
                }
                
                var_5_93 = invokeinterface:Iterator<WatchEvent<?>>(List<WatchEvent<?>>::iterator, invokeinterface:List<WatchEvent<?>>(WatchKey::pollEvents, var_4_77:WatchKey))
                
                loop {
                    if (cmpne:boolean(and:int(var_1_A0:int, ldc:int(1048576)), ldc:int(0))) {
                        var_1_A0 = and:int(var_1_A0:int, ldc:int(-1141791029))
                        
                        if (invokeinterface:boolean(Iterator::hasNext, var_5_93:Iterator)) {
                            var_6_D8 = checkcast:WatchEvent<Path>(java.nio.file.WatchEvent<java.nio.file.Path>.class, invokeinterface:WatchEvent<Path>(Iterator<WatchEvent<Path>>::next, var_5_93:Iterator<WatchEvent<Path>>))
                            var_3_67 = xor:int(ldc:int(18960), ldc:int(18961))
                            
                            if (cmpeq:boolean(invokeinterface:Watchable(WatchKey::watchable, var_4_77:WatchKey), getfield:Path[expected:Watchable](\u600f\u7006\u6435\ud217\uc9f6\u6c52::\u92ff\uc2e8\u64ab\u99f7\u5d20\u3d64, this:\u600f\u7006\u6435\ud217\uc9f6\u6c52))) {
                                if (cmpeq:boolean(invokeinterface:Kind<Path>(WatchEvent<Path>::kind, var_6_D8:WatchEvent<Path>), getstatic:Kind<Path>(StandardWatchEventKinds::ENTRY_CREATE))) {
                                    var_7_123 = invokeinterface:Path(Path::resolve, getfield:Path(\u600f\u7006\u6435\ud217\uc9f6\u6c52::\u92ff\uc2e8\u64ab\u99f7\u5d20\u3d64, this:\u600f\u7006\u6435\ud217\uc9f6\u6c52), checkcast:Path(java.nio.file.Path.class, invokeinterface:Path(WatchEvent<Path>::context, var_6_D8:WatchEvent<Path>)))
                                    expr_12E = newarray:LinkOption[](java.nio.file.LinkOption.class, xor:int(ldc:int(6401), ldc:int(6400)))
                                    storeelement:LinkOption(expr_12E:LinkOption[], and:int(ldc:int(-6981), ldc:int(6980)), getstatic:LinkOption(LinkOption::NOFOLLOW_LINKS))
                                    
                                    if (invokestatic:boolean(Files::isDirectory, var_7_123:Path, expr_12E:LinkOption[])) {
                                        invokespecial:void(\u600f\u7006\u6435\ud217\uc9f6\u6c52::\u8350\ub8be\u600f\u0b8e\u4f4a\u52d3, this:\u600f\u7006\u6435\ud217\uc9f6\u6c52, var_7_123:Path)
                                    }
                                }
                            }
                            
                            var_1_A0 = and:int(var_1_A0:int, ldc:int(-480948855))
                            loopcontinue()
                        }
                    }
                    
                    if (cmpne:boolean(and:int(var_1_A0:int, ldc:int(536870912)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_1_A0 = and:int(var_1_A0:int, ldc:int(949248506))
                }
                
                var_1_5F = and:int(var_1_A0:int, ldc:int(1734151503))
                invokeinterface:boolean(WatchKey::reset, var_4_77:WatchKey)
            }
            
            return:boolean(var_3_67:int)
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
            invokeinterface:void(WatchService::close, getfield:WatchService(\u600f\u7006\u6435\ud217\uc9f6\u6c52::\u71ae\u960f\u7873\u416d\u7bad\u416d, this:\u600f\u7006\u6435\ud217\uc9f6\u6c52))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_21B : int
        expr_6B : int [generated]
        stack_A3_0 : byte[] [generated]
        stack_A5_0 : byte[] [generated]
        stack_D5_0 : byte[] [generated]
        stack_D7_0 : byte[] [generated]
        stack_FF_0 : byte[] [generated]
        stack_101_0 : byte[] [generated]
        stack_133_0 : byte[] [generated]
        stack_135_0 : byte[] [generated]
        stack_174_0 : byte[] [generated]
        stack_1E0_0 : byte[] [generated]
        stack_235_0 : byte[] [generated]
        stack_2D1_0 : byte[] [generated]
        stack_30C_0 : byte[] [generated]
        stack_362_0 : byte[] [generated]
        var_4_1BA : int
        var_3_1BF : byte[]
        var_5_1C0 : int
        var_0_24E : int
        expr_235 : byte [generated]
        stack_27C_2 : byte [generated]
        stack_251_0 : byte [generated]
        expr_A5 : int [generated]
        expr_D7 : int [generated]
        var_2_FF : byte[]
        expr_103 : int [generated]
        var_3_2FA : byte[]
        var_5_2FB : int
        expr_135 : int [generated]
        var_3_350 : byte[]
        var_5_351 : int
        expr_362 : byte [generated]
        var_3_180 : String
        stack_1B3_0 : String[] [generated]
        expr_192 : String[] [generated]
        
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
        var_0_21B = and:int(ldc:int(-1854231547), ldc:int(-1120207627))
        expr_6B = arraylength:int(stack_A3_0 = stack_A5_0 = stack_D5_0 = stack_D7_0 = stack_FF_0 = stack_101_0 = stack_133_0 = stack_135_0 = stack_174_0 = stack_1E0_0 = stack_235_0 = stack_2D1_0 = stack_30C_0 = stack_362_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("RXqzdvR1o7574gP1dW/6sXX08XlkwPgytuPD9u95M+57bnZmfzdlBDR1dW57bnf29VM=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1BA = expr_6B:int
        var_3_1BF = newarray:byte[](byte.class, expr_6B:int)
        var_5_1C0 = expr_6B:int
        Label_0450:
        
        while (cmpne:boolean(and:int(var_0_21B:int, ldc:int(4)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_21B:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0527)
            }
            
            var_0_21B = and:int(var_0_21B:int, ldc:int(-1682100771))
            var_5_1C0 = add:int(var_5_1C0:int, ldc:int(-1))
            storeelement:byte(var_3_1BF:byte[], var_5_1C0:int, add:byte(loadelement:byte(stack_1E0_0:byte[], var_5_1C0:int), ldc:byte(76)))
            
            if (cmpne:boolean(var_5_1C0:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_D5_0 = stack_D7_0 = stack_FF_0 = stack_101_0 = stack_133_0 = stack_135_0 = stack_174_0 = stack_1E0_0 = stack_235_0 = stack_2D1_0 = stack_30C_0 = stack_362_0 = var_3_1BF:byte[]
            goto(Label_0112)
        }
        
        goto(Label_0674)
        Label_0527:
        
        while (cmpne:boolean(and:int(var_0_21B:int, ldc:int(16777216)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_21B:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0450)
            }
            
            var_0_24E = and:int(var_0_21B:int, ldc:int(-1783285499))
            var_5_1C0 = add:int(var_5_1C0:int, ldc:int(-1))
            expr_235 = stack_27C_2 = loadelement(stack_235_0, var_5_1C0)
            
            if (cmplt:boolean(add:int(add:int(var_5_1C0:int, ldc:int(1)), neg:int(var_4_1BA:int)), ldc:int(0))) {
                stack_27C_2 = stack_251_0 = add:byte(expr_235:byte, loadelement:byte(var_3_1BF:byte[], add:int(var_5_1C0:int, ldc:int(1))))
                goto(Label_0609)
            }
            
            Label_0578:
            
            if (cmpne:boolean(and:int(var_0_24E:int, ldc:int(8192)), ldc:int(0))) {
                var_0_24E = and:int(var_0_24E:int, ldc:int(-1611354281))
                stack_27C_2 = stack_251_0 = add:byte(expr_235:byte, ldc:byte(1))
            }
            
            Label_0609:
            
            if (cmpeq:boolean(and:int(var_0_24E:int, ldc:int(16777216)), ldc:int(0))) {
                var_0_24E = and:int(var_0_24E:int, ldc:int(1130545089))
                goto(Label_0578)
            }
            
            var_0_21B = and:int(var_0_24E:int, ldc:int(-1812235755))
            storeelement:byte(var_3_1BF:byte[], var_5_1C0:int, stack_27C_2:byte)
            
            if (cmpne:boolean(var_5_1C0:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_D5_0 = stack_D7_0 = stack_FF_0 = stack_101_0 = stack_133_0 = stack_135_0 = stack_174_0 = stack_1E0_0 = stack_235_0 = stack_2D1_0 = stack_30C_0 = stack_362_0 = var_3_1BF:byte[]
            goto(Label_0170)
        }
        
        var_0_21B = and:int(var_0_21B:int, ldc:int(-1408414231))
        Label_0674:
        
        while (cmpne:boolean(and:int(var_0_21B:int, ldc:int(4)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_21B:int, ldc:int(1048576)), ldc:int(0))) {
                var_0_21B = and:int(var_0_21B:int, ldc:int(1661213874))
                goto(Label_0450)
            }
            
            var_0_21B = and:int(var_0_21B:int, ldc:int(-344310769))
            var_5_1C0 = add:int(var_5_1C0:int, ldc:int(-1))
            storeelement:byte(var_3_1BF:byte[], var_5_1C0:int, xor:byte(loadelement:byte(stack_2D1_0:byte[], var_5_1C0:int), ldc:byte(120)))
            
            if (cmpne:boolean(var_5_1C0:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_D5_0 = stack_D7_0 = stack_FF_0 = stack_101_0 = stack_133_0 = stack_135_0 = stack_174_0 = stack_1E0_0 = stack_235_0 = stack_2D1_0 = stack_30C_0 = stack_362_0 = var_3_1BF:byte[]
            goto(Label_0220)
        }
        
        var_0_21B = and:int(var_0_21B:int, ldc:int(1407952731))
        goto(Label_0527)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_21B:int, ldc:int(8)), ldc:int(0))) {
            var_0_21B = and:int(var_0_21B:int, ldc:int(-1780015102))
            goto(Label_0314)
        }
        
        if (cmpeq:boolean(and:int(var_0_21B:int, ldc:int(4)), ldc:int(0))) {
            goto(Label_0264)
        }
        
        if (cmpne:boolean(and:int(var_0_21B:int, ldc:int(128)), ldc:int(0))) {
            var_0_21B = and:int(var_0_21B:int, ldc:int(-773837953))
            goto(Label_0220)
        }
        
        if (cmpeq:boolean(and:int(var_0_21B:int, ldc:int(8)), ldc:int(0))) {
            var_0_21B = and:int(var_0_21B:int, ldc:int(-1749549675))
            expr_A5 = arraylength:int(stack_A5_0:byte[])
            
            if (cmpne:boolean(expr_A5:int, ldc:int(0))) {
                var_4_1BA = expr_A5:int
                var_3_1BF = newarray:byte[](byte.class, expr_A5:int)
                var_5_1C0 = expr_A5:int
                goto(Label_0527)
            }
        }
        
        Label_0170:
        
        if (cmpne:boolean(and:int(var_0_21B:int, ldc:int(128)), ldc:int(0))) {
            goto(Label_0314)
        }
        
        if (cmpeq:boolean(and:int(var_0_21B:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0264)
        }
        
        if (cmpne:boolean(and:int(var_0_21B:int, ldc:int(64)), ldc:int(0))) {
            var_0_21B = and:int(var_0_21B:int, ldc:int(-236614671))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_21B:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_21B = and:int(var_0_21B:int, ldc:int(-575422737))
            expr_D7 = arraylength:int(stack_D7_0:byte[])
            
            if (cmpne:boolean(expr_D7:int, ldc:int(0))) {
                var_4_1BA = expr_D7:int
                var_3_1BF = newarray:byte[](byte.class, expr_D7:int)
                var_5_1C0 = expr_D7:int
                goto(Label_0674)
            }
        }
        
        Label_0220:
        
        if (cmpeq:boolean(and:int(var_0_21B:int, ldc:int(4)), ldc:int(0))) {
            goto(Label_0314)
        }
        
        if (cmpeq:boolean(and:int(var_0_21B:int, ldc:int(128)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_21B:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0170)
            }
            
            if (cmpne:boolean(and:int(var_0_21B:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_21B = and:int(var_0_21B:int, ldc:int(-1791805395))
            var_2_FF = stack_FF_0:byte[]
            expr_103 = add:int(arraylength:int(stack_101_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_103:int, ldc:int(0))) {
                var_3_2FA = newarray:byte[](byte.class, expr_103:int)
                var_5_2FB = expr_103:int
                
                loop {
                    var_0_21B = and:int(var_0_21B:int, ldc:int(-1984680171))
                    var_5_2FB = add:int(var_5_2FB:int, ldc:int(-1))
                    storeelement:byte(var_3_2FA:byte[], var_5_2FB:int, add:int(shl:int(loadelement:byte(stack_30C_0:byte[], var_5_2FB:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_FF:byte[], add:int(var_5_2FB:int, and:int(ldc:int(4161), ldc:int(8321)))), ldc:int(2)), and:int(ldc:int(831), ldc:int(191)))))
                    
                    if (cmpne:boolean(var_5_2FB:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A5_0 = stack_A3_0 = stack_D5_0 = stack_D7_0 = stack_FF_0 = stack_101_0 = stack_133_0 = stack_135_0 = stack_174_0 = stack_1E0_0 = stack_235_0 = stack_2D1_0 = stack_30C_0 = stack_362_0 = var_3_2FA:byte[]
            }
        }
        
        Label_0264:
        
        if (cmpne:boolean(and:int(var_0_21B:int, ldc:int(8192)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_21B:int, ldc:int(4)), ldc:int(0))) {
                var_0_21B = and:int(var_0_21B:int, ldc:int(1450287975))
                goto(Label_0220)
            }
            
            if (cmpeq:boolean(and:int(var_0_21B:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_0170)
            }
            
            if (cmpeq:boolean(and:int(var_0_21B:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_21B = and:int(var_0_21B:int, ldc:int(-881775201))
            expr_135 = arraylength:int(stack_135_0:byte[])
            
            if (cmpne:boolean(expr_135:int, ldc:int(0))) {
                var_3_350 = newarray:byte[](byte.class, expr_135:int)
                var_5_351 = expr_135:int
                
                loop {
                    var_0_21B = and:int(var_0_21B:int, ldc:int(-1485210257))
                    var_5_351 = add:int(var_5_351:int, ldc:int(-1))
                    expr_362 = loadelement:byte(stack_362_0:byte[], var_5_351:int)
                    storeelement:byte(var_3_350:byte[], var_5_351:int, or:int(and:int(shl:int(expr_362:byte, and:int(ldc:int(4356), ldc:int(2279))), ldc:int(-16)), and:int(shr:int(expr_362:byte[expected:int], and:int(ldc:int(516), ldc:int(55))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_351:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A5_0 = stack_A3_0 = stack_D5_0 = stack_D7_0 = stack_FF_0 = stack_101_0 = stack_133_0 = stack_135_0 = stack_174_0 = stack_1E0_0 = stack_235_0 = stack_2D1_0 = stack_30C_0 = stack_362_0 = var_3_350:byte[]
            }
        }
        
        Label_0314:
        
        if (cmpne:boolean(and:int(var_0_21B:int, ldc:int(64)), ldc:int(0))) {
            var_0_21B = and:int(var_0_21B:int, ldc:int(-825673172))
            goto(Label_0264)
        }
        
        if (cmpeq:boolean(and:int(var_0_21B:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_21B = and:int(var_0_21B:int, ldc:int(735503308))
            goto(Label_0220)
        }
        
        if (cmpeq:boolean(and:int(var_0_21B:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_21B = and:int(var_0_21B:int, ldc:int(1232832903))
            goto(Label_0170)
        }
        
        if (cmpne:boolean(and:int(var_0_21B:int, ldc:int(2048)), ldc:int(0))) {
            var_3_180 = initobject:String(String::<init>, stack_174_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1B3_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(2056), ldc:int(2057)))
            expr_192 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:boolean(0), ldc:boolean(1)))
            storeelement:String(expr_192:String[], and:int(ldc:int(28950), ldc:int(-28983)), invokevirtual:String[expected:String](String::substring, var_3_180:String, and:int(ldc:int(2051), ldc:int(-2052)), and:int(ldc:int(17009), ldc:int(15415))))
            putstatic:String[](\u600f\u7006\u6435\ud217\uc9f6\u6c52::\u446c\u8d98\uc7fe\u4c2b\u8258\u4f4a, expr_192:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \ud12e\u9255\u5245\u156b\u64f2\u99f7(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_620 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_62B : int
        
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
        var_3_620 = and:int(ldc:int(677661013), ldc:int(-1375929505))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u600f\u7006\u6435\ud217\uc9f6\u6c52[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_620 = and:int(var_3_620:int, ldc:int(-101860388))
            var_5_81 = and:int(ldc:int(-19396), ldc:int(19395))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(7538), ldc:int(-23924)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_620:int, ldc:int(-1452388994))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, xor:int(ldc:int(-32256), ldc:int(-32255)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, xor:int(ldc:int(2049), ldc:int(2048)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_620 = and:int(var_3_D1:int, ldc:int(2071386591))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(8484), ldc:int(8485)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1441)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(-1338042839))
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1175)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(4)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(1605067387))
                        goto(Label_1056)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(1225563573))
                        goto(Label_0918)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(512)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(1706120982))
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0698)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(-118343866))
                    }
                    else {
                        var_3_620 = and:int(var_3_620:int, ldc:int(997530334))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0825)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1441)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(64)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(-1621537964))
                        goto(Label_1175)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1056)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0918)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(4)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(-2089883349))
                        goto(Label_0825)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(2)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(-1573005224))
                        goto(Label_0698)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_620:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_620 = and:int(var_3_620:int, ldc:int(-1149362724))
                            var_11_E2 = and:int(ldc:int(3558), ldc:int(-4071))
                            goto(Label_1430)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0557:
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(2)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(-848740891))
                        goto(Label_1441)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(1650374444))
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(-1961105745))
                        goto(Label_1175)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(2095782733))
                        goto(Label_1056)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(-1095139537))
                        goto(Label_0918)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(-1068145918))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_620 = and:int(var_3_620:int, ldc:int(2080127350))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0825)
                        }
                    }
                    
                    Label_0698:
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1441)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1175)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1056)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(1681828870))
                        goto(Label_0918)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(16)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(1761901569))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_620:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_620 = and:int(var_3_620:int, ldc:int(1847646753))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_620 = and:int(var_3_620:int, ldc:int(618954502))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_620:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_620 = and:int(var_3_620:int, ldc:int(-395916834))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0825:
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1441)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1175)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1056)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_620:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0698)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(4)), ldc:int(0))) {
                            var_3_620 = and:int(var_3_620:int, ldc:int(-1658401357))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_620:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_620:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_620 = and:int(var_3_620:int, ldc:int(711850588))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = xor:int(ldc:int(20552), ldc:int(20553))
                                goto(Label_1056)
                            }
                        }
                    }
                    
                    Label_0918:
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1441)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1175)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_620:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0825)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(64)), ldc:int(0))) {
                            var_3_620 = and:int(var_3_620:int, ldc:int(340298596))
                            goto(Label_0698)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_620 = and:int(var_3_620:int, ldc:int(-1914201798))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_620 = and:int(var_3_620:int, ldc:int(-1434453897))
                        var_11_E2 = and:int(ldc:int(-23018), ldc:int(6368))
                    }
                    
                    Label_1056:
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(-786723701))
                        goto(Label_1441)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(2010021354))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_620 = and:int(var_3_620:int, ldc:int(-1484138815))
                            goto(Label_0918)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_620 = and:int(var_3_620:int, ldc:int(-1199793418))
                            goto(Label_0825)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_620:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0698)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_620:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_620 = and:int(var_3_620:int, ldc:int(-1385296161))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1298)
                            }
                        }
                    }
                    
                    Label_1175:
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1441)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(1656000264))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_620 = and:int(var_3_620:int, ldc:int(828000206))
                            goto(Label_1056)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0918)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_620:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0825)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_620:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_620 = and:int(var_3_620:int, ldc:int(422436745))
                            goto(Label_0698)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_620:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(512)), ldc:int(0))) {
                            var_3_620 = and:int(var_3_620:int, ldc:int(2121710967))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                            goto(Label_1430)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1298:
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1441)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1175)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(-1808311116))
                        goto(Label_1056)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(34911313))
                        goto(Label_0918)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(128)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(-1162021999))
                        goto(Label_0698)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(1351052420))
                        loopcontinue()
                    }
                    
                    var_3_620 = and:int(var_3_620:int, ldc:int(1869060598))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1430:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_62B = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1441:
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1175)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(64)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(678558608))
                        goto(Label_1056)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0918)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(1306485451))
                        goto(Label_0825)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(1836029434))
                        goto(Label_0698)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(-873859541))
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(-1826041822))
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(-126415745))
                        var_17_62B = add:int(var_16_110:int, and:int(ldc:int(7941), ldc:int(24625)))
                        looporswitchbreak()
                    }
                    
                    var_3_620 = and:int(var_3_620:int, ldc:int(-2080989226))
                }
                
                var_3_620 = and:int(var_3_620:int, ldc:int(-344522916))
                
                if (cmple:boolean(var_5_81 = var_17_62B:int, sub:int(var_6_88:int, and:int(ldc:int(10277), ldc:int(5897))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(131072)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
